
package fvi.at.ua;

/**
 * Created by Vika on 24.10.2016.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public  void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int targetNumber=(int)(Math.random()*10);
        System.out.println("Компютер  загадує число від 0 до 9 ");


        while (true){
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1=p1.number;
            System.out.print("Перший гравець думає, що число буде рівне "+guessp1);
            guessp2=p2.number;
            System.out.print("Другий гравець думає, що число буде рівне "+guessp2);
            guessp3=p3.number;
            System.out.print("Третій гравець думає, що число буде рівне "+guessp3);


            if(guessp1==targetNumber){
              p1isRight=true;
              }
            if(guessp2==targetNumber){
                p2isRight=true;
              }
            if(guessp3==targetNumber){
                p3isRight=true;
              }
            if (p1isRight||p2isRight||p3isRight){
                System.out.println("У нас є переможець ! ");
                System.out.println("Перший гравець вгадав це число "+guessp1);
                System.out.println("Другий гравець вгадав це число "+guessp2);
                System.out.println("Третій гравець вгадав це число "+guessp3);
            } else {
                System.out.println("Гравці повині повторити ще раз ");
            }

        }

    }

}
