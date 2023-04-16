package com.tachikoma.core.component.text.richtext.RichTextHelper$4;
import android.text.style.StrikethroughSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RichTextHelper$4 extends StrikethroughSpan	// class@000d9f
{

    public void RichTextHelper$4(){
       super();
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RichTextHelper$4.class, "1")) {
          return;
       }
       p0.setStrikeThruText(false);
       return;
    }
}
