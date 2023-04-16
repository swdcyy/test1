package com.kuaishou.live.playeradapter.statistics.b;
import tj3.e;
import com.kwai.video.waynelive.LivePlayerController;
import tj3.d;
import tj3.b;
import tj3.s;
import k2b.e0;
import java.lang.Object;
import tj3.k;
import tj3.i;
import tj3.l;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.playeradapter.statistics.b$b;
import com.kuaishou.live.playeradapter.statistics.b$f;
import com.kuaishou.live.playeradapter.statistics.b$e;
import com.kuaishou.live.playeradapter.statistics.b$c;
import com.kuaishou.live.playeradapter.statistics.b$d;
import com.kuaishou.live.playeradapter.statistics.b$a;
import tj3.h;
import tj3.f;
import ec6.i;
import java.lang.String;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import tj3.r;
import com.kuaishou.android.model.feed.SearchParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.IKwaiMediaPlayer;
import org.json.JSONObject;
import com.kwai.video.waynelive.LivePlayerUtils;
import ekd.k1;
import java.lang.Runnable;
import tj3.o;
import java.util.Set;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.player.qos.KwaiQosInfo;
import java.util.Objects;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Integer;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ResolutionSlicePackage;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kwai.video.waynelive.LivePlayUrlInfo;
import com.kwai.video.waynelive.LivePlayUrlInfo$DataSourceType;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import tj3.n;
import tj3.g;
import t45.c;
import elb.e;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import ekd.p0;
import c0d.d;
import com.kuaishou.aegon.httpdns.ResolvedIP;
import com.kwai.video.waynelive.util.CommonUtil;
import java.lang.System;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.listeners.LivePlayerQosLogListener;
import com.kwai.video.cache.AwesomeCacheCallback;
import lnc.u1;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import lnc.l1;
import m56.f;
import m56.g;
import android.os.SystemClock;
import ci7.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.QLivePlayConfig;
import tj3.j;
import lnc.i3;

public class b implements e	// class@000d63
{
    public final Runnable A;
    public final IMediaPlayer$OnVideoSizeChangedListener B;
    public boolean C;
    public final s D;
    public int a;
    public final LivePlayerController b;
    public final k c;
    public final i d;
    public final l e;
    public final d f;
    public final b g;
    public boolean h;
    public LivePlayUrlInfo i;
    public boolean j;
    public boolean k;
    public int l;
    public j m;
    public j n;
    public final Object o;
    public boolean p;
    public boolean q;
    public e0 r;
    public Set s;
    public LivePlayerQosLogListener t;
    public LiveUrlSwitchListener u;
    public LivePlayerStateChangeListener v;
    public LivePlayerQosListener w;
    public LivePlayerRenderListener x;
    public LivePlayerErrorListener y;
    public f z;

    public void b(LivePlayerController p0,d p1,b p2){
       super(p0, p1, p2, null, null);
    }
    public void b(LivePlayerController p0,d p1,b p2,s p3,e0 p4){
       d b;
       int i = this;
       d uod = p1;
       b uob = b.class;
       super();
       k ok = new k();
       i.c = ok;
       i oi = new i();
       i.d = oi;
       l ol = new l();
       i.e = ol;
       i.o = new Object();
       i.s = new CopyOnWriteArraySet();
       i.t = new b$b(this);
       i.u = new b$f(this);
       i.v = new b$e(this);
       i.w = new b$c(this);
       i.x = new b$d(this);
       i.y = new b$a(this);
       i.A = new h(this);
       i.B = new f(this);
       i.f = uod;
       i.g = p2;
       i.b = p0;
       i.r = p4;
       i oi1 = new i(41, 0, null, null, uod.H);
       i.z = v14;
       k ok1 = (p3 == null)? ok: p3;
       i.D = ok1;
       if (!PatchProxy.applyVoidOneRefs(uod, this, uob, "36")) {
          ClientEvent$UrlPackage urlPackage = u1.p();
          oi.b = uod.a;
          oi.q(1);
          oi.s(uod.d);
          oi.G = uod.d;
          oi.t(uod.p);
          oi.D(p1.c());
          oi.d = uod.o;
          oi.C = uod.c;
          oi.E(uod.i);
          oi.C(urlPackage);
          oi.H(uod.q);
          oi.D = uod.j;
          oi.K = uod.s;
          oi.W = uod.t;
          oi.X = uod.u;
          oi.f0 = uod.D;
          oi.T = uod.f;
          oi.x(uod.l);
          oi.n0 = uod.E;
          oi.o0 = uod.G;
          oi.Y = uod.v;
          oi.Z = uod.w;
          oi.a0 = uod.x;
          oi.b0 = uod.y;
          oi.c0 = uod.z;
          oi.d0 = uod.A;
          oi.e0 = uod.B;
          ok.G = uod.a;
          ok.I0 = uod.o;
          ok.p0(uod.d);
          ok.q0(uod.p);
          ok.x0(p1.c());
          ok.P0 = uod.c;
          ok.y0(uod.i);
          ok.w0(urlPackage);
          ok.A0(uod.q);
          ok.X = uod.j;
          ok.R0 = uod.s;
          ok.Y0 = uod.t;
          ok.Z0 = uod.u;
          ok.h1 = uod.D;
          ok.O0 = uod.l;
          ok.S0 = uod.f;
          ok.T0 = uod.g;
          ok.j0(uod.G);
          ok.a1 = uod.v;
          ok.b1 = uod.w;
          ok.c1 = uod.x;
          ok.d1 = uod.y;
          ok.e1 = uod.z;
          ok.f1 = uod.A;
          ok.g1 = uod.B;
          ol.k(p1.c());
          ol.f(uod.d);
          ol.l = uod.t;
          ol.m = uod.u;
          ol.k = uod.p;
          ol.p = uod.E;
          b = uod.b;
          if (b != null && !TextUtils.isEmpty(b.mSearchSessionId)) {
             ok.p0(91);
             oi.s(91);
             ol.f(91);
             ok.X0 = b;
             oi.V = b;
          }
       }
       this.m();
       if (uod.e != null) {
          if (!PatchProxy.applyVoid(null, this, uob, "43")) {
             IKwaiMediaPlayer iKwaiMediaPl = this.E();
             if (iKwaiMediaPl != null) {
                JSONObject jSONObject = new JSONObject();
                this.K(jSONObject);
                iKwaiMediaPl.setAppQosStatJson(jSONObject);
             }
          }
          this.J();
          this.M();
          ok.l0(LivePlayerUtils.getServerAddress(this.E()));
          oi.v(LivePlayerUtils.getServerAddress(this.E()));
          this.u(1);
          this.L(p0.getVideoWidth(), p0.getVideoHeight());
       }
       return;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, b.class, "16")) {
          return;
       }
       if (this.p != null) {
          k1.n(this.o);
          k1.s(this.A, this.o, (long)this.F());
       }
       return;
    }
    public void B(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "20")) {
          return;
       }
       if (p0 != null) {
          this.s.remove(p0);
       }
       return;
    }
    public void C(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "26")) {
          return;
       }
       this.c.y0 = p0;
       return;
    }
    public void D(IKwaiMediaPlayer p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "40")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       KwaiQosInfo streamQosInf = LivePlayerUtils.getStreamQosInfo(p0);
       if (streamQosInf != null) {
          b tc = this.c;
          tc.q((long)LivePlayerUtils.getBufferEmptyCount(p0));
          tc.o = LivePlayerUtils.getBufferEmptyDurationSec(p0);
       }
       b tc1 = this.c;
       Objects.requireNonNull(tc1);
       LiveQualityItem mQualityType = this.b.getCurrentLiveQualityItem().mQualityType;
       int i = (this.q != null)? 1: 2;
       if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidFourRefs(streamQosInf, mQualityType, Integer.valueOf(i), Boolean.valueOf(p1), tc1, k.class, "20")) {
          ClientStat$ResolutionSlicePackage resolutionSl = new ClientStat$ResolutionSlicePackage();
          resolutionSl.playStartTime = tc1.P;
          if (tc1.q > 0) {
             tc1.d();
             resolutionSl.fullscreenDuration = tc1.h();
             tc1.u(0);
             tc1.E();
          }
          if (tc1.j1 == null) {
             resolutionSl.fullscreenDuration = tc1.h();
             tc1.f();
             resolutionSl.portraitDuration = tc1.j();
             tc1.e = 0;
             tc1.G();
             resolutionSl.landscapeDuration = tc1.o();
          }else {
             resolutionSl.fullscreenDuration = tc1.h();
             tc1.e();
             resolutionSl.landscapeDuration = tc1.o();
             tc1.f = 0;
             tc1.F();
             resolutionSl.portraitDuration = tc1.j();
          }
          tc1.Y();
          resolutionSl.totalDuration = tc1.d;
          resolutionSl.backgroundDuration = tc1.U;
          resolutionSl.pushUrl = TextUtils.k(tc1.k());
          resolutionSl.bufferTime = (long)(tc1.o * 1000.00f);
          resolutionSl.prepareTime = tc1.k;
          resolutionSl.blockCnt = tc1.l;
          resolutionSl.liveStreamIp = TextUtils.k(tc1.J);
          resolutionSl.liveStreamHost = TextUtils.k(tc1.I);
          resolutionSl.pullCdn = TextUtils.k(tc1.T);
          resolutionSl.pushCdn = TextUtils.k(tc1.S);
          resolutionSl.livePolicy = TextUtils.k(tc1.K0);
          if (streamQosInf != null) {
             resolutionSl.liveVideoEncodeInfo = TextUtils.k(streamQosInf.vencInit);
          }
          resolutionSl.dnsResolvedIp = TextUtils.k(tc1.L);
          resolutionSl.dnsResolverName = TextUtils.k(tc1.M);
          resolutionSl.dnsResolveHost = TextUtils.k(tc1.K);
          if (mQualityType != null) {
             if ((LiveQualityItem.SuperQuality().mQualityType).equals(mQualityType)) {
                resolutionSl.resolutionType = 3;
             }else if((LiveQualityItem.HighQuality().mQualityType).equals(mQualityType)){
                resolutionSl.resolutionType = 2;
             }else if((LiveQualityItem.StandardQuality().mQualityType).equals(mQualityType)){
                resolutionSl.resolutionType = 1;
             }else {
                resolutionSl.resolutionType = 0;
             }
          }
          resolutionSl.screenOrientationSwitchCnt = tc1.Q;
          resolutionSl.screenOrientationLeaveType = i;
          tc1.O.add(resolutionSl);
          if (!p1) {
             tc1.c0();
          }
       }
       return;
    }
    public IKwaiMediaPlayer E(){
       Object obj = PatchProxy.apply(null, this, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLiveMediaPlayer();
    }
    public final int F(){
       Object obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a == null) {
          String str = "SOURCE_LIVE";
          this.a = (a.t().u(str).d("enableLivePlayBIzHighFrequency", false))? a.t().u(str).a("livePlayBizReportTimeIntervalMs", 0x1d4c0): 0x1d4c0;
       }
    label_0041 :
       return this.a;
    }
    public final String G(){
       LivePlayUrlInfo$DataSourceType obj = PatchProxy.apply(null, this, b.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getCurrentPlayUrlInfo().getDataSourceType();
       if (obj == LivePlayUrlInfo$DataSourceType.ADAPTIVE_MANIFESTS) {
          if (this.b.getCurrentPlayUrlInfo().isManifestFlv()) {
             return "adaptive_manifest";
          }else if(this.b.getCurrentPlayUrlInfo().isManifestWebRTC()){
             return "webrtc_adaptive_manifest";
          }
       }
       if (obj == LivePlayUrlInfo$DataSourceType.MULTI_RESOLUTION || obj == LivePlayUrlInfo$DataSourceType.NORMAL_CDN) {
          return "DnsResolvedUrl";
       }else {
          return "NULL";
       }
    }
    public void H(int p0,int p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, b.class, "44")) {
          return;
       }
       DebugLog.i("LiveLogReporterImpl", "logSwitchUrlreleaseReason, "+p0);
       this.c.A(this.b.getTotalRetryCount());
       this.b.setPlayerReleaseReason(p0);
       if (p0 == 11) {
          n.b(p2, LivePlayerUtils.getDataSource(this.b.getLiveMediaPlayer()), 7);
       }else if(p0 == 10){
          n.b(p2, LivePlayerUtils.getDataSource(this.b.getLiveMediaPlayer()), 2);
       }
       u1.V("LiveStatistics.addRetryCount", this.b.getCurrentPlayUrlInfo().toString(), 3);
       return;
    }
    public void I(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       b td = this.d;
       td.i0 = (long)LivePlayerUtils.getBufferEmptyCount(p0);
       td.j0 = LivePlayerUtils.getBufferEmptyDurationSec(p0);
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, b.class, "35")) {
          return;
       }
       c.a(new g(this));
       return;
    }
    public final void K(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "33")) {
          return;
       }
       try{
          p0.put("is_slide_play", this.c.N0);
          p0.put("is_auto_play", this.c.X);
          p0.put("livePlayBizSessionId", this.c.H0);
          p0.put("source_type", this.c.Q0);
          p0.put("source_url", TextUtils.k(this.c.V0));
          p0.put("player_biz_type", this.f.f);
          p0.put("is_normal_play", this.f.l);
          p0.put("page_index", this.f.r);
          p0.put("page_url", TextUtils.k(this.f.m));
          p0.put("page_session_id", this.f.c());
       }catch(org.json.JSONException e3){
          DebugLog.e("LiveLogReporterImpl", "updateStaticLivePlayerQosStat error"+e3);
       }
       return;
    }
    public final void L(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "41")) {
          return;
       }
       b uob1 = (p0 > 0 && (p0 * 9) >= (p1 * 16))? 1: null;
       if (uob1) {
          this.c.F();
          this.c.f();
          this.d.L();
          this.d.d();
          this.d.I(true);
          this.c.n0(true);
          this.q = true;
       }else {
          this.c.G();
          this.c.e();
          this.d.K();
          this.d.I(false);
          this.d.e();
          this.c.n0(false);
          this.q = false;
       }
       this.d.m(true);
       return;
    }
    public void M(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "34")) {
          return;
       }
       LivePlayUrlInfo currentPlayU = this.b.getCurrentPlayUrlInfo();
       if (this.i == null) {
          this.i = currentPlayU;
       }
       e dnsResolvedU = currentPlayU.getDnsResolvedUrl();
       LiveAdaptiveManifest adaptiveMani = currentPlayU.getAdaptiveManifest();
       int i = 0;
       if (dnsResolvedU != null && (this.i.getAdaptiveManifest() == null || (adaptiveMani != null && this.i.getAdaptiveManifest() == null))) {
          i = 1;
       }
       if (dnsResolvedU != null) {
          this.c.x(dnsResolvedU.b);
          this.d.B(dnsResolvedU.b);
          this.c.v0(dnsResolvedU.h);
          this.c.u0(dnsResolvedU.i);
          str = p0.n(dnsResolvedU.b);
          if (!TextUtils.x(currentPlayU.getHost())) {
             str = currentPlayU.getHost();
          }
          this.c.i0(CommonUtil.httpDNS2aegonDNS(dnsResolvedU.c));
       }else if(adaptiveMani != null){
          LiveAdaptiveManifest mHost = adaptiveMani.mHost;
          if (i) {
             this.c.x(objArray);
             this.d.B(objArray);
             this.c.v0(objArray);
             this.c.u0(objArray);
          }
          this.c.i0(adaptiveMani.mResolvedIP);
          str = mHost;
       }else {
          str = "";
       }
       b tc = this.c;
       tc.I = str;
       this.d.h = str;
       if (tc.M() <= 0) {
          this.c.o0(System.currentTimeMillis());
       }
       this.c.R = this.g.getClientId();
       this.d.g = this.g.getClientId();
       this.c.v(this.g.getLiveStreamId());
       this.d.u(this.g.getLiveStreamId());
       this.e.g(this.g.getLiveStreamId());
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "21")) {
          return;
       }
       this.c.x0(p0);
       this.d.D(p0);
       this.e.k(p0);
       return;
    }
    public d b(){
       return this.f;
    }
    public void c(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       if (p0 != null) {
          this.s.add(p0);
       }
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "25")) {
          return;
       }
       b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, k.class, "44")) {
          tc.x0 = System.currentTimeMillis();
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.b.removeLiveUrlSwitchListener(this.u);
       this.b.removeRenderListener(this.x);
       this.b.removeStateChangeListener(this.v);
       this.b.removeQosMonitorListener(this.w);
       this.b.removeLivePlayerErrorListener(this.y);
       this.b.removeOnVideoSizeChangedListener(this.B);
       if (this.j == null) {
          this.b.setLivePlayerQosLogListener(null);
          this.b.setCdnLoggerCallback(null);
       }
       this.s.clear();
       this.c.Y();
       u1.b(this);
       this.j();
       return;
    }
    public boolean e(){
       return this.p;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.d.j();
       this.d.n(true);
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "11")) {
          return;
       }
       b te = this.e;
       te.g(this.g.getLiveStreamId());
       te.j(this.g.getServerExpTag());
       te.d(this.g.isFollowing());
       te.e(this.g.W0());
       this.e.b();
       te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, l.class, "2")) {
          h$b uob = h$b.e(te.d, "WATCHING_LIVE_OF_BACKGROUND");
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.sessionId = te.e;
          liveStreamPa.serverExpTag = te.h;
          liveStreamPa.sourceTypeNew = te.j;
          liveStreamPa.showIndexPlusOne = (long)te.l;
          liveStreamPa.myFollow = te.n;
          liveStreamPa.friend = te.o;
          liveStreamPa.liveOperationType = (long)te.m;
          liveStreamPa.sourceUrl = te.k;
          liveStreamPa.anchorUserId = te.p;
          liveStreamPa.liveStreamId = te.a(te.g);
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "WATCHING_LIVE_OF_BACKGROUND";
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          if (te.d != 1) {
             if (te.c - null <= 0) {
                te.c = System.currentTimeMillis();
             }else {
                resultPackag.timeCost = System.currentTimeMillis() - te.c;
             }
          }
          te.c = System.currentTimeMillis();
          uob.h(uContentPack);
          uob.q(resultPackag);
          uob.u(te.i);
          uob.k(uElementPack);
          u1.p0("", objArray, uob);
       }
       return;
    }
    public i h(){
       return this.d;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       if (this.p == null) {
          this.p = true;
          b uob = null;
          if (this.d.h() - uob > 0) {
             uob = System.currentTimeMillis() - this.d.h();
          }
          k1.s(this.A, this.o, ((long)this.F() - uob));
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       if (this.p != null) {
          this.p = false;
          k1.n(this.o);
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.c.B(System.currentTimeMillis());
       this.c.y(false);
       this.c.c0();
       u1.a(this);
       if (l1.a()) {
          this.c.E();
       }
       return;
    }
    public void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "27")) {
          return;
       }
       b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, k.class, "45") && tc.A0 == null) {
          tc.z0 = System.currentTimeMillis();
          tc.A0 = true;
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.s.clear();
       this.b.addLiveUrlSwitchListener(this.u);
       this.b.addRenderListener(this.x);
       this.b.addStateChangeListener(this.v);
       this.b.addQosMonitorListener(this.w);
       this.b.setLivePlayerQosLogListener(this.t);
       this.b.addLivePlayerErrorListener(this.y);
       this.b.setCdnLoggerCallback(this.z);
       this.b.addOnVideoSizeChangedListener(this.B);
       return;
    }
    public l n(){
       return this.e;
    }
    public void o(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "29")) {
          return;
       }
       this.l = p0;
       this.d.k0 = p0;
       this.c.W0 = p0;
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (this.x() != null) {
          k ok = this.x();
          Objects.requireNonNull(ok);
          if (!PatchProxy.applyVoid(null, ok, k.class, "17")) {
             ok.V = System.currentTimeMillis();
             ok.W = ok.W + 1;
          }
          this.h().i();
       }
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (this.x() != null) {
          k ok = this.x();
          Objects.requireNonNull(ok);
          if (!PatchProxy.applyVoid(null, ok, k.class, "18") && ok.V) {
             ok.U = ok.U + (System.currentTimeMillis() - ok.V);
             ok.V = 0;
          }
          ok.s = 0;
       }
       return;
    }
    public void p(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "28")) {
          return;
       }
       this.c.B0 = p0;
       return;
    }
    public void q(boolean p0){
       this.C = p0;
    }
    public void r(){
       this.h = true;
    }
    public void s(boolean p0){
       this.j = p0;
    }
    public void t(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "24")) {
          return;
       }
       b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, k.class, "43")) {
          tc.w0 = System.currentTimeMillis();
       }
       return;
    }
    public void u(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "22")) {
          return;
       }
       if (!this.c.O()) {
          this.c.r0(p0);
          this.d.r(p0);
       }
       return;
    }
    public void v(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "9")) {
          return;
       }
       if (this.C != null) {
          return;
       }
       b td = this.d;
       td.j = this.g.V0();
       td.u(this.g.getLiveStreamId());
       td.m0 = this.g.isFollowing();
       td.l(System.currentTimeMillis());
       i oi = td.d();
       Objects.requireNonNull(oi);
       Object obj = PatchProxy.apply(null, oi, i.class, "13");
       if (obj != PatchProxyResult.class) {
          oi = obj;
       }else if(oi.s - null <= 0){
          oi.r = SystemClock.elapsedRealtime() - oi.s;
          oi.s = SystemClock.elapsedRealtime();
       }
       oi.e().c();
       IKwaiMediaPlayer iKwaiMediaPl = this.E();
       if (iKwaiMediaPl != null) {
          this.I(iKwaiMediaPl);
       }
       this.d.g(this.r);
       this.d.M();
       if (p0 || (!PatchProxy.applyVoid(null, this, uob, "16") && this.p != null)) {
          k1.n(this.o);
          k1.s(this.A, this.o, (long)this.F());
       }
    label_00a8 :
       return;
    }
    public void w(){
       boolean b;
       int b1;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
          return;
       }
       IKwaiMediaPlayer iKwaiMediaPl = this.E();
       LivePlayUrlInfo currentPlayU = this.b.getCurrentPlayUrlInfo();
       if (currentPlayU.getDataSourceType() == LivePlayUrlInfo$DataSourceType.ADAPTIVE_MANIFESTS && (iKwaiMediaPl != null && currentPlayU.isManifestFlv())) {
          this.x().x(iKwaiMediaPl.getKflvVideoPlayingUrl());
       }
    label_0031 :
       this.c.Y();
       b = true;
       this.D(iKwaiMediaPl, b);
       this.c.L0 = LivePlayerUtils.getKwaiSignature(iKwaiMediaPl);
       this.c.M0 = LivePlayerUtils.getXksCache(iKwaiMediaPl);
       this.c.U0 = this.g.isFollowing();
       this.c.j0(this.f.G);
       b tc = this.c;
       d i = this.f.I;
       if (i != null) {
          LiveStreamFeed mConfig = i.mConfig;
          if (mConfig != null) {
             QLivePlayConfig mPatternType = mConfig.mPatternType;
          label_006e :
             tc.Z("patternType", (long)mPatternType);
             tc = this.c;
             i = this.f.I;
             if (i != null) {
                mConfig = i.mConfig;
                if (mConfig != null && mConfig.mIsShopLive != null) {
                   b1 = true;
                label_0087 :
                   tc.b0("isShopLive", b1);
                   tc = this.c;
                   tc.i1 = TextUtils.n(this.f.k, this.g.getLiveStreamId()) ^ b;
                   tc.r(System.currentTimeMillis());
                   b1 = (this.h != null)? this.g.X0(): 0;
                   tc.z(b1);
                   tc.C(this.g.V0());
                   tc.v(this.g.getLiveStreamId());
                   tc.A(this.b.getTotalRetryCount());
                   tc.f().d().e();
                   this.c.J(this.r);
                   this.n = this.c.P(b);
                   DebugLog.i("LiveLogReporterImpl", "uploadAudienceStatEvent");
                   this.c.I();
                   if (!PatchProxy.applyVoid(objArray, this, uob, "18")) {
                      this.q = false;
                      this.d.m(false);
                   }
                   uob = this.c;
                   Objects.requireNonNull(uob);
                   if (!PatchProxy.applyVoid(objArray, uob, k.class, "25")) {
                      k o = uob.O;
                      if (o != null) {
                         o.clear();
                      }
                      uob.d = 0;
                   }
                   return;
                }
             }
             b1 = false;
             goto label_0087 ;
          }
       }
       b1 = 0;
       goto label_006e ;
    }
    public k x(){
       return this.c;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, b.class, "23")) {
          return;
       }
       this.c.r0(0);
       this.d.r(0);
       return;
    }
    public void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "10")) {
          return;
       }
       b te = this.e;
       te.g(this.g.getLiveStreamId());
       te.j(this.g.getServerExpTag());
       te.d(this.g.isFollowing());
       te.e(this.g.W0());
       this.e.b();
       te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, l.class, "1")) {
          h$b uob = h$b.e(te.b, "WATCHING_LIVE_OF_LOCK_SCREEN");
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.sessionId = te.e;
          liveStreamPa.serverExpTag = te.h;
          liveStreamPa.sourceTypeNew = te.j;
          liveStreamPa.showIndexPlusOne = (long)te.l;
          liveStreamPa.myFollow = te.n;
          liveStreamPa.friend = te.o;
          liveStreamPa.liveOperationType = (long)te.m;
          liveStreamPa.sourceUrl = te.k;
          liveStreamPa.anchorUserId = te.p;
          liveStreamPa.liveStreamId = te.a(te.g);
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "WATCHING_LIVE_OF_LOCK_SCREEN";
          i3 oi3 = i3.f();
          oi3.d("screen_status", te.f);
          uElementPack.params = oi3.e();
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          if (te.b != 1) {
             if (te.a - null <= 0) {
                te.a = System.currentTimeMillis();
             }else {
                resultPackag.timeCost = System.currentTimeMillis() - te.a;
             }
          }
          te.a = System.currentTimeMillis();
          uob.h(uContentPack);
          uob.q(resultPackag);
          uob.u(te.i);
          uob.k(uElementPack);
          u1.p0("", objArray, uob);
       }
       return;
    }
}
