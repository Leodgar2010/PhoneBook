import service.Check;
import model.Bank;

public class Controller {
    View View = new View();
    Bank bank = new Bank();
    //Check check = new Check();

    public void general (){
        /*Внимание для реализации паттерна MVC нужно
        до создании экземпляра Item произвести проверку полученных из Viers данных
        Данный функционал на семинаре реализовать не успели*/
        bank.addItemInArray(View.addItem());
        bank.addItemInArray(View.addItem());
        View.printAllItems(bank.getItemArrayList());
    }

    private void addItemInArray () {
        View.addItem();
    }
}