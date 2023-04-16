package com.kuaishou.live.preview.item.bottomcard.handler.m;
import hk3.a;
import gk3.b;
import java.lang.Object;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ok3.l;
import com.kuaishou.live.preview.item.bottomcard.handler.l;
import ok3.n;
import ik3.c$a;
import ok3.b;
import hk3.l;
import ik3.b;
import ik3.c;
import hk3.k;
import java.lang.Runnable;
import ekd.k1;
import kk3.f$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.preview.item.bottomcard.handler.k;
import erd.g;
import crd.b;
import com.kuaishou.live.preview.item.bottomcard.handler.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import lnc.b9;

public class m implements a	// class@000d8b
{
    public final b a;
    public b b;
    public boolean c;

    public void m(b p0,boolean p1){
       super();
       this.a = p0;
       this.c = p1;
    }
    public void a(LivePreviewBottomCardModel p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, om, "3")) {
          l ol = new l(new l(this, p0));
          c$a uoa = new c$a();
          uoa.e(p0.mCardType);
          uoa.b(p0.mBizId);
          uoa.g(p0.mPriority);
          uoa.h(p0.mShowCardMillis);
          uoa.f(p0.mIsCardHoldOn);
          uoa.d(ol);
          uoa.c(new l(this, p0));
          c uoc = uoa.a();
          LivePreviewBottomCardModel mDelayShowMi = p0.mDelayShowMillis;
          if (mDelayShowMi > 0) {
             k1.s(new k(this, uoc), this, mDelayShowMi);
          }else {
             this.a.c().b(uoc);
          }
          this.b = RxBus.f.f(n.class).observeOn(d.a).subscribe(new k(this, uoc, ol));
       }
       return;
    }
    public void b(LivePreviewBottomCardModel p0,b p1){
       h.a(this, p0, p1);
    }
    public ClientContent$ContentPackage c(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = w1.f(this.a.d().getEntity());
       return obj;
    }
    public ClientEvent$ElementPackage d(){
       ClientEvent$ElementPackage obj = PatchProxy.apply(null, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "STREAMER_FOLLOW_GUIDE_BUTTON";
       return obj;
    }
    public ClientContent$ContentPackage e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ClientContent$ContentPackage obj = PatchProxy.apply(objArray, this, m.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       m ta = this.a;
       Objects.requireNonNull(ta);
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(objArray, ta, b.class, "4");
       if (liveStreamPa != patchProxyRe) {
       }else {
          ClientContent$LiveStreamPackage liveStreamPa1 = x.e(ta.b.mEntity, 1);
          liveStreamPa1.liveStyle = 1;
          liveStreamPa = liveStreamPa1;
       }
       obj.liveStreamPackage = liveStreamPa;
       return obj;
    }
    public ClientEvent$ElementPackage f(){
       ClientEvent$ElementPackage obj = PatchProxy.apply(null, this, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "SIMPLE_LIVE_HOMEPAGE_BUTTON";
       return obj;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       k1.n(this);
       b9.a(this.b);
       return;
    }
}
