package ag7.a$f;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Locale;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.TypeCastException;

public final class a$f implements FilenameFilter	// class@0000bf
{
    public static final a$f b;

    static {
       a$f.b = new a$f();
    }
    public void a$f(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.h(p1, "name");
       Locale cHINA = Locale.CHINA;
       a.h(cHINA, "Locale.CHINA");
       if (p1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
       }
       String str = p1.toLowerCase(cHINA);
       a.h(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
       return StringsKt__StringsKt.O2(str, "thermal_zone", false, 2, null);
    }
}
