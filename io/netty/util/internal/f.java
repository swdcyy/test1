package io.netty.util.internal.f;
import java.lang.Object;
import java.lang.Class;
import ard.b;
import ard.c;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.String;
import java.lang.reflect.Field;
import sun.misc.Unsafe;
import java.lang.Long;
import java.lang.reflect.Method;
import java.lang.ClassLoader;
import java.lang.Boolean;
import zqd.x;
import io.netty.util.internal.f$a;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.lang.Throwable;
import java.lang.Math;
import zqd.o;

public final class f	// class@001183
{
    public static final b a;
    public static final Unsafe b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
       Unsafe unsafe;
       Class tYPE;
       Object obj = Object.class;
       char[] uocharArray = char[].class;
       f.a = c.a(f.class);
       int i = 1;
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(i);
       Field obj1 = null;
       Field declaredFiel = Buffer.class.getDeclaredField("address");
       declaredFiel.setAccessible(i);
       int i1 = 0;
       if (declaredFiel.getLong(ByteBuffer.allocate(i)) - i1) {
       }else if(!declaredFiel.getLong(uByteBuffer) - i1){
       label_0037 :
          b a = f.a;
          String str = "available";
          String str1 = "unavailable";
          String str2 = (declaredFiel != null)? str: str1;
          a.debug("java.nio.Buffer.address: {}", str2);
          if (declaredFiel != null) {
             Field declaredFiel1 = Unsafe.class.getDeclaredField("theUnsafe");
             declaredFiel1.setAccessible(i);
             unsafe = declaredFiel1.get(obj1);
             String str3 = "sun.misc.Unsafe.theUnsafe: {}";
             if (unsafe == null) {
                str = str1;
             }
             a.debug(str3, str);
             if (unsafe != null) {
                try{
                   Class[] uClassArray = new Class[]{obj,tYPE,obj,tYPE,tYPE};
                   tYPE = Long.TYPE;
                   unsafe.getClass().getDeclaredMethod("copyMemory", uClassArray);
                   a.debug("sun.misc.Unsafe.copyMemory: available");
                }catch(java.lang.NoSuchMethodError e0){
                   f.a.debug("sun.misc.Unsafe.copyMemory: unavailable");
                   throw e0;
                }catch(java.lang.NoSuchMethodException e0){
                   f.a.debug("sun.misc.Unsafe.copyMemory: unavailable");
                   throw e0;
                }
             }
          }else {
             unsafe = obj1;
          }
          f.b = unsafe;
          long l = -1;
          if (unsafe == null) {
             f.c = l;
             f.f = l;
             f.e = l;
             f.d = l;
             f.h = false;
             f.g = l;
          }else {
             f.c = f.o(declaredFiel);
             f.d = (long)unsafe.arrayBaseOffset(byte[].class);
             f.e = (long)unsafe.arrayBaseOffset(uocharArray);
             f.f = (long)unsafe.arrayIndexScale(uocharArray);
             Class[] uClassArray1 = new Class[0];
             Method declaredMeth = Class.forName("java.nio.Bits", 0, ClassLoader.getSystemClassLoader()).getDeclaredMethod("unaligned", uClassArray1);
             declaredMeth.setAccessible(i);
             Object[] objArray = new Object[0];
             boolean b = Boolean.TRUE.equals(declaredMeth.invoke(obj1, objArray));
             f.h = b;
             f.a.debug("java.nio.Bits.unaligned: {}", Boolean.valueOf(b));
             obj1 = AccessController.doPrivileged(new f$a());
             if (obj1 != null) {
                l = f.b.objectFieldOffset(obj1);
             }
             f.g = l;
          }
       }
       declaredFiel = obj1;
       goto label_0037 ;
    }
    public void f(){
       super();
    }
    public static int a(){
       return f.b.addressSize();
    }
    public static void b(long p0,long p1,long p2){
       while (p2 > 0) {
          long l = Math.min(p2, 0x100000);
          f.b.copyMemory(p0, p1, l);
          p2 = p2 - l;
          p0 = p0 + l;
          p1 = p1 + l;
       }
       return;
    }
    public static void c(Object p0,long p1,Object p2,long p3,long p4){
       long l = p1;
       long l1 = p3;
       long l2 = p4;
       while (l2 > 0) {
          long l3 = Math.min(l2, 0x100000);
          f.b.copyMemory(p0, l, p2, l1, l3);
          l2 = l2 - l3;
          l = l + l3;
          l1 = l1 + l3;
       }
       return;
    }
    public static byte d(long p0){
       return f.b.getByte(p0);
    }
    public static byte e(byte[] p0,int p1){
       return f.b.getByte(p0, (f.d + (long)p1));
    }
    public static int f(long p0){
       return f.b.getInt(p0);
    }
    public static int g(byte[] p0,int p1){
       return f.b.getInt(p0, (f.d + (long)p1));
    }
    public static long h(long p0){
       return f.b.getLong(p0);
    }
    public static long i(Object p0,long p1){
       return f.b.getLong(p0, p1);
    }
    public static long j(byte[] p0,int p1){
       return f.b.getLong(p0, (f.d + (long)p1));
    }
    public static Object k(Object p0,long p1){
       return f.b.getObject(p0, p1);
    }
    public static short l(long p0){
       return f.b.getShort(p0);
    }
    public static short m(byte[] p0,int p1){
       return f.b.getShort(p0, (f.d + (long)p1));
    }
    public static boolean n(){
       boolean b = (f.b != null)? true: false;
       return b;
    }
    public static long o(Field p0){
       return f.b.objectFieldOffset(p0);
    }
    public static void p(long p0,byte p1){
       f.b.putByte(p0, p1);
    }
    public static void q(byte[] p0,int p1,byte p2){
       f.b.putByte(p0, (f.d + (long)p1), p2);
    }
    public static void r(long p0,int p1){
       f.b.putInt(p0, p1);
    }
    public static void s(byte[] p0,int p1,int p2){
       f.b.putInt(p0, (f.d + (long)p1), p2);
    }
    public static void t(long p0,long p1){
       f.b.putLong(p0, p1);
    }
    public static void u(byte[] p0,int p1,long p2){
       f.b.putLong(p0, (f.d + (long)p1), p2);
    }
    public static void v(long p0,short p1){
       f.b.putShort(p0, p1);
    }
    public static void w(byte[] p0,int p1,short p2){
       f.b.putShort(p0, (f.d + (long)p1), p2);
    }
    public static void x(Throwable p0){
       o.a(p0, "cause");
       f.b.throwException(p0);
    }
}
