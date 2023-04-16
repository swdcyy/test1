package com.kuaishou.live.core.show.floatingwindow.c$c;
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
import s82.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;

public class c$c implements m	// class@000b78
{
    public e a;
    public final e b;
    public final MutableLiveData c;

    public void c$c(View$OnClickListener p0){
       super();
       this.c = new MutableLiveData();
       e uoe = PatchProxy.applyOneRefs(p0, this, c$c.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1022;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mIconRes = 0x7f0813a4;
          uoe.mTextRes = 0x7f101ecb;
          uoe.mClickCallback = new d(p0);
       }
       this.b = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "3")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void setVisible(boolean p0){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.b.mIsVisible = Boolean.valueOf(p0);
       this.c.setValue(this.b);
       return;
    }
}
