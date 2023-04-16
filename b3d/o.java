package b3d.o;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.login.util.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;
import i2b.a;
import android.widget.TextView;
import com.yxcorp.login.http.response.PhoneBindRiskResponse;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.style.CharacterStyle;
import o07.n;

public final class o implements PopupInterface$f	// class@00033c
{
    public final h b;

    public void o(h p0){
       this.b = p0;
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       o tb = this.b;
       Objects.requireNonNull(tb);
       View view = a.g(p1, R.layout.arg_RES_7f0d0105, p2, false);
       TextView textView = view.findViewById(R.id.content);
       PhoneBindRiskResponse mContent = tb.a.mContent;
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       StyleSpan styleSpan = new StyleSpan(1);
       SpannableStringBuilder spannableStr1 = PatchProxy.applyTwoRefs(mContent, styleSpan, tb, h.class, "5");
       if (spannableStr1 != PatchProxyResult.class) {
       }else {
          PhoneBindRiskResponse mTextBoldRan = tb.a.mTextBoldRanges;
          spannableStr1 = new SpannableStringBuilder(mContent);
          for (int i = 0; i < mTextBoldRan.length; i++) {
             spannableStr1.setSpan(CharacterStyle.wrap(styleSpan), mTextBoldRan[i][0], mTextBoldRan[i][1], 18);
          }
       }
       spannableStr.append(spannableStr1);
       textView.setText(spannableStr);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
