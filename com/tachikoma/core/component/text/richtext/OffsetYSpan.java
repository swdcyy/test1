package com.tachikoma.core.component.text.richtext.OffsetYSpan;
import android.text.style.SuperscriptSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class OffsetYSpan extends SuperscriptSpan	// class@000d9d
{
    public final int b;

    public void OffsetYSpan(int p0){
       super();
       this.b = p0;
    }
    public final void a(TextPaint p0){
       p0.baselineShift = p0.baselineShift + this.b;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OffsetYSpan.class, "1")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OffsetYSpan.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
}
