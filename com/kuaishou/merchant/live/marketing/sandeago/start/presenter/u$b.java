package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q64.g0;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import com.kuaishou.merchant.router.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import r14.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class u$b extends m	// class@001a92
{
    public final u c;

    public void u$b(u p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$b.class, "1")) {
          return;
       }
       u$b tc = this.c;
       Objects.requireNonNull(tc);
       u ou = u.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, ou, "9")) {
          if (!PatchProxy.applyVoid(objArray, tc, ou, "10")) {
             b.q(tc.s.getMerchantSessionId(), tc.getActivity(), "kwaimerchant://openhalfrn?bundleId=KwaishopBSandeago&componentName=sandeagoTemplateList&heightRatio=1.0&widthRatio=1.0", objArray, new g0(tc));
          }
          ClientContent$LiveStreamPackage liveStreamPa = tc.s.getLiveStreamPackage();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, k.class, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SPECIFICATION_TEMPLATE";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
