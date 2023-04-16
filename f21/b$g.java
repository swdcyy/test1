package f21.b$g;
import java.lang.Runnable;
import f21.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.d;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public final class b$g implements Runnable	// class@00229c
{
    public final b b;
    public final boolean c;

    public void b$g(b p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$g.class, "1")) {
          return;
       }
       b b = this.b.b;
       if (b != null) {
          b$g tc = this.c;
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), b, uod, "9")) {
             d m = b.m;
             if (m == null) {
                a.S("giftContainer");
             }
             int i = (tc != null)? 0: 8;
             m.setVisibility(i);
          }
       }
       return;
    }
}
