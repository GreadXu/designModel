package proxyModel;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        // 创建被代理对象
        Employee employee = new Employee("张三");
        // 创建一个Invocation
        Boss boss = new Boss(employee);
      /*  //输出代理类
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", Employee.class.getInterfaces());
        String path = "D:/Project/GitProject/designModel/ProxyModel/src/StuProxy.class";
        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("代理类class文件写入成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("写文件错误");
        }*/
        People people = (People) Proxy.newProxyInstance(People.class.getClassLoader(), new Class[]{People.class},boss);
        people.work();

    }
}
