package com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorLayout$DummyBehavior;
import a2.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import java.lang.Boolean;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorLayout$a;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$b;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

public class BottomSheetCoordinatorLayout extends CoordinatorLayout implements AppBarLayout$c	// class@000758
{
    public BottomSheetBehavior$c A;
    public Boolean B;
    public Boolean C;
    public Integer D;
    public AppBarLayout$Behavior E;
    public int F;
    public boolean G;
    public BottomSheetCoordinatorBehavior z;
    public static final String H;

    static {
       BottomSheetCoordinatorLayout.H = "BottomSheetCoordinatorLayout";
    }
    public void BottomSheetCoordinatorLayout(Context p0){
       super(p0);
       this.F = 0;
       this.G = false;
       this.b0();
    }
    public void BottomSheetCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.F = 0;
       this.G = false;
       this.b0();
    }
    public void BottomSheetCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.F = 0;
       this.G = false;
       this.b0();
    }
    public final void Y0(AppBarLayout p0,int p1){
       if (p1 == this.F) {
       }else {
          this.F = p1;
       }
       return;
    }
    public boolean Z(){
       boolean b = true;
       if (this.G != null && this.F == null) {
          b = false;
       }
       return b;
    }
    public boolean a0(){
       return this.G;
    }
    public final void b0(){
       if (PatchProxy.applyVoid(null, this, BottomSheetCoordinatorLayout.class, "1")) {
          return;
       }
       View view = new View(this.getContext());
       i0.A0(view, i0.w(this));
       view.setFitsSystemWindows(false);
       CoordinatorLayout$LayoutParams layoutParams = new CoordinatorLayout$LayoutParams(-1, -1);
       layoutParams.o(new BottomSheetCoordinatorLayout$DummyBehavior());
       this.addView(view, layoutParams);
       return;
    }
    public BottomSheetBehavior getBehavior(){
       return this.z;
    }
    public int getState(){
       BottomSheetCoordinatorLayout obj = PatchProxy.apply(null, this, BottomSheetCoordinatorLayout.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       int state = (obj != null)? obj.getState(): -1;
       return state;
    }
    public void onMeasure(int p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(BottomSheetCoordinatorLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BottomSheetCoordinatorLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.z != null) {
          return;
       }
       Object obj = null;
       BottomSheetCoordinatorBehavior uBottomSheet = PatchProxy.applyOneRefs(this, obj, BottomSheetCoordinatorBehavior.class, "1");
       if (uBottomSheet != patchProxyRe) {
       }else {
          uBottomSheet = this.getLayoutParams().f();
       }
       this.z = uBottomSheet;
       if (uBottomSheet != null) {
          BottomSheetCoordinatorLayout tA = this.A;
          if (tA != null) {
             uBottomSheet.setBottomSheetCallback(tA);
             this.A = obj;
          }
          BottomSheetCoordinatorLayout tC = this.C;
          if (tC != null) {
             this.z.setSkipCollapsed(tC.booleanValue());
             this.C = obj;
          }
          tC = this.B;
          if (tC != null) {
             this.z.setHideable(tC.booleanValue());
             this.B = obj;
          }
          tC = this.D;
          if (tC != null) {
             this.z.setState(tC.intValue());
             this.D = obj;
          }
       }
       AppBarLayout$Behavior obj1 = PatchProxy.apply(obj, this, BottomSheetCoordinatorLayout.class, "7");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          obj1 = 0;
          while (obj1 < this.getChildCount()) {
             View childAt = this.getChildAt(obj1);
             if (childAt instanceof AppBarLayout) {
                obj = childAt;
                break ;
             }
             obj1++;
          }
       }
       if (obj != null) {
          obj.c(this);
          obj1 = obj.getLayoutParams().f();
          this.E = obj1;
          obj1.x(new BottomSheetCoordinatorLayout$a(this));
          this.G = true;
       }else {
          this.G = false;
       }
       return;
    }
    public void setBottomSheetCallback(BottomSheetBehavior$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetCoordinatorLayout.class, "3")) {
          return;
       }
       BottomSheetCoordinatorLayout tz = this.z;
       if (tz == null) {
          this.A = p0;
       }else {
          tz.setBottomSheetCallback(p0);
       }
       return;
    }
    public void setHideable(boolean p0){
       if (PatchProxy.isSupport(BottomSheetCoordinatorLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomSheetCoordinatorLayout.class, "4")) {
          return;
       }
       BottomSheetCoordinatorLayout tz = this.z;
       if (tz == null) {
          this.B = Boolean.valueOf(p0);
       }else {
          tz.setHideable(p0);
       }
       return;
    }
    public void setSkipCollapsed(boolean p0){
       if (PatchProxy.isSupport(BottomSheetCoordinatorLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomSheetCoordinatorLayout.class, "5")) {
          return;
       }
       BottomSheetCoordinatorLayout tz = this.z;
       if (tz == null) {
          this.C = Boolean.valueOf(p0);
       }else {
          tz.setSkipCollapsed(p0);
       }
       return;
    }
    public void setState(int p0){
       if (PatchProxy.isSupport(BottomSheetCoordinatorLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BottomSheetCoordinatorLayout.class, "6")) {
          return;
       }
       BottomSheetCoordinatorLayout tz = this.z;
       if (tz == null) {
          this.D = Integer.valueOf(p0);
       }else {
          tz.setState(p0);
       }
       return;
    }
}
