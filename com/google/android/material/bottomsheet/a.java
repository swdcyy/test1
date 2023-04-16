package com.google.android.material.bottomsheet.a;
import q0.e;
import android.content.Context;
import com.google.android.material.bottomsheet.a$d;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.app.Dialog;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import ag6.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.google.android.material.bottomsheet.a$a;
import android.view.View$OnClickListener;
import com.google.android.material.bottomsheet.a$b;
import a2.a;
import a2.i0;
import com.google.android.material.bottomsheet.a$c;
import android.view.View$OnTouchListener;
import android.os.Bundle;
import android.view.Window;

public class a extends e	// class@001668
{
    public BottomSheetBehavior d;
    public boolean e;
    public boolean f;
    public boolean g;
    public BottomSheetBehavior$c h;

    public void a(Context p0){
       super(p0, 0);
    }
    public void a(Context p0,int p1){
       super(p0, a.b(p0, p1));
       this.e = true;
       this.f = true;
       this.h = new a$d(this);
       this.d(true);
    }
    public static int b(Context p0,int p1){
       TypedValue typedValue;
       if (!p1) {
          typedValue = new TypedValue();
          typedValue = (p0.getTheme().resolveAttribute(0x7f04016d, typedValue, true))? typedValue.resourceId: 0x7f110352;
       }
    label_001b :
       return typedValue;
    }
    public boolean e(){
       if (this.g == null) {
          int[] ointArray = new int[]{0x101035b};
          TypedArray typedArray = this.getContext().obtainStyledAttributes(ointArray);
          this.f = typedArray.getBoolean(0, 1);
          typedArray.recycle();
          this.g = true;
       }
       return this.f;
    }
    public final View f(int p0,View p1,ViewGroup$LayoutParams p2){
       FrameLayout uFrameLayout = View.inflate(this.getContext(), R.layout.arg_RES_7f0d0258, null);
       CoordinatorLayout uCoordinator = uFrameLayout.findViewById(R.id.coordinator);
       if (p0 && p1 == null) {
          p1 = a.c(this.getLayoutInflater(), p0, uCoordinator, false);
       }
       FrameLayout uFrameLayout1 = uCoordinator.findViewById(R.id.design_bottom_sheet);
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(uFrameLayout1);
       this.d = uBottomSheet;
       uBottomSheet.setBottomSheetCallback(this.h);
       this.d.setHideable(this.e);
       if (p2 == null) {
          uFrameLayout1.addView(p1);
       }else {
          uFrameLayout1.addView(p1, p2);
       }
       uCoordinator.findViewById(R.id.touch_outside).setOnClickListener(new a$a(this));
       i0.s0(uFrameLayout1, new a$b(this));
       uFrameLayout1.setOnTouchListener(new a$c(this));
       return uFrameLayout;
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       Window window = this.getWindow();
       if (window != null) {
          window.clearFlags(0x4000000);
          window.addFlags(Integer.MIN_VALUE);
          window.setLayout(-1, -1);
       }
       return;
    }
    public void onStart(){
       super.onStart();
       a td = this.d;
       if (td != null && td.getState() == 5) {
          this.d.setState(4);
       }
       return;
    }
    public void setCancelable(boolean p0){
       super.setCancelable(p0);
       if (this.e != p0) {
          this.e = p0;
          a td = this.d;
          if (td != null) {
             td.setHideable(p0);
          }
       }
       return;
    }
    public void setCanceledOnTouchOutside(boolean p0){
       super.setCanceledOnTouchOutside(p0);
       if (p0 && this.e == null) {
          this.e = true;
       }
       this.f = p0;
       this.g = true;
       return;
    }
    public void setContentView(int p0){
       super.setContentView(this.f(p0, null, null));
    }
    public void setContentView(View p0){
       super.setContentView(this.f(0, p0, null));
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       super.setContentView(this.f(0, p0, p1));
    }
}
