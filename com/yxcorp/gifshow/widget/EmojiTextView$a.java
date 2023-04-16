package com.yxcorp.gifshow.widget.EmojiTextView$a;
import android.text.TextWatcher;
import com.yxcorp.gifshow.widget.EmojiTextView;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import java.lang.CharSequence;
import android.text.TextUtils;

public class EmojiTextView$a implements TextWatcher	// class@001838
{
    public final EmojiTextView b;

    public void EmojiTextView$a(EmojiTextView p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiTextView$a.class, "1")) {
          return;
       }
       EmojiTextView$a tb = this.b;
       EmojiTextView r = tb.r;
       if (r == null) {
          return;
       }
       if (tb.s == null) {
          r.a(tb.getEditableText());
       }else if(tb.u == null && !TextUtils.isEmpty(tb.getEditableText())){
          tb = this.b;
          tb.u = true;
          tb.r.a(tb.getEditableText());
       }else {
          tb = this.b;
          if (tb.t == null) {
             tb.r.a(tb.getEditableText());
             tb = this.b;
             if (tb.s != null) {
                tb.t = true;
             }
          }
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
