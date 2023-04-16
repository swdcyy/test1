package com.yxcorp.gifshow.relation.select.search.SearchBarFragment$a$a;
import android.text.TextWatcher;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment$a;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment;
import android.widget.EditText;
import wbc.a;

public class SearchBarFragment$a$a implements TextWatcher	// class@0019b1
{
    public final SearchBarFragment$a b;

    public void SearchBarFragment$a$a(SearchBarFragment$a p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarFragment$a$a.class, "1")) {
          return;
       }
       SearchBarFragment$a t = this.b.t;
       int i = (TextUtils.x(p0))? 8: 0;
       t.setVisibility(i);
       SearchBarFragment$a$a tb = this.b;
       SearchBarFragment k = tb.w.k;
       if (k != null) {
          k.z0(tb.r.getText().toString());
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
