package asa.a$a;
import erd.g;
import asa.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import zq6.b;
import wq6.f;
import bo5.a;
import wq6.h;
import zq6.p;
import wn5.b;
import wq6.g;
import java.lang.CharSequence;
import android.widget.TextView;

public final class a$a implements g	// class@0002d8
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "6")) {
             a s = p0.s;
             String str = "containerController";
             if (s == null) {
                a.S(str);
             }
             b uob = s.y();
             a r = p0.r;
             if (r == null) {
                a.S("kcubeTab");
             }
             p s1 = a.s;
             a.o(s1, "HomeTopStateId.TAB_TEXT");
             uob = uob.e(r, s1);
             if (uob != null) {
                r = p0.s;
                if (r == null) {
                   a.S(str);
                }
                String str1 = uob.d(r.x("ato_operate"));
                a p = p0.p;
                if (p == null) {
                   a.S("textView");
                }
                p.setText(str1);
                p0 = p0.p;
                if (p0 == null) {
                   a.S("textView");
                }
                p0.setContentDescription(str1);
             }
          }
       }
       return;
    }
}
