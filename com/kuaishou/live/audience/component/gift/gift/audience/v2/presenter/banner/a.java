package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import java.lang.String;
import com.kuaishou.live.external.invoke.deserializer.gift.LiveGiftItemHintActionInfo;
import java.lang.Object;
import android.view.View;
import xp5.i;
import java.lang.Class;
import lp3.c;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import kz0.h;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.u1;
import lnc.l1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.e;
import java.lang.Runnable;
import d61.y;

public final class a implements View$OnClickListener	// class@000b2a
{
    public final f b;
    public final String c;
    public final LiveGiftItemHintActionInfo d;

    public void a(f p0,String p1,LiveGiftItemHintActionInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       ClientContent$LiveStreamPackage liveStreamPa = tb.q.a(i.class).a();
       if (PatchProxy.applyVoidTwoRefs(liveStreamPa, tc, null, h.class, "2")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ACTIVE_GIFT_ICON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
          uContentPack.moreInfoPackage = moreInfoPack;
          moreInfoPack.id = tc;
          u1.u(1, uElementPack, uContentPack);
       }
       if (l1.a()) {
          tb.R8();
       }
       if (td.mActionType == 4) {
          y.a(tb.getActivity(), new e(tb, td), tb, 100);
       }
       return;
    }
}
