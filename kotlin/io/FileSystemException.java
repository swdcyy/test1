package kotlin.io.FileSystemException;
import java.io.IOException;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import isd.e;
import nsd.u;

public class FileSystemException extends IOException	// class@00187d
{
    public final File file;
    public final File other;
    public final String reason;

    public void FileSystemException(File p0,File p1,String p2){
       a.p(p0, "file");
       super(e.a(p0, p1, p2));
       this.file = p0;
       this.other = p1;
       this.reason = p2;
    }
    public void FileSystemException(File p0,File p1,String p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public final File getFile(){
       return this.file;
    }
    public final File getOther(){
       return this.other;
    }
    public final String getReason(){
       return this.reason;
    }
}
