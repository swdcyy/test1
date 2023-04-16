package d6b.d$f;
import erd.g;
import d6b.d;
import android.widget.RelativeLayout;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;

public final class d$f implements g	// class@00245b
{
    public final d b;
    public final RelativeLayout c;
    public final RelativeLayout d;

    public void d$f(d p0,RelativeLayout p1,RelativeLayout p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$f.class, "1")) {
       }else {
          d$f tb = this.b;
          a.o(p0, "state");
          int i = p0.intValue();
          d t = this.b.t;
          if (t == null) {
             a.S("mPhotoMapEntranceView");
          }
          d$f tc = this.c;
          d$f td = this.d;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i), t, tc, td, tb, d.class, "5")) {
             boolean b = true;
             int i1 = -1;
             if (i) {
                if (i != 2) {
                   if (i == 3) {
                      tb.I = false;
                   }
                }else if(td != null){
                   i = new RelativeLayout$LayoutParams(-2, i1);
                   i.addRule(11);
                   if (t != null) {
                      tb.W8(t, td, i);
                   }
                }
                tb.I = b;
                if (tb.J != null) {
                   tb.V8(tb.A);
                }
             }else if(tc != null){
                i = new RelativeLayout$LayoutParams(-2, i1);
                if (t != null) {
                   tb.W8(t, tc, i);
                }
             }
             tb.I = b;
             if (tb.J != null) {
                tb.V8(tb.A);
             }
          }
       }
    label_008a :
       return;
    }
}
