import {Route, Routes, useNavigate} from "react-router";
import ActionSuggestionsPage from "./ActionSuggestionsPage";
import {Box, Button, ButtonGroup} from "@mui/material";

export default function MainPage(){
    const navigate = useNavigate()
    return(
        <div>Mainpage Soll die Hauptnavigation sein, wenn Zugriff Als eingeloggter Benutzer möglich ist
            <Routes>
                <Route path={"/suggestions"} element={<ActionSuggestionsPage/>}/>
            </Routes>
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
                    <Button sx={{color: "#F6E27F"}} onClick={() => navigate("/suggestions")}>New Action</Button>
                </ButtonGroup>
            </Box>
        </div>
    )
}