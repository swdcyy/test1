package com.kuaishou.android.security.base.exception.a;
import java.lang.Thread$UncaughtExceptionHandler;
import android.content.Context;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.net.UnknownHostException;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.Boolean;
import com.kuaishou.android.security.base.log.d;
import java.lang.StringBuilder;

public class a implements Thread$UncaughtExceptionHandler	// class@000ed8
{
    public Thread$UncaughtExceptionHandler a;
    public static a c;

    public void a(Context p0){
       super();
       this.a = Thread.getDefaultUncaughtExceptionHandler();
       Thread.setDefaultUncaughtExceptionHandler(this);
    }
    public static String a(Throwable p0){
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 == null) {
          return obj;
       }
       Throwable throwable = p0;
       while (true) {
          if (throwable != null) {
             if (throwable instanceof UnknownHostException) {
                break ;
             }else {
                throwable = throwable.getCause();
             }
          }else {
             StringWriter stringWriter = new StringWriter();
             p0.printStackTrace(new PrintWriter(stringWriter));
             return stringWriter.toString();
          }
       }
       return obj;
    }
    public final boolean b(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       try{
          d.a("in CrashHandler............");
          d.a(this.getClass(), p0);
          d.a("CrashHandler:\n"+a.a(p0));
       }catch(java.lang.Exception e0){
          d.a("CrashHandler has crash:\n"+a.a(p0));
       }
       return e0;
    }
    public void uncaughtException(Thread p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       if (!this.b(p1)) {
          a ta = this.a;
          if (ta != null) {
             ta.uncaughtException(p0, p1);
          }else {
          label_0019 :
             long l = 3000;
             try{
                Thread.sleep(l);
             }catch(java.lang.InterruptedException e3){
                d.a(this.getClass(), e3);
                Thread.currentThread().interrupt();
             }
          }
       }else {
          goto label_0019 ;
       }
    }
}
