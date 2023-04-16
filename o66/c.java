package o66.c;
import java.lang.Runnable;
import java.lang.Object;
import o66.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.b;
import o66.a;
import java.io.FileFilter;
import o66.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;

public final class c implements Runnable	// class@001faa
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       boolean b;
       if (PatchProxy.applyVoid(null, null, d.class, "14")) {
       }else {
          File[] uFileArray = b.b().listFiles(a.b);
          File[] uFileArray1 = b.d().listFiles(b.b);
          StringBuilder str = "last java crash ";
          int i = -1;
          int i1 = (uFileArray == null)? -1: uFileArray.length;
          str = str+i1+", native crash ";
          if (uFileArray1 != null) {
             i = uFileArray1.length;
          }
          Log.g("CrashCounter", str+i+" to counter");
          b = false;
          if (uFileArray != null) {
             i = uFileArray.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                d.d(d.g(uFileArray[i1], b));
             }
          }
          if (uFileArray1 != null) {
             int len = uFileArray1.length;
             for (; b < len; b = b + 1) {
                d.d(d.g(uFileArray1[b], true));
             }
          }
       }
       return;
    }
}
