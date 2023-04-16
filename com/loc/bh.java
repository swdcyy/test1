package com.loc.bh;
import com.loc.r;
import android.content.Context;
import com.loc.w;
import com.loc.bl;
import java.io.ByteArrayOutputStream;
import java.lang.String;
import com.loc.x;
import java.lang.Throwable;
import com.loc.ak;
import java.lang.Object;
import com.loc.n;
import java.util.Map;
import com.loc.l;
import java.util.HashMap;

public abstract class bh extends r	// class@001390
{
    public Context a;
    public w b;
    public byte[] c;

    public void bh(Context p0,w p1){
       super();
       if (p0 != null) {
          this.a = p0.getApplicationContext();
       }
       this.b = p1;
       this.r();
       return;
    }
    public static byte[] A(){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       uByteArrayOu.write(x.a("PANDORA$"));
       byte[] uobyteArray = new byte[]{1};
       uByteArrayOu.write(uobyteArray);
       byte[] uobyteArray1 = new byte[]{0};
       uByteArrayOu.write(uobyteArray1);
       uobyteArray1 = uByteArrayOu.toByteArray();
       uByteArrayOu.close();
       return uobyteArray1;
    }
    public static byte[] a(byte[] p0){
       return x.a(p0.length);
    }
    public final byte[] B(){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       int i = 1;
       byte[] uobyteArray = new byte[i];
       uobyteArray[0] = 3;
       uByteArrayOu.write(uobyteArray);
       byte[] uobyteArray1 = 2;
       if (this.i()) {
          bh ta = this.a;
          boolean b = this.k();
          bh tb = this.b;
          boolean b1 = (tb != null && ("navi").equals(tb.a()))? true: false;
          uobyteArray = n.a(ta, b, b1);
          uByteArrayOu.write(bh.a(uobyteArray));
          uByteArrayOu.write(uobyteArray);
       }else {
          uobyteArray = new byte[uobyteArray1];
          uobyteArray[0] = 0;
          uobyteArray[i] = 0;
          uByteArrayOu.write(uobyteArray);
       }
       uobyteArray = x.a(this.f());
       if (uobyteArray != null && uobyteArray.length > 0) {
          uByteArrayOu.write(bh.a(uobyteArray));
          uByteArrayOu.write(uobyteArray);
       }else {
          uobyteArray = new byte[uobyteArray1];
          uobyteArray[0] = 0;
          uobyteArray[i] = 0;
          uByteArrayOu.write(uobyteArray);
       }
       uobyteArray = x.a(this.j());
       if (uobyteArray != null && uobyteArray.length > 0) {
          uByteArrayOu.write(bh.a(uobyteArray));
          uByteArrayOu.write(uobyteArray);
       }else {
          uobyteArray = new byte[uobyteArray1];
          uobyteArray[0] = 0;
          uobyteArray[i] = 0;
          uByteArrayOu.write(uobyteArray);
       }
       byte[] uobyteArray2 = uByteArrayOu.toByteArray();
       uByteArrayOu.close();
       return uobyteArray2;
    }
    public final byte[] C(){
       byte[] uobyteArray1;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       int i = 1;
       byte[] uobyteArray = this.a_();
       if (uobyteArray == null || !uobyteArray.length) {
          uobyteArray = new byte[i];
          uobyteArray[0] = 0;
          uByteArrayOu.write(uobyteArray);
          uobyteArray1 = uByteArrayOu.toByteArray();
          uByteArrayOu.close();
          return uobyteArray1;
       }else {
          byte[] uobyteArray2 = new byte[i];
          uobyteArray2[0] = i;
          uByteArrayOu.write(uobyteArray2);
          uByteArrayOu.write(bh.a(uobyteArray));
          uByteArrayOu.write(uobyteArray);
          uobyteArray1 = uByteArrayOu.toByteArray();
          uByteArrayOu.close();
          return uobyteArray1;
       }
    }
    public final byte[] D(){
       byte[] uobyteArray1;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       int i = 1;
       byte[] uobyteArray = this.b_();
       if (uobyteArray == null || !uobyteArray.length) {
          uobyteArray = new byte[i];
          uobyteArray[0] = 0;
          uByteArrayOu.write(uobyteArray);
          uobyteArray1 = uByteArrayOu.toByteArray();
          uByteArrayOu.close();
          return uobyteArray1;
       }else {
          byte[] uobyteArray2 = new byte[i];
          uobyteArray2[0] = i;
          uByteArrayOu.write(uobyteArray2);
          uobyteArray = n.a(uobyteArray);
          uByteArrayOu.write(bh.a(uobyteArray));
          uByteArrayOu.write(uobyteArray);
          uobyteArray1 = uByteArrayOu.toByteArray();
          uByteArrayOu.close();
          return uobyteArray1;
       }
    }
    public abstract byte[] a_();
    public abstract byte[] b_();
    public Map d(){
       String str = l.f(this.a);
       String str1 = n.a();
       String str2 = n.a(this.a, str1, ("key=").concat(String.valueOf(str)));
       HashMap hashMap = new HashMap();
       hashMap.put("ts", str1);
       hashMap.put("key", str);
       hashMap.put("scode", str2);
       return hashMap;
    }
    public final byte[] e(){
       bh tc = this.c;
       if (tc != null) {
          return tc;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       uByteArrayOu.write(bh.A());
       uByteArrayOu.write(this.B());
       uByteArrayOu.write(this.C());
       uByteArrayOu.write(this.D());
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       this.c = uobyteArray;
       uByteArrayOu.close();
       return uobyteArray;
    }
    public String f(){
       return "2.1";
    }
    public boolean i(){
       return true;
    }
    public String j(){
       Object[] objArray = new Object[]{this.b.c(),this.b.a()};
       return String.format("platform=Android&sdkversion=%s&product=%s", objArray);
    }
    public boolean k(){
       return false;
    }
}
