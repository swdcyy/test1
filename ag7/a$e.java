package ag7.a$e;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Locale;

public final class a$e implements FilenameFilter	// class@0000be
{
    public static final a$e b;

    static {
       a$e.b = new a$e();
    }
    public void a$e(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       Locale cHINA = Locale.CHINA;
       a.h(cHINA, "Locale.CHINA");
       String str = p1.toLowerCase(cHINA);
       a.h(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
       boolean b = (a.g(str, "temp") || a.g(str, "type"))? true: false;
       return b;
    }
}
