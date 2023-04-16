package okhttp3.internal.http1.Http1Codec$FixedLengthSink;
import okio.m;
import okhttp3.internal.http1.Http1Codec;
import java.lang.Object;
import okio.h;
import okio.o;
import java.net.ProtocolException;
import java.lang.String;
import okio.c;
import okio.b;
import okhttp3.internal.Util;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public final class Http1Codec$FixedLengthSink implements m	// class@0020c3
{
    public long bytesRemaining;
    public boolean closed;
    public final Http1Codec this$0;
    public final h timeout;

    public void Http1Codec$FixedLengthSink(Http1Codec p0,long p1){
       this.this$0 = p0;
       super();
       this.timeout = new h(p0.sink.timeout());
       this.bytesRemaining = p1;
    }
    public void close(){
       if (this.closed != null) {
          return;
       }
       this.closed = true;
       if (this.bytesRemaining > 0) {
          throw new ProtocolException("unexpected end of stream");
       }
       this.this$0.detachTimeout(this.timeout);
       this.this$0.state = 3;
       return;
    }
    public void flush(){
       if (this.closed != null) {
          return;
       }
       this.this$0.sink.flush();
       return;
    }
    public o timeout(){
       return this.timeout;
    }
    public void write(b p0,long p1){
       if (this.closed != null) {
          throw new IllegalStateException("closed");
       }
       Util.checkOffsetAndCount(p0.p(), 0, p1);
       if (p1 - this.bytesRemaining > 0) {
          throw new ProtocolException("expected "+this.bytesRemaining+" bytes but received "+p1);
       }
       this.this$0.sink.write(p0, p1);
       this.bytesRemaining = this.bytesRemaining - p1;
       return;
    }
}
