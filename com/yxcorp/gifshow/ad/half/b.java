package com.yxcorp.gifshow.ad.half.b;
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
import com.yxcorp.gifshow.ad.half.b$b;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior;
import android.widget.FrameLayout;
import android.app.Dialog;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$b;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import ag6.a;
import t29.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.half.b$a;
import a2.a;
import a2.i0;
import com.yxcorp.gifshow.ad.half.a;
import android.view.View$OnTouchListener;
import android.os.Bundle;
import android.view.Window;
import java.lang.Boolean;

public class b extends e	// class@001784
{
    public AdBottomSheetBehavior d;
    public FrameLayout e;
    public boolean f;
    public boolean g;
    public boolean h;
    public AdBottomSheetBehavior$b i;
    public static final int j;

    public void b(Context p0){
       super(p0, 0);
    }
    public void b(Context p0,int p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, b.class, "13");
          if (obj != PatchProxyResult.class) {
             p1 = obj.intValue();
          }else if(!p1){
             TypedValue typedValue = new TypedValue();
             typedValue = (p0.getTheme().resolveAttribute(0x7f04016d, typedValue, true))? typedValue.resourceId: 0x7f110352;
          }
       }else {
          goto label_0021 ;
       }
       super(p0, p1);
       this.f = true;
       this.g = true;
       this.i = new b$b(this);
       this.d(true);
       return;
    }
    public void cancel(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "7")) {
          return;
       }
       b uob = PatchProxy.apply(objArray, this, b.class, "9");
       if (uob != PatchProxyResult.class) {
       }else if(this.d == null){
          this.e();
       }
       uob = this.d;
       if (uob.getState() == 5) {
          super.cancel();
       }else {
          uob.setState(5);
       }
       return;
    }
    public final FrameLayout e(){
       Object[] objArray = null;
       FrameLayout obj = PatchProxy.apply(objArray, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          obj = View.inflate(this.getContext(), R.layout.arg_RES_7f0d0048, objArray);
          this.e = obj;
          AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.g(obj.findViewById(R.id.design_bottom_sheet));
          this.d = uAdBottomShe;
          uAdBottomShe.d(this.i);
       }
       return this.e;
    }
    public final View f(int p0,View p1,ViewGroup$LayoutParams p2){
       CoordinatorLayout obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e();
       obj = this.e.findViewById(R.id.coordinator);
       if (p0 && p1 == null) {
          p1 = a.c(this.getLayoutInflater(), p0, obj, false);
       }
       FrameLayout uFrameLayout = this.e.findViewById(R.id.design_bottom_sheet);
       uFrameLayout.removeAllViews();
       if (p2 == null) {
          uFrameLayout.addView(p1);
       }else {
          uFrameLayout.addView(p1, p2);
       }
       obj.findViewById(R.id.touch_outside).setOnClickListener(new c(this));
       i0.s0(uFrameLayout, new b$a(this));
       uFrameLayout.setOnTouchListener(a.b);
       return this.e;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Window window = this.getWindow();
       if (window != null) {
          window.setLayout(-1, -1);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       super.onStart();
       b td = this.d;
       if (td != null && td.getState() == 5) {
          this.d.setState(4);
       }
       return;
    }
    public void setCancelable(boolean p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "5")) {
          return;
       }
       super.setCancelable(p0);
       if (this.f != p0) {
          this.f = p0;
       }
       return;
    }
    public void setCanceledOnTouchOutside(boolean p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "8")) {
          return;
       }
       super.setCanceledOnTouchOutside(p0);
       if (p0 && this.f == null) {
          this.f = true;
       }
       this.g = p0;
       this.h = true;
       return;
    }
    public void setContentView(int p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, b.class, "1")) {
          return;
       }
       super.setContentView(this.f(p0, null, null));
       return;
    }
    public void setContentView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       super.setContentView(this.f(0, p0, null));
       return;
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       super.setContentView(this.f(0, p0, p1));
       return;
    }
}
