package ftd.g0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.ServiceLoader;
import java.util.Iterator;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Thread$UncaughtExceptionHandler;
import ftd.h0;

public final class g0	// class@000e86
{
    public static final List a;

    static {
       g0.a = SequencesKt___SequencesKt.V2(SequencesKt__SequencesKt.h(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));
    }
    public static final void a(CoroutineContext p0,Throwable p1){
       Iterator iterator = g0.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().handleException(p0, p1);
       }
       Thread thread = Thread.currentThread();
       thread.getUncaughtExceptionHandler().uncaughtException(thread, p1);
       return;
    }
}
