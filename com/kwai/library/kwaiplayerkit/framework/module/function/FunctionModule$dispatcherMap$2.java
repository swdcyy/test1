package com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule$dispatcherMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule;
import java.lang.Object;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import tx6.b;

public final class FunctionModule$dispatcherMap$2 extends Lambda implements a	// class@000872
{
    public final FunctionModule this$0;

    public void FunctionModule$dispatcherMap$2(FunctionModule p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       List list = this.this$0.j();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             linkedHashMa.put(uob.a, uob.b);
          }
       }
       return linkedHashMa;
    }
}
