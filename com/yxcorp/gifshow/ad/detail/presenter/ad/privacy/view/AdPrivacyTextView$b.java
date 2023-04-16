package com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;
import p09.a;
import android.widget.TextView;

public final class AdPrivacyTextView$b implements Runnable	// class@001613
{
    public final AdPrivacyTextView b;

    public void AdPrivacyTextView$b(AdPrivacyTextView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdPrivacyTextView$b.class, "1")) {
          return;
       }
       AdPrivacyTextView$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, AdPrivacyTextView.class, "4")) {
          tb.p();
          SpannableStringBuilder spannableStr = new SpannableStringBuilder();
          spannableStr.append(tb.g);
          if (!PatchProxy.applyVoidOneRefs(spannableStr, tb, AdPrivacyTextView.class, "7")) {
             ForegroundColorSpan uForegroundC = new ForegroundColorSpan(tb.k);
             int i = tb.h.size() - 1;
             int i1 = 0;
             Iterator iterator = tb.h.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                int i2 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (!PatchProxy.applyVoidTwoRefs(spannableStr, obj, tb, AdPrivacyTextView.class, "8")) {
                   spannableStr.append(obj.mLinkText);
                   spannableStr.setSpan(new a(tb, obj), spannableStr.length(), spannableStr.length(), 33);
                }
                if (i1 != i) {
                   spannableStr.append(" | ");
                   int i3 = spannableStr.length() - 1;
                   spannableStr.setSpan(uForegroundC, spannableStr.length(), i3, 33);
                }
                i1 = i2;
             }
          }
          tb.setText(spannableStr);
       }
       return;
    }
}
