package com.tachikoma.core.component.text.CustomTypefaceSpan;
import android.text.style.TypefaceSpan;
import java.lang.String;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class CustomTypefaceSpan extends TypefaceSpan	// class@000d8a
{
    public final Typeface b;

    public void CustomTypefaceSpan(String p0,Typeface p1){
       super(null);
       this.b = p1;
    }
    public Typeface getTypeface(){
       return this.b;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomTypefaceSpan.class, "1")) {
          return;
       }
       CustomTypefaceSpan tb = this.b;
       if (tb != null) {
          p0.setTypeface(tb);
       }else {
          super.updateDrawState(p0);
       }
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomTypefaceSpan.class, "2")) {
          return;
       }
       CustomTypefaceSpan tb = this.b;
       if (tb != null) {
          p0.setTypeface(tb);
       }else {
          super.updateMeasureState(p0);
       }
       return;
    }
}
