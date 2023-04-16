package cg7.b$d;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class b$d implements FilenameFilter	// class@00054a
{
    public static final b$d b;

    static {
       b$d.b = new b$d();
    }
    public void b$d(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.q(p1, "name");
       String str = p1.toLowerCase();
       a.h(str, "\(this as java.lang.String\).toLowerCase\(\)");
       boolean b = (a.g(str, "temp") || a.g(str, "type"))? true: false;
       return b;
    }
}
