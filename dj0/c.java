package dj0.c;
import java.lang.Runnable;
import com.kuaishou.krn.bridges.toast.KrnToastBridge;
import java.lang.String;
import java.lang.Object;

public final class c implements Runnable	// class@001fa6
{
    public final KrnToastBridge b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public void c(KrnToastBridge p0,String p1,int p2,int p3,int p4,int p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       KrnToastBridge.c(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
