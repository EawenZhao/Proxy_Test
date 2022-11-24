import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        StarbucksShop shop = new StarbucksShop();

        final int[] deter = {0};
        Starbucks SWUStarbucksShop = (Starbucks) Proxy.newProxyInstance(
                shop.getClass().getClassLoader(),
                shop.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (deter[0] == 0){
                            System.out.println("SWU的星巴克咖啡进行了一些加价操作...");
                            deter[0] =1;
                        }
                        return method.invoke(shop,args);
                    }
                }
        );

        SWUStarbucksShop.ChooseFlavor();
        SWUStarbucksShop.MakeCoffee();
        SWUStarbucksShop.AddSugar();
        SWUStarbucksShop.AddMilk();
    }
}