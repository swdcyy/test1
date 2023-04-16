package cud.j$a;
import java.io.OutputStream;
import cud.j;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import okio.b;
import okio.c;
import java.io.IOException;
import kotlin.jvm.internal.a;

public final class j$a extends OutputStream	// class@000c8d
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void close(){
       this.b.close();
    }
    public void flush(){
       j$a tb = this.b;
       if (tb.c == null) {
          tb.flush();
       }
       return;
    }
    public String toString(){
       return this.b+".outputStream\(\)";
    }
    public void write(int p0){
       j$a tb = this.b;
       if (tb.c != null) {
          throw new IOException("closed");
       }
       tb.b.y((byte)p0);
       this.b.emitCompleteSegments();
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       a.q(p0, "data");
       j$a tb = this.b;
       if (tb.c != null) {
          throw new IOException("closed");
       }
       tb.b.x(p0, p1, p2);
       this.b.emitCompleteSegments();
       return;
    }
}
