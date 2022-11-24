public class StarbucksShop implements Starbucks{
    @Override
    public void ChooseFlavor() {
        System.out.println("选择了焦糖玛奇朵");
    }

    @Override
    public void MakeCoffee() {
        System.out.println("焦糖玛奇朵制作中....");
    }

    @Override
    public void AddSugar() {
        System.out.println("加糖中...");
    }

    @Override
    public void AddMilk() {
        System.out.println("加牛奶中...");
    }
}
