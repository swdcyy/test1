package bz3.f;
import erd.g;
import bz3.g;
import java.lang.Object;
import java.lang.CharSequence;
import java.util.Objects;
import android.text.SpannableStringBuilder;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import android.widget.TextView;

public final class f implements g	// class@000460
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append(p0);
       spannableStr.append(tb.p.mTitle);
       tb.r.setText(spannableStr);
    }
}
