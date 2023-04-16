package com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController;
import android.widget.FrameLayout;
import android.view.View;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController$mRightArrowDelegate$1;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController$mRightButtonLayoutDelegate$1;
import com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController$mRightButtonTextView$2;
import com.kuaishou.live.core.show.topbroadcast.viewcontroller.LiveTopBroadcastMessageRightController$mRightButtonArrowView$2;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBannerBroadcastNotice;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zsd.u;
import android.widget.TextView;
import rp5.a;
import lp3.c;
import android.app.Activity;
import s51.c;
import android.content.Context;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ml2.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class LiveTopBroadcastMessageRightController	// class@0011d7
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final FrameLayout g;
    public final View h;
    public final e i;
    public final boolean j;

    public void LiveTopBroadcastMessageRightController(FrameLayout p0,View p1,e p2,boolean p3){
       a.p(p0, "mRightContainer");
       a.p(p1, "mBroadcastRootView");
       a.p(p2, "mLiveServiceManager");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       p op = s.c(new LiveTopBroadcastMessageRightController$mRightArrowDelegate$1(this));
       this.a = op;
       this.b = op;
       op = s.c(new LiveTopBroadcastMessageRightController$mRightButtonLayoutDelegate$1(this));
       this.c = op;
       this.d = op;
       this.e = s.c(new LiveTopBroadcastMessageRightController$mRightButtonTextView$2(this));
       this.f = s.c(new LiveTopBroadcastMessageRightController$mRightButtonArrowView$2(this));
    }
    public final boolean a(LiveCommonNoticeMessages$SCTopBannerBroadcastNotice p0){
       LiveCommonNoticeMessages$SCTopBannerBroadcastNotice obj = PatchProxy.applyOneRefs(p0, this, LiveTopBroadcastMessageRightController.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.j != null) {
          obj = p0.routeUrl;
          if (obj == null || u.q2(obj, "kwai://live/play/", b, 2, null) != true) {
             p0 = p0.routeUrl;
             if (p0 == null || u.q2(p0, "kwai://liveaggregatesquare", b, 2, null) != true) {
             label_0033 :
                b = true;
             }
          }
       }else {
          goto label_0033 ;
       }
       return b;
    }
    public final View b(){
       Object obj = PatchProxy.apply(null, this, LiveTopBroadcastMessageRightController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final View c(){
       Object obj = PatchProxy.apply(null, this, LiveTopBroadcastMessageRightController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final TextView d(){
       Object obj = PatchProxy.apply(null, this, LiveTopBroadcastMessageRightController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final void e(LiveCommonNoticeMessages$SCTopBannerBroadcastNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTopBroadcastMessageRightController.class, "8")) {
          return;
       }
       Activity uActivity = this.i.a(a.class).c();
       if (uActivity != null) {
          this.i.a(c.class).r4(p0.routeUrl, uActivity);
       }
       c uoc = this.i.a(i.class);
       a.o(uoc, "mLiveServiceManager.getS¡­kageProvider::class.java\)");
       ClientContent$LiveStreamPackage liveStreamPa = uoc.a();
       if (!PatchProxy.applyVoidTwoRefs(p0, liveStreamPa, null, o.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_TOP_BANNER_BROADCAST_NOTICE";
          i3 oi3 = i3.f();
          oi3.c("biz_id", Long.valueOf(p0.bizId));
          oi3.d("extra_info", p0.extraInfo);
          oi3.c("notice_type", Integer.valueOf(p0.priorityType));
          oi3.c("route_type", Integer.valueOf(p0.routeType));
          oi3.c("style_type", Integer.valueOf(p0.style));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
}
