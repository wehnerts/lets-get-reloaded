package de.wehnerts.backend.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("actionsuggestion")
public class ActionSuggestion {
    @Id
    private String id;
    private String title;
    private String description;
    private String category;
    private String rating;

    private List<String> userGroups;
    private List<String> pictures;
    private List <String> recommendations;
    private List <UserComment> userComments;

}
