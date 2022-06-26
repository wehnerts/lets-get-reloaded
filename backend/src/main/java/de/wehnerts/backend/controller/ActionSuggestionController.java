package de.wehnerts.backend.controller;

import de.wehnerts.backend.model.ActionSuggestion;
import de.wehnerts.backend.service.ActionSuggestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/actionsuggestion")
public class ActionSuggestionController {
    private final ActionSuggestionService actionSuggestionService;

    public ActionSuggestionController(ActionSuggestionService actionSuggestionService) {
        this.actionSuggestionService = actionSuggestionService;
    }

    @GetMapping
    public List<ActionSuggestion> getActionSuggestions(){return actionSuggestionService.getActionSuggestions();}
}
