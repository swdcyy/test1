package okhttp3.internal.http2.Http2Reader;
import java.io.Closeable;
import okhttp3.internal.http2.Http2;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import okio.d;
import java.lang.Object;
import okhttp3.internal.http2.Http2Reader$ContinuationSource;
import okhttp3.internal.http2.Hpack$Reader;
import okio.n;
import java.lang.Short;
import java.lang.Integer;
import java.io.IOException;
import okhttp3.internal.http2.Http2Reader$Handler;
import java.lang.Byte;
import java.util.logging.Level;
import okio.ByteString;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import java.util.List;
import okhttp3.internal.http2.Settings;
import java.lang.Long;

public final class Http2Reader implements Closeable	// class@001fb2
{
    public final boolean client;
    public final Http2Reader$ContinuationSource continuation;
    public final Hpack$Reader hpackReader;
    public final d source;
    public static final Logger logger;

    static {
       Http2Reader.logger = Logger.getLogger(Http2.class.getName());
    }
    public void Http2Reader(d p0,boolean p1){
       super();
       this.source = p0;
       this.client = p1;
       Http2Reader$ContinuationSource uContinuatio = new Http2Reader$ContinuationSource(p0);
       this.continuation = uContinuatio;
       this.hpackReader = new Hpack$Reader(4096, uContinuatio);
    }
    public static int lengthWithoutPadding(int p0,byte p1,short p2){
       if (p1 & 0x08) {
          p0--;
       }
       if (p2 <= p0) {
          return (short)(p0 - p2);
       }else {
          Object[] objArray = new Object[]{Short.valueOf(p2),Integer.valueOf(p0)};
          throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", objArray);
       }
    }
    public static int readMedium(d p0){
       return ((p0.readByte() & 0x00ff) | (((p0.readByte() & 0x00ff) << 16) | ((p0.readByte() & 0x00ff) << 8)));
    }
    public void close(){
       this.source.close();
    }
    public boolean nextFrame(boolean p0,Http2Reader$Handler p1){
       Object[] objArray;
       Http2Reader http2Reader = null;
       try{
          this.source.require(9);
          int i = Http2Reader.readMedium(this.source);
          if (i >= 0 && i <= 0x4000) {
             byte b = (byte)(this.source.readByte() & 0x00ff);
             if (!p0 || b == 4) {
                byte b1 = (byte)(this.source.readByte() & 0x00ff);
                int i1 = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger = Http2Reader.logger;
                if (logger.isLoggable(Level.FINE)) {
                   logger.fine(Http2.frameLog(true, i1, i, b, b1));
                }
                switch (b){
                    case 0:
                      this.readData(p1, i, b1, i1);
                      break;
                    case 1:
                      this.readHeaders(p1, i, b1, i1);
                      break;
                    case 2:
                      this.readPriority(p1, i, b1, i1);
                      break;
                    case 3:
                      this.readRstStream(p1, i, b1, i1);
                      break;
                    case 4:
                      this.readSettings(p1, i, b1, i1);
                      break;
                    case 5:
                      this.readPushPromise(p1, i, b1, i1);
                      break;
                    case 6:
                      this.readPing(p1, i, b1, i1);
                      break;
                    case 7:
                      this.readGoAway(p1, i, b1, i1);
                      break;
                    case 8:
                      this.readWindowUpdate(p1, i, b1, i1);
                      break;
                    default:
                      this.source.skip((long)i);
                }
                return true;
             }else {
                objArray = new Object[true];
                objArray[http2Reader] = Byte.valueOf(b);
                throw Http2.ioException("Expected a SETTINGS frame but was %s", objArray);
             }
          }else {
             objArray = new Object[true];
             objArray[http2Reader] = Integer.valueOf(i);
             throw Http2.ioException("FRAME_SIZE_ERROR: %s", objArray);
          }
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public void readConnectionPreface(Http2Reader$Handler p0){
       if (this.client != null) {
          if (!this.nextFrame(true, p0)) {
             Object[] objArray = new Object[0];
             throw Http2.ioException("Required SETTINGS preface not received", objArray);
          }
       }else {
          ByteString cONNECTION_P = Http2.CONNECTION_PREFACE;
          ByteString uByteString = this.source.readByteString((long)cONNECTION_P.size());
          Logger logger = Http2Reader.logger;
          if (logger.isLoggable(Level.FINE)) {
             Object[] objArray1 = new Object[true];
             objArray1[0] = uByteString.hex();
             logger.fine(Util.format("<< CONNECTION %s", objArray1));
          }
          if (!cONNECTION_P.equals(uByteString)) {
             Object[] objArray2 = new Object[true];
             objArray2[0] = uByteString.utf8();
             throw Http2.ioException("Expected a connection header but was %s", objArray2);
          }
       }
       return;
    }
    public final void readData(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Object[] objArray;
       Http2Reader http2Reader = null;
       if (p3) {
          int i = 1;
          boolean b = (p2 & 0x01)? true: false;
          if (!(p2 & 0x20)) {
             i = 0;
          }
          if (!i) {
             if (p2 & 0x08) {
                http2Reader = (short)(this.source.readByte() & 0x00ff);
             }
             p0.data(b, p3, this.source, Http2Reader.lengthWithoutPadding(p1, p2, http2Reader));
             this.source.skip((long)http2Reader);
             return;
          }else {
             objArray = new Object[http2Reader];
             throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", objArray);
          }
       }else {
          objArray = new Object[http2Reader];
          throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", objArray);
       }
    }
    public final void readGoAway(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Object[] objArray;
       ByteString uByteString = 1;
       int i = 8;
       long l = 0;
       if (p1 >= i) {
          if (!p3) {
             p3 = this.source.readInt();
             int i1 = this.source.readInt();
             p1 = p1 - i;
             ErrorCode uErrorCode = ErrorCode.fromHttp2(i1);
             if (uErrorCode != null) {
                uByteString = ByteString.EMPTY;
                if (p1 > 0) {
                   uByteString = this.source.readByteString((long)p1);
                }
                p0.goAway(p3, uErrorCode, uByteString);
                return;
             }else {
                objArray = new Object[uByteString];
                objArray[l] = Integer.valueOf(i1);
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", objArray);
             }
          }else {
             objArray = new Object[l];
             throw Http2.ioException("TYPE_GOAWAY streamId != 0", objArray);
          }
       }else {
          objArray = new Object[uByteString];
          objArray[l] = Integer.valueOf(p1);
          throw Http2.ioException("TYPE_GOAWAY length < 8: %s", objArray);
       }
    }
    public final List readHeaderBlock(int p0,short p1,byte p2,int p3){
       Http2Reader tcontinuatio = this.continuation;
       tcontinuatio.left = p0;
       tcontinuatio.length = p0;
       tcontinuatio.padding = p1;
       tcontinuatio.flags = p2;
       tcontinuatio.streamId = p3;
       this.hpackReader.readHeaders();
       return this.hpackReader.getAndResetHeaderList();
    }
    public final void readHeaders(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Http2Reader http2Reader = null;
       if (p3) {
          boolean b = (p2 & 0x01)? true: false;
          if (p2 & 0x08) {
             http2Reader = (short)(this.source.readByte() & 0x00ff);
          }
          if (p2 & 0x20) {
             this.readPriority(p0, p3);
             p1 = p1 - 5;
          }
          p0.headers(b, p3, -1, this.readHeaderBlock(Http2Reader.lengthWithoutPadding(p1, p2, http2Reader), http2Reader, p2, p3));
          return;
       }else {
          Object[] objArray = new Object[http2Reader];
          throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", objArray);
       }
    }
    public final void readPing(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Object[] objArray;
       boolean b = false;
       if (p1 == 8) {
          if (!p3) {
             p1 = this.source.readInt();
             p3 = this.source.readInt();
             if (p2 & 1) {
                b = true;
             }
             p0.ping(b, p1, p3);
             return;
          }else {
             objArray = new Object[b];
             throw Http2.ioException("TYPE_PING streamId != 0", objArray);
          }
       }else {
          objArray = new Object[]{Integer.valueOf(p1)};
          throw Http2.ioException("TYPE_PING length != 8: %s", objArray);
       }
    }
    public final void readPriority(Http2Reader$Handler p0,int p1){
       int i = this.source.readInt();
       boolean b = (Integer.MIN_VALUE & i)? true: false;
       p0.priority(p1, (i & Integer.MAX_VALUE), ((this.source.readByte() & 0x00ff) + 1), b);
       return;
    }
    public final void readPriority(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Object[] objArray;
       if (p1 == 5) {
          if (p3) {
             this.readPriority(p0, p3);
             return;
          }else {
             objArray = new Object[0];
             throw Http2.ioException("TYPE_PRIORITY streamId == 0", objArray);
          }
       }else {
          objArray = new Object[]{Integer.valueOf(p1)};
          throw Http2.ioException("TYPE_PRIORITY length: %d != 5", objArray);
       }
    }
    public final void readPushPromise(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Http2Reader http2Reader = null;
       if (p3) {
          if (p2 & 0x08) {
             http2Reader = (short)(this.source.readByte() & 0x00ff);
          }
          p0.pushPromise(p3, (this.source.readInt() & Integer.MAX_VALUE), this.readHeaderBlock(Http2Reader.lengthWithoutPadding((p1 - 4), p2, http2Reader), http2Reader, p2, p3));
          return;
       }else {
          Object[] objArray = new Object[http2Reader];
          throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", objArray);
       }
    }
    public final void readRstStream(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Object[] objArray;
       if (p1 == 4) {
          if (p3) {
             p1 = this.source.readInt();
             ErrorCode uErrorCode = ErrorCode.fromHttp2(p1);
             if (uErrorCode != null) {
                p0.rstStream(p3, uErrorCode);
                return;
             }else {
                objArray = new Object[]{Integer.valueOf(p1)};
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", objArray);
             }
          }else {
             objArray = new Object[0];
             throw Http2.ioException("TYPE_RST_STREAM streamId == 0", objArray);
          }
       }else {
          objArray = new Object[]{Integer.valueOf(p1)};
          throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", objArray);
       }
    }
    public final void readSettings(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Object[] objArray;
       int i2;
       if (!p3) {
          if (p2 & 1) {
             if (!p1) {
                p0.ackSettings();
                return;
             }else {
                objArray = new Object[0];
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", objArray);
             }
          }else if(!(p1 % 6)){
             Settings settings = new Settings();
             int i = 0;
             while (true) {
                if (i < p1) {
                   int i1 = this.source.readShort() & 0xffff;
                   i2 = this.source.readInt();
                   if (i1 != 2) {
                      if (i1 != 3) {
                         if (i1 != 4) {
                            if (i1 == 5 && (i2 < 0x4000 || i2 > 0xffffff)) {
                               break ;
                            }
                         }else {
                            i1 = 7;
                            if (i2 < 0) {
                               objArray = new Object[0];
                               throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", objArray);
                            }
                         }
                      }else {
                         i1 = 4;
                      }
                   }else if(!i2 || i2 == 1){
                      objArray = new Object[0];
                      throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", objArray);
                   }
                   settings.set(i1, i2);
                   i = i + 6;
                }else {
                   p0.settings(0, settings);
                   return;
                }
             }
             objArray = new Object[]{Integer.valueOf(i2)};
             throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", objArray);
          }else {
             objArray = new Object[]{Integer.valueOf(p1)};
             throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", objArray);
          }
       }else {
          objArray = new Object[0];
          throw Http2.ioException("TYPE_SETTINGS streamId != 0", objArray);
       }
    }
    public final void readWindowUpdate(Http2Reader$Handler p0,int p1,byte p2,int p3){
       Object[] objArray;
       if (p1 == 4) {
          long l = (long)this.source.readInt() & 0x7fffffff;
          if (l) {
             p0.windowUpdate(p3, l);
             return;
          }else {
             objArray = new Object[]{Long.valueOf(l)};
             throw Http2.ioException("windowSizeIncrement was 0", objArray);
          }
       }else {
          objArray = new Object[]{Integer.valueOf(p1)};
          throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", objArray);
       }
    }
}
