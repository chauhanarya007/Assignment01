package com.aryachauhan172.assignment01;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class SceneChanger
{
    private static SceneChanger m_instance = null;
    private SceneChanger() {}
    public static SceneChanger Instance()
    {
        if(m_instance == null)
        {
            m_instance = new SceneChanger();
        }
        return m_instance;
    }

    public void changeScene(ActionEvent event, String FXMLFileName) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(FXMLFileName));
        Scene scene = new Scene(fxmlLoader.load());

        // derive the stage (window) from the action event (button press)
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

