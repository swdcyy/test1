package dib.d;
import java.lang.Runnable;
import com.kwai.video.westeros.v2.faceless.FacelessPlugin;
import zi9.f;
import java.lang.Object;
import java.lang.String;
import dc5.c;

public final class d implements Runnable	// class@0024b3
{
    public final FacelessPlugin b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final f j;

    public void d(FacelessPlugin p0,f p1,f p2,f p3,f p4,f p5,f p6,f p7,f p8){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       d tf = this.f;
       d tg = this.g;
       d th = this.h;
       d ti = this.i;
       d tj = this.j;
       c.g("IMMagicSDK", "release plugin");
       if (tb != null) {
          tb.release();
       }
       if (tc != null) {
          tc.d();
       }
       if (td != null) {
          td.d();
       }
       if (te != null) {
          te.d();
       }
       if (tf != null) {
          tf.d();
       }
       if (tg != null) {
          tg.d();
       }
       if (th != null) {
          th.d();
       }
       if (ti != null) {
          ti.d();
       }
       if (tj != null) {
          tj.d();
       }
       return;
    }
}
