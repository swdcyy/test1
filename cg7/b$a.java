package cg7.b$a;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class b$a implements FilenameFilter	// class@000547
{
    public static final b$a b;

    static {
       b$a.b = new b$a();
    }
    public void b$a(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       String str = p1.toLowerCase();
       a.h(str, "\(this as java.lang.String\).toLowerCase\(\)");
       boolean b = false;
       if (!StringsKt__StringsKt.O2(str, "gpu_load", b, 2, null) && (!StringsKt__StringsKt.O2(str, "runtime_usage", b, 2, null) && (!StringsKt__StringsKt.O2(str, "utilization", b, 2, null) && (!StringsKt__StringsKt.O2(str, "gpubusy", b, 2, null) && (!StringsKt__StringsKt.O2(str, "gpu_busy_percentage", b, 2, null) && (StringsKt__StringsKt.O2(str, "gpu_busy", b, 2, null) || StringsKt__StringsKt.O2(str, "cur_freq", b, 2, null))))))) {
          b = true;
       }
       return b;
    }
}
