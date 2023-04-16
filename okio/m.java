package okio.m;
import java.io.Closeable;
import java.io.Flushable;
import okio.o;
import okio.b;

public interface abstract m implements Closeable, Flushable	// class@0020f9
{

    void close();
    void flush();
    o timeout();
    void write(b p0,long p1);
}
