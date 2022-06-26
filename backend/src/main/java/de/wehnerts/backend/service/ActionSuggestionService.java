package de.wehnerts.backend.service;

import de.wehnerts.backend.model.ActionSuggestion;
import de.wehnerts.backend.repository.ActionSuggestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionSuggestionService {
    private final ActionSuggestionRepo actionSuggestionRepo;
    @Autowired
    public ActionSuggestionService(ActionSuggestionRepo actionSuggestionRepo) {
        this.actionSuggestionRepo = actionSuggestionRepo;
    }

    public List<ActionSuggestion> getActionSuggestions(){return actionSuggestionRepo.findAll();}
}
