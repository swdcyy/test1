package com.kuaishou.live.basic.richtext.LivePreviewSpannable$1;
import android.text.style.ForegroundColorSpan;
import com.kuaishou.live.basic.richtext.b;
import com.kuaishou.live.basic.richtext.b$b;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Typeface;

public class LivePreviewSpannable$1 extends ForegroundColorSpan	// class@000cfd
{
    public final b$b b;
    public final b c;

    public void LivePreviewSpannable$1(b p0,int p1,b$b p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewSpannable$1.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       b$b d = this.b.d;
       if (d != null) {
          p0.setTypeface(d);
       }
       return;
    }
}
