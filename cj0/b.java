package cj0.b;
import java.lang.Runnable;
import com.kuaishou.krn.bridges.page.KrnPageViewBridge;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;

public final class b implements Runnable	// class@0004c6
{
    public final KrnPageViewBridge b;
    public final int c;
    public final ReadableMap d;
    public final long e;
    public final long f;

    public void b(KrnPageViewBridge p0,int p1,ReadableMap p2,long p3,long p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       KrnPageViewBridge.b(this.b, this.c, this.d, this.e, this.f);
    }
}
