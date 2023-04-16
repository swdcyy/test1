package okio.n;
import java.io.Closeable;
import okio.b;
import okio.o;

public interface abstract n implements Closeable	// class@0020fa
{

    void close();
    long read(b p0,long p1);
    o timeout();
}
