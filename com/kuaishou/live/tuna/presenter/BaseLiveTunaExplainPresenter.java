package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
import a51.c;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedHashSet;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$b;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$d;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCLiveEcoExplainCardSignal;
import lf3.g;
import t02.a0;
import mq5.h;
import mq5.b;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import z12.x;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import op3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import java.util.Map;
import tp3.a;
import tkd.b;
import tkd.d;
import xx5.d;
import com.kwai.framework.model.feed.BaseFeed;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import rq5.a;
import pq5.c;
import qp3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import nl9.r;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import by5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.i;
import vq5.d;

public abstract class BaseLiveTunaExplainPresenter extends c	// class@000fcc
{
    public boolean A;
    public AtomicReference B;
    public ConcurrentLinkedQueue C;
    public LinkedHashSet D;
    public h E;
    public a F;
    public boolean G;
    public final BaseLiveTunaExplainPresenter$d H;
    public final p I;
    public final BaseLiveTunaExplainPresenter$c J;
    public m v;
    public a0 w;
    public i x;
    public d y;
    public c z;
    public static final BaseLiveTunaExplainPresenter$a K;
    public static String sLivePresenterClassName;

    static {
       BaseLiveTunaExplainPresenter.K = new BaseLiveTunaExplainPresenter$a(null);
    }
    public void BaseLiveTunaExplainPresenter(){
       super();
       this.B = new AtomicReference();
       this.C = new ConcurrentLinkedQueue();
       this.D = new LinkedHashSet();
       this.E = new BaseLiveTunaExplainPresenter$b(this);
       this.G = true;
       this.H = new BaseLiveTunaExplainPresenter$d(this);
       this.I = s.c(new BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2(this));
       this.J = new BaseLiveTunaExplainPresenter$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveTunaExplainPresenter.class, "15")) {
          return;
       }
       super.E8();
       BaseLiveTunaExplainPresenter tv = this.v;
       if (tv != null) {
          a uoa = tv.u();
          if (uoa != null) {
             uoa.u0(986, SCLiveEcoExplainCardSignal.class, this.H);
          }
       }
       tv = this.w;
       if (tv != null) {
          a0 d2 = tv.D2;
          if (d2 != null) {
             d2.Km(this.E);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveTunaExplainPresenter.class, "16")) {
          return;
       }
       super.J8();
       this.Y8(true);
       this.a9();
       BaseLiveTunaExplainPresenter tw = this.w;
       if (tw != null) {
          a0 d2 = tw.D2;
          if (d2 != null) {
             d2.le(this.E);
          }
       }
       tw = this.v;
       if (tw != null) {
          a uoa = tw.u();
          if (uoa != null) {
             uoa.o(986, this.H);
          }
       }
       return;
    }
    public boolean S8(){
       return true;
    }
    public final TunaLiveExplainMessage V8(){
       Object obj = PatchProxy.apply(null, this, BaseLiveTunaExplainPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.get();
    }
    public abstract String W8();
    public void X8(TunaLiveExplainMessage p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(BaseLiveTunaExplainPresenter.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, BaseLiveTunaExplainPresenter.class, "9")) {
          return;
       }
       if (p0 != null && p1) {
          BaseLiveTunaExplainPresenter tv = this.v;
          LiveStreamFeedWrapper liveStreamFe = null;
          ClientContent$LiveStreamPackage liveStreamPa = (tv != null)? tv.a(): liveStreamFe;
          e0 uoe0 = x.k(this.v);
          if (uoe0 != null && liveStreamPa != null) {
             BaseLiveTunaExplainPresenter tv1 = this.v;
             if (tv1 != null) {
                LiveStreamFeedWrapper liveStreamFe1 = tv1.r5();
                if (liveStreamFe1 != null) {
                   liveStreamFe = liveStreamFe1.mEntity;
                }
             }
             if (!PatchProxy.applyVoidFourRefs(p0, liveStreamPa, liveStreamFe, uoe0, null, a.class, "10")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "BUSINESS_EXPLAIN_CARD_CLOSE_BUTTON";
                HashMap hashMap = new HashMap();
                a.a(hashMap, p0);
                d.a(-734569516).hb(hashMap, liveStreamFe);
                uElementPack.params = a.a.q(hashMap);
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
                tagPackage.params = TextUtils.I(p0.getMExtParams());
                uContentPack.tagPackage = tagPackage;
                ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                uClickEvent.contentPackage = uContentPack;
                uClickEvent.elementPackage = uElementPack;
                h oh = b.a(0x4b316083);
                if (oh != null) {
                   oh.B("3732373", uClickEvent, uoe0);
                }
             }
          }
       }
    label_00a8 :
       this.Y8(p2);
       return;
    }
    public final void Y8(boolean p0){
       BaseLiveTunaExplainPresenter uBaseLiveTun = BaseLiveTunaExplainPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveTun) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseLiveTun, "18")) {
          return;
       }
       this.A = false;
       uBaseLiveTun = this.z;
       if (uBaseLiveTun != null) {
          uBaseLiveTun.g9(this.J);
       }
       if (p0) {
          BaseLiveTunaExplainPresenter tF = this.F;
          if (tF != null) {
             tF.destroy();
          }
          this.F = null;
       }
       return;
    }
    public final void Z8(){
       LiveStreamFeedWrapper liveStreamFe1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveTunaExplainPresenter.class, "12")) {
          return;
       }
       if (this.G == null) {
          return;
       }
       this.G = false;
       BaseLiveTunaExplainPresenter tv = this.v;
       ClientContent$LiveStreamPackage liveStreamPa = (tv != null)? tv.a(): objArray;
       e0 uoe0 = x.k(this.v);
       TunaLiveExplainMessage tunaLiveExpl = this.V8();
       if (uoe0 != null && liveStreamPa != null) {
          BaseLiveTunaExplainPresenter tv1 = this.v;
          if (tv1 != null) {
             LiveStreamFeedWrapper liveStreamFe = tv1.r5();
             if (liveStreamFe != null) {
                liveStreamFe1 = liveStreamFe.mEntity;
             label_003b :
                if (!PatchProxy.applyVoidFourRefs(tunaLiveExpl, liveStreamPa, liveStreamFe1, uoe0, null, a.class, "8")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "LIVE_EXPLAIN_CARD";
                   HashMap hashMap = new HashMap();
                   a.a(hashMap, tunaLiveExpl);
                   d.a(-734569516).hb(hashMap, liveStreamFe1);
                   uElementPack.params = a.a.q(hashMap);
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
                   if (tunaLiveExpl != null) {
                      tagPackage.params = TextUtils.I(tunaLiveExpl.getMExtParams());
                   }
                   uContentPack.tagPackage = tagPackage;
                   ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                   showEvent.contentPackage = uContentPack;
                   showEvent.elementPackage = uElementPack;
                   h oh = b.a(0x4b316083);
                   if (oh != null) {
                      oh.W0("3732371", showEvent, uoe0);
                   }
                }
             }
          }
          liveStreamFe1 = objArray;
          goto label_003b ;
       }
    label_00a3 :
       tv = this.v;
       if (tv != null) {
          LiveStreamFeedWrapper liveStreamFe2 = tv.r5();
          if (liveStreamFe2 != null) {
             liveStreamFe2 = liveStreamFe2.mEntity;
          label_00b1 :
             if (liveStreamFe2 != null) {
                b uob = d.a(0x691527a8);
                tv = this.v;
                if (tv != null) {
                   liveStreamFe2 = tv.r5();
                   if (liveStreamFe2 != null) {
                      objArray = liveStreamFe2.mEntity;
                   }
                }
                uob.dT(objArray, 1, 0, 3, 1);
             }
             return;
          }
       }
       Object[] objArray1 = objArray;
       goto label_00b1 ;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, BaseLiveTunaExplainPresenter.class, "3")) {
          return;
       }
       while (!this.C.isEmpty()) {
          Integer integer = this.C.poll();
          int i = (integer != null)? integer.intValue(): 0;
          RxBus.f.b(new a(i, 1));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveTunaExplainPresenter.class, "14")) {
          return;
       }
       this.v = this.t8("LIVE_BASIC_CONTEXT");
       this.w = this.s8(a0.class);
       this.z = this.s8(c.class);
       this.x = this.t8("LIVE_SERVICE_MANAGER");
       this.y = this.t8("LIVE_ROUTER_SERVICE");
       return;
    }
}
