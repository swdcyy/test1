package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$allServices$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;

public final class SplitSourceProvider$allServices$2 extends Lambda implements a	// class@000e7a
{
    public final SplitSourceProvider this$0;

    public void SplitSourceProvider$allServices$2(SplitSourceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashSet invoke(){
       HashSet obj = PatchProxy.apply(null, this, SplitSourceProvider$allServices$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       Iterator iterator = this.this$0.e().values().iterator();
       while (iterator.hasNext()) {
          obj.addAll(iterator.next());
       }
       return obj;
    }
}
