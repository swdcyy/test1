package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitActivities$2;
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
import com.kwai.plugin.dva.feature.core.repository.a;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;

public final class SplitSourceProvider$splitActivities$2 extends Lambda implements a	// class@000e7e
{
    public final SplitSourceProvider this$0;

    public void SplitSourceProvider$splitActivities$2(SplitSourceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List obj = PatchProxy.apply(null, this, SplitSourceProvider$splitActivities$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.d();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          String[] stringArray = a.b(iterator.next());
          Object[] objArray = (stringArray == null)? null: ArraysKt___ArraysKt.uy(stringArray);
          if (objArray == null) {
             objArray = CollectionsKt__CollectionsKt.E();
          }
          uArrayList.add(objArray);
       }
       return u.c0(uArrayList);
    }
}
