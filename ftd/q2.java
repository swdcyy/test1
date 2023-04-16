package ftd.q2;
import java.lang.Thread;
import ftd.g3;
import java.lang.Runnable;
import java.lang.String;

public final class q2 extends Thread	// class@000ebb
{
    public final g3 b;

    public void q2(g3 p0,Runnable p1,String p2){
       super(p1, p2);
       this.b = p0;
       this.setDaemon(true);
    }
}
