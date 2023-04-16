package cg7.b$e;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.TypeCastException;

public final class b$e implements FilenameFilter	// class@00054b
{
    public static final b$e b;

    static {
       b$e.b = new b$e();
    }
    public void b$e(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.h(p1, "name");
       if (p1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
       }
       String str = p1.toLowerCase();
       a.h(str, "\(this as java.lang.String\).toLowerCase\(\)");
       return StringsKt__StringsKt.O2(str, "thermal_zone", false, 2, null);
    }
}
