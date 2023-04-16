package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4$b;
import vd5.c;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import java.lang.Object;
import android.view.MotionEvent;
import vd5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
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
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.kwai.slide.play.detail.bottom.atlasplayprogress.AtlasSegmentedProgressBar;
import qrd.l1;
import android.widget.FrameLayout$LayoutParams;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import k99.z;
import android.view.View$OnClickListener;
import k99.a0;
import android.view.ViewParent;
import k99.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import h3.a;
import j99.t;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import de5.a;
import java.util.Set;
import im8.f;
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

public final class HorizontalAtlasExpandPresenterV4$b implements c	// class@001bb6
{
    public final HorizontalAtlasExpandPresenterV4 a;

    public void HorizontalAtlasExpandPresenterV4$b(HorizontalAtlasExpandPresenterV4 p0){
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
       HorizontalAtlasExpandPresenterV4 e;
       HorizontalAtlasExpandPresenterV4 z;
       Activity activity;
       Object[] objArray1;
       HorizontalAtlasExpandPresenterV4 obj = PatchProxy.applyOneRefs(p0, this, HorizontalAtlasExpandPresenterV4$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       HorizontalAtlasExpandPresenterV4$b ta = this.a;
       Objects.requireNonNull(ta);
       obj = HorizontalAtlasExpandPresenterV4.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, obj, "4")) {
          if (ta.A != null) {
             ta.R8("CLICK_LEAVE");
          }else if(PatchProxy.applyVoid(objArray, ta, obj, "10")){
             if (ta.E == null) {
                ta.E = w9.c(ta.getActivity());
             }
             e = ta.E;
             int i = 22;
             if (e != null) {
                z touchDetecto = e.getTouchDetector();
                if (touchDetecto != null) {
                   touchDetecto.a(i);
                }
             }
             e = ta.E;
             if (e != null) {
                e.n(false, i);
             }
             int i1 = -1;
             if (ta.w == null) {
                View view = a.c(LayoutInflater.from(ta.getContext()), R.layout.arg_RES_7f0d0600, ta.S8(), false);
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                ta.w = view;
                view.setClickable(true);
                e = ta.w;
                PhotosViewPager photosViewPa = (e != null)? e.findViewById(R.id.expand_view_pager_photos): objArray;
                ta.B = photosViewPa;
                if (photosViewPa != null) {
                   photosViewPa.setOffscreenPageLimit(2);
                }
                e = ta.w;
                view = (e != null)? e.findViewById(R.id.close_horizontal_atlas_btn): objArray;
                ta.x = view;
                e = ta.w;
                view = (e != null)? e.findViewById(R.id.download_horizontal_atlas_btn): objArray;
                ta.y = view;
                e = ta.p;
                if (e == null) {
                   a.S("mPhoto");
                }
                if (e.isAllowPhotoDownload()) {
                   e = ta.y;
                   if (e != null) {
                      e.setBackgroundResource(R.drawable.arg_RES_7f080a79);
                   }
                }else {
                   e = ta.y;
                   if (e != null) {
                      e.setBackgroundResource(R.drawable.arg_RES_7f080a77);
                   }
                }
                e = ta.w;
                FrameLayout uFrameLayout = (e != null)? e.findViewById(R.id.atlas_player_progress_container): objArray;
                ta.z = uFrameLayout;
                e = ta.p;
                if (e == null) {
                   a.S("mPhoto");
                }
                if (e.getAtlasListSize() <= 1) {
                   e = ta.z;
                   if (e != null) {
                      e.setVisibility(8);
                   }
                }
                e = ta.z;
                if (e != null) {
                   ViewGroup$LayoutParams layoutParams = e.getLayoutParams();
                   if (layoutParams != null) {
                      layoutParams.height = a1.d(0x7f0702ef);
                   }
                }
                Context context = ta.getContext();
                if (context != null) {
                   z = ta.z;
                   if (z != null) {
                      AtlasSegmentedProgressBar uAtlasSegmen = new AtlasSegmentedProgressBar(context);
                      uAtlasSegmen.setEnableFillSegmentAnim(true);
                      FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(i1, a1.d(0x7f0702e3), false);
                      layoutParams1.leftMargin = a1.d(0x7f0702ab);
                      layoutParams1.rightMargin = a1.d(0x7f0702ab);
                      layoutParams1.topMargin = a1.d(0x7f0702a4);
                      z.addView(uAtlasSegmen, layoutParams1);
                   }
                }
                e = ta.z;
                AtlasSegmentedProgressBar uAtlasSegmen1 = (e != null)? e.findViewById(R.id.atlas_segment_progress): objArray;
                ta.G = uAtlasSegmen1;
                e = ta.B;
                if (e != null) {
                   e.addOnPageChangeListener(ta.M);
                }
                e = ta.B;
                if (e != null) {
                   e.addOnPageChangeListener(ta.J);
                }
                e = ta.x;
                if (e != null) {
                   e.setOnClickListener(new z(ta));
                }
                e = ta.y;
                if (e != null) {
                   e.setOnClickListener(new a0(ta));
                }
             }
             e = ta.w;
             ViewParent parent = (e != null)? e.getParent(): objArray;
             if (parent == null) {
                ta.S8().addView(ta.w, i1, i1);
             }
             if (!PatchProxy.applyVoid(objArray, ta, obj, "1")) {
                if (ta.D == null) {
                   ta.D = new v(ta);
                }
                Activity activity1 = ta.getActivity();
                Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                activity1.F2(ta.D);
             }
             e = ta.B;
             a adapter = (e != null)? e.getAdapter(): objArray;
             if (adapter == null) {
                e = ta.B;
                if (e != null) {
                   z = ta.s;
                   if (z == null) {
                      a.S("mPhotoDetailParam");
                   }
                   HorizontalAtlasExpandPresenterV4 t = ta.t;
                   if (t == null) {
                      a.S("mNormalDetailBizParam");
                   }
                   HorizontalAtlasExpandPresenterV4 u = ta.u;
                   if (u == null) {
                      a.S("mPlayModule");
                   }
                   HorizontalAtlasExpandPresenterV4 r = ta.r;
                   if (r == null) {
                      a.S("mDoubleClickContentListeners");
                   }
                   e.setAdapter(new t(z, t, u, r));
                }
             }
             e = ta.F;
             if (e != null) {
                int currentItem = e.getCurrentItem();
                HorizontalAtlasExpandPresenterV4 b = ta.B;
                if (b != null) {
                   b.setCurrentItem(currentItem);
                }
             }
             e = ta.B;
             if (e != null) {
                e.setIsShown(true);
             }
             ta.X8(true);
             ta.A = true;
             e = ta.v;
             if (e == null) {
                a.S("mInnerAtlasExpended");
             }
             e.set(Boolean.TRUE);
             ta.a2("CLICK_ENTER");
             if (!PatchProxy.applyVoidOneRefs("CLICK", ta, obj, "14")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "ENLARGE_PHOTO_CARD";
                i3 oi3 = i3.f();
                oi3.d("enlarge_type", "CLICK");
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                obj = ta.p;
                if (obj == null) {
                   a.S("mPhoto");
                }
                uContentPack.photoPackage = w1.f(obj.getEntity());
                z = ta.q;
                if (z == null) {
                   a.S("mFragment");
                }
                u1.M("", z, 1, uElementPack, uContentPack, null);
             }
             activity = ta.getActivity();
             if (activity != null) {
                objArray = activity.getWindow();
             }
             i5.j(objArray, 0xff000000);
             ta.W8(false);
          }
       }
       return true;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalAtlasExpandPresenterV4$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       return false;
    }
}
