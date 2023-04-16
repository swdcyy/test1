package com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$d$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;

public final class FilterStateManager$d$a implements Runnable	// class@001149
{
    public final FilterStateManager$d b;

    public void FilterStateManager$d$a(FilterStateManager$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FilterStateManager$d$a.class, "1")) {
          return;
       }
       if (this.b.a.c()) {
          FilterStateManager$d$a tb = this.b;
          FilterStateManager$d b = tb.b;
          if (b != null) {
             tb.a.l(b);
          }
       }
       return;
    }
}
