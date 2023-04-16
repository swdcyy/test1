package okhttp3.internal.huc.OutputStreamRequestBody$1;
import java.io.OutputStream;
import okhttp3.internal.huc.OutputStreamRequestBody;
import okio.c;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.lang.String;
import okio.m;
import java.net.SocketTimeoutException;
import java.io.InterruptedIOException;
import java.io.IOException;

public class OutputStreamRequestBody$1 extends OutputStream	// class@001fc5
{
    public long bytesReceived;
    public final OutputStreamRequestBody this$0;
    public final long val$expectedContentLength;
    public final c val$sink;

    public void OutputStreamRequestBody$1(OutputStreamRequestBody p0,long p1,c p2){
       this.this$0 = p0;
       this.val$expectedContentLength = p1;
       this.val$sink = p2;
       super();
    }
    public void close(){
       this.this$0.closed = true;
       OutputStreamRequestBody$1 tval$expecte = this.val$expectedContentLength;
       if (tval$expecte - -1 && this.bytesReceived - tval$expecte < 0) {
          throw new ProtocolException("expected "+this.val$expectedContentLength+" bytes but received "+this.bytesReceived);
       }
       this.val$sink.close();
       return;
    }
    public void flush(){
       if (this.this$0.closed != null) {
          return;
       }
       this.val$sink.flush();
       return;
    }
    public void write(int p0){
       byte[] uobyteArray = new byte[]{(byte)p0};
       this.write(uobyteArray, 0, 1);
    }
    public void write(byte[] p0,int p1,int p2){
       if (this.this$0.closed != null) {
          throw new IOException("closed");
       }
       OutputStreamRequestBody$1 tval$expecte = this.val$expectedContentLength;
       if (tval$expecte - -1 && (this.bytesReceived + (long)p2) - tval$expecte > 0) {
          throw new ProtocolException("expected "+this.val$expectedContentLength+" bytes but received "+this.bytesReceived+p2);
       }
       this.bytesReceived = this.bytesReceived + (long)p2;
       try{
          this.val$sink.write(p0, p1, p2);
          return;
       }catch(java.io.InterruptedIOException e7){
          throw new SocketTimeoutException(e7.getMessage());
       }
    }
}
