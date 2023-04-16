package com.kuaishou.live.common.core.component.broadcastbanner.LiveAdjustSuperscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveAdjustSuperscriptSpan extends SuperscriptSpan	// class@001024
{
    public float b;

    public void LiveAdjustSuperscriptSpan(float p0){
       super();
       this.b = 0x3f000000;
       this.b = p0;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdjustSuperscriptSpan.class, "1")) {
          return;
       }
       p0.baselineShift = p0.baselineShift + (int)(p0.ascent() * this.b);
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdjustSuperscriptSpan.class, "2")) {
          return;
       }
       p0.baselineShift = p0.baselineShift + (int)(p0.ascent() * this.b);
       return;
    }
}
