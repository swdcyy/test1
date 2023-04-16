package com.kuaishou.live.basic.textstyle.LiveSpannable$1;
import android.text.style.ForegroundColorSpan;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Typeface;

public class LiveSpannable$1 extends ForegroundColorSpan	// class@000d04
{
    public final LiveSpannable$b b;
    public final LiveSpannable c;

    public void LiveSpannable$1(LiveSpannable p0,int p1,LiveSpannable$b p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSpannable$1.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       if (this.b.e != null) {
          p0.setFakeBoldText(true);
       }
       LiveSpannable$b f = this.b.f;
       if (f != null) {
          p0.setTypeface(f);
       }
       return;
    }
}
