package ojd.g;
import okhttp3.RequestBody;
import ojd.f;
import java.lang.Object;
import okhttp3.MediaType;
import java.io.InputStream;
import okio.c;
import java.lang.Math;
import java.io.InterruptedIOException;
import java.lang.String;
import ekd.p;

public abstract class g extends RequestBody	// class@001f24
{
    public final f a;
    public final Object b;
    public final long c;
    public final long d;
    public final MediaType e;

    public void g(f p0,Object p1,long p2,long p3,MediaType p4){
       super();
       this.a = p0;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.b = p1;
    }
    public abstract InputStream a();
    public long contentLength(){
       return this.d;
    }
    public MediaType contentType(){
       return this.e;
    }
    public void writeTo(c p0){
       int i = 4096;
       byte[] uobyteArray = new byte[i];
       InputStream inputStream = this.a();
       inputStream.skip(this.c);
       int i1 = (int)this.contentLength();
       int i2 = 0;
       while (true) {
          int i3 = i1 - i2;
          i3 = inputStream.read(uobyteArray, 0, Math.min(i, i3));
          if (i3 > 0) {
             p0.write(uobyteArray, 0, i3);
             i2 = i2 + i3;
             g ta = this.a;
             if (ta == null || !ta.a(i2, i1, this.b)) {
                continue ;
             }else {
                break ;
             }
          }else {
             p.c(inputStream);
             return;
          }
       }
       throw new InterruptedIOException("User cancelled");
    }
}
