package bwb.d;
import java.lang.Object;
import android.widget.TextView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import kotlin.jvm.internal.a;
import ra6.a;
import android.view.ViewTreeObserver;
import bwb.d$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Integer;

public final class d	// class@0004ce
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final void a(float p0,float p1,TextView p2,String p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), p2, p3, null, d.class, "3")) {
          return;
       }
       a.p(p2, "tv");
       a.p(p3, "tag");
       if (a.g()) {
          p2.setTextSize(1, p0);
          p2.getViewTreeObserver().addOnPreDrawListener(new d$a(p2, p3, p1));
       }
       return;
    }
    public static final void b(int p0,TextView[] p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uod, "2")) {
          return;
       }
       a.p(p1, "tv");
       if (a.e()) {
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             p1[i].setMaxLines(p0);
          }
       }
       return;
    }
    public static final void c(float p0,TextView[] p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, null, uod, "1")) {
          return;
       }
       a.p(p1, "tv");
       if (a.e()) {
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             p1[i].setTextSize(1, p0);
          }
       }
       return;
    }
}
