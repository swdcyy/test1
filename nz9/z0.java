package nz9.z0;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import rp7.a;
import jh5.a;
import nz9.z0$d;
import nz9.z0$e;
import nz9.z0$f;
import nz9.z;
import nz9.f0;
import nz9.z0$g;
import nz9.z0$h;
import nz9.s0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import cjd.e;
import erd.o;
import nz9.d;
import erd.g;
import nz9.f;
import crd.b;
import qp7.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.HyperTag;
import java.util.HashMap;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import lnc.i3;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import kp.r1;
import qd5.a;
import up.a;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import java.lang.Long;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.utility.TextUtils;
import k2b.k2;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.google.common.collect.ImmutableMap$b;
import java.util.Map;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import nz9.n0;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import e95.e;
import kotlin.jvm.internal.a;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import ok.x;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import io.reactivex.subjects.PublishSubject;
import qp7.g;
import hs7.e;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import nz9.x;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import az6.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.c;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import z1.a;
import java.lang.Runnable;
import fda.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import nz9.z0$a;
import uf5.i0$a;
import uf5.i0;
import nz9.z0$b;
import mac.a;
import uf5.f0;
import uf5.d0;
import rf5.u;
import p1a.a$a;
import nz9.v0;
import tl8.g;
import p1a.a;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import nl9.b0;
import nz9.w;
import ok.h;
import lnc.b9;
import qp7.a;
import v6a.m0;
import le5.a;
import uw9.v3;
import uw9.l0;
import xx9.a;
import nz9.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.c;
import im8.f;
import jf5.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.content.Context;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import nz9.e;
import os7.a;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import qp7.x0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import ap5.a;
import wh5.a;
import uw9.c;
import android.content.SharedPreferences;
import o56.a;
import lnc.a1;
import os7.a$d;
import pp7.b;
import nz9.e0;
import com.kwai.framework.model.user.FansGroupV2Info;
import com.kwai.component.fansgroup.FansGroupHelper;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo;
import nz9.b0;
import nz9.g0;
import nz9.y;
import rq7.a;
import ms7.a;
import qp7.b1;
import wca.n;
import t45.d;
import brd.z;
import nz9.q;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.trello.rxlifecycle3.components.support.RxFragment;
import nz9.g;
import io.reactivex.internal.functions.Functions;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import nz9.t;
import nz9.j;
import nz9.r;
import nz9.c;
import nz9.k;
import nz9.v;
import nz9.u;
import nz9.s;
import nz9.m;
import nz9.n;
import nz9.x0;
import d0a.l;
import nz9.p;
import eh5.q;
import eh5.i;
import nz9.d0;
import eh5.q$a;
import eh5.v;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import ekd.k1;
import nz9.z0$i;
import uy6.h;
import uy6.b;
import nz9.k0;
import pd5.a;
import os7.a$c;
import com.kwai.framework.model.user.DynamicPendant;
import java.lang.Float;
import nz9.l0;
import com.yxcorp.gifshow.model.CDNUrl;
import i95.b;
import nz9.i;
import fda.b;
import nz9.h;
import nz9.o0;
import nz9.q0;
import nz9.p0;
import nz9.r0;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import nz9.y0;
import eda.l;
import nz9.b;
import oe6.a;
import androidx.fragment.app.DialogFragment;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import android.app.Activity;
import as7.a;
import com.yxcorp.gifshow.autoplay.live.g;
import com.yxcorp.gifshow.autoplay.live.e$a;
import z99.d;
import com.yxcorp.gifshow.autoplay.live.e;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$d;
import nz9.m1;
import java.util.List;
import com.kwai.feature.component.photofeatures.startup.response.LiveWindowConfig;
import wh5.c;
import qp7.c;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Application;
import ou5.b;
import nz9.w0;
import n3d.a;
import n3d.d;
import android.content.Intent;
import ekd.j0;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import jga.f$a;
import jga.f;
import nz9.z0$c;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import oe6.e;
import nz9.t0;
import mxb.j0;
import mxb.i0;
import yy6.c;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import com.yxcorp.gifshow.detail.helper.AvatarTipHelper;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import nz9.m0;
import t45.c;
import nz9.c0;

public abstract class z0 extends DispatchBaseElement	// class@003261
{
    public boolean A;
    public u1 B;
    public Activity C;
    public a D;
    public PhotoDetailParam E;
    public c F;
    public BaseFragment G;
    public a H;
    public HashMap I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public x O;
    public int P;
    public AvatarInfoResponse Q;
    public b R;
    public SlidePlayViewModel S;
    public u T;
    public a U;
    public boolean U0;
    public a V;
    public boolean V0;
    public View$OnClickListener W;
    public g W0;
    public boolean X;
    public boolean X0;
    public PublishSubject Y;
    public long Y0;
    public i0 Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public a c1;
    public final String d1;
    public boolean e1;
    public a f1;
    public NasaBizParam g1;
    public final u1$c h1;
    public ViewPager$i i1;
    public final b1 j1;
    public final Runnable k1;
    public final Runnable l1;
    public final LiveAutoPlay$b m1;
    public final LiveAutoPlay$d n1;
    public final IKwaiMediaPlayer$OnLiveSeiInfoListener o1;
    public boolean t;
    public QPhoto u;
    public Runnable v;
    public GrootViewPager w;
    public Runnable x;
    public Runnable y;
    public String z;
    public static final int p1;

    public void z0(a p0,a p1){
       super(p0, p1);
       this.X = false;
       this.X0 = false;
       this.Z0 = false;
       this.a1 = false;
       this.b1 = false;
       this.d1 = "flow_follow";
       this.e1 = false;
       this.h1 = new z0$d(this);
       this.i1 = new z0$e(this);
       this.j1 = new z0$f(this);
       this.k1 = new z(this);
       this.l1 = new f0(this);
       this.m1 = new z0$g(this);
       this.n1 = new z0$h(this);
       this.o1 = new s0(this);
    }
    public static void n0(z0 p0){
       Objects.requireNonNull(p0);
       z0 oz0 = z0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, oz0, "27")) {
       }else {
          p0.j(b.a(0x330163e).addMissU(p0.u.getUser().getId(), 5).map(new e()).doOnNext(new d(p0)).subscribe(new f(p0)));
          if (!PatchProxy.applyVoid(objArray, p0, oz0, "29")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_VOTE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("loc", "RIGHT_BAR_HEAD_PORTRAIT");
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(p0.u.mEntity);
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
    public final boolean A0(){
       Object obj = PatchProxy.apply(null, this, z0.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b1 = true;
       return this.b1;
    }
    public boolean B0(boolean p0){
       z0 oz0 = z0.class;
       if (PatchProxy.isSupport(oz0)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oz0, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (!this.u.useLive() || (this.P != b || this.H().i0())) {
          b = false;
       }
       return b;
    }
    public final boolean C0(){
       Object obj = PatchProxy.apply(null, this, z0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.B0(b) || (this.Q == null || (this.Q.mLiveAvatarType != 2 || this.Q.mLiveWindowConfig == null))) {
          b = false;
       }
       return b;
    }
    public boolean D0(){
       z0 obj = PatchProxy.apply(null, this, z0.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && (obj.mEntity != null && (obj.getPhotoMeta() != null && (this.u.getPhotoMeta().mHyperTag != null && this.u.getPhotoMeta().mHyperTag.mPymlFollowingIntensifyType == 2))))? true: false;
       return b;
    }
    public final boolean E0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z0 oz0 = z0.class;
       String obj = PatchProxy.apply(null, this, oz0, "68");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.u.getUserId();
       Object obj1 = PatchProxy.applyOneRefs(obj, this, oz0, "60");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): Boolean.TRUE.equals(this.I.get(obj));
       b = (this.z0() && (b && (this.E.getSource() == 16 || this.E.getSource() == 262)))? true: false;
       return b;
    }
    public final boolean F0(){
       Object obj = PatchProxy.apply(null, this, z0.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.z0() && this.u.getUser().mFavorited != null)? true: false;
       return b;
    }
    public void G0(boolean p0){
       z0 oz0 = z0.class;
       if (PatchProxy.isSupport(oz0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz0, "81")) {
          return;
       }
       i3 oi3 = i3.f();
       int i = 1;
       oi3.c("questionnaire_link", Integer.valueOf((TextUtils.isEmpty(this.u.getQuestionnaireLink()) ^ i)));
       oi3.d("is_live", (String.valueOf(this.B0(i))).toUpperCase());
       oi3.d("is_popup", (String.valueOf(this.C0())).toUpperCase());
       String str = (p0)? "POPUP": "ICON";
       oi3.d("click_pos", str);
       oi3.d("anthor_is_live_judge", (String.valueOf(this.y0())).toUpperCase());
       String str1 = "e_commerce_judge";
       oi3.d(str1, (String.valueOf(this.X)).toUpperCase());
       String str2 = "shop_cart_judge";
       oi3.d(str2, (String.valueOf(this.X)).toUpperCase());
       if (r1.T1(this.u.getEntity()) != null) {
          oi3.a("is_favorite", Boolean.valueOf(r1.T1(this.u.getEntity()).mFavorited));
       }
       oi3.d("head_position", "RIGHT_BAR");
       str = (this.B0(i))? "1": "0";
       oi3.d("live_tag", str);
       str = this.v0();
       if (str != null) {
          oi3.d("live_type", str);
       }
       str = this.u0();
       if (str != null) {
          oi3.d("live_room_type", str);
       }
       oi3.d("comment_tips_content", a.a(this.u));
       if (this.u.getActionReportFetcher() != null && this.u.getActionReportFetcher().a() != null) {
          oi3.c("play_cnt", Integer.valueOf(this.u.getActionReportFetcher().a().mPlayCnt));
          oi3.c("play_time", Long.valueOf(this.u.getActionReportFetcher().a().mActionRelativeTime));
       }
       str = oi3.e();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str3 = (this.B0(i))? "live": "not_live";
       uElementPack.name = str3;
       uElementPack.action2 = "CLICK_HEAD";
       uElementPack.params = str;
       int i1 = (this.W != null)? 1: 2;
       uElementPack.status = i1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.u.getEntity());
       if (this.u.getQuestionnaireInfo() != null && !TextUtils.isEmpty(this.u.getQuestionnaireInfo().mKsOrderId)) {
          ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
          ksOrderInfoP.ksOrderId = this.u.getQuestionnaireInfo().mKsOrderId;
          uContentPack.ksOrderInfoPackage = ksOrderInfoP;
       }
       AvatarInfoResponse mPhoto = (this.Q != null)? this.Q.mPhoto: null;
       if (this.B0(i) && mPhoto != null) {
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.identity = TextUtils.k(mPhoto.getLiveStreamId());
          uContentPack.liveStreamPackage = liveStreamPa;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0(str1, (String.valueOf(this.X)).toUpperCase());
       jsonObject.c0(str2, (String.valueOf(this.X)).toUpperCase());
       JsonObject jsonObject1 = new JsonObject();
       jsonObject1.G("CLICK_HEAD", jsonObject);
       k2 d = (u1.j() != null && !TextUtils.isEmpty(u1.j().d))? u1.j().d: "";
       CommonParams uCommonParam = a.b(this.E.mPhoto);
       ImmutableMap$b uob = new ImmutableMap$b().f(ImmutableMap.of(d, jsonObject1));
       if (uCommonParam == null) {
          uCommonParam = new CommonParams();
       }else {
          CommonParams mEntryTag = uCommonParam.mEntryTag;
          if (mEntryTag != null) {
             uob.f(mEntryTag);
          }
       }
       uCommonParam.mEntryTag = uob.a();
       u1.B(new ClickMetaData().setLogPage(this.G).setIsRealTime(false).setCommonParams(uCommonParam).setType(810).setFeedLogCtx(this.u.getFeedLogCtx()).setElementPackage(uElementPack).setContentPackage(uContentPack));
       Kgi.c(new n0(uContentPack));
       return;
    }
    public final void H0(){
       e a;
       if (PatchProxy.applyVoid(null, this, z0.class, "61")) {
          return;
       }
       if (this.U0 == null && this.J != null) {
          boolean b = true;
          this.U0 = b;
          boolean fansGroupV2J = this.u.getUser().getFansGroupV2JoinedState();
          z0 tu = this.u;
          z0 tG = this.G;
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidFourRefs(Boolean.TRUE, Boolean.valueOf(fansGroupV2J), tu, tG, null, e.class, "5")) {
             a.p(tu, "photo");
             a = e.a;
             ClientEvent$ElementPackage uElementPack = a.d(b, fansGroupV2J);
             uElementPack.action2 = "FANS_GROUP_ICON_SHOW";
             ClientContent$ContentPackage uContentPack = a.c(tu);
             u1.D0("", tG, 6, uElementPack, uContentPack, null);
          }
       }
       return;
    }
    public void I0(boolean p0){
       z0 oz0 = z0.class;
       if (PatchProxy.isSupport(oz0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz0, "31")) {
          return;
       }
       this.O.get().setEntryAuthorProfileCnt((this.O.get().getEntryAuthorProfileCnt() + 1));
       this.Y.onNext(this.u.getPhotoId());
       this.G0(p0);
       Object[] objArray = null;
       if (this.u.isQuestionnaire()) {
          e uoe = this.D();
          Objects.requireNonNull(uoe);
          if (!PatchProxy.applyVoid(objArray, uoe, e.class, "7")) {
             uoe.b.onNext(Boolean.TRUE);
          }
       }else if(VisitorModeManager.g(14)){
          x b = x.b;
          HashMap hashMap = new HashMap();
          hashMap.put("clickType", Integer.valueOf(13));
          z0 tC = this.C;
          z0 tE = this.E;
          PhotoDetailParam mPhoto = tE.mPhoto;
          QPreInfo preInfo = tE.getDetailCommonParam().getPreInfo();
          a mPhotoIndex = this.E.mPhotoIndex;
          int i = 1;
          z0 tW = this.W;
          if (k.B(this.E.mPhoto) == null) {
             b = objArray;
          }
          c.d(tC, mPhoto, preInfo, mPhotoIndex, i, tW, b, hashMap, this.z);
          if (this.W == null) {
             z0 tg1 = this.g1;
             if (tg1 != null && (tg1.getNasaSlideParam() != null && this.g1.getNasaSlideParam().mNasaSlideSerialParam != null)) {
                d.a(-1694791652).Ko(this.g1.getNasaSlideParam().mNasaSlideSerialParam.mPreCommercialPhoto, this.u, 120, objArray);
             }
          }
       }
    label_00df :
       return;
    }
    public final void J0(){
       if (PatchProxy.applyVoid(null, this, z0.class, "37")) {
          return;
       }
       if (this.M == null) {
          z0 tv = this.v;
          if (tv != null) {
             tv.run();
          }else {
             this.I0(false);
          }
       }
       return;
    }
    public void K0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0.class, "84")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       c uoc = new c();
       uoc.a("flow_follow");
       uoc.b(p0);
       RxBus.f.b(uoc);
       return;
    }
    public void L0(boolean p0){
       z0 oz0 = z0.class;
       if (PatchProxy.isSupport(oz0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz0, "20")) {
          return;
       }
       if (p0) {
          if (this.F0()) {
             return;
          }else {
             this.j(this.Z.b(new z0$a(this)));
          }
       }else if(!this.F0()){
          return;
       }else {
          z0 tZ = this.Z;
          z0$b uob = new z0$b(this);
          Objects.requireNonNull(tZ);
          b uob1 = PatchProxy.applyOneRefs(uob, tZ, i0.class, "3");
          if (uob1 != PatchProxyResult.class) {
          }else {
             uob.c();
             uob1 = b.a(-1975598500).c(tZ.b.getUser().getId()).map(new e()).subscribe(new f0(tZ, uob), new d0(uob));
          }
          this.j(uob1);
       }
       return;
    }
    public void M0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z0.class, "42")) {
          return;
       }
       if (this.J == null || (this.K != null || (this.L != null && this.T.q() - 0x3f800000 >= 0))) {
          if (this.Q != null) {
             objArray = this.Q.mPhoto;
          }
          i3 oi3 = i3.f();
          oi3.d("is_live", (String.valueOf(this.B0(true))).toUpperCase());
          oi3.d("is_popup", (String.valueOf(this.C0())).toUpperCase());
          oi3.d("anthor_is_live_judge", (String.valueOf(this.y0())).toUpperCase());
          oi3.d("head_position", "RIGHT_BAR");
          oi3.d("e_commerce_judge", (String.valueOf(this.X)).toUpperCase());
          oi3.d("shop_cart_judge", (String.valueOf(this.X)).toUpperCase());
          if (r1.T1(this.u.getEntity()) != null) {
             oi3.a("is_favorite", Boolean.valueOf(r1.T1(this.u.getEntity()).mFavorited));
          }
          String str = (this.B0(true))? "1": "0";
          oi3.d("live_tag", str);
          str = this.v0();
          if (str != null) {
             oi3.d("live_type", str);
          }
          str = this.u0();
          if (str != null) {
             oi3.d("live_room_type", str);
          }
          String str1 = oi3.e();
          z0 tV = this.V;
          int i = 319;
          String str2 = (this.B0(true))? "live": "not_live";
          a$a uoa = a$a.s(i, str2);
          uoa.h(new v0(this, objArray));
          uoa.m(str1);
          uoa.r(true);
          tV.b(uoa);
          this.K = true;
       }
    label_00fc :
       return;
    }
    public final void N0(){
       if (PatchProxy.applyVoid(null, this, z0.class, "6")) {
          return;
       }
       z0 tw = this.w;
       if (tw != null) {
          tw.m0(this.i1);
       }
       return;
    }
    public final void O0(AvatarInfoResponse p0){
       z0 oz0 = z0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oz0, "39")) {
          return;
       }
       this.Q = p0;
       AvatarInfoResponse mType = (p0 != null)? p0.mType: 3;
       this.P = mType;
       if (this.B0(true)) {
          p0 = p0.mPhoto;
          if (p0 != null) {
             d.a(0x37593069).dH(this.u.mEntity, p0.mEntity);
             r1.q5(this.u.mEntity, true);
             this.W = this.s0(p0);
          }
          if (!PatchProxy.applyVoid(null, this, oz0, "40")) {
             z0 tR = this.R;
             if (tR == null) {
                this.R = b9.c(tR, new w(this));
             }
          }
       }else {
          this.W = null;
       }
       return;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, z0.class, "1")) {
       }else {
          a c = p0.c;
          this.u = c.mPhoto;
          this.C = p0.a;
          this.D = p0.i;
          this.c1 = p0.j;
          m0 o = p0.o;
          this.V = o;
          this.E = c;
          m0 v = p0.v;
          this.F = v.f;
          this.G = p0.b;
          this.A = v.s2.c();
          if (this.D0() || this.A0()) {
             u1 ou1 = new u1(this.G, p0.k, p0.x, p0.z);
             this.B = ou1;
             ou1.h = this.h1;
          }
          this.T = p0.v.R;
          this.S = SlidePlayViewModel.B0(this.G.getParentFragment());
          this.f1 = p0.o0;
          v = p0.v;
          this.H = v.Y;
          this.U = v.r2;
          this.O = p0.p;
          this.Y = v.w1;
          this.Z = new i0(this.C, this.u);
          this.I = v.f1;
          this.g1 = p0.h;
          this.j(v.X.F.subscribe(new e(this)));
          PatchProxy.onMethodExit(z0.class, "1");
       }
       return;
    }
    public void P0(){
       Object[] objArray1;
       Boolean fALSE;
       boolean b;
       boolean b1;
       FansGroupV2Info$UserInfo userInfo;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z0 oz0 = z0.class;
       if (PatchProxy.applyVoid(null, this, oz0, "15")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "AvatarAndFollowBaseElement";
       o.C().w(str, "updateFollowStatus: "+this.u.getUserName(), objArray);
       this.V0 = i;
       if (this.E0()) {
          this.E().o(Boolean.TRUE);
       }else {
          this.E().o(Boolean.FALSE);
       }
       if (this.u.isQuestionnaire()) {
          if (!PatchProxy.applyVoid(null, this, oz0, "52")) {
             objArray1 = new Object[i];
             o.C().w(str, "updateQuestionnaireLink", objArray1);
             this.E().y(Boolean.TRUE);
             fALSE = Boolean.FALSE;
             this.E().t(fALSE);
             this.E().s(fALSE);
             this.E().r(fALSE);
             this.E().m(fALSE);
             this.E().x(fALSE);
          }
       }else {
          int i1 = 1;
          if (k.B(this.u) != null) {
             PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[i1];
             uAdGroupArra[i] = PhotoAdvertisement$AdGroup.THIRD_PLATFORM;
             if (k.B(this.u).isAdGroup(uAdGroupArra)) {
                if (!PatchProxy.applyVoid(null, this, oz0, "53")) {
                   objArray1 = new Object[i];
                   o.C().w(str, "updateWithAd", objArray1);
                   fALSE = Boolean.FALSE;
                   this.E().y(fALSE);
                   this.E().s(fALSE);
                   this.E().t(fALSE);
                   this.E().r(fALSE);
                   this.E().m(fALSE);
                   this.E().x(fALSE);
                }
                this.v = null;
             }
          }
          a obj = PatchProxy.apply(null, this, oz0, "69");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.z0() && this.u.enableSpecialFocus()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             if (!PatchProxy.applyVoid(null, this, oz0, "54")) {
                objArray = new Object[i];
                o.C().w(str, "updateWithSpecialFocus", objArray);
                Boolean fALSE1 = Boolean.FALSE;
                this.E().y(fALSE1);
                this.E().s(fALSE1);
                this.E().t(Boolean.valueOf((this.F0() ^ i1)));
                this.E().p(Boolean.TRUE);
                this.E().r(fALSE1);
                this.E().m(fALSE1);
                this.E().x(fALSE1);
                this.t = i1;
                if (this.J != null) {
                   obj = PatchProxy.apply(null, this, oz0, "66");
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(NasaSlidePlayExperimentUtil.d() && (d.a(-2061018968).AT() || a.f())){
                      b = false;
                   }else {
                      b = true;
                   }
                   if (b) {
                      obj = this.E();
                      if (this.t != null) {
                         Object obj1 = PatchProxy.apply(null, this, oz0, "65");
                         if (obj1 != patchProxyRe) {
                            b1 = obj1.booleanValue();
                         }else if(c.a.getInt("specialFocusBubbleShowVersion", i) != a.q){
                            b1 = true;
                         }else {
                            b1 = false;
                         }
                         if (b1) {
                            i = true;
                         }
                      }
                      Boolean uBoolean = Boolean.valueOf(i);
                      String str1 = PatchProxy.apply(null, this, oz0, "62");
                      if (str1 != patchProxyRe) {
                      }else {
                         z0 tu = this.u;
                         String str2 = (tu != null && (tu.getUser() != null && this.u.getUser().isMale()))? a1.p(R.string.arg_RES_7f104c89): a1.p(R.string.arg_RES_7f104c88);
                         str1 = str2;
                      }
                      Objects.requireNonNull(obj);
                      if (!PatchProxy.applyVoidTwoRefs(uBoolean, str1, obj, uoa, "18")) {
                         a$d uod = new a$d();
                         uod.a = uBoolean.booleanValue();
                         uod.b = str1;
                         obj.g.f(uod);
                      }
                   }
                }
             }
             this.v = new e0(this);
          }else if(this.z0()){
             if (FansGroupHelper.b(this.u.getFansGroupInfo()) && !this.H().i0()) {
                if (FansGroupHelper.c(this.u.getFansGroupInfo())) {
                   a uoa1 = this.E();
                   Integer integer = Integer.valueOf(this.u.getUser().getFansGroupLevel());
                   Objects.requireNonNull(uoa1);
                   if (!PatchProxy.applyVoidOneRefs(integer, uoa1, uoa, "37")) {
                      uoa1.r.f(integer);
                   }
                   this.H0();
                   if (!PatchProxy.applyVoid(null, this, oz0, "57")) {
                      objArray1 = new Object[i];
                      o.C().w(str, "updateWithJoinedFansGroup", objArray1);
                      fALSE = Boolean.FALSE;
                      this.E().y(fALSE);
                      this.E().s(fALSE);
                      this.E().t(fALSE);
                      this.E().p(fALSE);
                      Boolean tRUE = Boolean.TRUE;
                      this.E().r(tRUE);
                      this.E().m(tRUE);
                      this.E().x(fALSE);
                   }
                }else {
                   FansGroupV2Info fansGroupInf = this.u.getFansGroupInfo();
                   if (fansGroupInf != null && fansGroupInf.mEnableFansGroupV2 != null) {
                      fansGroupInf = fansGroupInf.mUserInfo;
                      if (fansGroupInf != null) {
                         userInfo = fansGroupInf.mShowGuidance;
                      label_0316 :
                         if (userInfo != null) {
                            this.H0();
                            if (!PatchProxy.applyVoid(null, this, oz0, "56")) {
                               objArray1 = new Object[i];
                               o.C().w(str, "updateWithNotJoinFansGroup", objArray1);
                               fALSE = Boolean.FALSE;
                               this.E().y(fALSE);
                               this.E().s(fALSE);
                               this.E().t(fALSE);
                               this.E().p(fALSE);
                               this.E().r(Boolean.TRUE);
                               this.E().m(fALSE);
                               this.E().x(fALSE);
                            }
                         }else if(this.E0()){
                            this.V0 = i1;
                            this.S0();
                            this.y = new b0(this);
                         }else {
                            this.R0();
                         }
                      }
                   }
                   userInfo = null;
                   goto label_0316 ;
                }
                this.x = new g0(this);
             }else if(this.E0()){
                this.V0 = i1;
                this.S0();
                this.y = new b0(this);
             }else {
                this.R0();
             }
             this.v = null;
          }else if(PatchProxy.applyVoid(null, this, oz0, "55")){
             objArray1 = new Object[i];
             o.C().w(str, "updateWithUnFollowed", objArray1);
             fALSE = Boolean.FALSE;
             this.E().y(fALSE);
             this.E().s(fALSE);
             this.E().t(Boolean.TRUE);
             this.E().p(fALSE);
             this.E().r(fALSE);
             this.E().m(fALSE);
             this.E().x(fALSE);
          }
          this.v = new y(this);
       }
       return;
    }
    public final void Q0(String p0,boolean p1){
       z0 oz0 = z0.class;
       if (PatchProxy.isSupport(oz0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oz0, "59")) {
          return;
       }
       this.I.put(p0, Boolean.valueOf(p1));
       return;
    }
    public final void R0(){
       if (PatchProxy.applyVoid(null, this, z0.class, "51")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("AvatarAndFollowBaseElement", "updateWithFollowed", objArray);
       Boolean fALSE = Boolean.FALSE;
       this.E().y(fALSE);
       this.E().s(fALSE);
       this.E().t(fALSE);
       this.E().r(fALSE);
       this.E().m(fALSE);
       this.E().x(fALSE);
       return;
    }
    public void S(){
       z0 oz0 = z0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz0, "82")) {
          return;
       }
       if (this.V0 != null && !PatchProxy.applyVoid(objArray, this, oz0, "28")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_VOTE";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("loc", "RIGHT_BAR_HEAD_PORTRAIT");
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.u.mEntity);
          u1.u0(6, uElementPack, uContentPack);
       }
       return;
    }
    public final void S0(){
       if (PatchProxy.applyVoid(null, this, z0.class, "58")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("AvatarAndFollowBaseElement", "updateWithNoPoke", objArray);
       Boolean fALSE = Boolean.FALSE;
       this.E().y(fALSE);
       this.E().s(fALSE);
       this.E().t(fALSE);
       this.E().p(fALSE);
       this.E().r(fALSE);
       this.E().m(fALSE);
       this.E().x(Boolean.TRUE);
       return;
    }
    public a f0(a p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, z0.class, "78");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(p0);
       }
       return uoa;
    }
    public void j0(boolean p0){
       z a;
       b uob1;
       b uob2;
       q oq;
       z0 d;
       long l;
       boolean b2;
       String str = this;
       z0 oz0 = z0.class;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(oz0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), str, oz0, "4")) {
          return;
       }
       z0 g1 = str.g1;
       if (g1 != null && (g1.getNasaSlideParam() != null && str.g1.getNasaSlideParam().mNasaSlideSerialParam != null)) {
          str.z = str.g1.getNasaSlideParam().mNasaSlideSerialParam.mCommercialActiveCallback;
       }
    label_003b :
       boolean b = false;
       str.M = b;
       str.N = b;
       str.X = b;
       str.P = 3;
       str.e1 = this.F0();
       str.i(str.j1);
       RxBus f = RxBus.f;
       a = d.a;
       str.j(f.f(n.class).observeOn(a).subscribe(new q(str)));
       if (this.H().l()) {
          GrootViewPager grootViewPag = str.S.d1(GrootViewPager.class);
          str.w = grootViewPag;
          grootViewPag.i0(str.i1);
          str.j(str.G.m().subscribe(new g(str), Functions.e));
       }
       Object[] objArray = null;
       String str1 = "14";
       boolean b1 = true;
       if (!PatchProxy.applyVoid(objArray, str, oz0, str1)) {
          Object obj = PatchProxy.apply(objArray, str, oz0, "67");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else if(this.z0() && (str.u.enableMissYou() && this.H().Q != null)){
             b2 = true;
          }else {
             b2 = false;
          }
          if (b2) {
             str.Q0(str.u.getUserId(), b1);
          }
       }
       User user = str.u.getUser();
       if (user != null) {
          z0 g = str.G;
          if (g != null) {
             user.startSyncWithFragment(g.m());
             str.j(user.observable().subscribe(new t(str), Functions.e));
          }
       }
       b i = str.i;
       j oj = new j(str);
       g e = Functions.e;
       Objects.requireNonNull(i);
       b uob = PatchProxy.applyTwoRefs(oj, e, i, uoa, "20");
       String str2 = "onError";
       String str3 = "onNext";
       if (uob != patchProxyRe) {
       }else {
          a.p(oj, str3);
          a.p(e, str2);
          uob = i.a.subscribe(oj, e);
          a.o(uob, "followBubbleShow.subscribe\(onNext, onError\)");
       }
       str.j(uob);
       str.j(str.i.f(new r(str), e));
       str.j(str.i.c(new c(str), e));
       if (this.q0()) {
          i = str.i;
          k ok = new k(str);
          Objects.requireNonNull(i);
          uob = PatchProxy.applyTwoRefs(ok, e, i, uoa, "12");
          if (uob != patchProxyRe) {
          }else {
             a.p(ok, str3);
             a.p(e, str2);
             uob = i.d.subscribe(ok, e);
             a.o(uob, "avatarLongClickSubject.subscribe\(onNext, onError\)");
          }
          str.j(uob);
          i = str.i;
          v ov = new v(str);
          Objects.requireNonNull(i);
          uob1 = PatchProxy.applyTwoRefs(ov, e, i, uoa, str1);
          if (uob1 != patchProxyRe) {
          }else {
             a.p(ov, str3);
             a.p(e, str2);
             uob1 = i.l.subscribe(ov, e);
             a.o(uob1, "spFollowBubbleClickSubje¡­ubscribe\(onNext, onError\)");
          }
          str.j(uob1);
          uob1 = str.i;
          u ou = new u(str);
          Objects.requireNonNull(uob1);
          uob2 = PatchProxy.applyTwoRefs(ou, e, uob1, uoa, "16");
          if (uob2 != patchProxyRe) {
          }else {
             a.p(ou, str3);
             a.p(e, str2);
             uob2 = uob1.m.subscribe(ou, e);
             a.o(uob2, "spFollowBubbleShowSubjec¡­ubscribe\(onNext, onError\)");
          }
          str.j(uob2);
       }
       str.j(str.i.d(new s(str), e));
       uob1 = str.i;
       m om = new m(str);
       Objects.requireNonNull(uob1);
       uob2 = PatchProxy.applyTwoRefs(om, e, uob1, uoa, "6");
       if (uob2 != patchProxyRe) {
       }else {
          a.p(om, str3);
          a.p(e, str2);
          uob2 = uob1.i.subscribe(om, e);
          a.o(uob2, "fansGroupBtnSubject.subscribe\(onNext, onError\)");
       }
       str.j(uob2);
       uob1 = str.i;
       n on = new n(str);
       Objects.requireNonNull(uob1);
       b uob3 = PatchProxy.applyTwoRefs(on, e, uob1, uoa, "8");
       if (uob3 != patchProxyRe) {
       }else {
          a.p(on, str3);
          a.p(e, str2);
          uob3 = uob1.j.subscribe(on, e);
          a.o(uob3, "pokeBtnClickSubject.subscribe\(onNext, onError\)");
       }
       str.j(uob3);
       str.j(str.i.e(new x0(str), e));
       if (this.D0()) {
          str.j(f.f(l.class).observeOn(a).subscribe(new p(str)));
       }
       this.E().h();
       q$a m = q.m;
       i a1 = i.a;
       d0 uod0 = new d0(str);
       str1 = "AvatarAndFollowBaseElement observeAvatarInfo";
       Objects.requireNonNull(m);
       if (PatchProxy.isSupport(q$a.class)) {
          oq = PatchProxy.applyFourRefs(a1, uod0, Long.valueOf(0), str1, m, q$a.class, "2");
          if (oq != patchProxyRe) {
          label_02af :
             if (!PatchProxy.applyVoidOneRefs(oq, str, DispatchBaseElement.class, "13")) {
                a.p(oq, "runnable");
                DispatchBaseElement r = str.r;
                if (r != null) {
                   SlideTaskDispatcher slideTaskDis = r.c();
                   if (slideTaskDis != null) {
                      l = slideTaskDis.e(oq);
                   label_02d0 :
                      if (l < 0) {
                         k1.o(oq);
                      }
                   }
                }
                l = -1;
                goto label_02d0 ;
             }
             str.i(new z0$i(str));
             if (user != null) {
                User mDynamicPend = user.mDynamicPendant;
                User mPendants = user.mPendants;
                if (mPendants != null || mDynamicPend != null) {
                   a$c uoc = new a$c();
                   if (mDynamicPend != null) {
                      String lottieUrl = mDynamicPend.getLottieUrl();
                      Float widthRadio = mDynamicPend.getWidthRadio();
                      Float heightRadio = mDynamicPend.getHeightRadio();
                      if (lottieUrl != null && (widthRadio != null && heightRadio != null)) {
                         uoc.a = lottieUrl;
                         uoc.b = widthRadio.floatValue();
                         uoc.c = heightRadio.floatValue();
                      label_0331 :
                         d = str.D;
                         if (str.u.getPosition() <= 0 || !h.a.a()) {
                            b1 = false;
                         }
                         d.a(b1, new l0(str, user, uoc, mPendants));
                      }
                   }
                   uoc = objArray;
                   goto label_0331 ;
                }else {
                   d = str.D;
                   b = (str.u.getPosition() > 0 && h.a.a())? true: false;
                   d.a(b, new k0(str, user));
                }
             }
             str.j(f.f(b.class).subscribe(new i(str)));
             if (this.A0()) {
                str.j(f.f(b.class).subscribe(new h(str)));
             }
             this.P0();
             if (!PatchProxy.applyVoid(objArray, str, oz0, "7") && str.u.isAd()) {
                int i1 = -1694791652;
                uob3 = d.a(i1).w4(str.G, str.u, new o0(str), new q0(str));
                if (uob3 != null) {
                   str.j(uob3);
                }
                str.j(d.a(i1).of(str.u, new p0(str), new r0(str)));
             }
             RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
             str.j(f.g(n.class, mAIN).subscribe(new y0(str)));
             t ot = f.g(l.class, mAIN);
             str.j(ot.subscribe(new b(str)));
             return;
          }
       }
       oq = q$a.c(m, a1, uod0, 0, str1, false, 16, null);
       goto label_02af ;
    }
    public void k0(boolean p0){
       if (PatchProxy.isSupport(z0.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, z0.class, "83");
       }
       return;
    }
    public void l0(boolean p0){
       z0 oz0 = z0.class;
       if (PatchProxy.isSupport(oz0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz0, "64")) {
          return;
       }
       z0 tB = this.B;
       if (tB != null) {
          tB.b();
       }
       this.E().g();
       this.E().w(Boolean.FALSE, null, false);
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(z0.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, z0.class, "80")) {
          return;
       }
       this.L = false;
       this.K = false;
       this.U0 = false;
       this.X = false;
       this.N0();
       b9.a(this.R);
       this.O0(null);
       k1.m(this.l1);
       k1.m(this.k1);
       this.x0();
       return;
    }
    public boolean o0(){
       boolean b;
       z0 oz0 = z0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, oz0, "44");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (a.F() && (!this.u.getUser().isFollowingOrFollowRequesting() && (!this.D0() && (this.A == null && !this.S.r())))) {
          obj = this.E();
          Objects.requireNonNull(obj);
          Boolean uBoolean = PatchProxy.apply(objArray, obj, a.class, "17");
          if (uBoolean == patchProxyRe) {
             uBoolean = obj.f.a();
          }
          if (uBoolean.booleanValue()) {
             z0 tG = this.G;
             Object obj1 = PatchProxy.applyOneRefs(tG, objArray, oz0, "48");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else {
                for (; tG != null; tG = tG.getParentFragment()) {
                   if (tG instanceof DialogFragment) {
                      objArray = tG;
                      break ;
                   }
                }
             }
             if (objArray != null || (this.m != null && !SlideGuideManager.a().b(this.C))) {
                b = false;
             label_008d :
                return b;
             }
          }
       }
    label_008c :
       b = true;
       goto label_008d ;
    }
    public synchronized final void p0(AvatarInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0.class, "11")) {
          return;
       }
       if (!this.C0()) {
          return;
       }
       if (p0.mPhoto == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("AvatarAndFollowBaseElement", "onCreateLivePlay", objArray);
       e$a uoa = new e$a(p0.mPhoto.mEntity, this.G, 24, ":ks-features:ft-feed:detail");
       uoa.i(14);
       uoa.c(d.a(this.G));
       boolean b = true;
       uoa.d(b);
       uoa.e(b);
       this.W0 = new g(uoa.b());
       this.W0.P(this.m1);
       this.W0.O(this.n1);
       if (m1.a()) {
          z0 tW0 = this.W0;
          z0 to1 = this.o1;
          Objects.requireNonNull(tW0);
          if (!PatchProxy.applyVoidOneRefs(to1, tW0, g.class, "38")) {
             tW0.f.add(to1);
          }
       }
       this.W0.startPlay();
       this.W0.mute();
       this.Y0 = p0.mLiveWindowConfig.liveWindowShowPeriod;
       k1.r(this.l1, p0.mLiveWindowConfig.liveWindowShowTime);
       return;
    }
    public boolean q0(){
       Object obj = PatchProxy.apply(null, this, z0.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.H().f1 > null && (!this.u.isMine() && (!c.b() && !VisitorModeManager.f())))? true: false;
       return b;
    }
    public c r(){
       a uoa = PatchProxy.apply(null, this, z0.class, "77");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void r0(){
       JsonObject obj;
       z0 oz0 = z0.class;
       if (PatchProxy.applyVoid(null, this, oz0, "22")) {
          return;
       }
       z0 oz01 = this.C;
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).ne(oz01, this.u.getFullSource(), "photo_follow", 14, a.B.getString(R.string.arg_RES_7f103077), this.u.mEntity, null, null, new w0(this)).h();
          return;
       }else {
          String str = j0.f(oz01.getIntent(), "arg_photo_exp_tag");
          Object[] objArray = new Object[2];
          String str1 = "_";
          String str2 = (this.E.getDetailCommonParam().getPreUserId() == null)? str1: this.E.getDetailCommonParam().getPreUserId();
          objArray[0] = str2;
          if (this.E.getDetailCommonParam().getPrePhotoId() != null) {
             str1 = this.E.getDetailCommonParam().getPrePhotoId();
          }
          objArray[1] = str1;
          String str3 = String.format("%s/%s", objArray);
          this.u.getUser().mPage = "photo";
          str1 = oz01.Q2();
          if (this.H().P0 != null) {
             obj = PatchProxy.applyOneRefs(str1, this, oz0, "23");
             if (obj != PatchProxyResult.class) {
                str1 = obj;
             }else if(TextUtils.isEmpty(str1)){
                String str4 = "16,";
                if (str1.startsWith(str4)) {
                   str1 = str1.replace(str4, "145,");
                }
             }
          }
          obj = new JsonObject();
          obj.a0("ActionRelativeTime", Long.valueOf(this.c1.getPlayer().getCurrentPosition()));
          f$a uoa = new f$a(this.u.getUser(), str1);
          uoa.c(this.u.getFullSource());
          uoa.o(oz01.getUrl()+"#follow");
          uoa.g(str);
          uoa.f(this.u.getExpTag());
          uoa.n(str3);
          uoa.q(1);
          uoa.m(this.u);
          FollowHelper.c(uoa.a("bizCustomParams", obj.toString()).b(), new z0$c(this));
          this.u.getUser().setFollowStatus(User$FollowStatus.FOLLOWING);
          e.f0(0);
          Kgi.c(new t0(this));
          i0.a().t(14, this.u.mEntity);
          this.F.b();
          return;
       }
    }
    public View$OnClickListener s0(QPhoto p0){
       return null;
    }
    public ImageRequest[] t0(User p0,HeadImageSize p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, z0.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.i(p0, p1);
    }
    public final String u0(){
       if (this.Q != null && this.Q.mDynamicEffectMarker != null) {
          return this.Q.mDynamicEffectMarker.mLiveType;
       }
       return null;
    }
    public final String v0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, z0.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Q == null || (this.Q.mDynamicEffectMarker == null || (!TextUtils.isEmpty(this.Q.mDynamicEffectMarker.mIcon) && this.Q.mDynamicEffectMarker.mIsBlocked == null))) {
          objArray = String.valueOf(this.Q.mDynamicEffectMarker.mStyle);
       }
    label_0039 :
       return objArray;
    }
    public void w0(){
       int i;
       z0 tu;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z0.class, "75")) {
          return;
       }
       AvatarInfoResponse uAvatarInfoR = (this.Q != null)? this.Q.mPhoto: objArray;
       if (uAvatarInfoR == null) {
          return;
       }else if(r1.Q2(this.u)){
          i = 284;
       }else {
          i = 224;
       }
       if (this.H().W != null) {
          boolean b = TextUtils.isEmpty(this.Q.mLiveTipLink);
          tu = this.u;
          AvatarTipHelper.c(this.G, tu, (r1.y1(tu.mEntity) + 1), uAvatarInfoR, null, true, false, null, false, i);
       }else {
          tu = this.u;
          AvatarTipHelper.b(this.G, tu, (r1.y1(tu.mEntity) + 1), uAvatarInfoR, null, true, true, this.E, this.v0(), this.u0(), i);
       }
       z0 tg1 = this.g1;
       if (tg1 != null && (tg1.getNasaSlideParam() != null && this.g1.getNasaSlideParam().mNasaSlideSerialParam != null)) {
          d.a(-1694791652).Ko(this.g1.getNasaSlideParam().mNasaSlideSerialParam.mPreCommercialPhoto, this.u, 124, objArray);
       }
    label_009d :
       r1.q5(this.u.mEntity, 2);
       return;
    }
    public synchronized void x0(){
       z0 oz0 = z0.class;
       if (PatchProxy.applyVoid(null, this, oz0, "13")) {
          return;
       }
       if (this.W0 != null) {
          this.W0.Z(this.m1);
          this.W0.Y(this.n1);
          if (m1.a()) {
             this.W0.X(this.o1);
          }
          z0 tW0 = this.W0;
          if (PatchProxy.applyVoidOneRefs(tW0, this, oz0, "10")) {
          }else if(tW0 == null){
          }else {
             m0 om0 = new m0(this, tW0);
             if (NasaSlidePlayExperimentUtil.a()) {
                c.a(om0);
             }else {
                om0.run();
             }
          }
          this.W0 = null;
          this.a1 = false;
       }
       k1.o(new c0(this));
       return;
    }
    public boolean y0(){
       boolean b = true;
       if (this.P == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean z0(){
       Object obj = PatchProxy.apply(null, this, z0.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.ME.isLogined() && (this.u.getUser() != null && this.u.getUser().isFollowingOrFollowRequesting()))? true: false;
       return b;
    }
}
