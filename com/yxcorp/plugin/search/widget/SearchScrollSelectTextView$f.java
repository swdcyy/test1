package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$f;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class SearchScrollSelectTextView$f implements View$OnClickListener	// class@0007e8
{
    public final SearchScrollSelectTextView b;

    public void SearchScrollSelectTextView$f(SearchScrollSelectTextView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchScrollSelectTextView$f.class, "1")) {
          return;
       }
       this.b.f();
       this.b.b();
       return;
    }
}
