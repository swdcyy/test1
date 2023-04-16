package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import r14.k;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import e17.i;

public class u$c extends m	// class@001a93
{
    public final u c;

    public void u$c(u p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$c.class, "1")) {
          return;
       }
       u$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, u.class, "12")) {
          SandeagoPublish mIsMultiSku = tc.p.mIsMultiSku;
          boolean b = tc.S8();
          ClientContent$LiveStreamPackage liveStreamPa = tc.s.getLiveStreamPackage();
          if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(mIsMultiSku), Boolean.valueOf(b), liveStreamPa, null, k.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SPECIFICATION_GOODS";
             i3 oi3 = i3.f();
             oi3.c("skuType", Integer.valueOf((mIsMultiSku ^ 1)));
             oi3.c("buttonType", Integer.valueOf(b));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
          tc.R8();
          if (!tc.S8()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10435b);
          }else {
             u p = tc.p;
             p.mIsMultiSku = p.mIsMultiSku ^ 1;
             tc.W8();
          }
       }
       return;
    }
}
