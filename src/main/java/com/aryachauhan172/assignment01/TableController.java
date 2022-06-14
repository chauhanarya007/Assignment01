package com.aryachauhan172.assignment01;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private TableColumn<ModelTable,String> damage;

    @FXML
    private TableColumn<ModelTable, String > gold;

    @FXML
    private TableColumn<ModelTable, String > name;

    @FXML
    private TableView<ModelTable> table;

    @FXML
    private TableColumn<ModelTable, String > type;

    @FXML
    private TableColumn<ModelTable, String > weight;

    @FXML
    private void switchtochart(ActionEvent event) throws IOException
    {
        SceneChanger.Instance().changeScene(event, "chartview.fxml");
    }

    ObservableList<ModelTable> list = FXCollections.observableArrayList(
            new ModelTable("Ancient","18","22","28","battleLeax")
    );


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        name.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("name"));
        damage.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("damage"));
        weight.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("weight"));
        gold.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("gold"));
        type.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("type"));

        table.setItems(list);
    }



}






