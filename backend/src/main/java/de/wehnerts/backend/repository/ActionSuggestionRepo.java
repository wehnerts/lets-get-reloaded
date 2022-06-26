package de.wehnerts.backend.repository;

import de.wehnerts.backend.model.ActionSuggestion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionSuggestionRepo extends MongoRepository <ActionSuggestion, String> {

}

