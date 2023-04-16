package com.google.protobuf.UnsafeUtil$MemoryAccessor;
import sun.misc.Unsafe;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Field;

public abstract class UnsafeUtil$MemoryAccessor	// class@0004e8
{
    public Unsafe unsafe;

    public void UnsafeUtil$MemoryAccessor(Unsafe p0){
       super();
       this.unsafe = p0;
    }
    public final int arrayBaseOffset(Class p0){
       return this.unsafe.arrayBaseOffset(p0);
    }
    public final int arrayIndexScale(Class p0){
       return this.unsafe.arrayIndexScale(p0);
    }
    public abstract void copyMemory(long p0,byte[] p1,long p2,long p3);
    public abstract void copyMemory(byte[] p0,long p1,long p2,long p3);
    public abstract boolean getBoolean(Object p0,long p1);
    public abstract byte getByte(long p0);
    public abstract byte getByte(Object p0,long p1);
    public abstract double getDouble(Object p0,long p1);
    public abstract float getFloat(Object p0,long p1);
    public abstract int getInt(long p0);
    public final int getInt(Object p0,long p1){
       return this.unsafe.getInt(p0, p1);
    }
    public abstract long getLong(long p0);
    public final long getLong(Object p0,long p1){
       return this.unsafe.getLong(p0, p1);
    }
    public final Object getObject(Object p0,long p1){
       return this.unsafe.getObject(p0, p1);
    }
    public abstract Object getStaticObject(Field p0);
    public final long objectFieldOffset(Field p0){
       return this.unsafe.objectFieldOffset(p0);
    }
    public abstract void putBoolean(Object p0,long p1,boolean p2);
    public abstract void putByte(long p0,byte p1);
    public abstract void putByte(Object p0,long p1,byte p2);
    public abstract void putDouble(Object p0,long p1,double p2);
    public abstract void putFloat(Object p0,long p1,float p2);
    public abstract void putInt(long p0,int p1);
    public final void putInt(Object p0,long p1,int p2){
       this.unsafe.putInt(p0, p1, p2);
    }
    public abstract void putLong(long p0,long p1);
    public final void putLong(Object p0,long p1,long p2){
       this.unsafe.putLong(p0, p1, p2);
    }
    public final void putObject(Object p0,long p1,Object p2){
       this.unsafe.putObject(p0, p1, p2);
    }
}
