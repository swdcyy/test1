package gb.a;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Math;
import java.io.IOException;

public class a extends FilterInputStream	// class@002092
{
    public int b;
    public int c;

    public void a(InputStream p0,int p1){
       super(p0);
       if (p1 < 0) {
          throw new IllegalArgumentException("limit must be >= 0");
       }
       this.b = p1;
       this.c = -1;
       return;
    }
    public int available(){
       return Math.min(this.in.available(), this.b);
    }
    public void mark(int p0){
       if (this.in.markSupported()) {
          this.in.mark(p0);
          this.c = this.b;
       }
       return;
    }
    public int read(){
       int i = -1;
       if (this.b == null) {
          return i;
       }
       int i1 = this.in.read();
       if (i1 != i) {
          this.b = this.b - 1;
       }
       return i1;
    }
    public int read(byte[] p0,int p1,int p2){
       a tb = this.b;
       if (tb == null) {
          return -1;
       }
       int i = this.in.read(p0, p1, Math.min(p2, tb));
       if (i > 0) {
          this.b = this.b - i;
       }
       return i;
    }
    public void reset(){
       if (!this.in.markSupported()) {
          throw new IOException("mark is not supported");
       }
       if (this.c == -1) {
          throw new IOException("mark not set");
       }
       this.in.reset();
       this.b = this.c;
       return;
    }
    public long skip(long p0){
       p0 = this.in.skip(Math.min(p0, (long)this.b));
       this.b = (int)((long)this.b - p0);
       return p0;
    }
}
