import java.util.Scanner;

import controller.BibliotecaController;
import model.Biblioteca;
import view.BibliotecaView;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        BibliotecaController controller = new BibliotecaController(biblioteca);
        BibliotecaView view = new BibliotecaView(controller, scanner);
        view.menu();
    }
}
