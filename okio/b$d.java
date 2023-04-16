package okio.b$d;
import java.io.OutputStream;
import okio.b;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class b$d extends OutputStream	// class@001ff2
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void close(){
    }
    public void flush(){
    }
    public String toString(){
       return this.b+".outputStream\(\)";
    }
    public void write(int p0){
       this.b.y(p0);
    }
    public void write(byte[] p0,int p1,int p2){
       a.q(p0, "data");
       this.b.x(p0, p1, p2);
    }
}
