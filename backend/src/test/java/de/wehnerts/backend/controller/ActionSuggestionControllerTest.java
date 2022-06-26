package de.wehnerts.backend.controller;

import de.wehnerts.backend.model.ActionSuggestion;
import de.wehnerts.backend.model.UserComment;
import de.wehnerts.backend.repository.ActionSuggestionRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ActionSuggestionControllerTest {
    ActionSuggestion suggestion1 = null;
    ActionSuggestion suggestion2 = null;

    @Autowired
    private ActionSuggestionRepo actionSuggestionRepo;
    @Autowired
    private WebTestClient testClient;
    @LocalServerPort
    private int port;

    @BeforeEach
    public void cleanRepoAndSetItems(){
        actionSuggestionRepo.deleteAll();
        suggestion1 = ActionSuggestion.builder()
                .id("1")
                .title("Suggest1")
                .description("Himbereis")
                .category("Sport")
                .rating("5")
                .userGroups(List.of("123","234"))
                .pictures(List.of("pic1","pic2"))
                .recommendations(List.of("Hut","Mütze"))
                .userComments(List.of(
                        UserComment.builder()
                                .userId("4701")
                                .timestamp("12345")
                                .comment("Rock das Haus")
                        .build(),
                        UserComment.builder()
                                .userId("4701")
                                .timestamp("12345")
                                .comment("Rock das Haus")
                                .build()
                        )
                )
        .build();

        suggestion2 = ActionSuggestion.builder()
                .id("2")
                .title("Suggest2")
                .description("Grützwurst")
                .category("Wanderung")
                .rating("4")
                .userGroups(List.of("333","444"))
                .pictures(List.of("pic4","pic5"))
                .recommendations(List.of("GafferTape","Gummiente"))
                .userComments(List.of(
                                UserComment.builder()
                                        .userId("4703")
                                        .timestamp("12345")
                                        .comment("Party")
                                        .build(),
                                UserComment.builder()
                                        .userId("4702")
                                        .timestamp("666")
                                        .comment("Rock das Haus")
                                        .build()
                        )
                )
                .build();
    }

    @Test
    void getActionSuggestions() {
        //GIVEN
        actionSuggestionRepo.insert(suggestion1);
        actionSuggestionRepo.insert(suggestion2);
        //WHEN
        List<ActionSuggestion> actual = testClient.get()
                .uri("api/actionsuggestion")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBodyList(ActionSuggestion.class)
                .returnResult()
                .getResponseBody();
        //THEN
        List<ActionSuggestion> expected = List.of(suggestion1, suggestion2);

        assertEquals(expected, actual);
    }
}