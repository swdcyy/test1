package com.kwai.feature.component.entry.view.SearchBarEntryView$a;
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
import oy5.d;
import oy5.f;
import android.content.Context;
import android.widget.LinearLayout;
import com.kwai.feature.component.entry.a;

public class SearchBarEntryView$a extends m	// class@001212
{
    public final SearchBarEntryView c;

    public void SearchBarEntryView$a(SearchBarEntryView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarEntryView$a.class, "1")) {
          return;
       }
       SearchBarEntryView$a tc = this.c;
       if (tc.h == null) {
          b.c("SearchBarEntryView", "mClickFilter, mISearchActionCallback is null");
          return;
       }else {
          tc.g = tc.d(1, 1);
          tc = this.c;
          tc.h.c(tc.g);
          if (!TextUtils.x(this.c.g.d())) {
             b.a(0x7fb69d0c).e(this.c.g.d(), SearchEntryActionRecorder$SignalType.USER_CLICK_COUNT);
          }
          SearchBarEntryView i = this.c.i;
          if (i != null && i.a()) {
             b.c("SearchBarEntryView", "mClickFilter, interceptSearch");
             return;
          }else {
             f.e(f.c(this.c.g), this.c.g);
             a.c(this.c.getContext(), this.c.g);
             return;
          }
       }
    }
}
