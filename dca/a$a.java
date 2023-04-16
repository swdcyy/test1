package dca.a$a;
import erd.g;
import dca.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dca.i;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextSwitcher;

public final class a$a implements g	// class@001eea
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = i.a;
          i = (int)((p0.longValue() + 1) % (long)p0.length);
          a e = this.b.e;
          if (e == null) {
             a.S("descriptionView");
          }
          e.setText(a1.p(p0[i]));
       }
       return;
    }
}
