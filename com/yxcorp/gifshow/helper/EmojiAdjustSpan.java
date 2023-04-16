package com.yxcorp.gifshow.helper.EmojiAdjustSpan;
import android.text.style.RelativeSizeSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class EmojiAdjustSpan extends RelativeSizeSpan	// class@001621
{
    public final float b;

    public void EmojiAdjustSpan(float p0){
       super(p0);
       this.b = p0;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiAdjustSpan.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       if (this.b - 0x3f800000) {
          p0.baselineShift = (int)((float)p0.baselineShift - (((p0.getTextSize() * (0x3f800000 - this.b)) / 2.00f) + 0x3f800000));
       }
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiAdjustSpan.class, "2")) {
          return;
       }
       super.updateMeasureState(p0);
       if (this.b - 0x3f800000) {
          p0.baselineShift = (int)((float)p0.baselineShift - (((p0.getTextSize() * (0x3f800000 - this.b)) / 2.00f) + 0x3f800000));
       }
       return;
    }
}
