package l0.g;
import java.io.OutputStream;
import java.io.IOException;
import java.lang.String;
import aegon.chrome.net.o;

public abstract class g extends OutputStream	// class@0024e7
{
    public IOException b;
    public boolean c;
    public boolean d;

    public void g(){
       super();
    }
    public void a(){
       g tb = this.b;
       if (tb == null) {
          return;
       }
       throw tb;
    }
    public void c(){
       if (this.d == null) {
          if (this.c == null) {
             return;
          }
          throw new IOException("Stream has been closed.");
       }else {
          this.a();
          throw new IOException("Writing after request completed.");
       }
    }
    public void close(){
       this.c = true;
    }
    public abstract void e();
    public abstract o f();
    public abstract void g();
}
