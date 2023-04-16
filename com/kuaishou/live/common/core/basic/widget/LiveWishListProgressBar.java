package com.kuaishou.live.common.core.basic.widget.LiveWishListProgressBar;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import pq3.d;
import android.view.ViewOutlineProvider;
import java.lang.Boolean;
import java.lang.Integer;

public class LiveWishListProgressBar extends SelectShapeLinearLayout	// class@000f2d
{
    public View c;
    public View d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public int j;

    public void LiveWishListProgressBar(Context p0){
       super(p0, null);
    }
    public void LiveWishListProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveWishListProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = 1;
       this.h = 0;
       this.i = 0;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWishListProgressBar.class, "1")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d0e92, this);
          this.c = this.findViewById(0x7f0a32e7);
          this.d = this.findViewById(0x7f0a32dd);
          this.setOrientation(0);
          this.setWillNotDraw(0);
       }
       return;
    }
    public final void i(){
       float f = (float)this.h / (float)this.g;
       this.i = f;
       if (f - 0x3f800000 > 0) {
          this.i = 0x3f800000;
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, LiveWishListProgressBar.class, "8")) {
          return;
       }
       LinearLayout$LayoutParams layoutParams = this.c.getLayoutParams();
       layoutParams.weight = this.i;
       this.c.setLayoutParams(layoutParams);
       layoutParams = this.d.getLayoutParams();
       layoutParams.weight = 0x3f800000 - this.i;
       this.d.setLayoutParams(layoutParams);
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveWishListProgressBar.class, "5")) {
          return;
       }
       d uod = new d((float)this.j, 0, 0, this.getWidth(), this.getHeight());
       this.setOutlineProvider(v0);
       this.setClipToOutline(true);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveWishListProgressBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveWishListProgressBar.class, "9")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.k();
       return;
    }
    public void setCustomBackGroundColor(int p0){
       if (PatchProxy.isSupport(LiveWishListProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWishListProgressBar.class, "6")) {
          return;
       }
       if (p0 && p0 != this.f) {
          this.f = p0;
          this.d.setBackgroundColor(p0);
       }
       return;
    }
    public void setCustomProgressColor(int p0){
       if (PatchProxy.isSupport(LiveWishListProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWishListProgressBar.class, "7")) {
          return;
       }
       if (p0 && p0 != this.e) {
          this.e = p0;
          this.c.setBackgroundColor(p0);
       }
       return;
    }
    public void setMax(int p0){
       if (PatchProxy.isSupport(LiveWishListProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWishListProgressBar.class, "2")) {
          return;
       }
       if (p0 != this.g && p0 > 0) {
          this.g = p0;
          this.i();
          this.j();
       }
       return;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(LiveWishListProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWishListProgressBar.class, "3")) {
          return;
       }
       LiveWishListProgressBar th = this.h;
       if (p0 != th && th >= null) {
          this.h = p0;
          this.i();
          this.j();
       }
       return;
    }
    public void setRadius(int p0){
       if (PatchProxy.isSupport(LiveWishListProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWishListProgressBar.class, "4")) {
          return;
       }
       if (p0 == this.j) {
          return;
       }
       this.j = p0;
       this.requestLayout();
       return;
    }
}
