package com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabIndicatorView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.Float;

public class BaseTabIndicatorView extends View	// class@002049
{
    public GradientDrawable b;

    public void BaseTabIndicatorView(Context p0){
       super(p0, null);
    }
    public void BaseTabIndicatorView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BaseTabIndicatorView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[]{a1.a(0x7f0606b3),a1.a(0x7f0606b3)};
       this.b = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, ointArray);
       if (PatchProxy.applyVoid(null, this, BaseTabIndicatorView.class, "1")) {
       }else {
          this.setBackground(this.b);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseTabIndicatorView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       this.b.draw(p0);
       return;
    }
    public void setCorner(float p0){
       if (PatchProxy.isSupport(BaseTabIndicatorView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseTabIndicatorView.class, "3")) {
          return;
       }
       this.b.setCornerRadius(p0);
       this.invalidate();
       return;
    }
    public void setGradientColor(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseTabIndicatorView.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b.setColors(p0);
       this.invalidate();
       return;
    }
}
