package com.ks.klppullclient.KlpPullReporterDispatcher;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import com.ks.klppullclient.KlpPullReporter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Iterator;
import kn.a;
import java.lang.Runnable;

public class KlpPullReporterDispatcher	// class@000745
{
    public static final ConcurrentLinkedQueue a;
    public static Executor b;

    static {
       KlpPullReporterDispatcher.a = new ConcurrentLinkedQueue();
       KlpPullReporterDispatcher.b = null;
    }
    public void KlpPullReporterDispatcher(){
       super();
    }
    public static void addReporter(KlpPullReporter p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KlpPullReporterDispatcher.class, "2")) {
          return;
       }
       KlpPullReporterDispatcher.a.add(p0);
       return;
    }
    public static void onSessionEvent(String p0){
       KlpPullReporterDispatcher klpPullRepor = KlpPullReporterDispatcher.class;
       Executor obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, klpPullRepor, "4")) {
          return;
       }
       ConcurrentLinkedQueue a = KlpPullReporterDispatcher.a;
       if (a.isEmpty()) {
          return;
       }
       obj = PatchProxy.apply(obj, obj, klpPullRepor, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = KlpPullReporterDispatcher.b;
          if (obj == null) {
             _monitor_enter(klpPullRepor);
             if (KlpPullReporterDispatcher.b == null) {
                KlpPullReporterDispatcher.b = Executors.newSingleThreadExecutor();
             }
             obj = KlpPullReporterDispatcher.b;
             _monitor_exit(klpPullRepor);
          }
       }
       Iterator iterator = a.iterator();
       while (iterator.hasNext()) {
          obj.execute(new a(iterator.next(), p0));
       }
       return;
    }
    public static void removeReporter(KlpPullReporter p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KlpPullReporterDispatcher.class, "3")) {
          return;
       }
       KlpPullReporterDispatcher.a.remove(p0);
       return;
    }
}
