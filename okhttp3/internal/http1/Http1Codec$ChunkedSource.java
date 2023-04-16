package okhttp3.internal.http1.Http1Codec$ChunkedSource;
import okhttp3.internal.http1.Http1Codec$AbstractSource;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.HttpUrl;
import okhttp3.internal.http1.Http1Codec$1;
import java.util.concurrent.TimeUnit;
import okio.n;
import okhttp3.internal.Util;
import java.io.IOException;
import okio.b;
import java.lang.Math;
import java.net.ProtocolException;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import okio.d;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;
import java.lang.NumberFormatException;

public class Http1Codec$ChunkedSource extends Http1Codec$AbstractSource	// class@0020c2
{
    public long bytesRemainingInChunk;
    public boolean hasMoreChunks;
    public final Http1Codec this$0;
    public final HttpUrl url;

    public void Http1Codec$ChunkedSource(Http1Codec p0,HttpUrl p1){
       this.this$0 = p0;
       super(p0, null);
       this.bytesRemainingInChunk = -1;
       this.hasMoreChunks = true;
       this.url = p1;
    }
    public void close(){
       if (this.closed != null) {
          return;
       }
       if (this.hasMoreChunks != null && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
          this.endOfInput(false, null);
       }
       this.closed = true;
       return;
    }
    public long read(b p0,long p1){
       Http1Codec$ChunkedSource uChunkedSour = null;
       if (p1 - uChunkedSour < 0) {
          throw new IllegalArgumentException("byteCount < 0: "+p1);
       }
       if (this.closed != null) {
          throw new IllegalStateException("closed");
       }
       if (this.hasMoreChunks == null) {
          return -1;
       }
       Http1Codec$ChunkedSource tbytesRemain = this.bytesRemainingInChunk;
       if (!tbytesRemain - uChunkedSour || !tbytesRemain - -1) {
          this.readChunkSize();
          if (this.hasMoreChunks == null) {
             return -1;
          }
       }
       long l = super.read(p0, Math.min(p1, this.bytesRemainingInChunk));
       if (l - -1) {
          this.bytesRemainingInChunk = this.bytesRemainingInChunk - l;
          return l;
       }else {
          ProtocolException protocolExce = new ProtocolException("unexpected end of stream");
          this.endOfInput(false, protocolExce);
          throw protocolExce;
       }
    }
    public final void readChunkSize(){
       if (this.bytesRemainingInChunk - -1) {
          this.this$0.source.readUtf8LineStrict();
       }
       try{
          this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
          String str = (this.this$0.source.readUtf8LineStrict()).trim();
          String str1 = null;
          if (this.bytesRemainingInChunk - str1 >= 0 && (str.isEmpty() || str.startsWith(";"))) {
             if (!this.bytesRemainingInChunk - str1) {
                this.hasMoreChunks = false;
                HttpHeaders.receiveHeaders(this.this$0.client.cookieJar(), this.url, this.this$0.readHeaders());
                this.endOfInput(true, null);
             }
             return;
          }else {
             throw new ProtocolException("expected chunk size and optional extensions but was \""+this.bytesRemainingInChunk+str+"\"");
          }
       }catch(java.lang.NumberFormatException e0){
          throw new ProtocolException(e0.getMessage());
       }
    }
}
