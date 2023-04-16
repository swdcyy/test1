package ag7.a$c;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Locale;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class a$c implements FilenameFilter	// class@0000bc
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       Locale cHINA = Locale.CHINA;
       a.h(cHINA, "Locale.CHINA");
       String str = p1.toLowerCase(cHINA);
       a.h(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
       boolean b = false;
       if (StringsKt__StringsKt.O2(str, "kgsl", b, 2, null) && StringsKt__StringsKt.O2(str, "3d", b, 2, null)) {
          b = true;
       }
       return b;
    }
}
