package com.yxcorp.zcompress.ZstdDictCompress;
import com.yxcorp.zcompress.SharedDictBase;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.IllegalArgumentException;

public class ZstdDictCompress extends SharedDictBase	// class@000a06
{
    public long nativePtr;

    public void ZstdDictCompress(byte[] p0,int p1){
       super(p0, 0, p0.length, p1);
    }
    public void ZstdDictCompress(byte[] p0,int p1,int p2,int p3){
       super();
       this.nativePtr = 0;
       if ((p0.length - p1) < 0) {
          throw new IllegalArgumentException("Dictionary buffer is to short");
       }
       this.init(p0, p1, p2, p3);
       if (!0 - this.nativePtr) {
          throw new IllegalStateException("ZSTD_createCDict failed");
       }
       this.storeFence();
       return;
    }
    public void close(){
       super.close();
    }
    public void doClose(){
       if (this.nativePtr) {
          this.free();
          this.nativePtr = 0;
       }
       return;
    }
    public native final void free();
    public native final void init(byte[] p0,int p1,int p2,int p3);
}
