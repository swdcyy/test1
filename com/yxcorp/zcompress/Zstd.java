package com.yxcorp.zcompress.Zstd;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.yxcorp.zcompress.ZstdException;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Arrays;

public class Zstd	// class@000a04
{

    public void Zstd(){
       super();
    }
    public static int compress(ByteBuffer p0,ByteBuffer p1){
       return Zstd.compress(p0, p1, 3);
    }
    public static int compress(ByteBuffer p0,ByteBuffer p1,int p2){
       return Zstd.compress(p0, p1, p2, false);
    }
    public static int compress(ByteBuffer p0,ByteBuffer p1,int p2,boolean p3){
       if (!p1.isDirect()) {
          throw new IllegalArgumentException("srcBuf must be a direct buffer");
       }
       if (!p0.isDirect()) {
          throw new IllegalArgumentException("dstBuf must be a direct buffer");
       }
       long l = Zstd.compressDirectByteBuffer(p0, p0.position(), (p0.limit() - p0.position()), p1, p1.position(), (p1.limit() - p1.position()), p2, p3);
       if (Zstd.isError(l)) {
          throw new ZstdException(l);
       }
       p1.position(p1.limit());
       int i = (int)l;
       p0.position((p0.position() + i));
       return i;
    }
    public static int compress(ByteBuffer p0,ByteBuffer p1,byte[] p2,int p3){
       if (!p1.isDirect()) {
          throw new IllegalArgumentException("srcBuf must be a direct buffer");
       }
       if (!p0.isDirect()) {
          throw new IllegalArgumentException("dstBuf must be a direct buffer");
       }
       long l = Zstd.compressDirectByteBufferUsingDict(p0, p0.position(), (p0.limit() - p0.position()), p1, p1.position(), (p1.limit() - p1.position()), p2, p3);
       if (Zstd.isError(l)) {
          throw new ZstdException(l);
       }
       p1.position(p1.limit());
       p3 = (int)l;
       p0.position((p0.position() + p3));
       return p3;
    }
    public static long compress(byte[] p0,byte[] p1,int p2){
       return Zstd.compress(p0, p1, p2, false);
    }
    public static native long compress(byte[] p0,byte[] p1,int p2,boolean p3);
    public static long compress(byte[] p0,byte[] p1,byte[] p2,int p3){
       return Zstd.compressUsingDict(p0, 0, p1, 0, p1.length, p2, p3);
    }
    public static ByteBuffer compress(ByteBuffer p0,int p1){
       if (!p0.isDirect()) {
          throw new IllegalArgumentException("srcBuf must be a direct buffer");
       }
       long l = Zstd.compressBound((long)(p0.limit() - p0.position()));
       if (l - 0x7fffffff > 0) {
          throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
       }
       int i = (int)l;
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(i);
       long l1 = Zstd.compressDirectByteBuffer(uByteBuffer, 0, i, p0, p0.position(), (p0.limit() - p0.position()), p1);
       if (Zstd.isError(l1)) {
          throw new ZstdException(l1);
       }
       p0.position(p0.limit());
       uByteBuffer.limit((int)l1);
       return uByteBuffer;
    }
    public static ByteBuffer compress(ByteBuffer p0,byte[] p1,int p2){
       if (!p0.isDirect()) {
          throw new IllegalArgumentException("srcBuf must be a direct buffer");
       }
       long l = Zstd.compressBound((long)(p0.limit() - p0.position()));
       if (l - 0x7fffffff > 0) {
          throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
       }
       int i = (int)l;
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(i);
       long l1 = Zstd.compressDirectByteBufferUsingDict(uByteBuffer, 0, i, p0, p0.position(), (p0.limit() - p0.position()), p1, p2);
       if (Zstd.isError(l1)) {
          throw new ZstdException(l1);
       }
       p0.position(p0.limit());
       uByteBuffer.limit((int)l1);
       return uByteBuffer;
    }
    public static byte[] compress(byte[] p0){
       return Zstd.compress(p0, 3);
    }
    public static byte[] compress(byte[] p0,int p1){
       long l = Zstd.compressBound((long)p0.length);
       if (l - 0x7fffffff > 0) {
          throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
       }
       byte[] uobyteArray = new byte[(int)l];
       long l1 = Zstd.compress(uobyteArray, p0, p1);
       if (!Zstd.isError(l1)) {
          return Arrays.copyOfRange(uobyteArray, 0, (int)l1);
       }
       throw new ZstdException(l1);
    }
    public static native long compressBound(long p0);
    public static long compressByteArray(byte[] p0,int p1,int p2,byte[] p3,int p4,int p5,int p6){
       return Zstd.compressByteArray(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public static native long compressByteArray(byte[] p0,int p1,int p2,byte[] p3,int p4,int p5,int p6,boolean p7);
    public static long compressDirectByteBuffer(ByteBuffer p0,int p1,int p2,ByteBuffer p3,int p4,int p5,int p6){
       return Zstd.compressDirectByteBuffer(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public static native long compressDirectByteBuffer(ByteBuffer p0,int p1,int p2,ByteBuffer p3,int p4,int p5,int p6,boolean p7);
    public static native long compressDirectByteBufferUsingDict(ByteBuffer p0,int p1,int p2,ByteBuffer p3,int p4,int p5,byte[] p6,int p7);
    public static long compressUnsafe(long p0,long p1,long p2,long p3,int p4){
       return Zstd.compressUnsafe(p0, p1, p2, p3, p4, false);
    }
    public static native long compressUnsafe(long p0,long p1,long p2,long p3,int p4,boolean p5);
    public static native long compressUsingDict(byte[] p0,int p1,byte[] p2,int p3,int p4,byte[] p5,int p6);
    public static long compressUsingDict(byte[] p0,byte[] p1,byte[] p2,int p3){
       return Zstd.compressUsingDict(p0, 0, p1, 0, p1.length, p2, p3);
    }
    public static byte[] compressUsingDict(byte[] p0,byte[] p1,int p2){
       long l = Zstd.compressBound((long)p0.length);
       if (l - 0x7fffffff > 0) {
          throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
       }
       byte[] uobyteArray = new byte[(int)l];
       long l1 = Zstd.compressUsingDict(uobyteArray, 0, p0, 0, p0.length, p1, p2);
       if (!Zstd.isError(l1)) {
          return Arrays.copyOfRange(uobyteArray, 0, (int)l1);
       }
       throw new ZstdException(l1);
    }
    public static native long errDstSizeTooSmall();
    public static native long errGeneric();
    public static native long getDictIdFromDict(byte[] p0);
    public static native long getDictIdFromFrame(byte[] p0);
    public static native long getDictIdFromFrameBuffer(ByteBuffer p0);
    public static native long getErrorCode(long p0);
    public static native String getErrorName(long p0);
    public static native boolean isError(long p0);
}
