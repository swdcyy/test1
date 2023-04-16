package i0a.y$b;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar$b;
import i0a.y;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import bf5.d;
import bf5.d$a;
import java.util.Objects;
import android.widget.TextView;
import android.view.View;
import java.lang.CharSequence;
import n9a.u;

public class y$b implements NasaFeaturedSeekBar$b	// class@00275f
{
    public final y a;

    public void y$b(y p0){
       this.a = p0;
       super();
    }
    public void a(float p0,int p1,int p2){
       if (PatchProxy.isSupport(y$b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, y$b.class, "3")) {
          return;
       }
       d d = this.a.d;
       d uod = null;
       if (d != null) {
          boolean b = (!p2)? true: false;
          d.b(p0, p1, b);
       }
       y$b ta = this.a;
       if (ta.j == null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, y.class, "18") && ta.k != null) {
             ta.g.setVisibility(uod);
             ta.h.setVisibility(uod);
             ta.i.setVisibility(uod);
          }
          ta = this.a;
          ta.h.setText(ta.w((long)((float)ta.c * p0)));
          ta = this.a;
          ta.g.setText(ta.w(ta.c));
          ta.j = true;
       }
       ta = this.a;
       ta.h.setText(ta.w((long)(p0 * (float)ta.c)));
       return;
    }
    public void b(boolean p0){
       u.d(this, p0);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, y$b.class, "1")) {
          return;
       }
       d d = this.a.d;
       if (d != null) {
          d.c();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, y$b.class, "2")) {
          return;
       }
       d d = this.a.d;
       if (d != null) {
          d.d();
       }
       return;
    }
}
