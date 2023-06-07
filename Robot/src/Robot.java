import java.util.HashMap;

public class Robot {
    private String name;
    private String model;
    private String color;
    private boolean isAwake;
    private boolean isAsleep;
    private boolean isRunning;

    public Robot(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.isAwake = false;
        this.isAsleep = false;
        this.isRunning = false;
    }

    public Robot() {
	
	}

	public void wakeUp() {
        this.isAwake = true;
    }

    public void sleep() {
        this.isAwake = false;
        this.isAsleep = true;
    }

    public void run() {
        if (isAwake) {
            this.isRunning = true;
            System.out.println(name + " is now running.");
        } else {
            System.out.println(name + " is asleep. Please wake it up before running.");
        }
    }

    public void stop() {
        this.isRunning = false;
        System.out.println(name + " has stopped running.");
    }

    public void encender() {
        System.out.println(name + " is turned on.");
    }

    public void apagar() {
        this.isRunning = false;
        this.isAwake = false;
        this.isAsleep = false;
        System.out.println(name + " is turned off.");
    }

    public void realizarTarea(String tarea) {
        if (isRunning) {
            System.out.println(name + " is performing the task: " + tarea);
        } else {
            System.out.println(name + " is not running. Please start it before performing a task.");
        }
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isAwake() {
        return this.isAwake;
    }

    public boolean isAsleep() {
        return this.isAsleep;
    }

    public boolean isRunning() {
        return this.isRunning;
    }
    
    public static void imprimirRegistroIndividual(HashMap<String, Robot> robotMap, String robotName) {
        Robot robot = robotMap.get(robotName);
        if (robot != null) {
            System.out.println("Name: " + robot.getName());
            System.out.println("Model: " + robot.getModel());
            System.out.println("Color: " + robot.getColor());
            System.out.println();
        } else {
            System.out.println("No se encontró un robot con el nombre especificado.");
        }
   }
}




