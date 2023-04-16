package com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$b;
import android.text.TextWatcher;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import wbc.a;
import java.lang.CharSequence;

public class SearchBarPreviewFragment$b implements TextWatcher	// class@0019b6
{
    public final SearchBarPreviewFragment b;

    public void SearchBarPreviewFragment$b(SearchBarPreviewFragment p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarPreviewFragment$b.class, "1")) {
          return;
       }
       this.b.Jh(false);
       SearchBarPreviewFragment$b tb = this.b;
       SearchBarPreviewFragment l = tb.L;
       if (l != null) {
          l.z0(tb.F.getText().toString());
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
