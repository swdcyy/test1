package okhttp3.internal.huc.BufferedRequestBody;
import okhttp3.internal.huc.OutputStreamRequestBody;
import okio.b;
import okio.c;
import okhttp3.Request;
import java.lang.String;
import java.io.OutputStream;
import okhttp3.Request$Builder;
import java.lang.Long;

public final class BufferedRequestBody extends OutputStreamRequestBody	// class@001fbe
{
    public final b buffer;
    public long contentLength;

    public void BufferedRequestBody(long p0){
       super();
       b uob = new b();
       this.buffer = uob;
       this.contentLength = -1;
       this.initOutputStream(uob, p0);
    }
    public long contentLength(){
       return this.contentLength;
    }
    public Request prepareToSendRequest(Request p0){
       if (p0.header("Content-Length") != null) {
          return p0;
       }
       this.outputStream().close();
       this.contentLength = this.buffer.p();
       return p0.newBuilder().removeHeader("Transfer-Encoding").header("Content-Length", Long.toString(this.buffer.p())).build();
    }
    public void writeTo(c p0){
       this.buffer.f(p0.buffer(), 0, this.buffer.p());
    }
}
