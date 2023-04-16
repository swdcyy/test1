package nsd.u0$a;
import java.lang.Object;
import nsd.u;
import vsd.s;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import kotlin.reflect.KVariance;
import nsd.t0;
import java.lang.Enum;

public final class u0$a	// class@001ede
{

    public void u0$a(){
       super();
    }
    public void u0$a(u p0){
       super();
    }
    public final String a(s p0){
       a.p(p0, "typeParameter");
       StringBuilder str = "";
       int i = t0.a[p0.m().ordinal()];
       if (i != 2) {
          if (i == 3) {
             str = str+"out ";
          }
       }else {
          str = str+"in ";
       }
       String str1 = str+p0.getName();
       a.o(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return str1;
    }
}
