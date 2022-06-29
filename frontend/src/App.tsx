import React from 'react';
import {Route, Routes} from 'react-router';
import './App.css';
import MainPage from "./pages/MainPage";

function App() {
  return (
    <div className="App">
     Hallo Welt!
        <Routes>
            <Route path = {"/*"} element={<MainPage/>}/>
        </Routes>

    </div>
  );
}

export default App;
