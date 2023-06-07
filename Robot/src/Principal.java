import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los robots
        HashMap<String, Robot> robotMap = new HashMap<>();

        // Menú interactivo
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 8) {
            System.out.println("Menú de Control de Robots");
            System.out.println("--------------------------");
            System.out.println("1. Agregar un robot");
            System.out.println("2. Buscar un robot por nombre");
            System.out.println("3. Encender un robot");
            System.out.println("4. Apagar un robot");
            System.out.println("5. Despertar un robot");
            System.out.println("6. Realizar una tarea con un robot");
            System.out.println("7. Imprimir la lista completa de robots");
            System.out.println("8. Salir");
            System.out.print("Ingrese su elección: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nombre del robot: ");
                    String robotName = scanner.nextLine();
                    System.out.print("Ingrese el modelo del robot: ");
                    String robotModel = scanner.nextLine();
                    System.out.print("Ingrese el color del robot: ");
                    String robotColor = scanner.nextLine();
                    Robot newRobot = new Robot(robotName, robotModel, robotColor);
                    robotMap.put(newRobot.getName(), newRobot);
                    System.out.println("El robot ha sido agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del robot que desea buscar: ");
                    String robotNameToSearch = scanner.nextLine();
                    Robot robotToSearch = robotMap.get(robotNameToSearch);
                    if (robotToSearch != null) {
                        System.out.println("Información del robot:");
                        System.out.println(robotToSearch);
                    } else {
                        System.out.println("No se encontró un robot con el nombre especificado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del robot que desea encender: ");
                    String robotNameToEncender = scanner.nextLine();
                    Robot robotToEncender = robotMap.get(robotNameToEncender);
                    if (robotToEncender != null) {
                        robotToEncender.encender();
                    } else {
                        System.out.println("No se encontró un robot con el nombre especificado.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del robot que desea apagar: ");
                    String robotNameToApagar = scanner.nextLine();
                    Robot robotToApagar = robotMap.get(robotNameToApagar);
                    if (robotToApagar != null) {
                        robotToApagar.apagar();
                    } else {
                        System.out.println("No se encontró un robot con el nombre especificado.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del robot que desea despertar: ");
                    String robotNameToDespertar = scanner.nextLine();
                    Robot robotToDespertar = robotMap.get(robotNameToDespertar);
                    if (robotToDespertar != null) {
                        robotToDespertar.wakeUp();
                    } else {
                        System.out.println("No se encontró un robot con el nombre especificado.");
                    }
                    break;
                    
                case 6:
                    System.out.print("Ingrese el nombre del robot en el que desea realizar una tarea: ");
                    String robotName4 = scanner.nextLine();
                    Robot robotToRealizarTarea = robotMap.get(robotName4);
                    if (robotToRealizarTarea != null) {
                        System.out.print("Ingrese la tarea que desea realizar: ");
                        String tarea = scanner.nextLine();
                        robotToRealizarTarea.realizarTarea(tarea);
                    } else {
                        System.out.println("No se encontró un robot con el nombre especificado.");
                    }
                    break;
                case 7:
                    System.out.println("Lista completa de robots:");
                    for (Robot robot : robotMap.values()) {
                        System.out.println(robot);
                    }
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Elección inválida. Por favor, intente nuevamente.");
                    break;
            }

            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }


}
    
