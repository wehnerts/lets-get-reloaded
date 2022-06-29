import axios from "axios";
import {ActionSuggestionDto} from "../dto/ActionSuggestionDto";


export const getAllActionSuggestions: ()=>Promise<ActionSuggestionDto[]> = () => {
    return axios.get("/api/actionsuggestion")
        .then(response => response.data)
}