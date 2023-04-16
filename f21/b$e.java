package f21.b$e;
import java.lang.Runnable;
import f21.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.d;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.view.View;

public final class b$e implements Runnable	// class@00229a
{
    public final b b;
    public final boolean c;

    public void b$e(b p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$e.class, "1")) {
          return;
       }
       b b = this.b.b;
       if (b != null) {
          b$e tc = this.c;
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), b, uod, "10")) {
             d o = b.o;
             if (o == null) {
                a.S("giftAnimationView");
             }
             int i = (tc != null)? 0: 8;
             o.setVisibility(i);
          }
       }
       return;
    }
}
