package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import w99.g;
import vl8.c;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$b;
import nsd.u;
import com.yxcorp.gifshow.autoplay.live.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Set;
import com.google.common.collect.o;
import java.util.Objects;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import tl8.d;
import java.lang.Long;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$i;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$h;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$e;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$g;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$d;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$f;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$c;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import z99.c;
import t99.y;
import java.lang.Integer;
import u99.e;
import com.kwai.robust.PatchProxyResult;
import tj3.e;
import tj3.d;
import java.lang.System;
import wkd.b;
import rj3.c;
import rj3.a$a;
import com.kwai.video.waynelive.LivePlayerController;
import rj3.a;
import java.lang.StringBuilder;
import u99.d;
import java.util.HashMap;
import t99.w;
import t99.w$a;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import t99.z;
import java.lang.Number;
import t99.e;
import com.kwai.video.waynelive.LiveRestartReason;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.playeradapter.response.LiveStreamStatusResponse;
import crd.b;
import lnc.b9;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import t99.t;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import tj3.i;
import tj3.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import u99.e$a;
import k2b.u1;
import tj3.r;
import oj3.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t99.v;
import erd.o;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$startLoopQueryLiveStatus$2;
import t99.u;
import msd.l;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$a;
import erd.g;
import com.kuaishou.android.live.model.LiveStreamModel;
import hj3.c;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$queryLiveStatus$1;
import java.lang.Boolean;
import da6.c;
import yp.f;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.UUID;
import com.kuaishou.android.live.model.Race;
import com.kwai.video.waynelive.LivePlayerParam$Builder;
import uj3.b;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import com.kwai.video.waynelive.LivePlayerParam;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import hj3.d;
import sj3.j;
import sj3.m;
import t99.q;
import sj3.b;
import pj3.b;
import lj3.b;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import t99.r;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$a;
import t99.s;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$b;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$j;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$k;
import com.yxcorp.gifshow.autoplay.live.LiveStopReason;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import u99.a;
import com.yxcorp.gifshow.action.c;
import xf6.i;

public final class LiveAutoPlayModule extends c implements g	// class@001c0b
{
    public b A;
    public long B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public int G;
    public int H;
    public boolean I;
    public final int J;
    public e K;
    public b L;
    public final b M;
    public final IMediaPlayer$OnVideoSizeChangedListener N;
    public final LivePlayerTypeChangeListener O;
    public final IKwaiMediaPlayer$OnLiveSeiInfoListener P;
    public final LivePlayerStateChangeListener Q;
    public final LivePlayerErrorListener R;
    public LivePlayerBufferListener S;
    public LivePlayTextureView c;
    public final e d;
    public final Set e;
    public boolean f;
    public String g;
    public boolean h;
    public String i;
    public boolean j;
    public LivePlayerController k;
    public b l;
    public b m;
    public j n;
    public QLivePlayConfig o;
    public AutoLivePlayPhoneCallStateManager p;
    public BaseFragment q;
    public z r;
    public LiveStreamFeed s;
    public LiveStreamFeedWrapper t;
    public long u;
    public long v;
    public b w;
    public final long x;
    public final String y;
    public final int z;
    public static final LiveAutoPlayModule$b T;

    static {
       LiveAutoPlayModule.T = new LiveAutoPlayModule$b(null);
    }
    public void LiveAutoPlayModule(e p0){
       e a;
       a.p(p0, "liveAutoPlayParam");
       super();
       this.d = p0;
       Set set = o.g();
       a.o(set, "Sets.newConcurrentHashSet\(\)");
       this.e = set;
       this.q = p0.b;
       this.r = p0.F;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.kuaishou.android.model.feed.LiveStreamFeed");
       this.s = a;
       this.t = new LiveStreamFeedWrapper(p0.a);
       this.v = p0.y;
       this.x = p0.n;
       a = p0.m;
       a.o(a, "liveAutoPlayParam.mQueryLiveStatusBizType");
       this.y = a;
       this.z = p0.x;
       this.I = true;
       this.J = p0.e;
       QLivePlayConfig qLivePlayCon = this.s.a(QLivePlayConfig.class);
       this.o = qLivePlayCon;
       Long longx = (qLivePlayCon != null)? Long.valueOf(qLivePlayCon.mWatchingCount): null;
       if (longx != null) {
          this.F = longx.longValue();
       }
       p0 = p0.r;
       if (p0 != null) {
          this.i = p0;
       }
       this.M = new LiveAutoPlayModule$i(this);
       this.N = new LiveAutoPlayModule$h(this);
       this.O = new LiveAutoPlayModule$e(this);
       this.P = new LiveAutoPlayModule$g(this);
       this.Q = new LiveAutoPlayModule$d(this);
       this.R = new LiveAutoPlayModule$f(this);
       this.S = new LiveAutoPlayModule$c(this);
       return;
    }
    public final void N(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "15")) {
          return;
       }
       c.a(this.R(), String.valueOf(this.hashCode()), r1.t1(this.s));
       return;
    }
    public final void O(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule.class, "19")) {
          return;
       }
       a.p(p0, "onLiveRenderListener");
       this.e.add(p0);
       return;
    }
    public final void P(int p0){
       Integer integer;
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       if (PatchProxy.isSupport(liveAutoPlay) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveAutoPlay, "39")) {
          return;
       }
       this.n0();
       LiveAutoPlayModule tk = this.k;
       if (tk != null) {
          this.j = true;
          this.I = false;
          LiveAutoPlayModule tK = this.K;
          if (tK != null) {
             e uoe = PatchProxy.apply(null, tK, e.class, "1");
             if (uoe != PatchProxyResult.class) {
             }else {
                uoe = tK.f;
                if (uoe == null) {
                   a.S("liveLogReporter");
                }
             }
             if (uoe != null) {
                d uod = uoe.b();
                if (uod != null) {
                   integer = Integer.valueOf(uod.r);
                label_004f :
                   int i = (integer != null)? integer.intValue(): 0;
                   long l = System.currentTimeMillis();
                   a$a uoa = new a$a(tk);
                   uoa.b(i);
                   uoa.c(p0);
                   uoa.e(l);
                   b.a(0x59ca4ae1).b(this.i, uoa.a());
                   d.d("LiveAutoPlayModule", "[LiveReuse]cacheLivePlayerController, reuse key: "+this.i+", reuse type: "+p0+", timestamp: "+l);
                   if (!PatchProxy.applyVoid(null, this, liveAutoPlay, "58")) {
                      d.h("LiveAutoPlayModule", "onPlayerCached", this.Q());
                      w.a.a(false, this.s);
                      Iterator iterator = this.e.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().onPlayerCached();
                      }
                   }
                }
             }
          }
       label_004e :
          integer = null;
          goto label_004f ;
       }
       return;
    }
    public final HashMap Q(){
       HashMap obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("playModuleHash", String.valueOf(this.hashCode()));
       obj.put("feedId", r1.t1(this.d.a));
       obj.put("userName", r1.V1(this.d.a));
       obj.put("isPlaying", String.valueOf(this.isPlaying())+", "+String.valueOf(this.isPreparing())+", "+String.valueOf(this.isBuffering()));
       return obj;
    }
    public final String R(){
       Object[] objArray = null;
       LiveAutoPlayModule obj = PatchProxy.apply(objArray, this, LiveAutoPlayModule.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj != null) {
          String str = obj.o();
          if (str != null) {
             objArray = str;
          }else {
          label_001c :
             obj = this.r;
             if (obj != null) {
                objArray = obj.a;
             }
          }
       }else {
          goto label_001c ;
       }
       if (objArray == null) {
          objArray = "";
       }
       return objArray;
    }
    public final long S(){
       LiveAutoPlayModule obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.x;
       if (obj <= 0) {
          long l = e.a();
       }
       return obj;
    }
    public final LiveRestartReason T(){
       LiveRestartReason obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (a.t().u("SOURCE_LIVE").d("enableRefreshUrlUseNewProviderV2", false))? LiveRestartReason.ANCHOR_FALL_BACK: LiveRestartReason.DEFAULT;
       return obj;
    }
    public final boolean U(){
       return this.D;
    }
    public final void V(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "63")) {
          return;
       }
       d.h("LiveAutoPlayModule", "onAnchorEndLive", this.Q());
       this.f0(true);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAnchorEndLive();
       }
       return;
    }
    public final void W(int p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveAutoPlayModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, LiveAutoPlayModule.class, "53")) {
          return;
       }
       HashMap hashMap = this.Q();
       hashMap.put("width", String.valueOf(p0));
       hashMap.put("height", String.valueOf(p1));
       hashMap.put("type", String.valueOf(p2));
       d.h("LiveAutoPlayModule", "notifyLivePlayerTypeChangeListener", hashMap);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p2);
       }
       return;
    }
    public final void X(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "62")) {
          return;
       }
       d.h("LiveAutoPlayModule", "onRenderStop", this.Q());
       w.a.a(false, this.s);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().onRenderStop();
       }
       return;
    }
    public final void Y(int p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveAutoPlayModule.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, LiveAutoPlayModule.class, "54")) {
          return;
       }
       HashMap hashMap = this.Q();
       hashMap.put("width", String.valueOf(p0));
       hashMap.put("height", String.valueOf(p1));
       hashMap.put("type", String.valueOf(p2));
       d.h("LiveAutoPlayModule", "notifyVideoSizeChangeWithType", hashMap);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().onVideoSizeChangedWithType(p0, p1, p2);
       }
       return;
    }
    public final void Z(LiveStreamStatusResponse p0){
       LiveAutoPlayModule tK;
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveAutoPlay, "11")) {
          return;
       }
       p0 = p0.mLiveStatus;
       int i = 1;
       if (p0 != i) {
          if (p0 != 3) {
             tK = this.K;
             if (tK != null) {
                tK.b(i);
             }
          }else {
             tK = this.K;
             if (tK != null) {
                tK.b(i);
             }
             tK = this.k;
             if (tK != null) {
                tK.restartPlay(this.T());
             }
          }
       }else {
          tK = this.K;
          if (tK != null) {
             tK.b(2);
          }
          if (!PatchProxy.applyVoid(null, this, liveAutoPlay, "10")) {
             this.V();
             liveAutoPlay = this.k;
             if (liveAutoPlay != null && !liveAutoPlay.isStop()) {
                liveAutoPlay = this.k;
                if (liveAutoPlay != null) {
                   liveAutoPlay.stopPlay();
                }
                this.d0();
             }
          }
          b9.a(this.w);
          this.w = null;
       }
       return;
    }
    public final void a0(){
       LiveAutoPlayModule k;
       ClientEvent$UrlPackage urlPackage1;
       e d;
       e a;
       Object obj = this;
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, liveAutoPlay, "6")) {
          return;
       }
       d.h("LiveAutoPlayModule", "prepareStartPlay", this.Q());
       obj.f0(false);
       if (!PatchProxy.applyVoid(objArray, obj, liveAutoPlay, "21")) {
          k = obj.k;
          if (k != null) {
             k.addOnVideoSizeChangedListener(obj.N);
          }
          k = obj.k;
          if (k != null) {
             k.addLivePlayerTypeChangeListener(obj.O);
          }
          k = obj.k;
          if (k != null) {
             k.addLiveSeiListener(obj.P);
          }
          k = obj.k;
          if (k != null) {
             k.addRenderListener(new t(obj));
          }
          k = obj.k;
          if (k != null) {
             k.addStateChangeListener(obj.Q);
          }
          k = obj.k;
          if (k != null) {
             k.addLivePlayerErrorListener(obj.R);
          }
          k = obj.k;
          if (k != null) {
             k.addBufferListener(obj.S);
          }
       }
       k = obj.K;
       if (k != null) {
          LiveAutoPlayModule k1 = obj.k;
          a.m(k1);
          LiveAutoPlayModule f = obj.F;
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(k1, Long.valueOf(f), k, uoe, "4")) {
             a.p(k1, "playerController");
             e f1 = k.f;
             if (f1 == null) {
                a.S("liveLogReporter");
             }
             i oi = f1.h();
             a.o(oi, "liveLogReporter.bizStatistics");
             e f2 = k.f;
             if (f2 == null) {
                a.S("liveLogReporter");
             }
             k ok = f2.x();
             a.o(ok, "liveLogReporter.qualityStatistics");
             oi.y(f);
             e f3 = k.f;
             if (f3 == null) {
                a.S("liveLogReporter");
             }
             f3.k();
             k.e = System.currentTimeMillis();
             f3 = k.f;
             if (f3 == null) {
                a.S("liveLogReporter");
             }
             f3.f();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             ClientEvent$UrlPackage urlPackage = PatchProxy.apply(objArray, k, uoe, "11");
             if (urlPackage != patchProxyRe) {
             }else {
                uoe = k.a;
                String str = "mFeed";
                if (uoe == null) {
                   a.S(str);
                }
                String str1 = r1.I1(uoe);
                a = k.a;
                if (a == null) {
                   a.S(str);
                }
                String str2 = d.a(a, k.g, "", k.j, k.i, false, false, str1, null);
                e b = k.b;
                if (b != null) {
                   urlPackage = d.b(b, str2);
                }else {
                   b = k.c;
                   if (b != null) {
                      e$a k2 = e.k;
                      Objects.requireNonNull(k2);
                      urlPackage1 = PatchProxy.applyTwoRefs(b, str2, k2, e$a.class, "1");
                      if (urlPackage1 != patchProxyRe) {
                      }else {
                         urlPackage1 = new ClientEvent$UrlPackage();
                         urlPackage1.category = b.b;
                         urlPackage1.page = b.c;
                         urlPackage1.page2 = b.a;
                         urlPackage1.subPages = b.d;
                         urlPackage1.params = str2;
                      }
                      urlPackage = urlPackage1;
                   }else {
                      urlPackage = null;
                   }
                }
             }
             ok.t0(f);
             ok.A0(urlPackage);
             oi.H(urlPackage);
             urlPackage1 = u1.p();
             if (urlPackage1 == null) {
                urlPackage1 = u1.k();
             }
             ok.w0(urlPackage1);
             oi.C(urlPackage1);
             ok.q0("");
             ok.z0(System.currentTimeMillis());
             oi.t("");
             d = k.d;
             if (d == null) {
                a.S("mAutoPlayParam");
             }
             oi.s(d.u);
             d = k.d;
             if (d == null) {
                a.S("mAutoPlayParam");
             }
             ok.p0(d.u);
             if (k1.isPlaying()) {
                d = k.f;
                if (d == null) {
                   a.S("liveLogReporter");
                }
                d.x().g0();
             }
          }
       }
       if (!PatchProxy.applyVoid(null, obj, liveAutoPlay, "7")) {
          if (a.a()) {
             d.h("LiveAutoPlayModule", "enableQueryLiveStatusOnBufferStart, return", this.Q());
          }else {
             d.h("LiveAutoPlayModule", "startLoopQueryLiveStatus", this.Q());
             b9.a(obj.w);
             if (obj.s.mLiveStreamModel != null) {
                obj.w = t.interval(this.S(), TimeUnit.MILLISECONDS).flatMap(new v(obj)).subscribe(new u(new LiveAutoPlayModule$startLoopQueryLiveStatus$2(obj)), new LiveAutoPlayModule$a(obj));
             }
          }
       }
       this.N();
       return;
    }
    public final void b0(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "9")) {
          return;
       }
       String str = "LiveAutoPlayModule";
       if (!a.a()) {
          d.h(str, "queryLiveStatus, disEnableQueryLiveStatusOnBufferStart, return", this.Q());
          return;
       }else if((System.currentTimeMillis() - this.B) - this.S() < 0){
          return;
       }else {
          d.h(str, "queryLiveStatus", this.Q());
          b9.a(this.A);
          if (this.s.mLiveStreamModel == null) {
             return;
          }
          this.B = System.currentTimeMillis();
          this.A = c.b(this.s.mLiveStreamModel.mLiveStreamId, this.y, String.valueOf(this.d.u)).subscribe(new u(new LiveAutoPlayModule$queryLiveStatus$1(this)), new LiveAutoPlayModule$a(this));
          return;
       }
    }
    public final void d0(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "16")) {
          return;
       }
       c.h(this.R(), String.valueOf(this.hashCode()), r1.t1(this.s));
       return;
    }
    public final void e0(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule.class, "20")) {
          return;
       }
       if (p0 != null) {
          this.e.remove(p0);
       }
       return;
    }
    public final void f0(boolean p0){
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       if (PatchProxy.isSupport(liveAutoPlay) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAutoPlay, "18")) {
          return;
       }
       this.C = p0;
       r1.K4(this.s, p0);
       w$a a = w.a;
       LiveAutoPlayModule ts = this.s;
       Objects.requireNonNull(a);
       w$a uoa = w$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), ts, a, uoa, "11")) {
          a.p(ts, "feed");
          v0 = ts instanceof LiveStreamFeed;
          c uoc = (!a)? null: ts;
          f extra = (uoc != null)? uoc.getExtra("AUTO_PLAY_PARAMS"): null;
          if (extra == null) {
             extra = new f();
             if (!a) {
                ts = null;
             }
             if (ts != null) {
                ts.putExtra("AUTO_PLAY_PARAMS", extra);
             }
          }
          extra.b = p0;
       }
       return;
    }
    public final void g0(boolean p0){
       this.D = p0;
    }
    public long getDuration(){
       return 0;
    }
    public String getPhotoId(){
       String obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t.getPhotoId();
       a.o(obj, "mQPhoto.photoId");
       return obj;
    }
    public final void h0(LivePlayTextureView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule.class, "1")) {
          return;
       }
       a.p(p0, "textureView");
       this.c = p0;
       return;
    }
    public final boolean i0(){
       LiveAutoPlayModule obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!TextUtils.x(this.i)) {
          obj = this.k;
          if (obj != null && obj.isPlaying() == b) {
          label_0029 :
             return b;
          }
       }
       b = false;
       goto label_0029 ;
    }
    public boolean isBuffering(){
       LiveAutoPlayModule obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = true;
       if (obj == null || obj.isBuffering() != b) {
          b = false;
       }
       return b;
    }
    public boolean isPlaying(){
       LiveAutoPlayModule obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = true;
       if (obj == null || obj.isPlaying() != b) {
          b = false;
       }
       return b;
    }
    public boolean isPreparing(){
       LiveAutoPlayModule obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = true;
       if (obj == null || obj.isPreparing() != b) {
          b = false;
       }
       return b;
    }
    public String k(){
       Object obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "feed id : "+this.t.getPhotoId()+"\nuserName : "+this.t.getUserName();
    }
    public final void k0(boolean p0,a p1){
       LiveAutoPlayModule k;
       LiveAutoPlayModule h;
       LiveAutoPlayModule k2;
       LiveAutoPlayModule q;
       LivePlayerController livePlayerCo1;
       long l = this;
       Object obj = p1;
       if (PatchProxy.isSupport(LiveAutoPlayModule.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), obj, l, LiveAutoPlayModule.class, "34")) {
          return;
       }
       l.u = System.currentTimeMillis();
       boolean b = false;
       l.j = b;
       int i = (obj != null)? p1.c(): 0;
       d.h("LiveAutoPlayModule", "startPlay reuseType="+i, this.Q());
       if (l.k == null) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.isSupport(LiveAutoPlayModule.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), obj, l, LiveAutoPlayModule.class, "2")) {
             d.h("LiveAutoPlayModule", "initPlayer", this.Q());
             if (TextUtils.x(l.g)) {
                l.g = UUID.randomUUID().toString();
             }
             if (r1.t2(l.s)) {
                l.k = null;
             }else {
                l.I = true;
                String str = "mTextureView";
                if (obj != null && p1.a() != null) {
                   LivePlayerController livePlayerCo = p1.a();
                   l.k = livePlayerCo;
                   if (livePlayerCo != null) {
                      h = l.c;
                      if (h == null) {
                         a.S(str);
                      }
                      livePlayerCo.setTextureView(h, b, true);
                   }
                   k = l.k;
                   if (k != null) {
                      k.clearAllListener();
                   }
                   k = l.k;
                   if (k != null) {
                      k.unMute();
                   }
                   k = l.o;
                   if (k != null) {
                      QLivePlayConfig mRace = k.mRace;
                      if (mRace != null) {
                         mRace.clearState();
                      }
                   }
                }else {
                   q = l.c;
                   if (q == null) {
                      a.S(str);
                   }
                   e k3 = l.d.k;
                   if (PatchProxy.isSupport(LiveAutoPlayModule.class)) {
                      livePlayerCo1 = PatchProxy.applyThreeRefs(q, Boolean.valueOf(p0), Boolean.valueOf(k3), this, LiveAutoPlayModule.class, "3");
                      if (livePlayerCo1 != patchProxyRe) {
                      label_0165 :
                         l.k = livePlayerCo1;
                      }
                   }
                   LivePlayerParam$Builder uBuilder = new LivePlayerParam$Builder();
                   k2 = l.o;
                   String liveStreamId = (k2 != null)? k2.getLiveStreamId(): null;
                   uBuilder = uBuilder.liveStreamId(liveStreamId);
                   k2 = l.o;
                   boolean b1 = (k2 != null && k2.mIsCdnOverload == true)? true: false;
                   livePlayerCo1 = d.b(q, b.a(l.o), uBuilder.isCdnOverload(b1).shouldUseHardwareDecoding(b.e(l.o)).qosMonitorConfig(b.b()).enableReusePlayerOptimize(p0).setAnchorId(r1.U1(l.s)).forceUseLowestQuality(k3).setBizFt(l.d.D).setBizType(String.valueOf(l.d.C)).setBizExtra(l.d.E).build(), l.d.C);
                   a.o(livePlayerCo1, "LivePlayerFactory.create¡­aram.mPlayerBizType\n    \)");
                   goto label_0165 ;
                }
                e l1 = l.d.l;
                if (l1 > null) {
                   k2 = l.k;
                   if (k2 != null) {
                      k2.setPriorLowQuality(l1);
                   }
                }
                k = l.k;
                if (k != null) {
                   k.setEnableAutoUpdateViewSize(l.d.s);
                }
                j oj = new j(l.s, "");
                l.n = oj;
                q oq = PatchProxy.apply(null, l, LiveAutoPlayModule.class, "14");
                if (oq != patchProxyRe) {
                }else {
                   oq = new q(l);
                }
                oj.d(oq);
                k = l.n;
                if (k != null) {
                   k.b(l.M);
                }
                l.m = new b(l.s, l.k);
                l.l = new b(l.k, l.d.d);
                k = l.k;
                if (k != null) {
                   k2 = l.n;
                   LiveDataSourceFetcher liveDataSour = (k2 != null)? k2.a(): null;
                   k.setLiveDataSourceFetcher(liveDataSour);
                }
                e uoe = new e();
                l.K = uoe;
                q = l.q;
                LiveAutoPlayModule r = l.r;
                k = l.s;
                k2 = l.k;
                a.m(k2);
                h = l.g;
                a.m(h);
                int i1 = (obj != null)? p1.c(): 0;
                int i2 = (obj == null)? 0: p1.b() + 1;
                uoe.a(q, r, k, k2, h, i1, i2, l.d);
                if (!PatchProxy.applyVoid(null, l, LiveAutoPlayModule.class, "22") && l.p == null) {
                   c uoc = a.a();
                   a.o(uoc, "AppEnv.get\(\)");
                   AutoLivePlayPhoneCallStateManager uAutoLivePla = new AutoLivePlayPhoneCallStateManager(uoc.a());
                   l.p = uAutoLivePla;
                   uAutoLivePla.b(new r(l));
                   k = l.p;
                   if (k != null) {
                      k.c(new s(l));
                   }
                   k = l.p;
                   if (k != null) {
                      k.a();
                   }
                }
             label_0247 :
                if (obj != null) {
                   k = l.k;
                   if (k != null && k.isPlaying() == true) {
                      this.a0();
                   }
                }
             }
          }
       }
    label_0256 :
       k = l.k;
       if (k != null && !k.isPlaying()) {
          if (!PatchProxy.isSupport(LiveAutoPlayModule.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, l, LiveAutoPlayModule.class, "35")) {
             d.h("LiveAutoPlayModule", "start mute= false", this.Q());
             k = l.k;
             if (k != null) {
                k.unMute();
             }
             this.a0();
             k = l.G;
             if (k > null) {
                h = l.H;
                if (h > null) {
                   LiveAutoPlayModule k1 = l.k;
                   if (k1 != null) {
                      k1.setViewPixelSize(k, h);
                   }
                }
             }
             k = l.k;
             if (k != null) {
                k.startPlay();
             }
             h = l.v;
             if ((float)h > 0) {
                l.l0(h);
             }
          }
       }else if(PatchProxy.applyVoid(null, l, LiveAutoPlayModule.class, "60")){
          d.h("LiveAutoPlayModule", "onCachedPlayerResumePlay", this.Q());
          w.a.a(true, l.s);
          Iterator iterator = l.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().onCachedPlayerResumePlay();
          }
       }
       h = l.v;
       if ((float)h > 0) {
          l.l0(h);
       }
    label_02df :
       if (l.d.B != null) {
          k = l.k;
          if (k != null) {
             k.startCache();
          }
       }
       return;
    }
    public final void l0(long p0){
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       if (PatchProxy.isSupport(liveAutoPlay) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveAutoPlay, "4")) {
          return;
       }
       this.n0();
       d.h("LiveAutoPlayModule", "startTimer", this.Q());
       this.L = t.timer(p0, TimeUnit.SECONDS).observeOn(a.c()).subscribe(new LiveAutoPlayModule$j(this), LiveAutoPlayModule$k.b);
       return;
    }
    public long m(){
       return 0;
    }
    public final void m0(LiveStopReason p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule.class, "37")) {
          return;
       }
       a.p(p0, "reason");
       String str = "LiveAutoPlayModule";
       d.h(str, "stopPlay type="+p0, this.Q());
       LiveAutoPlayModule tk = this.k;
       String str1 = 1;
       if (tk == null || tk.isPlaying() != str1) {
          tk = this.k;
          if (tk == null || tk.isPreparing() != str1) {
          label_00ec :
             if (this.j == null) {
                this.X();
             }
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, LiveAutoPlayModule.class, "48")) {
                d.h(str, "destroy", this.Q());
                tk = this.k;
                if (tk != null) {
                   tk.removeStateChangeListener(this.Q);
                }
                tk = this.k;
                if (tk != null) {
                   tk.removeOnVideoSizeChangedListener(this.N);
                }
                tk = this.k;
                if (tk != null) {
                   tk.removeLivePlayerErrorListener(this.R);
                }
                tk = this.k;
                if (tk != null) {
                   tk.removeLivePlayerTypeChangeListener(this.O);
                }
                tk = this.k;
                if (tk != null) {
                   tk.removeLiveSeiListener(this.P);
                }
                tk = this.k;
                if (tk != null) {
                   tk.removeBufferListener(this.S);
                }
                tk = this.n;
                if (tk != null) {
                   tk.destroy();
                }
                tk = this.l;
                if (tk != null) {
                   tk.a();
                }
                tk = this.m;
                if (tk != null) {
                   tk.a();
                }
                if (this.I != null) {
                   tk = this.k;
                   if (tk != null) {
                      tk.destroy();
                   }
                   this.d0();
                }
                tk = this.K;
                if (tk != null && !PatchProxy.applyVoid(objArray, tk, uoe, "10")) {
                   uoe = tk.f;
                   if (uoe == null) {
                      a.S("liveLogReporter");
                   }
                   uoe.destroy();
                }
                if (!PatchProxy.applyVoid(objArray, this, LiveAutoPlayModule.class, "23")) {
                   LiveAutoPlayModule tp = this.p;
                   if (tp != null) {
                      tp.d();
                   }
                   tp = this.p;
                   if (tp != null) {
                      tp.b(objArray);
                   }
                   this.p = objArray;
                }
                this.k = objArray;
                b9.a(this.A);
             }
             return;
          }
       }
       if (this.I != null) {
          tk = this.k;
          if (tk != null) {
             tk.mute();
          }
          tk = this.k;
          if (tk != null && !tk.isStop()) {
             tk = this.k;
             if (tk != null) {
                tk.stopPlay();
             }
             this.d0();
          }
       }
    label_0062 :
       tk = this.K;
       if (tk != null) {
          int i = p0.ofReason();
          LiveAutoPlayModule tF = this.F;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Long.valueOf(tF), tk, uoe, "9")) {
             e f = tk.f;
             if (f == null) {
                a.S("liveLogReporter");
             }
             i oi = f.h();
             oi.n(str1);
             oi.G(i);
             RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
             if (tk.e - null) {
                long l = System.currentTimeMillis() - tk.e;
                e f1 = tk.f;
                if (f1 == null) {
                   a.S("liveLogReporter");
                }
                k ok = f1.x();
                a.o(ok, "liveLogReporter.qualityStatistics");
                l = l - ok.K();
                uExtParams.mActualPlayDuration = l;
                f1 = tk.d;
                if (f1 == null) {
                   a.S("mAutoPlayParam");
                }
                a.b(f1.x, l, str1);
             }
             int i1 = 13;
             f = tk.a;
             if (f == null) {
                a.S("mFeed");
             }
             c.b(i1, f, uExtParams);
             tk.c(tF);
             e f2 = tk.f;
             if (f2 == null) {
                a.S("liveLogReporter");
             }
             f2.j();
          }
       }
       b9.a(this.w);
       goto label_00ec ;
    }
    public void mute(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "31")) {
          return;
       }
       d.h("LiveAutoPlayModule", "mute", this.Q());
       this.f = true;
       if (!i.c("KEY_AUTO_PLAY_UNMUTE")) {
          LiveAutoPlayModule tk = this.k;
          if (tk != null) {
             tk.mute();
          }
       }
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "5")) {
          return;
       }
       if (this.v - null <= 0) {
          return;
       }
       d.h("LiveAutoPlayModule", "stopTimer", this.Q());
       b9.a(this.L);
       return;
    }
    public void pause(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule.class, "25")) {
          return;
       }
       a.p(p0, "type");
       d.h("LiveAutoPlayModule", "pause type="+p0, this.Q());
       this.n0();
       this.m0(LiveStopReason.SLIDE_AWAY);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "30")) {
          return;
       }
       d.h("LiveAutoPlayModule", "release", this.Q());
       this.m0(LiveStopReason.SLIDE_AWAY);
       return;
    }
    public void resume(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule.class, "24")) {
          return;
       }
       a.p(p0, "type");
       d.h("LiveAutoPlayModule", "resume type="+p0, this.Q());
       this.startPlay();
       if (this.f != null) {
          this.mute();
       }
       return;
    }
    public void seekTo(long p0){
    }
    public void startPlay(){
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAutoPlay, "33")) {
          return;
       }
       if (!TextUtils.x(this.i)) {
          c uoc = b.a(0x59ca4ae1);
          a uoa = uoc.e(this.i);
          if (uoa != null && uoa.a() != null) {
             d.d("LiveAutoPlayModule", "[LiveReuse]retrieveValidPlayer, reuse key: "+this.i+", reuse type: "+uoa.c()+", timestamp: "+uoa.e());
             uoc.c(this.i);
             LivePlayerController livePlayerCo = uoa.a();
             a.o(livePlayerCo, "cacheRecord.cachedPlayer");
             this.h = true;
             this.k0(true, uoa);
             if (livePlayerCo != null) {
                this.Y(livePlayerCo.getVideoWidth(), livePlayerCo.getVideoHeight(), livePlayerCo.getCurrentLiveStreamType());
                this.W(livePlayerCo.getVideoWidth(), livePlayerCo.getVideoHeight(), livePlayerCo.getCurrentLiveStreamType());
             }
             if (!PatchProxy.applyVoid(objArray, this, liveAutoPlay, "59")) {
                d.h("LiveAutoPlayModule", "onPlayerRetrieved", this.Q());
                w.a.a(true, this.s);
                Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onPlayerRetrieved();
                }
             }
             return;
          }
       }
       this.h = false;
       this.k0((TextUtils.x(this.i) ^ true), objArray);
       return;
    }
    public void stopPlay(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule.class, "36")) {
          return;
       }
       a.p(p0, "type");
       if (a.g(p0, "float_window_show")) {
          this.m0(LiveStopReason.FLOAT_WINDOW_SHOW);
       }else {
          this.m0(LiveStopReason.SLIDE_AWAY);
       }
       return;
    }
    public boolean t(){
       LiveAutoPlayModule obj = PatchProxy.apply(null, this, LiveAutoPlayModule.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = true;
       if (obj == null || obj.isPlaying() != b) {
          obj = this.k;
          if (obj == null || obj.isPreparing() != b) {
             b = false;
          }
       }
       return b;
    }
    public void unMute(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayModule.class, "32")) {
          return;
       }
       d.h("LiveAutoPlayModule", "unMute", this.Q());
       this.f = false;
       LiveAutoPlayModule tk = this.k;
       if (tk != null) {
          tk.unMute();
       }
       return;
    }
}
