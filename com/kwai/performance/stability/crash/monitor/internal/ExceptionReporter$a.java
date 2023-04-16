package com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.util.regex.Pattern;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.message.RecoverMessage;

public final class ExceptionReporter$a	// class@0011e1
{

    public void ExceptionReporter$a(){
       super();
    }
    public void ExceptionReporter$a(u p0){
       super();
    }
    public final Pattern a(String p0){
       Pattern pattern;
       a.p(p0, "pattern");
       ConcurrentHashMap e = ExceptionReporter.e;
       if (!e.containsKey(p0)) {
          if (a.g(p0, ".*at\\s+\(.*\)\\.\(.*\)\\\(\(\(.*\):\(-?\\d+\)|Native method\)\\\)") || a.g(p0, ".*\(Mterp|ExecuteMterp|\(art::|_ZN3art11\)\(interpreter|.*Invoke\)|art_?interpreter|art_?quick|ZN3art9ArtMethod6Invoke|art::ArtMethod::Invoke\).*")) {
             pattern = Pattern.compile(p0, 66);
             a.o(pattern, "compile\(\n            pattern,\n            Pattern.CASE_INSENSITIVE or Pattern.UNICODE_CASE\n          \)");
             e.put(p0, pattern);
          }else {
             pattern = Pattern.compile(p0);
             a.o(pattern, "compile\(pattern\)");
             e.put(p0, pattern);
          }
       }
       p0 = e.get(p0);
       a.m(p0);
       a.o(p0, "patternMap[pattern]!!");
       return p0;
    }
    public final void b(RecoverMessage p0){
       ExceptionReporter.f = p0;
    }
}
