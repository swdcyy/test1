package cg7.b$c;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class b$c implements FilenameFilter	// class@000549
{
    public static final b$c b;

    static {
       b$c.b = new b$c();
    }
    public void b$c(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       String str = p1.toLowerCase();
       a.h(str, "\(this as java.lang.String\).toLowerCase\(\)");
       return StringsKt__StringsKt.O2(str, "mali", false, 2, null);
    }
}
