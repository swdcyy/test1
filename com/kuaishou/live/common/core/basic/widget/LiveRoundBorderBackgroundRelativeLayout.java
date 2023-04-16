package com.kuaishou.live.common.core.basic.widget.LiveRoundBorderBackgroundRelativeLayout;
import android.widget.RelativeLayout;
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
import android.view.View;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Paint$Style;
import android.graphics.Shader;

public class LiveRoundBorderBackgroundRelativeLayout extends RelativeLayout	// class@000f24
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

    public void LiveRoundBorderBackgroundRelativeLayout(Context p0){
       super(p0, null);
    }
    public void LiveRoundBorderBackgroundRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRoundBorderBackgroundRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p1, this, LiveRoundBorderBackgroundRelativeLayout.class, "1")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRoundBorderBackgroundRelativeLayout.class, "2")) {
          return;
       }
       super.onDraw(p0);
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       LiveRoundBorderBackgroundRelativeLayout tc = this.c;
       float f = (float)paddingLeft;
       tc.left = f;
       float f1 = (float)(paddingLeft + this.getWidth());
       tc.right = f1;
       float f2 = (float)paddingTop;
       tc.top = f2;
       float f3 = (float)(paddingTop + this.getHeight());
       tc.bottom = f3;
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.i, this.j, Shader$TileMode.CLAMP);
       this.b.setStrokeWidth(0);
       this.b.setStyle(Paint$Style.FILL);
       this.b.setShader(paddingTop);
       p0.drawRoundRect(this.c, this.e, this.e, this.b);
       LiveRoundBorderBackgroundRelativeLayout td = this.d;
       tc = this.f;
       td.left = f + (tc / 2.00f);
       td.right = f1 - (tc / 2.00f);
       td.top = f2 + (tc / 2.00f);
       td.bottom = f3 - (tc / 2.00f);
       LinearGradient linearGradie1 = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.g, this.h, Shader$TileMode.CLAMP);
       this.b.setStrokeWidth(this.f);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setShader(f1);
       p0.drawRoundRect(this.d, this.e, this.e, this.b);
       return;
    }
    public void setBackgroundEndColor(int p0){
       this.j = p0;
    }
    public void setBackgroundStartColor(int p0){
       this.i = p0;
    }
    public void setBorderEndColor(int p0){
       this.h = p0;
    }
    public void setBorderStartColor(int p0){
       this.g = p0;
    }
}
