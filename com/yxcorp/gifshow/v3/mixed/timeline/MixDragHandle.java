package com.yxcorp.gifshow.v3.mixed.timeline.MixDragHandle;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hwc.b;
import android.widget.HorizontalScrollView;
import java.lang.Integer;
import hwc.a;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import com.yxcorp.gifshow.v3.mixed.timeline.MixVideoView;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.mixed.model.b;
import com.yxcorp.gifshow.v3.mixed.model.DragStatus;
import java.lang.Math;

public class MixDragHandle extends View	// class@00155b
{
    public MixVideoView b;
    public MixTimelineScroller c;
    public RectF d;
    public RectF e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public double k;
    public double l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    public void MixDragHandle(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new RectF();
       this.e = new RectF();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, MixDragHandle.class, "3")) {
          return;
       }
       if (this.p == null) {
          b.c();
       }
       this.p = true;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, MixDragHandle.class, "4")) {
          return;
       }
       this.f = 0xbff0000000000000;
       this.g = 0xbff0000000000000;
       this.j = 0xbff0000000000000;
       this.m = false;
       this.n = false;
       this.o = false;
       this.c.requestDisallowInterceptTouchEvent(false);
       this.setActivated(false);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MixDragHandle.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MixDragHandle.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.b != null) {
          p0 = this.getMeasuredWidth();
          int e = a.e;
          float f = (float)this.getMeasuredHeight();
          this.d.set(0, 0, (float)e, f);
          this.e.set((float)(p0 - e), 0, (float)p0, f);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       MixDragHandle tm;
       MixDragHandle tb;
       MixDragHandle mixDragHandl;
       MixDragHandle obj = PatchProxy.applyOneRefs(p0, this, MixDragHandle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       MixVideoTrack data = obj.getData();
       boolean action = p0.getAction();
       boolean b1 = true;
       if (action) {
          String str = "MixVideoView";
          String str1 = ", isLeft ";
          if (action != b1) {
             if (action == -4002784017386865500000000000000000000000000.00f) {
                double d = (double)p0.getRawX() - this.f;
                tm = this.m;
                if (tm != null || this.n != null) {
                   if (this.o == null) {
                      this.o = b1;
                      tb = this.b;
                      Objects.requireNonNull(tb);
                      if (!PatchProxy.isSupport(MixVideoView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tm), tb, MixVideoView.class, "10")) {
                         Object[] objArray1 = new Object[b];
                         a.D().w(str, "onDragStart "+tb.f+str1+tm, objArray1);
                         tb.requestLayout();
                         tb.c.q0();
                         tb.c.e.onDragBegin(tb.f, tm);
                      }
                   }
                   double d1 = b.d(d);
                   if (this.m != null) {
                      d = this.g + d1;
                      boolean b2 = (d - this.i > 0)? true: false;
                      this.setActivated(b2);
                      MixDragHandle th = this.h;
                      if (d - th < 0) {
                         this.a();
                      }else {
                         th = this.i;
                         if (d - th > 0) {
                            this.a();
                         }else {
                            this.p = b;
                         label_00c4 :
                            data.mClipStart = mixDragHandl;
                            this.b.a(b1, b.b((mixDragHandl - this.g)));
                            this.requestLayout();
                         }
                      }
                      mixDragHandl = th;
                      goto label_00c4 ;
                   }else if(this.n != null){
                      d = this.j + d1;
                      if (d - this.k >= 0) {
                         b1 = false;
                      }
                      this.setActivated(b1);
                      tb = this.k;
                      if (d - tb < 0) {
                         this.a();
                      }else {
                         tb = this.l;
                         if (d - tb > 0) {
                            this.a();
                         }else {
                            this.p = b;
                         label_0100 :
                            data.mClipEnd = mixDragHandl;
                            Object[] objArray = new Object[b];
                            a.D().w("MixVideoTrack", "set mClipEnd = "+mixDragHandl+" ,track.index="+data.mIndex, objArray);
                            this.b.a(b, b.b((data.mClipEnd - this.j)));
                            this.requestLayout();
                         }
                      }
                      mixDragHandl = tb;
                      goto label_0100 ;
                   }
                }
             }
          }else if(this.o != null){
             tm = this.b;
             obj = this.m;
             Objects.requireNonNull(tm);
             if (!PatchProxy.isSupport(MixVideoView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(obj), tm, MixVideoView.class, "12")) {
                Object[] objArray2 = new Object[b];
                a.D().w(str, "onDragEnd "+tm.f+str1+obj, objArray2);
                tm.requestLayout();
                tm.c.e.onDragEnd(tm.f, obj);
             }
             this.requestLayout();
          }
          this.b();
       }else {
          this.b();
          action = this.d.contains(p0.getX(), p0.getY());
          boolean b3 = this.e.contains(p0.getX(), p0.getY());
          if (action && b3) {
             if (Math.abs((this.d.centerX() - p0.getX())) - Math.abs((this.e.centerX() - p0.getX())) <= 0) {
                b = action;
                b3 = false;
             }
          }else {
             b = action;
          }
          this.f = (double)p0.getRawX();
          if (b || b3) {
             this.g = data.mClipStart;
             this.h = 0;
             this.i = data.getMaxClipStart();
             this.j = data.mClipEnd;
             this.k = data.getMinClipEnd();
             this.l = data.mFullDuration;
             this.c.requestDisallowInterceptTouchEvent(b1);
             this.m = b;
             this.n = b ^ 0x01;
             return b1;
          }
       }
    label_01e8 :
       return this.o;
    }
}
