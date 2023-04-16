package com.yxcorp.gifshow.widget.FakePieLoadingView;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.content.Context;
import java.lang.String;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Math;
import tyc.o1;
import java.lang.Runnable;
import android.graphics.Canvas;

public class FakePieLoadingView extends View	// class@001843
{
    public int b;
    public long c;
    public long d;
    public long e;
    public RectF f;
    public boolean g;
    public b h;
    public static Paint i;

    static {
       Paint paint = new Paint();
       FakePieLoadingView.i = paint;
       paint.setAntiAlias(true);
       FakePieLoadingView.i.setDither(true);
       FakePieLoadingView.i.setSubpixelText(true);
       FakePieLoadingView.i.setStyle(Paint$Style.FILL);
       FakePieLoadingView.i.setColor(-1);
    }
    public void FakePieLoadingView(Context p0){
       super(p0);
       this.b = Color.parseColor("#26FFFFFF");
       this.c = 100;
       this.d = 50;
       this.e = 0;
       this.f = new RectF(0, 0, 0, 0);
       this.g = false;
       this.h = null;
    }
    public void FakePieLoadingView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = Color.parseColor("#26FFFFFF");
       this.c = 100;
       this.d = 50;
       this.e = 0;
       this.f = new RectF(0, 0, 0, 0);
       this.g = false;
       this.h = null;
    }
    public void FakePieLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = Color.parseColor("#26FFFFFF");
       this.c = 100;
       this.d = 50;
       this.e = 0;
       this.f = new RectF(0, 0, 0, 0);
       this.g = false;
       this.h = null;
    }
    public boolean a(){
       return this.g;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(FakePieLoadingView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FakePieLoadingView.class, "4")) {
          return;
       }
       this.f.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       if (!this.f.width() || !this.f.height()) {
          this.postDelayed(new o1(this, p0), 100);
          return;
       }else {
          this.e = Math.max(this.e, (long)p0);
          this.invalidate();
          return;
       }
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FakePieLoadingView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       FakePieLoadingView.i.setColor(this.b);
       p0.drawArc(this.f, 270.00f, (- (360.00f - ((((float)this.e * 0x3f800000) / (float)this.c) * 360.00f))), true, FakePieLoadingView.i);
       return;
    }
    public void setChangeInterval(int p0){
       this.d = (long)p0;
    }
    public void setPieColor(int p0){
       this.b = p0;
    }
}
