package com.yxcorp.gifshow.profile.widget.DelegateToggleButton;
import v17.b;
import com.kwai.library.widget.button.SizeAdjustableToggleButton;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import qz6.a;
import android.view.View;
import w17.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import android.widget.CompoundButton;
import java.lang.Integer;
import java.lang.Boolean;
import android.widget.ToggleButton;
import com.yxcorp.gifshow.profile.widget.DelegateToggleButton$a;

public class DelegateToggleButton extends SizeAdjustableToggleButton implements b	// class@0015f0
{
    public DelegateToggleButton$a d;
    public final a e;
    public boolean f;

    public void DelegateToggleButton(Context p0){
       super(p0, null);
    }
    public void DelegateToggleButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x101004b);
    }
    public void DelegateToggleButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Q1, p2, 0);
       int color = typedArray.getColor(2, p0.getResources().getColor(R.color.arg_RES_7f06212b));
       int color1 = typedArray.getColor(0, p0.getResources().getColor(R.color.arg_RES_7f06212a));
       typedArray.recycle();
       a uoa = new a(this, color, color1, typedArray.getColor(3, a.d(color, 0x3f000000)), typedArray.getColor(1, a.d(color1, 0x3f000000)));
       this.e = a.d(color1, 0x3f000000);
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DelegateToggleButton.class, "4")) {
          return;
       }
       if (this.f != null) {
          this.e.g((((- p0.a()) / 9.80f) * 90.00f));
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DelegateToggleButton.class, "3")) {
          return;
       }
       if (this.f != null) {
          this.e.e(p0);
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DelegateToggleButton.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DelegateToggleButton.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.e.f(p0, p1, p2, p3);
       return;
    }
    public void setShowGravityEffect(boolean p0){
       if (PatchProxy.isSupport(DelegateToggleButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DelegateToggleButton.class, "5")) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
    public void setToggleDelegate(DelegateToggleButton$a p0){
       this.d = p0;
    }
    public void toggle(){
       if (PatchProxy.applyVoid(null, this, DelegateToggleButton.class, "1")) {
          return;
       }
       DelegateToggleButton td = this.d;
       if (td != null && td.toggle()) {
          return;
       }
       super.toggle();
       return;
    }
}
