package isd.e;
import java.io.File;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class e	// class@001504
{

    public static final String a(File p0,File p1,String p2){
       String str = p0.toString();
       if (p1 != null) {
          str = str+" -> "+p1;
       }
       if (p2 != null) {
          str = str+": "+p2;
       }
       String str1 = str;
       a.o(str1, "sb.toString\(\)");
       return str1;
    }
}
