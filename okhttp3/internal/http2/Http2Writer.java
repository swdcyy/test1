package okhttp3.internal.http2.Http2Writer;
import java.io.Closeable;
import okhttp3.internal.http2.Http2;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import okio.c;
import java.lang.Object;
import okio.b;
import okhttp3.internal.http2.Hpack$Writer;
import okhttp3.internal.http2.Settings;
import java.io.IOException;
import okio.m;
import java.util.logging.Level;
import okio.ByteString;
import okhttp3.internal.Util;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import okhttp3.internal.http2.ErrorCode;
import java.util.List;
import java.lang.Math;
import java.lang.Long;

public final class Http2Writer implements Closeable	// class@001fb7
{
    public final boolean client;
    public boolean closed;
    public final b hpackBuffer;
    public final Hpack$Writer hpackWriter;
    public int maxFrameSize;
    public final c sink;
    public static final Logger logger;

    static {
       Http2Writer.logger = Logger.getLogger(Http2.class.getName());
    }
    public void Http2Writer(c p0,boolean p1){
       super();
       this.sink = p0;
       this.client = p1;
       b uob = new b();
       this.hpackBuffer = uob;
       this.hpackWriter = new Hpack$Writer(uob);
       this.maxFrameSize = 0x4000;
    }
    public static void writeMedium(c p0,int p1){
       p0.writeByte(((p1 >> 16) & 0x00ff));
       p0.writeByte(((p1 >> 8) & 0x00ff));
       p0.writeByte((p1 & 0x00ff));
    }
    public synchronized void applyAndAckSettings(Settings p0){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.maxFrameSize = p0.getMaxFrameSize(this.maxFrameSize);
       if (p0.getHeaderTableSize() != -1) {
          this.hpackWriter.setHeaderTableSizeSetting(p0.getHeaderTableSize());
       }
       this.frameHeader(0, 0, 4, 1);
       this.sink.flush();
       return;
    }
    public synchronized void close(){
       this.closed = true;
       this.sink.close();
    }
    public synchronized void connectionPreface(){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       if (this.client == null) {
          return;
       }
       Logger logger = Http2Writer.logger;
       if (logger.isLoggable(Level.FINE)) {
          Object[] objArray = new Object[]{Http2.CONNECTION_PREFACE.hex()};
          logger.fine(Util.format(">> CONNECTION %s", objArray));
       }
       this.sink.write(Http2.CONNECTION_PREFACE.toByteArray());
       this.sink.flush();
       return;
    }
    public synchronized void data(boolean p0,int p1,b p2,int p3){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       byte b = 0;
       if (p0) {
          b = (byte)1;
       }
       this.dataFrame(p1, b, p2, p3);
       return;
    }
    public void dataFrame(int p0,byte p1,b p2,int p3){
       this.frameHeader(p0, p3, 0, p1);
       if (p3 > 0) {
          this.sink.write(p2, (long)p3);
       }
       return;
    }
    public synchronized void flush(){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.sink.flush();
       return;
    }
    public void frameHeader(int p0,int p1,byte p2,byte p3){
       Logger logger = Http2Writer.logger;
       if (logger.isLoggable(Level.FINE)) {
          logger.fine(Http2.frameLog(false, p0, p1, p2, p3));
       }
       Http2Writer tmaxFrameSiz = this.maxFrameSize;
       if (p1 <= tmaxFrameSiz) {
          if (!(Integer.MIN_VALUE & p0)) {
             Http2Writer.writeMedium(this.sink, p1);
             this.sink.writeByte((p2 & 0x00ff));
             this.sink.writeByte((p3 & 0x00ff));
             this.sink.writeInt((p0 & Integer.MAX_VALUE));
             return;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(p0)};
             throw Http2.illegalArgument("reserved bit set: %s", objArray);
          }
       }else {
          Object[] objArray1 = new Object[]{Integer.valueOf(tmaxFrameSiz),Integer.valueOf(p1)};
          throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", objArray1);
       }
    }
    public synchronized void goAway(int p0,ErrorCode p1,byte[] p2){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       if (p1.httpCode != -1) {
          this.frameHeader(0, (p2.length + 8), 7, 0);
          this.sink.writeInt(p0);
          this.sink.writeInt(p1.httpCode);
          if (p2.length > 0) {
             this.sink.write(p2);
          }
          this.sink.flush();
          return;
       }else {
          Object[] objArray = new Object[0];
          throw Http2.illegalArgument("errorCode.httpCode == -1", objArray);
       }
    }
    public synchronized void headers(int p0,List p1){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.headers(false, p0, p1);
       return;
    }
    public void headers(boolean p0,int p1,List p2){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.hpackWriter.writeHeaders(p2);
       long l = this.hpackBuffer.p();
       int i = (int)Math.min((long)this.maxFrameSize, l);
       long l1 = (long)i;
       int i1 = (!(v4 = l - l1))? 4: 0;
       if (p0) {
          i1 = (byte)(i1 | 0x01);
       }
       this.frameHeader(p1, i, 1, i1);
       this.sink.write(this.hpackBuffer, l1);
       if (v4 > 0) {
          this.writeContinuationFrames(p1, (l - l1));
       }
       return;
    }
    public int maxDataLength(){
       return this.maxFrameSize;
    }
    public synchronized void ping(boolean p0,int p1,int p2){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       byte b = (p0)? 1: 0;
       this.frameHeader(0, 8, 6, b);
       this.sink.writeInt(p1);
       this.sink.writeInt(p2);
       this.sink.flush();
       return;
    }
    public synchronized void pushPromise(int p0,int p1,List p2){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.hpackWriter.writeHeaders(p2);
       long l = this.hpackBuffer.p();
       int i = 4;
       int i1 = (int)Math.min((long)(this.maxFrameSize - i), l);
       long l1 = (long)i1;
       byte b = (!(v6 = l - l1))? 4: 0;
       this.frameHeader(p0, (i1 + i), 5, b);
       this.sink.writeInt((p1 & Integer.MAX_VALUE));
       this.sink.write(this.hpackBuffer, l1);
       if (v6 > 0) {
          this.writeContinuationFrames(p0, (l - l1));
       }
       return;
    }
    public synchronized void rstStream(int p0,ErrorCode p1){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       if (p1.httpCode == -1) {
          throw new IllegalArgumentException();
       }
       this.frameHeader(p0, 4, 3, 0);
       this.sink.writeInt(p1.httpCode);
       this.sink.flush();
       return;
    }
    public synchronized void settings(Settings p0){
       int i1;
       if (this.closed != null) {
          throw new IOException("closed");
       }
       int i = 0;
       this.frameHeader(i, (p0.size() * 6), 4, i);
       while (i < 10) {
          if (p0.isSet(i)) {
             if (i == 4) {
                i1 = 3;
             }else if(i == 7){
                i1 = 4;
             }else {
                i1 = i;
             }
             this.sink.writeShort(i1);
             this.sink.writeInt(p0.get(i));
          }
          i = i + 1;
       }
       this.sink.flush();
       return;
    }
    public synchronized void synReply(boolean p0,int p1,List p2){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.headers(p0, p1, p2);
       return;
    }
    public synchronized void synStream(boolean p0,int p1,int p2,List p3){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.headers(p0, p1, p3);
       return;
    }
    public synchronized void windowUpdate(int p0,long p1){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       if (p1 && p1 - 0x7fffffff <= 0) {
          this.frameHeader(p0, 4, 8, 0);
          this.sink.writeInt((int)p1);
          this.sink.flush();
          return;
       }else {
          Object[] objArray = new Object[]{Long.valueOf(p1)};
          throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArray);
       }
    }
    public final void writeContinuationFrames(int p0,long p1){
       byte i = 0;
       while (p1 - i > 0) {
          int i1 = (int)Math.min((long)this.maxFrameSize, p1);
          long l = (long)i1;
          p1 = p1 - l;
          byte b = 9;
          i = (!p1 - i)? 4: 0;
          this.frameHeader(p0, i1, b, i);
          this.sink.write(this.hpackBuffer, l);
       }
       return;
    }
}
