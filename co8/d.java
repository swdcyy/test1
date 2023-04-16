package co8.d;
import java.lang.Runnable;
import com.tachikoma.component.network.TKNetwork;
import java.lang.String;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;

public final class d implements Runnable	// class@000539
{
    public final TKNetwork b;
    public final String c;
    public final String d;
    public final JsValueRef e;

    public void d(TKNetwork p0,String p1,String p2,JsValueRef p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       this.b.h(this.c, this.d, this.e);
    }
}
