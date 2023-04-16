package cj0.c;
import java.lang.Runnable;
import com.kuaishou.krn.bridges.page.KrnPageViewBridge;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;

public final class c implements Runnable	// class@0004c7
{
    public final KrnPageViewBridge b;
    public final ReadableMap c;
    public final long d;
    public final long e;

    public void c(KrnPageViewBridge p0,ReadableMap p1,long p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       KrnPageViewBridge.a(this.b, this.c, this.d, this.e);
    }
}
