package org.example.demo;

import javafx.fxml.FXML; //відповідає за створення FXML класу
import javafx.scene.control.Label;//відповідає за створення лейбла
import javafx.scene.control.TextField; //відповідає за створення текстового поля

import javafx.stage.Stage;// відповідає за стадію
public class QuadraticEquationController {
    @FXML
    private TextField aInput; // відповідає за ввод A
    @FXML
    private TextField bInput; // відповідає за ввод B
    @FXML
    private TextField cInput; // відповідає за ввод C
    @FXML
    private Label root1Result; // відповідає за вивід результату 1 кореня
    @FXML
    private Label root2Result; // відповідає за вивід результату 2 кореня
    @FXML // Цей метод відповідає за обробку натиснення кнопки "Розрахувати"
    private void calculateRoots() { // викликається при натисканні на кнопку "Розрахувати"
        try {
            // Перевірка на введення коректних чисел
            double a = Double.parseDouble(aInput.getText());
            double b = Double.parseDouble(bInput.getText());
            double c = Double.parseDouble(cInput.getText());
            // фомула для розрахунку коренів дискримінанта
            double discriminant = b * b - 4 * a * c;
            // якщо дискримінант більше 0, то розрахуємо корені
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                root1Result.setText(String.valueOf(root1));
                root2Result.setText(String.valueOf(root2));
                // якщо дтискримінант дорівнює 0, то розрахуємо один корінь
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                root1Result.setText(String.valueOf(root));
                root2Result.setText("Тільки один корінь");
            } else { // якщо дискримінант меньше 0, то розрахуємо нема коренів
                root1Result.setText("Нема коренів рівняння");
                root2Result.setText("Нема коренів рівняння");
            }// якщо введені дані не є числами
        } catch (NumberFormatException ex) { // виключення якщо введені дані не є числами
            root1Result.setText("Перевірте введені дані");
            root2Result.setText("Перевірте введені дані");
        }
    }
    // Цей метод відповідає за обробку натиснення кнопки "Очистити"
    // очищає всі результати та те що ввели
    @FXML
    private void eraseInputs() {
        aInput.clear();
        bInput.clear();
        cInput.clear();
        root1Result.setText("");
        root2Result.setText("");
    }
    @FXML // вихід з програми
    private void quitApplication() {
        Stage stage = (Stage) aInput.getScene().getWindow();
        stage.close();// видаляє вікно
    }
}
