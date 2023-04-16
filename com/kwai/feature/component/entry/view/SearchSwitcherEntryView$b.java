package com.kwai.feature.component.entry.view.SearchSwitcherEntryView$b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oy5.e;
import oy5.b;
import oy5.f;
import android.content.Context;
import android.widget.LinearLayout;
import com.kwai.feature.component.entry.a;
import e17.i;

public class SearchSwitcherEntryView$b extends m	// class@001219
{
    public final SearchSwitcherEntryView c;

    public void SearchSwitcherEntryView$b(SearchSwitcherEntryView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView$b.class, "1")) {
          return;
       }
       SearchSwitcherEntryView$b tc = this.c;
       if (tc.b == null) {
          b.c("SearchSwitcherEntryView", "mButtonClickFilter, mISearchActionCallback is null");
          return;
       }else if(TextUtils.x(tc.getCurrentWordShowMsg()) || this.c.f()){
          i.a(R.style.arg_RES_7f11066a, 0x7f1044df);
          return;
       }else {
          tc = this.c;
          tc.d = tc.d(2, 1);
          tc = this.c;
          tc.b.c(tc.d);
          f.e(f.c(this.c.d), this.c.d);
          a.c(this.c.getContext(), this.c.d);
          return;
       }
    }
}
