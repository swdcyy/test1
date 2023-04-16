package okhttp3.RequestBody;
import java.lang.Object;
import okhttp3.MediaType;
import java.io.File;
import java.lang.String;
import java.util.Objects;
import okhttp3.RequestBody$3;
import okhttp3.internal.Util;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import okio.ByteString;
import okhttp3.RequestBody$1;
import okhttp3.RequestBody$2;
import okio.c;

public abstract class RequestBody	// class@002091
{

    public void RequestBody(){
       super();
    }
    public static RequestBody create(MediaType p0,File p1){
       Objects.requireNonNull(p1, "file == null");
       return new RequestBody$3(p0, p1);
    }
    public static RequestBody create(MediaType p0,String p1){
       Charset uTF_8 = Util.UTF_8;
       if (p0 != null) {
          Charset uCharset = p0.charset();
          if (uCharset == null) {
             p0 = MediaType.parse(p0+"; charset=utf-8");
          }else {
             uTF_8 = uCharset;
          }
       }
       return RequestBody.create(p0, p1.getBytes(uTF_8));
    }
    public static RequestBody create(MediaType p0,ByteString p1){
       return new RequestBody$1(p0, p1);
    }
    public static RequestBody create(MediaType p0,byte[] p1){
       return RequestBody.create(p0, p1, 0, p1.length);
    }
    public static RequestBody create(MediaType p0,byte[] p1,int p2,int p3){
       Objects.requireNonNull(p1, "content == null");
       Util.checkOffsetAndCount((long)p1.length, (long)p2, (long)p3);
       return new RequestBody$2(p0, p3, p1, p2);
    }
    public long contentLength(){
       return -1;
    }
    public abstract MediaType contentType();
    public abstract void writeTo(c p0);
}
