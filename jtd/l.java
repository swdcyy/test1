package jtd.l;
import ltd.e0;
import java.lang.String;
import java.lang.Object;
import jtd.i;
import kotlinx.coroutines.flow.StateFlowImpl;
import ktd.j;

public final class l	// class@001741
{
    public static final e0 a;
    public static final e0 b;

    static {
       l.a = new e0("NONE");
       l.b = new e0("PENDING");
    }
    public static final i a(Object p0){
       if (p0 != null) {
       }else {
          p0 = j.a;
       }
       return new StateFlowImpl(p0);
    }
    public static void b(){
    }
    public static void c(){
    }
}
