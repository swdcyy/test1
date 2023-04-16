package com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter$b;
import nl8.m;
import android.view.View$OnClickListener;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z61.e;
import z61.b;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import v21.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;
import java.lang.Integer;

public class LiveAudienceBottomBarPushPresenter$b implements m	// class@000bc3
{
    public e a;
    public final e b;
    public final MutableLiveData c;

    public void LiveAudienceBottomBarPushPresenter$b(View$OnClickListener p0){
       super();
       this.c = new MutableLiveData();
       e uoe = PatchProxy.applyOneRefs(p0, this, LiveAudienceBottomBarPushPresenter$b.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1028;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mIconRes = 0x7f0813a1;
          uoe.mTextRes = 0x7f102103;
          uoe.mClickCallback = new g(p0);
       }
       this.b = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceBottomBarPushPresenter$b.class, "6")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void l(int p0){
       LiveAudienceBottomBarPushPresenter$b uob = LiveAudienceBottomBarPushPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.b;
       uob.mTextRes = p0;
       this.c.setValue(uob);
       return;
    }
}
