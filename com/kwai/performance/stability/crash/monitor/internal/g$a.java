package com.kwai.performance.stability.crash.monitor.internal.g$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.util.regex.Pattern;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.internal.g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class g$a	// class@0011ed
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public final Pattern a(String p0){
       Pattern pattern;
       a.p(p0, "pattern");
       ConcurrentHashMap h = g.h;
       if (!h.containsKey(p0)) {
          pattern = Pattern.compile(p0);
          a.o(pattern, "compile\(pattern\)");
          h.put(p0, pattern);
       }
       p0 = h.get(p0);
       a.m(p0);
       a.o(p0, "patternMap[pattern]!!");
       return p0;
    }
}
