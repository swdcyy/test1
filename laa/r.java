package laa.r;
import java.io.FileFilter;
import java.util.regex.Pattern;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import qkd.b;

public final class r implements FileFilter	// class@002d9a
{
    public final Pattern b;

    public void r(Pattern p0){
       this.b = p0;
    }
    public final boolean accept(File p0){
       r tb = this.b;
       boolean b = (p0.canRead() && (p0.isFile() && (tb.matcher(p0.getName()).matches() || b.L(p0))))? true: false;
       return b;
    }
}
