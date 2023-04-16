package okhttp3.Cache$CacheResponseBody;
import okhttp3.ResponseBody;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import java.lang.String;
import okio.n;
import okhttp3.Cache$CacheResponseBody$1;
import okio.d;
import okio.l;
import java.lang.Long;
import okhttp3.MediaType;

public class Cache$CacheResponseBody extends ResponseBody	// class@001f34
{
    public final d bodySource;
    public final String contentLength;
    public final String contentType;
    public final DiskLruCache$Snapshot snapshot;

    public void Cache$CacheResponseBody(DiskLruCache$Snapshot p0,String p1,String p2){
       super();
       this.snapshot = p0;
       this.contentType = p1;
       this.contentLength = p2;
       this.bodySource = l.d(new Cache$CacheResponseBody$1(this, p0.getSource(1), p0));
    }
    public long contentLength(){
       long l = -1;
       try{
          Cache$CacheResponseBody tcontentLeng = this.contentLength;
          if (tcontentLeng != null) {
             l = Long.parseLong(tcontentLeng);
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public MediaType contentType(){
       Cache$CacheResponseBody tcontentType = this.contentType;
       MediaType mediaType = (tcontentType != null)? MediaType.parse(tcontentType): null;
       return mediaType;
    }
    public d source(){
       return this.bodySource;
    }
}
