package com.aryachauhan172.assignment01;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class SceneChanger
{
    /********************* SINGLETON SECTION *****************************/
    // Step 1. private static instance member variable
    private static SceneChanger m_instance = null;
    // Step 2. make the default constructor private
    private SceneChanger() {}
    // Step 3. create a public static entry point / instance method
    public static SceneChanger Instance()
    {
        // Step 4. Check if the private instance member variable is null
        if(m_instance == null)
        {
            // Step 5. Instantiate a new SceneManager instance
            m_instance = new SceneChanger();
        }
        return m_instance;
    }
    /*********************************************************************/

    /**
     * This method will change the new scene passed into it as an argument
     * @param event
     * @param FXMLFileName
     */
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

