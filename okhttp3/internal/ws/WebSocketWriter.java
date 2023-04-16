package okhttp3.internal.ws.WebSocketWriter;
import okio.c;
import java.util.Random;
import java.lang.Object;
import okio.b;
import okhttp3.internal.ws.WebSocketWriter$FrameSink;
import java.lang.String;
import java.util.Objects;
import okio.b$b;
import okio.m;
import java.lang.IllegalStateException;
import okio.ByteString;
import okhttp3.internal.ws.WebSocketProtocol;
import java.lang.IllegalArgumentException;
import java.io.IOException;

public final class WebSocketWriter	// class@001fe1
{
    public boolean activeWriter;
    public final b buffer;
    public final WebSocketWriter$FrameSink frameSink;
    public final boolean isClient;
    public final b$b maskCursor;
    public final byte[] maskKey;
    public final Random random;
    public final c sink;
    public final b sinkBuffer;
    public boolean writerClosed;

    public void WebSocketWriter(boolean p0,c p1,Random p2){
       super();
       this.buffer = new b();
       this.frameSink = new WebSocketWriter$FrameSink(this);
       Objects.requireNonNull(p1, "sink == null");
       Objects.requireNonNull(p2, "random == null");
       this.isClient = p0;
       this.sink = p1;
       this.sinkBuffer = p1.buffer();
       this.random = p2;
       b$b uob = null;
       byte[] uobyteArray = (p0)? new byte[4]: uob;
       this.maskKey = uobyteArray;
       if (p0) {
          uob = new b$b();
       }
       this.maskCursor = uob;
       return;
    }
    public m newMessageSink(int p0,long p1){
       if (this.activeWriter != null) {
          throw new IllegalStateException("Another message writer is active. Did you call close\(\)?");
       }
       this.activeWriter = true;
       WebSocketWriter tframeSink = this.frameSink;
       tframeSink.formatOpcode = p0;
       tframeSink.contentLength = p1;
       tframeSink.isFirstFrame = true;
       tframeSink.closed = false;
       return tframeSink;
    }
    public void writeClose(int p0,ByteString p1){
       ByteString eMPTY = ByteString.EMPTY;
       if (p0 || p1 != null) {
          if (p0) {
             WebSocketProtocol.validateCloseCode(p0);
          }
          b uob = new b();
          uob.K(p0);
          if (p1 != null) {
             uob.u(p1);
          }
          eMPTY = uob.readByteString();
       }
       this.writeControlFrame(8, eMPTY);
       this.writerClosed = true;
       return;
    }
    public final void writeControlFrame(int p0,ByteString p1){
       if (this.writerClosed != null) {
          throw new IOException("closed");
       }
       int i = p1.size();
       if ((long)i - 125 > 0) {
          throw new IllegalArgumentException("Payload size must be less than or equal to 125");
       }
       this.sinkBuffer.y((p0 | 0x0080));
       if (this.isClient != null) {
          this.sinkBuffer.y((i | 0x0080));
          this.random.nextBytes(this.maskKey);
          this.sinkBuffer.v(this.maskKey);
          if (i > 0) {
             this.sinkBuffer.u(p1);
             this.sinkBuffer.i(this.maskCursor);
             this.maskCursor.a(this.sinkBuffer.p());
             WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
             this.maskCursor.close();
          }
       }else {
          this.sinkBuffer.y(i);
          this.sinkBuffer.u(p1);
       }
       this.sink.flush();
       return;
    }
    public void writeMessageFrame(int p0,long p1,boolean p2,boolean p3){
       if (this.writerClosed != null) {
          throw new IOException("closed");
       }
       int i = 0;
       if (!p2) {
          p0 = 0;
       }
       if (p3) {
          p0 = p0 | 0x0080;
       }
       this.sinkBuffer.y(p0);
       if (this.isClient != null) {
          i = 128;
       }
       if (p1 - 125 <= 0) {
          this.sinkBuffer.y(((int)p1 | i));
       }else if(p1 - 0xffff <= 0){
          this.sinkBuffer.y((i | 0x7e));
          this.sinkBuffer.K((int)p1);
       }else {
          this.sinkBuffer.y((i | 0x7f));
          this.sinkBuffer.I(p1);
       }
       if (this.isClient != null) {
          this.random.nextBytes(this.maskKey);
          this.sinkBuffer.v(this.maskKey);
          if (p1 > 0) {
             this.sinkBuffer.write(this.buffer, p1);
             this.sinkBuffer.i(this.maskCursor);
             this.maskCursor.a(this.sinkBuffer.p());
             WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
             this.maskCursor.close();
          }
       }else {
          this.sinkBuffer.write(this.buffer, p1);
       }
       this.sink.emit();
       return;
    }
    public void writePing(ByteString p0){
       this.writeControlFrame(9, p0);
    }
    public void writePong(ByteString p0){
       this.writeControlFrame(10, p0);
    }
}
