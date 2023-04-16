package com.kwai.library.widget.specific.misc.FullWaterMarkView;
import android.view.View;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Color;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.PorterDuff$Mode;

public class FullWaterMarkView extends View	// class@000a10
{
    public SimpleDateFormat b;
    public String c;
    public String d;
    public String e;
    public Paint f;
    public final int g;
    public final int h;

    public void FullWaterMarkView(Context p0){
       super(p0);
       this.b = new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA);
       this.g = 400;
       this.h = 200;
    }
    public void FullWaterMarkView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA);
       this.g = 400;
       this.h = 200;
    }
    public void FullWaterMarkView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA);
       this.g = 400;
       this.h = 200;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.f == null) {
          Paint paint = new Paint();
          this.f = paint;
          paint.setTextSize((float)(int)(c.c(this.getContext().getResources()).density * (float)15));
          this.f.setColor(Color.parseColor("#4cEDEDED"));
          this.f.setAntiAlias(true);
       }
       if (TextUtils.isEmpty(this.e)) {
          p0.drawColor(0, PorterDuff$Mode.CLEAR);
       }else {
          int i = (int)this.f.measureText(this.e);
          p0.save();
          p0.rotate(-20.00f);
          int i1 = - (i + 400);
          int width = this.getWidth();
          int i2 = this.getHeight() + 400;
          int i4 = 0;
          for (int i3 = 0; i3 < i2; i3 = i3 + 200) {
             for (int i5 = i1; i5 < width; i5 = i5 + i7) {
                FullWaterMarkView te = this.e;
                int i6 = i4 % 2;
                i6 = (!i6)? 0: i / 2;
                i6 = i6 + i5;
                p0.drawText(te, (float)i6, (float)i3, this.f);
                int i7 = i + 100;
             }
             i4 = i4 + 1;
          }
          p0.restore();
       }
       return;
    }
}
