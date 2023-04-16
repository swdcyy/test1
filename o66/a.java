package o66.a;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public final class a implements FileFilter	// class@001fa8
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean accept(File p0){
       return (p0.getName()).endsWith(".dump");
    }
}
