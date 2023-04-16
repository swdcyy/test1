package ee0.e;
import java.io.FileFilter;
import java.lang.String;
import java.lang.Object;
import java.io.File;

public final class e implements FileFilter	// class@0020f4
{
    public final String b;

    public void e(String p0){
       this.b = p0;
    }
    public final boolean accept(File p0){
       e tb = this.b;
       boolean b = (p0.isFile() && (!p0.isHidden() && (p0.getName()).startsWith(tb)))? true: false;
       return b;
    }
}
