package com.yxcorp.gifshow.autoplay.live.c;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import t99.h;
import t99.j;
import t99.g;
import com.yxcorp.gifshow.autoplay.live.c$a;
import t99.i;
import com.yxcorp.gifshow.autoplay.live.c$b;
import com.yxcorp.gifshow.autoplay.live.c$c;
import com.yxcorp.gifshow.autoplay.live.e;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import rj3.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import java.lang.Object;
import tl8.d;
import java.util.HashMap;
import com.kwai.video.waynelive.LivePlayerController;
import u99.d;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kuaishou.android.live.model.Race;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.video.waynelive.LivePlayerParam$Builder;
import uj3.b;
import com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.video.waynelive.LivePlayerParam;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import hj3.d;
import sj3.j;
import sj3.m;
import t99.f;
import sj3.l;
import sj3.b;
import pj3.b;
import lj3.b;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher;
import tj3.d$a;
import da6.c;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.framework.model.user.User;
import tj3.d;
import com.kuaishou.live.playeradapter.statistics.b;
import tj3.b;
import tj3.a;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import t99.k;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$a;
import t99.l;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$b;
import com.yxcorp.gifshow.autoplay.live.c$d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.kwai.video.player.IMediaPlayer;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$d;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$c;
import com.kwai.video.waynelive.LivePlayerState;
import java.util.List;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$LiveAutoPlayerState;
import com.yxcorp.gifshow.autoplay.live.c$e;
import java.lang.Enum;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kuaishou.live.playeradapter.response.LiveStreamStatusResponse;
import java.util.Objects;
import tj3.e;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import crd.b;
import lnc.b9;
import com.kwai.video.waynelive.LiveRestartReason;
import java.lang.Throwable;
import lc5.b;
import hj3.c;
import zb6.a;
import com.yxcorp.gifshow.exception.ServerException;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t99.e;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.yxcorp.gifshow.autoplay.live.d;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import tj3.i;
import tj3.k;
import java.lang.System;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import tj3.r;
import oj3.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t99.o;
import erd.o;
import t99.m;
import t99.n;
import erd.g;
import com.kuaishou.android.live.model.LiveStreamModel;
import z99.c;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$e;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.c;

public class c extends LiveAutoPlay	// class@001c15
{
    public boolean A;
    public boolean B;
    public Map C;
    public b D;
    public long E;
    public LivePlayerTypeChangeListener F;
    public boolean G;
    public int H;
    public int I;
    public final IMediaPlayer$OnVideoSizeChangedListener J;
    public final LivePlayerTypeChangeListener K;
    public final IKwaiMediaPlayer$OnLiveSeiInfoListener L;
    public final b M;
    public LivePlayerStateChangeListener N;
    public LivePlayerErrorListener O;
    public final LivePlayerBufferListener P;
    public int h;
    public LivePlayerController i;
    public e j;
    public b k;
    public b l;
    public l m;
    public LiveStreamFeed n;
    public QLivePlayConfig o;
    public AutoLivePlayPhoneCallStateManager p;
    public BaseFragment q;
    public b r;
    public String s;
    public String t;
    public long u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;
    public static final boolean Q;

    static {
       c.Q = a.t().u("SOURCE_LIVE").d("enableLivePlayBIzHighFrequency", false);
    }
    public void c(){
       super();
       this.G = true;
       this.H = 1;
       this.I = 47;
       this.J = new h(this);
       this.K = new j(this);
       this.L = new g(this);
       this.M = new c$a(this);
       this.N = new i(this);
       this.O = new c$b(this);
       this.P = new c$c(this);
    }
    public void c(c$a p0){
       super();
       this.G = true;
       this.H = 1;
       this.I = 47;
       this.J = new h(this);
       this.K = new j(this);
       this.L = new g(this);
       this.M = new c$a(this);
       this.N = new i(this);
       this.O = new c$b(this);
       this.P = new c$c(this);
    }
    public void c(e p0,LivePlayTextureView p1,boolean p2,a p3,String p4,boolean p5){
       LivePlayerController livePlayerCo;
       c uoc = this;
       e uoe = p0;
       LivePlayTextureView livePlayText = p1;
       String str = p4;
       super();
       boolean b = true;
       uoc.G = b;
       uoc.H = b;
       uoc.I = 47;
       uoc.J = new h(uoc);
       uoc.K = new j(uoc);
       uoc.L = new g(uoc);
       c$a uoa = new c$a(uoc);
       uoc.M = uoa;
       uoc.N = new i(uoc);
       uoc.O = new c$b(uoc);
       uoc.P = new c$c(uoc);
       uoc.v = uoe.o;
       uoc.t = uoe.m;
       uoc.w = uoe.p;
       uoc.C = uoe.t;
       e a = uoe.a;
       uoc.n = a;
       uoc.o = a.a(QLivePlayConfig.class);
       uoc.q = uoe.b;
       uoc.s = str;
       uoc.y = uoe.B;
       uoc.h = uoe.C;
       a = uoe.w;
       if (a != null) {
          uoc.I = a;
       }
       HashMap hashMap = this.C();
       hashMap.put("retryScene", uoe.q);
       String str1 = "LiveAutoPlayController";
       if (p3 != null && p3.a() != null) {
          d.h(str1, "reuse player", hashMap);
          livePlayerCo = p3.a();
          uoc.i = livePlayerCo;
          livePlayerCo.setTextureView(livePlayText, false, b);
          uoc.i.clearAllListener();
          uoc.i.resetRetryCount();
          uoc.i.unMute();
          uoc.i.setNetworkRetryScene(uoe.q);
          uoc.o.mRace.clearState();
       }else {
          d.h(str1, "create player", hashMap);
          if (PatchProxy.isSupport(c.class)) {
             livePlayerCo = PatchProxy.applyFourRefs(p1, Boolean.valueOf(p2), p0, Boolean.valueOf(p5), this, c.class, "3");
             if (livePlayerCo != PatchProxyResult.class) {
             label_0157 :
                uoc.i = livePlayerCo;
             }
          }
          livePlayerCo = d.b(livePlayText, b.a(uoc.o), new LivePlayerParam$Builder().liveStreamId(uoc.o.getLiveStreamId()).isCdnOverload(uoc.o.mIsCdnOverload).shouldUseHardwareDecoding(b.e(uoc.o)).qosMonitorConfig(b.b()).enableReusePlayerOptimize(p2).forceUseLowestQuality(uoe.k).enableMultiSurface(p5).setNetworkRetryScene(uoe.q).setAnchorId(r1.U1(uoc.n)).setBizFt(uoe.D).setBizType(String.valueOf(uoe.C)).setBizExtra(uoe.E).build(), uoe.C);
          goto label_0157 ;
       }
       a = uoe.l;
       if (a > null) {
          uoc.i.setPriorLowQuality(a);
       }
       uoc.i.setEnableAutoUpdateViewSize(uoe.s);
       String str2 = "";
       j oj = new j(uoc.n, str2);
       uoc.m = oj;
       Object[] objArray = null;
       f uof = PatchProxy.apply(objArray, uoc, c.class, "4");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(uoc);
       }
       oj.d(uof);
       uoc.m.b(uoa);
       uoc.l = new b(uoc.n, uoc.i);
       uoc.k = new b(uoc.i, uoe.d);
       uoc.i.setLiveDataSourceFetcher(uoc.m.a());
       d$a uoa1 = new d$a();
       uoa1.l(b);
       uoa1.f(str);
       uoa1.a(uoe.j);
       uoa1.j(uoe.c);
       uoa1.c(uoe.i);
       uoa1.n(uoc.n.getExtra("SEARCH_PARAMS"));
       uoa1.p(b);
       int i = (p3 == null)? 0: p3.c();
       uoa1.r(i);
       i = (p3 == null)? 0: p3.b() + b;
       uoa1.e(i);
       uoa1.k(uoc.n);
       uoa1.g(b);
       LiveStreamFeed mUser = uoc.n.mUser;
       if (mUser == null || !mUser.isFollowingOrFollowRequesting()) {
          b = false;
       }
       uoa1.d(b);
       mUser = uoc.n.mUser;
       if (mUser != null) {
          str2 = mUser.mId;
       }
       uoa1.o(str2);
       uoa1.q(uoe.g);
       uoc.j = new b(uoc.i, uoa1.b(), a.h(uoc.n));
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "6") && uoc.p == null) {
          AutoLivePlayPhoneCallStateManager uAutoLivePla = new AutoLivePlayPhoneCallStateManager(a.a().a());
          uoc.p = uAutoLivePla;
          uAutoLivePla.b(new k(uoc));
          uoc.p.c(new l(uoc));
          uoc.p.a();
       }
       if (p3 != null && uoc.i.isPlaying()) {
          this.H();
       }
       return;
    }
    public static c A(){
       Object obj = PatchProxy.apply(null, null, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.d("LiveAutoPlayController", "createEmptyPlayerInstance");
       return new c$d();
    }
    public static c G(BaseFeed p0,LivePlayTextureView p1,String p2,int p3,boolean p4,BaseFragment p5,boolean p6,int p7,String p8){
       e$a obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, null, uoc, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && r1.t2(p0)) {
          return c.A();
       }else {
          obj = new e$a(p0, p5, p7, p8);
          obj.c(p2);
          obj.e(1);
          obj.i(p3);
          obj.n(p4);
          obj.m(p6);
          obj.o = "";
          c uoc1 = new c(obj.b(), p1, false, null, "", false);
          return "";
       }
    }
    public static void s(c p0,IMediaPlayer p1,int p2,int p3,int p4,int p5){
       LiveAutoPlay b = p0.b;
       if (b != null) {
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             LiveAutoPlay$d uod = iterator.next();
             uod.onVideoSizeChanged(p2, p3);
             if (uod instanceof LiveAutoPlay$c) {
                uod.onVideoSizeChangedWithType(p2, p3, p0.i.getCurrentLiveStreamType());
             }
          }
       }
       return;
    }
    public static void t(c p0,LivePlayerState p1){
       d.h("LiveAutoPlayController", "mLivePlayerStateChangeListener", p0.C());
       if (!p0.a.isEmpty()) {
          Object obj = PatchProxy.applyOneRefs(p1, p0, c.class, "33");
          if (obj != PatchProxyResult.class) {
          }else {
             switch (c$e.a[p1.ordinal()]){
                 case 1:
                   obj = LiveAutoPlay$LiveAutoPlayerState.IDLE;
                   break;
                 case 2:
                   obj = LiveAutoPlay$LiveAutoPlayerState.PREPARING;
                   break;
                 case 3:
                   obj = LiveAutoPlay$LiveAutoPlayerState.PLAYING;
                   break;
                 case 4:
                   obj = LiveAutoPlay$LiveAutoPlayerState.STOP;
                   break;
                 case 5:
                   obj = LiveAutoPlay$LiveAutoPlayerState.DESTROY;
                   break;
                 case 6:
                   obj = LiveAutoPlay$LiveAutoPlayerState.ERROR;
                   break;
                 default:
                   obj = null;
             }
          }
          if (obj != null) {
             Iterator iterator = p0.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(obj);
             }
          }
       }
       return;
    }
    public static void u(c p0,byte[] p1,int p2,int p3){
       Iterator iterator = p0.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSeiInfo(p1, p2, p3);
       }
       return;
    }
    public static void v(c p0,int p1){
       Iterator iterator = p0.b.iterator();
       while (iterator.hasNext()) {
          LiveAutoPlay$d uod = iterator.next();
          if (uod instanceof LiveAutoPlay$c) {
             uod.onVideoSizeChangedWithType(p0.i.getVideoWidth(), p0.i.getVideoHeight(), p1);
          }
       }
       p0 = p0.F;
       if (p0 != null) {
          p0.onLiveTypeChange(p1);
       }
       return;
    }
    public static void w(c p0,LiveStreamStatusResponse p1){
       LiveAutoPlay d;
       Objects.requireNonNull(p0);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p1, p0, uoc, "18")) {
       }else {
          d.g("LiveAutoPlayController", "queryLiveStatus", "response", String.valueOf(p1.mLiveStatus));
          p1 = p1.mLiveStatus;
          int i = 1;
          if (p1 == i) {
             p0.j.u(2);
             if (!PatchProxy.applyVoid(null, p0, uoc, "20")) {
                d = p0.d;
                if (d != null) {
                   d.onAnchorEndLive();
                }
                if (!p0.i.isStop()) {
                   p0.i.stopPlay();
                   p0.J();
                   if (c.Q) {
                      p0.q(6);
                   }
                }
             }
          label_0051 :
             b9.a(p0.r);
             p0.r = null;
          }else if(p1 == 3){
             p0.j.u(i);
             c i1 = p0.i;
             if (i1 != null) {
                i1.restartPlay(p0.E());
             }
          }else {
             p0.j.u(i);
          }
       }
       return;
    }
    public static void x(c p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, c.class, "19")) {
       }else {
          String str = "LiveAutoPlayController";
          HashMap hashMap = p0.C();
          if (!PatchProxy.applyVoidFourRefs(str, "onQueryLiveStatusError", hashMap, p1, null, d.class, "6")) {
             String[] stringArray = new String[]{"AutoPlay",str};
             b.e("onQueryLiveStatusError", p1, hashMap, stringArray);
          }
          p0.j.u(c.a(p1));
          if (p0.w != null && (a.h(p1) && a.a(p1).errorCode == 611)) {
             p0.i.restartPlay(p0.E());
          }
       }
    label_0055 :
       return;
    }
    public final int B(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.q.getPage() == 4 || this.q.getPage() == 0x75e1) {
          return 16;
       }
       if (this.q.getPage() == 0x7d62) {
          return 120;
       }
       if (this.q.getPage() == 0x75d8) {
          return 5;
       }
       if (this.q.getPage() == 0x7d42) {
          return 130;
       }
       if (this.q.f() == 2) {
          return 91;
       }
       if (TextUtils.n(this.q.o(), "BUYER_HOME_PAGE")) {
          return 152;
       }
       if (this.q.getPage() == 15) {
          return 177;
       }
       if (this.q.getPage() == 1 || this.q.getPage() == 3) {
          return 178;
       }
       if (TextUtils.n(this.q.o(), "FRIENDS")) {
          return 190;
       }
       if (TextUtils.n(this.q.o(), "NEARBY")) {
          return 6;
       }
       if (TextUtils.n(this.q.o(), "EXPLORE_SIMPLE_LIVE")) {
          return 203;
       }
       return this.I;
    }
    public HashMap C(){
       HashMap obj = PatchProxy.apply(null, this, c.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("controllerHash", String.valueOf(this.hashCode()));
       obj.put("feedId", r1.t1(this.n));
       obj.put("userName", r1.V1(this.n));
       obj.put("playerBizType", String.valueOf(this.h));
       return obj;
    }
    public final long D(){
       c obj = PatchProxy.apply(null, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.u;
       if (obj <= 0) {
          long l = e.a();
       }
       return obj;
    }
    public final LiveRestartReason E(){
       LiveRestartReason obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (a.t().u("SOURCE_LIVE").d("enableRefreshUrlUseNewProviderV2", false))? LiveRestartReason.ANCHOR_FALL_BACK: LiveRestartReason.DEFAULT;
       return obj;
    }
    public boolean F(){
       c obj = PatchProxy.apply(null, this, c.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       boolean b = (obj != null && (obj.isPreparing() || this.i.isPlaying()))? true: false;
       return b;
    }
    public final void H(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "32")) {
          return;
       }
       d.h("LiveAutoPlayController", "prepareStartPlay", this.C());
       this.x = false;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          this.i.addOnVideoSizeChangedListener(this.J);
          this.i.addRenderListener(new d(this));
          this.i.addStateChangeListener(this.N);
          this.i.addLivePlayerErrorListener(this.O);
          this.i.addLivePlayerTypeChangeListener(this.K);
          this.i.addBufferListener(this.P);
          this.i.addLiveSeiListener(this.L);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "9")) {
          i oi = this.j.h();
          k ok = this.j.x();
          oi.y(this.o.mWatchingCount);
          this.j.k();
          this.z = System.currentTimeMillis();
          this.j.f();
          ClientEvent$UrlPackage urlPackage = d.b(this.q, d.a(this.n, "", this.s, this.g, this.f, false, false, r1.I1(this.n), this.C));
          ok.t0(this.o.mWatchingCount);
          ok.A0(urlPackage);
          oi.H(urlPackage);
          urlPackage = u1.p();
          if (urlPackage == null) {
             urlPackage = u1.k();
          }
          ok.w0(urlPackage);
          oi.C(urlPackage);
          ok.q0("");
          ok.z0(System.currentTimeMillis());
          oi.t("");
          oi.s(this.B());
          ok.p0(this.B());
          if (this.i.isPlaying()) {
             this.j.x().g0();
          }
       }
       if (a.a()) {
          if (this.v != null) {
             d.h("LiveAutoPlayController", "prepareStartPlay, queryLiveStatus", this.C());
             this.I();
          }else {
             d.h("LiveAutoPlayController", "prepareStartPlay, disable loop query live status", this.C());
          }
       }else if(PatchProxy.applyVoid(objArray, this, uoc, "15")){
          b9.a(this.r);
          uoc = this.n;
          if (uoc != null && (uoc.mLiveStreamModel == null || TextUtils.x(this.t))) {
             d.h("LiveAutoPlayController", "startLoopQueryLiveStatus, invalid param return", this.C());
          }else {
             d.h("LiveAutoPlayController", "startLoopQueryLiveStatus", this.C());
             this.r = t.interval(this.D(), TimeUnit.MILLISECONDS).flatMap(new o(this)).subscribe(new m(this), new n(this));
          }
       }
       this.y();
       return;
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       String str = "LiveAutoPlayController";
       if (!a.a()) {
          d.h(str, "queryLiveStatus, disEnableQueryLiveStatusOnBufferStart return", this.C());
          return;
       }else if((System.currentTimeMillis() - this.E) - this.D() < 0){
          return;
       }else {
          b9.a(this.D);
          if (this.n.mLiveStreamModel == null || TextUtils.x(this.t)) {
             d.h(str, "queryLiveStatus, invalid param return", this.C());
             return;
          }else {
             d.h(str, "queryLiveStatus", this.C());
             this.E = System.currentTimeMillis();
             this.D = c.b(this.n.mLiveStreamModel.mLiveStreamId, this.t, String.valueOf(this.B())).subscribe(new m(this), new n(this));
             return;
          }
       }
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c.h(this.q.o(), String.valueOf(this.hashCode()), r1.t1(this.n));
       return;
    }
    public void K(int p0){
       this.H = p0;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       d.h("LiveAutoPlayController", "stopLoopQueryLiveStatus", this.C());
       b9.a(this.r);
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       this.j.h().z(this.o.mWatchingCount);
       this.j.x().w(this.o.mWatchingCount);
       if (this.z - null && this.e != null) {
          this.e.a((System.currentTimeMillis() - this.z));
       }
       if (this.B == null) {
          this.j.w();
       }
       if (this.A == null) {
          this.j.v(false);
       }
       this.j.x().f0();
       this.s = null;
       return;
    }
    public void c(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "30")) {
          return;
       }
       d.h("LiveAutoPlayController", "destroy", this.C());
       this.i.removeStateChangeListener(this.N);
       this.i.removeOnVideoSizeChangedListener(this.J);
       this.i.removeLivePlayerErrorListener(this.O);
       this.i.removeLivePlayerTypeChangeListener(this.K);
       this.i.removeBufferListener(this.P);
       this.i.removeLiveSeiListener(this.L);
       this.m.destroy();
       this.k.a();
       this.l.a();
       if (this.G != null) {
          this.i.destroy();
          this.J();
       }
       this.F = null;
       this.j.destroy();
       if (!PatchProxy.applyVoid(null, this, uoc, "8")) {
          uoc = this.p;
          if (uoc != null) {
             uoc.b(null);
             this.p.d();
             this.p = null;
          }
       }
       b9.a(this.D);
       return;
    }
    public String d(){
       return this.s;
    }
    public boolean e(){
       c obj = PatchProxy.apply(null, this, c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       boolean b = (obj != null && obj.isPlaying())? true: false;
       return b;
    }
    public boolean f(){
       c obj = PatchProxy.apply(null, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       boolean b = (obj != null && obj.isPreparing())? true: false;
       return b;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "35")) {
          return;
       }
       d.h("LiveAutoPlayController", "mute", this.C());
       this.i.mute();
       return;
    }
    public void j(boolean p0){
       this.B = p0;
    }
    public void k(boolean p0){
       this.A = p0;
    }
    public void o(String p0){
       this.s = p0;
    }
    public void p(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "29")) {
          return;
       }
       d.h("LiveAutoPlayController", "start mute= "+p0, this.C());
       if (p0) {
          this.i.mute();
       }else {
          this.i.unMute();
       }
       this.H();
       if (this.y != null) {
          this.i.startCache();
       }
       this.i.startPlay();
       return;
    }
    public void q(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "21")) {
          return;
       }
       d.h("LiveAutoPlayController", "stop reason"+p0, this.C());
       i oi = this.j.h();
       oi.n(true);
       oi.G(p0);
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       if (this.j != null && this.z - null) {
          uExtParams.mActualPlayDuration = (System.currentTimeMillis() - this.z) - this.j.x().K();
       }
       c.b(13, this.n, uExtParams);
       this.M();
       this.j.j();
       b9.a(this.r);
       if (this.G != null) {
          this.i.mute();
          if (!this.i.isStop()) {
             this.i.stopPlay();
             this.J();
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c.class, "36")) {
          return;
       }
       d.h("LiveAutoPlayController", "unMute", this.C());
       this.i.unMute();
       return;
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c.a(this.q.o(), String.valueOf(this.hashCode()), r1.t1(this.n));
       return;
    }
    public void z(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "28")) {
          return;
       }
       this.m.b(p0);
       return;
    }
}
