package okhttp3.ResponseBody$1;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import okio.d;

public class ResponseBody$1 extends ResponseBody	// class@002094
{
    public final d val$content;
    public final long val$contentLength;
    public final MediaType val$contentType;

    public void ResponseBody$1(MediaType p0,long p1,d p2){
       this.val$contentType = p0;
       this.val$contentLength = p1;
       this.val$content = p2;
       super();
    }
    public long contentLength(){
       return this.val$contentLength;
    }
    public MediaType contentType(){
       return this.val$contentType;
    }
    public d source(){
       return this.val$content;
    }
}
