package okhttp3.ResponseBody;
import java.io.Closeable;
import java.lang.Object;
import okhttp3.MediaType;
import okio.d;
import java.lang.String;
import java.util.Objects;
import okhttp3.ResponseBody$1;
import okhttp3.internal.Util;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import okio.b;
import okio.ByteString;
import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import okhttp3.ResponseBody$BomAwareReader;

public abstract class ResponseBody implements Closeable	// class@002096
{
    public Reader reader;

    public void ResponseBody(){
       super();
    }
    public static ResponseBody create(MediaType p0,long p1,d p2){
       Objects.requireNonNull(p2, "source == null");
       return new ResponseBody$1(p0, p1, p2);
    }
    public static ResponseBody create(MediaType p0,String p1){
       Charset uTF_8 = Util.UTF_8;
       if (p0 != null) {
          Charset uCharset = p0.charset();
          if (uCharset == null) {
             p0 = MediaType.parse(p0+"; charset=utf-8");
          }else {
             uTF_8 = uCharset;
          }
       }
       b uob = new b().O(p1, uTF_8);
       return ResponseBody.create(p0, uob.p(), uob);
    }
    public static ResponseBody create(MediaType p0,ByteString p1){
       b uob = new b();
       uob.u(p1);
       return ResponseBody.create(p0, (long)p1.size(), uob);
    }
    public static ResponseBody create(MediaType p0,byte[] p1){
       b uob = new b();
       uob.v(p1);
       return ResponseBody.create(p0, (long)p1.length, uob);
    }
    public final InputStream byteStream(){
       return this.source().inputStream();
    }
    public final byte[] bytes(){
       long l = this.contentLength();
       if (l - 0x7fffffff > 0) {
          throw new IOException("Cannot buffer entire body for content length: "+l);
       }
       d uod = this.source();
       byte[] uobyteArray = uod.readByteArray();
       Util.closeQuietly(uod);
       if (!l - -1 || !l - (long)uobyteArray.length) {
          return uobyteArray;
       }
       throw new IOException("Content-Length \("+l+"\) and stream length \("+uobyteArray.length+"\) disagree");
    }
    public final Reader charStream(){
       ResponseBody treader = this.reader;
       if (treader != null) {
       }else {
          treader = new ResponseBody$BomAwareReader(this.source(), this.charset());
          this.reader = treader;
       }
       return treader;
    }
    public final Charset charset(){
       MediaType mediaType = this.contentType();
       Charset uCharset = (mediaType != null)? mediaType.charset(Util.UTF_8): Util.UTF_8;
       return uCharset;
    }
    public void close(){
       Util.closeQuietly(this.source());
    }
    public abstract long contentLength();
    public abstract MediaType contentType();
    public abstract d source();
    public final String string(){
       d uod = this.source();
       Util.closeQuietly(uod);
       return uod.readString(Util.bomAwareCharset(uod, this.charset()));
    }
}
