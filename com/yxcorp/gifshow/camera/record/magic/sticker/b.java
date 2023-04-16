package com.yxcorp.gifshow.camera.record.magic.sticker.b;
import ui9.b;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.magic.l;
import com.yxcorp.gifshow.camera.record.magic.sticker.b$a;
import android.os.Looper;
import android.graphics.Rect;
import com.yxcorp.gifshow.camera.record.magic.sticker.b$b;
import com.yxcorp.gifshow.camera.record.magic.sticker.c;
import oc9.t;
import lnc.s6;
import sg9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import fw8.r;
import fw8.r$a;
import com.yxcorp.gifshow.camera.record.magic.sticker.StickerFrameLayout;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import mf9.g;
import java.lang.Runnable;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.utility.n;
import java.util.List;
import java.util.Iterator;
import mf9.a;
import zb9.p0;
import zb9.p0$a;
import android.app.Activity;
import oc9.d0;
import gh9.d;
import bh9.s;
import kd9.l0;
import mf9.d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import mf9.c;
import com.yxcorp.gifshow.camera.record.magic.sticker.a;
import com.yxcorp.gifshow.camera.record.magic.sticker.b$c;
import android.view.animation.Animation$AnimationListener;
import q16.a$a;
import java.lang.Number;
import java.util.Objects;
import com.yxcorp.gifshow.record.interactive.RecordStickerBaseData;
import android.widget.Button;
import lnc.a1;
import android.graphics.drawable.Drawable;
import mf9.b;
import android.view.View$OnClickListener;
import ug9.c;
import wd9.a;
import bd9.f;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import com.kwai.camerasdk.models.VideoSourceLayout;
import android.graphics.RectF;
import dj9.a;
import mf9.f;
import android.os.Handler;

public class b extends e0 implements b	// class@000e5e
{
    public final Handler q;
    public l r;
    public ViewGroup s;
    public final Rect t;
    public Button u;
    public int v;
    public final r$a w;

    public void b(CameraPageType p0,b p1,l p2){
       super(p0, p1);
       this.q = new b$a(this, Looper.getMainLooper());
       this.t = new Rect(0, 0, 0, 0);
       this.w = new b$b(this);
       this.r = p2;
       this.L0(new c(p0, p1, this, p2));
       if (s6.o()) {
          this.L0(new b(p0, p1, this));
       }
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          ts.setEnabled(true);
       }
       super.A0();
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          ts.setEnabled(false);
       }
       super.I7();
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          ts.setEnabled(true);
       }
       super.P1();
       return;
    }
    public boolean R0(){
       b obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj != null) {
          obj.setEnabled(false);
       }
       return false;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       boolean b;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, b.class, "2")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "onEffectDescriptionUpdated:";
       int i = 0;
       b = (p0 != null)? true: false;
       Object[] objArray = new Object[i];
       uoa.s("StickerMagicController", str+b, objArray);
       this.l2(p0);
       return;
    }
    public void g2(EffectDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "17")) {
          return;
       }
       if (this.l != null && this.e != null) {
          r.c().a(this.w);
          d tl = this.l;
          if (this.s == null) {
             StickerFrameLayout stickerFrame = new StickerFrameLayout(this.l.getContext());
             this.s = stickerFrame;
             tl.addView(stickerFrame, this.v, new FrameLayout$LayoutParams(-1, -1));
          }
          this.o2();
          this.s.post(new g(this, p0));
       }
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "afterEffectRestore:";
       int i = 0;
       b = (p0 != null)? true: false;
       Object[] objArray = new Object[i];
       uoa.s("StickerMagicController", str+b, objArray);
       this.l2(p0);
       return;
    }
    public final Rect h2(){
       Object[] objArray = null;
       AnimCameraView obj = PatchProxy.apply(objArray, this, b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.b().z7();
       if (obj == null) {
          return objArray;
       }
       int[] ointArray = n.o(obj);
       return new Rect(ointArray[0], ointArray[1], (ointArray[0] + obj.getWidth()), (ointArray[1] + obj.getHeight()));
    }
    public final boolean hasSticker(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof a && ot.hasSticker()) {
             b = true;
             break ;
          }
       }
       return b;
    }
    public void i2(){
       View view3;
       Object[] objArray1;
       View view4;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "27")) {
          return;
       }
       d tl = this.l;
       if (tl != null && this.e != null) {
          View view = tl.findViewById(R.id.camera_flash_bar_root);
          View view1 = this.l.findViewById(R.id.camera_sidebar_layout);
          View view2 = this.l.findViewById(R.id.fold_button);
          if (this.d.d(p0.j.a()).c()) {
             view3 = this.l.findViewById(R.id.discern_panel_layout);
             objArray1 = objArray;
          }else {
             view3 = this.l.findViewById(R.id.action_bar_layout);
             objArray1 = this.e.findViewById(R.id.camera_tab_container);
          }
          int i = 0x7f0a0633;
          if (this.f2()) {
             view4 = (this.d.d(d.c).a != null)? this.e.findViewById(i): this.l.findViewById(R.id.camera_time_tab_scroll_container);
             if (this.d.d(s.c).b != null) {
                objArray2 = objArray;
                objArray = this.l.findViewById(0x7f0a0970);
             }else {
                objArray2 = objArray;
             }
          }else {
             view4 = this.e.findViewById(i);
             objArray2 = this.l.findViewById(R.id.take_picture_btn);
          }
          n.W(view, 8, 150);
          n.W(view1, 8, 150);
          n.W(view2, 8, 150);
          n.W(view3, 8, 150);
          n.W(view4, 8, 150);
          n.W(objArray, 8, 150);
          n.W(objArray1, 8, 150);
          n.W(objArray2, 8, 150);
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.k(p0);
       this.Y1(this.d.l(l0.class, new d(this)));
       this.Y1(this.d.l(c.class, new c(this)));
       this.b2(new a(this));
       return;
    }
    public void k2(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "25")) {
          return;
       }
       if (this.l != null) {
          uob = this.u;
          if (uob != null) {
             n.X(uob, 8, 400, new b$c(this));
             if (p0) {
                this.m2();
             }
          }
       }
       return;
    }
    public final void l2(EffectDescription p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (this.hasSticker()) {
          this.g2(p0);
       }else {
          this.z1(null, null, null);
          r.c().g(this.w);
       }
       return;
    }
    public void lc(a$a p0){
       float f;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "5")) {
          return;
       }
       super.lc(p0);
       Iterator obj = PatchProxy.apply(null, this, uob, "12");
       if (obj != PatchProxyResult.class) {
          f = obj.floatValue();
       }else {
          obj = this.getChildren().iterator();
          while (true) {
             if (obj.hasNext()) {
                t ot = obj.next();
                if (ot instanceof c) {
                   Objects.requireNonNull(ot);
                   c obj1 = PatchProxy.apply(null, ot, c.class, "6");
                   if (obj1 != PatchProxyResult.class) {
                      f = obj1.floatValue();
                      break ;
                   }else {
                      obj1 = ot.r;
                      if (obj1 != null) {
                         f = obj1.getScale();
                         break ;
                      }
                   }
                }
             }
             f = 0x3f800000;
             break ;
          }
       }
       p0.U1 = f;
       return;
    }
    public void m2(){
       View view3;
       Object[] objArray1;
       View view4;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "26")) {
          return;
       }
       d tl = this.l;
       if (tl != null && this.e != null) {
          View view = tl.findViewById(R.id.camera_flash_bar_root);
          View view1 = this.l.findViewById(R.id.camera_sidebar_layout);
          View view2 = this.l.findViewById(R.id.fold_button);
          if (this.d.d(p0.j.a()).c()) {
             view3 = this.l.findViewById(R.id.discern_panel_layout);
             objArray1 = objArray;
          }else {
             view3 = this.l.findViewById(R.id.action_bar_layout);
             objArray1 = this.e.findViewById(R.id.camera_tab_container);
          }
          int i = 0x7f0a0633;
          if (this.f2()) {
             view4 = (this.d.d(d.c).a != null)? this.e.findViewById(i): this.l.findViewById(R.id.camera_time_tab_scroll_container);
             if (this.d.d(s.c).b != null) {
                objArray2 = objArray;
                objArray = this.l.findViewById(0x7f0a0970);
             }else {
                objArray2 = objArray;
             }
          }else {
             view4 = this.e.findViewById(i);
             objArray2 = this.l.findViewById(R.id.take_picture_btn);
          }
          n.W(view, 0, 150);
          n.W(view1, 0, 150);
          n.W(view2, 0, 150);
          n.W(view3, 0, 150);
          n.W(view4, 0, 150);
          n.W(objArray, 0, 150);
          n.W(objArray1, 0, 150);
          n.W(objArray2, 0, 150);
       }
       return;
    }
    public void n2(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "24")) {
          return;
       }
       d tl = this.l;
       if (tl != null && this.s != null) {
          if (this.u == null) {
             Button uButton = new Button(this.s.getContext());
             this.u = uButton;
             uButton.setPadding(a1.e(17.00f), 0, a1.e(17.00f), 0);
             this.u.setText(R.string.arg_RES_7f100f6b);
             this.u.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f67));
             this.u.setTextColor(a1.a(R.color.arg_RES_7f0600e0));
             this.u.setBackground(a1.f(R.drawable.arg_RES_7f0801c8));
             View view = this.l.findViewById(R.id.button_close);
             int i = (view != null)? n.o(view)[1] + (view.getHeight() / 2): 0;
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, a1.e(32.00f));
             layoutParams.gravity = 53;
             layoutParams.rightMargin = a1.e(19.00f);
             if (i > 0) {
                layoutParams.topMargin = i - (layoutParams.height / 2);
             }
             this.u.setVisibility(4);
             tl.addView(this.u, layoutParams);
          }
          n.Y(this.u, 0, 1);
          this.u.setOnClickListener(new b(this));
          if (p0) {
             this.i2();
          }
       }
    label_00c8 :
       return;
    }
    public final void o2(){
       Rect top;
       int i3;
       float f;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "18")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Rect rect = PatchProxy.apply(objArray, this, uob, "19");
       if (rect != patchProxyRe) {
       }else if(this.d.d(c.c).a != null || this.d.d(a.i).a != null){
          f obj = PatchProxy.apply(objArray, this, uob, "21");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else {
             obj = this.d.d(f.b).a;
             if (obj == DuetLayoutManager$LayoutMode.IN) {
                objArray = this.h2();
             }else {
                top = this.h2();
                if (top != null) {
                   DuetLayoutManager$LayoutMode mVideoSource = obj.mVideoSourceLayout;
                   if (mVideoSource != null) {
                      RectF rectF = a.b(mVideoSource);
                      RectF rectF1 = a.a(obj.mVideoSourceLayout);
                      rectF.union(rectF1);
                      Rect left = top.left;
                      Rect top1 = top.top;
                      f = (float)(top.right - left);
                      int i4 = (int)(rectF.left * f) + left;
                      f = (float)(top.bottom - top1);
                      i3 = (int)(rectF.top * f) + top1;
                      rect = new Rect(i4, i3, (left + (int)(f * rectF.right)), (top1 + (int)(f * rectF.bottom)));
                      StringBuilder str = "getPreviewRect, videoRect:"+rectF;
                      str = str+" , clipRect:"+rectF1;
                      objArray = new Object[0];
                      a.D().s("StickerMagicController", str+" , rect:"+top+" , previewRect:"+rect, objArray);
                      objArray = rect;
                   }
                }
             }
          }
          rect = objArray;
       }else {
          rect = this.h2();
       }
       if (this.s != null && rect != null) {
          int i = rect.right - rect.left;
          top = rect.top;
          int i1 = rect.bottom - top;
          FrameLayout$LayoutParams layoutParams = this.s.getLayoutParams();
          int i2 = layoutParams.width - i;
          i3 = layoutParams.height - i1;
          layoutParams.width = i;
          layoutParams.height = i1;
          layoutParams.topMargin = top - n.o(this.l)[1];
          this.s.setLayoutParams(layoutParams);
          this.s.post(new f(this, i2, i3));
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.q.removeCallbacksAndMessages(objArray);
       this.s = objArray;
       this.u = objArray;
       r.c().g(this.w);
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void qb(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          ts.setEnabled(false);
       }
       super.qb();
       return;
    }
    public final void z1(ViewGroup p0,Rect p1,EffectDescription p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "14")) {
          return;
       }
       Iterator iterator = this.getChildren().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof a) {
             ot.z1(p0, p1, p2);
          }
       }
       return;
    }
}
