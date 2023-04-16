package com.kuaishou.merchant.basic.widget.CenterTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.text.StaticLayout;
import java.lang.Integer;
import android.view.View;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.Layout$Alignment;

public final class CenterTextView extends AppCompatTextView	// class@0015f1
{
    public StaticLayout f;

    public void CenterTextView(Context p0){
       super(p0);
    }
    public void CenterTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CenterTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CenterTextView.class, "3")) {
          return;
       }
       CenterTextView tf = this.f;
       if (tf == null) {
          a.S("mStaticLayout");
       }
       tf.draw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CenterTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CenterTextView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (!PatchProxy.applyVoid(null, this, CenterTextView.class, "2")) {
          TextPaint textPaint = new TextPaint(1);
          textPaint.setTextSize(this.getTextSize());
          textPaint.setColor(this.getCurrentTextColor());
          StaticLayout staticLayout = new StaticLayout(this.getText(), textPaint, this.getWidth(), Layout$Alignment.ALIGN_CENTER, 0x3f800000, 0, false);
          this.f = this.getCurrentTextColor();
       }
       return;
    }
}
