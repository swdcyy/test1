package okhttp3.internal.http2.Http2Reader$ContinuationSource;
import okio.n;
import okio.d;
import java.lang.Object;
import okio.b;
import java.lang.Math;
import okhttp3.internal.http2.Http2Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.String;
import okhttp3.internal.http2.Http2;
import java.io.IOException;
import java.lang.Byte;
import okio.o;

public final class Http2Reader$ContinuationSource implements n	// class@001fb0
{
    public byte flags;
    public int left;
    public int length;
    public short padding;
    public final d source;
    public int streamId;

    public void Http2Reader$ContinuationSource(d p0){
       super();
       this.source = p0;
    }
    public void close(){
    }
    public long read(b p0,long p1){
       while (true) {
          Http2Reader$ContinuationSource tleft = this.left;
          if (tleft == null) {
             this.source.skip((long)this.padding);
             this.padding = 0;
             int i = this.flags & 0x04;
             if (i) {
                break ;
             }else {
                this.readContinuationHeader();
             }
          }else {
             long l = this.source.read(p0, Math.min(p1, (long)tleft));
             if (!l - -1) {
                return -1;
             }
             this.left = (int)((long)this.left - l);
             return l;
          }
       }
       return -1;
    }
    public final void readContinuationHeader(){
       Object[] objArray;
       Http2Reader$ContinuationSource tstreamId = this.streamId;
       byte i = Http2Reader.readMedium(this.source);
       this.left = i;
       this.length = i;
       i = (byte)(this.source.readByte() & 0x00ff);
       this.flags = (byte)(this.source.readByte() & 0x00ff);
       Logger logger = Http2Reader.logger;
       if (logger.isLoggable(Level.FINE)) {
          logger.fine(Http2.frameLog(true, this.streamId, this.length, i, this.flags));
       }
       int i1 = this.source.readInt() & Integer.MAX_VALUE;
       this.streamId = i1;
       if (i == 9) {
          if (i1 == tstreamId) {
             return;
          }else {
             objArray = new Object[0];
             throw Http2.ioException("TYPE_CONTINUATION streamId changed", objArray);
          }
       }else {
          objArray = new Object[true];
          objArray[0] = Byte.valueOf(i);
          throw Http2.ioException("%s != TYPE_CONTINUATION", objArray);
       }
    }
    public o timeout(){
       return this.source.timeout();
    }
}
