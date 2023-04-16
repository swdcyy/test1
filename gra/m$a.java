package gra.m$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog;
import gra.m;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;

public final class m$a extends m	// class@002bb9
{
    public final ShowShareDialog c;
    public final m d;

    public void m$a(ShowShareDialog p0,m p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m$a.class, "1")) {
          return;
       }
       Activity activity = this.d.getActivity();
       if (activity != null) {
          activity.startActivity(b.a(0x66dce92a).a(activity, x0.f(this.c.ruleLink)));
       }
       GrowthVfcLogger.a.e(this.d.C, GrowthVfcLogger$VfcButtonType.RULE);
       PatchProxy.onMethodExit(m$a.class, "1");
       return;
    }
}
