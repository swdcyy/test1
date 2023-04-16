package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$a;
import vd5.c;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import java.lang.Object;
import android.view.MotionEvent;
import vd5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import n99.i;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import n99.j;
import android.view.View$OnClickListener;
import n99.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import n99.l;
import java.lang.Runnable;
import com.smile.gifmaker.mvps.presenter.a;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;
import android.view.ViewParent;
import n99.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import m99.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import y8c.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.view.Window;
import lnc.i5;

public final class VerticalAtlasExpandPresenter$a implements c	// class@001bce
{
    public final VerticalAtlasExpandPresenter a;

    public void VerticalAtlasExpandPresenter$a(VerticalAtlasExpandPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0){
       return false;
    }
    public void onLongPress(MotionEvent p0){
       b.a(this, p0);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       VerticalAtlasExpandPresenter u;
       Activity activity;
       p0 = PatchProxy.applyOneRefs(p0, this, VerticalAtlasExpandPresenter$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       VerticalAtlasExpandPresenter$a ta = this.a;
       Objects.requireNonNull(ta);
       VerticalAtlasExpandPresenter verticalAtla = VerticalAtlasExpandPresenter.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, verticalAtla, "15")) {
          if (ta.K == null) {
             ta.K = w9.c(ta.getActivity());
          }
          VerticalAtlasExpandPresenter k = ta.K;
          if (k != null) {
             z touchDetecto = k.getTouchDetector();
             if (touchDetecto != null) {
                touchDetecto.a(true);
             }
          }
          k = ta.K;
          if (k != null) {
             k.n(false, 5);
          }
          if (!PatchProxy.applyVoid(objArray, ta, verticalAtla, "17")) {
             if (ta.I == null) {
                ViewGroup viewGroup = ta.W8();
                View view = a.c(LayoutInflater.from(ta.getContext()), R.layout.arg_RES_7f0d165c, viewGroup, false);
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                ta.I = view;
                a.m(view);
                view.setClickable(true);
                VerticalAtlasExpandPresenter i = ta.I;
                a.m(i);
                view = i.findViewById(R.id.long_atlas_recycler_view);
                a.o(view, "mExpandRootLayout!!.find¡­long_atlas_recycler_view\)");
                VerticalAtlasExpandPresenter i1 = ta.I;
                a.m(i1);
                ta.B = i1.findViewById(0x7f0a0797);
                i1 = ta.I;
                a.m(i1);
                ta.Y = i1.findViewById(0x7f0a0c14);
                i1 = ta.r;
                if (i1 == null) {
                   a.S("mPhoto");
                }
                if (i1.isAllowPhotoDownload()) {
                   i1 = ta.Y;
                   if (i1 != null) {
                      i1.setBackgroundResource(R.drawable.arg_RES_7f080a79);
                   }
                }else {
                   i1 = ta.Y;
                   if (i1 != null) {
                      i1.setBackgroundResource(R.drawable.arg_RES_7f080a77);
                   }
                }
                i1 = ta.I;
                a.m(i1);
                View view1 = i1.findViewById(R.id.inner_like_anim_view_container);
                a.o(view1, "mExpandRootLayout!!.find¡­like_anim_view_container\)");
                ta.x = view1;
                i1 = ta.I;
                a.m(i1);
                PhotosScaleHelpView photosScaleH = i1.findViewById(R.id.expanded_long_atlas_scale_view);
                ta.G = photosScaleH;
                a.m(photosScaleH);
                photosScaleH.setSpecialView(view);
                i1 = ta.G;
                a.m(i1);
                i1.setAssistListener(new i(ta));
                viewGroup.addView(ta.I);
                k = ta.B;
                if (k != null) {
                   k.setOnClickListener(new j(ta));
                }
                k = ta.Y;
                if (k != null) {
                   k.setOnClickListener(new k(ta));
                }
                view.setNeedIgnoreAfterDetachedFromWindow(true);
                view.setLayoutManager(new LinearLayoutManager(ta.getContext()));
                ta.H = view;
                view.addOnScrollListener(ta.Y0);
                if (ta.R > ta.V0) {
                   k = ta.H;
                   if (k != null) {
                      k.post(new l(ta));
                   }
                }
                ta.P8(false);
                k = ta.I;
                if (k != null) {
                   k.setVisibility(8);
                }
             }
             k = ta.G;
             if (k != null) {
                k.setVerticalPhotosScaleHelper(ta.c1);
             }
          }
          k = ta.I;
          a.m(k);
          if (k.getParent() == null) {
             ta.W8().addView(ta.I, -1, -1);
          }
          if (!PatchProxy.applyVoid(objArray, ta, verticalAtla, "18")) {
             if (ta.J == null) {
                ta.J = new h(ta);
             }
             Activity activity1 = ta.getActivity();
             Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             activity1.F2(ta.J);
          }
          k = ta.I;
          a.m(k);
          if (k.getVisibility()) {
             ta.c9(true);
          }
          k = ta.H;
          RecyclerView$Adapter adapter = (k != null)? k.getAdapter(): objArray;
          if (adapter == null) {
             k = ta.H;
             if (k != null) {
                u = ta.u;
                if (u == null) {
                   a.S("mPhotoDetailParam");
                }
                VerticalAtlasExpandPresenter s = ta.s;
                if (s == null) {
                   a.S("mFragment");
                }
                k.setAdapter(new k(u, s));
             }
          }
          ta.W = false;
          ta.a2("CLICK_ENTER");
          if (!PatchProxy.applyVoidOneRefs("CLICK", ta, verticalAtla, "23")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ENLARGE_PHOTO_CARD";
             i3 oi3 = i3.f();
             oi3.d("enlarge_type", "CLICK");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             verticalAtla = ta.r;
             if (verticalAtla == null) {
                a.S("mPhoto");
             }
             uContentPack.photoPackage = w1.f(verticalAtla.getEntity());
             u = ta.s;
             if (u == null) {
                a.S("mFragment");
             }
             u1.M("", u, 1, uElementPack, uContentPack, null);
          }
          activity = ta.getActivity();
          if (activity != null) {
             objArray = activity.getWindow();
          }
          i5.j(objArray, 0xff000000);
          ta.b9(false);
       }
       return true;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VerticalAtlasExpandPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       return false;
    }
}
