package gb.b;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.Object;
import java.util.Objects;
import java.io.IOException;
import java.lang.String;

public class b extends FilterInputStream	// class@002093
{
    public final byte[] b;
    public int c;
    public int d;

    public void b(InputStream p0,byte[] p1){
       super(p0);
       Objects.requireNonNull(p1);
       this.b = p1;
    }
    public final int a(){
       b tc = this.c;
       b tb = this.b;
       if (tc >= tb.length) {
          return -1;
       }
       this.c = tc + 1;
       return (tb[tc] & 0x00ff);
    }
    public void mark(int p0){
       if (this.in.markSupported()) {
          super.mark(p0);
          this.d = this.c;
       }
       return;
    }
    public int read(){
       int i = this.in.read();
       if (i != -1) {
          return i;
       }
       return this.a();
    }
    public int read(byte[] p0){
       return this.read(p0, 0, p0.length);
    }
    public int read(byte[] p0,int p1,int p2){
       int i = this.in.read(p0, p1, p2);
       int i1 = -1;
       if (i != i1) {
          return i;
       }
       i = 0;
       if (!p2) {
          return i;
       }
       for (; i < p2; i = i + 1) {
          int i2 = this.a();
          if (i2 == i1) {
             break ;
          }else {
             int i3 = p1 + i;
             p0[i3] = (byte)i2;
          }
       }
       if (i > 0) {
          i1 = i;
       }
       return i1;
    }
    public void reset(){
       if (!this.in.markSupported()) {
          throw new IOException("mark is not supported");
       }
       this.in.reset();
       this.c = this.d;
       return;
    }
}
