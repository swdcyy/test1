package com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment$b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneGiftLotteryNotify;
import android.app.Activity;
import lp3.e;
import j57.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import kg1.g;
import lp3.c;
import lp3.i;
import kotlin.jvm.internal.a;
import j57.i;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.fragment.app.KwaiDialogFragment;

public final class LiveGzoneGiftLotteryNotifyFragment$b implements View$OnClickListener	// class@000d04
{
    public final LiveGzoneGiftLotteryNotifyFragment b;

    public void LiveGzoneGiftLotteryNotifyFragment$b(LiveGzoneGiftLotteryNotifyFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveGzoneGiftLotteryNotifyFragment$b.class, "1")) {
          return;
       }
       b9.a(this.b.J);
       LiveGzoneGiftLotteryNotifyFragment$b tb = this.b;
       LiveGzoneGiftLotteryNotifyFragment$b tb1 = this.b;
       tb.J = n.a(tb.getActivity(), tb1.F.buttonUrl, tb1.H, -1);
       ClientContent$LiveStreamPackage liveStreamPa = this.b.I.a();
       c uoc = this.b.H.a(g.class);
       a.o(uoc, "mServiceManager.getServi¡­e::class.java\n          \)");
       int i = uoc.w8();
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(i), null, oi, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AWARD_POPUP";
          i3 oi3 = i3.f();
          oi3.c("fans_range", Integer.valueOf(i));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       this.b.G.dismiss();
       PatchProxy.onMethodExit(LiveGzoneGiftLotteryNotifyFragment$b.class, "1");
       return;
    }
}
