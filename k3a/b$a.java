package k3a.b$a;
import com.yxcorp.gifshow.widget.m;
import k3a.b;
import k3a.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import j3a.a;
import msd.l;
import qrd.l1;
import java.lang.CharSequence;
import e17.i;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Boolean;
import msd.p;

public final class b$a extends m	// class@002bc3
{
    public final b c;
    public final a d;

    public void b$a(b p0,a p1,boolean p2,long p3){
       this.c = p0;
       this.d = p1;
       super(p2, p3);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       boolean b = true;
       if (!this.d.b()) {
          a l = this.d.l;
          if (l != null) {
             l1 ol1 = l.invoke(p0);
          }
          i.g(R.style.arg_RES_7f11066a, this.d.i, b, b);
          return;
       }else {
          b$a td = this.d;
          td.m((b ^ td.g()));
          b c = this.c.c;
          if (c == null) {
             a.S("icon");
          }
          c.setSelected(this.d.g());
          c = this.c.b;
          if (c == null) {
             a.S("text");
          }
          c.setSelected(this.d.g());
          td = this.d;
          a k = td.k;
          if (k != null) {
             k.invoke(p0, Boolean.valueOf(td.g()));
          }
          return;
       }
    }
}
