package gra.j$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.vfc.model.NormalInviteInfo;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog;
import gra.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import fra.c;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;

public final class j$a extends m	// class@002bb5
{
    public final NormalInviteInfo c;
    public final int d;
    public final ShowShareDialog e;
    public final j f;

    public void j$a(NormalInviteInfo p0,int p1,ShowShareDialog p2,j p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, j$a.class, "1")) {
          return;
       }
       j$a tf = this.f;
       Objects.requireNonNull(tf);
       j oj = PatchProxy.apply(null, tf, j.class, "1");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = tf.t;
          if (oj == null) {
             a.S("mCallContext");
          }
       }
       j$a te = this.e;
       tf.Z8(oj.c(), te.shareObjectId, te.tokenExtParams, this.f.getActivity());
       GrowthVfcLogger.a.e(this.e.logTracker, GrowthVfcLogger$VfcButtonType.ADD_BUTTON);
       PatchProxy.onMethodExit(j$a.class, "1");
       return;
    }
}
