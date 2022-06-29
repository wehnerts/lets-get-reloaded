import {ActionSuggestion} from "../model/ActionSuggestion";
import ActionSuggestionsCard from "./ActionSuggestionsCard";


type ActionSuggestionsGalleryProps = {
    actionSuggestions: ActionSuggestion[]
}

export default function ActionSuggestionsGallery({actionSuggestions}:ActionSuggestionsGalleryProps){
    return(
        <div className={"gallery"}>
            {actionSuggestions.map(item=> <ActionSuggestionsCard key={item.id} actionSuggestionItem={item}/>)}
        </div>
    )
}