package c42.d;
import qvb.q;
import im8.g;
import k51.c;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import cw9.c;
import c42.d$a;
import c42.d$b;
import c42.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.utility.TextUtils;
import b42.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import kp3.e;
import kp3.a;
import qvb.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import a42.b;
import c42.d$c;
import a42.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.i;
import com.kuaishou.android.model.mix.CoverMeta;
import vb5.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import pm8.a;
import com.yxcorp.gifshow.util.DateUtils;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import java.lang.System;
import hb2.g$b;
import mq5.h;
import mq5.b;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import c42.b;
import android.view.View$OnClickListener;
import java.lang.Throwable;
import qvb.p;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import zj2.b;
import lb2.i;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;
import tq5.c;
import com.kuaishou.live.core.basic.utils.e;
import qvb.i;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import g9c.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import yj2.a;
import com.yxcorp.gifshow.log.c0;
import d61.y;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.robust.PatchProxyResult;
import c42.g;
import java.util.Map;
import java.util.HashMap;
import xj2.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import java.util.Iterator;
import java.lang.CharSequence;
import java.util.Collection;
import ekd.q;

public class d extends c implements q, g	// class@0004b4
{
    public TextView A;
    public a$a B;
    public KwaiImageView C;
    public b D;
    public String E;
    public c F;
    public boolean G;
    public Float H;
    public final a I;
    public final h J;
    public long p;
    public i q;
    public a r;
    public LiveStreamFeed s;
    public LiveAudienceParam t;
    public a0 u;
    public e v;
    public i w;
    public RecyclerView x;
    public View y;
    public View z;
    public static final int K = 0;
    public static String sLivePresenterClassName = "LiveNonSlideChainSideBarPresenter";

    static {
       d.K = c.b(a.a().a().getResources(), 0x7f070c56);
    }
    public void d(){
       super();
       this.E = "";
       this.F = new d$a(this);
       this.G = true;
       this.I = new d$b(this);
       this.J = new c(this);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       a0 l = this.u.l;
       int i = 25;
       if (l != i && l != 61) {
          n.a(this.z);
       }
       String str = TextUtils.k(this.s.getId());
       this.E = str;
       d tq = this.q;
       if (tq instanceof a) {
          tq.l2(str);
       }
       w9.c(this.getActivity()).c(this.v);
       if (!this.v.s()) {
          this.v.a(10);
       }
       this.v.B(this.I);
       this.q.h(this);
       b adapter = this.x.getAdapter();
       this.D = adapter;
       if (adapter == null) {
          adapter = new b(false);
          this.D = adapter;
          this.x.setAdapter(adapter);
       }
       this.D.t1(new d$c(this));
       if (!PatchProxy.applyVoid(objArray, this, uod, "14")) {
          int i1 = this.u.c.getWidth() / 8;
          int i2 = this.u.c.getHeight() / 8;
          if (i1 > 0 && (i2 > 0 && !i.a(this.C))) {
             ImageRequest[] imageRequest = b.e(this.u.c.getCoverMeta(), i1, i2, new a(i));
             if (imageRequest.length) {
                d uod1 = Fresco.newDraweeControllerBuilder();
                uod1.y(this.C.getController());
                uod1.u(imageRequest);
                AbstractDraweeController uAbstractDra = uod1.e();
                this.C.setController(uAbstractDra);
                this.C.setVisibility(8);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "15")) {
          if (!DateUtils.H(a.d())) {
             LiveStreamFeed mLiveSideBar = this.s.mLiveSideBarModel;
             if (mLiveSideBar != null && mLiveSideBar.mDisableChainAutoPopup == null) {
                this.S8();
                a.K0(System.currentTimeMillis());
             }
          }
          a0 l1 = this.u.l1;
          if (l1 != null) {
             l1.a(true);
          }
       }
       this.u.D2.Km(this.J);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.x = this.getActivity().findViewById(0x7f0a303e);
       this.y = this.getActivity().findViewById(0x7f0a303c);
       this.A = this.getActivity().findViewById(0x7f0a303d);
       this.C = this.getActivity().findViewById(0x7f0a303b);
       View view = this.getActivity().findViewById(R.id.photo_feed_side_bar_close_view);
       this.z = view;
       view.setOnClickListener(new b(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "4")) {
          return;
       }
       this.v.B(objArray);
       this.q.f(this);
       this.E = "";
       this.G = true;
       SwipeLayout swipeLayout = w9.c(this.getActivity());
       if (swipeLayout != null) {
          swipeLayout.m(this.v);
       }
       this.u.D2.le(this.J);
       return;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       this.v.o();
       return;
    }
    public void R8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       if (r1.S2(p0.mEntity) && !p0.equals(this.D.r1())) {
          int i = 0;
          this.C.setVisibility(i);
          d tq = this.q;
          if (tq instanceof a) {
             tq.l2(this.E);
          }
          this.P8();
          b.f(this.D, this.x, this.getActivity(), p0);
          this.w.d(p0.mEntity, 61, i);
          if (this.getActivity() instanceof LivePlayActivity) {
             this.u.w1.ub(CloseLiveReason.ENTER_OTHER_LIVE);
             e.v(this.getActivity(), p0.mEntity, 61);
          }
       }
    label_0069 :
       return;
    }
    public void S8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "10")) {
          return;
       }
       this.v.v();
       a0 l1 = this.u.l1;
       if (l1 != null) {
          l1.g(false);
       }
       this.A.setVisibility(8);
       this.q.a();
       if (!PatchProxy.applyVoid(objArray, this, uod, "9")) {
          uod = this.x;
          if (uod != null && uod.getLayoutManager() != null) {
             int i = this.x.getLayoutManager().i0();
             int i1 = this.x.getLayoutManager().c();
             while (i <= i1) {
                if (this.x.getAdapter() != null && this.x.getAdapter().Q0().size() >= i1) {
                   QPhoto qPhoto = this.x.getAdapter().N0(i);
                   if (qPhoto != null && !qPhoto.isShowed()) {
                      ClientContent$LiveStreamPackage liveStreamPa = x.e(qPhoto.getEntity(), 2);
                      int i2 = this.D.s1(qPhoto) + 1;
                      liveStreamPa.showIndexPlusOne = (long)i2;
                      qPhoto.setShowed(1);
                      a.d(qPhoto.mEntity, liveStreamPa, 7, this.u.l);
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
    public void V8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       if (y.d(this.getActivity()) && (p0.getLivePlayConfig().mIsFromLiveMate == null || !p0.getLivePlayConfig().isLandscape())) {
          this.getActivity().setRequestedOrientation(1);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new g());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_SIDE_BAR_PAGE_LIST");
       this.r = this.q8(a.class);
       this.s = this.r8("LIVE_SIDE_BAR_FEED");
       this.t = this.r8("LIVE_AUDIENCE_PARAM");
       this.u = this.q8(a0.class);
       this.w = this.q8(i.class);
       this.v = this.r8("LIVE_SIDE_BAR_MOVEMENT");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "5")) {
          return;
       }
       d tq = this.q;
       if (tq instanceof a && tq.h2() != null) {
          QPhoto qPhoto = this.q.h2();
          if (!PatchProxy.applyVoidOneRefs(qPhoto, this, uod, "6")) {
             User mId = qPhoto.mEntity.mUser.mId;
             Iterator iterator = this.q.getItems().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto1 = iterator.next();
                   if (TextUtils.n(qPhoto1.mEntity.mUser.mId, mId)) {
                      this.q.remove(qPhoto1);
                      this.q.add(false, qPhoto1);
                   }
                }
                if (!q.f(this.q.getItems()) && !TextUtils.n(this.q.getItem(false).mEntity.mUser.mId, mId)) {
                   this.q.add(false, qPhoto);
                }
             }
          }
       }
    label_0097 :
       this.D.W0(this.q.getItems());
       this.D.k0();
       if (!q.f(this.q.getItems())) {
          this.A.setVisibility(8);
       }else {
          this.A.setText(R.string.arg_RES_7f101f04);
          this.A.setVisibility(false);
       }
       if (this.G != null) {
          b.f(this.D, this.x, this.getActivity(), new QPhoto(this.s));
          this.G = false;
       }
       return;
    }
}
