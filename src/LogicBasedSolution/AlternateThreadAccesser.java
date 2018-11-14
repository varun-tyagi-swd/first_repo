package LogicBasedSolution;

public class AlternateThreadAccesser implements Runnable {
    @Override
    public void run() {
        System.out.println("Running Thread");
        for (int i = 0 ; i < 100 ; i++){
            System.out.println(i +"\tThread ID:" + Thread.currentThread().getId());

        }
    }
}
