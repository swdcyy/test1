package old.soloader.i$d;
import java.io.Closeable;
import old.soloader.i$b;
import java.io.InputStream;
import java.lang.Object;

public final class i$d implements Closeable	// class@00201b
{
    public final i$b b;
    public final InputStream c;

    public void i$d(i$b p0,InputStream p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void close(){
       this.c.close();
    }
}
