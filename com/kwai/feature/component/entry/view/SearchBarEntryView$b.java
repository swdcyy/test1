package com.kwai.feature.component.entry.view.SearchBarEntryView$b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.feature.component.entry.view.SearchBarEntryView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.b;
import oy5.e;
import oy5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.kwai.feature.component.entry.SearchEntryActionRecorder;
import com.kwai.feature.component.entry.SearchEntryActionRecorder$SignalType;
import oy5.f;
import android.content.Context;
import android.widget.LinearLayout;
import com.kwai.feature.component.entry.a;

public class SearchBarEntryView$b extends m	// class@001213
{
    public final SearchBarEntryView c;

    public void SearchBarEntryView$b(SearchBarEntryView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarEntryView$b.class, "1")) {
          return;
       }
       SearchBarEntryView$b tc = this.c;
       if (tc.h == null) {
          b.c("SearchBarEntryView", "mButtonClickFilter, mISearchActionCallback is null");
          return;
       }else {
          tc.g = tc.d(2, 1);
          tc = this.c;
          tc.h.c(tc.g);
          if (!TextUtils.x(this.c.g.d())) {
             b.a(0x7fb69d0c).e(this.c.g.d(), SearchEntryActionRecorder$SignalType.USER_CLICK_COUNT);
          }
          f.e(f.c(this.c.g), this.c.g);
          a.c(this.c.getContext(), this.c.g);
          return;
       }
    }
}
