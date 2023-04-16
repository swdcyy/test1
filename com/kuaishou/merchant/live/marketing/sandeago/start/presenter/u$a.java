package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.util.List;
import e17.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import r14.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class u$a extends m	// class@001a91
{
    public final u c;

    public void u$a(u p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$a.class, "1")) {
          return;
       }
       u$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, u.class, "8")) {
          if (tc.p.mMultiSkuList.size() >= 10) {
             i.a(R.style.arg_RES_7f11066a, 0x7f104365);
          }else {
             tc.P8("", "", tc.p.mMultiSkuList.size());
          }
          ClientContent$LiveStreamPackage liveStreamPa = tc.s.getLiveStreamPackage();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, k.class, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SPECIFICATION_ADD";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
