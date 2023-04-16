package dl9.u$h;
import java.lang.Runnable;
import dl9.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

public final class u$h implements Runnable	// class@001fb2
{
    public final u b;
    public final boolean c;

    public void u$h(u p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       u c;
       u d;
       if (PatchProxy.applyVoid(null, this, u$h.class, "1")) {
          return;
       }
       u$h tb = this.b;
       u$h tc = this.c;
       Objects.requireNonNull(tb);
       u ou = u.class;
       if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), tb, ou, "15")) {
          ou = tb.B;
          if (ou != null) {
             ou.setVisibility(4);
          }
          if (tc != null) {
             c = tb.C;
             if (c != null) {
                c.setVisibility(0);
             }
             d = tb.D;
             if (d != null) {
                d.setVisibility(4);
             }
          }else {
             c = tb.D;
             if (c != null) {
                c.setVisibility(0);
             }
             d = tb.C;
             if (d != null) {
                d.setVisibility(4);
             }
          }
       }
    label_0050 :
       LottieAnimationView lottieAnimat = this.b.X8(this.c);
       if (lottieAnimat != null) {
          lottieAnimat.s();
       }
       return;
    }
}
