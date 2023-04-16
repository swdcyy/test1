package com.yxcorp.plugin.search.widget.NoSpaceTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.Layout;
import java.lang.Integer;
import android.text.TextPaint;
import android.graphics.Rect;
import android.graphics.Paint$FontMetricsInt;

public class NoSpaceTextView extends AppCompatTextView	// class@0007cb
{
    public boolean f;

    public void NoSpaceTextView(Context p0){
       super(p0);
    }
    public void NoSpaceTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NoSpaceTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final String[] getLinesText(){
       String[] obj = PatchProxy.apply(null, this, NoSpaceTextView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[this.getLineCount()];
       String str = this.getText().toString();
       Layout layout = this.getLayout();
       int i = 0;
       int i1 = 0;
       while (i < this.getLineCount()) {
          int lineEnd = layout.getLineEnd(i);
          obj[i] = str.substring(i1, lineEnd);
          i = i + 1;
          i1 = lineEnd;
       }
       return obj;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(NoSpaceTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NoSpaceTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (!PatchProxy.isSupport(NoSpaceTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NoSpaceTextView.class, "2")) {
          String[] linesText = this.getLinesText();
          TextPaint paint = this.getPaint();
          Rect rect = new Rect();
          object oobject = linesText[0];
          paint.getTextBounds(oobject, 0, oobject.length(), rect);
          Paint$FontMetricsInt uFontMetrics = new Paint$FontMetricsInt();
          paint.getFontMetricsInt(uFontMetrics);
          this.setPadding(this.getLeftPaddingOffset(), ((uFontMetrics.top - rect.top) + this.getTopPaddingOffset()), this.getRightPaddingOffset(), this.getBottomPaddingOffset());
          object oobject1 = linesText[(linesText.length - 1)];
          paint.getTextBounds(oobject1, 0, oobject1.length(), rect);
          this.setMeasuredDimension(this.getMeasuredWidth(), (this.getMeasuredHeight() - (uFontMetrics.bottom - rect.bottom)));
          if (this.f != null) {
             this.f = false;
             this.measure(p0, p1);
          }
       }
       return;
    }
}
