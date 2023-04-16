package com.yxcorp.plugin.search.widget.SearchParagraphBgTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Layout;
import android.widget.TextView;
import android.graphics.RectF;
import android.graphics.Paint;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Rect;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import android.view.View;
import zf6.j;

public class SearchParagraphBgTextView extends AppCompatTextView	// class@0007dd
{
    public int f;
    public Rect g;
    public Rect h;
    public final int i;
    public final int j;
    public final int k;

    public void SearchParagraphBgTextView(Context p0){
       super(p0);
       this.i = a1.e(4.00f);
       this.j = a1.e(6.00f);
       this.k = a1.e(8.00f);
    }
    public void SearchParagraphBgTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = a1.e(4.00f);
       this.j = a1.e(6.00f);
       this.k = a1.e(8.00f);
       this.p(p0, p1);
    }
    public void SearchParagraphBgTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = a1.e(4.00f);
       this.j = a1.e(6.00f);
       this.k = a1.e(8.00f);
       this.p(p0, p1);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchParagraphBgTextView.class, "3")) {
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
          i1 = i1 - this.i;
          rectF.top = (float)i1;
          float f = (float)compoundPadd;
          float f1 = this.getLayout().getLineLeft(i) + f;
          f1 = f1 - (float)this.j;
          rectF.left = (float)(int)f1;
          f = f + this.getLayout().getLineRight(i);
          f = f + (float)this.j;
          int i2 = this.getScrollX() + this.getRight();
          i2 = i2 - this.getLeft();
          rectF.right = (float)(int)Math.min(f, (float)i2);
          f = (float)this.getLayout().getLineBottom(i);
          i = i + 1;
          if (i == lineCount) {
             Object obj = PatchProxy.apply(null, this, SearchParagraphBgTextView.class, "2");
             if (obj != PatchProxyResult.class) {
                i2 = obj.intValue();
             }else {
                i2 = Math.min(this.getMaxLines(), this.getLineCount()) - 1;
                int i3 = this.getLineCount() - 1;
                if (i2 >= 0) {
                   this.getLineBounds(i3, this.h);
                   i2 = this.getLineBounds(i2, this.g) + this.getLayout().getPaint().getFontMetricsInt().descent;
                   i3 = this.g.bottom - i2;
                   i2 = i3;
                }else {
                   i2 = 0;
                }
             }
             f1 = (float)i2;
          }else {
             f1 = this.getLayout().getSpacingAdd();
          }
          f = f - f1;
          f = f + (float)this.k;
          rectF.bottom = (float)(int)f;
          SearchParagraphBgTextView ti = this.i;
          f1 = (float)ti;
          p0.drawRoundRect(rectF, f1, (float)ti, paint);
       }
       super.draw(p0);
       return;
    }
    public final void p(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchParagraphBgTextView.class, "1")) {
          return;
       }
       this.f = j.b(p0, 0x7f0619a6);
       this.g = new Rect();
       this.h = new Rect();
       return;
    }
}
