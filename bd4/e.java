package bd4.e;
import erd.g;
import bd4.g;
import java.lang.Object;
import java.lang.CharSequence;
import java.util.Objects;
import android.text.SpannableStringBuilder;
import bd4.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;

public final class e implements g	// class@00038a
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append(p0);
       spannableStr.append(TextUtils.k(tb.s.mTitle));
       tb.y.setText(spannableStr);
    }
}
