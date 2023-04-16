package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$allSplitInfos$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import zi7.a;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class SplitSourceProvider$allSplitInfos$2 extends Lambda implements a	// class@000e7b
{
    public final SplitSourceProvider this$0;

    public void SplitSourceProvider$allSplitInfos$2(SplitSourceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List obj = PatchProxy.apply(null, this, SplitSourceProvider$allSplitInfos$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.d();
       SplitSourceProvider$allSplitInfos$2 tthis$0 = this.this$0;
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          a.o(str, "it");
          uArrayList.add(tthis$0.b().f(str));
       }
       return CollectionsKt___CollectionsKt.d2(uArrayList);
    }
}
