package ag7.a$d;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Locale;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class a$d implements FilenameFilter	// class@0000bd
{
    public static final a$d b;

    static {
       a$d.b = new a$d();
    }
    public void a$d(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       Locale cHINA = Locale.CHINA;
       a.h(cHINA, "Locale.CHINA");
       String str = p1.toLowerCase(cHINA);
       a.h(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
       return StringsKt__StringsKt.O2(str, "mali", false, 2, null);
    }
}
