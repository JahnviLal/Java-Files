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

        Matcha matcha = new Matcha();
        matcha.brew();
        System.out.println("Matcha is ready!");

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
        System.out.println("Brewing tea and coffee...");
    }
}

class Matcha
{
    void brew() 
    {
        System.out.println("Brewing matcha...");
    }
}