package com.yxcorp.plugin.search.widget.SearchWeakCardTitleTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zf6.j;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.text.Layout;
import android.widget.TextView;
import android.graphics.RectF;
import android.graphics.Paint;
import nfd.t0;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import android.view.View;

public class SearchWeakCardTitleTextView extends AppCompatTextView	// class@0007f0
{
    public int f;
    public Rect g;
    public Rect h;

    public void SearchWeakCardTitleTextView(Context p0){
       super(p0);
    }
    public void SearchWeakCardTitleTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchWeakCardTitleTextView.class, "1")) {
       }else {
          this.f = j.b(p0, 0x7f06075a);
          this.g = new Rect();
          this.h = new Rect();
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchWeakCardTitleTextView.class, "3")) {
          return;
       }
       if (this.getLayout() == null) {
          return;
       }
       int lineCount = this.getLayout().getLineCount();
       RectF rectF = new RectF();
       Paint paint = new Paint();
       paint.setColor(this.f);
       int compoundPadd = this.getCompoundPaddingLeft();
       int extendedPadd = this.getExtendedPaddingTop();
       int i = 0;
       while (i < lineCount) {
          int i1 = this.getLayout().getLineTop(i) + extendedPadd;
          i1 = i1 - t0.e;
          rectF.top = (float)i1;
          float f = (float)compoundPadd;
          float f1 = this.getLayout().getLineLeft(i) + f;
          int f2 = t0.f;
          f1 = f1 - (float)f2;
          rectF.left = (float)(int)f1;
          f = f + this.getLayout().getLineRight(i);
          f = f + (float)f2;
          int i2 = this.getScrollX() + this.getRight();
          i2 = i2 - this.getLeft();
          rectF.right = (float)(int)Math.min(f, (float)i2);
          f = (float)this.getLayout().getLineBottom(i);
          i = i + 1;
          if (i == lineCount) {
             Object obj = PatchProxy.apply(null, this, SearchWeakCardTitleTextView.class, "2");
             if (obj != PatchProxyResult.class) {
                i2 = obj.intValue();
             }else {
                i2 = Math.min(this.getMaxLines(), this.getLineCount()) - 1;
                f2 = this.getLineCount() - 1;
                if (i2 >= 0) {
                   this.getLineBounds(f2, this.h);
                   i2 = this.getLineBounds(i2, this.g) + this.getLayout().getPaint().getFontMetricsInt().descent;
                   f2 = this.g.bottom - i2;
                   i2 = f2;
                }else {
                   i2 = 0;
                }
             }
             f1 = (float)i2;
          }else {
             f1 = this.getLayout().getSpacingAdd();
          }
          f = f - f1;
          f = f + (float)t0.i;
          rectF.bottom = (float)(int)f;
          i1 = t0.c;
          f1 = (float)i1;
          p0.drawRoundRect(rectF, f1, (float)i1, paint);
       }
       super.draw(p0);
       return;
    }
}
