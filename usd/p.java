package usd.p;
import java.lang.Object;
import java.lang.Number;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Iterable;
import usd.g;
import java.lang.Comparable;
import usd.f;
import usd.d;
import usd.e;
import usd.h;

public class p	// class@00261f
{

    public void p(){
       super();
    }
    public static final void a(boolean p0,Number p1){
       a.p(p1, "step");
       if (p0) {
          return;
       }
       throw new IllegalArgumentException("Step must be positive, was: "+p1+'.');
    }
    public static final boolean b(Iterable p0,Object p1){
       a.p(p0, "$this$contains");
       boolean b = (p1 != null && p0.contains(p1))? true: false;
       return b;
    }
    public static final f c(double p0,double p1){
       return new d(p0, p1);
    }
    public static final f d(float p0,float p1){
       return new e(p0, p1);
    }
    public static final g e(Comparable p0,Comparable p1){
       a.p(p0, "$this$rangeTo");
       a.p(p1, "that");
       return new h(p0, p1);
    }
}
