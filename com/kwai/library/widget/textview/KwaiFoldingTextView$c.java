package com.kwai.library.widget.textview.KwaiFoldingTextView$c;
import android.text.style.ClickableSpan;
import com.kwai.library.widget.textview.KwaiFoldingTextView;
import android.text.SpannableString;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.library.widget.textview.KwaiFoldingTextView$e;
import android.text.TextPaint;
import android.graphics.Typeface;

public class KwaiFoldingTextView$c extends ClickableSpan	// class@000a49
{
    public final SpannableString b;
    public final KwaiFoldingTextView c;

    public void KwaiFoldingTextView$c(KwaiFoldingTextView p0,SpannableString p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       this.c.setText(this.b);
       KwaiFoldingTextView t = this.c.t;
       if (t != null) {
          t.a(p0, false);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       if (this.c.w != null) {
          p0.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
       }
       p0.setColor(this.c.v);
       return;
    }
}
