package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$mPermissionHolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import crd.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xl8.b;
import java.lang.Integer;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.widget.TextView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.pymk.f;
import a7c.h;
import com.yxcorp.gifshow.relation.explore.view.HorizontalRecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mw4.a;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$e;
import qvb.q;
import qvb.a;
import qvb.n0;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$f;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$g;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$h;
import lnc.b9;
import bac.p;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$b;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import nsd.s0;
import java.util.Iterator;
import com.kwai.framework.model.user.RecoUser;
import qvb.i;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$d;
import android.app.Application;
import o56.a;
import java.lang.CharSequence;
import e17.i;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import f7c.c;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$i;
import ok.h;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import tkd.b;
import tkd.d;
import gx5.d;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import vm5.e;
import f7c.d;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;

public final class GalleryPageBigCardPresenter extends PresenterV2	// class@001831
{
    public p A;
    public HorizontalRecyclerView B;
    public ViewGroup C;
    public TextView D;
    public TextView E;
    public int F;
    public final a G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public AnimatorSet M;
    public int N;
    public final PublishSubject O;
    public final PublishSubject P;
    public final b Q;
    public final PublishSubject R;
    public f p;
    public c q;
    public PublishSubject r;
    public h s;
    public PublishSubject t;
    public c u;
    public final p v;
    public boolean w;
    public KwaiEmptyStateView x;
    public KwaiLoadingView y;
    public BaseFragment z;
    public static final GalleryPageBigCardPresenter$a S;

    static {
       GalleryPageBigCardPresenter.S = new GalleryPageBigCardPresenter$a(null);
    }
    public void GalleryPageBigCardPresenter(){
       super();
       this.v = s.c(GalleryPageBigCardPresenter$mPermissionHolder$2.INSTANCE);
       this.F = -1;
       this.G = new a();
       this.N = 1;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Int>\(\)");
       this.O = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<GalleryItemCloseModel>\(\)");
       this.P = publishSubje;
       this.Q = new b(Integer.valueOf(0));
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Int>\(\)");
       this.R = publishSubje;
    }
    public static final PublishSubject P8(GalleryPageBigCardPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mButtonSubject");
       }
       return p0;
    }
    public static final KwaiEmptyStateView R8(GalleryPageBigCardPresenter p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mErrorView");
       }
       return p0;
    }
    public static final TextView S8(GalleryPageBigCardPresenter p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("mFollowBtn");
       }
       return p0;
    }
    public static final KwaiLoadingView V8(GalleryPageBigCardPresenter p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mLoadingView");
       }
       return p0;
    }
    public static final f W8(GalleryPageBigCardPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPageList");
       }
       return p0;
    }
    public static final h X8(GalleryPageBigCardPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mPymkParams");
       }
       return p0;
    }
    public static final HorizontalRecyclerView Y8(GalleryPageBigCardPresenter p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("mRecyclerView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, GalleryPageBigCardPresenter.class, "13")) {
          return;
       }
       this.N = a.r();
       GalleryPageBigCardPresenter tp = this.p;
       String str = "mPageList";
       if (tp == null) {
          a.S(str);
       }
       tp.h(new GalleryPageBigCardPresenter$e(this));
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       tp.load();
       this.X7(this.P.subscribe(new GalleryPageBigCardPresenter$f(this)));
       tp = this.r;
       if (tp == null) {
          a.S("mButtonSubject");
       }
       this.X7(tp.subscribe(new GalleryPageBigCardPresenter$g(this)));
       this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new GalleryPageBigCardPresenter$h(this)));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, GalleryPageBigCardPresenter.class, "24")) {
          return;
       }
       b9.a(this.G);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, GalleryPageBigCardPresenter.class, "17")) {
          return;
       }
       GalleryPageBigCardPresenter tA = this.A;
       if (tA != null) {
          tA.K0();
       }
       return;
    }
    public final void Z8(int p0){
       GalleryPageBigCardPresenter galleryPageB = GalleryPageBigCardPresenter.class;
       if (PatchProxy.isSupport(galleryPageB) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, galleryPageB, "10")) {
          return;
       }
       galleryPageB = this.A;
       int itemCount = (galleryPageB != null)? galleryPageB.getItemCount(): 0;
       if (p0 < (itemCount - 1)) {
          p0++;
          galleryPageB = this.B;
          if (galleryPageB == null) {
             a.S("mRecyclerView");
          }
          galleryPageB.postDelayed(new GalleryPageBigCardPresenter$b(this, p0), 500);
       }
       return;
    }
    public final List a9(f p0,int p1){
       List obj;
       GalleryPageBigCardPresenter galleryPageB = GalleryPageBigCardPresenter.class;
       if (PatchProxy.isSupport(galleryPageB)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, galleryPageB, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.getItems();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.kwai.framework.model.user.RecoUser>");
       obj = s0.g(obj);
       if (p1 != 2) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             RecoUser recoUser = iterator.next();
             if (this.c9(recoUser) || this.d9(recoUser)) {
                continue ;
             }else {
                RecoUser mFeedList = recoUser.mFeedList;
                if (mFeedList == null || mFeedList.isEmpty()) {
                   iterator.remove();
                   p0.remove(recoUser);
                }
             }
          }
       }
       return obj;
    }
    public final ContactPermissionHolder b9(){
       Object obj = PatchProxy.apply(null, this, GalleryPageBigCardPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public final boolean c9(RecoUser p0){
       boolean b = (p0.mType == 2)? true: false;
       return b;
    }
    public final boolean d9(RecoUser p0){
       boolean b = (p0.mType == 3)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryPageBigCardPresenter.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.recycler_view);
       a.o(view, "rootView.findViewById\(R.id.recycler_view\)");
       this.B = view;
       if (view == null) {
          a.S("mRecyclerView");
       }
       view.setInterceptAll(true);
       view = m1.f(p0, R.id.error_view);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.error_view\)");
       this.x = view;
       view = m1.f(p0, R.id.gallery_loading_view);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.gallery_loading_view\)");
       this.y = view;
       p0 = m1.f(p0, R.id.bottom_btn);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.bottom_btn\)");
       this.C = p0;
       String str = "mBottomBtnArea";
       if (p0 == null) {
          a.S(str);
       }
       p0 = m1.f(p0, R.id.change_btn);
       a.o(p0, "ViewBindUtils.bindWidget¡­BtnArea, R.id.change_btn\)");
       this.D = p0;
       GalleryPageBigCardPresenter tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC = m1.f(tC, R.id.follow_btn);
       a.o(tC, "ViewBindUtils.bindWidget¡­BtnArea, R.id.follow_btn\)");
       this.E = tC;
       tC = this.D;
       str = "mChangeBtn";
       if (tC == null) {
          a.S(str);
       }
       TextPaint paint = tC.getPaint();
       a.o(paint, "mChangeBtn.paint");
       paint.setFakeBoldText(true);
       tC = this.D;
       if (tC == null) {
          a.S(str);
       }
       tC.setOnClickListener(new GalleryPageBigCardPresenter$c(this));
       tC = this.E;
       str = "mFollowBtn";
       if (tC == null) {
          a.S(str);
       }
       paint = tC.getPaint();
       a.o(paint, "mFollowBtn.paint");
       paint.setFakeBoldText(true);
       tC = this.E;
       if (tC == null) {
          a.S(str);
       }
       tC.setOnClickListener(new GalleryPageBigCardPresenter$d(this));
       return;
    }
    public final void e9(int p0){
       GalleryPageBigCardPresenter tp;
       GalleryPageBigCardPresenter galleryPageB = GalleryPageBigCardPresenter.class;
       if (PatchProxy.isSupport(galleryPageB) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, galleryPageB, "12")) {
          return;
       }
       galleryPageB = this.p;
       String str = "mPageList";
       if (galleryPageB == null) {
          a.S(str);
       }
       if ((galleryPageB.getCount() - 5) < p0) {
          galleryPageB = this.p;
          if (galleryPageB == null) {
             a.S(str);
          }
          int i = 1;
          if ((galleryPageB.getCount() - i) == p0) {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             if (!tp.hasMore()) {
                i.e(R.style.arg_RES_7f11066a, a.b().getString(R.string.arg_RES_7f10420d), 0);
                return;
             }else if(this.w != null){
                tp = this.y;
                if (tp == null) {
                   a.S("mLoadingView");
                }
                tp.setVisibility(0);
             }
             this.w = false;
          }else {
             this.w = i;
          }
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.load();
       }
       return;
    }
    public final void h9(){
       GalleryPageBigCardPresenter galleryPageB = GalleryPageBigCardPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, galleryPageB, "9")) {
          return;
       }
       GalleryPageBigCardPresenter tB = this.B;
       if (tB == null) {
          a.S("mRecyclerView");
       }
       tB.setVisibility(8);
       tB = this.x;
       if (tB == null) {
          a.S("mErrorView");
       }
       tB.d(0);
       tB.setVisibility(0);
       tB.q(3);
       tB.g(R.string.arg_RES_7f10420d);
       Drawable uDrawable = PatchProxy.apply(objArray, this, galleryPageB, "25");
       if (uDrawable != PatchProxyResult.class) {
       }else {
          galleryPageB = this.B;
          if (galleryPageB == null) {
             a.S("mRecyclerView");
          }
          uDrawable = j.m(galleryPageB, R.drawable.arg_RES_7f0805f7);
          a.o(uDrawable, "DayNightResCompat.getDra¡­emptystate_nopeople_dark\)");
       }
       tB.j(uDrawable);
       View[] viewArray = new View[1];
       GalleryPageBigCardPresenter tC = this.C;
       if (tC == null) {
          a.S("mBottomBtnArea");
       }
       viewArray[0] = tC;
       n.Z(8, viewArray);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, GalleryPageBigCardPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.z = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PymkAccessIds.PAGE_LIST\)");
       this.p = obj;
       obj = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       a.o(obj, "inject\(PymkAccessIds.ITEM_CLICK_LISTENER\)");
       this.q = obj;
       obj = this.r8("PYMK_ACCESS_IDSPYMK_PARAMS");
       a.o(obj, "inject\(PymkAccessIds.PYMK_PARAMS\)");
       this.s = obj;
       obj = this.r8("PYMK_ACCESS_IDScurrentUser");
       a.o(obj, "inject\(PymkAccessIds.KEY_CURRENT_USER\)");
       this.t = obj;
       obj = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       a.o(obj, "inject\(PymkAccessIds.KEY_RECOMMEND_BIGCARD_BUTTON\)");
       this.r = obj;
       return;
    }
    public final void j9(RecoUser p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryPageBigCardPresenter.class, "15")) {
          return;
       }
       RecoUser mFeedList = p0.mFeedList;
       if (mFeedList != null && !mFeedList.isEmpty()) {
          QPhoto qPhoto = Lists.h(p0.mFeedList, GalleryPageBigCardPresenter$i.b).get(0);
          PhotoDetailParam photoDetailP = new PhotoDetailParam(qPhoto);
          d uod = d.a(-1188553266);
          Activity activity = this.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = null;
          }
          String url = (activity != null)? activity.getUrl(): null;
          i oi = uod.gx(p0, url);
          GalleryPageBigCardPresenter tz = this.z;
          if (tz == null) {
             a.S("mBaseFragment");
          }
          url = f.b(tz);
          a.o(url, "SlidePlayDataFetcher.buildFetcherId\(mBaseFragment\)");
          Objects.requireNonNull(oi, "null cannot be cast to non-null type com.yxcorp.gifshow.page.PageList<*, com.yxcorp.gifshow.entity.QPhoto>");
          b.g(j.e(oi, url, SlideMediaType.PHOTO));
          photoDetailP.setSlidePlayId(url);
          activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          d.a(-1818031860).L5(activity, 1025, photoDetailP, null);
          GalleryPageBigCardPresenter ts = this.s;
          if (ts == null) {
             a.S("mPymkParams");
          }
          RecoUser mUser = p0.mUser;
          ts.u().Qe(qPhoto.mEntity, p0, mUser, mUser.mPosition);
       }
       return;
    }
}
