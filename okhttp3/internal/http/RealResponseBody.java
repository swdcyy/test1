package okhttp3.internal.http.RealResponseBody;
import okhttp3.ResponseBody;
import java.lang.String;
import okio.d;
import okhttp3.MediaType;

public final class RealResponseBody extends ResponseBody	// class@0020ba
{
    public final long contentLength;
    public final String contentTypeString;
    public final d source;

    public void RealResponseBody(String p0,long p1,d p2){
       super();
       this.contentTypeString = p0;
       this.contentLength = p1;
       this.source = p2;
    }
    public long contentLength(){
       return this.contentLength;
    }
    public MediaType contentType(){
       RealResponseBody tcontentType = this.contentTypeString;
       MediaType mediaType = (tcontentType != null)? MediaType.parse(tcontentType): null;
       return mediaType;
    }
    public d source(){
       return this.source;
    }
}
