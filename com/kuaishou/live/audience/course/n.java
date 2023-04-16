package com.kuaishou.live.audience.course.n;
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
import s31.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;

public class n implements m	// class@000c0c
{
    public View$OnClickListener a;
    public final e b;
    public final MutableLiveData c;
    public e d;

    public void n(View$OnClickListener p0){
       super();
       this.c = new MutableLiveData();
       this.a = p0;
       e uoe = PatchProxy.apply(null, this, n.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1012;
          uoe.mIconRes = 0x7f081396;
          uoe.mTextRes = 0x7f10200d;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mClickCallback = new f0(this);
       }
       this.b = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.d = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void l(View$OnClickListener p0){
       this.a = p0;
    }
    public void setVisible(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "5")) {
          return;
       }
       this.b.mIsVisible = Boolean.valueOf(p0);
       this.c.setValue(this.b);
       return;
    }
}
