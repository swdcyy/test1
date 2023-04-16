package com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardRichTextElementViewController$a;
import androidx.lifecycle.Observer;
import android.widget.TextView;
import java.lang.Object;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.show.benefitcard.model.LiveSimpleRichText;
import g93.j;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.benefitcard.model.LiveSimpleRichTextStyle;
import android.text.SpannableStringBuilder;
import g93.j$a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public final class LiveLiteBenefitCardRichTextElementViewController$a implements Observer	// class@001e99
{
    public final TextView b;

    public void LiveLiteBenefitCardRichTextElementViewController$a(TextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBenefitCardRichTextElementViewController$a.class, str)) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          p0 = p0.mRichTexts;
          if (p0 != null) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                LiveSimpleRichText liveSimpleRi = p0.next();
                j a = j.a;
                String str1 = "richText";
                a.o(liveSimpleRi, str1);
                Objects.requireNonNull(a);
                SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(liveSimpleRi, a, j.class, str);
                if (spannableStr != PatchProxyResult.class) {
                }else {
                   a.p(liveSimpleRi, str1);
                   if (!TextUtils.x(liveSimpleRi.mText)) {
                      LiveSimpleRichText mTextStyle = liveSimpleRi.mTextStyle;
                      if (mTextStyle != null && mTextStyle.mFontSize > null) {
                         spannableStr = new SpannableStringBuilder();
                         spannableStr.append(liveSimpleRi.mText);
                         liveSimpleRi = liveSimpleRi.mTextStyle;
                         a.o(liveSimpleRi, "richText.mTextStyle");
                         j$a uoa = new j$a(liveSimpleRi);
                         spannableStr.setSpan(uoa, 0, (liveSimpleRi.mText).length(), 33);
                      }
                   }
                   spannableStr = "";
                }
                liveSpannabl.b(spannableStr);
             }
          }
          this.b.setText(liveSpannabl.k());
          this.b.measure(0, 0);
          p0 = this.b;
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
          layoutParams.height = this.b.getMeasuredHeight();
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
}
