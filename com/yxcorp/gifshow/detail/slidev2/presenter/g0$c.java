package com.yxcorp.gifshow.detail.slidev2.presenter.g0$c;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.facebook.drawee.view.DraweeView;
import java.lang.Math;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import android.widget.ImageView;
import android.view.View;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.ja;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import mrd.a;
import com.kwai.robust.PatchProxyResult;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import wvb.e;
import qvb.n0;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import xx9.a;
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
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import p5a.e;
import de5.a;
import m9a.y;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import o56.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.graphics.Bitmap;

public class g0$c implements ScaleHelpView$a	// class@0019b1
{
    public final g0 a;

    public void g0$c(g0 p0){
       this.a = p0;
       super();
    }
    public void a(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$c.class, "4")) {
          return;
       }
       this.a.V8(p0);
       return;
    }
    public void b(MotionEvent p0,boolean p1){
       g0$c uoc = g0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       if (!p1) {
          this.a.q.onTouchEvent(p0);
       }else if(this.a.R8() || (p0.getPointerCount() == 2 && Math.abs((this.a.S8(p0) - this.a.E)) - 0x40400000 >= 0)){
          g0$c ta = this.a;
          boolean b = true;
          int i = 0;
          float f = 0x3f800000;
          if (ta.F == null) {
             ta.F = b;
             Object[] objArray = new Object[i];
             o.C().w("SlidePlayScaleHelpPrese", "photo "+this.a.s.getPhotoId()+", "+this.a.s.getUserName()+", set scale help view background black", objArray);
             this.a.p.setBackgroundColor(0xff000000);
             this.a.p.getParentView().setAlpha(f);
          }
          ta = this.a;
          Objects.requireNonNull(ta);
          if (PatchProxy.applyVoid(null, ta, g0.class, "8") || (!ta.P8() && ta.p.getScaleView() != null)) {
             float scaleX = ta.p.getScaleView().getScaleX();
             ta.H = scaleX;
             if (ta.G == null && ta.J == null) {
                if (scaleX - 0x3fc00000 >= 0) {
                   ta.r.setText(ta.getContext().getString(R.string.arg_RES_7f10383e));
                   if (ta.I == null) {
                      ta.I = b;
                      ja.a();
                   }
                }else if(scaleX - f > 0){
                   ta.r.setVisibility(i);
                   ta.r.setText(ta.getContext().getString(R.string.arg_RES_7f103839));
                   ta.I = i;
                }else if(scaleX - f <= 0){
                   ta.r.setVisibility(8);
                   ta.I = i;
                }
             }
          }
       }
    label_011e :
       return;
    }
    public void c(MotionEvent p0){
       boolean b;
       i oi;
       g0 og0 = g0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$c.class, "1")) {
          return;
       }
       InvalidGestureChecker.a(this.a.getContext(), AnswerType.SCALE_GESTURE);
       float f = 0;
       if (this.a.R8()) {
          this.a.q.setAlpha(f);
       }else {
          int i = 0;
          this.a.p.setBackgroundColor(i);
          g0$c ta = this.a;
          ta.E = ta.S8(p0);
          this.a.p.getParentView().setAlpha(f);
          this.a.Z8();
          g0$c ta1 = this.a;
          ChangeScreenVisibilityCause uChangeScree = 2;
          if (ta1.A.i() == null || (!this.a.A.i().booleanValue() && (this.a.B.i() == null || !this.a.B.i().booleanValue()))) {
             ta = this.a;
             Objects.requireNonNull(ta);
             Object obj = PatchProxy.apply(null, ta, og0, "16");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(ta.L.X0() instanceof e){
                oi = ta.L.X0().m();
             }else {
                oi = ta.L.X0();
             }
             if (oi instanceof n0 && (oi.isLoading() && oi.K())) {
                b = true;
             }else {
                b = false;
             }
             if (!b && (this.a.s.isSinglePhoto() && (j.h(b.b(this.a.s)) || (!r1.l3(this.a.s.mEntity) && this.a.s.getFilterStatus() != uChangeScree)))) {
                b = false;
             label_00fd :
                ta1.J = b;
                ta1 = this.a;
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoid(null, ta1, og0, "7") && !ta1.P8()) {
                   b = ta1.y.c();
                   ta1.G = b;
                   if (ta1.J != null && !b) {
                      Object[] objArray = new Object[i];
                      o.C().w("SlidePlayScaleHelpPrese", "不允许进清屏模式"+ta1.s.getPhotoId(), objArray);
                      ta1.y.d(new ChangeScreenVisibleEvent(ta1.s, ChangeScreenVisibleEvent$Operation.CLEAR, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                      ta1.y.e(true);
                   }else {
                      ta1.H = f;
                      if (b) {
                         ta1.z.onNext(new o(uChangeScree));
                      }else if(!PatchProxy.applyVoid(null, ta1, og0, "12") && ta1.r.getParent() == null){
                         FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                         layoutParams.gravity = 1;
                         layoutParams.topMargin = a1.e(10.00f);
                         if (i.c()) {
                            layoutParams.topMargin = layoutParams.topMargin + n.A(ta1.getContext());
                         }
                         ta1.r.setVisibility(8);
                         ta1.p.getParentView().addView(ta1.r, layoutParams);
                      }
                      ta1.y.d(new ChangeScreenVisibleEvent(ta1.s, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                      Object[] objArray1 = new Object[i];
                      o.C().w("SlidePlayScaleHelpPrese", "开始缩放清屏", objArray1);
                   }
                }
             }
          }
       label_00fc :
          b = true;
          goto label_00fd ;
       }
       return;
    }
    public void d(MotionEvent p0){
       boolean b2;
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$c.class, "3")) {
          return;
       }
       boolean b = true;
       this.a.w.get().setIsEnlargePlay(b);
       float f = 0x3f800000;
       if (this.a.R8()) {
          this.a.q.setAlpha(f);
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "SlidePlayScaleHelpPrese";
          o.C().w(str, "photo "+this.a.s.getPhotoId()+", "+this.a.s.getUserName()+", set scale help view background transparent", objArray);
          this.a.p.setBackgroundColor(i);
          g0$c ta = this.a;
          ta.F = i;
          ta.p.getParentView().setAlpha(f);
          this.a.a9();
          this.a.X8();
          ta = this.a;
          Objects.requireNonNull(ta);
          g0 og0 = g0.class;
          objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, og0, "9") && !ta.P8()) {
             if (ta.J != null && ta.G == null) {
                ta.y.e(i);
                ta.y.d(new ChangeScreenVisibleEvent(ta.s, ChangeScreenVisibleEvent$Operation.UNCLEAR, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                Object[] objArray1 = new Object[i];
                o.C().w(str, "不允许进入清屏，松手恢复原状"+ta.s.getPhotoId(), objArray1);
             }else {
                ta.p.getParentView().removeView(ta.r);
                g0 g = ta.G;
                if (g == null || (ta.H - f < 0 || (g == null && ta.H - 0x3fc00000 < 0))) {
                   if (ta.y.c()) {
                      Object[] objArray2 = new Object[i];
                      o.C().w(str, "缩放不到位，退出清屏", objArray2);
                      ta.y.d(new ChangeScreenVisibleEvent(ta.s, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                      if (ta.G != null && ta.H - f < 0) {
                         ta.Y8(i);
                      }
                   }
                }else {
                   ta.Y8(b);
                   Object[] objArray3 = new Object[i];
                   o.C().w(str, "显示控制栏"+ta.y.c(), objArray3);
                   if (ta.y.c()) {
                      g0 z = ta.z;
                      float f1 = y.d(ta.t.getPlayer());
                      boolean b1 = ta.t.getPlayer().isPaused();
                      Object obj = PatchProxy.apply(objArray, ta, og0, "10");
                      if (obj != PatchProxyResult.class) {
                         b2 = obj.booleanValue();
                      }else if(PlayerPanelConfigHelper.a().isSmallWindowEnable() && (ta.s.isVideoType() && (!ta.s.isAd() && (!ta.s.isLiveStream() && NasaExperimentUtils.X())))){
                         Object obj1 = PatchProxy.apply(objArray, ta, og0, "11");
                         if (obj1 != PatchProxyResult.class) {
                            b2 = obj1.booleanValue();
                         }else if(!f.b(ta.getContext()) && (!NasaExperimentUtils.w() && (ta.C.getNasaSlideParam().isFeaturedPage() || ta.C.getNasaSlideParam().isNebulaFindPage()))){
                            b2 = true;
                         }else {
                            b2 = false;
                         }
                         if (b2) {
                            i = 1;
                         }
                      }
                   label_01e8 :
                      b2 = i;
                      z.onNext(new o(b, f1, b1, b2));
                   }
                }
             }
          }
       }
       return;
    }
    public Bitmap getBitmap(){
       Object obj = PatchProxy.apply(null, this, g0$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.W8();
    }
}
