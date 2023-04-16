package com.kuaishou.live.common.core.basic.widget.LiveFullWaterMarkView;
import android.view.View;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.PorterDuff$Mode;

public class LiveFullWaterMarkView extends View	// class@000f17
{
    public String b;
    public Paint c;
    public final int d;
    public final int e;
    public int f;

    public void LiveFullWaterMarkView(Context p0){
       super(p0);
       this.d = 400;
       this.e = 200;
       this.f = a1.a(0x7f0613d0);
    }
    public void LiveFullWaterMarkView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = 400;
       this.e = 200;
       this.f = a1.a(0x7f0613d0);
    }
    public void LiveFullWaterMarkView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 400;
       this.e = 200;
       this.f = a1.a(0x7f0613d0);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFullWaterMarkView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (this.c == null) {
          Paint paint = new Paint();
          this.c = paint;
          paint.setTextSize((float)a1.e(15.00f));
          this.c.setColor(this.f);
          this.c.setAntiAlias(true);
       }
       if (TextUtils.isEmpty(this.b)) {
          p0.drawColor(0, PorterDuff$Mode.CLEAR);
       }else {
          int i = (int)this.c.measureText(this.b);
          p0.save();
          p0.rotate(-20.00f);
          int i1 = - (i + 400);
          int width = this.getWidth();
          int i2 = this.getHeight() + 400;
          int i4 = 0;
          for (int i3 = 0; i3 < i2; i3 = i3 + 200) {
             for (int i5 = i1; i5 < width; i5 = i5 + i7) {
                LiveFullWaterMarkView tb = this.b;
                int i6 = i4 % 2;
                i6 = (!i6)? 0: i / 2;
                i6 = i6 + i5;
                p0.drawText(tb, (float)i6, (float)i3, this.c);
                int i7 = i + 100;
             }
             i4 = i4 + 1;
          }
          p0.restore();
       }
       return;
    }
    public void setDrawText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFullWaterMarkView.class, "1")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
}
