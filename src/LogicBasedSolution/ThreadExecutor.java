package LogicBasedSolution;

public class ThreadExecutor {

    public static void main(String[] args){
        AlternateThreadAccesser ATA = new AlternateThreadAccesser();
        Thread t1 = new Thread(ATA);
        t1.start();
        Thread t2 = new Thread(ATA);
        t2.start();
    }

}
