package com.smile.gifshow.post.profile.BackgroundCropBorderView;
import android.view.View;
import com.smile.gifshow.post.profile.BackgroundCropBorderView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.RectF;

public final class BackgroundCropBorderView extends View	// class@000c55
{
    public float b;
    public float c;
    public float d;
    public Rect e;
    public float f;
    public HashMap g;
    public static final BackgroundCropBorderView$a h;

    static {
       BackgroundCropBorderView.h = new BackgroundCropBorderView$a(null);
    }
    public void BackgroundCropBorderView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.b = 0x3f200000;
       this.c = 0x3f000000;
       this.d = (float)a1.e(2.00f);
       this.f = 0xbf800000;
    }
    public void onDraw(Canvas p0){
       Rect rect;
       float f = ((float)this.getWidth() * this.b) / (float)2;
       int i = (int)((float)(this.getHeight() / 2) - f);
       int i1 = (int)((float)(this.getHeight() / 2) + f);
       Paint paint = new Paint(3);
       paint.setColor(-1);
       paint.setStyle(Paint$Style.STROKE);
       paint.setStrokeWidth(this.d);
       paint.setAlpha((int)(this.c * (float)255));
       int i2 = a1.e(0x3f800000);
       if (this.e == null) {
          rect = new Rect(i2, i, (this.getWidth() - i2), i1);
       }else {
          BackgroundCropBorderView te = this.e;
          a.m(te);
          BackgroundCropBorderView te1 = this.e;
          a.m(te1);
          BackgroundCropBorderView te2 = this.e;
          a.m(te2);
          BackgroundCropBorderView te3 = this.e;
          a.m(te3);
          rect = new Rect((te.left + i2), te1.top, (te2.right - i2), te3.bottom);
       }
       if (this.f - (float)0 > 0) {
          if (p0 != null) {
             p0.drawRoundRect(new RectF(rect), this.f, this.f, paint);
          }
       }else if(p0 != null){
          p0.drawRect(rect, paint);
       }
       return;
    }
    public final void setCornerRadius(float p0){
       this.f = p0;
       this.invalidate();
    }
    public final void setPaintAlpha(float p0){
       this.c = p0;
       this.invalidate();
    }
    public final void setRect(Rect p0){
       a.p(p0, "rect");
       this.e = p0;
       this.invalidate();
    }
}
