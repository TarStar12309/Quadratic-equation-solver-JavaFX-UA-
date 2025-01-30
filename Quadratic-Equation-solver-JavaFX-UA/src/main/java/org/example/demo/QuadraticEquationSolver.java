package org.example.demo;

import javafx.application.Application; //відповідють за створення класу який відповідає за створення вікна
import javafx.fxml.FXMLLoader; // відповідає за завантаження файлу fxml
import javafx.scene.Parent; // створює корінь для вікна
import javafx.scene.Scene;//відповідає за створення сцени

import javafx.stage.Stage; // відповідає за стадії

public class QuadraticEquationSolver extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/demo/quadratic_equation_solver.fxml")); //
        primaryStage.setTitle("Розв'язувач квадратних рівнянь");
        primaryStage.setScene(new Scene(root, 400, 250));// створення вікна з цими розмірами
        primaryStage.show(); //вивід вікна
    }
    public static void main(String[] args) {
        launch(args); // запуск програми з аргументами
        // аргументи взяті з QuadraticEquationController
    }
}
