package kotlin.io.NoSuchFileException;
import kotlin.io.FileSystemException;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class NoSuchFileException extends FileSystemException	// class@001885
{

    public void NoSuchFileException(File p0,File p1,String p2){
       a.p(p0, "file");
       super(p0, p1, p2);
    }
    public void NoSuchFileException(File p0,File p1,String p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
}
