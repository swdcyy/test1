package l0.f;
import java.io.InputStream;
import l0.d;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import aegon.chrome.net.q;
import java.net.HttpURLConnection;
import l0.i;
import java.lang.Math;
import java.lang.IndexOutOfBoundsException;

public class f extends InputStream	// class@0024e6
{
    public final d b;
    public boolean c;
    public ByteBuffer d;
    public IOException e;

    public void f(d p0){
       super();
       this.b = p0;
    }
    public final void a(){
       f te;
       if (this.c != null) {
          te = this.e;
          if (te == null) {
             return;
          }else {
             throw te;
          }
       }else if(!this.c()){
          if (this.d == null) {
             this.d = ByteBuffer.allocateDirect(0x8000);
          }
          this.d.clear();
          te = this.b;
          te.c.e(this.d);
          te.b.b(te.getReadTimeout());
          te = this.e;
          if (te == null) {
             te = this.d;
             if (te != null) {
                te.flip();
             }
          }else {
             throw te;
          }
       }
       return;
    }
    public int available(){
       if (this.c != null) {
          f te = this.e;
          if (te == null) {
             return 0;
          }
          throw te;
       }else if(this.c()){
          return this.d.remaining();
       }else {
          return 0;
       }
    }
    public final boolean c(){
       f td = this.d;
       boolean b = (td != null && td.hasRemaining())? true: false;
       return b;
    }
    public int read(){
       this.a();
       if (this.c()) {
          return (this.d.get() & 0x00ff);
       }
       return -1;
    }
    public int read(byte[] p0,int p1,int p2){
       if (p1 < 0 || (p2 < 0 || (p1 + p2) > p0.length)) {
          throw new IndexOutOfBoundsException();
       }
       if (!p2) {
          return 0;
       }
       this.a();
       if (!this.c()) {
          return -1;
       }
       p2 = Math.min((this.d.limit() - this.d.position()), p2);
       this.d.get(p0, p1, p2);
       return p2;
    }
}
