package vg7.d;
import com.kwai.performance.stability.crash.monitor.util.AbiUtil;
import java.lang.Runtime;
import java.io.File;
import java.lang.String;
import android.os.Build$VERSION;
import java.util.regex.Pattern;
import com.google.gson.Gson;

public final class d	// class@0026a6
{
    public static final long a;
    public static final double b;
    public static final File c;
    public static final int d;
    public static final int e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;
    public static final Gson j;

    static {
       long l = (AbiUtil.b())? 4096: 3072;
       d.a = l;
       d.b = (double)Runtime.getRuntime().maxMemory();
       d.c = new File("/proc/self/fd");
       int i = (Build$VERSION.SDK_INT < 28)? 1024: 0x8000;
       d.d = i;
       d.e = (int)((double)i * 0x3fe999999999999a);
       d.f = Pattern.compile("/data/user");
       d.g = Pattern.compile("/data");
       d.h = Pattern.compile("/data/data/\(.*\)/data/.*");
       d.i = Pattern.compile("/data/user/.*/\(.*\)/data/.*");
       d.j = new Gson();
    }
}
