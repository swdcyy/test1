package okhttp3.internal.http1.Http1Codec$UnknownLengthSource;
import okhttp3.internal.http1.Http1Codec$AbstractSource;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http1.Http1Codec$1;
import java.io.IOException;
import okio.b;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class Http1Codec$UnknownLengthSource extends Http1Codec$AbstractSource	// class@001f94
{
    public boolean inputExhausted;
    public final Http1Codec this$0;

    public void Http1Codec$UnknownLengthSource(Http1Codec p0){
       this.this$0 = p0;
       super(p0, null);
    }
    public void close(){
       if (this.closed != null) {
          return;
       }
       if (this.inputExhausted == null) {
          this.endOfInput(false, null);
       }
       this.closed = true;
       return;
    }
    public long read(b p0,long p1){
       if (p1 - null < 0) {
          throw new IllegalArgumentException("byteCount < 0: "+p1);
       }
       if (this.closed != null) {
          throw new IllegalStateException("closed");
       }
       if (this.inputExhausted != null) {
          return -1;
       }
       long l = super.read(p0, p1);
       if (l - -1) {
          return l;
       }
       this.inputExhausted = true;
       this.endOfInput(true, null);
       return -1;
    }
}
