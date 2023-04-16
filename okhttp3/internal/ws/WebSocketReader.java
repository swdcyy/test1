package okhttp3.internal.ws.WebSocketReader;
import okio.d;
import okhttp3.internal.ws.WebSocketReader$FrameCallback;
import java.lang.Object;
import okio.b;
import java.lang.String;
import java.util.Objects;
import okio.b$b;
import okhttp3.internal.ws.WebSocketProtocol;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.lang.Integer;
import okio.ByteString;
import okio.o;
import okio.n;
import java.util.concurrent.TimeUnit;
import java.lang.Long;
import java.io.IOException;

public final class WebSocketReader	// class@001fdf
{
    public boolean closed;
    public final b controlFrameBuffer;
    public final WebSocketReader$FrameCallback frameCallback;
    public long frameLength;
    public final boolean isClient;
    public boolean isControlFrame;
    public boolean isFinalFrame;
    public final b$b maskCursor;
    public final byte[] maskKey;
    public final b messageFrameBuffer;
    public int opcode;
    public final d source;

    public void WebSocketReader(boolean p0,d p1,WebSocketReader$FrameCallback p2){
       super();
       this.controlFrameBuffer = new b();
       this.messageFrameBuffer = new b();
       Objects.requireNonNull(p1, "source == null");
       Objects.requireNonNull(p2, "frameCallback == null");
       this.isClient = p0;
       this.source = p1;
       this.frameCallback = p2;
       b$b uob = null;
       byte[] uobyteArray = (p0)? uob: new byte[4];
       this.maskKey = uobyteArray;
       if (!p0) {
          uob = new b$b();
       }
       this.maskCursor = uob;
       return;
    }
    public void processNextFrame(){
       this.readHeader();
       if (this.isControlFrame != null) {
          this.readControlFrame();
       }else {
          this.readMessageFrame();
       }
       return;
    }
    public final void readControlFrame(){
       short s;
       String str;
       WebSocketReader tframeLength = this.frameLength;
       long l = 0;
       if (tframeLength - l > 0) {
          this.source.l3(this.controlFrameBuffer, tframeLength);
          if (this.isClient == null) {
             this.controlFrameBuffer.i(this.maskCursor);
             this.maskCursor.a(l);
             WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
             this.maskCursor.close();
          }
       }
       switch (this.opcode){
           case 8:
             tframeLength = 1005;
             long l1 = this.controlFrameBuffer.p();
             if (l1 - 1) {
                if (l1 - l) {
                   s = this.controlFrameBuffer.readShort();
                   str = this.controlFrameBuffer.readUtf8();
                   String str1 = WebSocketProtocol.closeCodeExceptionMessage(s);
                   if (str1 != null) {
                      throw new ProtocolException(str1);
                   }
                }else {
                   str = "";
                }
                this.frameCallback.onReadClose(s, str);
                this.closed = true;
             }else {
                throw new ProtocolException("Malformed close payload length of 1.");
             }
             break;
           case 9:
             this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
             break;
           case 10:
             this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
             break;
           default:
             throw new ProtocolException("Unknown control opcode: "+Integer.toHexString(this.opcode));
       }
       return;
    }
    public final void readHeader(){
       if (this.closed != null) {
          throw new IOException("closed");
       }
       this.source.timeout().clearTimeout();
       int i = this.source.readByte() & 0x00ff;
       this.source.timeout().timeout(this.source.timeout().timeoutNanos(), TimeUnit.NANOSECONDS);
       this.opcode = i & 0x0f;
       WebSocketReader webSocketRea = 1;
       int b = (i & 0x0080)? true: false;
       this.isFinalFrame = b;
       boolean b1 = (i & 0x08)? true: false;
       this.isControlFrame = b1;
       if (!b1 || b) {
          WebSocketReader webSocketRea1 = (i & 0x40)? 1: null;
          b1 = (i & 0x20)? 1: 0;
          i = (i & 0x10)? 1: 0;
          if (!webSocketRea1 && (!b1 && !i)) {
             b = this.source.readByte() & 0x00ff;
             if (!(b & 0x0080)) {
                webSocketRea = null;
             }
             if (webSocketRea == this.isClient) {
                String str = (this.isClient != null)? "Server-sent frames must not be masked.": "Client-sent frames must be masked.";
                throw new ProtocolException(str);
             }else {
                long l = (long)(b & 0x7f);
                this.frameLength = l;
                if (!l - 126) {
                   this.frameLength = (long)this.source.readShort() & 0xffff;
                }else if(!l - 127){
                   l = this.source.readLong();
                   this.frameLength = l;
                   if (l < 0) {
                      throw new ProtocolException("Frame length 0x"+Long.toHexString(this.frameLength)+" > 0x7FFFFFFFFFFFFFFF");
                   }
                }
                if (this.isControlFrame == null || this.frameLength - 125 <= 0) {
                   if (webSocketRea != null) {
                      this.source.readFully(this.maskKey);
                   }
                   return;
                }else {
                   throw new ProtocolException("Control frame must be less than 125B.");
                }
             }
          }else {
             throw new ProtocolException("Reserved flags are unsupported.");
          }
       }else {
          throw new ProtocolException("Control frames must be final.");
       }
    }
    public final void readMessage(){
       while (true) {
          if (this.closed != null) {
             throw new IOException("closed");
          }
          WebSocketReader tframeLength = this.frameLength;
          if (tframeLength - null > 0) {
             this.source.l3(this.messageFrameBuffer, tframeLength);
             if (this.isClient == null) {
                this.messageFrameBuffer.i(this.maskCursor);
                long l = this.messageFrameBuffer.p() - this.frameLength;
                this.maskCursor.a(l);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
             }
          }
          if (this.isFinalFrame != null) {
             break ;
          }else {
             this.readUntilNonControlFrame();
             if (this.opcode == null) {
             }else {
                throw new ProtocolException("Expected continuation opcode. Got: "+Integer.toHexString(this.opcode));
             }
          }
       }
       return;
    }
    public final void readMessageFrame(){
       WebSocketReader topcode = this.opcode;
       WebSocketReader webSocketRea = 1;
       if (topcode != webSocketRea && topcode != 2) {
          throw new ProtocolException("Unknown opcode: "+Integer.toHexString(topcode));
       }
       this.readMessage();
       if (topcode == webSocketRea) {
          this.frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
       }else {
          this.frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
       }
       return;
    }
    public final void readUntilNonControlFrame(){
       while (this.closed == null) {
          this.readHeader();
          if (this.isControlFrame == null) {
             break ;
          }else {
             this.readControlFrame();
          }
       }
       return;
    }
}
