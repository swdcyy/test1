package okhttp3.RequestBody$1;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okio.ByteString;
import okio.c;

public class RequestBody$1 extends RequestBody	// class@001f5e
{
    public final ByteString val$content;
    public final MediaType val$contentType;

    public void RequestBody$1(MediaType p0,ByteString p1){
       this.val$contentType = p0;
       this.val$content = p1;
       super();
    }
    public long contentLength(){
       return (long)this.val$content.size();
    }
    public MediaType contentType(){
       return this.val$contentType;
    }
    public void writeTo(c p0){
       p0.Y0(this.val$content);
    }
}
