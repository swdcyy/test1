package kotlin.io.TerminateException;
import kotlin.io.FileSystemException;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class TerminateException extends FileSystemException	// class@001887
{

    public void TerminateException(File p0){
       a.p(p0, "file");
       super(p0, null, null, 6, null);
    }
}
