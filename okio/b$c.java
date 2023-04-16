package okio.b$c;
import java.io.InputStream;
import okio.b;
import java.lang.Math;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class b$c extends InputStream	// class@001ff1
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public int available(){
       return (int)Math.min(this.b.p(), (long)Integer.MAX_VALUE);
    }
    public void close(){
    }
    public int read(){
       int i = (this.b.p() > 0)? this.b.readByte() & 0x00ff: -1;
       return i;
    }
    public int read(byte[] p0,int p1,int p2){
       a.q(p0, "sink");
       return this.b.read(p0, p1, p2);
    }
    public String toString(){
       return this.b+".inputStream\(\)";
    }
}
