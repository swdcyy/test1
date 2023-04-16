package com.yxcorp.gifshow.widget.RedPointNotifyView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Float;

public class RedPointNotifyView extends View	// class@0018b8
{
    public float b;
    public float c;
    public int d;
    public int e;
    public Paint f;

    public void RedPointNotifyView(Context p0){
       super(p0, null);
    }
    public void RedPointNotifyView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RedPointNotifyView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new Paint();
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPointNotifyView.class, "1")) {
       }else {
          this.f.setAntiAlias(true);
          this.f.setStyle(Paint$Style.FILL);
          if (p1 != null) {
             TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.C4);
             this.c = typedArray.getDimension(2, 0);
             this.e = typedArray.getColor(0, 0xffff0000);
             this.d = typedArray.getColor(true, -1);
             typedArray.recycle();
          }
       }
       return;
    }
    public int getRedDotColor(){
       return this.e;
    }
    public int getRedPointStrokeColor(){
       return this.d;
    }
    public float getRedPointStrokeWidth(){
       return this.c;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPointNotifyView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       RedPointNotifyView tc = this.c;
       float f = ((float)Math.min(this.getMeasuredWidth(), this.getMeasuredHeight()) / 2.00f) - tc;
       this.b = f;
       int i = (int)(tc + f);
       int i1 = (int)(tc + f);
       if (!PatchProxy.isSupport(RedPointNotifyView.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), Integer.valueOf(i1), this, RedPointNotifyView.class, "6")) {
          this.f.setAlpha(255);
          if (this.c - null > 0) {
             this.f.setColor(this.d);
             p0.drawCircle((float)i, (float)i1, (this.b + this.c), this.f);
          }
          this.f.setColor(this.e);
          p0.drawCircle((float)i, (float)i1, this.b, this.f);
       }
       return;
    }
    public void setRedDotColor(int p0){
       if (PatchProxy.isSupport(RedPointNotifyView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RedPointNotifyView.class, "3")) {
          return;
       }
       this.e = p0;
       this.invalidate();
       return;
    }
    public void setRedPointStrokeColor(int p0){
       if (PatchProxy.isSupport(RedPointNotifyView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RedPointNotifyView.class, "4")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
    public void setRedPointStrokeWidth(float p0){
       if (PatchProxy.isSupport(RedPointNotifyView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RedPointNotifyView.class, "2")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
}
