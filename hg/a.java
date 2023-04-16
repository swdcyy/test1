package hg.a;
import java.lang.String;
import com.facebook.base.tracing.TracingManager;
import android.os.Trace;

public class a	// class@00212e
{

    public static void a(long p0,String p1){
       TracingManager.a(p1);
       Trace.beginSection(p1);
    }
    public static void b(long p0,String p1,double p2,long p3){
       TracingManager.b(p1, p2, p3);
       Trace.beginSection(p1);
    }
    public static void c(long p0,String p1){
       TracingManager.c(p1);
       Trace.endSection();
    }
    public static void d(long p0,String p1,double p2,long p3){
       TracingManager.d(p1, p2, p3);
       Trace.endSection();
    }
    public static double e(){
       double d = (TracingManager.f())? TracingManager.jniMtrTimeS(): 0;
       return d;
    }
}
