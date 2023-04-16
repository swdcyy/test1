package com.google.protobuf.NioByteString$1;
import java.io.InputStream;
import com.google.protobuf.NioByteString;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.Math;
import java.io.IOException;
import java.lang.Throwable;

public class NioByteString$1 extends InputStream	// class@00048e
{
    public final ByteBuffer buf;
    public final NioByteString this$0;

    public void NioByteString$1(NioByteString p0){
       this.this$0 = p0;
       super();
       this.buf = p0.buffer.slice();
    }
    public int available(){
       return this.buf.remaining();
    }
    public void mark(int p0){
       this.buf.mark();
    }
    public boolean markSupported(){
       return true;
    }
    public int read(){
       if (!this.buf.hasRemaining()) {
          return -1;
       }
       return (this.buf.get() & 0x00ff);
    }
    public int read(byte[] p0,int p1,int p2){
       if (!this.buf.hasRemaining()) {
          return -1;
       }
       p2 = Math.min(p2, this.buf.remaining());
       this.buf.get(p0, p1, p2);
       return p2;
    }
    public void reset(){
       try{
          this.buf.reset();
          return;
       }catch(java.nio.InvalidMarkException e0){
          throw new IOException(e0);
       }
    }
}
