package okhttp3.internal.io.FileSystem;
import okhttp3.internal.io.FileSystem$1;
import java.io.File;
import okio.m;
import okio.n;

public interface abstract FileSystem	// class@001fc9
{
    public static final FileSystem SYSTEM;

    static {
       FileSystem.SYSTEM = new FileSystem$1();
    }
    m appendingSink(File p0);
    void delete(File p0);
    void deleteContents(File p0);
    boolean exists(File p0);
    void rename(File p0,File p1);
    m sink(File p0);
    long size(File p0);
    n source(File p0);
}
