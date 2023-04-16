package btd.i;
import btd.h;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import btd.f;
import kotlin.NoWhenBranchMatchedException;

public class i extends h	// class@0002e9
{

    public void i(){
       super();
    }
    public static final String c(TimeUnit p0){
       String str;
       a.p(p0, "$this$shortName");
       switch (f.a[p0.ordinal()]){
           case 1:
             str = "ns";
             break;
           case 2:
             str = "us";
             break;
           case 3:
             str = "ms";
             break;
           case 4:
             str = "s";
             break;
           case 5:
             str = "m";
             break;
           case 6:
             str = "h";
             break;
           case 7:
             str = "d";
             break;
           default:
             throw new NoWhenBranchMatchedException();
       }
       return str;
    }
}
