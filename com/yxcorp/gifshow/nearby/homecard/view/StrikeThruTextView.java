package com.yxcorp.gifshow.nearby.homecard.view.StrikeThruTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class StrikeThruTextView extends TextView	// class@002146
{
    public final Paint b;

    public void StrikeThruTextView(Context p0){
       super(p0, null);
    }
    public void StrikeThruTextView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       Paint paint = new Paint(1);
       this.b = paint;
       paint.setStrokeWidth((float)a1.e(0x3f000000));
       paint.setColor(a1.a(R.color.arg_RES_7f0607ea));
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StrikeThruTextView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       int i = 0;
       float f = (p0 != null)? (float)p0.getWidth(): 0;
       if (p0 != null) {
          i = (float)p0.getHeight();
       }
       if (p0 != null) {
          float f1 = i / (float)2;
          p0.drawLine(0, f1, f, f1, this.b);
       }
       return;
    }
}
