package com.google.protobuf.UnsafeUtil;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import com.google.protobuf.Android;
import java.lang.Long;
import java.lang.Integer;
import com.google.protobuf.UnsafeUtil$MemoryAccessor;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.nio.Buffer;
import java.lang.System;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Byte;
import com.google.protobuf.UnsafeUtil$Android64MemoryAccessor;
import com.google.protobuf.UnsafeUtil$Android32MemoryAccessor;
import com.google.protobuf.UnsafeUtil$JvmMemoryAccessor;
import com.google.protobuf.UnsafeUtil$1;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.lang.IndexOutOfBoundsException;
import java.lang.Float;
import java.lang.Double;
import java.util.logging.Level;
import java.lang.StringBuilder;

public final class UnsafeUtil	// class@0004e9
{
    public static final long BOOLEAN_ARRAY_BASE_OFFSET;
    public static final long BOOLEAN_ARRAY_INDEX_SCALE;
    public static final long BUFFER_ADDRESS_OFFSET;
    public static final int BYTE_ARRAY_ALIGNMENT;
    public static final long BYTE_ARRAY_BASE_OFFSET;
    public static final long DOUBLE_ARRAY_BASE_OFFSET;
    public static final long DOUBLE_ARRAY_INDEX_SCALE;
    public static final long FLOAT_ARRAY_BASE_OFFSET;
    public static final long FLOAT_ARRAY_INDEX_SCALE;
    public static final boolean HAS_UNSAFE_ARRAY_OPERATIONS;
    public static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    public static final long INT_ARRAY_BASE_OFFSET;
    public static final long INT_ARRAY_INDEX_SCALE;
    public static final boolean IS_ANDROID_32;
    public static final boolean IS_ANDROID_64;
    public static final boolean IS_BIG_ENDIAN;
    public static final long LONG_ARRAY_BASE_OFFSET;
    public static final long LONG_ARRAY_INDEX_SCALE;
    public static final UnsafeUtil$MemoryAccessor MEMORY_ACCESSOR;
    public static final Class MEMORY_CLASS;
    public static final long OBJECT_ARRAY_BASE_OFFSET;
    public static final long OBJECT_ARRAY_INDEX_SCALE;
    public static final Unsafe UNSAFE;
    public static final Logger logger;

    static {
       UnsafeUtil.logger = Logger.getLogger(UnsafeUtil.class.getName());
       UnsafeUtil.UNSAFE = UnsafeUtil.getUnsafe();
       UnsafeUtil.MEMORY_CLASS = Android.getMemoryClass();
       UnsafeUtil.IS_ANDROID_64 = UnsafeUtil.determineAndroidSupportByAddressSize(Long.TYPE);
       UnsafeUtil.IS_ANDROID_32 = UnsafeUtil.determineAndroidSupportByAddressSize(Integer.TYPE);
       UnsafeUtil.MEMORY_ACCESSOR = UnsafeUtil.getMemoryAccessor();
       UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS = UnsafeUtil.supportsUnsafeByteBufferOperations();
       UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.supportsUnsafeArrayOperations();
       long l = (long)UnsafeUtil.arrayBaseOffset(byte[].class);
       UnsafeUtil.BYTE_ARRAY_BASE_OFFSET = l;
       UnsafeUtil.BOOLEAN_ARRAY_BASE_OFFSET = (long)UnsafeUtil.arrayBaseOffset(boolean[].class);
       UnsafeUtil.BOOLEAN_ARRAY_INDEX_SCALE = (long)UnsafeUtil.arrayIndexScale(boolean[].class);
       UnsafeUtil.INT_ARRAY_BASE_OFFSET = (long)UnsafeUtil.arrayBaseOffset(int[].class);
       UnsafeUtil.INT_ARRAY_INDEX_SCALE = (long)UnsafeUtil.arrayIndexScale(int[].class);
       UnsafeUtil.LONG_ARRAY_BASE_OFFSET = (long)UnsafeUtil.arrayBaseOffset(long[].class);
       UnsafeUtil.LONG_ARRAY_INDEX_SCALE = (long)UnsafeUtil.arrayIndexScale(long[].class);
       UnsafeUtil.FLOAT_ARRAY_BASE_OFFSET = (long)UnsafeUtil.arrayBaseOffset(float[].class);
       UnsafeUtil.FLOAT_ARRAY_INDEX_SCALE = (long)UnsafeUtil.arrayIndexScale(float[].class);
       UnsafeUtil.DOUBLE_ARRAY_BASE_OFFSET = (long)UnsafeUtil.arrayBaseOffset(double[].class);
       UnsafeUtil.DOUBLE_ARRAY_INDEX_SCALE = (long)UnsafeUtil.arrayIndexScale(double[].class);
       UnsafeUtil.OBJECT_ARRAY_BASE_OFFSET = (long)UnsafeUtil.arrayBaseOffset(Object[].class);
       UnsafeUtil.OBJECT_ARRAY_INDEX_SCALE = (long)UnsafeUtil.arrayIndexScale(Object[].class);
       UnsafeUtil.BUFFER_ADDRESS_OFFSET = UnsafeUtil.fieldOffset(UnsafeUtil.bufferAddressField());
       UnsafeUtil.BYTE_ARRAY_ALIGNMENT = (int)(7 & l);
       boolean b = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN)? true: false;
       UnsafeUtil.IS_BIG_ENDIAN = b;
    }
    public void UnsafeUtil(){
       super();
    }
    public static long addressOffset(ByteBuffer p0){
       return UnsafeUtil.MEMORY_ACCESSOR.getLong(p0, UnsafeUtil.BUFFER_ADDRESS_OFFSET);
    }
    public static Object allocateInstance(Class p0){
       try{
          return UnsafeUtil.UNSAFE.allocateInstance(p0);
       }catch(java.lang.InstantiationException e1){
          throw new IllegalStateException(e1);
       }
    }
    public static int arrayBaseOffset(Class p0){
       int i = (UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS)? UnsafeUtil.MEMORY_ACCESSOR.arrayBaseOffset(p0): -1;
       return i;
    }
    public static int arrayIndexScale(Class p0){
       int i = (UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS)? UnsafeUtil.MEMORY_ACCESSOR.arrayIndexScale(p0): -1;
       return i;
    }
    public static Field bufferAddressField(){
       Field uField;
       if (Android.isOnAndroidDevice()) {
          uField = UnsafeUtil.field(Buffer.class, "effectiveDirectAddress");
          if (uField != null) {
             return uField;
          }
       }
       uField = UnsafeUtil.field(Buffer.class, "address");
       if (uField == null || uField.getType() != Long.TYPE) {
          uField = null;
       }
       return uField;
    }
    public static void copyMemory(long p0,byte[] p1,long p2,long p3){
       UnsafeUtil.MEMORY_ACCESSOR.copyMemory(p0, p1, p2, p3);
    }
    public static void copyMemory(byte[] p0,long p1,long p2,long p3){
       UnsafeUtil.MEMORY_ACCESSOR.copyMemory(p0, p1, p2, p3);
    }
    public static void copyMemory(byte[] p0,long p1,byte[] p2,long p3,long p4){
       System.arraycopy(p0, (int)p1, p2, (int)p3, (int)p4);
    }
    public static boolean determineAndroidSupportByAddressSize(Class p0){
       Class tYPE;
       Class tYPE1;
       if (!Android.isOnAndroidDevice()) {
          return false;
       }
       Class mEMORY_CLASS = UnsafeUtil.MEMORY_CLASS;
       Class[] uClassArray = new Class[]{p0,tYPE};
       tYPE = Boolean.TYPE;
       mEMORY_CLASS.getMethod("peekLong", uClassArray);
       Class[] uClassArray1 = new Class[]{p0,Long.TYPE,tYPE};
       mEMORY_CLASS.getMethod("pokeLong", uClassArray1);
       uClassArray1 = new Class[]{p0,tYPE1,tYPE};
       tYPE1 = Integer.TYPE;
       mEMORY_CLASS.getMethod("pokeInt", uClassArray1);
       uClassArray1 = new Class[]{p0,tYPE};
       mEMORY_CLASS.getMethod("peekInt", uClassArray1);
       Class[] uClassArray2 = new Class[]{p0,Byte.TYPE};
       mEMORY_CLASS.getMethod("pokeByte", uClassArray2);
       uClassArray2 = new Class[]{p0};
       mEMORY_CLASS.getMethod("peekByte", uClassArray2);
       uClassArray1 = new Class[]{p0,byte[].class,tYPE1,tYPE1};
       mEMORY_CLASS.getMethod("pokeByteArray", uClassArray1);
       uClassArray2 = new Class[]{p0,byte[].class,tYPE1,tYPE1};
       mEMORY_CLASS.getMethod("peekByteArray", uClassArray2);
       return 1;
    }
    public static Field field(Class p0,String p1){
       Field declaredFiel = p0.getDeclaredField(p1);
       return declaredFiel;
    }
    public static long fieldOffset(Field p0){
       long l;
       if (p0 != null) {
          UnsafeUtil$MemoryAccessor mEMORY_ACCES = UnsafeUtil.MEMORY_ACCESSOR;
          if (mEMORY_ACCES != null) {
             l = mEMORY_ACCES.objectFieldOffset(p0);
          label_000e :
             return l;
          }
       }
       l = -1;
       goto label_000e ;
    }
    public static int firstDifferingByteIndexNativeEndian(long p0,long p1){
       int i = (UnsafeUtil.IS_BIG_ENDIAN)? Long.numberOfLeadingZeros((p0 ^ p1)): Long.numberOfTrailingZeros((p0 ^ p1));
       return (i >> 3);
    }
    public static boolean getBoolean(Object p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getBoolean(p0, p1);
    }
    public static boolean getBoolean(boolean[] p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getBoolean(p0, (UnsafeUtil.BOOLEAN_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.BOOLEAN_ARRAY_INDEX_SCALE)));
    }
    public static boolean getBooleanBigEndian(Object p0,long p1){
       boolean b = (UnsafeUtil.getByteBigEndian(p0, p1))? true: false;
       return b;
    }
    public static boolean getBooleanLittleEndian(Object p0,long p1){
       boolean b = (UnsafeUtil.getByteLittleEndian(p0, p1))? true: false;
       return b;
    }
    public static byte getByte(long p0){
       return UnsafeUtil.MEMORY_ACCESSOR.getByte(p0);
    }
    public static byte getByte(Object p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getByte(p0, p1);
    }
    public static byte getByte(byte[] p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getByte(p0, (UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + p1));
    }
    public static byte getByteBigEndian(Object p0,long p1){
       return (byte)((UnsafeUtil.getInt(p0, (-4 & p1)) >> (int)(((~ p1) & 3) << 3)) & 0x00ff);
    }
    public static byte getByteLittleEndian(Object p0,long p1){
       return (byte)((UnsafeUtil.getInt(p0, (-4 & p1)) >> (int)((p1 & 3) << 3)) & 0x00ff);
    }
    public static double getDouble(Object p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getDouble(p0, p1);
    }
    public static double getDouble(double[] p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getDouble(p0, (UnsafeUtil.DOUBLE_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.DOUBLE_ARRAY_INDEX_SCALE)));
    }
    public static float getFloat(Object p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getFloat(p0, p1);
    }
    public static float getFloat(float[] p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getFloat(p0, (UnsafeUtil.FLOAT_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.FLOAT_ARRAY_INDEX_SCALE)));
    }
    public static int getInt(long p0){
       return UnsafeUtil.MEMORY_ACCESSOR.getInt(p0);
    }
    public static int getInt(Object p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getInt(p0, p1);
    }
    public static int getInt(int[] p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getInt(p0, (UnsafeUtil.INT_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.INT_ARRAY_INDEX_SCALE)));
    }
    public static long getLong(long p0){
       return UnsafeUtil.MEMORY_ACCESSOR.getLong(p0);
    }
    public static long getLong(Object p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getLong(p0, p1);
    }
    public static long getLong(long[] p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getLong(p0, (UnsafeUtil.LONG_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.LONG_ARRAY_INDEX_SCALE)));
    }
    public static UnsafeUtil$MemoryAccessor getMemoryAccessor(){
       Unsafe uNSAFE = UnsafeUtil.UNSAFE;
       UnsafeUtil$MemoryAccessor memoryAccess = null;
       if (uNSAFE == null) {
          return memoryAccess;
       }
       if (!Android.isOnAndroidDevice()) {
          return new UnsafeUtil$JvmMemoryAccessor(uNSAFE);
       }
       if (UnsafeUtil.IS_ANDROID_64) {
          return new UnsafeUtil$Android64MemoryAccessor(uNSAFE);
       }
       if (UnsafeUtil.IS_ANDROID_32) {
          memoryAccess = new UnsafeUtil$Android32MemoryAccessor(uNSAFE);
       }
       return memoryAccess;
    }
    public static Object getObject(Object p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getObject(p0, p1);
    }
    public static Object getObject(Object[] p0,long p1){
       return UnsafeUtil.MEMORY_ACCESSOR.getObject(p0, (UnsafeUtil.OBJECT_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.OBJECT_ARRAY_INDEX_SCALE)));
    }
    public static Object getStaticObject(Field p0){
       return UnsafeUtil.MEMORY_ACCESSOR.getStaticObject(p0);
    }
    public static Unsafe getUnsafe(){
       Unsafe unsafe = AccessController.doPrivileged(new UnsafeUtil$1());
       return unsafe;
    }
    public static boolean hasUnsafeArrayOperations(){
       return UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS;
    }
    public static boolean hasUnsafeByteBufferOperations(){
       return UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }
    public static boolean isAndroid64(){
       return UnsafeUtil.IS_ANDROID_64;
    }
    public static int mismatch(byte[] p0,int p1,byte[] p2,int p3,int p4){
       int i1;
       int i2;
       long bYTE_ARRAY_B;
       long l;
       if (p1 >= 0 && (p3 >= 0 && p4 >= 0)) {
          int i = p1 + p4;
          if (i <= p0.length) {
             i = p3 + p4;
             if (i <= p2.length) {
                i = 0;
                if (UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS) {
                   i1 = (UnsafeUtil.BYTE_ARRAY_ALIGNMENT + p1) & 0x07;
                   while (true) {
                      if (i < p4) {
                         i2 = i1 & 0x07;
                         if (i2) {
                            i2 = p1 + i;
                            int i3 = p3 + i;
                            if (p0[i2] != p2[i3]) {
                               return i;
                            }else {
                               i = i + 1;
                               i1 = i1 + 1;
                            }
                         }else {
                         label_0030 :
                            i1 = ((p4 - i) & 0xf8) + i;
                            while (true) {
                               if (i < i1) {
                                  bYTE_ARRAY_B = UnsafeUtil.BYTE_ARRAY_BASE_OFFSET;
                                  l = (long)p1 + bYTE_ARRAY_B;
                                  long l1 = (long)i;
                                  l = l + l1;
                                  l = UnsafeUtil.getLong(p0, l);
                                  bYTE_ARRAY_B = bYTE_ARRAY_B + (long)p3;
                                  bYTE_ARRAY_B = bYTE_ARRAY_B + l1;
                                  bYTE_ARRAY_B = UnsafeUtil.getLong(p2, bYTE_ARRAY_B);
                                  if (l - bYTE_ARRAY_B) {
                                  }else {
                                     i = i + 8;
                                  }
                               }
                            }
                            return (i + UnsafeUtil.firstDifferingByteIndexNativeEndian(l, bYTE_ARRAY_B));
                         }
                      }else {
                         goto label_0030 ;
                      }
                   }
                   return -1;
                }
                while (true) {
                   if (i >= p4) {
                      return -1;
                   }
                   i1 = p1 + i;
                   i2 = p3 + i;
                   if (p0[i1] != p2[i2]) {
                      break ;
                   }else {
                      i = i + 1;
                   }
                }
                return i;
             }
          }
       }
       throw new IndexOutOfBoundsException();
    }
    public static long objectFieldOffset(Field p0){
       return UnsafeUtil.MEMORY_ACCESSOR.objectFieldOffset(p0);
    }
    public static void putBoolean(Object p0,long p1,boolean p2){
       UnsafeUtil.MEMORY_ACCESSOR.putBoolean(p0, p1, p2);
    }
    public static void putBoolean(boolean[] p0,long p1,boolean p2){
       UnsafeUtil.MEMORY_ACCESSOR.putBoolean(p0, (UnsafeUtil.BOOLEAN_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.BOOLEAN_ARRAY_INDEX_SCALE)), p2);
    }
    public static void putBooleanBigEndian(Object p0,long p1,boolean p2){
       UnsafeUtil.putByteBigEndian(p0, p1, (byte)p2);
    }
    public static void putBooleanLittleEndian(Object p0,long p1,boolean p2){
       UnsafeUtil.putByteLittleEndian(p0, p1, (byte)p2);
    }
    public static void putByte(long p0,byte p1){
       UnsafeUtil.MEMORY_ACCESSOR.putByte(p0, p1);
    }
    public static void putByte(Object p0,long p1,byte p2){
       UnsafeUtil.MEMORY_ACCESSOR.putByte(p0, p1, p2);
    }
    public static void putByte(byte[] p0,long p1,byte p2){
       UnsafeUtil.MEMORY_ACCESSOR.putByte(p0, (UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + p1), p2);
    }
    public static void putByteBigEndian(Object p0,long p1,byte p2){
       long l = -4 & p1;
       int i = ((~ (int)p1) & 0x03) << 3;
       UnsafeUtil.putInt(p0, l, (((255 & p2) << i) | (UnsafeUtil.getInt(p0, l) & (~ (255 << i)))));
    }
    public static void putByteLittleEndian(Object p0,long p1,byte p2){
       long l = -4 & p1;
       int i = ((int)p1 & 0x03) << 3;
       UnsafeUtil.putInt(p0, l, (((255 & p2) << i) | (UnsafeUtil.getInt(p0, l) & (~ (255 << i)))));
    }
    public static void putDouble(Object p0,long p1,double p2){
       UnsafeUtil.MEMORY_ACCESSOR.putDouble(p0, p1, p2);
    }
    public static void putDouble(double[] p0,long p1,double p2){
       UnsafeUtil.MEMORY_ACCESSOR.putDouble(p0, (UnsafeUtil.DOUBLE_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.DOUBLE_ARRAY_INDEX_SCALE)), p2);
    }
    public static void putFloat(Object p0,long p1,float p2){
       UnsafeUtil.MEMORY_ACCESSOR.putFloat(p0, p1, p2);
    }
    public static void putFloat(float[] p0,long p1,float p2){
       UnsafeUtil.MEMORY_ACCESSOR.putFloat(p0, (UnsafeUtil.FLOAT_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.FLOAT_ARRAY_INDEX_SCALE)), p2);
    }
    public static void putInt(long p0,int p1){
       UnsafeUtil.MEMORY_ACCESSOR.putInt(p0, p1);
    }
    public static void putInt(Object p0,long p1,int p2){
       UnsafeUtil.MEMORY_ACCESSOR.putInt(p0, p1, p2);
    }
    public static void putInt(int[] p0,long p1,int p2){
       UnsafeUtil.MEMORY_ACCESSOR.putInt(p0, (UnsafeUtil.INT_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.INT_ARRAY_INDEX_SCALE)), p2);
    }
    public static void putLong(long p0,long p1){
       UnsafeUtil.MEMORY_ACCESSOR.putLong(p0, p1);
    }
    public static void putLong(Object p0,long p1,long p2){
       UnsafeUtil.MEMORY_ACCESSOR.putLong(p0, p1, p2);
    }
    public static void putLong(long[] p0,long p1,long p2){
       UnsafeUtil.MEMORY_ACCESSOR.putLong(p0, (UnsafeUtil.LONG_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.LONG_ARRAY_INDEX_SCALE)), p2);
    }
    public static void putObject(Object p0,long p1,Object p2){
       UnsafeUtil.MEMORY_ACCESSOR.putObject(p0, p1, p2);
    }
    public static void putObject(Object[] p0,long p1,Object p2){
       UnsafeUtil.MEMORY_ACCESSOR.putObject(p0, (UnsafeUtil.OBJECT_ARRAY_BASE_OFFSET + (p1 * UnsafeUtil.OBJECT_ARRAY_INDEX_SCALE)), p2);
    }
    public static boolean supportsUnsafeArrayOperations(){
       Class tYPE;
       Object obj = Object.class;
       Unsafe uNSAFE = UnsafeUtil.UNSAFE;
       if (uNSAFE == null) {
          return false;
       }
       Class class = uNSAFE.getClass();
       Class[] uClassArray = new Class[]{Field.class};
       class.getMethod("objectFieldOffset", uClassArray);
       uClassArray = new Class[]{Class.class};
       class.getMethod("arrayBaseOffset", uClassArray);
       uClassArray = new Class[]{Class.class};
       class.getMethod("arrayIndexScale", uClassArray);
       Class[] uClassArray1 = new Class[]{obj,tYPE};
       tYPE = Long.TYPE;
       class.getMethod("getInt", uClassArray1);
       int i = 3;
       Class[] uClassArray2 = new Class[i];
       uClassArray2[0] = obj;
       uClassArray2[1] = tYPE;
       uClassArray2[2] = Integer.TYPE;
       class.getMethod("putInt", uClassArray2);
       uClassArray2 = new Class[]{obj,tYPE};
       class.getMethod("getLong", uClassArray2);
       uClassArray2 = new Class[i];
       uClassArray2[0] = obj;
       uClassArray2[1] = tYPE;
       uClassArray2[2] = tYPE;
       class.getMethod("putLong", uClassArray2);
       uClassArray2 = new Class[]{obj,tYPE};
       class.getMethod("getObject", uClassArray2);
       uClassArray2 = new Class[i];
       uClassArray2[0] = obj;
       uClassArray2[1] = tYPE;
       uClassArray2[2] = obj;
       class.getMethod("putObject", uClassArray2);
       if (Android.isOnAndroidDevice()) {
          return 1;
       }
       uClassArray2 = new Class[]{obj,tYPE};
       class.getMethod("getByte", uClassArray2);
       uClassArray2 = new Class[i];
       uClassArray2[0] = obj;
       uClassArray2[1] = tYPE;
       uClassArray2[2] = Byte.TYPE;
       class.getMethod("putByte", uClassArray2);
       uClassArray2 = new Class[]{obj,tYPE};
       class.getMethod("getBoolean", uClassArray2);
       uClassArray2 = new Class[i];
       uClassArray2[0] = obj;
       uClassArray2[1] = tYPE;
       uClassArray2[2] = Boolean.TYPE;
       class.getMethod("putBoolean", uClassArray2);
       uClassArray2 = new Class[]{obj,tYPE};
       class.getMethod("getFloat", uClassArray2);
       uClassArray2 = new Class[i];
       uClassArray2[0] = obj;
       uClassArray2[1] = tYPE;
       uClassArray2[2] = Float.TYPE;
       class.getMethod("putFloat", uClassArray2);
       uClassArray2 = new Class[]{obj,tYPE};
       class.getMethod("getDouble", uClassArray2);
       uClassArray1 = new Class[i];
       uClassArray1[0] = obj;
       uClassArray1[1] = tYPE;
       uClassArray1[2] = Double.TYPE;
       class.getMethod("putDouble", uClassArray1);
       return 1;
    }
    public static boolean supportsUnsafeByteBufferOperations(){
       Class tYPE;
       String str = "getLong";
       Unsafe uNSAFE = UnsafeUtil.UNSAFE;
       if (uNSAFE == null) {
          return false;
       }
       Class class = uNSAFE.getClass();
       Class[] uClassArray = new Class[]{Field.class};
       class.getMethod("objectFieldOffset", uClassArray);
       uClassArray = new Class[]{Object.class,tYPE};
       tYPE = Long.TYPE;
       class.getMethod(str, uClassArray);
       if (UnsafeUtil.bufferAddressField() == null) {
          return false;
       }
       if (Android.isOnAndroidDevice()) {
          return 1;
       }
       Class[] uClassArray1 = new Class[]{tYPE};
       class.getMethod("getByte", uClassArray1);
       uClassArray1 = new Class[]{tYPE,Byte.TYPE};
       class.getMethod("putByte", uClassArray1);
       uClassArray1 = new Class[]{tYPE};
       class.getMethod("getInt", uClassArray1);
       uClassArray1 = new Class[]{tYPE,Integer.TYPE};
       class.getMethod("putInt", uClassArray1);
       uClassArray = new Class[]{tYPE};
       class.getMethod(str, uClassArray);
       uClassArray = new Class[]{tYPE,tYPE};
       class.getMethod("putLong", uClassArray);
       uClassArray = new Class[]{tYPE,tYPE,tYPE};
       class.getMethod("copyMemory", uClassArray);
       uClassArray = new Class[]{Object.class,tYPE,Object.class,tYPE,tYPE};
       class.getMethod("copyMemory", uClassArray);
       return 1;
    }
}
