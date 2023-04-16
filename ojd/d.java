package ojd.d;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import okio.b;
import java.io.InputStream;
import java.io.Closeable;
import ekd.p;
import okio.d;

public class d extends ResponseBody	// class@001f21
{
    public d b;
    public long c;
    public MediaType d;

    public void d(ResponseBody p0){
       super();
       MediaType mediaType = p0.contentType();
       try{
          this.d = mediaType;
          b uob = new b();
          uob.j(p0.byteStream());
          this.b = uob;
          this.c = uob.p();
          p.b(p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public long contentLength(){
       return this.c;
    }
    public MediaType contentType(){
       return this.d;
    }
    public d source(){
       return this.b;
    }
}
