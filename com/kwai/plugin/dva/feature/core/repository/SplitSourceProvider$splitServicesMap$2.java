package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitServicesMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import com.kwai.plugin.dva.feature.core.repository.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import kotlin.jvm.internal.a;

public final class SplitSourceProvider$splitServicesMap$2 extends Lambda implements a	// class@000e83
{
    public final SplitSourceProvider this$0;

    public void SplitSourceProvider$splitServicesMap$2(SplitSourceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       HashMap obj = PatchProxy.apply(null, this, SplitSourceProvider$splitServicesMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(0);
       Iterator iterator = this.this$0.d().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          String[] stringArray = a.d(str);
          if (stringArray != null) {
             int i = 1;
             int i1 = (!stringArray.length)? 1: 0;
             i1 = i1 ^ i;
             if (i1) {
                ArrayList uArrayList = new ArrayList();
                Collections.addAll(uArrayList, Arrays.copyOf(stringArray, stringArray.length));
                a.o(str, "splitName");
                obj.put(str, uArrayList);
             }
          }
       }
       return obj;
    }
}
