package fj2.o;
import k51.c;
import java.lang.Object;
import fj2.o$a;
import fj2.g;
import fj2.f;
import fj2.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fj2.v;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import oq5.c;
import jv1.b;
import t02.a0;
import mq5.h;
import mq5.b;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import fj2.p;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import fj2.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import brd.t;
import ry1.b;
import fj2.j;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import ekd.k1;
import wkd.b;
import com.kuaishou.screencast.c;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import fj2.e;
import android.view.View$OnClickListener;
import w51.a;
import xf6.l;
import xp5.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import pp.d;
import com.kuaishou.live.basic.model.StreamType;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import fj2.i;
import fj2.m;
import java.io.File;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import d61.y;
import fj2.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import com.kwai.live.gzone.widget.e$a;
import hj2.e;
import fj2.o$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import fj2.o$c;
import android.view.View;
import lnc.a1;
import fj2.q;
import ew4.a;
import q87.c;
import com.kuaishou.screencast.a;
import com.kuaishou.screencast.b;
import com.kuaishou.screencast.d$a;
import fj2.t;
import fj2.o$d;
import fj2.o$e;
import java.util.Collection;
import ekd.q;
import o02.e;
import gj2.a;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import kotlin.jvm.internal.a;
import cjd.e;
import erd.o;
import gj2.c;
import fj2.k;
import fj2.l;
import com.kwai.video.waynelive.LivePlayerController;
import nl8.o;
import nl8.n;

public class o extends c	// class@00297c
{
    public final h A;
    public final b B;
    public final n$c C;
    public boolean D;
    public ScreencastDeviceInfo E;
    public LiveUserStatusResponse F;
    public d G;
    public final Object p;
    public LiveStreamFeedWrapper q;
    public a0 r;
    public LivePlayerController s;
    public b t;
    public c u;
    public v v;
    public long w;
    public t x;
    public e y;
    public c$a z;
    public static String sLivePresenterClassName = "LiveAudienceScreencastPresenter";

    public void o(){
       super();
       this.p = new Object();
       this.u = new o$a(this);
       this.A = new g(this);
       this.B = new f(this);
       this.C = new h(this);
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       v ov = this.W8();
       Objects.requireNonNull(ov);
       String str = "4";
       if (!PatchProxy.applyVoid(objArray, ov, v.class, str)) {
          ov.c.setValue(ov.b);
          ov.a.a(c.class).v1(ov.c);
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, str)) {
          if (!PatchProxy.applyVoid(objArray, this, oo, "21")) {
             this.t.H6(this.u);
             this.r.D2.Km(this.A);
             a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
             this.r.N().u5(this.B, uoaArray);
          }
          oo = this.r;
          if (oo.h != null) {
             oo.y2.P4(new p(this));
          }
          this.G = new d(this.r);
       }
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_SCREENCAST;
       lIVE_AUDIENC.appendTag("LiveAudienceScreencastPresenter");
       LiveLogTag liveLogTag = lIVE_AUDIENC;
       b.T(liveLogTag, "onBind", "getUserName", this.q.getUserName(), "isEnableScreencast", Boolean.valueOf(this.X8()));
       if (this.X8()) {
          this.c9();
       }
       this.X7(this.r.b3.T3().subscribe(new j(this), e.b));
       return;
    }
    public void J8(){
       o oo = o.class;
       if (PatchProxy.applyVoid(null, this, oo, "20")) {
          return;
       }
       v ov = this.W8();
       Objects.requireNonNull(ov);
       if (!PatchProxy.applyVoid(null, ov, v.class, "5")) {
          ov.a.a(c.class).O0(1027);
       }
       n.w(this.C);
       k1.n(this.p);
       if (!PatchProxy.applyVoid(null, this, oo, "22")) {
          this.t.Q0(this.u);
          this.r.D2.le(this.A);
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
          this.r.N().G5(this.B, uoaArray);
       }
       this.R8();
       this.S8();
       this.V8();
       this.x = null;
       this.w = 0;
       this.D = false;
       this.E = null;
       this.F = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, o.class, "10")) {
          return;
       }
       this.W8().setVisible(false);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, o.class, "23")) {
          return;
       }
       b.P(LiveLogTag.LIVE_AUDIENCE_SCREENCAST.appendTag("LiveAudienceScreencastPresenter"), "destroyScreencastManager");
       if (this.z != null) {
          b.a(-1851168653).h();
          c uoc = b.a(-1851168653);
          o tz = this.z;
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidOneRefs(tz, uoc, c.class, "4")) {
             uoc.b.remove(tz);
             k1.m(uoc.h);
             k1.m(uoc.i);
             uoc.c = null;
          }
          this.z = null;
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, o.class, "26")) {
          return;
       }
       if (this.Z8()) {
          this.x.q(0);
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, o.class, "24")) {
          return;
       }
       if (this.a9()) {
          this.y.q(0);
       }
       return;
    }
    public v W8(){
       Object obj = PatchProxy.apply(null, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.v == null) {
          this.v = new v(new e(this));
       }
       return this.v;
    }
    public boolean X8(){
       LiveUserStatusResponse mEnableLiveS;
       LiveUserStatusResponse mEnableLiveP;
       boolean b1;
       Object obj = this;
       o oo = o.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, obj, oo, "7");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = PatchProxy.apply(objArray, objArray, a.class, "83");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): l.c("forceOpenAudienceScreencast", false);
       if (b) {
          return true;
       }else if(!obj.r.t.c() && !obj.r.e.isLandscape()){
          b = true;
       }else {
          b = false;
       }
       a0 h2 = obj.r.H2;
       LiveLogTag sCREEN_CAST = LiveLogTag.SCREEN_CAST;
       o f = obj.F;
       String str = "null";
       Boolean uBoolean = (f != null)? Boolean.valueOf(f.mEnableLiveScreencast): str;
       f = obj.F;
       if (f != null) {
          str = Boolean.valueOf(f.mEnableLivePortraitScreencast);
       }
       h2.m(sCREEN_CAST, "isEnableScreencast", ImmutableMap.of("mEnableLiveScreencast", uBoolean, "enableLivePortraitScreenCast", str, "isPortraitLive", Boolean.valueOf(b)));
       o f1 = obj.F;
       if (f1 != null) {
          mEnableLiveS = f1.mEnableLiveScreencast;
          mEnableLiveP = f1.mEnableLivePortraitScreencast;
       }else {
          mEnableLiveS = obj.r.e.isLandscape();
          mEnableLiveP = null;
       }
       if (!mEnableLiveS) {
          return false;
       }else if(b && mEnableLiveP == null){
          return false;
       }else if(obj.r.e.mStreamType == StreamType.AUDIO.toInt()){
          return false;
       }else if(obj.r.e.mStreamType == StreamType.VOICEPARTY.toInt() || obj.r.e.mStreamType == StreamType.KTV.toInt()){
          return false;
       }else if(obj.r.N().r2(AudienceBizRelation.VOICE_PARTY)){
          return false;
       }else {
          obj1 = PatchProxy.apply(objArray, obj, oo, "12");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(PatchProxy.applyVoid(objArray, obj, oo, "13")){
             obj.X7(p.f(Category.SCREENCAST_PATCH).subscribe(new i(obj), m.b));
          }
          File uFile = new File(c.j);
          obj.r.H2.m(sCREEN_CAST, "isPatchResourceExist", ImmutableMap.of("exists", Boolean.valueOf(uFile.exists())));
          b1 = uFile.exists();
          if (!b1) {
             return false;
          }else {
             return true;
          }
       }
    }
    public boolean Y8(){
       String obj = PatchProxy.apply(null, this, o.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = -1851168653;
       ScreencastDeviceInfo screencastDe = b.a(i).a();
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_SCREENCAST;
       lIVE_AUDIENC.appendTag("LiveAudienceScreencastPresenter");
       b.S(lIVE_AUDIENC, "isScreenCastingForCurrentLive", "currentCastDeviceInfo", screencastDe);
       if (screencastDe != null) {
          obj = b.a(i).b();
          lIVE_AUDIENC.appendTag("LiveAudienceScreencastPresenter");
          b.S(lIVE_AUDIENC, "isScreenCastingForCurrentLive", "currentScreencastFeedId", obj);
          if (!TextUtils.x(this.q.getPhotoId()) && (this.q.getPhotoId()).equals(obj)) {
             return true;
          }
       }
       return false;
    }
    public boolean Z8(){
       o obj = PatchProxy.apply(null, this, o.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       boolean b = (obj != null && obj.K())? true: false;
       return b;
    }
    public boolean a9(){
       o obj = PatchProxy.apply(null, this, o.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.y;
       boolean b = (obj != null && obj.K())? true: false;
       return b;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       boolean b = y.d(this.getActivity());
       o tr = this.r;
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), "bottom", tr, null, c.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_WATCH_PROJECTION";
          uElementPack.params = c.a(tr, "bottom").e();
          u1.u0(6, uElementPack, c.b(b, tr));
       }
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, o.class, "9")) {
          return;
       }
       this.W8().setVisible(true);
       if (this.Y8()) {
          this.W8().l(R.string.arg_RES_7f1004df);
       }else {
          this.W8().l(R.string.arg_RES_7f102c0a);
       }
       this.b9();
       return;
    }
    public final void d9(int p0,ScreencastDeviceInfo p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oo, "15")) {
          return;
       }
       e uoe = new e(new e$a(this.getActivity()), p0, p1);
       this.y = uoe;
       uoe.i0(new o$b(this));
       p0.F = new o$c(this);
       this.y.Z();
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, o.class, "2");
    }
    public void e9(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "16")) {
          return;
       }
       if (!a1.i(this.getActivity())) {
          return;
       }
       if (this.Z8()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "8") && this.z == null) {
          this.z = new q(this);
          c uoc = b.a(-1851168653);
          uoc.h();
          o tz = this.z;
          c uoc1 = c.class;
          if (!PatchProxy.applyVoidOneRefs(tz, uoc, uoc1, "3")) {
             if (!PatchProxy.applyVoid(objArray, uoc, uoc1, "2")) {
                Object[] objArray1 = new Object[0];
                a.C().w("ScreencastManager", "initScreenSdkIfNeeded", objArray1);
                if (uoc.a == null) {
                   a uoa = new a();
                   uoc.a = uoa;
                   uoa.d(new b(uoc));
                }
             }
             uoc.b.add(tz);
          }
       }
       t ot = new t(new e$a(this.getActivity()));
       this.x = ot;
       ot.C = new o$d(this);
       this.x.i0(new o$e(this));
       this.x.Z();
       return;
    }
    public void h9(ScreencastDeviceInfo p0){
       a0 e;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "17")) {
          return;
       }
       if (q.f(this.r.e.mPlayUrls)) {
          return;
       }
       if (this.G == null) {
          return;
       }
       this.S8();
       int i = 3;
       if (this.a9()) {
          this.y.l0(i, p0);
       }else {
          this.d9(i, p0);
       }
       o tG = this.G;
       Objects.requireNonNull(tG);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       t ot = PatchProxy.apply(objArray, tG, d.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a uoa = PatchProxy.apply(objArray, objArray, e.class, "20");
          if (uoa != patchProxyRe) {
          }else if(e.u == null){
             e.u = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), a.class);
          }
          uoa = e.u;
          e = tG.a.e;
          a.o(e, "callerContext.mLivePlayConfig");
          String liveStreamId = e.getLiveStreamId();
          a.o(liveStreamId, "callerContext.mLivePlayConfig.liveStreamId");
          ot = uoa.a(liveStreamId).map(new e()).map(new c(tG.a));
          a.o(ot, "LiveApi.getLiveAudienceS¡­HlsFinder\(callerContext\)\)");
       }
       this.X7(ot.subscribe(new k(this, p0), new l(this, p0)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_PHOTO");
       this.r = this.q8(a0.class);
       this.s = this.r8("LIVE_PLAYER_CONTROLLER");
       this.t = this.q8(b.class);
       this.W8().i(n.a(this));
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, o.class, "5")) {
          return;
       }
       if (this.X8()) {
          this.c9();
       }else {
          this.P8();
       }
       return;
    }
}
