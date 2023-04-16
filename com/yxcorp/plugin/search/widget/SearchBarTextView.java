package com.yxcorp.plugin.search.widget.SearchBarTextView;
import android.widget.TextView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import java.lang.CharSequence;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.text.TextUtils;
import android.graphics.Paint;
import java.lang.Math;
import com.yxcorp.utility.SystemUtil;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;

public class SearchBarTextView extends TextView	// class@0007d4
{
    public static float b;

    static {
       SearchBarTextView.b = (float)a1.e(200.00f);
    }
    public void SearchBarTextView(Context p0){
       super(p0);
    }
    public void SearchBarTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SearchBarTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       Object obj1;
       float f4;
       int b;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, SearchBarTextView.class, "1")) {
          return;
       }
       TextPaint paint = this.getPaint();
       paint.setColor(this.getCurrentTextColor());
       Paint$FontMetrics fontMetrics = paint.getFontMetrics();
       String str = this.getText().toString();
       Paint$FontMetrics descent = fontMetrics.descent;
       Paint$FontMetrics ascent = fontMetrics.ascent;
       float f = descent - ascent;
       float f1 = (float)(int)((float)((this.getMeasuredHeight() - (int)(descent - ascent)) / 2) - fontMetrics.ascent);
       float f2 = (float)(this.getWidth() - 10);
       if (f2 - null <= 0) {
          f2 = SearchBarTextView.b;
       }
       float f3 = f2;
       int i = 0;
       if (PatchProxy.isSupport(SearchBarTextView.class)) {
          obj1 = PatchProxy.applyThreeRefs(str, paint, Float.valueOf(f3), this, SearchBarTextView.class, "2");
          if (obj1 != PatchProxyResult.class) {
          }else if(TextUtils.isEmpty(str)){
             int i1 = str.length();
             f4 = paint.measureText(str);
             b = 1;
             if (f4 - f3 <= 0) {
                obj1 = new String[b];
                obj1[i] = str;
             }else {
                int i2 = (int)Math.ceil((double)(f4 / f3));
                if (SystemUtil.I()) {
                   Object[] b1 = new Object[i];
                   a.C().s("SearchBarTextView", "textViewWidth:"+f3, b1);
                   b1 = new Object[i];
                   a.C().s("SearchBarTextView", "textWidth:"+f4, b1);
                   b1 = new Object[i];
                   a.C().s("SearchBarTextView", "textLines:"+i2, b1);
                }
                if (i2 > 0) {
                   String[] stringArray = new String[i2];
                   int i3 = 0;
                   b = 1;
                   i2 = 0;
                   while (i3 < i1) {
                      if (paint.measureText(str, i3, b) - f3 > 0) {
                         int i4 = i2 + 1;
                         stringArray[i2] = str.subSequence(i3, b);
                         i3 = b;
                         i2 = i4;
                      }
                      if (b == i1) {
                         stringArray[i2] = str.subSequence(i3, b);
                         break ;
                      }
                      b++;
                   }
                   obj1 = stringArray;
                }
             }
          }
          obj1 = null;
       }else {
          goto label_006b ;
       }
       if (obj1 != null) {
          int len = obj1.length;
          while (i < len) {
             object oobject = obj1[i];
             if (!TextUtils.isEmpty(oobject)) {
                obj.drawText(oobject, 0, f1, paint);
                f4 = fontMetrics.leading + f;
                f4 = f4 + 20.00f;
                f1 = f1 + f4;
             }else {
                b = false;
             }
             i = i + 1;
          }
       }
       return;
    }
}
