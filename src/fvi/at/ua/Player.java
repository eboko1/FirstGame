
package fvi.at.ua;

/**
 * Created by Vika on 24.10.2016.
 */
public class Player {
    int number = 0;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("Думаю, що число "+number);
    }
}