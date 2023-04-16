package com.kuaishou.live.gzone.v2.profile.e$d;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextPaint;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Paint;
import java.lang.Math;

public class e$d implements View$OnLayoutChangeListener	// class@001ce1
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       e obj;
       float f;
       e$d uod = this;
       int i = 4;
       int i1 = 3;
       int i2 = 1;
       int i3 = 5;
       int i4 = 2;
       if (PatchProxy.isSupport(e$d.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[i2] = Integer.valueOf(p1);
          objArray[i4] = Integer.valueOf(p2);
          objArray[i1] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          objArray[i3] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, e$d.class, "1")) {
             return;
          }
       }
       uod.b.I.removeOnLayoutChangeListener(this);
       int i5 = (uod.b.I.getWidth() - uod.b.K.getLayoutParams().rightMargin) - (uod.b.J.getLayoutParams().rightMargin * 2);
       e$d b = uod.b;
       TextPaint paint = b.J.getPaint();
       String str = uod.b.J.getText()+""+uod.b.L.getText();
       TextPaint paint1 = uod.b.K.getPaint();
       String str1 = uod.b.K.getText()+""+uod.b.M.getText();
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(e.class)) {
          Object[] objArray1 = new Object[i3];
          objArray1[0] = paint;
          objArray1[i2] = str;
          objArray1[i4] = paint1;
          objArray1[i1] = str1;
          objArray1[i] = Integer.valueOf(i5);
          obj = PatchProxy.apply(objArray1, b, e.class, "26");
          if (obj != PatchProxyResult.class) {
             f = obj.floatValue();
          }else if(i5 <= 0){
             f = paint1.getTextSize();
          }else {
             TextPaint textPaint = new TextPaint(paint);
             float textSize = textPaint.getTextSize();
             TextPaint textPaint1 = new TextPaint(paint1);
             float textSize1 = textPaint1.getTextSize();
             float f1 = b.k9(str, textPaint, textSize);
             float f2 = b.k9(str1, textPaint1, textSize1);
             int i6 = 0;
             f1 = f1 + f2;
             while (f1 - (float)i5 > 0) {
                textSize = textSize - 0x3f800000;
                textSize1 = textSize1 - 0x3f800000;
                i6 = i6 - 1;
                f1 = b.k9(str, textPaint, textSize);
                f2 = b.k9(str1, textPaint1, textSize1);
             }
             f = (float)i6;
          }
       }else {
          goto label_0101 ;
       }
       if (Math.abs(f) > 0) {
          obj = uod.b.J;
          obj.setTextSize(0, (obj.getTextSize() + f));
          obj = uod.b.L;
          obj.setTextSize(0, (obj.getTextSize() + f));
          obj = uod.b.M;
          obj.setTextSize(0, (obj.getTextSize() + f));
          obj = uod.b.K;
          obj.setTextSize(0, (f + obj.getTextSize()));
       }
       return;
    }
}
