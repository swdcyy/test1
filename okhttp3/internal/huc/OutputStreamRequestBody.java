package okhttp3.internal.huc.OutputStreamRequestBody;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okio.c;
import okio.o;
import okio.m;
import okhttp3.internal.huc.OutputStreamRequestBody$1;
import java.io.OutputStream;
import okhttp3.Request;

public abstract class OutputStreamRequestBody extends RequestBody	// class@001fc6
{
    public boolean closed;
    public long expectedContentLength;
    public OutputStream outputStream;
    public o timeout;

    public void OutputStreamRequestBody(){
       super();
    }
    public long contentLength(){
       return this.expectedContentLength;
    }
    public final MediaType contentType(){
       return null;
    }
    public void initOutputStream(c p0,long p1){
       this.timeout = p0.timeout();
       this.expectedContentLength = p1;
       this.outputStream = new OutputStreamRequestBody$1(this, p1, p0);
    }
    public final boolean isClosed(){
       return this.closed;
    }
    public final OutputStream outputStream(){
       return this.outputStream;
    }
    public Request prepareToSendRequest(Request p0){
       return p0;
    }
    public final o timeout(){
       return this.timeout;
    }
}
