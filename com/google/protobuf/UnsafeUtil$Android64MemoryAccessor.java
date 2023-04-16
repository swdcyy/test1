package com.google.protobuf.UnsafeUtil$Android64MemoryAccessor;
import com.google.protobuf.UnsafeUtil$MemoryAccessor;
import sun.misc.Unsafe;
import java.lang.UnsupportedOperationException;
import java.lang.Object;
import com.google.protobuf.UnsafeUtil;
import java.lang.Double;
import java.lang.Float;
import java.lang.reflect.Field;

public final class UnsafeUtil$Android64MemoryAccessor extends UnsafeUtil$MemoryAccessor	// class@0004e6
{

    public void UnsafeUtil$Android64MemoryAccessor(Unsafe p0){
       super(p0);
    }
    public void copyMemory(long p0,byte[] p1,long p2,long p3){
       throw new UnsupportedOperationException();
    }
    public void copyMemory(byte[] p0,long p1,long p2,long p3){
       throw new UnsupportedOperationException();
    }
    public boolean getBoolean(Object p0,long p1){
       if (UnsafeUtil.IS_BIG_ENDIAN) {
          return UnsafeUtil.getBooleanBigEndian(p0, p1);
       }
       return UnsafeUtil.getBooleanLittleEndian(p0, p1);
    }
    public byte getByte(long p0){
       throw new UnsupportedOperationException();
    }
    public byte getByte(Object p0,long p1){
       if (UnsafeUtil.IS_BIG_ENDIAN) {
          return UnsafeUtil.getByteBigEndian(p0, p1);
       }
       return UnsafeUtil.getByteLittleEndian(p0, p1);
    }
    public double getDouble(Object p0,long p1){
       return Double.longBitsToDouble(this.getLong(p0, p1));
    }
    public float getFloat(Object p0,long p1){
       return Float.intBitsToFloat(this.getInt(p0, p1));
    }
    public int getInt(long p0){
       throw new UnsupportedOperationException();
    }
    public long getLong(long p0){
       throw new UnsupportedOperationException();
    }
    public Object getStaticObject(Field p0){
       Object obj = null;
       try{
          return p0.get(obj);
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }
    }
    public void putBoolean(Object p0,long p1,boolean p2){
       if (UnsafeUtil.IS_BIG_ENDIAN) {
          UnsafeUtil.putBooleanBigEndian(p0, p1, p2);
       }else {
          UnsafeUtil.putBooleanLittleEndian(p0, p1, p2);
       }
       return;
    }
    public void putByte(long p0,byte p1){
       throw new UnsupportedOperationException();
    }
    public void putByte(Object p0,long p1,byte p2){
       if (UnsafeUtil.IS_BIG_ENDIAN) {
          UnsafeUtil.putByteBigEndian(p0, p1, p2);
       }else {
          UnsafeUtil.putByteLittleEndian(p0, p1, p2);
       }
       return;
    }
    public void putDouble(Object p0,long p1,double p2){
       this.putLong(p0, p1, Double.doubleToLongBits(p2));
    }
    public void putFloat(Object p0,long p1,float p2){
       this.putInt(p0, p1, Float.floatToIntBits(p2));
    }
    public void putInt(long p0,int p1){
       throw new UnsupportedOperationException();
    }
    public void putLong(long p0,long p1){
       throw new UnsupportedOperationException();
    }
}
