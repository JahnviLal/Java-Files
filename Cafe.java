public class Cafe 
{
    public static void main(String[] args) 
    {
        Coffee coffee = new Coffee();
        coffee.brew();
        System.out.println("Coffee is ready!");

        Tea tea = new Tea();
        tea.brew();
        System.out.println("Tea is ready!");
    }
    
}

class Coffee 
{
    void brew() 
    {
        System.out.println("Brewing coffee...");
    }
}

class Tea 
{
    void brew() 
    {
        System.out.println("Brewing tea...");
    }
}
