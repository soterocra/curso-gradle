/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aula.debugando.remoto;

public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    public void slowMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
