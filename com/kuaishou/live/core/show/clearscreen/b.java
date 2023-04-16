package com.kuaishou.live.core.show.clearscreen.b;
import nl8.m;
import android.view.View$OnClickListener;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z61.e;
import z61.a$a;
import z61.a;
import z61.b;
import android.content.Context;
import lnc.a1;
import zyc.f;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import java.lang.Boolean;
import e42.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;

public class b implements m	// class@000a21
{
    public final e a;
    public final MutableLiveData b;
    public final View$OnClickListener c;
    public e d;

    public void b(View$OnClickListener p0){
       super();
       this.b = new MutableLiveData();
       this.c = p0;
       e uoe = PatchProxy.apply(null, this, b.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          a$a uoa = new a$a();
          uoe.a = uoa;
          uoa.c = 0x7f081395;
          uoe.mFeatureId = 1018;
          uoe.mIconUrl = e0.h(f.f(a1.c(), "icon", 0x7f101eea));
          uoe.mTextRes = 0x7f101f7f;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mClickCallback = new c(this);
       }
       this.a = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.d = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
}
