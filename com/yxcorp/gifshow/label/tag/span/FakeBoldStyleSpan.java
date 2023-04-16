package com.yxcorp.gifshow.label.tag.span.FakeBoldStyleSpan;
import android.text.style.StyleSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class FakeBoldStyleSpan extends StyleSpan	// class@001a13
{

    public void FakeBoldStyleSpan(int p0){
       super(p0);
    }
    public final void a(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FakeBoldStyleSpan.class, "3")) {
          return;
       }
       p0.setFakeBoldText(true);
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FakeBoldStyleSpan.class, "1")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FakeBoldStyleSpan.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
}
