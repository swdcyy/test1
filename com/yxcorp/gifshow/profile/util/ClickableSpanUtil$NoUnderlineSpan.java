package com.yxcorp.gifshow.profile.util.ClickableSpanUtil$NoUnderlineSpan;
import android.text.style.UnderlineSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ClickableSpanUtil$NoUnderlineSpan extends UnderlineSpan	// class@0015c2
{

    public void ClickableSpanUtil$NoUnderlineSpan(){
       super();
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClickableSpanUtil$NoUnderlineSpan.class, "1")) {
          return;
       }
       p0.setColor(p0.linkColor);
       p0.setUnderlineText(false);
       return;
    }
}
