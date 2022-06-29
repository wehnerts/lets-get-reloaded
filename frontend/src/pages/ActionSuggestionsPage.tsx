import {Box, Button, ButtonGroup} from "@mui/material";
import {useNavigate} from "react-router";
import useActionSuggestions from "../hooks/useActionSuggestions";
import ActionSuggestionsGallery from "../components/ActionSuggestionsGallery";

export default function ActionSuggestionsPage(){
    const navigate = useNavigate()
    const {actionSuggestions} = useActionSuggestions();
    return (
        <div>
            <ActionSuggestionsGallery actionSuggestions={actionSuggestions}/>
            <p>Actions</p>
        <Box
            sx={{
                outlineColor: "#F6E27F",
                display: 'flex',
                flexDirection: 'column',
                alignItems: 'center',
                '& > *': {
                    m: 1
                }
            }}
        >
            <ButtonGroup variant="text" aria-label="text button group" sx={{outlineColor: "#F6E27F"}}>
                <Button sx={{color: "#F6E27F"}} onClick={() => navigate(-1)}>Back</Button>
                <Button sx={{color: "#F6E27F"}} onClick={() => navigate("/")}>New Action</Button>
            </ButtonGroup>
        </Box>
    </div>)

}