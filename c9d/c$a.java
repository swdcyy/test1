package c9d.c$a;
import ub.a;
import c9d.c;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import c9d.i;
import bd.f;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import nfd.t0;

public class c$a extends a	// class@0004fe
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a.class, "1")) {
          return;
       }
       c b = this.b.b;
       if (b.Q > null) {
          return;
       }
       if (p1 != null) {
          b.Q = p1.getWidth();
       }
       b = this.b.b;
       p1 = b.Q;
       if (p1 <= null) {
          return;
       }else {
          float f = (float)b.R / (float)p1;
          ViewGroup$MarginLayoutParams layoutParams = b.z.getLayoutParams();
          p1 = this.b.b;
          layoutParams.bottomMargin = (int)((float)p1.S * f);
          p1.z.setLayoutParams(layoutParams);
          int i = this.b.b.R - (a1.e(96.00f) * 2);
          p1 = this.b.b.z.getLayoutParams();
          p1.width = i;
          p1.height = (i * 56) / 192;
          this.b.b.z.setLayoutParams(p1);
          layoutParams = this.b.b.B.getLayoutParams();
          layoutParams.topMargin = t0.e;
          layoutParams.width = (int)((float)a1.e(256.00f) * f);
          layoutParams.height = (int)((float)a1.e(86.00f) * f);
          this.b.b.B.setLayoutParams(layoutParams);
          return;
       }
    }
}
