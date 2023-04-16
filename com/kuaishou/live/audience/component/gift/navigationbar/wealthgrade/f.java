package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.f;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import hm2.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import java.util.Objects;
import android.app.Activity;
import d61.y;
import b11.f;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveUserRightsCenterView;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper;

public class f extends m	// class@000b82
{
    public final e c;

    public void f(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.b.Z2.a();
       e x = this.c.x;
       Object obj = null;
       int i = 1;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, x, obj, k.class, "21")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIFT_PANEL_RIGHTS_CENTER";
          i3 oi3 = i3.f();
          oi3.d("button_text", TextUtils.k(x));
          oi3.d("type", "USER_LEVEL");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.L("", obj, i, uElementPack, uContentPack);
       }
       f tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(obj, tc, uoe, "7")) {
          x = tc.a;
          if (x != null) {
             if (y.d(x)) {
                tc.a.setRequestedOrientation(i);
                k1.s(new f(tc), tc, 100);
             }else {
                tc.d();
             }
          }
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(obj, tc, uoe, "8")) {
          b.c0(LiveLogTag.WEALTH_GRADE, "hideAndRecordUserRightsInfoRedDot", "mUserRightsId", tc.w);
          LiveUserRightsInfoHelper.a(tc.p, tc.w);
       }
       return;
    }
}
