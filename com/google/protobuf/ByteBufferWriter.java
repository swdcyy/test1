package com.google.protobuf.ByteBufferWriter;
import java.lang.ThreadLocal;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.ref.SoftReference;
import com.google.protobuf.UnsafeUtil;
import java.lang.reflect.Field;
import java.lang.Math;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.channels.WritableByteChannel;

public final class ByteBufferWriter	// class@0003c8
{
    public static final ThreadLocal BUFFER;
    public static final long CHANNEL_FIELD_OFFSET;
    public static final Class FILE_OUTPUT_STREAM_CLASS;

    static {
       ByteBufferWriter.BUFFER = new ThreadLocal();
       Class uClass = ByteBufferWriter.safeGetClass("java.io.FileOutputStream");
       ByteBufferWriter.FILE_OUTPUT_STREAM_CLASS = uClass;
       ByteBufferWriter.CHANNEL_FIELD_OFFSET = ByteBufferWriter.getChannelFieldOffset(uClass);
    }
    public void ByteBufferWriter(){
       super();
    }
    public static void clearCachedBuffer(){
       ByteBufferWriter.BUFFER.set(null);
    }
    public static byte[] getBuffer(){
       SoftReference softReferenc = ByteBufferWriter.BUFFER.get();
       byte[] uobyteArray = (softReferenc == null)? null: softReferenc.get();
       return uobyteArray;
    }
    public static long getChannelFieldOffset(Class p0){
       if (p0 != null && UnsafeUtil.hasUnsafeArrayOperations()) {
          return UnsafeUtil.objectFieldOffset(p0.getDeclaredField("channel"));
       }
       return -1;
    }
    public static byte[] getOrCreateBuffer(int p0){
       p0 = Math.max(p0, 1024);
       byte[] buffer = ByteBufferWriter.getBuffer();
       if (buffer == null || ByteBufferWriter.needToReallocate(p0, buffer.length)) {
          buffer = new byte[p0];
          if (p0 <= 0x4000) {
             ByteBufferWriter.setBuffer(buffer);
          }
       }
       return buffer;
    }
    public static boolean needToReallocate(int p0,int p1){
       boolean b = (p1 < p0 && (float)p1 - ((float)p0 * 0x3f000000) < 0)? true: false;
       return b;
    }
    public static Class safeGetClass(String p0){
       try{
          return Class.forName(p0);
       }catch(java.lang.ClassNotFoundException e0){
          return null;
       }
    }
    public static void setBuffer(byte[] p0){
       ByteBufferWriter.BUFFER.set(new SoftReference(p0));
    }
    public static void write(ByteBuffer p0,OutputStream p1){
       int i = p0.position();
       if (p0.hasArray()) {
          p1.write(p0.array(), (p0.arrayOffset() + p0.position()), p0.remaining());
       }else if(!ByteBufferWriter.writeToChannel(p0, p1)){
          byte[] orCreateBuff = ByteBufferWriter.getOrCreateBuffer(p0.remaining());
          while (p0.hasRemaining()) {
             int i1 = Math.min(p0.remaining(), orCreateBuff.length);
             p0.get(orCreateBuff, 0, i1);
             p1.write(orCreateBuff, 0, i1);
          }
       }
       p0.position(i);
       return;
    }
    public static boolean writeToChannel(ByteBuffer p0,OutputStream p1){
       WritableByteChannel writableByte;
       long cHANNEL_FIEL = ByteBufferWriter.CHANNEL_FIELD_OFFSET;
       if (cHANNEL_FIEL - null >= 0 && ByteBufferWriter.FILE_OUTPUT_STREAM_CLASS.isInstance(p1)) {
          int i = 0;
          try{
             writableByte = UnsafeUtil.getObject(p1, cHANNEL_FIEL);
          }catch(java.lang.ClassCastException e0){
          }
          if (writableByte != null) {
             writableByte.write(p0);
             return true;
          }
       }
       return false;
    }
}
