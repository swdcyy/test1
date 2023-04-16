package com.kuaishou.live.core.show.subscribe.helper.LiveSubscribeWheelTimeDividerLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.text.TextPaint;
import zf6.j;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.Paint$Style;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Rect;
import android.graphics.Canvas;

public class LiveSubscribeWheelTimeDividerLinearLayout extends LinearLayout	// class@001129
{
    public final Paint b;
    public final float c;

    public void LiveSubscribeWheelTimeDividerLinearLayout(Context p0){
       super(p0, null);
    }
    public void LiveSubscribeWheelTimeDividerLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSubscribeWheelTimeDividerLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TextPaint textPaint = new TextPaint(1);
       this.b = textPaint;
       this.setWillNotDraw(false);
       textPaint.setColor(j.a(R.color.arg_RES_7f060735, false));
       textPaint.setStrokeWidth((float)a1.e(0x3f000000));
       textPaint.setStyle(Paint$Style.STROKE);
       this.c = this.getItemHeight();
       this.requestDisallowInterceptTouchEvent(1);
    }
    public final float getItemHeight(){
       Rect obj = PatchProxy.apply(null, this, LiveSubscribeWheelTimeDividerLinearLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       this.b.setTextSize((float)(int)(c.c(this.getContext().getResources()).density * 16.00f));
       obj = new Rect();
       this.b.getTextBounds("ÐÇÆÚ", 0, 2, obj);
       return ((float)(obj.height() + 2) * 2.20f);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeWheelTimeDividerLinearLayout.class, "2")) {
          return;
       }
       super.onDraw(p0);
       float f = (float)this.getHeight();
       LiveSubscribeWheelTimeDividerLinearLayout tc = this.c;
       float f1 = (f - tc) / 2.00f;
       f = (f + tc) / 2.00f;
       Canvas uCanvas = p0;
       uCanvas.drawLine(0, f1, (float)this.getWidth(), f1, this.b);
       uCanvas.drawLine(0, f, (float)this.getWidth(), f, this.b);
       return;
    }
}
