package com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$c;
import android.view.View$OnFocusChangeListener;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import android.widget.TextView;
import android.widget.EditText;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$f;
import a27.c;

public final class SearchView$c implements View$OnFocusChangeListener	// class@001a44
{
    public final SearchView b;

    public void SearchView$c(SearchView p0){
       this.b = p0;
       super();
    }
    public final void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(SearchView$c.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SearchView$c.class, "1")) {
          return;
       }
       SearchView$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(SearchView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), tb, SearchView.class, "14")) {
          if (p1) {
             if (!PatchProxy.applyVoid(null, tb, SearchView.class, "31")) {
                tb.j(false);
                tb.getCancelButton().setVisibility(false);
                tb.getEditorView().requestFocus();
                tb.getEditorView().requestFocusFromTouch();
                SearchView b = tb.b;
                if (b != null) {
                   b.b();
                }
             }
          }else {
             c.d(tb.getEditorView());
          }
       }
       return;
    }
}
