package com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$c;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import android.view.View;
import d6a.u;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p1;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Math;
import java.util.Objects;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.ja;
import mrd.a;
import com.kwai.robust.PatchProxyResult;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import wvb.e;
import qvb.n0;
import com.yxcorp.gifshow.entity.QPhoto;
import xx9.a;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import d0a.o;
import brd.y;
import android.view.ViewParent;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import ekd.i;
import com.yxcorp.utility.n;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import r1a.g;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

public final class SlidePlayAtlasBaseTouchPresenter$c implements ScaleHelpView$a	// class@001836
{
    public final SlidePlayAtlasBaseTouchPresenter a;

    public void SlidePlayAtlasBaseTouchPresenter$c(SlidePlayAtlasBaseTouchPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$c.class, "4")) {
          return;
       }
       a.p(p0, "pos");
       SlideHorizontalAtlasPlayer slideHorizon = this.a.X8();
       slideHorizon.getLocationOnScreen(p0);
       p0[2] = slideHorizon.getMeasuredWidth();
       this.a.s = slideHorizon.getMeasuredHeight();
       p0[3] = this.a.s;
       if (u.a()) {
          p0[1] = p0[1] + p1.f(this.a.getContext());
       }
       return;
    }
    public void b(MotionEvent p0,boolean p1){
       SlidePlayAtlasBaseTouchPresenter$c uoc = SlidePlayAtlasBaseTouchPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       a.p(p0, "event");
       if (!p1 || (p0.getPointerCount() == 2 && Math.abs((this.a.V8(p0) - this.a.t)) - 0x40400000 >= 0)) {
          SlidePlayAtlasBaseTouchPresenter$c ta = this.a;
          boolean b = true;
          if (ta.u == null) {
             ta.u = b;
          }
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, SlidePlayAtlasBaseTouchPresenter.class, "29") && !ta.S8()) {
             SlidePlayAtlasBaseTouchPresenter u = ta.U;
             String str = "scaleHelpView";
             if (u == null) {
                a.S(str);
             }
             if (u.getScaleView() != null) {
                u = ta.U;
                if (u == null) {
                   a.S(str);
                }
                View scaleView = u.getScaleView();
                a.o(scaleView, "scaleHelpView.scaleView");
                float scaleX = scaleView.getScaleX();
                ta.w = scaleX;
                if (ta.v == null && ta.y == null) {
                   String str1 = "scaleCleanTips";
                   if (scaleX - 0x3fc00000 >= 0) {
                      u = ta.T;
                      if (u == null) {
                         a.S(str1);
                      }
                      Context context = ta.getContext();
                      a.m(context);
                      u.setText(context.getString(R.string.arg_RES_7f10383e));
                      if (ta.x == null) {
                         ta.x = b;
                         ja.a();
                      }
                   }else {
                      Context uContext = 0x3f800000;
                      if (scaleX - uContext > 0) {
                         u = ta.T;
                         if (u == null) {
                            a.S(str1);
                         }
                         u.setVisibility(0);
                         u = ta.T;
                         if (u == null) {
                            a.S(str1);
                         }
                         uContext = ta.getContext();
                         a.m(uContext);
                         u.setText(uContext.getString(R.string.arg_RES_7f103839));
                         ta.x = false;
                      }else if(scaleX - uContext <= 0){
                         u = ta.T;
                         if (u == null) {
                            a.S(str1);
                         }
                         u.setVisibility(8);
                         ta.x = false;
                      }
                   }
                }
             }
          }
       }
    label_00f1 :
       return;
    }
    public void c(MotionEvent p0){
       boolean b;
       String str;
       SlidePlayAtlasBaseTouchPresenter f;
       SlidePlayAtlasBaseTouchPresenter l;
       i oi;
       Object[] objArray2;
       SlidePlayAtlasBaseTouchPresenter slidePlayAtl = SlidePlayAtlasBaseTouchPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "event");
       this.a.X8().setVisibility(4);
       SlidePlayAtlasBaseTouchPresenter$c ta = this.a;
       ta.t = ta.V8(p0);
       SlidePlayAtlasBaseTouchPresenter$c ta1 = this.a;
       SlidePlayAtlasBaseTouchPresenter w = ta1.W;
       Object[] objArray = null;
       Boolean uBoolean = (w != null)? w.i(): objArray;
       Boolean tRUE = Boolean.TRUE;
       ChangeScreenVisibleEvent$Operation operation = 2;
       int i = 0;
       if (!a.g(uBoolean, tRUE)) {
          w = this.a.X;
          uBoolean = (w != null)? w.i(): objArray;
          if (!a.g(uBoolean, tRUE)) {
             ta = this.a;
             Objects.requireNonNull(ta);
             SlidePlayAtlasBaseTouchPresenter obj = PatchProxy.apply(objArray, ta, slidePlayAtl, "37");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = ta.E;
                String str1 = "slidePlayViewModel";
                if (obj == null) {
                   a.S(str1);
                }
                if (obj.X0() instanceof e) {
                   w = ta.E;
                   if (w == null) {
                      a.S(str1);
                   }
                   oi = w.X0();
                   Objects.requireNonNull(oi, "null cannot be cast to non-null type com.yxcorp.gifshow.page.wrapper.PageListWrapper<*, *>");
                   oi = oi.m();
                   a.o(oi, "\(slidePlayViewModel.page…per<*, *>\).originPageList");
                }else {
                   w = ta.E;
                   if (w == null) {
                      a.S(str1);
                   }
                   oi = w.X0();
                   a.o(oi, "slidePlayViewModel.pageList");
                }
                if (oi instanceof n0 && (oi.isLoading() && oi.K())) {
                   b = true;
                }else {
                   b = false;
                }
             }
             if (b || (this.a.X8().A() && this.a.getPhoto().getFilterStatus() != operation)) {
                b = false;
             label_00d8 :
                ta1.y = b;
                ta1 = this.a;
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoid(objArray, ta1, slidePlayAtl, "28") && !ta1.S8()) {
                   w = ta1.L;
                   if (w == null) {
                      a.S("screenCleanStatusCombination");
                   }
                   b = w.c();
                   ta1.v = b;
                   if (ta1.y != null && !b) {
                      o oo = o.C();
                      str = "不允许进清屏模式";
                      f = ta1.F;
                      if (f == null) {
                         a.S("photo");
                      }
                      objArray = new Object[i];
                      oo.w("SlidePlayAtlasBaseTouchPresenter", str+f.getPhotoId(), objArray);
                      slidePlayAtl = ta1.L;
                      if (slidePlayAtl == null) {
                         a.S("screenCleanStatusCombination");
                      }
                      f = ta1.F;
                      if (f == null) {
                         a.S("photo");
                      }
                      slidePlayAtl.d(new ChangeScreenVisibleEvent(f, ChangeScreenVisibleEvent$Operation.CLEAR, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                      l = ta1.L;
                      if (l == null) {
                         a.S("screenCleanStatusCombination");
                      }
                      l.e(true);
                   }else {
                      ta1.w = 0;
                      if (b) {
                         l = ta1.Y;
                         if (l != null) {
                            l.onNext(new o(operation));
                         }
                      }else if(PatchProxy.applyVoid(objArray, ta1, slidePlayAtl, "31")){
                         slidePlayAtl = ta1.T;
                         str = "scaleCleanTips";
                         if (slidePlayAtl == null) {
                            a.S(str);
                         }
                         if (slidePlayAtl.getParent() == null) {
                            FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                            layoutParams.gravity = 1;
                            layoutParams.topMargin = a1.e(10.00f);
                            if (i.c()) {
                               Context context = ta1.getContext();
                               a.m(context);
                               layoutParams.topMargin = layoutParams.topMargin + n.A(context);
                            }
                            f = ta1.T;
                            if (f == null) {
                               a.S(str);
                            }
                            f.setVisibility(8);
                            f = ta1.U;
                            if (f == null) {
                               a.S("scaleHelpView");
                            }
                            View parentView = f.getParentView();
                            Objects.requireNonNull(parentView, "null cannot be cast to non-null type android.widget.FrameLayout");
                            SlidePlayAtlasBaseTouchPresenter t = ta1.T;
                            if (t == null) {
                               a.S(str);
                            }
                            parentView.addView(t, layoutParams);
                         }
                      }
                      slidePlayAtl = ta1.L;
                      if (slidePlayAtl == null) {
                         a.S("screenCleanStatusCombination");
                      }
                      l = ta1.F;
                      if (l == null) {
                         a.S("photo");
                      }
                      slidePlayAtl.d(new ChangeScreenVisibleEvent(l, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                      Object[] objArray1 = new Object[i];
                      o.C().w("SlidePlayAtlasBaseTouchPresenter", "开始缩放清屏", objArray1);
                   }
                }
             label_01f3 :
                return;
             }
          }
       }
    label_00d7 :
       b = true;
       goto label_00d8 ;
    }
    public void d(MotionEvent p0){
       SlidePlayAtlasBaseTouchPresenter l;
       SlidePlayAtlasBaseTouchPresenter f;
       o oo;
       SlidePlayAtlasBaseTouchPresenter f1;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$c.class, "3")) {
          return;
       }
       a.p(p0, "event");
       int i = 0;
       this.a.X8().setVisibility(i);
       SlidePlayAtlasBaseTouchPresenter$c ta = this.a;
       ta.u = i;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, SlidePlayAtlasBaseTouchPresenter.class, "30") && !ta.S8()) {
          String str = "SlidePlayAtlasBaseTouchPresenter";
          StringBuilder str1 = "screenCleanStatusCombination";
          if (ta.y != null && ta.v == null) {
             l = ta.L;
             if (l == null) {
                a.S(str1);
             }
             l.e(i);
             l = ta.L;
             if (l == null) {
                a.S(str1);
             }
             f = ta.F;
             if (f == null) {
                a.S("photo");
             }
             l.d(new ChangeScreenVisibleEvent(f, ChangeScreenVisibleEvent$Operation.UNCLEAR, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
             oo = o.C();
             str1 = "不允许进入清屏，松手恢复原状";
             f1 = ta.F;
             if (f1 == null) {
                a.S("photo");
             }
             objArray = new Object[i];
             oo.w(str, str1+f1.getPhotoId(), objArray);
          }else {
             l = ta.U;
             if (l == null) {
                a.S("scaleHelpView");
             }
             View parentView = l.getParentView();
             Objects.requireNonNull(parentView, "null cannot be cast to non-null type android.widget.FrameLayout");
             f = ta.T;
             if (f == null) {
                a.S("scaleCleanTips");
             }
             parentView.removeView(f);
             l = ta.v;
             StringBuilder str2 = 0x3f800000;
             if (l == null || (ta.w - str2 < 0 || (l == null && ta.w - 0x3fc00000 < 0))) {
                l = ta.L;
                if (l == null) {
                   a.S(str1);
                }
                if (l.c()) {
                   Object[] objArray1 = new Object[i];
                   o.C().w(str, "缩放不到位，退出清屏", objArray1);
                   l = ta.L;
                   if (l == null) {
                      a.S(str1);
                   }
                   SlidePlayAtlasBaseTouchPresenter f2 = ta.F;
                   if (f2 == null) {
                      a.S("photo");
                   }
                   l.d(new ChangeScreenVisibleEvent(f2, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                   if (ta.v != null && ta.w - str2 < 0) {
                      l = ta.R;
                      if (l == null) {
                         a.S("currentFragment");
                      }
                      f1 = ta.F;
                      if (f1 == null) {
                         a.S("photo");
                      }
                      g.a(l, f1, i, "SLIDE");
                   }
                }
             }else {
                oo = o.C();
                str2 = "显示控制栏";
                SlidePlayAtlasBaseTouchPresenter l1 = ta.L;
                if (l1 == null) {
                   a.S(str1);
                }
                objArray = new Object[i];
                oo.w(str, str2+l1.c(), objArray);
                SlidePlayAtlasBaseTouchPresenter l2 = ta.L;
                if (l2 == null) {
                   a.S(str1);
                }
                if (l2.c()) {
                   l2 = ta.R;
                   if (l2 == null) {
                      a.S("currentFragment");
                   }
                   l = ta.F;
                   if (l == null) {
                      a.S("photo");
                   }
                   g.a(l2, l, true, "");
                   l2 = ta.Y;
                   a.m(l2);
                   f1 = ta.F;
                   if (f1 == null) {
                      a.S("photo");
                   }
                   l2.onNext(new o(true, true, f1.isAllowPhotoDownload()));
                }
             }
          }
       }
    label_0173 :
       return;
    }
    public Bitmap getBitmap(){
       SlideHorizontalAtlasPlayer obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.X8();
       int drawingCache = obj.getDrawingCacheBackgroundColor();
       int i = 0;
       obj.setBackgroundColor(i);
       SlidePlayAtlasBaseTouchPresenter$c ta = this.a;
       if (ta.q == null || ta.s != ta.r) {
          Object[] objArray = new Object[i];
          o.C().s("SlidePlayTouchPresenter", "w = "+obj.getMeasuredWidth()+" h = "+this.a.s, objArray);
          SlidePlayAtlasBaseTouchPresenter$c ta1 = this.a;
          int i1 = 1;
          int measuredWidt = (obj.getMeasuredWidth() > 0)? obj.getMeasuredWidth(): 1;
          SlidePlayAtlasBaseTouchPresenter s = this.a.s;
          if (s > null) {
             i1 = s;
          }
          ta1.q = Bitmap.createBitmap(measuredWidt, i1, Bitmap$Config.ARGB_8888);
          SlidePlayAtlasBaseTouchPresenter q = this.a.q;
          a.m(q);
          this.a.p = new Canvas(q);
       }
       obj.draw(this.a.p);
       obj.setBackgroundColor(drawingCache);
       SlidePlayAtlasBaseTouchPresenter$c ta2 = this.a;
       ta2.r = ta2.s;
       SlidePlayAtlasBaseTouchPresenter q1 = ta2.q;
       a.m(q1);
       return q1;
    }
}
