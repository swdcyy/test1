package dj0.b;
import java.lang.Runnable;
import com.kuaishou.krn.bridges.toast.KrnToastBridge;
import java.lang.String;
import java.lang.Object;

public final class b implements Runnable	// class@001fa5
{
    public final KrnToastBridge b;
    public final String c;
    public final int d;
    public final int e;

    public void b(KrnToastBridge p0,String p1,int p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       KrnToastBridge.b(this.b, this.c, this.d, this.e);
    }
}
