package com.kuaishou.live.core.show.profilecard.follow.SensorAnimLinearLayout;
import v17.b;
import com.kuaishou.live.widget.LivePkShimmerLayout;
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
import android.widget.LinearLayout;
import java.lang.Integer;
import java.lang.Boolean;

public class SensorAnimLinearLayout extends LivePkShimmerLayout implements b	// class@000dbf
{
    public final a w;
    public boolean x;

    public void SensorAnimLinearLayout(Context p0){
       super(p0, null);
    }
    public void SensorAnimLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SensorAnimLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = true;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Q1, p2, 0);
       int color = typedArray.getColor(2, p0.getResources().getColor(R.color.arg_RES_7f06212b));
       int color1 = typedArray.getColor(0, p0.getResources().getColor(R.color.arg_RES_7f06212a));
       typedArray.recycle();
       a uoa = new a(this, color, color1, typedArray.getColor(3, a.d(color, 0x3f000000)), typedArray.getColor(true, a.d(color1, 0x3f000000)));
       this.w = a.d(color1, 0x3f000000);
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SensorAnimLinearLayout.class, "3")) {
          return;
       }
       if (this.x != null) {
          this.w.g((((- p0.a()) / 9.80f) * 90.00f));
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SensorAnimLinearLayout.class, "2")) {
          return;
       }
       if (this.x != null) {
          this.w.e(p0);
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SensorAnimLinearLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SensorAnimLinearLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.w.f(p0, p1, p2, p3);
       return;
    }
    public void setEnableGravityEffect(boolean p0){
       if (PatchProxy.isSupport(SensorAnimLinearLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SensorAnimLinearLayout.class, "4")) {
          return;
       }
       this.x = p0;
       if (p0) {
          this.w.f(this.getWidth(), this.getHeight(), this.getWidth(), this.getHeight());
       }
       return;
    }
}
