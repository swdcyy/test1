package com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$MoveTarget;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import java.lang.Number;
import android.view.MotionEvent;
import java.lang.Boolean;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$b;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$a;
import java.lang.Float;

public class RangeSeekerV2 extends RelativeLayout implements d	// class@0019e2
{
    public View b;
    public View c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public RangeSeekerV2$b j;
    public RangeSeekerV2$a k;
    public int l;
    public int m;
    public int n;
    public RangeSeekerV2$MoveTarget o;
    public int p;

    public void RangeSeekerV2(Context p0){
       super(p0);
       this.m = n.c(a.a().a(), 20.00f);
       this.n = n.c(a.a().a(), 8.00f);
       a.d(this.getContext(), R.layout.arg_RES_7f0d12b8, this, true);
       this.doBindView(this);
    }
    public void RangeSeekerV2(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = n.c(a.a().a(), 20.00f);
       this.n = n.c(a.a().a(), 8.00f);
       a.d(this.getContext(), R.layout.arg_RES_7f0d12b8, this, true);
       this.doBindView(this);
    }
    public void RangeSeekerV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.m = n.c(a.a().a(), 20.00f);
       this.n = n.c(a.a().a(), 8.00f);
       a.d(this.getContext(), R.layout.arg_RES_7f0d12b8, this, true);
       this.doBindView(this);
    }
    public final void a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(RangeSeekerV2.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, RangeSeekerV2.class, "4")) {
          return;
       }
       this.c.getLayoutParams().leftMargin = p0;
       this.c.getLayoutParams().rightMargin = (this.getWidthWithoutPadding() - p1) - this.getHandlerWidth();
       if (p2 <= p1) {
          if (p2 < (this.getHandlerWidth() + p0)) {
             RangeSeekerV2 to = this.o;
             if (to == RangeSeekerV2$MoveTarget.LEFT_HANDLER) {
                p1 = this.getHandlerWidth() + p0;
             }else if(to == RangeSeekerV2$MoveTarget.RIGHT_HANDLER){
             }
          }else {
          }
       }
    label_005a :
       p0 = Math.max((p0 + this.getHandlerWidth()), p1);
       ViewGroup$MarginLayoutParams layoutParams = this.b.getLayoutParams();
       layoutParams.leftMargin = p0 - 6;
       this.b.setLayoutParams(layoutParams);
       this.i = p0;
       this.requestLayout();
       return;
    }
    public final Rect b(Rect p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RangeSeekerV2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = n.c(a.a().a(), 0x41f00000);
       p0.left = p0.left - i;
       p0.right = p0.right + i;
       return p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RangeSeekerV2.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a0c3c);
       this.b = m1.f(p0, 0x7f0a32ec);
       return;
    }
    public int getContentWidth(){
       Object obj = PatchProxy.apply(null, this, RangeSeekerV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.getEnd() - this.getStart());
    }
    public int getEnd(){
       return this.h;
    }
    public int getHandlerWidth(){
       return (this.m + this.n);
    }
    public final Rect getLeftHandlerRect(){
       Rect obj = PatchProxy.apply(null, this, RangeSeekerV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Rect();
       Rect rect = n.B(this.c, true);
       Rect left = rect.left;
       obj.set(left, rect.top, (this.m + left), rect.bottom);
       return obj;
    }
    public int getMaxWidth(){
       return this.e;
    }
    public final Rect getProgressIndicatorRect(){
       Object obj = PatchProxy.apply(null, this, RangeSeekerV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.B(this.b, true);
    }
    public final Rect getRightHandlerRect(){
       Rect obj = PatchProxy.apply(null, this, RangeSeekerV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Rect();
       Rect rect = n.B(this.c, true);
       Rect right = rect.right;
       obj.set((right - this.m), rect.top, right, rect.bottom);
       return obj;
    }
    public int getStart(){
       return this.g;
    }
    public final int getWidthWithoutPadding(){
       Object obj = PatchProxy.apply(null, this, RangeSeekerV2.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight());
    }
    public boolean onTouchEvent(MotionEvent p0){
       RangeSeekerV2 to;
       boolean b1;
       RangeSeekerV2$MoveTarget lEFT_HANDLER;
       RangeSeekerV2$MoveTarget moveTarget;
       RangeSeekerV2 tj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, RangeSeekerV2.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action != 2) {
                if (action == 3) {
                label_01c1 :
                   to = this.o;
                   if (to == RangeSeekerV2$MoveTarget.PROGRESS_INDICATOR) {
                      to = this.k;
                      if (to != null) {
                         to.a();
                      }
                   }else if(to == RangeSeekerV2$MoveTarget.LEFT_HANDLER){
                      to = this.j;
                      if (to != null) {
                         to.c();
                      }
                   }else if(to == RangeSeekerV2$MoveTarget.RIGHT_HANDLER){
                      to = this.j;
                      if (to != null) {
                         to.e();
                      }
                   }
                   this.d = 0;
                   this.p = 0;
                   this.o = null;
                   return b;
                }
             }else {
                RangeSeekerV2$MoveTarget nONE = RangeSeekerV2$MoveTarget.NONE;
                if (this.o != nONE) {
                   action = (int)(p0.getX() - (float)this.d);
                   int i = this.p + action;
                   if (PatchProxy.isSupport(RangeSeekerV2.class)) {
                      RelativeLayout$LayoutParams obj1 = PatchProxy.applyOneRefs(Integer.valueOf(action), this, RangeSeekerV2.class, "17");
                      if (obj1 != patchProxyRe) {
                         b1 = obj1.booleanValue();
                      }else {
                      label_0057 :
                         RelativeLayout$LayoutParams leftMargin = this.c.getLayoutParams().leftMargin;
                         obj1 = this.c.getLayoutParams().rightMargin;
                         RangeSeekerV2 to1 = this.o;
                         if (to1 == RangeSeekerV2$MoveTarget.LEFT_HANDLER) {
                            Object[] objArray1 = new Object[0];
                            a.D().w("RangeSeekerV2", "dragHandlerLeftMargin = "+leftMargin+", dragHandlerRightMargin = "+obj1+", mMinContentWidth = "+this.f+", widthWithoutPadding ="+this.getWidthWithoutPadding(), objArray1);
                            if (action < 0 || (((leftMargin + obj1) + this.f) + (this.getHandlerWidth() * 2)) < this.getWidthWithoutPadding()) {
                            label_00bf :
                               b1 = true;
                            }
                         }else if(to1 == RangeSeekerV2$MoveTarget.RIGHT_HANDLER){
                            if (action > 0 || (((leftMargin + obj1) + this.f) + (this.getHandlerWidth() * 2)) < this.getWidthWithoutPadding()) {
                               goto label_00bf ;
                            }
                         }else if(to1 == RangeSeekerV2$MoveTarget.PROGRESS_INDICATOR){
                            goto label_00bf ;
                         }
                         b1 = false;
                      }
                   }else {
                      goto label_0057 ;
                   }
                   if (b1) {
                      Object[] objArray = new Object[0];
                      a.D().w("RangeSeekerV2", "canDrag", objArray);
                      to = this.o;
                      lEFT_HANDLER = RangeSeekerV2$MoveTarget.LEFT_HANDLER;
                      if (to == lEFT_HANDLER) {
                         to = this.j;
                         if (to != null) {
                            to.b(i);
                         }
                      }else if(to == RangeSeekerV2$MoveTarget.RIGHT_HANDLER){
                         to = this.j;
                         if (to != null) {
                            to.d(i);
                         }
                      }else if(to == RangeSeekerV2$MoveTarget.PROGRESS_INDICATOR){
                         to = this.k;
                         if (to != null) {
                            to.b(i);
                         }
                      }
                      if (!PatchProxy.isSupport(RangeSeekerV2.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, RangeSeekerV2.class, "3")) {
                         to = this.o;
                         if (to != nONE) {
                            if (to == lEFT_HANDLER) {
                               this.g = Math.max(Math.max(Math.min(i, (this.h - this.f)), 0), (this.h - this.e));
                            }else if(to == RangeSeekerV2$MoveTarget.RIGHT_HANDLER){
                               this.h = Math.max(Math.min(Math.min(Math.min(i, (this.getWidthWithoutPadding() - this.getHandlerWidth())), (this.getHandlerWidth() + this.l)), ((this.g + this.getHandlerWidth()) + this.e)), ((this.g + this.getHandlerWidth()) + this.f)) - this.getHandlerWidth();
                            }else if(to == RangeSeekerV2$MoveTarget.PROGRESS_INDICATOR){
                               this.i = Math.min((this.h + this.getHandlerWidth()), Math.max((this.g + this.getHandlerWidth()), i));
                            }
                            this.a(this.g, (this.h + this.getHandlerWidth()), this.i);
                         }
                      }
                      return b;
                   }else {
                      obj = new Object[0];
                      a.D().w("RangeSeekerV2", "can not Drag", obj);
                   }
                }
             }
          }else {
             goto label_01c1 ;
          }
       }else {
          float rawX = p0.getRawX();
          float rawY = p0.getRawY();
          if (PatchProxy.isSupport(RangeSeekerV2.class)) {
             moveTarget = PatchProxy.applyTwoRefs(Float.valueOf(rawX), Float.valueOf(rawY), this, RangeSeekerV2.class, "12");
             if (moveTarget != patchProxyRe) {
             label_0266 :
                this.o = moveTarget;
                if (moveTarget == RangeSeekerV2$MoveTarget.LEFT_HANDLER) {
                   tj = this.j;
                   if (tj != null) {
                      tj.a();
                   }
                   this.p = this.c.getLayoutParams().leftMargin;
                }else if(moveTarget == RangeSeekerV2$MoveTarget.RIGHT_HANDLER){
                   tj = this.j;
                   if (tj != null) {
                      tj.a();
                   }
                   this.p = ((this.getWidthWithoutPadding() - this.c.getLayoutParams().rightMargin) - this.m) - this.n;
                }else if(moveTarget == RangeSeekerV2$MoveTarget.PROGRESS_INDICATOR){
                   tj = this.k;
                   if (tj != null) {
                      tj.onSeekStart();
                   }
                   this.p = this.b.getLayoutParams().leftMargin;
                }
                if (this.o != RangeSeekerV2$MoveTarget.NONE) {
                   this.d = (int)p0.getX();
                   return b;
                }
             }
          }
          lEFT_HANDLER = RangeSeekerV2$MoveTarget.NONE;
          if (!this.c.getVisibility() && this.b(this.getLeftHandlerRect()).contains((int)rawX, (int)rawY)) {
             lEFT_HANDLER = RangeSeekerV2$MoveTarget.LEFT_HANDLER;
          }else if(!this.c.getVisibility() && this.b(this.getRightHandlerRect()).contains((int)rawX, (int)rawY)){
             lEFT_HANDLER = RangeSeekerV2$MoveTarget.RIGHT_HANDLER;
          }else if(!this.b.getVisibility() && this.b(this.getProgressIndicatorRect()).contains((int)rawX, (int)rawY)){
             lEFT_HANDLER = RangeSeekerV2$MoveTarget.PROGRESS_INDICATOR;
          }
          moveTarget = lEFT_HANDLER;
          goto label_0266 ;
       }
    label_02c8 :
       return super.onTouchEvent(p0);
    }
    public void setEnd(int p0){
       if (PatchProxy.isSupport(RangeSeekerV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RangeSeekerV2.class, "8")) {
          return;
       }
       this.h = p0;
       this.a(this.g, (p0 + this.getHandlerWidth()), this.i);
       return;
    }
    public void setIndicatorPosition(int p0){
       if (PatchProxy.isSupport(RangeSeekerV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RangeSeekerV2.class, "9")) {
          return;
       }
       this.i = p0 + this.getHandlerWidth();
       this.a(this.g, (this.h + this.getHandlerWidth()), this.i);
       return;
    }
    public void setMaxEnd(int p0){
       this.l = p0;
    }
    public void setMaxWidth(int p0){
       if (PatchProxy.isSupport(RangeSeekerV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RangeSeekerV2.class, "5")) {
          return;
       }
       this.e = p0;
       this.g = 0;
       this.h = p0 + this.getHandlerWidth();
       this.i = this.g + this.getHandlerWidth();
       this.a(this.g, (this.h + this.getHandlerWidth()), (this.g + this.getHandlerWidth()));
       return;
    }
    public void setMinWidth(int p0){
       this.f = p0;
    }
    public void setOnProgressIndicatorPositionChangeListener(RangeSeekerV2$a p0){
       this.k = p0;
    }
    public void setOnRangeChangeListener(RangeSeekerV2$b p0){
       this.j = p0;
    }
    public void setStart(int p0){
       if (PatchProxy.isSupport(RangeSeekerV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RangeSeekerV2.class, "7")) {
          return;
       }
       this.g = p0;
       this.a(p0, (this.h + this.getHandlerWidth()), this.i);
       return;
    }
}
