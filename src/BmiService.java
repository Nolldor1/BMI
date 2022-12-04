public class BmiService {
    double calculate(int weight, double height) { // вводимые переменные: вес, рост
        double Bmi = (weight / (height * height)); // ИМТ = вес/рост в квадрате
        return Bmi;
    }
}
