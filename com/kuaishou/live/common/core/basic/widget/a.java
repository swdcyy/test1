package com.kuaishou.live.common.core.basic.widget.a;
import android.text.style.ClickableSpan;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import android.text.SpannableString;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView$b;
import android.text.TextPaint;

public class a extends ClickableSpan	// class@000f38
{
    public final SpannableString b;
    public final ExpandEmojiTextView c;

    public void a(ExpandEmojiTextView p0,SpannableString p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.c.setText(this.b);
       ExpandEmojiTextView y = this.c.y;
       if (y != null) {
          y.a();
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       p0.setColor(this.c.v);
       p0.setFakeBoldText(this.c.x);
       return;
    }
}
