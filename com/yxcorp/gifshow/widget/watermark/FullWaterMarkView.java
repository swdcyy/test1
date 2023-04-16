package com.yxcorp.gifshow.widget.watermark.FullWaterMarkView;
import android.view.View;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Color;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.PorterDuff$Mode;

public class FullWaterMarkView extends View	// class@0019f7
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
       this.h = 350;
    }
    public void FullWaterMarkView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA);
       this.g = 400;
       this.h = 350;
    }
    public void FullWaterMarkView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA);
       this.g = 400;
       this.h = 350;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FullWaterMarkView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.f == null) {
          Paint paint = new Paint();
          this.f = paint;
          int i = 15;
          if (PatchProxy.isSupport(FullWaterMarkView.class)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, FullWaterMarkView.class, "4");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_004c :
                paint.setTextSize((float)i);
                this.f.setColor(Color.parseColor("#66EDEDED"));
                this.f.setAntiAlias(true);
             }
          }
          i = (int)(c.c(this.getContext().getResources()).density * (float)i);
          goto label_004c ;
       }
       if (TextUtils.isEmpty(this.e)) {
          p0.drawColor(0, PorterDuff$Mode.CLEAR);
       }else {
          int i1 = (int)this.f.measureText(this.e);
          p0.save();
          p0.rotate(-20.00f);
          int i2 = - (i1 + 400);
          int width = this.getWidth();
          int i3 = this.getHeight() + 400;
          int i5 = 0;
          for (int i4 = 0; i4 < i3; i4 = i4 + 350) {
             for (int i6 = i2; i6 < width; i6 = i6 + i8) {
                FullWaterMarkView te = this.e;
                int i7 = i5 % 2;
                i7 = (!i7)? 0: i1 / 2;
                i7 = i7 + i6;
                p0.drawText(te, (float)i7, (float)i4, this.f);
                int i8 = i1 + 100;
             }
             i5 = i5 + 1;
          }
          p0.restore();
       }
       return;
    }
}
