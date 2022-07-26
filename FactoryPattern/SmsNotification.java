package FactoryPattern;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser(){
        System.out.println("Sending an sms notification");
    }

}
