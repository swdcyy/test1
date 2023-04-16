package com.kuaishou.live.core.show.increasefans.c;
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
import ha2.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;

public class c implements m	// class@000c63
{
    public e a;
    public final e b;
    public final MutableLiveData c;

    public void c(View$OnClickListener p0){
       super();
       this.c = new MutableLiveData();
       e uoe = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1034;
          uoe.mIsVisible = Boolean.TRUE;
          uoe.mIconRes = 0x7f08139a;
          uoe.mTextRes = 0x7f100e62;
          uoe.mClickCallback = new c(p0);
       }
       this.b = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
}
