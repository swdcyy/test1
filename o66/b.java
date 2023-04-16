package o66.b;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public final class b implements FileFilter	// class@001fa9
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean accept(File p0){
       return (p0.getName()).endsWith(".dump");
    }
}
