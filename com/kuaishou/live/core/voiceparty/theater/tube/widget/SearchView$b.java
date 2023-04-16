package com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$f;

public final class SearchView$b implements View$OnClickListener	// class@001a43
{
    public final SearchView b;

    public void SearchView$b(SearchView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchView$b.class, "1")) {
          return;
       }
       SearchView$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, SearchView.class, "30")) {
          tb.c(true);
          SearchView b = tb.b;
          if (b != null) {
             a.m(b);
             b.c();
          }
       }
       return;
    }
}
