package nz9.s;
import erd.g;
import nz9.z0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Runnable;
import p1a.a$a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.i3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;

public final class s implements g	// class@003246
{
    public final z0 b;

    public void s(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       boolean b = false;
       tb.N = b;
       z0 oz0 = z0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oz0, "34")) {
       }else if(VisitorModeManager.g(2)){
          b = new Object[b];
          o.C().w("AvatarAndFollowBaseElement", "onFollowBtnClick mIsAniming "+tb.M+", mFollowClickAction "+tb.v, b);
          if (tb.M == null) {
             b = tb.v;
             if (b != null) {
                b.run();
             }
          }
          if (!PatchProxy.applyVoid(objArray, tb, oz0, "21")) {
             b = tb.V;
             if (b != null) {
                a$a uoa = a$a.b(31, "user_follow", 1);
                uoa.r(1);
                uoa.j(tb.u.getFeedLogCtx());
                i3 oi3 = i3.f();
                oi3.d("head_position", "RIGHT_BAR");
                uoa.m(oi3.e());
                b.a(uoa);
             }
          }
       }
       return;
    }
}
