package old.soloader.a$a;
import old.soloader.e$b;
import old.soloader.a;
import old.soloader.e;
import old.soloader.i;
import java.io.File;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import java.lang.String;
import java.util.zip.ZipEntry;
import java.lang.Object;
import java.lang.Long;

public class a$a extends e$b	// class@002008
{
    public File f;
    public final int g;
    public final a h;

    public void a$a(a p0,e p1){
       this.h = p0;
       super(p0, p1);
       this.f = new File(p0.c.getApplicationInfo().nativeLibraryDir);
       this.g = p0.i;
    }
    public boolean f(ZipEntry p0,String p1){
       Object[] objArray;
       String name = p0.getName();
       int i = 0;
       if (p1.equals(this.h.d)) {
          p0.d = null;
          objArray = new Object[]{p1};
          String.format("allowing consideration of corrupted lib %s", objArray);
       }else if(!(this.g & 1)){
          File uFile = new File(this.f, p1);
          if (!uFile.isFile()) {
             objArray = new Object[]{name,p1};
             String.format("allowing considering of %s: %s not in system lib dir", objArray);
          }else {
             long l = uFile.length();
             long size = p0.getSize();
             if (l - size) {
                Object[] objArray1 = new Object[]{uFile,Long.valueOf(l),Long.valueOf(size)};
                String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", objArray1);
             }else {
             label_0063 :
                return i;
             }
          }
       }
       i = true;
       goto label_0063 ;
    }
}
