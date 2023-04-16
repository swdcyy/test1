package ag7.a$b;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Locale;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class a$b implements FilenameFilter	// class@0000bb
{
    public static final a$b b;

    static {
       a$b.b = new a$b();
    }
    public void a$b(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       Locale cHINA = Locale.CHINA;
       a.h(cHINA, "Locale.CHINA");
       String str = p1.toLowerCase(cHINA);
       a.h(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
       boolean b = false;
       if (!StringsKt__StringsKt.O2(str, "gpu_load", b, 2, null) && (!StringsKt__StringsKt.O2(str, "runtime_usage", b, 2, null) && (!StringsKt__StringsKt.O2(str, "gpubusy", b, 2, null) && (!StringsKt__StringsKt.O2(str, "gpu_busy", b, 2, null) && (!StringsKt__StringsKt.O2(str, "utilization", b, 2, null) && (StringsKt__StringsKt.O2(str, "cur_freq", b, 2, null) || StringsKt__StringsKt.O2(str, "available_frequencies", b, 2, null))))))) {
          b = true;
       }
       return b;
    }
}
