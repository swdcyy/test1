package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.h;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView$b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ph2.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ih2.n;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import com.yxcorp.gifshow.model.CDNUrl;
import android.widget.ImageView;
import android.view.View;
import android.view.animation.Animation;
import ekd.f;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.f;
import crd.b;
import ok.h;
import lnc.b9;

public class h implements LiveRedPackRainSnatchView$b	// class@000f2b
{
    public final i a;

    public void h(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "2")) {
          return;
       }
       n.d(this.a.k.i().a, "REWARD", this.a.k.e().Z2.a());
       i i = this.a.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoid(objArray, i, LiveRedPackRainSnatchView.class, "15")) {
          LiveRedPackRainSnatchView k = i.k;
          String str = "/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_snatch_coin.webp";
          if (k != null) {
             LiveRedPackRainResource mGrabPrepare = k.mGrabPrepareReserveButton;
             if (mGrabPrepare != null) {
                i.g(mGrabPrepare.mImageUrls, str);
             label_004e :
                i.g.setVisibility(0);
                if (i.j == null) {
                   i.j = f.k(i.g);
                }
                if (!i.j.hasStarted()) {
                   i.j.start();
                }
             }
          }
          i.a(str);
          goto label_004e ;
       }
       i = this.a.k;
       if (i != null) {
          i.g();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       n.e("LIVE_RED_PACKET_RAIN_LOTTERY_RESULT", this.a.k.i().a, this.a.k.e().Z2.a());
       i k = this.a.k;
       if (k != null) {
          k.j(true);
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "1")) {
          return;
       }
       n.f(this.a.k.i().a, "ORDER", this.a.k.e().Z2.a());
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, i.class, "2")) {
          ta.l = b9.c(ta.l, new f(ta));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       n.e("LIVE_RED_PACKET_RAIN_WAIT_OPEN_CARD", this.a.k.i().a, this.a.k.e().Z2.a());
       i k = this.a.k;
       if (k != null) {
          k.l(4);
          this.a.k.j(false);
       }
       return;
    }
}
