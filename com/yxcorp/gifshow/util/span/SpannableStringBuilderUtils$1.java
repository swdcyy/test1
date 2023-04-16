package com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils$1;
import android.text.style.UnderlineSpan;
import android.text.TextPaint;

public class SpannableStringBuilderUtils$1 extends UnderlineSpan	// class@000d04
{
    public final boolean b;

    public void SpannableStringBuilderUtils$1(boolean p0){
       this.b = p0;
       super();
    }
    public void updateDrawState(TextPaint p0){
       if (this.b != null) {
          super.updateDrawState(p0);
       }else {
          p0.setUnderlineText(false);
       }
       return;
    }
}
