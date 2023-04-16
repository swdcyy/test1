package com.kwai.framework.exceptionhandler.ExceptionClues;
import fg6.a;
import com.google.common.collect.EvictingQueue;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import n66.e;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.framework.exceptionhandler.Clue;
import nsd.u;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.framework.exceptionhandler.ExceptionClues$remove$$inlined$synchronized$lambda$1;
import msd.l;
import trd.y;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class ExceptionClues	// class@00153c
{
    public static final Gson a;
    public static final EvictingQueue b;
    public static final ExceptionClues c;

    static {
       ExceptionClues.c = new ExceptionClues();
       ExceptionClues.a = a.a;
       ExceptionClues.b = EvictingQueue.create(15);
    }
    public void ExceptionClues(){
       super();
    }
    public final List a(){
       EvictingQueue obj = PatchProxy.apply(null, this, ExceptionClues.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       obj = ExceptionClues.b;
       Map map = e.a();
       ArrayList uArrayList = new ArrayList(map.size());
       Iterator iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Clue uClue = new Clue(uEntry.getKey(), uEntry.getValue().toString(), 0, 4, null);
          uArrayList.add(v11);
       }
       obj.addAll(uArrayList);
       a.o(obj, "clues.apply { addAll\(Lea¡­it.value.toString\(\)\) }\) }");
       _monitor_exit(this);
       return CollectionsKt___CollectionsKt.G4(obj);
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExceptionClues.class, "2")) {
          return;
       }
       a.p(p0, "key");
       _monitor_enter(this);
       EvictingQueue b = ExceptionClues.b;
       a.o(b, "clues");
       y.F0(b, new ExceptionClues$remove$$inlined$synchronized$lambda$1(p0));
       _monitor_exit(this);
       return;
    }
    public final void c(String p0,JsonElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExceptionClues.class, "1")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       _monitor_enter(this);
       ExceptionClues.c.b(p0);
       String str = ExceptionClues.a.p(p1);
       int i = 1024;
       if (str.length() > i) {
          a.o(str, "v");
          str = str.substring(0, i);
          a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("Clue value too large. key: "+p0));
       }
       String str1 = str;
       a.o(str1, "v");
       Clue uClue = new Clue(p0, str1, 0, 4, null);
       ExceptionClues.b.add(v7);
       _monitor_exit(this);
       return;
    }
}
