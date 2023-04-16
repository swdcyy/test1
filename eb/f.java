package eb.f;
import java.io.InputStream;
import com.facebook.common.memory.PooledByteBuffer;
import java.lang.Boolean;
import ab.e;
import java.lang.Object;
import java.lang.Math;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.String;

public class f extends InputStream	// class@001f13
{
    public final PooledByteBuffer b;
    public int c;
    public int d;

    public void f(PooledByteBuffer p0){
       super();
       e.a(Boolean.valueOf((p0.isClosed() ^ 0x01)));
       e.d(p0);
       this.b = p0;
       this.c = 0;
       this.d = 0;
    }
    public int available(){
       return (this.b.size() - this.c);
    }
    public void mark(int p0){
       this.d = this.c;
    }
    public boolean markSupported(){
       return true;
    }
    public int read(){
       if (this.available() <= 0) {
          return -1;
       }
       f tc = this.c;
       this.c = tc + 1;
       return (this.b.F(tc) & 0x00ff);
    }
    public int read(byte[] p0){
       return this.read(p0, 0, p0.length);
    }
    public int read(byte[] p0,int p1,int p2){
       if (p1 < 0 || (p2 < 0 || (p1 + p2) > p0.length)) {
          throw new ArrayIndexOutOfBoundsException("length="+p0.length+"; regionStart="+p1+"; regionLength="+p2);
       }
       int i = this.available();
       if (i <= 0) {
          return -1;
       }
       if (p2 <= 0) {
          return 0;
       }
       p2 = Math.min(i, p2);
       this.b.D(this.c, p0, p1, p2);
       this.c = this.c + p2;
       return p2;
    }
    public void reset(){
       this.c = this.d;
    }
    public long skip(long p0){
       boolean b = (p0 >= 0)? true: false;
       e.a(Boolean.valueOf(b));
       int i = Math.min((int)p0, this.available());
       this.c = this.c + i;
       return (long)i;
    }
}
