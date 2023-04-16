package com.google.protobuf.UnsafeUtil$JvmMemoryAccessor;
import com.google.protobuf.UnsafeUtil$MemoryAccessor;
import sun.misc.Unsafe;
import com.google.protobuf.UnsafeUtil;
import java.lang.Object;
import java.lang.reflect.Field;

public final class UnsafeUtil$JvmMemoryAccessor extends UnsafeUtil$MemoryAccessor	// class@0004e7
{

    public void UnsafeUtil$JvmMemoryAccessor(Unsafe p0){
       super(p0);
    }
    public void copyMemory(long p0,byte[] p1,long p2,long p3){
       this.unsafe.copyMemory(null, p0, p1, (UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + p2), p3);
    }
    public void copyMemory(byte[] p0,long p1,long p2,long p3){
       this.unsafe.copyMemory(p0, (UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + p1), null, p2, p3);
    }
    public boolean getBoolean(Object p0,long p1){
       return this.unsafe.getBoolean(p0, p1);
    }
    public byte getByte(long p0){
       return this.unsafe.getByte(p0);
    }
    public byte getByte(Object p0,long p1){
       return this.unsafe.getByte(p0, p1);
    }
    public double getDouble(Object p0,long p1){
       return this.unsafe.getDouble(p0, p1);
    }
    public float getFloat(Object p0,long p1){
       return this.unsafe.getFloat(p0, p1);
    }
    public int getInt(long p0){
       return this.unsafe.getInt(p0);
    }
    public long getLong(long p0){
       return this.unsafe.getLong(p0);
    }
    public Object getStaticObject(Field p0){
       return this.getObject(this.unsafe.staticFieldBase(p0), this.unsafe.staticFieldOffset(p0));
    }
    public void putBoolean(Object p0,long p1,boolean p2){
       this.unsafe.putBoolean(p0, p1, p2);
    }
    public void putByte(long p0,byte p1){
       this.unsafe.putByte(p0, p1);
    }
    public void putByte(Object p0,long p1,byte p2){
       this.unsafe.putByte(p0, p1, p2);
    }
    public void putDouble(Object p0,long p1,double p2){
       this.unsafe.putDouble(p0, p1, p2);
    }
    public void putFloat(Object p0,long p1,float p2){
       this.unsafe.putFloat(p0, p1, p2);
    }
    public void putInt(long p0,int p1){
       this.unsafe.putInt(p0, p1);
    }
    public void putLong(long p0,long p1){
       this.unsafe.putLong(p0, p1);
    }
}
