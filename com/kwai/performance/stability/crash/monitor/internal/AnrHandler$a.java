package com.kwai.performance.stability.crash.monitor.internal.AnrHandler$a;
import android.os.FileObserver;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.internal.AnrHandler;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import java.util.List;
import java.util.Collection;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import java.lang.Exception;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import java.util.concurrent.atomic.AtomicInteger;

public final class AnrHandler$a extends FileObserver	// class@0011dc
{

    public void AnrHandler$a(){
       super("/data/anr/", 8);
    }
    public void onEvent(int p0,String p1){
       int i;
       Object[] objArray;
       if (p1 == null) {
       }else {
          String str = a.C("/data/anr/", p1);
          AnrHandler r = AnrHandler.r;
          Objects.requireNonNull(r);
          Throwable throwable = null;
          try{
             i = 0;
             BufferedReader uBufferedRea = new BufferedReader(new FileReader(str));
             String str1 = -1;
             while (true) {
                String str2 = uBufferedRea.readLine();
                if (str2 != null) {
                   if (AnrHandler.u.matcher(str2).matches()) {
                      String[] stringArray = new String[i];
                      objArray = new Regex("\\s").split(str2, i).toArray(stringArray);
                      if (objArray != null) {
                         str1 = Integer.parseInt(objArray[2]);
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                      }
                   }
                }
                objArray = (str1 == AnrHandler.t)? 1: 0;
                b.a(uBufferedRea, throwable);
                i = objArray;
             }
          }catch(java.lang.Exception e2){
             CrashMonitorLoggerKt.a("anr_reason_fail", e2.toString(), i, 4, throwable);
          }
          if (i) {
             r.c(str, r.b.getAndIncrement());
          }
       }
       return;
    }
}
