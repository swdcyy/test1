package com.kwai.library.widget.textview.FoldingTextView$b;
import android.text.style.ClickableSpan;
import com.kwai.library.widget.textview.FoldingTextView;
import android.text.SpannableString;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.library.widget.textview.FoldingTextView$e;
import android.text.TextPaint;
import android.graphics.Typeface;

public class FoldingTextView$b extends ClickableSpan	// class@000a38
{
    public final SpannableString b;
    public final FoldingTextView c;

    public void FoldingTextView$b(FoldingTextView p0,SpannableString p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       this.c.setText(this.b);
       FoldingTextView n = this.c.n;
       if (n != null) {
          n.a(p0, true);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       if (this.c.q != null) {
          p0.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
       }
       p0.setColor(this.c.p);
       return;
    }
}
