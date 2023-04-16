package a3.d;
import java.io.Closeable;
import java.lang.String;

public interface abstract d implements Closeable	// class@00001a
{

    void bindBlob(int p0,byte[] p1);
    void bindDouble(int p0,double p1);
    void bindLong(int p0,long p1);
    void bindNull(int p0);
    void bindString(int p0,String p1);
    void clearBindings();
}
