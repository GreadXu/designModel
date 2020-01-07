package Demo;

/**
 * 被代理对象
 */
public class Employee implements People {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        try {
            Thread.sleep(1000);
            System.out.println(name+"认真工作");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
