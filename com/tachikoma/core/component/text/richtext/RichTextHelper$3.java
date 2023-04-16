package com.tachikoma.core.component.text.richtext.RichTextHelper$3;
import android.text.style.UnderlineSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RichTextHelper$3 extends UnderlineSpan	// class@000d9e
{

    public void RichTextHelper$3(){
       super();
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RichTextHelper$3.class, "1")) {
          return;
       }
       p0.setUnderlineText(false);
       return;
    }
}
