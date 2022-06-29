import {ActionSuggestion} from "../model/ActionSuggestion";

type ActionSuggestionProps={
    actionSuggestionItem:ActionSuggestion;
}


export default function ActionSuggestionsCard({actionSuggestionItem}:ActionSuggestionProps){
    return(
        <div>{actionSuggestionItem.title}</div>
    )
}