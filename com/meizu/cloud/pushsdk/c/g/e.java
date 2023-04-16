package com.meizu.cloud.pushsdk.c.g.e;
import java.io.Serializable;
import java.lang.Comparable;
import java.lang.Object;
import java.io.InputStream;
import java.io.EOFException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.g.o;
import java.nio.charset.Charset;
import java.lang.Math;
import com.meizu.cloud.pushsdk.c.g.b;
import java.security.MessageDigest;
import java.lang.AssertionError;
import java.util.Arrays;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import java.io.ObjectOutputStream;

public class e implements Serializable, Comparable	// class@0014ee
{
    public final byte[] c;
    public int d;
    public String e;
    public static final char[] a;
    public static final e b;
    public static final long serialVersionUID;

    static {
       e.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       byte[] uobyteArray = new byte[0];
       e.b = e.a(uobyteArray);
    }
    public void e(byte[] p0){
       this.c = p0;
    }
    public static e a(InputStream p0,int p1){
       if (p0 == null) {
          throw new IllegalArgumentException("in == null");
       }
       if (p1 < 0) {
          throw new IllegalArgumentException("byteCount < 0: "+p1);
       }
       byte[] uobyteArray = new byte[p1];
       int i = 0;
       while (true) {
          if (i >= p1) {
             return new e(uobyteArray);
          }
          int i1 = p1 - i;
          i1 = p0.read(uobyteArray, i, i1);
          if (i1 != -1) {
             i = i + i1;
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public static e a(String p0){
       if (p0 == null) {
          throw new IllegalArgumentException("s == null");
       }
       e uoe = new e(p0.getBytes(o.a));
       uoe.e = p0;
       return uoe;
    }
    public static e a(byte[] p0){
       if (p0 != null) {
          return new e(p0.clone());
       }
       throw new IllegalArgumentException("data == null");
    }
    public byte a(int p0){
       return this.c[p0];
    }
    public int a(e p0){
       int i4;
       int i = this.d();
       int i1 = p0.d();
       int i2 = Math.min(i, i1);
       int i3 = 0;
       while (true) {
          i4 = -1;
          if (i3 < i2) {
             int i5 = this.a(i3) & 0x00ff;
             int i6 = p0.a(i3) & 0x00ff;
             if (i5 == i6) {
                i3 = i3 + 1;
             }else if(i5 < i6){
                i4 = 1;
                break ;
             }
             break ;
          }else if(i == i1){
             return 0;
          }else if(i < i1){
             i4 = 1;
          }
          return i4;
       }
       return i4;
    }
    public String a(){
       e te = this.e;
       if (te != null) {
       }else {
          te = new String(this.c, o.a);
          this.e = te;
       }
       return te;
    }
    public void a(b p0){
       e tc = this.c;
       p0.b(tc, 0, tc.length);
    }
    public boolean a(int p0,byte[] p1,int p2,int p3){
       e tc = this.c;
       boolean b = (p0 <= (tc.length - p3) && (p2 <= (p1.length - p3) && o.a(tc, p0, p1, p2, p3)))? true: false;
       return b;
    }
    public e b(){
       return this.b("MD5");
    }
    public final e b(String p0){
       try{
          return e.a(MessageDigest.getInstance(p0).digest(this.c));
       }catch(java.security.NoSuchAlgorithmException e2){
          throw new AssertionError(e2);
       }
    }
    public String c(){
       e tc = this.c;
       char[] uocharArray = new char[(tc.length * 2)];
       int len = tc.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          int b = tc[i];
          int i2 = i1 + 1;
          char[] a = e.a;
          int i3 = b >> 4;
          i3 = i3 & 0x0f;
          uocharArray[i1] = a[i3];
          i1 = i2 + 1;
          b = b & 0x0f;
          uocharArray[i2] = a[b];
       }
       return new String(uocharArray);
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public int d(){
       return this.c.length;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 instanceof e) {
          e tc = this.c;
          if (p0.d() == tc.length && p0.a(0, tc, 0, tc.length)) {
          label_001d :
             return b;
          }
       }
       b = false;
       goto label_001d ;
    }
    public int hashCode(){
       e td = this.d;
       if (td != null) {
       }else {
          td = Arrays.hashCode(this.c);
          this.d = td;
       }
       return td;
    }
    public final void readObject(ObjectInputStream p0){
       e uoe = e.a(p0, p0.readInt());
       try{
          Field declaredFiel = e.class.getDeclaredField("c");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, uoe.c);
          return;
       }catch(java.lang.NoSuchFieldException e0){
          throw new AssertionError();
       }catch(java.lang.IllegalAccessException e0){
          throw new AssertionError();
       }
    }
    public String toString(){
       Object[] objArray;
       e tc = this.c;
       if (!tc.length) {
          return "ByteString[size=0]";
       }
       if (tc.length <= 16) {
          objArray = new Object[]{Integer.valueOf(tc.length),this.c()};
          return String.format("ByteString[size=%s data=%s]", objArray);
       }else {
          objArray = new Object[]{Integer.valueOf(tc.length),this.b().c()};
          return String.format("ByteString[size=%s md5=%s]", objArray);
       }
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.writeInt(this.c.length);
       p0.write(this.c);
    }
}
