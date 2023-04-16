package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ii2.e;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveSurpriseRedPackDialogFragment$b extends m	// class@000fa2
{
    public final LiveSurpriseRedPackDialogFragment c;

    public void LiveSurpriseRedPackDialogFragment$b(LiveSurpriseRedPackDialogFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSurpriseRedPackDialogFragment$b.class, str)) {
          return;
       }
       BaseFragment uBaseFragmen = this.c.z.Z2.b();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.c.z.Z2.y();
       ClientContent$LiveStreamPackage liveStreamPa = this.c.z.Z2.a();
       LiveSurpriseRedPackDialogFragment$b tc = this.c;
       LiveSurpriseRedPackDialogFragment a = tc.A;
       int i = 3;
       int i1 = 2;
       int i2 = (tc.s == i1)? 2: 3;
       if (PatchProxy.isSupport(e.class)) {
          Object[] objArray = new Object[]{uBaseFragmen,liveVoicePar,liveStreamPa,a,Integer.valueOf(i2)};
          if (PatchProxy.applyVoid(objArray, null, e.class, str)) {
          label_0082 :
             this.c.dismissAllowingStateLoss();
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DRAW_PRIZE_ROLL_CLOSE_CLICK";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       uContentPack.liveVoicePartyPackage = liveVoicePar;
       ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
       redPackPacka.drawPrizePage = i2;
       redPackPacka.redPackId = a;
       redPackPacka.redPackType = 11;
       uContentPack.redPackage = redPackPacka;
       u1.L("", uBaseFragmen, 1, uElementPack, uContentPack);
       goto label_0082 ;
    }
}
