package com.kuaishou.live.common.treasurebox.widget.LiveAudienceTreasureBoxWidgetView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import msd.a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k02.f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import com.kwai.library.widget.progressbar.KwaiCircleProgressBar;
import k02.d;
import k02.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k02.h;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View$OnClickListener;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Float;
import java.lang.Number;
import k02.e;
import java.lang.Math;
import k02.d$a;
import java.lang.System;
import java.lang.Runnable;
import android.os.Handler;

public final class LiveAudienceTreasureBoxWidgetView extends FrameLayout	// class@001809
{
    public final int b;
    public final int c;
    public TextView d;
    public KwaiCDNImageView e;
    public LiveKidLottieAnimationView f;
    public KwaiCircleProgressBar g;
    public b h;
    public d i;
    public View$OnClickListener j;
    public final f k;
    public final a l;
    public final a m;
    public HashMap n;

    public void LiveAudienceTreasureBoxWidgetView(Context p0,AttributeSet p1,int p2,a p3,a p4,int p5,u p6){
       p1 = null;
       if (p5 & 0x04) {
          p2 = 0;
       }
       a.p(p0, "context");
       a.p(p3, "isVoicePartyVideo");
       a.p(p4, "isLiteStreamType");
       super(p0, p1, p2);
       this.l = p3;
       this.m = p4;
       this.b = 110;
       this.c = 7199;
       this.k = new f(this);
       View view = a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0a06, this, true);
       this.setClipChildren(false);
       this.setClipToPadding(false);
       View view1 = view.findViewById(R.id.live_audience_encourage_treasure_box_description);
       a.o(view1, "rootView.findViewById\(R.¡­treasure_box_description\)");
       this.d = view1;
       view1 = view.findViewById(R.id.live_audience_encourage_treasure_box_background_view);
       a.o(view1, "rootView.findViewById\(R.¡­sure_box_background_view\)");
       this.e = view1;
       view1 = view.findViewById(R.id.live_audience_encourage_treasure_box_lottie_view);
       a.o(view1, "rootView.findViewById\(R.¡­treasure_box_lottie_view\)");
       this.f = view1;
       view = view.findViewById(R.id.live_audience_encourage_treasure_box_watch_progress);
       a.o(view, "rootView.findViewById\(R.¡­asure_box_watch_progress\)");
       this.g = view;
       this.i = new d(this, p3, p4);
       return;
    }
    public final void a(b p0){
       LiveAudienceTreasureBoxWidgetView te;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTreasureBoxWidgetView.class, "4")) {
          return;
       }
       b.P(h.a, "doTransferWidgetState, targetStatus: "+p0+".treasureBoxStatus");
       LiveAudienceTreasureBoxWidgetView td = this.d;
       if (td == null) {
          a.S("treasureBoxBottomDescription");
       }
       td.setText(p0.a());
       this.b();
       int i = p0.b();
       String str = "treasureBoxImageView";
       int i1 = 8;
       if (i != 1) {
          if (i == 2) {
             te = this.e;
             if (te == null) {
                a.S(str);
             }
             te.setVisibility(i1);
             te = this.f;
             if (te == null) {
                a.S("treasureBoxBottomAnimationView");
             }
             te.setVisibility(0);
             te = this.f;
             if (te == null) {
                a.S("treasureBoxBottomAnimationView");
             }
             te.D(R.string.arg_RES_7f102608);
             te = this.f;
             if (te == null) {
                a.S("treasureBoxBottomAnimationView");
             }
             te.C((this.b + 1), this.c);
             te = this.f;
             if (te == null) {
                a.S("treasureBoxBottomAnimationView");
             }
             te.setRepeatCount(-1);
             te = this.f;
             if (te == null) {
                a.S("treasureBoxBottomAnimationView");
             }
             te.s();
          }
       }else {
          te = this.f;
          if (te == null) {
             a.S("treasureBoxBottomAnimationView");
          }
          te.setRepeatCount(0);
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.setVisibility(0);
          te = this.f;
          if (te == null) {
             a.S("treasureBoxBottomAnimationView");
          }
          te.setVisibility(i1);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTreasureBoxWidgetView.class, "6")) {
          return;
       }
       LiveAudienceTreasureBoxWidgetView tf = this.f;
       if (tf == null) {
          a.S("treasureBoxBottomAnimationView");
       }
       tf.t();
       tf = this.f;
       if (tf == null) {
          a.S("treasureBoxBottomAnimationView");
       }
       tf.f();
       return;
    }
    public final View$OnClickListener getRootClickListener$live_common_release(){
       return this.j;
    }
    public boolean onTouchEvent(MotionEvent p0){
       d e;
       d obj2;
       float f;
       float f2;
       d f4;
       int g;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "8";
       String obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceTreasureBoxWidgetView.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "event";
       a.p(p0, obj);
       LiveAudienceTreasureBoxWidgetView ti = this.i;
       Objects.requireNonNull(ti);
       d uod = d.class;
       Object[] obj1 = PatchProxy.applyOneRefs(p0, ti, uod, "1");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, obj);
          int action = p0.getAction();
          obj1 = null;
          boolean b1 = true;
          if (action) {
             if (action != b1) {
                if (action != 2) {
                   if (action == 3) {
                   label_00df :
                      ti.f.setAlpha(0x3f800000);
                      e = ti.e;
                      obj2 = PatchProxy.apply(obj1, ti, uod, str);
                      if (obj2 != patchProxyRe) {
                         f = obj2.floatValue();
                      }else if(ti.d() || (ti.g.invoke().booleanValue() && !ti.h.invoke().booleanValue())){
                         f = (float)e.i;
                      }else {
                         f = ti.b();
                      }
                      float f1 = f;
                      obj2 = PatchProxy.apply(obj1, ti, uod, "9");
                      if (obj2 != patchProxyRe) {
                         f2 = obj2.floatValue();
                      }else if(ti.h.invoke().booleanValue()){
                         g = (ti.d())? e.g: e.h;
                         f2 = ti.a((float)e.f, (float)g);
                      }else if(ti.g.invoke().booleanValue()){
                         f2 = ti.a((float)e.d, (float)e.e);
                      }else if(ti.d()){
                         g = e.b;
                      }else {
                         g = e.c;
                      }
                      f2 = ti.a((float)e.a, (float)g);
                      float f3 = f2;
                      Objects.requireNonNull(e);
                      if (!PatchProxy.isSupport(d$a.class) || !PatchProxy.applyVoidThreeRefs(Float.valueOf(f1), Float.valueOf(f3), p0, e, d$a.class, "1")) {
                         e.c = f1;
                         e.d = f3;
                         e.f = p0;
                         e.e = System.currentTimeMillis();
                         e.b.post(e);
                      }
                      f = (float)5;
                      if (Math.abs((ti.a - ti.c)) - f >= 0 || Math.abs((ti.b - ti.d)) - f >= 0) {
                         b1 = 0;
                      }
                      if (b1) {
                         f4 = ti.f;
                         if (f4 != null) {
                            View$OnClickListener rootClickLis = f4.getRootClickListener$live_common_release();
                            if (rootClickLis != null) {
                               rootClickLis.onClick(ti.f);
                            }
                         }
                      }
                   }
                }else {
                   ti.f.requestDisallowInterceptTouchEvent(b1);
                   f = p0.getRawX() - ti.c;
                   float f5 = p0.getRawY() - ti.d;
                   if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(f5), ti, uod, "2")) {
                      d f6 = ti.f;
                      float f7 = f6.getX() + f;
                      if (PatchProxy.isSupport(uod)) {
                         obj2 = PatchProxy.applyOneRefs(Float.valueOf(f7), ti, uod, "4");
                         if (obj2 != patchProxyRe) {
                            f = obj2.floatValue();
                         label_009e :
                            f6.setX(f);
                            obj2 = ti.f;
                            float f8 = obj2.getY() + f5;
                            if (PatchProxy.isSupport(uod)) {
                               Object obj3 = PatchProxy.applyOneRefs(Float.valueOf(f8), ti, uod, "6");
                               if (obj3 != patchProxyRe) {
                                  f2 = obj3.floatValue();
                               label_00ce :
                                  obj2.setY(f2);
                               }
                            }
                            f2 = Math.max(0, Math.min(f8, ti.c()));
                            goto label_00ce ;
                         }
                      }
                      f = Math.max((float)e.i, Math.min(f7, ti.b()));
                      goto label_009e ;
                   }
                   ti.c = p0.getRawX();
                   ti.d = p0.getRawY();
                }
             }else {
                goto label_00df ;
             }
          }else {
             ti.a = p0.getRawX();
             ti.b = p0.getRawY();
             ti.c = p0.getRawX();
             ti.d = p0.getRawY();
             ti.f.requestDisallowInterceptTouchEvent(b1);
             f4 = ti.e;
             Objects.requireNonNull(f4);
             if (!PatchProxy.applyVoid(obj1, f4, d$a.class, "3")) {
                f4.b.removeCallbacks(f4);
             }
             ti.f.setAlpha(0x3f000000);
          }
          b = true;
       }
    label_021c :
       return b;
    }
    public final void setClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTreasureBoxWidgetView.class, "7")) {
          return;
       }
       a.p(p0, "clickListener");
       this.j = p0;
       return;
    }
}
