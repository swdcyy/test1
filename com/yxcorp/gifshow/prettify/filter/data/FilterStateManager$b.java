package com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import b1c.c;
import b1c.b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;

public final class FilterStateManager$b implements Runnable	// class@001147
{
    public final FilterStateManager b;

    public void FilterStateManager$b(FilterStateManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FilterStateManager$b.class, "1")) {
          return;
       }
       Iterator iterator = this.b.e().iterator();
       while (iterator.hasNext()) {
          FilterConfig uFilterConfi = this.b.f().a();
          a.m(uFilterConfi);
          iterator.next().a(uFilterConfi, this.b.f().c(), false);
       }
       return;
    }
}
