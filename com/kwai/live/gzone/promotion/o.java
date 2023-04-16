package com.kwai.live.gzone.promotion.o;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import s67.x0;
import s67.y0;
import s67.a1;
import com.kwai.live.gzone.promotion.o$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.common.keyswitch.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import fq5.b;
import xp5.a;
import u53.b;
import s67.b1;
import vq5.b;
import vq5.d;
import s67.c1;
import u67.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneGameStoreOpened;
import s67.v0;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneGameStoreClosed;
import s67.u0;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneGameStoreRefresh;
import s67.w0;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.d;
import brd.t;
import t45.d;
import brd.z;
import s67.q0;
import erd.g;
import crd.b;
import mq5.h;
import mq5.b;
import oq5.c;
import oq5.a;
import y43.a;
import mrd.c;
import x67.j;
import com.kwai.live.gzone.promotion.o$b;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import java.lang.StringBuilder;
import java.lang.ref.WeakReference;
import lnc.b9;
import java.util.List;
import java.util.Map;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import pp.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u37.d;
import u37.e;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.promotion.r;
import com.kwai.live.gzone.promotion.q;
import brd.w;
import erd.c;
import com.kwai.live.gzone.promotion.o$c;
import io.reactivex.internal.functions.Functions;
import s67.p0;
import u67.b$a;
import android.view.View$OnClickListener;
import java.lang.Long;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import s67.r0;
import com.kwai.live.gzone.promotion.s;
import rq5.a;
import pq5.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneQuickPromotionInfo;
import android.app.Activity;
import lnc.a1;
import android.content.Context;
import xh7.b;
import s67.z0;
import qh7.b;
import qh7.a;
import ga1.e;
import lp3.c;
import lp3.i;
import com.kwai.video.waynelive.LivePlayerController;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.live.gzone.promotion.m;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import s67.i1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Collection;
import ekd.q;
import com.kwai.live.gzone.promotion.j$a;
import s67.e;
import d61.y;
import com.kwai.live.gzone.promotion.j;
import s67.a;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterDownloadLogParam;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.model.user.QCurrentUser;
import fg6.a;
import com.google.gson.Gson;
import e17.i;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.kwai.live.gzone.promotion.n;
import s67.g1;
import nl8.m;

public class o extends PresenterV2 implements g	// class@000dd4
{
    public a A;
    public b B;
    public List C;
    public List D;
    public Map E;
    public String F;
    public String G;
    public PublishSubject H;
    public List I;
    public a J;
    public LiveStreamMessages$GzoneQuickPromotionInfo K;
    public boolean L;
    public b M;
    public s N;
    public h O;
    public c P;
    public j Q;
    public c R;
    public h1 S;
    public a p;
    public BaseFeed q;
    public boolean r;
    public b s;
    public b t;
    public a u;
    public d v;
    public d w;
    public a x;
    public i y;
    public c z;

    public void o(){
       super();
       this.D = new ArrayList();
       this.E = new HashMap();
       this.H = PublishSubject.g();
       this.J = a.g();
       this.L = false;
       this.O = new x0(this);
       this.P = new y0(this);
       this.R = new a1(this);
       this.S = new o$a(this);
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "4")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, objArray, a.class, "28");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): b.b().a(LiveGzoneKeys.KEY_SWITCH_LIVE_GZONE_SHOW_PROMOTION_IN_NON_GAME_LIVE).a();
       if (!b && !b.c(this.s).c()) {
          this.r = true;
          return;
       }else if(PatchProxy.applyVoid(objArray, this, oo, "7")){
          this.w.t5("gzonegamedownload", new b1(this));
          this.w.t5("gzonegamepadpanel", new c1(this));
       }
       this.V8().b();
       this.u.u0(665, LiveStreamMessages$SCGzoneGameStoreOpened.class, new v0(this));
       this.u.u0(666, LiveStreamMessages$SCGzoneGameStoreClosed.class, new u0(this));
       this.u.u0(667, LiveStreamMessages$SCGzoneGameStoreRefresh.class, new w0(this));
       this.X7(RxBus.f.f(d.class).observeOn(d.a).subscribe(new q0(this)));
       this.t.Km(this.O);
       this.x.H6(this.P);
       a c1 = this.A.c1;
       if (c1 != null) {
          this.X7(c1.Ye().subscribe(new o$b(this)));
       }
       d.a(-1986139969).registerGlobalDownloadListener("LiveGzoneAudienceGamePromotionPresenter"+this.hashCode(), new WeakReference(this.R));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       if (this.r != null) {
          return;
       }
       b9.a(this.B);
       this.t.le(this.O);
       this.x.Q0(this.P);
       d.a(-1986139969).unregisterGlobalDownloadListener("LiveGzoneAudienceGamePromotionPresenter"+this.hashCode());
       this.R8();
       this.P8();
       this.V8().a();
       this.w.Z4("gzonegamedownload");
       this.w.Z4("gzonegamepadpanel");
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, o.class, "23")) {
          return;
       }
       this.D.clear();
       this.I = null;
       this.E.clear();
       this.F = null;
       this.X8();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, o.class, "26")) {
          return;
       }
       o tQ = this.Q;
       if (tQ != null) {
          tQ.q(0);
          this.Q = null;
       }
       return;
    }
    public final void S8(String p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "10")) {
          return;
       }
       this.v.h(LiveLogTag.GZONE, "getGameList liveStreamId:"+p0);
       if (TextUtils.x(p0)) {
          return;
       }
       t ot = PatchProxy.applyOneRefs(p0, this, oo, "12");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.zip(e.b().q(p0).map(new e()).onErrorReturn(new r(this)), e.b().k(p0).map(new e()), new q(this));
       }
       this.X7(ot.subscribeOn(d.b).observeOn(d.a).subscribe(new o$c(this), Functions.e));
       return;
    }
    public b V8(){
       Object obj = PatchProxy.apply(null, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.M == null) {
          this.M = new b$a(new p0(this));
       }
       return this.M;
    }
    public void W8(String p0,long p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oo, "9")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (p1 - null <= 0) {
          this.S8(p0);
          return;
       }else {
          this.X7(t.timer(k1.k(p1), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new r0(this, p0), Functions.e));
          return;
       }
    }
    public final void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "14")) {
          return;
       }
       o tN = this.N;
       if (tN != null) {
          tN.t = objArray;
          tN.u = objArray;
          this.z.g9(tN);
       }
       return;
    }
    public final boolean Y8(){
       o tN = this.N;
       boolean b = (tN != null && tN.t != null)? true: false;
       return b;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       o tK = this.K;
       if (tK != null && !TextUtils.x(tK.sogamePromotionKwailink)) {
          Activity activity = this.getActivity();
          if (a1.i(activity)) {
             a.b(b.j(activity, this.K.sogamePromotionKwailink), new z0(this));
             this.y.a(e.class).Vc().stopPlay();
          }
       }else {
          this.a9();
          if (this.s != null) {
             i0.a().e(758, this.q).f(m.b).a();
             String str = this.s.d();
             String liveStreamId = this.s.getLiveStreamId();
             String str1 = i1.c(this.q);
             ClientContent$LiveStreamPackage liveStreamPa = this.s.a();
             if (!PatchProxy.applyVoidFourRefs(str, liveStreamId, str1, liveStreamPa, null, i1.class, "2")) {
                i1.d(1, str, liveStreamId, str1, liveStreamPa);
             }
          }
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       if (q.f(this.D) && q.f(this.I)) {
          return;
       }
       j$a uoa = new j$a(this.getActivity());
       e uoe = new e();
       uoe.b = new ArrayList(this.D);
       uoe.c = (this.I != null)? new ArrayList(this.I): new ArrayList();
       uoe.d = this.H;
       uoe.e = this.s;
       uoe.f = this.q;
       uoe.g = this.t;
       uoe.h = this.v;
       uoe.i = this.C;
       uoe.j = this.A;
       uoa.I = uoe;
       uoa.J = y.d(this.getActivity());
       j oj = new j(uoa);
       this.Q = oj;
       uoe.k = oj;
       oj.Z();
       this.p.a();
       return;
    }
    public final void b9(LiveGzonePromotionGame p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "18")) {
          return;
       }
       GameCenterDownloadParams gameCenterDo = new GameCenterDownloadParams();
       gameCenterDo.mDownloadId = p0.mGameId;
       gameCenterDo.mDownloadUrl = p0.mDownloadUrl;
       Object[] objArray = null;
       String str = (j.h(p0.mGameIcons))? objArray: p0.mGameIcons[0].mUrl;
       gameCenterDo.mGameIconUrl = str;
       gameCenterDo.mAction = GameCenterDownloadParams$DownloadAction.START;
       gameCenterDo.mPackageName = p0.mIdentifier;
       gameCenterDo.mGameName = p0.mGameName;
       GameCenterDownloadLogParam gameCenterDo1 = PatchProxy.apply(objArray, this, oo, "19");
       if (gameCenterDo1 != PatchProxyResult.class) {
       }else {
          gameCenterDo1 = new GameCenterDownloadLogParam();
          gameCenterDo1.sceneId = "127";
          gameCenterDo1.authorId = this.s.d();
          gameCenterDo1.photoId = this.s.getLiveStreamId();
          gameCenterDo1.imeiId = TextUtils.k(SystemUtil.m(a.B));
          gameCenterDo1.mFansTopExt = i1.c(this.q);
          gameCenterDo1.userId = QCurrentUser.me().getId();
       }
       gameCenterDo.mLogParam = a.a.q(gameCenterDo1);
       d.a(-1986139969).gameDownload(this.getActivity(), gameCenterDo);
       i.a(R.style.arg_RES_7f11066a, 0x7f102426);
       if (!PatchProxy.applyVoidTwoRefs(gameCenterDo1, p0, this, oo, "20")) {
          e.b().a(p0.mGameId, gameCenterDo1.photoId, gameCenterDo1.authorId, gameCenterDo1.sceneId, TextUtils.k(d.a(-1986139969).getDownloadTraceId(p0.mGameId))).subscribe(Functions.d(), Functions.d());
       }
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, o.class, "25")) {
          return;
       }
       if (!this.V8().j()) {
          return;
       }
       GameCenterDownloadParams$DownloadInfo uDownloadInf = this.E.get(this.F);
       if (!TextUtils.x(this.F) && (uDownloadInf == null || this.Y8())) {
          if (uDownloadInf == null || !uDownloadInf.isDownloadingStatus()) {
             this.V8().f();
          }
       }else {
          this.V8().d(uDownloadInf.getPercent());
       }
       this.G = this.F;
       return;
    }
    public final void d9(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "24")) {
          return;
       }
       if (p0 && !this.V8().j()) {
          oo = this.s;
          if (oo != null) {
             String str = oo.d();
             String liveStreamId = this.s.getLiveStreamId();
             String str1 = i1.c(this.q);
             ClientContent$LiveStreamPackage liveStreamPa = this.s.a();
             if (!PatchProxy.applyVoidFourRefs(str, liveStreamId, str1, liveStreamPa, null, i1.class, "1")) {
                i1.d(6, str, liveStreamId, str1, liveStreamPa);
             }
             i0.a().e(757, this.q).f(n.b).a();
          }
       }
       if (!Boolean.valueOf(p0).equals(this.J.i())) {
          this.J.onNext(Boolean.valueOf(p0));
       }
       this.V8().setVisible(p0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o.class, new g1());
       }else {
          obj.put(o.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.q = this.r8("feed");
       this.p = this.q8(a.class);
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.v = this.r8("LIVE_CONTEXT_DEBUG_LOGGER");
       this.u = this.r8("LIVE_LONG_CONNECTION");
       this.w = this.r8("LIVE_ROUTER_SERVICE");
       this.x = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.y = this.r8("LIVE_SERVICE_MANAGER");
       this.z = this.q8(c.class);
       this.A = this.q8(a.class);
       this.V8().e(this);
       return;
    }
}
