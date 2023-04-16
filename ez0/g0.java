package ez0.g0;
import t02.a0;
import mk1.f;
import iw1.a;
import sz1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ez0.g0$d;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.lang.Class;
import lf3.g;
import hf3.a;
import mk1.d0;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.protobuf.nano.MessageNano;
import sz1.f;
import pp.c;
import pp.d;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.common.core.component.gift.gift.p;
import crd.b;
import lnc.b9;
import ssd.e;
import ssd.e$a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ez0.f0;
import erd.g;
import p91.m;
import ez0.g0$a;
import erd.o;
import ez0.g0$b;
import ez0.g0$c;
import ez0.g0$e;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import wz2.a$a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import wz2.a;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;

public final class g0	// class@002248
{
    public b a;
    public b b;
    public d0 c;
    public long d;
    public final g0$d e;
    public final a0 f;
    public final f g;
    public final a h;
    public final e i;

    public void g0(a0 p0,f p1,a p2,e p3){
       a.p(p0, "livePlayCallerContext");
       a.p(p1, "giftBoxDataSource");
       a.p(p2, "audiencePKService");
       a.p(p3, "liveMultiInteractManager");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       g0$d uod = new g0$d(this);
       this.e = uod;
       p0.C.u0(797, SCLiveGiftPanelRefresh.class, uod);
    }
    public final d0 a(){
       return this.c;
    }
    public final void b(SCLiveGiftPanelRefresh p0){
       g0 og0 = g0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og0, "5")) {
          return;
       }
       this.f.H2.k(LiveLogTag.GIFT, "handleGiftPanelUpdateMessage", "SCLiveGiftPanelRefresh", p0.toString(), "pkId", this.h.m(), "interactId", f.b(this.i));
       if (!PatchProxy.applyVoidOneRefs(p0, this, og0, "10")) {
          i3 oi3 = i3.f();
          oi3.d("pk_id", this.h.m());
          oi3.c("random_delay", Long.valueOf(p0.giftPanelMaxDelayMills));
          oi3.a("disable_preload_magic_face_resource", Boolean.valueOf(p0.disablePreloadMagicFaceResource));
          oi3.c("refresh_tab", Integer.valueOf(p0.refreshTab));
          oi3.a("enable_refresh_panel_ui", Boolean.valueOf(p0.enableRefreshPanelUi));
          a.o(oi3, "JsonStringBuilder.newIns¡­msg.enableRefreshPanelUi\)");
          if (!TextUtils.isEmpty(f.b(this.i))) {
             oi3.d("interact_id", f.b(this.i));
          }
          u1.R("LIVE_RECEIVE_GIFT_PANEL_REFRESH", oi3.toString(), 3);
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (!qCurrentUser.isLogined()) {
          return;
       }else if(p.c()){
          if (!PatchProxy.applyVoidOneRefs(p0, this, og0, "6")) {
             b9.a(this.b);
             SCLiveGiftPanelRefresh giftPanelMax = p0.giftPanelMaxDelayMills;
             long l = 0;
             if (giftPanelMax - l > 0) {
                l = e.b.o(giftPanelMax);
             }
             this.b = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f0(this, p0));
          }
       }else {
          this.c(p0.disablePreloadMagicFaceResource, p0.giftPanelMaxDelayMills);
       }
       return;
    }
    public final void c(boolean p0,long p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, og0, "9")) {
          return;
       }
       b9.a(this.a);
       a0 z2 = this.f.Z2;
       a.o(z2, "livePlayCallerContext.mLiveBasicContext");
       this.d = z2.s();
       long l = 0;
       if (p1 - l > 0) {
          l = e.b.o(p1);
       }
       this.a = t.timer(l, TimeUnit.MILLISECONDS).flatMap(new g0$a(this)).subscribe(new g0$b(this, p0), g0$c.b);
       return;
    }
    public final void d(SCLiveGiftPanelRefresh p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "7")) {
          return;
       }
       b9.a(this.a);
       this.a = this.g.r().subscribe(new g0$e(this, p0));
       return;
    }
    public final void e(SCLiveGiftPanelRefresh p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "8")) {
          return;
       }
       LiveEffectDownloadSwitchInfo matchedSwitc = LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo();
       if (p0.disablePreloadMagicFaceResource == null) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (qCurrentUser.isLogined() && matchedSwitc.enablePreDownloadOnUpdateGift != null) {
             a$a uoa = new a$a();
             uoa.e(4);
             uoa.c(1);
             uoa.d(3);
             uoa.h(1);
             uoa.f((matchedSwitc.enablePreDownloadOnUpdateGift ^ 1));
             uoa.j(RequestTiming.DEFAULT);
             a uoa1 = uoa.a();
             a.o(uoa1, "DownloadConfig.Builder\(\)¡­DEFAULT\)\n        .build\(\)");
             a0 z2 = this.f.Z2;
             a.o(z2, "livePlayCallerContext.mLiveBasicContext");
             e.b().he().c(z2.getLiveStreamId(), false, uoa1);
          }
       }
       return;
    }
}
