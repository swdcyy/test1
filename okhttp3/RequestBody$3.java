package okhttp3.RequestBody$3;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import java.io.File;
import okio.c;
import okio.n;
import okio.l;
import java.io.Closeable;
import okhttp3.internal.Util;

public class RequestBody$3 extends RequestBody	// class@001f5f
{
    public final MediaType val$contentType;
    public final File val$file;

    public void RequestBody$3(MediaType p0,File p1){
       this.val$contentType = p0;
       this.val$file = p1;
       super();
    }
    public long contentLength(){
       return this.val$file.length();
    }
    public MediaType contentType(){
       return this.val$contentType;
    }
    public void writeTo(c p0){
       n on = l.j(this.val$file);
       p0.x1(on);
       Util.closeQuietly(on);
    }
}
