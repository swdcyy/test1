package com.kwai.slide.play.detail.base.ExpandAndCloseTextView$a;
import android.text.style.ClickableSpan;
import com.kwai.slide.play.detail.base.ExpandAndCloseTextView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.base.ExpandAndCloseTextView$b;
import android.widget.TextView;

public class ExpandAndCloseTextView$a extends ClickableSpan	// class@00179b
{
    public final ExpandAndCloseTextView b;

    public void ExpandAndCloseTextView$a(ExpandAndCloseTextView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandAndCloseTextView$a.class, "1")) {
          return;
       }
       ExpandAndCloseTextView$a tb = this.b;
       ExpandAndCloseTextView m = tb.m;
       if (m != null) {
          m.a(tb.g);
       }
       tb = this.b;
       tb.g = tb.g ^ 0x01;
       tb.h = false;
       tb.invalidate();
       return;
    }
}
