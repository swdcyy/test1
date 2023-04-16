package okhttp3.internal.http1.Http1Codec$FixedLengthSource;
import okhttp3.internal.http1.Http1Codec$AbstractSource;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http1.Http1Codec$1;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.n;
import okhttp3.internal.Util;
import okio.b;
import java.lang.Math;
import java.net.ProtocolException;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class Http1Codec$FixedLengthSource extends Http1Codec$AbstractSource	// class@0020c4
{
    public long bytesRemaining;
    public final Http1Codec this$0;

    public void Http1Codec$FixedLengthSource(Http1Codec p0,long p1){
       this.this$0 = p0;
       super(p0, null);
       this.bytesRemaining = p1;
       if (!p1) {
          this.endOfInput(true, null);
       }
       return;
    }
    public void close(){
       if (this.closed != null) {
          return;
       }
       if (this.bytesRemaining && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
          this.endOfInput(false, null);
       }
       this.closed = true;
       return;
    }
    public long read(b p0,long p1){
       StringBuilder str = null;
       if (p1 - str < 0) {
          throw new IllegalArgumentException("byteCount < 0: "+p1);
       }
       if (this.closed != null) {
          throw new IllegalStateException("closed");
       }
       Http1Codec$FixedLengthSource tbytesRemain = this.bytesRemaining;
       if (!tbytesRemain - str) {
          return -1;
       }
       long l = super.read(p0, Math.min(tbytesRemain, p1));
       if (l - -1) {
          long l1 = this.bytesRemaining - l;
          this.bytesRemaining = l1;
          if (!l1 - str) {
             this.endOfInput(true, null);
          }
          return l;
       }else {
          ProtocolException protocolExce = new ProtocolException("unexpected end of stream");
          this.endOfInput(false, protocolExce);
          throw protocolExce;
       }
    }
}
