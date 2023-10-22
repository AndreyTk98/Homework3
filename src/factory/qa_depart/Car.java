package factory.qa_depart;

public class Car {

    public void start() throws InterruptedException {
        startElectricity();
        Thread.sleep(2000);
        startCommand();
        Thread.sleep(2000);
        startFuelSystem();
    }
    private void startElectricity(){
         System.out.println("Пуск АКБ");
    }
    private void startCommand(){
        System.out.println("Пуск приборной панели");
    }
    private void startFuelSystem(){
        System.out.println("Зажигание");
    }

}
