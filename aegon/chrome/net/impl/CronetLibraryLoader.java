package aegon.chrome.net.impl.CronetLibraryLoader;
import java.lang.Object;
import aegon.chrome.net.impl.CronetLibraryLoader$b;
import aegon.chrome.net.impl.CronetLibraryLoader$a;
import android.os.ConditionVariable;
import android.content.Context;
import aegon.chrome.net.impl.b;
import h0.a;
import android.app.Application;
import android.content.ContextWrapper;
import a0.f;
import java.lang.Runnable;
import j0.q;
import java.lang.String;
import java.lang.System;
import aegon.chrome.net.impl.c;
import aegon.chrome.net.impl.j$a;
import aegon.chrome.net.impl.j;
import a0.n;
import java.lang.RuntimeException;
import aegon.chrome.net.impl.CronetLibraryLoader$d;
import aegon.chrome.net.impl.e;
import aegon.chrome.net.NetworkChangeNotifier;
import aegon.chrome.net.l;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$h;
import aegon.chrome.net.impl.d;
import aegon.chrome.net.impl.CronetLibraryLoader$c;
import j0.o;
import android.os.Process;

public class CronetLibraryLoader	// class@0000a3
{
    public static final Object a;
    public static final String b;
    public static final String c;
    public static CronetLibraryLoader$c d;
    public static boolean e;
    public static boolean f;
    public static final ConditionVariable g;
    public static final boolean h;

    static {
       CronetLibraryLoader.a = new Object();
       CronetLibraryLoader.d = new CronetLibraryLoader$b(null);
       CronetLibraryLoader.e = false;
       CronetLibraryLoader.g = new ConditionVariable();
    }
    public void CronetLibraryLoader(){
       super();
    }
    public static void a(Context p0,b p1){
       ContextWrapper uContextWrap;
       Object[] objArray;
       Object a = CronetLibraryLoader.a;
       _monitor_enter(a);
       if (!CronetLibraryLoader.f) {
          if (a.b && p0 instanceof Application) {
             uContextWrap = new ContextWrapper(p0);
          }
          f.a = uContextWrap;
          CronetLibraryLoader.c(new CronetLibraryLoader$a());
       }
       if (!CronetLibraryLoader.e) {
          if (p1.v() != null) {
             p1.v().a(CronetLibraryLoader.b);
          }else {
             System.loadLibrary(CronetLibraryLoader.b);
          }
          String str = "95.0.4638.74";
          int i = 2;
          if (str.equals(j.b(c.a))) {
             objArray = new Object[i];
             objArray[0] = str;
             objArray[1] = System.getProperty("os.arch");
             n.e(CronetLibraryLoader.c, "Cronet version: %s, arch: %s", objArray);
             CronetLibraryLoader.e = true;
             CronetLibraryLoader.g.open();
          }else {
             objArray = new Object[i];
             objArray[0] = str;
             objArray[1] = e.c().a();
             throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", objArray));
          }
       }
       _monitor_exit(a);
       return;
    }
    public static void b(){
       if (CronetLibraryLoader.f) {
          return;
       }
       NetworkChangeNotifier.init();
       NetworkChangeNotifier.a().i(true, new l());
       CronetLibraryLoader.g.block();
       j.a(d.b);
       CronetLibraryLoader.f = true;
       return;
    }
    public static void c(Runnable p0){
       CronetLibraryLoader.d.a(p0);
    }
    public static void ensureInitializedFromNative(){
       Object a = CronetLibraryLoader.a;
       _monitor_enter(a);
       CronetLibraryLoader.e = true;
       CronetLibraryLoader.g.open();
       _monitor_exit(a);
       CronetLibraryLoader.a(f.a(), null);
    }
    public static String getDefaultUserAgent(){
       return o.b(f.a());
    }
    public static void setNetworkThreadPriorityOnNetworkThread(int p0){
       Process.setThreadPriority(p0);
    }
}
