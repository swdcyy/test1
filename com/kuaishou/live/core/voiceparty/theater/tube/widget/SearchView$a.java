package com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class SearchView$a implements View$OnClickListener	// class@001a42
{
    public final SearchView b;

    public void SearchView$a(SearchView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchView$a.class, "1")) {
          return;
       }
       this.b.b();
       return;
    }
}
