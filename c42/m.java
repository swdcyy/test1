package c42.m;
import qvb.q;
import im8.g;
import k51.c;
import lnc.a1;
import c42.i;
import c42.m$a;
import c42.m$b;
import c42.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.widget.TextView;
import d6a.u;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.view.ViewGroup;
import mq5.h;
import mq5.b;
import qvb.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import a42.b;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import b42.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import c42.n;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import w02.g;
import android.app.Activity;
import com.yxcorp.gifshow.image.KwaiImageView;
import c42.h;
import android.view.View$OnClickListener;
import ekd.k1;
import java.lang.Throwable;
import qvb.p;
import kp3.e;
import com.yxcorp.gifshow.entity.QPhoto;
import cq5.a$a;
import d61.y;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.widget.ImageView;
import zj2.b;
import com.kuaishou.live.core.basic.utils.e;
import c42.l;
import java.lang.Runnable;
import f12.d;
import java.util.Objects;
import f12.c;
import c42.o;
import a42.a;
import joc.z;
import ge5.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kp3.a;
import hb2.g$b;
import joc.q;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.i;
import com.kuaishou.android.model.mix.CoverMeta;
import vb5.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import qvb.n0;
import pp.c;
import com.kuaishou.android.live.log.b;
import dt5.c;
import pm8.a;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import g9c.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import yj2.a;
import com.yxcorp.gifshow.log.c0;
import za2.y;
import lb2.i;
import rb2.g;
import e12.c;
import io.reactivex.subjects.PublishSubject;
import c42.r;
import java.util.Map;
import java.util.HashMap;
import z32.a;
import b42.b;
import cda.i;
import a43.m;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import java.util.Collection;
import ekd.q;
import c42.k;

public class m extends c implements q, g	// class@0004bf
{
    public i A;
    public LiveBizParam B;
    public d C;
    public l D;
    public m E;
    public d F;
    public RecyclerView G;
    public View H;
    public View I;
    public TextView J;
    public a$a K;
    public KwaiImageView L;
    public b M;
    public TextView N;
    public String O;
    public d P;
    public boolean Q;
    public Float R;
    public c S;
    public final a T;
    public final h U;
    public final c p;
    public boolean q;
    public c r;
    public g s;
    public a0 t;
    public a u;
    public LiveStreamFeed v;
    public e w;
    public boolean x;
    public LiveSlidePlayService y;
    public g z;
    public static final int V = 0;
    public static String sLivePresenterClassName = "LiveSlideChainSideBarPresenter";

    static {
       m.V = a1.d(0x7f070c56);
    }
    public void m(boolean p0){
       super();
       this.p = i.b;
       this.q = false;
       this.O = "";
       this.P = new m$a(this);
       this.Q = true;
       this.T = new m$b(this);
       this.U = new j(this);
       this.q = p0;
    }
    public void E8(){
       m tu;
       ViewGroup$MarginLayoutParams layoutParams;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "25")) {
          a0 l = this.t.l;
          if (l != 25 && l != 61) {
             tu = this.I;
             if (tu != null && tu.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                layoutParams = this.I.getLayoutParams();
                layoutParams.topMargin = a1.e(41.00f) + n.A(this.getContext());
                this.I.setLayoutParams(layoutParams);
             }
          }
       }
       if (this.q != null && !PatchProxy.applyVoid(objArray, this, om, "26")) {
          tu = this.N;
          if (tu != null && tu.getVisibility() == 8) {
             if (u.a() && this.N.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                layoutParams = this.N.getLayoutParams();
                layoutParams.topMargin = layoutParams.topMargin + (n.A(this.N.getContext()) - a1.e(2.00f));
             }
             this.N.setVisibility(0);
             this.N.setText(TextUtils.i(this.v.mLiveSideBarModel.mLiveSideIconText, "¸ü¶àÖ±²¥"));
             layoutParams = this.G.getLayoutParams();
             layoutParams.topMargin = layoutParams.topMargin + a1.d(0x7f070310);
             layoutParams.bottomMargin = 0;
             this.G.setLayoutParams(layoutParams);
          }
       }
       this.t.D2.Km(this.U);
       this.u.h(this);
       b adapter = this.G.getAdapter();
       this.M = adapter;
       if (adapter == null) {
          adapter = new b(this.q);
          this.M = adapter;
          this.G.setAdapter(adapter);
       }
       this.u.k2(this.B.mExtraInfo);
       tu = this.u;
       LiveSlidePlayFeedFlowParam liveSlidePla = PatchProxy.apply(objArray, this, om, "4");
       if (liveSlidePla != PatchProxyResult.class) {
       }else {
          LiveBizParam mSlidePlayFe = this.B.mSlidePlayFeedFlowParam;
          liveSlidePla = (mSlidePlayFe != null && !TextUtils.x(mSlidePlayFe.mLiveStreamId))? this.B.mSlidePlayFeedFlowParam.mLiveStreamId: TextUtils.k(this.v.getId());
       }
       tu.j2(liveSlidePla);
       if (this.x != null) {
          if (!PatchProxy.applyVoid(objArray, this, om, "11") && this.y != null) {
             n on = new n(this);
             this.S = on;
             this.y.P4(on);
          }
       }else {
          this.V8();
       }
       if (this.q != null) {
          this.s.a(this);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.G = this.getActivity().findViewById(0x7f0a303e);
       this.H = this.getActivity().findViewById(0x7f0a303c);
       this.J = this.getActivity().findViewById(0x7f0a303d);
       this.N = this.getActivity().findViewById(0x7f0a303f);
       this.L = this.getActivity().findViewById(0x7f0a303b);
       View view = this.getActivity().findViewById(R.id.photo_feed_side_bar_close_view);
       this.I = view;
       view.setOnClickListener(new h(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "7")) {
          return;
       }
       k1.n(this);
       this.t.D2.le(this.U);
       this.u.f(this);
       this.Q = true;
       m ty = this.y;
       if (ty != null) {
          m tS = this.S;
          if (tS != null) {
             ty.d5(tS);
          }
       }
       this.reset();
       if (this.q != null) {
          this.s.b(this);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, m.class, "19")) {
          return;
       }
       this.w.o();
       return;
    }
    public void R8(QPhoto p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "21")) {
          return;
       }
       m tK = this.K;
       if (tK != null) {
          tK.b();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, om, "14") && (this.getActivity() != null && (y.d(this.getActivity()) && (p0.getLivePlayConfig().mIsFromLiveMate == null || !p0.getLivePlayConfig().isLandscape())))) {
          this.getActivity().setRequestedOrientation(1);
       }
    label_0045 :
       if (!PatchProxy.applyVoidOneRefs(p0, this, om, "15") && (r1.S2(p0.mEntity) && !p0.equals(this.M.r1()))) {
          this.L.setVisibility(0);
          this.u.l2(p0.getLiveStreamId());
          b.f(this.M, this.G, this.getActivity(), p0);
          if (e.s(this.getActivity())) {
             k1.s(new l(this, p0), this, 240);
          }
       }
       return;
    }
    public d S8(){
       Activity obj = PatchProxy.apply(null, this, m.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.C == null) {
          obj = this.getActivity();
          Objects.requireNonNull(obj);
          this.C = c.b(obj);
       }
       return this.C;
    }
    public void V8(){
       a0 l11;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "12")) {
          this.M.t1(new o(this));
       }
       String str = TextUtils.k(this.v.getId());
       this.O = str;
       this.u.l2(str);
       b.f(this.M, this.G, this.getActivity(), new QPhoto(this.v));
       this.F.a(this.w);
       this.w.A(m.V);
       this.w.l(this.getActivity());
       this.w.B(this.T);
       if (!this.w.s()) {
          this.w.a(10);
       }
       if (this.w.s()) {
          a0 l1 = this.t.l1;
          if (l1 != null) {
             l1.g(false);
          }
          m tD = this.D;
          if (tD != null) {
             tD.f(true);
          }
          tD = this.E;
          if (tD != null) {
             tD.f(true);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "22")) {
          int i = this.t.c.getWidth() / 8;
          int i1 = this.t.c.getHeight() / 8;
          if (i > 0 && (i1 > 0 && !i.a(this.L))) {
             ImageRequest[] imageRequest = b.e(this.t.c.getCoverMeta(), i, i1, new a(25));
             if (imageRequest.length) {
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-live:live");
                uoa.d(ImageSource.FEED_COVER);
                d uod = Fresco.newDraweeControllerBuilder().r(uoa.a());
                uod.y(this.L.getController());
                uod.u(imageRequest);
                AbstractDraweeController uAbstractDra = uod.e();
                this.L.setController(uAbstractDra);
                this.L.setVisibility(8);
             }
          }
       }
       if (this.q != null) {
          if (!PatchProxy.applyVoid(objArray, this, om, "24")) {
             if (this.u.L0() != null) {
                om = this.u;
                if (om.q != null && om.p != null) {
                   this.X8();
                   this.u.p = false;
                   b.Z(this.p, "openChainSideBarByDefaultIfNeedForNewStyle, 1, hit autoOpenSlideBar");
                }
             }
             b.Z(this.p, "openChainSideBarByDefaultIfNeedForNewStyle, 2, not hit autoOpenSlideBar");
             if (this.W8()) {
                b.Z(this.p, "openChainSideBarDefaultForNewStyle, 2-1, not autoOpen, but isChainSideBarOpen");
                om = this.r;
                if (om != null && !om.c()) {
                   b.Z(this.p, "openChainSideBarDefaultForNewStyle, 2-1-1, not autoOpen, startClearSceen");
                   this.r.f();
                }
             }else {
                b.Z(this.p, "openChainSideBarDefaultForNewStyle, 2-2, not autoOpen, show Pendant");
                l11 = this.t.l1;
                if (l11 != null) {
                   l11.a(true);
                }
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, om, "23")){
          if (!DateUtils.H(a.d())) {
             LiveStreamFeed mLiveSideBar = this.v.mLiveSideBarModel;
             if (mLiveSideBar != null && mLiveSideBar.mDisableChainAutoPopup == null) {
                this.X8();
                a.K0(System.currentTimeMillis());
             }
          }
          l11 = this.t.l1;
          if (l11 != null) {
             l11.a(true);
          }
       }
    label_01a7 :
       if (this.q != null) {
          this.u.k2(this.B.mExtraInfo);
          if (this.u.L0() == null) {
             this.u.a();
          }
       }
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, m.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.w.s();
    }
    public void X8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "18")) {
          return;
       }
       if (this.q != null) {
          m tr = this.r;
          if (tr != null) {
             tr.f();
          }
       }
       this.w.v();
       boolean b = false;
       this.S8().d(b, 14);
       a0 l1 = this.t.l1;
       if (l1 != null) {
          l1.g(b);
       }
       this.J.setVisibility(8);
       if (this.q == null) {
          this.u.a();
       }else if(this.u.L0() == null){
          this.u.a();
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "17")) {
          om = this.G;
          if (om != null && om.getLayoutManager() != null) {
             int i = this.G.getLayoutManager().i0();
             int i1 = this.G.getLayoutManager().c();
             while (i <= i1) {
                if (this.G.getAdapter() != null && this.G.getAdapter().Q0().size() >= i1) {
                   QPhoto qPhoto = this.G.getAdapter().N0(i);
                   if (qPhoto != null && !qPhoto.isShowed()) {
                      qPhoto.setShowed(true);
                      ClientContent$LiveStreamPackage liveStreamPa = x.e(qPhoto.getEntity(), 2);
                      int i2 = this.M.s1(qPhoto) + true;
                      liveStreamPa.showIndexPlusOne = (long)i2;
                      a.d(qPhoto.mEntity, liveStreamPa, 7, this.t.l);
                      r1.g5(qPhoto.mEntity, i);
                      c0.q().k(qPhoto.mEntity);
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public final void Y8(QPhoto p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "16")) {
          return;
       }
       if (this.q == null && TextUtils.n(p0.getPhotoId(), this.t.c.getPhotoId())) {
          return;
       }
       e.d(p0.getLivePlayConfig(), this.getActivity());
       boolean b = y.a(this.getActivity(), this.B);
       int i = 61;
       if (this.q == null) {
          this.P8();
          this.A.d(p0.mEntity, i, false);
       }else if(p1){
          this.A.a(i, false);
       }
       this.z.s();
       this.z.a(this.B.mSlidePlayId, this.u, p0, b, null);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, m.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(m.class, new r());
       }else {
          obj.put(m.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.t = this.q8(a0.class);
       this.z = this.r8("LIVE_SQUARE_REPLACE_FEED_LIST_SERVICE");
       this.A = this.q8(i.class);
       this.v = this.r8("LIVE_SIDE_BAR_FEED");
       this.w = this.r8("LIVE_SIDE_BAR_SWIPE_MOVEMENT");
       this.x = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.class).booleanValue();
       this.y = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.B = this.q8(LiveBizParam.class);
       this.D = this.S8().p().e;
       this.E = this.S8().p().d;
       this.F = this.S8().p();
       b uob = (this.q != null)? a.a().b(this.B): this.r8("LIVE_SIDE_BAR_PAGE_LIST");
       this.u = uob;
       this.r = this.s8(c.class);
       this.s = this.r8("LIVE_AUDIENCE_EVENT_BUS_SERVICE");
       return;
    }
    public void onPhotoReduceEventReceived(i p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "5")) {
          return;
       }
       if (p0.b == null || (!TextUtils.x(p0.a) && m.d(p0.c))) {
          p0 = p0.a;
          if (!PatchProxy.applyVoidOneRefs(p0, this, om, "6")) {
             QPhoto qPhoto = null;
             Iterator iterator = this.u.getItems().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto1 = iterator.next();
                   if (p0.equals(qPhoto1.getLiveStreamId())) {
                      qPhoto = qPhoto1;
                   }
                }
                if (qPhoto == null || (this.C.isEmpty() || (this.C.f() != 1 && this.C.P(qPhoto.mEntity) != (this.C.f() - 1)))) {
                   this.u.remove(qPhoto);
                   this.M.W0(this.u.getItems());
                   this.M.k0();
                   break ;
                }
             }
          }
       }
    label_0089 :
       return;
    }
    public void reset(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "9")) {
          return;
       }
       this.O = "";
       this.w.D(this.getActivity());
       this.F.e(this.w);
       if (this.w.q() == this.T) {
          this.w.B(objArray);
       }
       this.w.g(10);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, om, "10")) {
          return;
       }
       m tu = this.u;
       tu.q = p0;
       if (tu.h2() != null) {
          QPhoto qPhoto = this.u.h2();
          if (!PatchProxy.applyVoidOneRefs(qPhoto, this, om, "13")) {
             User mId = qPhoto.mEntity.mUser.mId;
             Iterator iterator = this.u.getItems().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto1 = iterator.next();
                   if (TextUtils.n(qPhoto1.mEntity.mUser.mId, mId)) {
                      this.u.remove(qPhoto1);
                      this.u.add(false, qPhoto1);
                   }
                }
                if (!q.f(this.u.getItems()) && !TextUtils.n(this.u.getItem(false).mEntity.mUser.mId, mId)) {
                   this.u.add(false, qPhoto);
                }
             }
          }
       }
       this.M.W0(this.u.getItems());
       this.M.k0();
       if (!q.f(this.u.getItems())) {
          this.J.setVisibility(8);
       }else {
          this.J.setText(R.string.arg_RES_7f101f04);
          this.J.setVisibility(false);
       }
       if (this.Q != null) {
          b.f(this.M, this.G, this.getActivity(), new QPhoto(this.v));
          this.Q = false;
       }
       if (this.q != null && e.s(this.getActivity())) {
          k1.p(new k(this), this);
       }
       return;
    }
}
