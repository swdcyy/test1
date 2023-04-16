package com.kwai.live.gzone.widget.GzoneWeight500TextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.widget.TextView;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import java.lang.Boolean;
import android.graphics.Typeface;
import java.lang.Integer;

public class GzoneWeight500TextView extends KwaiSizeAdjustableTextView	// class@000e7a
{
    public boolean q;

    public void GzoneWeight500TextView(Context p0){
       super(p0);
       this.q = true;
    }
    public void GzoneWeight500TextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.q = true;
    }
    public void GzoneWeight500TextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q = true;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzoneWeight500TextView.class, "1")) {
          return;
       }
       if (this.getPaint().isFakeBoldText()) {
          this.getPaint().setFakeBoldText(false);
          this.q = true;
       }
       if (this.q != null) {
          TextPaint paint = this.getPaint();
          if (!PatchProxy.applyVoidOneRefs(paint, this, GzoneWeight500TextView.class, "2")) {
             paint.setColor(paint.getColor());
             paint.setStrokeCap(Paint$Cap.ROUND);
             paint.setStrokeWidth((paint.getTextSize() / 60.00f));
             paint.setStyle(Paint$Style.FILL_AND_STROKE);
          }
       }
       super.onDraw(p0);
       return;
    }
    public void setEnableMediumBold(boolean p0){
       if (PatchProxy.isSupport(GzoneWeight500TextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GzoneWeight500TextView.class, "3")) {
          return;
       }
       this.q = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setTypeface(Typeface p0,int p1){
       if (PatchProxy.isSupport(GzoneWeight500TextView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GzoneWeight500TextView.class, "4")) {
          return;
       }
       if (p1 == 1) {
          this.setEnableMediumBold(1);
       }else {
          this.setEnableMediumBold(false);
       }
       super.setTypeface(p0);
       return;
    }
}
