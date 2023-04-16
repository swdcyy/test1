package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$e;
import qvb.q;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.util.Objects;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import iac.q0;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.relation.explore.view.HorizontalRecyclerView;
import qvb.p;
import com.yxcorp.gifshow.pymk.f;
import java.util.List;
import qvb.a;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.RecoUser;
import qvb.n0;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager;
import android.view.ViewTreeObserver;
import iac.p0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import hcc.f;
import com.kwai.robust.PatchProxyResult;
import hcc.f$a;
import java.lang.Integer;
import fac.c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.view.Window;
import android.app.Activity;
import java.lang.Number;
import android.content.Context;
import lnc.i5;
import cw9.c;
import com.kwai.feature.post.api.util.g;
import android.app.Application;
import o56.a;
import eg.a;
import android.widget.RelativeLayout$LayoutParams;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.a;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$e;
import bac.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import f7c.c;
import a7c.h;
import xl8.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import iac.h0;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import bac.t;
import androidx.recyclerview.widget.RecyclerView$l;
import bac.p;

public final class GalleryPageBigCardPresenter$e implements q	// class@00182b
{
    public final GalleryPageBigCardPresenter b;

    public void GalleryPageBigCardPresenter$e(GalleryPageBigCardPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       GalleryPageBigCardPresenter$e uoe = GalleryPageBigCardPresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoe, "3")) {
          return;
       }
       a.p(p1, "error");
       Log.d("GalleryViewPresenter", "onError: "+p1.getMessage());
       GalleryPageBigCardPresenter.V8(this.b).setVisibility(8);
       if (this.b.w != null) {
          p0.w = false;
       }else {
          int i = 1;
          GalleryPageBigCardPresenter.R8(this.b).d(i);
          GalleryPageBigCardPresenter$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, GalleryPageBigCardPresenter.class, "8")) {
             GalleryPageBigCardPresenter b = tb.B;
             if (b == null) {
                a.S("mRecyclerView");
             }
             b.setVisibility(8);
             b = tb.x;
             if (b == null) {
                a.S("mErrorView");
             }
             b.d(3);
             b.setVisibility(false);
             b.q(3);
             b.i(R.drawable.arg_RES_7f0805f5);
             b.p(new q0(tb));
             View[] viewArray = new View[i];
             GalleryPageBigCardPresenter c = tb.C;
             if (c == null) {
                a.S("mBottomBtnArea");
             }
             viewArray[0] = c;
             n.Z(8, viewArray);
          }
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       GalleryPageBigCardPresenter$e uoe = GalleryPageBigCardPresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoe, "1")) {
          return;
       }
       if (this.b.w == null) {
          GalleryPageBigCardPresenter.V8(this.b).setVisibility(0);
          GalleryPageBigCardPresenter.Y8(this.b).setVisibility(8);
       }
       GalleryPageBigCardPresenter.R8(this.b).setVisibility(8);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       GalleryPageBigCardPresenter$e uoe = GalleryPageBigCardPresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "4")) {
          return;
       }
       if (!GalleryPageBigCardPresenter.W8(this.b).getItems().size()) {
          GalleryPageBigCardPresenter.R8(this.b).d(0);
          this.b.h9();
       }else {
          GalleryPageBigCardPresenter.R8(this.b).setVisibility(8);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       GalleryPageBigCardPresenter$e b1;
       String str3;
       GalleryPageBigCardPresenter c;
       GalleryPageBigCardPresenter a;
       GalleryPageBigCardPresenter b2;
       GalleryPageBigCardPresenter n;
       GalleryPageBigCardPresenter galleryPageB1;
       String str6;
       ViewGroup$LayoutParams layoutParams1;
       CarouselLayoutManager uCarouselLay1;
       String str7;
       String str8;
       String str9;
       int i;
       int i1;
       GalleryPageBigCardPresenter q;
       GalleryPageBigCardPresenter r;
       RecommendUserResponseV2 obj1;
       int i2;
       float f;
       int i5;
       int i6;
       int i7;
       GalleryPageBigCardPresenter p1;
       Object[] objArray1;
       GalleryPageBigCardPresenter$e obj = this;
       GalleryPageBigCardPresenter galleryPageB = GalleryPageBigCardPresenter.class;
       GalleryPageBigCardPresenter$e uoe = GalleryPageBigCardPresenter$e.class;
       String str = "2";
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, uoe, str)) {
          return;
       }
       boolean b = false;
       if (obj.b.w != null) {
          obj.b.w = b;
       }
       GalleryPageBigCardPresenter.V8(obj.b).setVisibility(8);
       GalleryPageBigCardPresenter.R8(obj.b).setVisibility(8);
       GalleryPageBigCardPresenter.Y8(obj.b).setVisibility(b);
       String str1 = "mPageList";
       Object[] objArray = null;
       if (p0) {
          b1 = obj.b;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoid(objArray, b1, galleryPageB, "16")) {
             a = b1.p;
             if (a == null) {
                a.S(str1);
             }
             obj1 = a.i2();
             if (obj1 != null && !q.f(obj1.mFriendUserList)) {
                obj1 = obj1.mFriendUserList;
                a.o(obj1, "newFriendUsers");
                int i8 = obj1.size();
                int i9 = 0;
                while (i9 < i8) {
                   RecoUser recoUser = obj1.get(i9);
                   recoUser = (recoUser != null)? recoUser.mUser: objArray;
                   if (recoUser == null) {
                      recoUser = obj1.get(i9);
                      recoUser = (recoUser != null)? recoUser.mPymkGuideCard: objArray;
                      if (recoUser == null) {
                      label_00aa :
                         i9 = i9 + 1;
                      }
                   }
                   p1 = b1.p;
                   if (p1 == null) {
                      a.S(str1);
                   }
                   p1.d1().add(i9, obj1.get(i9));
                   goto label_00aa ;
                }
             }
          }
       }
       b1 = obj.b;
       Objects.requireNonNull(b1);
       String str2 = "mBottomBtnArea";
       if (PatchProxy.applyVoid(objArray, b1, galleryPageB, "18")) {
          str3 = str2;
       }else {
          a = b1.A;
          if (a == null) {
             CarouselLayoutManager uCarouselLay = new CarouselLayoutManager(b, b);
             uCarouselLay.b0(3);
             String str4 = "mRecyclerView";
             if (!PatchProxy.applyVoid(objArray, b1, galleryPageB, "20")) {
                b2 = b1.B;
                if (b2 == null) {
                   a.S(str4);
                }
                b2.getViewTreeObserver().addOnGlobalLayoutListener(new p0(b1));
             }
             b2 = b1.B;
             if (b2 == null) {
                a.S(str4);
             }
             b2.setLayoutManager(uCarouselLay);
             b2 = b1.B;
             if (b2 == null) {
                a.S(str4);
             }
             ViewGroup$LayoutParams layoutParams = b2.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             f$a b3 = f.b;
             GalleryPageBigCardPresenter z = b1.z;
             String str5 = "mBaseFragment";
             if (z == null) {
                a.S(str5);
             }
             n = b1.N;
             Objects.requireNonNull(b3);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             f$a uoa = f$a.class;
             if (PatchProxy.isSupport(uoa)) {
                galleryPageB1 = n;
                c uoc = PatchProxy.applyTwoRefs(z, Integer.valueOf(n), b3, uoa, "1");
                if (uoc != patchProxyRe) {
                   str6 = str1;
                   layoutParams1 = layoutParams;
                   uCarouselLay1 = uCarouselLay;
                   str7 = str4;
                   str8 = str5;
                label_022f :
                   b1.u = uoc;
                   str9 = "mCardSizeParam";
                   if (uoc == null) {
                      a.S(str9);
                   }
                   i = uoc.g();
                   if (!PatchProxy.isSupport(galleryPageB) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), b1, galleryPageB, "7")) {
                      galleryPageB = b1.C;
                      if (galleryPageB == null) {
                         a.S(str2);
                      }
                      ViewGroup$LayoutParams layoutParams2 = galleryPageB.getLayoutParams();
                      Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                      layoutParams2.width = i;
                      c = b1.u;
                      if (c == null) {
                         a.S(str9);
                      }
                      layoutParams2.topMargin = c.j;
                      c = b1.C;
                      if (c == null) {
                         a.S(str2);
                      }
                      c.setLayoutParams(layoutParams2);
                   }
                   galleryPageB = b1.u;
                   if (galleryPageB == null) {
                      a.S(str9);
                   }
                   layoutParams = layoutParams1;
                   layoutParams.height = galleryPageB.c();
                   galleryPageB = b1.u;
                   if (galleryPageB == null) {
                      a.S(str9);
                   }
                   layoutParams.topMargin = galleryPageB.a();
                   galleryPageB = b1.B;
                   if (galleryPageB == null) {
                      a.S(str7);
                   }
                   galleryPageB.setLayoutParams(layoutParams);
                   t ot = new t();
                   c = b1.B;
                   if (c == null) {
                      a.S(str7);
                   }
                   ot.b(c);
                   CarouselLayoutManager uCarouselLay2 = uCarouselLay1;
                   uCarouselLay2.c0(new a(0.10f, 9));
                   GalleryPageBigCardPresenter p = b1.p;
                   if (p == null) {
                      a.S(str6);
                   }
                   i1 = p.l2();
                   GalleryPageBigCardPresenter z1 = b1.z;
                   if (z1 == null) {
                      a.S(str8);
                   }
                   p = b1.p;
                   if (p == null) {
                      a.S(str6);
                   }
                   List list = b1.a9(p, b1.N);
                   GalleryPageBigCardPresenter t = b1.t;
                   if (t == null) {
                      a.S("mCurrentUserSub");
                   }
                   q = b1.q;
                   if (q == null) {
                      a.S("mPymkListener");
                   }
                   n = b1.O;
                   p = b1.P;
                   GalleryPageBigCardPresenter s = b1.s;
                   if (s == null) {
                      a.S("mPymkParams");
                   }
                   b2 = b1.Q;
                   a = b1.u;
                   if (a == null) {
                      a.S(str9);
                   }
                   r = b1.r;
                   if (r == null) {
                      a.S("mButtonSubject");
                   }
                   str3 = str2;
                   n on = new n(i1, z1, list, t, q, n, p, s, b2, a, r, b1.N, b1.R);
                   b1.A = ot;
                   r = b1.B;
                   if (r == null) {
                      a.S(str7);
                   }
                   r.setAdapter(b1.A);
                   uCarouselLay2.N(new h0(b1));
                   SwipeLayout swipeLayout = w9.c(b1.getActivity());
                   if (swipeLayout != null) {
                      swipeLayout.setFromEdge(true);
                   }
                   r = b1.B;
                   if (r == null) {
                      a.S(str7);
                   }
                   r.setItemAnimator(new t());
                }
             }else {
                galleryPageB1 = n;
             }
             a.p(z, "fragment");
             float a1 = f.a;
             Resources resources = z.getResources();
             str9 = "fragment.resources";
             a.o(resources, str9);
             str8 = str5;
             FragmentActivity activity = z.getActivity();
             a.m(activity);
             str6 = str1;
             a.o(activity, "fragment.activity!!");
             Window window = activity.getWindow();
             uCarouselLay1 = uCarouselLay;
             a.o(window, "activity.window");
             View decorView = window.getDecorView();
             a.o(decorView, "activity.window.decorView");
             i = decorView.getHeight();
             obj1 = PatchProxy.applyOneRefs(z, b3, uoa, "3");
             if (obj1 != patchProxyRe) {
                i2 = obj1.intValue();
                str7 = str4;
             }else {
                str7 = str4;
                Context context = z.getContext();
                a.m(context);
                i2 = (int)(z.getResources().getDimension(0x7f070fdf) + (float)n.A(context));
             }
             i = (i - i2) - i5.b(activity);
             i2 = c.b(resources, R.dimen.arg_RES_7f0700be);
             i1 = c.b(resources, R.dimen.arg_RES_7f070313);
             layoutParams1 = layoutParams;
             boolean b4 = (g.f(activity) == 1)? true: false;
             Resources resources1 = z.getResources();
             a.o(resources1, str9);
             Object obj2 = PatchProxy.applyOneRefs(resources1, b3, uoa, str);
             int i3 = (obj2 != patchProxyRe)? obj2.intValue(): n.y(a.b()) - (a.c(32.00f, resources1) * 2);
             f = (float)i3;
             int i4 = (int)(f / a1) + c.b(resources, 0x7f070334);
             i5 = (i4 + i2) + i1;
             if (i5 <= i) {
                i5 = (i - i5) / 2;
                i6 = i5;
                i7 = (i5 + i4) + i1;
             }else {
                i7 = (i - i4) - i2;
                i6 = 0;
             }
             c uoc1 = new c(((f * 0x3f800000) / (float)a.c((float)350, resources)), i3, i4, i, i6, true, b4, galleryPageB1, false, i7);
             goto label_022f ;
          }else {
             str6 = str1;
             str3 = str2;
             r = b1.p;
             if (r == null) {
                a.S(str6);
             }
             a.O0(b1.a9(r, b1.N));
          }
       }
       obj = this;
       if (!GalleryPageBigCardPresenter.W8(obj.b).getItems().size()) {
          GalleryPageBigCardPresenter.R8(obj.b).d(0);
          obj.b.h9();
       }else {
          View[] viewArray = new View[1];
          c = obj.b.C;
          if (c == null) {
             a.S(str3);
          }
          viewArray[0] = c;
          n.Z(0, viewArray);
       }
       return;
    }
}
