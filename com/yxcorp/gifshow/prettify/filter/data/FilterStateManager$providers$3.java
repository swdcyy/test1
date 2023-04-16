package com.yxcorp.gifshow.prettify.filter.data.FilterStateManager$providers$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FilterStateManager$providers$3 extends Lambda implements l	// class@00114d
{
    public final FilterStateManager this$0;

    public void FilterStateManager$providers$3(FilterStateManager p0){
       this.this$0 = p0;
       super(1);
    }
    public final FilterConfig invoke(FilterConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FilterStateManager$providers$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.n(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
