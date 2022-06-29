import {useEffect, useState} from "react";
import { toast } from "react-toastify";
import {ActionSuggestion} from "../model/ActionSuggestion";
import {getAllActionSuggestions} from "../services/api-service-actionsuggestions";

export default function useActionSuggestions(){
    const [actionSuggestions, setActionSuggestions]= useState<ActionSuggestion[]>([])

    //TODO Check if useEffect is necessary
    useEffect(()=>{
        getAllActionSuggestions()
            .then(allActionSuggestions => setActionSuggestions(allActionSuggestions))
            .catch(()=>toast.error("ConnectionFailed! Please try again later."))
    }, [])
    return {actionSuggestions}
}