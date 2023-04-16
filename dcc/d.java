package dcc.d;
import dcc.c;
import android.view.View;
import dcc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.c;
import ekd.k1;

public final class d extends c	// class@00216d
{
    public final b f;
    public final int g;
    public final int h;

    public void d(View p0,b p1,int p2,int p3){
       a.p(p0, "itemView");
       a.p(p1, "callback");
       super(p0);
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.setText(this.g);
       this.b.setVisibility(0);
       this.c.setImageResource(this.h);
       this.c.setVisibility(0);
       b a = this.f.a;
       if (a != null) {
          a.run();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       b b = this.f.b;
       if (b != null) {
          b.run();
       }
       c te = this.e;
       if (te != null) {
          te.q(3);
       }
       b = this.f.c;
       if (b != null) {
          k1.r(b, 300);
       }
       return;
    }
}
