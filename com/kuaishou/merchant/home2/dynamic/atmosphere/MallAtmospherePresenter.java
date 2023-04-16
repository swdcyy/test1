package com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter$onBind$1;
import ix3.c;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import b04.d;
import com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter$onBind$2;
import lnc.a1;
import com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter$onUnbind$1;
import com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter$onUnbind$2;
import android.view.View;
import wsd.m;
import androidx.core.view.ViewKt;
import java.util.Iterator;
import com.kuaishou.merchant.home2.dynamic.atmosphere.model.ChunkInfo;
import com.yxcorp.widget.selector.view.SelectShapeView;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.utility.TextUtils;
import bld.b;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import com.kuaishou.merchant.basic.MerchantLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import java.util.ArrayList;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Number;
import com.google.gson.JsonElement;
import fg6.a;
import jx3.a;
import com.google.gson.Gson;
import java.lang.Boolean;
import zf6.k;
import ey3.a;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.pagedy.container.widget.KwaiStaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import xw3.e;
import ix3.b;
import xw3.c;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import ekd.m1;

public final class MallAtmospherePresenter extends PresenterV2	// class@00171f
{
    public d p;
    public ViewGroup q;
    public LinearLayout r;
    public FrameLayout s;
    public View t;
    public int u;
    public int v;
    public int w;
    public int x;
    public static final MallAtmospherePresenter$a y;

    static {
       MallAtmospherePresenter.y = new MallAtmospherePresenter$a(null);
    }
    public void MallAtmospherePresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MallAtmospherePresenter.class, "4")) {
          return;
       }
       MallAtmospherePresenter tp = this.p;
       String str = "mHomePageViewModel";
       if (tp == null) {
          a.S(str);
       }
       Activity activity = this.getActivity();
       String str1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity";
       Objects.requireNonNull(activity, str1);
       tp.H0(activity, new c(new MallAtmospherePresenter$onBind$1(this)));
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       Activity activity1 = this.getActivity();
       Objects.requireNonNull(activity1, str1);
       tp.I0(activity1, new c(new MallAtmospherePresenter$onBind$2(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, MallAtmospherePresenter.class, "3")) {
          return;
       }
       this.w = a1.h();
       return;
    }
    public void J8(){
       MallAtmospherePresenter mallAtmosphe = MallAtmospherePresenter.class;
       if (PatchProxy.applyVoid(null, this, mallAtmosphe, "5")) {
          return;
       }
       MallAtmospherePresenter tp = this.p;
       String str = "mHomePageViewModel";
       if (tp == null) {
          a.S(str);
       }
       tp.O0(new c(new MallAtmospherePresenter$onUnbind$1(this)));
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       tp.Q0(new c(new MallAtmospherePresenter$onUnbind$2(this)));
       if (!PatchProxy.applyVoid(null, this, mallAtmosphe, "6")) {
          mallAtmosphe = this.t;
          if (mallAtmosphe != null) {
             this.Z8(mallAtmosphe);
          }
          mallAtmosphe = this.r;
          if (mallAtmosphe != null) {
             Iterator iterator = ViewKt.f(mallAtmosphe).iterator();
             while (iterator.hasNext()) {
                this.Z8(iterator.next());
             }
          }
          this.t = null;
          this.r = null;
       }
       return;
    }
    public final void P8(ChunkInfo p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MallAtmospherePresenter.class, "30")) {
          return;
       }
       if (!p1 instanceof SelectShapeView) {
          return;
       }
       p0 = p0.bgColors;
       if (p0 != null && !q.f(p0)) {
          int i = 0x7f062057;
          int i1 = TextUtils.J(p0.get(0), a1.a(i));
          int i2 = (p0.size() == 1)? i1: TextUtils.J(p0.get(1), a1.a(i));
          b uob = new b();
          uob.l(i1, i2);
          p1.setBackground(uob.a());
       }
       return;
    }
    public final void R8(ChunkInfo p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MallAtmospherePresenter.class, "25")) {
          return;
       }
       if (!p1 instanceof MerchantKwaiImageView) {
          return;
       }
       p1.L(p0.skinResource);
       return;
    }
    public final void S8(ChunkInfo p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MallAtmospherePresenter.class, "28")) {
          return;
       }
       if (!p1 instanceof MerchantLottieAnimationView) {
          return;
       }
       p1.setAnimationFromUrl(p0.skinResource);
       p1.setRepeatCount(-1);
       p1.s();
       return;
    }
    public final View V8(ChunkInfo p0){
       SelectShapeView selectShapeV;
       MerchantLottieAnimationView merchantLott;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MallAtmospherePresenter mallAtmosphe = MallAtmospherePresenter.class;
       ChunkInfo obj = PatchProxy.applyOneRefs(p0, this, mallAtmosphe, "24");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.type;
       boolean b = true;
       if (obj != b) {
          if (obj != 2) {
             if (obj != 3) {
                selectShapeV = PatchProxy.applyOneRefs(p0, this, mallAtmosphe, "31");
                if (selectShapeV != patchProxyRe) {
                }else {
                   selectShapeV = new SelectShapeView(this.getContext());
                   this.P8(p0, selectShapeV);
                }
             }else {
                selectShapeV = PatchProxy.applyOneRefs(p0, this, mallAtmosphe, "29");
                if (selectShapeV != patchProxyRe) {
                }else {
                   merchantLott = new MerchantLottieAnimationView(this.getContext());
                   merchantLott.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
                   this.S8(p0, merchantLott);
                label_004e :
                   selectShapeV = merchantLott;
                }
             }
          }else {
             selectShapeV = PatchProxy.applyOneRefs(p0, this, mallAtmosphe, "27");
             if (selectShapeV != patchProxyRe) {
             }else {
                merchantLott = new MerchantKwaiImageView(this.getContext());
                merchantLott.setScaleType(ImageView$ScaleType.CENTER);
                merchantLott.setAnimateEnabled(b);
                this.R8(p0, merchantLott);
                goto label_004e ;
             }
          }
       }else {
          selectShapeV = PatchProxy.applyOneRefs(p0, this, mallAtmosphe, "26");
          if (selectShapeV != patchProxyRe) {
          }else {
             merchantLott = new MerchantKwaiImageView(this.getContext());
             merchantLott.setScaleType(ImageView$ScaleType.CENTER);
             this.R8(p0, merchantLott);
             goto label_004e ;
          }
       }
       return selectShapeV;
    }
    public final void W8(ArrayList p0){
       MallAtmospherePresenter ts;
       ChunkInfo obj;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MallAtmospherePresenter.class, "19")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MallAtmospherePresenter.class, "32") && this.s == null) {
          Context context1 = this.getContext();
          if (context1 != null) {
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
             FrameLayout uFrameLayout = new FrameLayout(context1);
             this.s = uFrameLayout;
             uFrameLayout.setTag("mall_atmosphere_container");
             ts = this.s;
             if (ts != null) {
                ts.setLayoutParams(layoutParams);
                MallAtmospherePresenter tq = this.q;
                if (tq == null) {
                   a.S("mRootView");
                }
                tq.addView(ts, 0);
             }
          }
       }
       ts = this.s;
       if (ts != null) {
          ts.removeAllViews();
          int i = 1;
          ChunkInfo uChunkInfo = p0.remove((p0.size() - i));
          if (uChunkInfo != null) {
             MallAtmospherePresenter tt = this.t;
             MallAtmospherePresenter mallAtmosphe = PatchProxy.applyTwoRefs(uChunkInfo, tt, this, MallAtmospherePresenter.class, "21");
             if (mallAtmosphe != PatchProxyResult.class) {
             }else if(tt != null){
                obj = uChunkInfo.type;
                ChunkInfo uChunkInfo2 = 3;
                int i2 = 2;
                if (obj != i) {
                   if (obj != i2) {
                      String str = (obj != uChunkInfo2)? 1: tt instanceof MerchantLottieAnimationView;
                   }else {
                      v8 = tt instanceof MerchantKwaiImageView;
                   }
                }else {
                   v8 = tt instanceof MerchantKwaiImageView;
                }
                if (str) {
                   if (!PatchProxy.applyVoidTwoRefs(uChunkInfo, tt, this, MallAtmospherePresenter.class, "22")) {
                      obj = uChunkInfo.type;
                      if (obj != i && obj != i2) {
                         if (obj != uChunkInfo2) {
                            this.P8(uChunkInfo, tt);
                         }else {
                            this.S8(uChunkInfo, tt);
                         }
                      }else {
                         this.R8(uChunkInfo, tt);
                      }
                   }
                }else {
                   tt = this.V8(uChunkInfo);
                }
                if (tt != null) {
                   mallAtmosphe = tt;
                }
             }
             mallAtmosphe = this.V8(uChunkInfo);
             ts.addView(mallAtmosphe);
             this.t = mallAtmosphe;
          }
          if (!q.f(p0)) {
             if (!PatchProxy.applyVoid(objArray, this, MallAtmospherePresenter.class, "20") && this.r == null) {
                Context context = this.getContext();
                if (context != null) {
                   LinearLayout linearLayout = new LinearLayout(context);
                   this.r = linearLayout;
                   linearLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
                   linearLayout.setOrientation(i);
                }
             }
             MallAtmospherePresenter tr = this.r;
             if (tr != null) {
                tr.removeAllViews();
                ts.addView(tr);
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   ChunkInfo uChunkInfo1 = iterator.next();
                   View view = this.V8(uChunkInfo1);
                   obj = PatchProxy.applyOneRefs(uChunkInfo1, this, MallAtmospherePresenter.class, "23");
                   if (obj != PatchProxyResult.class) {
                      i1 = obj.intValue();
                   }else {
                      obj = uChunkInfo1.height;
                      if (obj <= null) {
                         i1 = -2;
                      }else if(uChunkInfo1.scaling != null){
                         uChunkInfo1 = uChunkInfo1.width;
                         if (uChunkInfo1 > null) {
                            float f = (float)obj * 0x3f800000;
                            f = f * (float)this.w;
                            f = f / (float)uChunkInfo1;
                            i1 = (int)f;
                         }
                      }
                      float f1 = (float)obj * 0x3f800000;
                      i1 = a1.e(f1);
                   }
                   tr.addView(view, new LinearLayout$LayoutParams(-1, i1));
                }
             }
          }
       }
       return;
    }
    public final void X8(JsonElement p0){
       boolean b;
       MallAtmospherePresenter mallAtmosphe = MallAtmospherePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mallAtmosphe, "16")) {
          return;
       }
       try{
          a uoa = a.a.c(p0, a.class);
          Object[] objArray = null;
          a darkModeAtmo = (uoa != null)? uoa.darkModeAtmosphere: objArray;
          String str = (darkModeAtmo == null || darkModeAtmo.isEmpty())? 1: null;
          if (!str) {
             Object obj = PatchProxy.apply(objArray, this, mallAtmosphe, "15");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): k.d();
             if (b) {
                b = true;
             label_0046 :
                this.a9(false);
                if (b) {
                   if (uoa != null) {
                      uoa = uoa.darkModeAtmosphere;
                      if (uoa != null && !q.f(uoa)) {
                         this.a9(true);
                         this.W8(uoa);
                      }
                   }
                }else if(uoa != null){
                   uoa = uoa.atmosphere;
                   if (uoa != null && !q.f(uoa)) {
                      this.W8(uoa);
                   }
                }
                return;
             }
          }
          b = false;
          goto label_0046 ;
       }catch(java.lang.Exception e0){
       }
    }
    public final void Y8(a p0){
       MallAtmospherePresenter obj;
       MallAtmospherePresenter mallAtmosphe2;
       MallAtmospherePresenter mallAtmosphe = MallAtmospherePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mallAtmosphe, "8")) {
          return;
       }
       int i = - p0.c;
       if (!PatchProxy.isSupport(mallAtmosphe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, mallAtmosphe, "13")) {
          mallAtmosphe2 = this.u;
          this.v = mallAtmosphe2;
          i = i + mallAtmosphe2;
          this.u = i;
          if (mallAtmosphe2 <= null || i <= 0) {
             if (i > 0) {
                this.u = 0;
             }
             obj = this.r;
             if (obj != null) {
                this.b9(this.u, obj);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, mallAtmosphe, "9")) {
          p0 = p0.a;
          if (p0 != null) {
             obj = PatchProxy.applyOneRefs(p0, this, mallAtmosphe, "11");
             int i1 = 1;
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else if(this.x == null){
                this.x = p0.hashCode();
             }
             if (this.x == p0.hashCode()) {
                i = true;
             }else {
                i = false;
             }
             if (i) {
                if (!PatchProxy.applyVoidOneRefs(p0, this, mallAtmosphe, "10")) {
                   obj = this.r;
                   i = (obj != null)? obj.getHeight(): 0;
                   if (i > 0) {
                      RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
                      int[] ointArray = null;
                      if (!layoutManage instanceof KwaiStaggeredGridLayoutManager) {
                         layoutManage = ointArray;
                      }
                      int[] ointArray1 = (layoutManage != null)? layoutManage.findFirstVisibleItemPositions(ointArray): ointArray;
                      if (ointArray1 != null) {
                         MallAtmospherePresenter mallAtmosphe1 = (!ointArray1.length)? 1: null;
                         if (!mallAtmosphe1 && !ointArray1[0]) {
                            View childAt = layoutManage.getChildAt(0);
                            Integer integer = (childAt != null)? Integer.valueOf(childAt.getHeight()): ointArray;
                            if (integer != null) {
                               int i2 = integer.intValue();
                               mallAtmosphe2 = (i2 > 0 && this.u < (- i2))? 1: null;
                               if (mallAtmosphe2) {
                                  ointArray = integer;
                               }
                               if (ointArray != null) {
                                  i = - ointArray.intValue();
                                  this.u = i;
                                  mallAtmosphe2 = this.r;
                                  if (mallAtmosphe2 != null) {
                                     this.b9(i, mallAtmosphe2);
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             label_00e1 :
                if (!PatchProxy.applyVoidOneRefs(p0, this, mallAtmosphe, "12") && !p0.canScrollVertically(-1)) {
                   if (this.r != null) {
                      if (this.u >= -5) {
                         i1 = 0;
                      }
                      Activity activity = this.getActivity();
                      Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                      e.q0(activity).x0(new b(i1));
                   }
                   this.v = 0;
                   this.u = 0;
                   MallAtmospherePresenter tr = this.r;
                   if (tr != null) {
                      this.b9(0, tr);
                   }
                }
             }
          }
       }
    label_011f :
       return;
    }
    public final void Z8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MallAtmospherePresenter.class, "7")) {
          return;
       }
       if (p0 instanceof MerchantLottieAnimationView && p0.p()) {
          p0.f();
       }
       return;
    }
    public final void a9(boolean p0){
       MallAtmospherePresenter mallAtmosphe = MallAtmospherePresenter.class;
       if (PatchProxy.isSupport(mallAtmosphe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mallAtmosphe, "17")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, mallAtmosphe, "18");
       if (obj == PatchProxyResult.class) {
          obj = b.b("DefaultPreferenceHelper");
          Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.SharedPreferences");
       }
       g.b(obj.edit().putBoolean("mall_dark_mode", p0));
       return;
    }
    public final void b9(int p0,View p1){
       MallAtmospherePresenter mallAtmosphe = MallAtmospherePresenter.class;
       if (PatchProxy.isSupport(mallAtmosphe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, mallAtmosphe, "14")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       layoutParams.topMargin = p0;
       p1.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MallAtmospherePresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0c5c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MallAtmospherePresenter.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       this.p = d.J0(activity);
       return;
    }
}
