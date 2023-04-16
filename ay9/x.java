package ay9.x;
import erd.g;
import ay9.a0;
import java.lang.Object;
import com.kwai.slide.play.detail.information.caption.k$b;
import java.util.Objects;
import ay9.q;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.h0;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.caption.l;
import android.text.SpannableStringBuilder;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.text.style.ClickableSpan;
import tyc.s4;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import com.yxcorp.gifshow.util.ColorURLSpan;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class x implements g	// class@00030f
{
    public final a0 b;

    public void x(a0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i1;
       float f;
       int len;
       x tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = true;
       if (p0.b != null) {
          if (h0.g(tb.v) || h0.i(tb.v)) {
             tb.A0(p0.b(), b);
          }else {
             tb.E().q(p0.b(), b);
          }
       }else if(tb.v.getCaptionSearchInfo() != null && (tb.v.getCaptionSearchInfo().mCaptionSearchType == 2 || tb.v.getCaptionSearchInfo().mCaptionSearchType == 3)){
          SpannableStringBuilder spannableStr = p0.b();
          int i = p0.c();
          i1 = p0.a();
          f = p0.d();
          if (!PatchProxy.isSupport(a0.class) || !PatchProxy.applyVoidFourRefs(spannableStr, Integer.valueOf(i), Integer.valueOf(i1), Float.valueOf(f), tb, a0.class, "4")) {
             if (h0.g(tb.v) || h0.i(tb.v)) {
                i1 = spannableStr.length();
             }
             if (i > spannableStr.length() || (i1 > spannableStr.length() || (i > 0 && i1 > 0))) {
                f = spannableStr.getSpans(i, i1, ClickableSpan.class);
                int len1 = f.length;
                for (len = 0; len < len1; len = len + 1) {
                   spannableStr.removeSpan(f[len]);
                }
                spannableStr = spannableStr.delete(i, i1);
             }
          label_014c :
             Objects.toString(spannableStr);
             if (!PatchProxy.applyVoidOneRefs(spannableStr, tb, a0.class, "5")) {
                f = spannableStr.getSpans(false, spannableStr.length(), ColorURLSpan.class);
                object oobject = null;
                len = f.length;
                len = len - 1;
                while (len >= 0) {
                   object oobject1 = f[len];
                   if (TextUtils.x(oobject1.b())) {
                      continue ;
                   }
                   int spanStart = spannableStr.getSpanStart(oobject1);
                }
                if (oobject != null && spannableStr.getSpanEnd(oobject) >= spannableStr.length()) {
                   spannableStr.append(8203);
                }
             }
             spannableStr.append("бн");
             Objects.toString(spannableStr);
             tb.B0(spannableStr);
             if (h0.g(tb.v) || h0.i(tb.v)) {
                tb.A0(spannableStr, false);
             }else {
                tb.E().q(spannableStr, false);
             }
          }
       }else {
          SpannableStringBuilder spannableStr1 = p0.b();
          i1 = p0.c();
          int i2 = p0.a();
          f = p0.d();
          if (!PatchProxy.isSupport(a0.class) || !PatchProxy.applyVoidFourRefs(spannableStr1, Integer.valueOf(i1), Integer.valueOf(i2), Float.valueOf(f), tb, a0.class, "6")) {
             if (i1 > spannableStr1.length() || (i2 > spannableStr1.length() || (i1 > 0 && i2 > 0))) {
                ClickableSpan[] spans = spannableStr1.getSpans(i1, i2, ClickableSpan.class);
                len = spans.length;
                for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                   spannableStr1.removeSpan(spans[i3]);
                }
                spannableStr1 = spannableStr1.delete(i1, i2);
             }
             tb.B0(spannableStr1);
             if (tb.L.g() != null) {
                s4 os4 = tb.L.g();
                os4.e(spannableStr1, os4.d(), f);
                tb.E().s(spannableStr1, false, false, b);
             }else {
                tb.E().s(spannableStr1, false, false, false);
             }
          }
       }
       return;
    }
}
