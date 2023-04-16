package com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter;
import im8.g;
import c12.f;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter$a;
import nsd.u;
import aq3.l;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import aq3.p;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import tj3.e;
import java.lang.Boolean;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;
import mq5.b;
import tj3.k;
import bq3.b;
import bq3.a;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter$onLiveBind$1;
import aq3.m;
import msd.l;
import erd.g;
import t45.d;
import brd.z;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter$b;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter$c;
import crd.b;

public final class LiveAudienceTunaRequestPresenter extends f implements g	// class@000fd2
{
    public final l K;
    public m L;
    public LiveStreamFeed M;
    public e N;
    public final List O;
    public static final LiveAudienceTunaRequestPresenter$a P;
    public static String sLivePresenterClassName;

    static {
       LiveAudienceTunaRequestPresenter.P = new LiveAudienceTunaRequestPresenter$a(null);
    }
    public void LiveAudienceTunaRequestPresenter(){
       super();
       this.K = new l();
       this.O = KsgLogTunaLiveTag.BOTTOM_ICON.appendTag("pre request");
    }
    public final l a9(){
       return this.K;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceTunaRequestPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceTunaRequestPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceTunaRequestPresenter.class, new p());
       }else {
          obj.put(LiveAudienceTunaRequestPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTunaRequestPresenter.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.L = obj;
       this.M = this.s8(LiveStreamFeed.class);
       this.N = this.t8("LIVE_LOG_REPORTER");
       return;
    }
    public void x(boolean p0){
       LiveAudienceTunaRequestPresenter liveAudience = LiveAudienceTunaRequestPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "2")) {
          return;
       }
       LiveAudienceTunaRequestPresenter tM = this.M;
       if (tM != null) {
          LiveStreamFeed mTypeViewLis = tM.mTypeViewList;
          if (mTypeViewLis != null && ArraysKt___ArraysKt.P7(mTypeViewLis, Integer.valueOf(40)) == true) {
             f tz = this.z;
             if (tz != null && !tz.U0()) {
                tM = this.N;
                if (tM != null) {
                   k ok = tM.x();
                   if (ok != null) {
                      ok.X("TunaPreRequestStarted");
                   }
                }
                b uob = a.a();
                liveAudience = this.L;
                if (liveAudience == null) {
                   a.S("mLiveBasicContext");
                }
                uob.d(liveAudience.getLiveStreamId()).map(new e()).doOnSubscribe(new m(new LiveAudienceTunaRequestPresenter$onLiveBind$1(this))).subscribeOn(d.b).observeOn(d.a).subscribe(new LiveAudienceTunaRequestPresenter$b(this), new LiveAudienceTunaRequestPresenter$c(this));
             }
          }
       }
       return;
    }
}
