package com.kuaishou.live.core.show.clearscreen.e;
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
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import java.lang.Boolean;
import e42.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;

public class e implements m	// class@000a2b
{
    public final e a;
    public final MutableLiveData b;
    public final View$OnClickListener c;
    public e d;

    public void e(View$OnClickListener p0){
       super();
       this.b = new MutableLiveData();
       this.c = p0;
       e uoe = PatchProxy.apply(null, this, e.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1032;
          uoe.mIconRes = 0x7f081126;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mClickCallback = new q(this);
       }
       this.a = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.d = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void setVisible(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "5")) {
          return;
       }
       this.a.mIsVisible = Boolean.valueOf(p0);
       this.b.setValue(this.a);
       return;
    }
}
