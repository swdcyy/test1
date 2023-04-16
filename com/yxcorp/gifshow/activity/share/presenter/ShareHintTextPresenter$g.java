package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$g;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import java.lang.Object;
import android.util.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.text.SpannableString;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import java.lang.Integer;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$UnderlineSpan;
import lnc.a1;
import ow8.c;
import android.widget.EditText;
import xw8.p0;

public final class ShareHintTextPresenter$g implements g	// class@0013ad
{
    public final ShareHintTextPresenter b;

    public void ShareHintTextPresenter$g(ShareHintTextPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       ShareHintTextPresenter q1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareHintTextPresenter$g.class, "1")) {
       }else {
          ShareHintTextPresenter$g tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, ShareHintTextPresenter.class, "7")) {
             ShareHintTextPresenter p = tb.p;
             String str = "editor";
             if (p == null) {
                a.S(str);
             }
             SpannableString spannableStr = new SpannableString(String.valueOf(p.getText()));
             Pair first = p0.first;
             p0 = p0.second;
             a.o(p0, "indexEnd");
             if (first.intValue() >= p0.intValue()) {
                Object[] objArray = new Object[0];
                a.b().A("ShareHintTextPresenter", "setReplaceableText:indexStart="+first+" >= indexEnd="+p0, objArray);
                tb.V8();
             }else {
                tb.X8();
                tb.S8();
                a.o(first, "indexStart");
                spannableStr.setSpan(new ShareHintTextPresenter$UnderlineSpan(tb, a1.a(R.color.arg_RES_7f061a86)), first.intValue(), p0.intValue(), 33);
                boolean b = true;
                tb.w = b;
                if (c.b()) {
                   ShareHintTextPresenter q = tb.q;
                   String str1 = "editorHint";
                   if (q == null) {
                      a.S(str1);
                   }
                   q.setPadding(0, a1.d(R.dimen.arg_RES_7f07031b), 0, 0);
                   q1 = tb.q;
                   if (q1 == null) {
                      a.S(str1);
                   }
                   q1.setTextKeepState(spannableStr);
                }else {
                   ShareHintTextPresenter s = tb.s;
                   if (s == null) {
                      a.S("sharePagePresenterModel");
                   }
                   s.H = false;
                   s = tb.p;
                   if (s == null) {
                      a.S(str);
                   }
                   s.setTextKeepState(spannableStr);
                   q1 = tb.s;
                   if (q1 == null) {
                      a.S("sharePagePresenterModel");
                   }
                   q1.H = b;
                }
                Object[] objArray1 = new Object[0];
                a.b().w("ShareHintTextPresenter", "setReplaceableText: \("+first+','+p0+"\) resultText="+spannableStr, objArray1);
             }
          }
       }
       return;
    }
}
