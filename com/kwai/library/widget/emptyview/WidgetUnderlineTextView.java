package com.kwai.library.widget.emptyview.WidgetUnderlineTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import android.graphics.Paint;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.text.TextUtils;

public class WidgetUnderlineTextView extends AppCompatTextView	// class@000938
{
    public final int f;
    public final Paint g;

    public void WidgetUnderlineTextView(Context p0){
       super(p0, null);
    }
    public void WidgetUnderlineTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0x1010084);
    }
    public void WidgetUnderlineTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = a1.e(0x3f800000);
       this.f = i;
       Paint paint = new Paint();
       this.g = paint;
       paint.setStrokeWidth((float)i);
       paint.setColor(this.getTextColors().getDefaultColor());
       paint.setAntiAlias(true);
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (!TextUtils.isEmpty(this.getText()) && this.getLineCount() > 0) {
          float f = (float)this.getHeight() - (float)this.f;
          p0.drawLine(0, f, (float)this.getWidth(), f, this.g);
       }
       return;
    }
    public void setTextColor(int p0){
       super.setTextColor(p0);
       WidgetUnderlineTextView tg = this.g;
       if (tg != null) {
          tg.setColor(this.getTextColors().getDefaultColor());
       }
       return;
    }
    public void setTextColor(ColorStateList p0){
       super.setTextColor(p0);
       WidgetUnderlineTextView tg = this.g;
       if (tg != null) {
          tg.setColor(this.getTextColors().getDefaultColor());
       }
       return;
    }
}
