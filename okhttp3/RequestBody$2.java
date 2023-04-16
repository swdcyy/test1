package okhttp3.RequestBody$2;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okio.c;

public class RequestBody$2 extends RequestBody	// class@00208f
{
    public final int val$byteCount;
    public final byte[] val$content;
    public final MediaType val$contentType;
    public final int val$offset;

    public void RequestBody$2(MediaType p0,int p1,byte[] p2,int p3){
       this.val$contentType = p0;
       this.val$byteCount = p1;
       this.val$content = p2;
       this.val$offset = p3;
       super();
    }
    public long contentLength(){
       return (long)this.val$byteCount;
    }
    public MediaType contentType(){
       return this.val$contentType;
    }
    public void writeTo(c p0){
       p0.write(this.val$content, this.val$offset, this.val$byteCount);
    }
}
