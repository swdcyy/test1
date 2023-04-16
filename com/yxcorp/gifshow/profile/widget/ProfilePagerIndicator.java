package com.yxcorp.gifshow.profile.widget.ProfilePagerIndicator;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.yxcorp.gifshow.profile.widget.ProfilePagerIndicator$a;
import androidx.viewpager.widget.ViewPager$i;

public class ProfilePagerIndicator extends View	// class@0015fa
{
    public int b;
    public int c;
    public Paint d;
    public int e;
    public int f;
    public int g;

    public void ProfilePagerIndicator(Context p0){
       super(p0, null);
    }
    public void ProfilePagerIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ProfilePagerIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.r4);
       this.e = typedArray.getColor(1, 0xff000000);
       this.f = typedArray.getColor(2, -1);
       this.g = typedArray.getDimensionPixelSize(0, 0);
       typedArray.recycle();
       this.d = new Paint(1);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePagerIndicator.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (this.b != null) {
          int i = this.getHeight() / 2;
          int i2 = i;
          for (int i1 = 0; i1 < this.b; i1 = i1 + 1) {
             if (i1 == this.c) {
                this.d.setColor(this.f);
             }else {
                this.d.setColor(this.e);
             }
             p0.drawCircle((float)i2, (float)i, (float)i, this.d);
             i2 = i2 + this.g;
             i2 = i2 + this.getHeight();
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ProfilePagerIndicator.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProfilePagerIndicator.class, "1")) {
          return;
       }
       int mode = View$MeasureSpec.getMode(p1);
       if (this.b > null && (Integer.MIN_VALUE == mode || !mode)) {
          super.onMeasure(p0, p1);
       }else {
          p0 = View$MeasureSpec.getSize(p1);
          ProfilePagerIndicator tb = this.b;
          int i = (tb > 1)? (p0 * tb) + (this.g * (tb - 1)): p0;
          this.setMeasuredDimension(i, p0);
       }
       return;
    }
    public void setCount(int p0){
       if (PatchProxy.isSupport(ProfilePagerIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProfilePagerIndicator.class, "4")) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
    public void setSelected(int p0){
       if (PatchProxy.isSupport(ProfilePagerIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProfilePagerIndicator.class, "5")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
    public void setupWithViewPager(ViewPager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePagerIndicator.class, "3")) {
          return;
       }
       this.setSelected(0);
       this.setCount(p0.getAdapter().j());
       p0.addOnPageChangeListener(new ProfilePagerIndicator$a(this));
       return;
    }
}
