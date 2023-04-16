package trd.w;
import trd.v;
import java.util.Iterator;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import trd.k0;

public class w extends v	// class@00258d
{

    public void w(){
       super();
    }
    public static final void g0(Iterator p0,l p1){
       a.p(p0, "$this$forEach");
       a.p(p1, "operation");
       while (p0.hasNext()) {
          p1.invoke(p0.next());
       }
       return;
    }
    public static final Iterator h0(Iterator p0){
       a.p(p0, "$this$iterator");
       return p0;
    }
    public static final Iterator i0(Iterator p0){
       a.p(p0, "$this$withIndex");
       return new k0(p0);
    }
}
