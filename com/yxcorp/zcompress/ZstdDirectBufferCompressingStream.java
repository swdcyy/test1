package com.yxcorp.zcompress.ZstdDirectBufferCompressingStream;
import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.nio.channels.FileChannel;
import com.yxcorp.zcompress.Zstd;
import java.nio.Buffer;
import java.io.IOException;
import java.lang.StringBuilder;
import com.yxcorp.zcompress.SharedDictBase;
import com.yxcorp.zcompress.ZstdDictCompress;

public class ZstdDirectBufferCompressingStream implements Closeable, Flushable	// class@000a07
{
    public boolean closed;
    public int consumed;
    public byte[] dict;
    public ZstdDictCompress fastDict;
    public FileChannel fileChannel;
    public boolean finalize;
    public boolean initialized;
    public int level;
    public int produced;
    public final long stream;
    public ByteBuffer target;

    public void ZstdDirectBufferCompressingStream(ByteBuffer p0,int p1){
       super();
       this.consumed = 0;
       this.produced = 0;
       this.closed = false;
       this.initialized = false;
       this.finalize = true;
       this.level = 3;
       this.dict = null;
       this.fastDict = null;
       if (!p0.isDirect()) {
          throw new IllegalArgumentException("Target buffer should be a direct buffer");
       }
       _monitor_enter(this);
       this.target = p0;
       this.level = p1;
       this.stream = ZstdDirectBufferCompressingStream.createCStream();
       _monitor_exit(this);
       return;
    }
    public void ZstdDirectBufferCompressingStream(ByteBuffer p0,int p1,FileChannel p2){
       super(p0, p1);
       this.fileChannel = p2;
    }
    public static native long createCStream();
    public static native int freeCStream(long p0);
    public static native long recommendedCOutSize();
    public static int recommendedOutputBufferSize(){
       return (int)ZstdDirectBufferCompressingStream.recommendedCOutSize();
    }
    public synchronized void close(){
       long this;
       if (this.closed == null) {
          if (this.initialized != null) {
             while (true) {
                ZstdDirectBufferCompressingStream ttarget = this.target;
                int i = this.endStream(this.stream, ttarget, ttarget.position(), this.target.remaining());
                this = (long)i;
                if (Zstd.isError(this)) {
                   throw new IOException("Compression error: "+Zstd.getErrorName(this));
                }
                ByteBuffer ZstdDirectBufferCompressingStream this1 = this.target;
                int i1 = this1.position() + this.produced;
                this1.position(i1);
                this1 = this.flushBuffer(this.target);
                this.target = this1;
                if (this1.isDirect()) {
                   if (i <= 0 || this.target.hasRemaining()) {
                      if (i > 0) {
                      }
                   }else {
                      throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                   }
                }else {
                   throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
             }
          }
          ZstdDirectBufferCompressingStream.freeCStream(this.stream);
          this.closed = true;
          this.initialized = false;
          this.target = null;
       }
       return;
    }
    public synchronized void compress(ByteBuffer p0){
       ZstdDirectBufferCompressingStream tZstdDirectB;
       int i;
       long l;
       ZstdDirectBufferCompressingStream ttarget;
       if (!p0.isDirect()) {
          throw new IllegalArgumentException("Source buffer should be a direct buffer");
       }
       if (this.closed != null) {
          throw new IOException("Stream closed");
       }
       if (this.initialized == null) {
          tZstdDirectB = this.fastDict;
          if (tZstdDirectB != null) {
             tZstdDirectB.acquireSharedLock();
             i = this.initCStreamWithFastDict(this.stream, tZstdDirectB);
             tZstdDirectB.releaseSharedLock();
          }else {
             ttarget = this.dict;
             i = (ttarget != null)? this.initCStreamWithDict(this.stream, ttarget, ttarget.length, this.level): this.initCStream(this.stream, this.level);
          }
          l = (long)i;
          if (!Zstd.isError(l)) {
             this.initialized = true;
          }else {
             throw new IOException("Compression error: cannot create header: "+Zstd.getErrorName(l));
          }
       }
       while (true) {
          if (!p0.hasRemaining()) {
             return;
          }
          if (!this.target.hasRemaining()) {
             ByteBuffer uByteBuffer = this.flushBuffer(this.target);
             this.target = uByteBuffer;
             if (uByteBuffer.isDirect()) {
                if (!this.target.hasRemaining()) {
                   throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
             }else {
                throw new IllegalArgumentException("Target buffer should be a direct buffer");
             }
          }
          ttarget = this.target;
          l = (long)this.compressDirectByteBuffer(this.stream, ttarget, ttarget.position(), this.target.remaining(), p0, p0.position(), p0.remaining());
          if (!Zstd.isError(l)) {
             tZstdDirectB = this.target;
             i = tZstdDirectB.position() + this.produced;
             tZstdDirectB.position(i);
             int tZstdDirectB1 = p0.position() + this.consumed;
             p0.position(tZstdDirectB1);
          }else {
             break ;
          }
       }
       throw new IOException("Compression error: "+Zstd.getErrorName(l));
    }
    public native final int compressDirectByteBuffer(long p0,ByteBuffer p1,int p2,int p3,ByteBuffer p4,int p5,int p6);
    public native final int endStream(long p0,ByteBuffer p1,int p2,int p3);
    public void finalize(){
       if (this.finalize != null) {
          this.close();
       }
       return;
    }
    public synchronized void flush(){
       long this;
       if (this.closed != null) {
          throw new IOException("Already closed");
       }
       if (this.initialized != null) {
          while (true) {
             ZstdDirectBufferCompressingStream ttarget = this.target;
             int i = this.flushStream(this.stream, ttarget, ttarget.position(), this.target.remaining());
             this = (long)i;
             if (Zstd.isError(this)) {
                throw new IOException("Compression error: "+Zstd.getErrorName(this));
             }
             ByteBuffer ZstdDirectBufferCompressingStream this1 = this.target;
             int i1 = this1.position() + this.produced;
             this1.position(i1);
             this1 = this.flushBuffer(this.target);
             this.target = this1;
             if (this1.isDirect()) {
                if (i <= 0 || this.target.hasRemaining()) {
                   if (i > 0) {
                   }
                }else {
                   throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
             }else {
                throw new IllegalArgumentException("Target buffer should be a direct buffer");
             }
          }
       }
       return;
    }
    public ByteBuffer flushBuffer(ByteBuffer p0){
       p0.flip();
       ZstdDirectBufferCompressingStream tfileChannel = this.fileChannel;
       if (tfileChannel != null) {
          tfileChannel.write(p0);
       }
       p0.clear();
       return p0;
    }
    public native final int flushStream(long p0,ByteBuffer p1,int p2,int p3);
    public native final int initCStream(long p0,int p1);
    public native final int initCStreamWithDict(long p0,byte[] p1,int p2,int p3);
    public native final int initCStreamWithFastDict(long p0,ZstdDictCompress p1);
    public synchronized ZstdDirectBufferCompressingStream setDict(ZstdDictCompress p0){
       if (this.initialized != null) {
          throw new IOException("Change of parameter on initialized stream");
       }
       this.dict = null;
       this.fastDict = p0;
       return this;
    }
    public synchronized ZstdDirectBufferCompressingStream setDict(byte[] p0){
       if (this.initialized != null) {
          throw new IOException("Change of parameter on initialized stream");
       }
       this.dict = p0;
       this.fastDict = null;
       return this;
    }
    public void setFinalize(boolean p0){
       this.finalize = p0;
    }
}
