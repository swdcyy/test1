package com.kuaishou.live.core.show.sticker.widget.BaseStickerContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import mk2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.g;
import nk2.b;
import com.yxcorp.gifshow.decoration.widget.g$a;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.IllegalStateException;
import nk2.a;
import com.kuaishou.live.core.show.sticker.widget.BaseStickerContainer$a;
import com.kuaishou.live.core.show.sticker.model.StickerInfo;
import android.view.ViewConfiguration;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import android.graphics.Point;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public abstract class BaseStickerContainer extends FrameLayout	// class@0010bc
{
    public a b;
    public a c;
    public a d;
    public boolean e;
    public boolean f;
    public final a g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public g o;
    public BaseStickerContainer$a p;
    public StickerInfo q;

    public void BaseStickerContainer(Context p0){
       super(p0, null);
    }
    public void BaseStickerContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BaseStickerContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = true;
       this.e = b;
       this.f = false;
       this.g = new a();
       this.h = false;
       this.i = 0x3f000000;
       this.j = 0x3f800000;
       this.k = 0;
       this.l = 0;
       if (PatchProxy.applyVoid(null, this, BaseStickerContainer.class, "1")) {
       }else {
          this.setClickable(b);
          this.setLongClickable(b);
          this.o = new g(this.getContext(), new b(this));
       }
       return;
    }
    public void c(boolean p0){
       this.f = p0;
    }
    public void d(boolean p0){
       this.e = p0;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseStickerContainer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.dispatchTouchEvent(p0);
       return this.f();
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(BaseStickerContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseStickerContainer.class, "2")) {
          return;
       }
       BaseStickerContainer tg = this.g;
       Boolean uBoolean = Boolean.valueOf(p0);
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(uBoolean, tg, a.class, "1")) {
          if (tg.b == null) {
             tg.b = true;
             tg.a = uBoolean;
          }else {
             throw new IllegalStateException("can not modify value twice!");
          }
       }
       return;
    }
    public boolean f(){
       a obj = PatchProxy.apply(null, this, BaseStickerContainer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Boolean fALSE = Boolean.FALSE;
       obj = this.g.a;
       if (obj != null) {
          fALSE = obj;
       }
       return fALSE.booleanValue();
    }
    public void g(a p0,a p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public BaseStickerContainer$a getOnActionListener(){
       return this.p;
    }
    public StickerInfo getStickInfo(){
       return this.q;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, BaseStickerContainer.class, "8")) {
          return;
       }
       super.onAttachedToWindow();
       BaseStickerContainer tp = this.p;
       if (tp != null) {
          tp.c(this);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, BaseStickerContainer.class, "9")) {
          return;
       }
       super.onDetachedFromWindow();
       this.setOnActionListener(null);
       this.clearAnimation();
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseStickerContainer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.f()) {
          return false;
       }
       if (p0.getAction() == 2 && ((p0.getRawX() - this.m) - (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop() > 0 || (p0.getRawY() - this.n) - (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop() > 0)) {
          return true;
       }
       this.m = p0.getRawX();
       this.n = p0.getRawY();
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean left;
       int top;
       a a;
       a b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, BaseStickerContainer.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b.c0(LiveLogTag.STICKER, "BaseStickerContainer", "MotionEvent", p0.toString());
       if (!this.f()) {
          return false;
       }
       String str = 2;
       if (this.p != null && (!p0.getAction() || p0.getAction() == str)) {
          this.p.d();
       }
       if (p0.getAction() != 1 && p0.getPointerCount() >= str) {
          this.h = true;
       }
       this.o.e(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseStickerContainer.class, "7") || (p0.getAction() != 1 && this.p != null)) {
          BaseStickerContainer td1 = this.d;
          Objects.requireNonNull(td1);
          Object obj1 = PatchProxy.applyOneRefs(this, td1, a.class, "1");
          if (obj1 != patchProxyRe) {
             left = obj1.booleanValue();
          }else if(this.getLeft() >= td1.a.x && (this.getLeft() < td1.b.x && (this.getTop() >= td1.a.y && this.getTop() < td1.b.y))){
             left = true;
          }else {
             left = false;
          }
          if (left) {
             this.p.e(this);
          }else {
             this.p.f(this);
          }
       }
    label_00b6 :
       if (p0.getAction() == 1 || p0.getAction() == 3) {
          obj = null;
          if (!PatchProxy.applyVoid(obj, this, BaseStickerContainer.class, "10") && this.f()) {
             if (this.h == null) {
                if (!PatchProxy.applyVoid(obj, this, BaseStickerContainer.class, "12")) {
                   left = this.getLeft();
                   top = this.getTop();
                   FrameLayout$LayoutParams layoutParams = this.getLayoutParams();
                   layoutParams.leftMargin = left;
                   layoutParams.topMargin = top;
                   this.setLayoutParams(layoutParams);
                   BaseStickerContainer tp1 = this.p;
                   if (tp1 != null) {
                      tp1.g(this);
                   }
                   tp1 = this.p;
                   if (tp1 != null) {
                      BaseStickerContainer td = this.d;
                      a = td.a;
                      if (left >= a.x) {
                         b = td.b;
                         if (left < b.x && (top >= a.y && top < b.y)) {
                            left = 1;
                         label_0123 :
                            if (left) {
                               tp1.j(this);
                            }
                         }
                      }
                      left = 0;
                      goto label_0123 ;
                   }
                }
             }else if(this.e == null || !this.j - 0x3f800000){
                if (!PatchProxy.applyVoid(obj, this, BaseStickerContainer.class, "11")) {
                   FrameLayout$LayoutParams layoutParams1 = this.getLayoutParams();
                   top = (int)(this.j * (float)this.getWidth());
                   int i = (int)(this.j * (float)this.getHeight());
                   layoutParams1.width = top;
                   layoutParams1.height = i;
                   layoutParams1.leftMargin = this.getLeft() - ((top - this.getWidth()) >> true);
                   layoutParams1.topMargin = this.getTop() - ((i - this.getHeight()) >> true);
                   this.setLayoutParams(layoutParams1);
                   this.clearAnimation();
                   BaseStickerContainer tp2 = this.p;
                   if (tp2 != null) {
                      tp2.h(this, (double)top, (double)i);
                   }
                }
             }
             float f = 0;
             this.k = f;
             this.l = f;
             this.j = 0x3f800000;
          }
       label_0190 :
          BaseStickerContainer tp = this.p;
          if (tp != null) {
             tp.b();
          }
          this.h = false;
       }
       if (this.f != null) {
          return super.onTouchEvent(p0);
       }else {
          return true;
       }
    }
    public void setOnActionListener(BaseStickerContainer$a p0){
       this.p = p0;
    }
    public void setStickerInfo(StickerInfo p0){
       this.q = p0;
    }
}
