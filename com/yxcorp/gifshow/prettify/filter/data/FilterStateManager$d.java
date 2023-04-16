package com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$d;
import j16.b;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Object;
import j16.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$d$a;
import java.lang.Runnable;
import ekd.k1;

public final class FilterStateManager$d implements b	// class@00114a
{
    public final FilterStateManager a;
    public final FilterConfig b;

    public void FilterStateManager$d(FilterStateManager p0,FilterConfig p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,float p1){
       a.b(this, p0, p1);
    }
    public void onComplete(int p0){
       if (PatchProxy.isSupport(FilterStateManager$d.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FilterStateManager$d.class, "1")) {
          return;
       }
       k1.o(new FilterStateManager$d$a(this));
       return;
    }
    public void onError(int p0){
    }
}
