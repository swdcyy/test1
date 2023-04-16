package okhttp3.internal.http1.Http1Codec$ChunkedSink;
import okio.m;
import okhttp3.internal.http1.Http1Codec;
import java.lang.Object;
import okio.h;
import okio.o;
import java.lang.String;
import okio.c;
import okio.b;
import java.lang.IllegalStateException;

public final class Http1Codec$ChunkedSink implements m	// class@001f93
{
    public boolean closed;
    public final Http1Codec this$0;
    public final h timeout;

    public void Http1Codec$ChunkedSink(Http1Codec p0){
       this.this$0 = p0;
       super();
       this.timeout = new h(p0.sink.timeout());
    }
    public synchronized void close(){
       if (this.closed != null) {
          return;
       }
       this.closed = true;
       this.this$0.sink.writeUtf8("0\r\n\r\n");
       this.this$0.detachTimeout(this.timeout);
       this.this$0.state = 3;
       return;
    }
    public synchronized void flush(){
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
       if (!p1 - null) {
          return;
       }
       this.this$0.sink.writeHexadecimalUnsignedLong(p1);
       this.this$0.sink.writeUtf8("\r\n");
       this.this$0.sink.write(p0, p1);
       this.this$0.sink.writeUtf8("\r\n");
       return;
    }
}
