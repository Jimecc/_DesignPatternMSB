import java.util.ArrayList;
import java.util.List;

/**
 * @author Jim
 * @Description 观察者模式
 * @createTime 2022年08月18日
 */
class Child {

    private boolean cry = false;

    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }
    public boolean isCry(){
        return cry;
    }

    public void wakeup(){
        System.out.println("Wake up! wuwuwuwuwuuwuwuwuwuwu ~~~~~");
        this.cry = true;
        for (Observer observer : observers) {
            observer.actionAwakeup();
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Child child = new Child();
        while(!child.isCry()){
            try{
                child.wakeup();
                System.out.println("Crying......");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Dad implements Observer{
    public void feed(){
        System.out.println("Dad feeding ...");
    }

    @Override
    public void actionAwakeup() {
        feed();
    }
}


class Mom implements Observer{
    public void feed(){
        System.out.println("Mon WWW ...");
    }

    @Override
    public void actionAwakeup() {
        feed();
    }
}

class Dog implements Observer{
    public void feed(){
        System.out.println("Dog Wangwangwangwangwang ...");
    }

    @Override
    public void actionAwakeup() {
        feed();
    }
}

interface Observer{
    void actionAwakeup();
}