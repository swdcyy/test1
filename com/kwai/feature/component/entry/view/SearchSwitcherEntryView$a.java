package com.kwai.feature.component.entry.view.SearchSwitcherEntryView$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.b;
import oy5.e;
import oy5.b;
import oy5.f;
import android.content.Context;
import android.widget.LinearLayout;
import com.kwai.feature.component.entry.a;

public class SearchSwitcherEntryView$a extends m	// class@001218
{
    public final SearchSwitcherEntryView c;

    public void SearchSwitcherEntryView$a(SearchSwitcherEntryView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView$a.class, "1")) {
          return;
       }
       SearchSwitcherEntryView$a tc = this.c;
       if (tc.b == null) {
          b.c("SearchSwitcherEntryView", "mClickFilter, mISearchActionCallback is null");
          return;
       }else {
          tc.d = tc.d(1, 1);
          tc = this.c;
          tc.b.c(tc.d);
          f.e(f.c(this.c.d), this.c.d);
          a.c(this.c.getContext(), this.c.d);
          return;
       }
    }
}
