package com.kuaishou.android.security.base.perf.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.lang.StringBuilder;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.Throwable;

public class h	// class@000f04
{
    public static String a = "";

    public void h(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((h.b()).length() > 0) {
          return h.b();
       }
       BufferedReader uBufferedRea = new BufferedReader(new FileReader(new File("/proc/"+Process.myPid()+"/cmdline")));
       h.a(uBufferedRea.readLine());
       uBufferedRea.close();
       return h.b();
    }
    public static void a(String p0){
       h.a = p0;
    }
    public static String b(){
       return h.a;
    }
}
