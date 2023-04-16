package com.yxcorp.zcompress.ZstdCompressCtx;
import com.yxcorp.zcompress.AutoCloseBase;
import java.lang.IllegalStateException;
import java.lang.String;
import java.nio.ByteBuffer;
import com.yxcorp.zcompress.Zstd;
import com.yxcorp.zcompress.ZstdException;
import java.lang.IllegalArgumentException;
import com.yxcorp.zcompress.ZstdDictCompress;
import com.yxcorp.zcompress.SharedDictBase;

public class ZstdCompressCtx extends AutoCloseBase	// class@000a05
{
    public ZstdDictCompress compression_dict;
    public long nativePtr;

    public void ZstdCompressCtx(){
       super();
       long l = 0;
       this.nativePtr = l;
       this.compression_dict = null;
       this.init();
       if (!l - this.nativePtr) {
          throw new IllegalStateException("ZSTD_createCompressCtx failed");
       }
       this.storeFence();
       return;
    }
    public void close(){
       super.close();
    }
    public long compressDirectByteBuffer(ByteBuffer p0,int p1,int p2,ByteBuffer p3,int p4,int p5){
       if (!this.nativePtr) {
          throw new IllegalStateException("Compression context is closed");
       }
       if (!p3.isDirect()) {
          throw new IllegalArgumentException("srcBuff must be a direct buffer");
       }
       if (!p0.isDirect()) {
          throw new IllegalArgumentException("dstBuff must be a direct buffer");
       }
       this.acquireSharedLock();
       long l = this.compressDirectByteBuffer0(p0, p1, p2, p3, p4, p5);
       if (Zstd.isError(l)) {
          throw new ZstdException(l);
       }
       this.releaseSharedLock();
       return l;
    }
    public native final long compressDirectByteBuffer0(ByteBuffer p0,int p1,int p2,ByteBuffer p3,int p4,int p5);
    public void doClose(){
       if (this.nativePtr) {
          this.free();
          this.nativePtr = 0;
       }
       return;
    }
    public native final void free();
    public native final void init();
    public native final long loadCDict0(byte[] p0);
    public native final long loadCDictFast0(ZstdDictCompress p0);
    public void loadDict(ZstdDictCompress p0){
       if (!this.nativePtr - false) {
          throw new IllegalStateException("Compression context is closed");
       }
       this.acquireSharedLock();
       p0.acquireSharedLock();
       long l = this.loadCDictFast0(p0);
       if (Zstd.isError(l)) {
          throw new ZstdException(l);
       }
       this.compression_dict = p0;
       p0.releaseSharedLock();
       this.releaseSharedLock();
       return;
    }
    public void loadDict(byte[] p0){
       if (!this.nativePtr) {
          throw new IllegalStateException("Compression context is closed");
       }
       this.acquireSharedLock();
       long l = this.loadCDict0(p0);
       if (Zstd.isError(l)) {
          throw new ZstdException(l);
       }
       this.compression_dict = null;
       this.releaseSharedLock();
       return;
    }
    public void setChecksum(boolean p0){
       if (!this.nativePtr) {
          throw new IllegalStateException("Compression context is closed");
       }
       this.acquireSharedLock();
       this.setChecksum0(p0);
       this.releaseSharedLock();
       return;
    }
    public native final void setChecksum0(boolean p0);
    public void setContentSize(boolean p0){
       if (!this.nativePtr) {
          throw new IllegalStateException("Compression context is closed");
       }
       this.acquireSharedLock();
       this.setContentSize0(p0);
       this.releaseSharedLock();
       return;
    }
    public native final void setContentSize0(boolean p0);
    public void setDictID(boolean p0){
       if (!this.nativePtr) {
          throw new IllegalStateException("Compression context is closed");
       }
       this.acquireSharedLock();
       this.setDictID0(p0);
       this.releaseSharedLock();
       return;
    }
    public native final void setDictID0(boolean p0);
    public void setFinalize(boolean p0){
       super.setFinalize(p0);
    }
    public void setLevel(int p0){
       if (!this.nativePtr) {
          throw new IllegalStateException("Compression context is closed");
       }
       this.acquireSharedLock();
       this.setLevel0(p0);
       this.releaseSharedLock();
       return;
    }
    public native final void setLevel0(int p0);
}
