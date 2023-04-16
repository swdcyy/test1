package dj0.a;
import java.lang.Runnable;
import com.kuaishou.krn.bridges.toast.KrnToastBridge;
import java.lang.String;
import java.lang.Object;

public final class a implements Runnable	// class@001fa4
{
    public final KrnToastBridge b;
    public final String c;
    public final int d;

    public void a(KrnToastBridge p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       KrnToastBridge.a(this.b, this.c, this.d);
    }
}
