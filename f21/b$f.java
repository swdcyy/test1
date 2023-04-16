package f21.b$f;
import java.lang.Runnable;
import f21.b;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.d;
import kotlin.jvm.internal.a;
import android.view.View;

public final class b$f implements Runnable	// class@00229b
{
    public final b b;
    public final Drawable c;

    public void b$f(b p0,Drawable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$f.class, "1")) {
          return;
       }
       b b = this.b.b;
       if (b != null) {
          b$f tc = this.c;
          if (!PatchProxy.applyVoidOneRefs(tc, b, d.class, "8")) {
             d l = b.l;
             if (l == null) {
                a.S("giftBackgroundView");
             }
             l.setBackground(tc);
          }
       }
       return;
    }
}
