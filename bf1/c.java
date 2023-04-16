package bf1.c;
import bf1.j;
import df1.c;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bq5.f;
import bq5.f$a;
import bf1.b;
import bq5.d;
import bf1.c$a;
import lp3.e;
import bq5.h;
import lp3.c;
import com.kuaishou.live.common.core.component.comments.fluency.display.LiveCommentsBottomIgnoreSizeView;
import android.content.Context;
import ekd.k1;

public abstract class c extends j	// class@000371
{
    public f g;

    public void c(){
       super();
    }
    public boolean g(){
       return false;
    }
    public final View h(c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       f uof = PatchProxy.applyOneRefs(p0, this, uoc, "2");
       if (uof != patchProxyRe) {
       }else {
          f$a uoa = new f$a();
          uoa.b(false);
          uoa.c(p0.i());
          uoa.d(new b(this, p0));
          uoa.f(10);
          uoa.e(new c$a(this, p0));
          uof = uoa.a();
       }
       this.g = uof;
       this.m().a(h.class).Oh(this.g);
       return new LiveCommentsBottomIgnoreSizeView(this.k());
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       super.onDestroy();
       k1.n(this);
       return;
    }
    public void p(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       c tg = this.g;
       if (tg != null) {
          tg.e(0);
       }
       this.g = null;
       super.p(p0);
       return;
    }
    public abstract View r(c p0);
    public void s(c p0){
    }
}
