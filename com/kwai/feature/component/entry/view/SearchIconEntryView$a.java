package com.kwai.feature.component.entry.view.SearchIconEntryView$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oy5.e;
import oy5.b;
import oy5.f;
import android.content.Context;
import android.widget.ImageView;
import com.kwai.feature.component.entry.a;

public class SearchIconEntryView$a extends m	// class@001215
{
    public final SearchIconEntryView c;

    public void SearchIconEntryView$a(SearchIconEntryView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchIconEntryView$a.class, "1")) {
          return;
       }
       SearchIconEntryView$a tc = this.c;
       if (tc.y == null) {
          return;
       }
       tc.x = tc.q0();
       tc = this.c;
       tc.y.c(tc.x);
       f.e("SEARCH_BUTTON", this.c.x);
       a.c(this.c.getContext(), this.c.x);
       return;
    }
}
