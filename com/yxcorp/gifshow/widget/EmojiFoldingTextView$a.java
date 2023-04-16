package com.yxcorp.gifshow.widget.EmojiFoldingTextView$a;
import android.text.TextWatcher;
import com.yxcorp.gifshow.widget.EmojiFoldingTextView;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import java.lang.CharSequence;
import android.text.TextUtils;

public class EmojiFoldingTextView$a implements TextWatcher	// class@001836
{
    public final EmojiFoldingTextView b;

    public void EmojiFoldingTextView$a(EmojiFoldingTextView p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiFoldingTextView$a.class, "1")) {
          return;
       }
       EmojiFoldingTextView$a tb = this.b;
       if (tb.t == null) {
          tb.s.a(tb.getEditableText());
       }else if(tb.v == null && !TextUtils.isEmpty(tb.getEditableText())){
          tb = this.b;
          tb.v = true;
          tb.s.a(tb.getEditableText());
       }else {
          tb = this.b;
          if (tb.u == null) {
             tb.s.a(tb.getEditableText());
             tb = this.b;
             if (tb.t != null) {
                tb.u = true;
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
