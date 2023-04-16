package com.kuaishou.logic.b;
import android.os.StrictMode$OnThreadViolationListener;
import java.lang.Object;
import android.os.strictmode.Violation;
import pr3.f;
import java.lang.StackTraceElement;
import java.lang.String;
import java.util.HashSet;
import java.lang.StringBuilder;
import o56.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class b implements StrictMode$OnThreadViolationListener	// class@0014ba
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void onThreadViolation(Violation p0){
       StackTraceElement[] stackTrace = p0.getStackTrace();
       int len = stackTrace.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i < len) {
             object oobject = stackTrace[i];
             if (f.c.contains(oobject.getClassName()) || (f.b.contains(oobject.getClassName()+"."+oobject.getMethodName()) || (!i1 && (oobject.getClassName()).startsWith("com.kwai.framework.exceptionhandler.GifShowUncaughtExceptionHandler")))) {
                break ;
             }else if(!(oobject.getClassName()).startsWith("com.kwai") && ((oobject.getClassName()).startsWith("com.kuaishou") || (oobject.getClassName()).startsWith("com.yxcorp"))){
                i1 = i1 + 1;
             }
             i = i + 1;
          }else if(i1 >= 1 && a.d()){
             ExceptionHandler.handleCaughtException(p0);
             break ;
          }else {
             break ;
          }
       }
    label_0083 :
       return;
    }
}
