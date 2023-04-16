package ag7.g;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.CharSequence;
import java.util.regex.Pattern;

public final class g implements FilenameFilter	// class@0000c6
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final boolean accept(File p0,String p1){
       return Pattern.matches("state[0-9]", p1);
    }
}
