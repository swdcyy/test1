package com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import im8.g;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter$audienceMultiPkContainer$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter$a;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter$b;
import rs1.h;
import i81.g;
import t02.a0;
import vq5.d;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a51.c;
import androidx.fragment.app.c$b;
import kq5.b;
import sz1.e;
import lp3.c;
import lp3.i;
import sa3.b;
import com.kwai.robust.PatchProxyResult;
import rs1.j;
import i21.d;
import com.kuaishou.live.viewcontroller.ViewController;
import i21.c;
import java.util.Objects;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import androidx.lifecycle.LifecycleOwner;
import rp5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import i21.g;
import java.util.Map;
import java.util.HashMap;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import n91.e;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g81.c;
import id2.s;
import n91.f;
import com.kuaishou.live.core.show.wishlist.d$c;
import ry1.b;
import eg3.j$b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;

public final class LiveAudienceMultiPkPresenter extends LiveVCHostPresenter implements g	// class@000bb7
{
    public ViewGroup A;
    public c B;
    public b C;
    public d D;
    public b E;
    public d$c F;
    public a0 G;
    public g H;
    public f I;
    public LiveAudienceParam J;
    public final p K;
    public s L;
    public j$b M;
    public boolean N;
    public final CopyOnWriteArraySet O;
    public final c$b P;
    public final a Q;
    public final a R;
    public final b S;
    public i w;
    public e x;
    public b y;
    public h z;
    public static String sLivePresenterClassName = "LiveAudienceMultiPkPresenter";

    public void LiveAudienceMultiPkPresenter(){
       super();
       this.K = s.c(new LiveAudienceMultiPkPresenter$audienceMultiPkContainer$2(this));
       this.O = new CopyOnWriteArraySet();
       this.P = new LiveAudienceMultiPkPresenter$a(this);
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Int>\(\)");
       this.Q = uoa;
       uoa = a.h(Boolean.FALSE);
       a.o(uoa, "BehaviorSubject.createDefault\(false\)");
       this.R = uoa;
       this.S = new LiveAudienceMultiPkPresenter$b(this);
    }
    public static final h W8(LiveAudienceMultiPkPresenter p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("liveAudienceMultiPkController");
       }
       return p0;
    }
    public static final g X8(LiveAudienceMultiPkPresenter p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("liveLayoutManagerService");
       }
       return p0;
    }
    public static final a0 Y8(LiveAudienceMultiPkPresenter p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("livePlayCallerContext");
       }
       return p0;
    }
    public static final d Z8(LiveAudienceMultiPkPresenter p0){
       p0 = p0.D;
       if (p0 == null) {
          a.S("liveRouterManager");
       }
       return p0;
    }
    public static final ViewGroup a9(LiveAudienceMultiPkPresenter p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("multiPkLayoutContainer");
       }
       return p0;
    }
    public void E8(){
       LiveAudienceMultiPkPresenter liveAudience = LiveAudienceMultiPkPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "11")) {
          return;
       }
       super.E8();
       LiveAudienceMultiPkPresenter tC = this.C;
       if (tC == null) {
          a.S("fragmentLifeCycleService");
       }
       tC.c(this.P);
       tC = this.w;
       String str = "liveServiceManager";
       if (tC == null) {
          a.S(str);
       }
       c uoc = tC.a(e.class);
       a.o(uoc, "liveServiceManager.getSe¡­eractManager::class.java\)");
       this.x = uoc;
       tC = this.w;
       if (tC == null) {
          a.S(str);
       }
       uoc = tC.a(b.class);
       a.o(uoc, "liveServiceManager.getSe¡­ffectService::class.java\)");
       this.y = uoc;
       d uod = PatchProxy.apply(objArray, this, liveAudience, "14");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(this);
       }
       this.z = new h(uod);
       liveAudience = this.A;
       if (liveAudience == null) {
          a.S("multiPkLayoutContainer");
       }
       LiveAudienceMultiPkPresenter tz = this.z;
       if (tz == null) {
          a.S("liveAudienceMultiPkController");
       }
       this.E2(liveAudience, tz);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiPkPresenter.class, "12")) {
          return;
       }
       super.J8();
       LiveAudienceMultiPkPresenter tC = this.C;
       if (tC == null) {
          a.S("fragmentLifeCycleService");
       }
       tC.a(this.P);
       c uoc = this.b9();
       Objects.requireNonNull(uoc);
       c uoc1 = c.class;
       if (!PatchProxy.applyVoid(objArray, uoc, uoc1, "9")) {
          uoc.c.removeOnLayoutChangeListener(uoc.g);
          if (!PatchProxy.applyVoid(objArray, uoc, uoc1, "10")) {
             c k = uoc.k;
             if (k instanceof GifshowActivity) {
                uoc = uoc.d;
                if (uoc != null) {
                   k.s3(uoc);
                }
             }
          }
       }
       this.O.clear();
       return;
    }
    public LifecycleOwner V8(){
       LiveAudienceMultiPkPresenter obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       return obj.a(a.class).t();
    }
    public final c b9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public final b c9(){
       LiveAudienceMultiPkPresenter obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          a.S("liveInteractiveEffectService");
       }
       return obj;
    }
    public final i d9(){
       LiveAudienceMultiPkPresenter obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiPkPresenter.class, "9")) {
          return;
       }
       p0 = m1.f(p0, R.id.live_multi_pk_container_layout);
       a.o(p0, "bindWidget\(rootView, R.i¡­ulti_pk_container_layout\)");
       this.A = p0;
       return;
    }
    public final AudienceBizRelation e9(int p0){
       AudienceBizRelation pK = (p0 == 3)? AudienceBizRelation.PK: AudienceBizRelation.LIVE_MULTI_PK;
       return pK;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiPkPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiPkPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceMultiPkPresenter.class, new g());
       }else {
          obj.put(LiveAudienceMultiPkPresenter.class, null);
       }
       return obj;
    }
    public final void h9(UserInfo p0,int p1){
       LiveAudienceMultiPkPresenter liveAudience = LiveAudienceMultiPkPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveAudience, "15")) {
          return;
       }
       liveAudience = this.w;
       if (liveAudience == null) {
          a.S("liveServiceManager");
       }
       liveAudience.a(e.class).g3(new UserProfile(p0), LiveStreamClickType.LIVE_MULTI_PK, 0, p1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiPkPresenter.class, "10")) {
          return;
       }
       LiveAudienceMultiPkPresenter obj = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.FRAGMENT_LIFE_CYCLE_SERVICE\)");
       this.C = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.w = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(LiveCommentsService::class.java\)");
       this.B = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.G = obj;
       this.L = this.t8("LIVE_PK_BOTTOM_BAR_PK_RECOMMEND_GIFT_SERVICE_ID");
       obj = this.w;
       String str = "liveServiceManager";
       if (obj == null) {
          a.S(str);
       }
       c uoc = obj.a(f.class);
       a.o(uoc, "liveServiceManager.getSe¡­TimeProvider::class.java\)");
       this.I = uoc;
       Object obj1 = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj1, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.D = obj1;
       obj1 = this.q8(d$c.class);
       a.o(obj1, "inject\(LiveAudienceWishListService::class.java\)");
       this.F = obj1;
       obj = this.w;
       if (obj == null) {
          a.S(str);
       }
       uoc = obj.a(g.class);
       a.o(uoc, "liveServiceManager.getSe¡­nagerService::class.java\)");
       this.H = uoc;
       obj1 = this.r8("LIVE_AUDIENCE_STATUS_OBTAIN_SERVICE");
       a.o(obj1, "inject\(LiveAccessIds.LIV¡­CE_STATUS_OBTAIN_SERVICE\)");
       this.E = obj1;
       this.M = this.s8(j$b.class);
       this.J = this.t8("LIVE_AUDIENCE_PARAM");
       return;
    }
}
