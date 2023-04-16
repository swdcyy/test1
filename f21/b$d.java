package f21.b$d;
import java.lang.Runnable;
import f21.b;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.d;
import kotlin.jvm.internal.a;
import android.view.View;

public final class b$d implements Runnable	// class@002299
{
    public final b b;
    public final View$OnClickListener c;

    public void b$d(b p0,View$OnClickListener p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "1")) {
          return;
       }
       b b = this.b.b;
       if (b != null) {
          b$d tc = this.c;
          if (!PatchProxy.applyVoidOneRefs(tc, b, d.class, "14")) {
             d o = b.o;
             if (o == null) {
                a.S("giftAnimationView");
             }
             o.setOnClickListener(tc);
          }
       }
       return;
    }
}
