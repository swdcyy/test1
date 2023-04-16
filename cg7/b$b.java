package cg7.b$b;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class b$b implements FilenameFilter	// class@000548
{
    public static final b$b b;

    static {
       b$b.b = new b$b();
    }
    public void b$b(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       String str = p1.toLowerCase();
       a.h(str, "\(this as java.lang.String\).toLowerCase\(\)");
       boolean b = false;
       if (StringsKt__StringsKt.O2(str, "kgsl", b, 2, null) && StringsKt__StringsKt.O2(str, "3d", b, 2, null)) {
          b = true;
       }
       return b;
    }
}
