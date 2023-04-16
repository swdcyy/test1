package lg7.d;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import lg7.j;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.b;
import msd.p;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.Exception;
import com.kwai.performance.stability.crash.monitor.util.e;

public final class d	// class@001d8d
{
    public static CopyOnWriteArrayList a;

    static {
       d.a = new CopyOnWriteArrayList();
    }
    public static final CopyOnWriteArrayList a(){
       return d.a;
    }
    public static final void b(ExceptionMessage p0,int p1){
       a.p(p0, "message");
       Iterator iterator = d.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p1, p0);
       }
       return;
    }
    public static final void c(File p0,ExceptionMessage p1,int p2){
       Iterator iterator;
       a.p(p1, "message");
       if (d.a.isEmpty()) {
          return;
       }
       File uFile = null;
       int i = (p0.exists())? 1: 0;
       if (i) {
          uFile = new File(b.a.e(), p1.mLogUUID);
          File uFile1 = p0;
          try{
             File uFile2 = uFile;
             FilesKt__UtilsKt.O(uFile1, uFile2, false, null, 6, null);
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
       }
    }
}
