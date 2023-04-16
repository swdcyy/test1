package cj0.a;
import java.lang.Runnable;
import com.facebook.react.bridge.ReadableMap;
import lj0.c;
import java.lang.Object;
import com.kuaishou.krn.bridges.page.KrnPageViewBridge;

public final class a implements Runnable	// class@0004c5
{
    public final double b;
    public final double c;
    public final ReadableMap d;
    public final c e;

    public void a(double p0,double p1,ReadableMap p2,c p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       KrnPageViewBridge.lambda$reportPageRenderTime$3(this.b, this.c, this.d, this.e);
    }
}
