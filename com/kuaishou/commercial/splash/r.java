package com.kuaishou.commercial.splash.r;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.r$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import yx.j0;
import wkd.b;
import tjc.c;
import com.kuaishou.commercial.splash.r$c;
import le5.f;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import android.view.ViewGroup;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import com.kuaishou.commercial.splash.SplashUtils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import ekd.m1;
import yy.t0;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public final class r extends PresenterV2 implements g	// class@00161d
{
    public View p;
    public View q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public View t;
    public View u;
    public NasaBizParam v;
    public Integer w;
    public QPhoto x;
    public r$b y;
    public static final r$a z;

    static {
       r.z = new r$a(null);
    }
    public void r(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       View view = (activity != null)? activity.findViewById(0x1020002): objArray;
       this.q = view;
       r tr = this.r;
       if (tr != null) {
          objArray = tr.getParentFragment();
       }
       this.s = SlidePlayViewModel.S0(objArray);
       StringBuilder str = "mPhoto id :";
       r tx = this.x;
       String str1 = "mPhoto";
       if (tx == null) {
          a.S(str1);
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       j0.f("SplashEyemaxBottomAdapterPresenter", str+tx.getPhotoId(), objArray1);
       if (b.a(-1608526086).D2()) {
          tr = this.x;
          if (tr == null) {
             a.S(str1);
          }
          if (tr.isEyeMax()) {
             this.P8();
             this.R8();
             this.y = new r$c(this);
             return;
          }
       }
       str = "mPhoto is eyemax type:";
       r tx1 = this.x;
       if (tx1 == null) {
          a.S(str1);
       }
       objArray = new Object[i];
       j0.f("SplashEyemaxBottomAdapterPresenter", str+tx1.isEyeMax(), objArray);
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "4")) {
          return;
       }
       if (f.b()) {
          Object[] objArray1 = new Object[0];
          j0.f("SplashEyemaxBottomAdapterPresenter", "begin adapter", objArray1);
          Activity activity = this.getActivity();
          if (activity != null) {
             objArray = activity.findViewById(R.id.status_bar_place_holder_view);
          }
          if (objArray != null) {
             ViewGroup$LayoutParams layoutParams = objArray.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = 0;
             }
          }
          if (objArray != null) {
             objArray.requestLayout();
          }
       }
       return;
    }
    public final void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "5")) {
          return;
       }
       r ts = this.s;
       if (ts != null && f.b()) {
          Object[] objArray1 = new Object[0];
          j0.f("SplashEyemaxBottomAdapterPresenter", "begin adapter", objArray1);
          int i = this.V8();
          Object[] objArray2 = new Object[0];
          j0.f("SplashEyemaxBottomAdapterPresenter", "height :"+i, objArray2);
          VerticalViewPager verticalView = ts.s2();
          if (!verticalView instanceof KwaiGrootViewPager) {
             verticalView = objArray;
          }
          if (verticalView != null) {
             verticalView.setMaxHeight(i);
          }
          ViewGroup$LayoutParams layoutParams = ts.W0();
          if (layoutParams != null) {
             layoutParams.height = i;
          }
          View view = this.m8();
          a.o(view, "rootView");
          view.getLayoutParams().height = i;
          r tt = this.t;
          if (tt != null) {
             layoutParams = tt.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = i;
             }
          }
          tt = this.u;
          if (tt != null) {
             layoutParams = tt.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = i;
             }
          }
          ts.s2().requestLayout();
          Activity activity = this.getActivity();
          if (activity != null) {
             objArray = activity.findViewById(R.id.navigation_bar_place_holder);
          }
          if (objArray != null) {
             ViewGroup$LayoutParams layoutParams1 = objArray.getLayoutParams();
             if (layoutParams1 != null) {
                layoutParams1.height = 0;
             }
          }
          if (objArray != null) {
             objArray.requestLayout();
          }
          this.w = Integer.valueOf(this.S8());
       }
       return;
    }
    public final int S8(){
       Object obj = PatchProxy.apply(null, this, r.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.V8();
       int i1 = 0;
       Object[] objArray = new Object[i1];
       j0.f("SplashEyemaxBottomAdapterPresenter", "getRootHeight :"+i, objArray);
       if (this.W8()) {
          i = i - a1.d(0x7f070bf1);
       }
       Object[] objArray1 = new Object[i1];
       j0.f("SplashEyemaxBottomAdapterPresenter", "getRootHeight1 :"+i, objArray1);
       return i;
    }
    public final int V8(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r obj = PatchProxy.apply(null, this, r.class, "10");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.q;
       if (obj != null) {
          int height = obj.getHeight();
          if (height) {
             return height;
          }
       }
       Object obj1 = PatchProxy.apply(null, null, SplashUtils.class, "58");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          i = n.s(uoc.a()).y;
          if (i <= null) {
             i = n.w(a1.c());
          }
       }
       return i;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, r.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.b();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       View view = (p0 != null)? p0.findViewById(R.id.status_bar_place_holder_view): null;
       this.p = view;
       this.t = m1.f(p0, 0x7f0a3120);
       this.u = m1.f(p0, 0x7f0a3e7f);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, r.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(r.class, new t0());
       }else {
          obj.put(r.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.r = this.r8("DETAIL_FRAGMENT");
       this.v = this.s8(NasaBizParam.class);
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.x = obj;
       return;
    }
}
