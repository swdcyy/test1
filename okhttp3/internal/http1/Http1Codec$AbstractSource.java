package okhttp3.internal.http1.Http1Codec$AbstractSource;
import okio.n;
import okhttp3.internal.http1.Http1Codec;
import java.lang.Object;
import okio.h;
import okio.o;
import okhttp3.internal.http1.Http1Codec$1;
import java.io.IOException;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.StreamAllocation;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import okio.b;

public abstract class Http1Codec$AbstractSource implements n	// class@0020c0
{
    public long bytesRead;
    public boolean closed;
    public final Http1Codec this$0;
    public final h timeout;

    public void Http1Codec$AbstractSource(Http1Codec p0){
       this.this$0 = p0;
       super();
       this.timeout = new h(p0.source.timeout());
       this.bytesRead = 0;
    }
    public void Http1Codec$AbstractSource(Http1Codec p0,Http1Codec$1 p1){
       super(p0);
    }
    public final void endOfInput(boolean p0,IOException p1){
       Http1Codec$AbstractSource tthis$0 = this.this$0;
       Http1Codec state = tthis$0.state;
       if (state == 6) {
          return;
       }
       if (state != 5) {
          throw new IllegalStateException("state: "+this.this$0.state);
       }
       tthis$0.detachTimeout(this.timeout);
       Http1Codec$AbstractSource tthis$01 = this.this$0;
       tthis$01.state = 6;
       Http1Codec streamAlloca = tthis$01.streamAllocation;
       if (streamAlloca != null) {
          streamAlloca.streamFinished((p0 ^ 0x01), tthis$01, this.bytesRead, p1);
       }
       return;
    }
    public long read(b p0,long p1){
       try{
          long l = this.this$0.source.read(p0, p1);
          if (l - null > 0) {
             this.bytesRead = this.bytesRead + l;
          }
          return l;
       }catch(java.io.IOException e3){
          this.endOfInput(false, e3);
          throw e3;
       }
    }
    public o timeout(){
       return this.timeout;
    }
}
