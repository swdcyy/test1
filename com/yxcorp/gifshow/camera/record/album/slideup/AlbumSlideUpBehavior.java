package com.yxcorp.gifshow.camera.record.album.slideup.AlbumSlideUpBehavior;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import vb9.q;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import java.lang.IllegalArgumentException;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import java.lang.Boolean;
import vb9.o;
import java.lang.Integer;
import lnc.a1;

public class AlbumSlideUpBehavior extends BottomSheetBehavior	// class@001ccc
{
    public boolean L;
    public boolean M;
    public long N;
    public long O;
    public boolean P;
    public final q Q;
    public o R;
    public boolean S;

    public void AlbumSlideUpBehavior(){
       super();
       this.P = false;
       this.Q = new q();
       this.S = false;
       this.d(true);
    }
    public void AlbumSlideUpBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.P = false;
       this.Q = new q();
       this.S = false;
       this.d(true);
       this.B = 0.20f;
       this.C = 0.07f;
       this.D = 0.14f;
       this.E = 0.14f;
       this.H = 30;
    }
    public static AlbumSlideUpBehavior j(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumSlideUpBehavior.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (!layoutParams instanceof CoordinatorLayout$LayoutParams) {
          throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
       }
       CoordinatorLayout$Behavior uBehavior = layoutParams.f();
       if (uBehavior instanceof AlbumSlideUpBehavior) {
          return uBehavior;
       }
       throw new IllegalArgumentException("The view is not associated with AlbumSlideUpBehavior");
    }
    public boolean k(){
       return this.S;
    }
    public final boolean l(int p0){
       if (!p0) {
          return this.L;
       }
       if (p0 != 1) {
          return false;
       }
       return this.M;
    }
    public void m(boolean p0){
       this.S = p0;
    }
    public final void n(int p0,boolean p1){
       if (p0) {
          if (p0 == 1) {
             this.M = p1;
          }
       }else {
          this.L = p1;
       }
       return;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AlbumSlideUpBehavior.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.S == null) {
          return false;
       }
       boolean b = super.onInterceptTouchEvent(p0, p1, p2);
       AlbumSlideUpBehavior tR = this.R;
       if (tR != null) {
          b = b & (tR.I0(p2) ^ 0x01);
       }
       return b;
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       AlbumSlideUpBehavior uAlbumSlideU = AlbumSlideUpBehavior.class;
       if (PatchProxy.isSupport(uAlbumSlideU)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uAlbumSlideU, "6")) {
             return;
          }
       }
       if (this.l(p6) && (p4 > 0 && !this.c() - 0x3f800000)) {
          this.n(p6, 0);
       }
    label_004a :
       if (this.S == null) {
          this.n(p6, 0);
       }
       if (this.l(p6)) {
          super.onNestedPreScroll(p0, p1, p2, p3, p4, p5, p6);
       }
       return;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       AlbumSlideUpBehavior uAlbumSlideU = AlbumSlideUpBehavior.class;
       int i = 0;
       if (PatchProxy.isSupport(uAlbumSlideU)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, uAlbumSlideU, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.onStartNestedScroll(p0, p1, p2, p3, p4, p5);
       AlbumSlideUpBehavior tR = this.R;
       if (tR != null) {
          tR.F0(p3);
       }
       if (p3.canScrollVertically(-1)) {
          this.N = a1.k();
       }else if(a1.o(this.N) - 1000 < 0){
          i = b;
       }
       this.n(p5, i);
       return i;
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       if (PatchProxy.isSupport(AlbumSlideUpBehavior.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, AlbumSlideUpBehavior.class, "7")) {
          return;
       }
       if (this.l(p3)) {
          super.onStopNestedScroll(p0, p1, p2, p3);
       }
       return;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AlbumSlideUpBehavior.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p2, this, AlbumSlideUpBehavior.class, "3");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(this.S == null){
          obj = 3;
          if (!p2.getAction() || p2.getAction() == obj) {
             this.P = b;
          }
          if (this.P == null) {
             if (p2.getPointerCount() > 1) {
                this.P = true;
             }else {
                AlbumSlideUpBehavior tR1 = this.R;
                b1 = (tR1 != null && tR1.J1(p2))? 1: 0;
                if (b1) {
                   if (!p2.getAction()) {
                      this.P = true;
                   }
                }else {
                   this.Q.onMotionEvent(p2);
                   b1 = p2.getAction();
                   if (b1) {
                      if (b1 != 1 && b1 != 2) {
                         if (b1 == obj) {
                         label_0094 :
                            tR1 = this.O;
                            b1 = (!tR1 || a1.o(tR1) - 100 >= 0)? true: false;
                            this.O = a1.k();
                         }
                      }else {
                         float f = this.c();
                         if (f - 0x3c23d70a <= 0 || f - 0x3f7d70a4 >= 0) {
                            this.Q.a();
                         }
                      }
                      b1 = true;
                   }else {
                      goto label_0094 ;
                   }
                }
             }
          }
       }
    label_0030 :
       b1 = false;
       if (b1) {
          super.onTouchEvent(p0, p1, p2);
       }
       if (this.getState() != 1 && (this.getState() != 2 && this.getState() != 6)) {
          AlbumSlideUpBehavior tR = this.R;
          if (tR == null || !tR.k1(p2)) {
          label_00d3 :
             return b;
          }
       }
       b = true;
       goto label_00d3 ;
    }
}
