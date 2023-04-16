package com.kuaishou.live.common.core.component.gift.DrawingGiftEditView;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.GestureDetector;
import ug1.e;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import java.lang.Float;
import java.lang.Integer;
import com.yxcorp.gifshow.models.Gift;
import java.util.Iterator;
import com.kuaishou.live.core.show.gift.DrawingGift;
import java.util.Collection;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView$a;
import android.animation.Animator$AnimatorListener;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import cm1.a;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import i2b.a;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class DrawingGiftEditView extends View implements GestureDetector$OnGestureListener	// class@001117
{
    public e b;
    public GestureDetector c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public View i;
    public Gift j;
    public DrawingGift k;
    public final List l;
    public int m;
    public int n;
    public Set o;
    public int p;
    public AnimatorSet q;
    public AnimatorSet r;
    public DrawingGift$Point s;
    public boolean t;

    public void DrawingGiftEditView(Context p0){
       super(p0, null, 0);
    }
    public void DrawingGiftEditView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DrawingGiftEditView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = new HashSet();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.s0);
       this.h = typedArray.getResourceId(0, 0);
       this.f = typedArray.getDimensionPixelOffset(1, 0);
       this.g = typedArray.getDimensionPixelOffset(2, 0);
       this.c = new GestureDetector(this.getContext(), this);
       this.b = new e();
       this.l = new ArrayList();
       typedArray.recycle();
       this.setBackgroundResource(R.color.arg_RES_7f0609cf);
       this.setVisibility(8);
    }
    public void a(DrawingGiftEditView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftEditView.class, "18")) {
          return;
       }
       this.o.add(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, DrawingGiftEditView.class, "3")) {
          return;
       }
       if (this.k == null) {
          return;
       }
       this.l.clear();
       this.invalidate();
       this.e(this.l.size());
       this.f();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, DrawingGiftEditView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.l.isEmpty();
    }
    public final DrawingGift$Point d(float p0,float p1){
       DrawingGiftEditView obj;
       boolean b;
       int i = this;
       float f = p0;
       float f1 = p1;
       if (PatchProxy.isSupport(DrawingGiftEditView.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), i, DrawingGiftEditView.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (i.t != null) {
          return null;
       }else if(i.l.size() >= i.p){
          return null;
       }else {
          obj = i.f;
          int i1 = (int)(f - (float)(obj / 2));
          int i2 = (int)(f1 - (float)(obj / 2));
          int i3 = (int)((float)(obj / 2) + f);
          int i4 = (int)((float)(obj / 2) + f1);
          if (PatchProxy.isSupport(DrawingGiftEditView.class)) {
             Object obj1 = PatchProxy.applyFourRefs(Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), this, DrawingGiftEditView.class, "11");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(i1 >= 0 && (i2 >= 0 && (i3 > this.getWidth() || i4 > this.getHeight()))){
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_0079 ;
          }
          if (b) {
             return null;
          }else {
             i.d = (int)f;
             i.e = (int)f1;
             DrawingGiftEditView j = i.j;
             DrawingGift$Point point = new DrawingGift$Point(j.mId, j.mPrice, i1, i2, i3, i4);
             i.l.add(b);
             this.invalidate();
             i.e(i.l.size());
             return b;
          }
       }
    }
    public final void e(int p0){
       if (PatchProxy.isSupport(DrawingGiftEditView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DrawingGiftEditView.class, "20")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, DrawingGiftEditView.class, "23")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, DrawingGiftEditView.class, "21")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().e();
       }
       return;
    }
    public DrawingGift getDrawingGiftSnapshot(){
       DrawingGiftEditView obj = PatchProxy.apply(null, this, DrawingGiftEditView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          return new DrawingGift(0, 0, new ArrayList(this.l));
       }
       return new DrawingGift(obj.mWidth, obj.mHeight, new ArrayList(this.l));
    }
    public void h(DrawingGiftEditView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftEditView.class, "19")) {
          return;
       }
       this.o.remove(p0);
       return;
    }
    public void i(DrawingGift$Point p0,boolean p1){
       if (p1) {
          DrawingGiftEditView ts = this.s;
          if (ts != null) {
             ts.mIsHandUp = true;
          }
       }
       if (p0 != null) {
          this.s = p0;
       }
       return;
    }
    public void j(boolean p0){
       if (PatchProxy.isSupport(DrawingGiftEditView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DrawingGiftEditView.class, "9")) {
          return;
       }
       if (this.getVisibility() || (this.r == null || !this.isEnabled())) {
          return;
       }
       DrawingGiftEditView tr = this.r;
       if (tr != null) {
          tr.cancel();
          this.r = null;
       }
       this.setVisibility(0);
       if (p0) {
          if (this.q == null) {
             AnimatorSet uAnimatorSet = new AnimatorSet();
             this.q = uAnimatorSet;
             uAnimatorSet.setDuration(300);
             this.q.play(j.a(this, new float[2]{0,0x3f800000}));
             this.q.addListener(new DrawingGiftEditView$a(this));
             this.q.start();
          }
       }else {
          this.setAlpha(0x3f800000);
          DrawingGiftEditView tq = this.q;
          if (tq != null) {
             tq.cancel();
             this.q = null;
          }
       }
       return;
    }
    public void k(int p0,int p1){
       if (PatchProxy.isSupport(DrawingGiftEditView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DrawingGiftEditView.class, "6")) {
          return;
       }
       if (p0 > 0 && p1 > 0) {
          this.k = new DrawingGift(p0, p1, this.l);
       }
       return;
    }
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DrawingGiftEditView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int b = false;
       this.t = b;
       DrawingGiftEditView tj = this.j;
       if (tj == null) {
          return b;
       }
       if (a.b(tj.mId) == null) {
          return b;
       }
       if (!this.l.size()) {
          this.g();
       }
       b = this.l.size();
       if (!PatchProxy.isSupport(DrawingGiftEditView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b), this, DrawingGiftEditView.class, "22")) {
          Iterator iterator = this.o.iterator();
          while (iterator.hasNext()) {
             iterator.next().d(b);
          }
       }
       this.d = (int)p0.getX();
       this.e = (int)p0.getY();
       DrawingGift$Point point = this.d(p0.getX(), p0.getY());
       if (point != null) {
          point.mIsHandDown = true;
          this.i(point, true);
       }
       return true;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftEditView.class, "13")) {
          return;
       }
       super.onDraw(p0);
       if (this.isEnabled()) {
          this.b.b(p0, this.k, this.getWidth(), this.getHeight());
          if (this.j == null || (this.c() && (!PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftEditView.class, "14") && this.h != null))) {
             if (this.i == null) {
                View view = a.i(new FrameLayout(this.getContext()), this.h);
                this.i = view;
                view.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
                DrawingGiftEditView tm = this.m;
                if (tm == null) {
                   tm = this.getMeasuredWidth();
                }
                DrawingGiftEditView tn = this.n;
                if (tn == null) {
                   tn = this.getMeasuredHeight();
                }
                this.i.layout(0, 0, tm, tn);
             }
             this.i.draw(p0);
          }
       }
    label_0082 :
       return;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(DrawingGiftEditView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, DrawingGiftEditView.class, "12")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.k == null) {
          this.k = new DrawingGift(this.getMeasuredWidth(), this.getMeasuredHeight(), this.l);
       }
       return;
    }
    public void onLongPress(MotionEvent p0){
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       DrawingGiftEditView this;
       if (PatchProxy.isSupport(DrawingGiftEditView.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, DrawingGiftEditView.class, "17");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (this.j == null) {
          return false;
       }else {
          float f = p1.getX() - (float)this.d;
          float f1 = p1.getY() - (float)this.e;
          double d = Math.sqrt((double)((f * f) + (f1 * f1)));
          int i = (int)(d / (double)this.g);
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this = this.g;
             float f2 = (float)this * f;
             double d1 = (double)f2 / d;
             double d2 = (double)this.d + d1;
             float f3 = (float)this * f1;
             double d3 = (double)f3 / d;
             d1 = (double)this.e + d3;
             this.i(this.d((float)d2, (float)d1), false);
          }
          return true;
       }
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DrawingGiftEditView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.getAction() == 1) {
          this.t = b;
       }
       if (this.isEnabled() && this.c.onTouchEvent(p0)) {
          b = true;
       }
       return b;
    }
    public void setEmptyViewHeight(int p0){
       this.n = p0;
    }
    public void setEmptyViewWidth(int p0){
       this.m = p0;
    }
    public void setMaxPointCount(int p0){
       this.p = p0;
    }
    public void setPointGift(Gift p0){
       this.j = p0;
    }
}
