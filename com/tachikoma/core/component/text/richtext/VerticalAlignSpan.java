package com.tachikoma.core.component.text.richtext.VerticalAlignSpan;
import android.text.style.SuperscriptSpan;
import java.lang.String;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import java.lang.Math;

public class VerticalAlignSpan extends SuperscriptSpan	// class@000da3
{
    public final int b;
    public final int c;
    public final String d;
    public TextPaint e;
    public TextPaint f;

    public void VerticalAlignSpan(int p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(TextPaint p0){
       TextPaint textPaint;
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAlignSpan.class, "3")) {
          return;
       }
       if (this.e == null) {
          textPaint = new TextPaint(p0);
          this.e = textPaint;
          textPaint.setTextSize((float)this.b);
       }
       if (this.f == null) {
          textPaint = new TextPaint(p0);
          this.f = textPaint;
          textPaint.setTextSize((float)this.c);
       }
       if (("middle").equals(this.d)) {
          p0.baselineShift = p0.baselineShift - (((int)Math.abs((this.e.ascent() + this.e.descent())) / 2) - ((int)Math.abs((this.f.ascent() + this.f.descent())) / 2));
       }else if(("top").equals(this.d)){
          p0.baselineShift = p0.baselineShift - (int)Math.abs((this.e.ascent() - this.f.ascent()));
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAlignSpan.class, "1")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAlignSpan.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
}
