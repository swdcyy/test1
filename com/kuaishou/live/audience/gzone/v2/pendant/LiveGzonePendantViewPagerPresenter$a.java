package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$a;
import androidx.fragment.app.c$b;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import z31.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;

public class LiveGzonePendantViewPagerPresenter$a extends c$b	// class@000c36
{
    public final LiveGzonePendantViewPagerPresenter a;

    public void LiveGzonePendantViewPagerPresenter$a(LiveGzonePendantViewPagerPresenter p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       ClientContent$LiveStreamPackage liveStreamPa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzonePendantViewPagerPresenter$a.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.a.B)) {
          liveStreamPa = this.a.y.a();
          LiveGzonePendantViewPagerPresenter b = this.a.B;
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, b, null, o.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FLOW_OPERATE_BACK";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (liveStreamPa != null) {
                uContentPack.liveStreamPackage = liveStreamPa;
             }
             uContentPack.ksOrderInfoPackage = l0.a(b);
             u1.u0(3, uElementPack, uContentPack);
          }
       }
       liveStreamPa.B = "";
       return;
    }
}
