package aegon.chrome.base.task.PostTask;
import java.lang.Object;
import java.util.ArrayList;
import aegon.chrome.base.task.c;
import java.util.concurrent.atomic.AtomicReferenceArray;
import g0.e;
import java.util.Iterator;
import java.util.List;
import aegon.chrome.base.task.e;

public class PostTask	// class@000172
{
    public static final Object a;
    public static List b;
    public static boolean c;
    public static final Executor d;
    public static Executor e;
    public static AtomicReferenceArray f;
    public static final boolean g;

    static {
       PostTask.a = new Object();
       PostTask.b = new ArrayList();
       PostTask.d = new c();
       AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray(5);
       uAtomicRefer.set(0, new e());
       PostTask.f = uAtomicRefer;
    }
    public void PostTask(){
       super();
    }
    public static void onNativeSchedulerReady(){
       PostTask.c = true;
       Iterator a = PostTask.a;
       _monitor_enter(a);
       List b = PostTask.b;
       PostTask.b = null;
       _monitor_exit(a);
       a = b.iterator();
       while (a.hasNext()) {
          a.next().e();
       }
       return;
    }
    public static void onNativeSchedulerShutdownForTesting(){
       Object a = PostTask.a;
       _monitor_enter(a);
       PostTask.b = new ArrayList();
       _monitor_exit(a);
       PostTask.c = false;
       PostTask.f.set(false, new e());
       for (int i = 1; i < PostTask.f.length(); i = i + 1) {
          PostTask.f.set(i, null);
       }
       return;
    }
}
