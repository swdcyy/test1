package okhttp3.internal.http2.Http2Codec$StreamFinishingSource;
import okio.g;
import okhttp3.internal.http2.Http2Codec;
import okio.n;
import java.io.IOException;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.StreamAllocation;
import okio.b;

public class Http2Codec$StreamFinishingSource extends g	// class@001f9e
{
    public long bytesRead;
    public boolean completed;
    public final Http2Codec this$0;

    public void Http2Codec$StreamFinishingSource(Http2Codec p0,n p1){
       this.this$0 = p0;
       super(p1);
       this.completed = false;
       this.bytesRead = 0;
    }
    public void close(){
       super.close();
       this.endOfInput(null);
    }
    public final void endOfInput(IOException p0){
       if (this.completed != null) {
          return;
       }
       this.completed = true;
       Http2Codec$StreamFinishingSource tthis$0 = this.this$0;
       tthis$0.streamAllocation.streamFinished(false, tthis$0, this.bytesRead, p0);
       return;
    }
    public long read(b p0,long p1){
       try{
          long l = this.delegate().read(p0, p1);
          if (l - null > 0) {
             this.bytesRead = this.bytesRead + l;
          }
          return l;
       }catch(java.io.IOException e3){
          this.endOfInput(e3);
          throw e3;
       }
    }
}
