/**
 * @author Jim
 * @Description 加 synchronized 锁（效率低）
 * @createTime 2022年08月17日
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {
    }

    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
