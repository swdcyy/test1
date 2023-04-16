package hkd.b$a;
import java.lang.Runnable;
import hkd.b;
import java.lang.Object;
import android.os.Process;

public class b$a implements Runnable	// class@001761
{
    public final int b;
    public final Runnable c;
    public final b d;

    public void b$a(b p0,Runnable p1,int p2){
       this.d = p0;
       super();
       this.c = p1;
       this.b = p2;
    }
    public void run(){
       Process.setThreadPriority(this.b);
       this.c.run();
    }
}
