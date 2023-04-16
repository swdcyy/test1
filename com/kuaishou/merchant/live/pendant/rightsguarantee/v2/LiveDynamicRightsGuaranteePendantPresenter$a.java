package com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter$a;
import java.lang.Object;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import fs3.a;
import com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter;

public final class LiveDynamicRightsGuaranteePendantPresenter$a	// class@001ac0
{

    public void LiveDynamicRightsGuaranteePendantPresenter$a(){
       super();
    }
    public void LiveDynamicRightsGuaranteePendantPresenter$a(u p0){
       super();
    }
    public final PresenterV2 a(int p0){
       Object obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport2(LiveDynamicRightsGuaranteePendantPresenter$a.class, "1")) {
          obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, LiveDynamicRightsGuaranteePendantPresenter$a.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(LiveDynamicRightsGuaranteePendantPresenter$a.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveDynamicRightsGuaranteePendantPresenter$a.class, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          label_0041 :
             LiveDynamicRightsGuaranteePendantPresenter liveDynamicR = (b)? new LiveDynamicRightsGuaranteePendantPresenter(): new PresenterV2();
             PatchProxy.onMethodExit(LiveDynamicRightsGuaranteePendantPresenter$a.class, "1");
             return liveDynamicR;
          }
       }
       b = d.a(-1432266865).Gd(p0, "TrustRadar");
       goto label_0041 ;
    }
}
