package djc.o0$c;
import erd.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import djc.o0;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mhc.q;
import djc.m0;
import android.widget.ImageView;
import djc.p0;
import android.view.View$OnClickListener;
import java.lang.Double;
import djc.q0;
import java.lang.Runnable;

public final class o0$c implements g	// class@002210
{
    public final Ref$ObjectRef b;
    public final o0 c;

    public void o0$c(Ref$ObjectRef p0,o0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o0$c.class, "1")) {
       }else {
          a.p(p0, "bitmap");
          q oq = this.c.b.c();
          if (oq != null) {
             oq.b();
          }
          this.b.element.setImageBitmap(p0);
          this.b.element.setOnClickListener(new p0(this));
          if (Double.compare(this.c.b.b(), 0) > 0) {
             this.b.element.post(new q0(this));
          }
          PatchProxy.onMethodExit(o0$c.class, "1");
       }
       return;
    }
}
