package com.kuaishou.live.audience.course.g;
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
import s31.s;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;

public class g implements m	// class@000c03
{
    public e a;
    public final e b;
    public final MutableLiveData c;

    public void g(View$OnClickListener p0){
       super();
       this.c = new MutableLiveData();
       e uoe = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1011;
          uoe.mClickCallback = new s(p0);
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mIconRes = 0x7f081129;
          uoe.mTextRes = 0x7f10040d;
       }
       this.b = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void setVisible(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "4")) {
          return;
       }
       this.b.mIsVisible = Boolean.valueOf(p0);
       this.c.setValue(this.b);
       return;
    }
}
