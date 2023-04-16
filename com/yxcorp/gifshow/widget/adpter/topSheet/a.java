package com.yxcorp.gifshow.widget.adpter.topSheet.a;
import q0.e;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.app.Dialog;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import ag6.a;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import vyc.a;
import java.lang.IllegalArgumentException;
import android.os.Bundle;
import android.view.Window;

public class a extends e	// class@0018fe
{
    public TopSheetBehavior d;

    public void a(Context p0){
       super(p0, 0);
    }
    public void a(Context p0,int p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, a.class, "6");
          if (obj != PatchProxyResult.class) {
             p1 = obj.intValue();
          }else if(!p1){
             TypedValue typedValue = new TypedValue();
             typedValue = (p0.getTheme().resolveAttribute(0x7f04016d, typedValue, true))? typedValue.resourceId: 0x7f110354;
          }
       }else {
          goto label_0020 ;
       }
       super(p0, p1);
       return;
    }
    public final View e(int p0,View p1,ViewGroup$LayoutParams p2){
       FrameLayout obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = View.inflate(this.getContext(), R.layout.arg_RES_7f0d0486, null);
       CoordinatorLayout uCoordinator = obj.findViewById(R.id.coordinator);
       if (p0 && p1 == null) {
          p1 = a.c(this.getLayoutInflater(), p0, uCoordinator, false);
       }
       FrameLayout uFrameLayout = uCoordinator.findViewById(R.id.design_top_sheet);
       CoordinatorLayout$Behavior uBehavior = PatchProxy.applyOneRefs(uFrameLayout, null, TopSheetBehavior.class, "5");
       if (uBehavior != patchProxyRe) {
       }else {
          ViewGroup$LayoutParams layoutParams = uFrameLayout.getLayoutParams();
          if (layoutParams instanceof CoordinatorLayout$LayoutParams) {
             CoordinatorLayout$Behavior uBehavior1 = layoutParams.f();
             if (uBehavior1 instanceof TopSheetBehavior) {
                uBehavior = uBehavior1;
             }else {
                throw new IllegalArgumentException("The view is not associated with TopSheetBehavior");
             }
          }else {
             throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
          }
       }
       this.d = uBehavior;
       uBehavior.a = new a(this);
       if (p2 == null) {
          uFrameLayout.addView(p1);
       }else {
          uFrameLayout.addView(p1, p2);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.getWindow().setGravity(49);
       return;
    }
    public void setContentView(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "2")) {
          return;
       }
       super.setContentView(this.e(p0, null, null));
       return;
    }
    public void setContentView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.setContentView(this.e(0, p0, null));
       return;
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       super.setContentView(this.e(0, p0, p1));
       return;
    }
}
