package chc.a$a;
import com.yxcorp.gifshow.widget.m;
import chc.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ehc.g;
import ehc.b;
import msd.l;
import qrd.l1;
import ehc.h;
import ehc.a;

public final class a$a extends m	// class@00059f
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a s = this.c.s;
       if (s != null) {
          g og = s.f();
          if (og != null) {
             og.g();
          }
          l action = s.getAction();
          if (action != null) {
             l1 ol1 = action.invoke(p0);
          }
          h oh = s.i();
          if (oh != null) {
             oh.g();
          }
       }
       return;
    }
}
