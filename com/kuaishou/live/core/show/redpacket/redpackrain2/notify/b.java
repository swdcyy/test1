package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.b;
import erd.g;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.e;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainConfig;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import qh2.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ih2.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class b implements g	// class@000f0e
{
    public final e b;
    public final LiveRedPackRainConfig c;

    public void b(e p0,LiveRedPackRainConfig p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       LiveRedPackRainNotifyDialogFragment liveRedPackR;
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          e v = tb.v;
          if (v == null || (!v.d() || tb.P8())) {
             LiveRedPackRainConfig mRedPackRain = tc.mRedPackRainResource;
             e p = tb.p;
             QLivePlayConfig mLiveStreamI = p.e.mLiveStreamId;
             a0 z2 = p.Z2;
             LiveRedPackRainConfig mGroupId = tc.mGroupId;
             if (PatchProxy.isSupport(LiveRedPackRainNotifyDialogFragment.class)) {
                Object[] objArray = new Object[]{p0,mRedPackRain,mLiveStreamI,z2,mGroupId};
                liveRedPackR = PatchProxy.apply(objArray, null, LiveRedPackRainNotifyDialogFragment.class, "1");
                if (liveRedPackR != PatchProxyResult.class) {
                label_0064 :
                   tb.v = liveRedPackR;
                   liveRedPackR.k0(new a(tb));
                   tb.v.show(tb.p.Z2.b().getChildFragmentManager(), "LiveRedPackRainNotifyDialogFragment");
                   p0 = tc.mGroupId;
                   ClientContent$LiveStreamPackage liveStreamPa = tb.p.Z2.a();
                   if (!PatchProxy.applyVoidTwoRefs(p0, liveStreamPa, null, n.class, "1")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_RED_PACKET_RAIN_REMIND_CARD";
                      i3 oi3 = i3.f();
                      oi3.d("id", p0);
                      uElementPack.params = oi3.e();
                      u1.u0(3, uElementPack, n.a(liveStreamPa));
                   }
                }
             }
             liveRedPackR = new LiveRedPackRainNotifyDialogFragment();
             liveRedPackR.w = p0;
             liveRedPackR.x = mRedPackRain;
             liveRedPackR.y = mLiveStreamI;
             liveRedPackR.B = z2;
             liveRedPackR.C = mGroupId;
             goto label_0064 ;
          }
       }
       return;
    }
}
