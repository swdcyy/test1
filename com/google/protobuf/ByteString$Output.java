package com.google.protobuf.ByteString$Output;
import java.io.OutputStream;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Math;
import java.lang.Object;
import java.lang.System;
import com.google.protobuf.ByteString$LiteralByteString;
import com.google.protobuf.ByteString;
import java.lang.Iterable;
import java.lang.Integer;

public final class ByteString$Output extends OutputStream	// class@0003d4
{
    public byte[] buffer;
    public int bufferPos;
    public final ArrayList flushedBuffers;
    public int flushedBuffersTotalBytes;
    public final int initialCapacity;
    public static final byte[] EMPTY_BYTE_ARRAY;

    static {
       byte[] uobyteArray = new byte[0];
       ByteString$Output.EMPTY_BYTE_ARRAY = uobyteArray;
    }
    public void ByteString$Output(int p0){
       super();
       if (p0 < 0) {
          throw new IllegalArgumentException("Buffer size < 0");
       }
       this.initialCapacity = p0;
       this.flushedBuffers = new ArrayList();
       byte[] uobyteArray = new byte[p0];
       this.buffer = uobyteArray;
       return;
    }
    public final byte[] copyArray(byte[] p0,int p1){
       byte[] uobyteArray = new byte[p1];
       System.arraycopy(p0, 0, uobyteArray, 0, Math.min(p0.length, p1));
       return uobyteArray;
    }
    public final void flushFullBuffer(int p0){
       this.flushedBuffers.add(new ByteString$LiteralByteString(this.buffer));
       int i = this.flushedBuffersTotalBytes + this.buffer.length;
       this.flushedBuffersTotalBytes = i;
       byte[] uobyteArray = new byte[Math.max(this.initialCapacity, Math.max(p0, (i >> 1)))];
       this.buffer = uobyteArray;
       this.bufferPos = 0;
    }
    public final void flushLastBuffer(){
       ByteString$Output tbufferPos = this.bufferPos;
       ByteString$Output tbuffer = this.buffer;
       if (tbufferPos < tbuffer.length) {
          if (tbufferPos > null) {
             this.flushedBuffers.add(new ByteString$LiteralByteString(this.copyArray(tbuffer, tbufferPos)));
          }
       }else {
          this.flushedBuffers.add(new ByteString$LiteralByteString(this.buffer));
          this.buffer = ByteString$Output.EMPTY_BYTE_ARRAY;
       }
       this.flushedBuffersTotalBytes = this.flushedBuffersTotalBytes + this.bufferPos;
       this.bufferPos = 0;
       return;
    }
    public synchronized void reset(){
       this.flushedBuffers.clear();
       this.flushedBuffersTotalBytes = 0;
       this.bufferPos = 0;
    }
    public synchronized int size(){
       return (this.flushedBuffersTotalBytes + this.bufferPos);
    }
    public synchronized ByteString toByteString(){
       this.flushLastBuffer();
       return ByteString.copyFrom(this.flushedBuffers);
    }
    public String toString(){
       Object[] objArray = new Object[]{Integer.toHexString(System.identityHashCode(this)),Integer.valueOf(this.size())};
       return String.format("<ByteString.Output@%s size=%d>", objArray);
    }
    public synchronized void write(int p0){
       if (this.bufferPos == this.buffer.length) {
          this.flushFullBuffer(1);
       }
       ByteString$Output tbufferPos = this.bufferPos;
       this.bufferPos = tbufferPos + 1;
       this.buffer[tbufferPos] = (byte)p0;
       return;
    }
    public synchronized void write(byte[] p0,int p1,int p2){
       ByteString$Output tbuffer = this.buffer;
       ByteString$Output tbufferPos = this.bufferPos;
       if (p2 <= (tbuffer.length - tbufferPos)) {
          System.arraycopy(p0, p1, tbuffer, tbufferPos, p2);
          this.bufferPos = this.bufferPos + p2;
       }else {
          int i = tbuffer.length - tbufferPos;
          System.arraycopy(p0, p1, tbuffer, tbufferPos, i);
          p1 = p1 + i;
          p2 = p2 - i;
          this.flushFullBuffer(p2);
          System.arraycopy(p0, p1, this.buffer, 0, p2);
          this.bufferPos = p2;
       }
       return;
    }
    public void writeTo(OutputStream p0){
       _monitor_enter(this);
       ByteString$Output tflushedBuff = this.flushedBuffers;
       ByteString[] uByteStringA = new ByteString[tflushedBuff.size()];
       ByteString[] uByteStringA1 = tflushedBuff.toArray(uByteStringA);
       ByteString$Output tbuffer = this.buffer;
       ByteString$Output tbufferPos = this.bufferPos;
       _monitor_exit(this);
       int len = uByteStringA1.length;
       for (int i = 0; i < len; i = i + 1) {
          uByteStringA1[i].writeTo(p0);
       }
       p0.write(this.copyArray(tbuffer, tbufferPos));
       return;
    }
}
