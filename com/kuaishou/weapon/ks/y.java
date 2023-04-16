package com.kuaishou.weapon.ks.y;
import java.lang.ClassLoader;
import java.lang.String;
import com.kuaishou.weapon.ks.ab;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import dalvik.system.InMemoryDexClassLoader;
import java.lang.Boolean;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.Exception;
import android.os.Build$VERSION;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;

public class y extends ClassLoader	// class@00123c
{
    public boolean c;
    public InMemoryDexClassLoader d;
    public ab e;
    public static int a = 4096;
    public static int b = 175662436;

    public void y(String p0,String p1,String p2,ClassLoader p3,boolean p4){
       super();
       this.c = false;
       this.d = null;
       this.e = null;
       p4 = this.a(false);
       this.c = p4;
       if (p4) {
          this.c = this.a(p0, p1, p2, p3);
       }
       if (this.c == null) {
          this.e = new ab(p0, p1, p2, p3);
       }
       return;
    }
    public final int a(byte[] p0,int p1){
       return ((p0[(p1 + 0)] & 0x00ff) | ((((p0[(p1 + 3)] & 0x00ff) << 24) | ((p0[(p1 + 2)] & 0x00ff) << 16)) | ((p0[(p1 + 1)] & 0x00ff) << 8)));
    }
    public Class a(String p0){
       if (this.c != null) {
          return this.c(p0);
       }
       return this.e.a(p0);
    }
    public final Class a(String p0,boolean p1){
       Class uClass2;
       Object[] objArray1;
       String str = String.class;
       Class[] uClassArray = new Class[]{str};
       Method declaredMeth = ClassLoader.class.getDeclaredMethod("findLoadedClass", uClassArray);
       declaredMeth.setAccessible(1);
       Object[] objArray = new Object[]{p0};
       Class uClass = declaredMeth.invoke(this.d, objArray);
       if (uClass == null) {
          uClassArray = new Class[]{str};
          Method declaredMeth1 = this.d.getParent().getClass().getDeclaredMethod("findClass", uClassArray);
          declaredMeth1.setAccessible(1);
          objArray = new Object[]{p0};
          Class uClass1 = declaredMeth1.invoke(this.d, objArray);
          uClass = uClass1;
       }
       if (uClass == null) {
          if (this.d.getParent() != null) {
             uClass2 = this.d.getParent().loadClass(p0);
          }else {
             uClassArray = new Class[]{str};
             objArray1 = new Object[]{p0};
             uClass2 = ClassLoader.class.getDeclaredMethod("findBootstrapClassOrNull", uClassArray).invoke(this.d, objArray1);
          }
          uClass = uClass2;
       }
       if (p1) {
          try{
             Class[] uClassArray1 = new Class[]{Class.class};
             Method declaredMeth2 = ClassLoader.class.getDeclaredMethod("resolveClass", uClassArray1);
             declaredMeth2.setAccessible(1);
             objArray1 = new Object[]{uClass};
             declaredMeth2.invoke(this.d, objArray1);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public final boolean a(String p0,String p1,String p2,ClassLoader p3){
       int i = 0;
       try{
          byte[] uobyteArray = this.b(p0);
          ByteBuffer uByteBuffer = ByteBuffer.allocate(uobyteArray.length);
          uByteBuffer.put(uobyteArray);
          uByteBuffer.position(i);
          ByteBuffer[] uByteBufferA = new ByteBuffer[]{uByteBuffer};
          this.d = new InMemoryDexClassLoader(uByteBufferA, p2, p3);
          return 1;
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return i;
       }
    }
    public final boolean a(boolean p0){
       if (Build$VERSION.SDK_INT < 29) {
          p0 = false;
       }
       return p0;
    }
    public final byte[] a(int p0){
       byte[] uobyteArray = new byte[]{(byte)(p0 & 0x00ff),(byte)((p0 >> 8) & 0x00ff),(byte)((p0 >> 16) & 0x00ff),(byte)((p0 >> 24) & 0x00ff)};
       return uobyteArray;
    }
    public final byte[] b(String p0){
       ByteArrayOutputStream uByteArrayOu;
       FileInputStream uFileInputSt;
       byte[] uobyteArray = null;
       try{
          try{
             uFileInputSt = new FileInputStream(p0);
             uByteArrayOu = new ByteArrayOutputStream();
             try{
                int i = 4;
                byte[] uobyteArray1 = new byte[i];
                uFileInputSt.read(uobyteArray1);
                i = this.a(uobyteArray1, 0);
                int b = y.b;
                int i1 = (i != b)? 1: 0;
                uByteArrayOu.write(this.a(b));
                b = y.a;
                byte[] uobyteArray2 = new byte[b];
                int i2 = uFileInputSt.read(uobyteArray2, 0, b);
                while (i2 > 0) {
                   if (i1) {
                      int i3 = 0;
                      int i4 = i2 / 4;
                      while (i3 < i4) {
                         i4 = i3 * 4;
                         i4 = this.a(uobyteArray2, i4) ^ i;
                         uByteArrayOu.write(this.a(i4));
                         i3 = i3 + 1;
                      }
                   }else {
                      uByteArrayOu.write(uobyteArray2, 0, i2);
                   }
                }
                uByteArrayOu.flush();
                uobyteArray = uByteArrayOu.toByteArray();
                try{
                   uFileInputSt.close();
                   uByteArrayOu.close();
                   return e0;
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
             uByteArrayOu = e0;
          }
          try{
             if (uFileInputSt) {
                uFileInputSt.close();
             }
             if (uByteArrayOu) {
                uByteArrayOu.close();
             }
             return e0;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
          uByteArrayOu = e0;
          uFileInputSt = uByteArrayOu;
          goto label_0072 ;
       }
    }
    public final Class c(String p0){
       String str = String.class;
       Class[] uClassArray = new Class[]{str};
       Method declaredMeth = ClassLoader.class.getDeclaredMethod("findLoadedClass", uClassArray);
       declaredMeth.setAccessible(1);
       Object[] objArray = new Object[]{p0};
       Class uClass = declaredMeth.invoke(this.d, objArray);
       if (uClass == null) {
          uClassArray = new Class[]{str};
          Method declaredMeth1 = this.d.getParent().getClass().getDeclaredMethod("findClass", uClassArray);
          declaredMeth1.setAccessible(1);
          Object[] objArray1 = new Object[]{p0};
          uClass = declaredMeth1.invoke(this.d, objArray1);
       }
       return uClass;
    }
    public Class loadClass(String p0,boolean p1){
       if (this.c != null) {
          return this.a(p0, p1);
       }
       return this.e.loadClass(p0, p1);
    }
}
