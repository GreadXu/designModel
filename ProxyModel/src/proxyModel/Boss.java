package proxyModel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * @param <T> 被代理对象
 */
public class Boss<T>implements InvocationHandler {

    private T target;

    private static int i = 0;

    public Boss(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("老板开始第"+i+++"次分配工作：");
        method.invoke(target,args);
        return null;
    }
}
