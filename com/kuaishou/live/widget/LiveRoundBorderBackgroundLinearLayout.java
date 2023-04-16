package com.kuaishou.live.widget.LiveRoundBorderBackgroundLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Paint$Style;
import android.graphics.Shader;

public class LiveRoundBorderBackgroundLinearLayout extends LinearLayout	// class@00101e
{
    public Paint b;
    public RectF c;
    public RectF d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;

    public void LiveRoundBorderBackgroundLinearLayout(Context p0){
       super(p0, null);
    }
    public void LiveRoundBorderBackgroundLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRoundBorderBackgroundLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p1, this, LiveRoundBorderBackgroundLinearLayout.class, "1")) {
       }else {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.M2);
          this.e = typedArray.getDimension(5, 0);
          this.f = typedArray.getDimension(4, 0);
          this.g = typedArray.getColor(3, 0xff000000);
          this.h = typedArray.getColor(2, 0xff000000);
          this.i = typedArray.getColor(1, -1);
          this.j = typedArray.getColor(0, -1);
          typedArray.recycle();
          Paint paint = new Paint();
          this.b = paint;
          paint.setAntiAlias(1);
          this.c = new RectF();
          this.d = new RectF();
          this.setWillNotDraw(0);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRoundBorderBackgroundLinearLayout.class, "2")) {
          return;
       }
       super.onDraw(p0);
       LiveRoundBorderBackgroundLinearLayout tc = this.c;
       tc.left = 0;
       float f = (float)this.getWidth();
       tc.right = f;
       tc.top = 0;
       float f1 = (float)this.getHeight();
       tc.bottom = f1;
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.i, this.j, Shader$TileMode.CLAMP);
       this.b.setStrokeWidth(0);
       this.b.setStyle(Paint$Style.FILL);
       this.b.setShader(tc);
       p0.drawRoundRect(this.c, this.e, this.e, this.b);
       tc = this.d;
       LiveRoundBorderBackgroundLinearLayout tf = this.f;
       tc.left = tf / 2.00f;
       tc.right = f - (tf / 2.00f);
       tc.top = tf / 2.00f;
       tc.bottom = f1 - (tf / 2.00f);
       LinearGradient linearGradie1 = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.g, this.h, Shader$TileMode.CLAMP);
       this.b.setStrokeWidth(this.f);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setShader(f);
       p0.drawRoundRect(this.d, this.e, this.e, this.b);
       return;
    }
}
