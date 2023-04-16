package hy0.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fy0.b$b;
import t02.a0;
import hy0.y;
import fy0.j$a;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.model.LivePayBulletTag;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import fy0.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c	// class@0027a1
{
    public a0 p;
    public b$b q;
    public static String sLivePresenterClassName = "LiveAudienceBulletEditorTogglePresenter";

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (!this.q.d()) {
          return;
       }
       if (!y.a(this.p)) {
          return;
       }
       a tq = this.q;
       j$a uoa1 = tq.b(2, 4);
       uoa1.c(a1.p(R.string.arg_RES_7f101fa6));
       uoa1.b(R.drawable.arg_RES_7f081154);
       Object[] objArray1 = PatchProxy.apply(objArray, this, uoa, "3");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          LivePayBulletResponse livePayBulle = y.b(this.p);
          if (livePayBulle != null) {
             objArray = livePayBulle.getBulletTag();
          }
          objArray1 = objArray;
       }
       uoa1.g = objArray1;
       tq.e(uoa1.a());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.s8(a0.class);
       this.q = this.q8(b$b.class);
       return;
    }
}
