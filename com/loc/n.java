package com.loc.n;
import java.lang.String;
import java.lang.System;
import com.loc.l;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.loc.ak;
import android.content.Context;
import com.loc.s;
import com.loc.n$a;
import com.loc.p;
import java.io.ByteArrayOutputStream;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.x;
import com.loc.o;
import android.os.Build;
import android.os.Build$VERSION;
import com.loc.ag;
import com.loc.ah;
import com.loc.ai;
import java.security.PublicKey;
import java.lang.Object;
import java.security.Key;

public final class n	// class@001456
{

    public static String a(){
       String str = String.valueOf(System.currentTimeMillis());
       String str1 = "1";
       if (!l.a()) {
          str1 = "0";
       }
       int i = str.length();
       str = str.substring(0, (i - 2))+str1+str.substring((i - 1));
       return str;
    }
    public static String a(Context p0){
       return n.b(p0);
    }
    public static String a(Context p0,String p1,String p2){
       String str = s.a(l.e(p0)+":"+p1.substring(0, (p1.length() - 3))+":"+p2);
       return str;
    }
    public static String a(n$a p0){
       return p.b(n.b(p0));
    }
    public static void a(ByteArrayOutputStream p0,String p1){
       if (!TextUtils.isEmpty(p1)) {
          byte b = (p1.getBytes().length > 255)? -1: (byte)p1.getBytes().length;
          x.a(p0, b, x.a(p1));
          return;
       }else {
          byte[] uobyteArray = new byte[0];
          x.a(p0, 0, uobyteArray);
          return;
       }
    }
    public static byte[] a(Context p0,boolean p1,boolean p2){
       return n.b(n.b(p0, p1, p2));
    }
    public static byte[] a(byte[] p0){
       return p.a(p0);
    }
    public static n$a b(Context p0,boolean p1,boolean p2){
       byte b = 0;
       n$a uoa = new n$a(b);
       uoa.a = o.v(p0);
       uoa.b = o.k(p0);
       String str = o.h(p0);
       if (str == null) {
          str = "";
       }
       uoa.c = str;
       uoa.d = l.c(p0);
       uoa.e = Build.MODEL;
       uoa.f = Build.MANUFACTURER;
       uoa.g = Build.DEVICE;
       uoa.h = l.b(p0);
       uoa.i = l.d(p0);
       uoa.j = String.valueOf(Build$VERSION.SDK_INT);
       uoa.k = o.y(p0);
       uoa.l = o.r(p0);
       uoa.m = o.o(p0);
       uoa.n = o.n(p0);
       uoa.o = o.A(p0);
       uoa.p = o.m(p0);
       uoa.q = "";
       uoa.r = "";
       if (p1) {
          uoa.s = "";
          uoa.t = "";
       }else {
          String[] stringArray = o.d();
          uoa.s = stringArray[b];
          uoa.t = stringArray[1];
       }
       uoa.w = o.a();
       String str1 = o.a(p0);
       uoa.x = (!TextUtils.isEmpty(str1))? str1: "";
       uoa.y = "aid="+o.j(p0);
       if (!p2 || (ag.d || ag.e)) {
          str1 = o.g(p0);
          if (!TextUtils.isEmpty(str1)) {
             uoa.y = uoa.y+"|oaid="+str1;
          }
       }
       str1 = o.a(p0, ",");
       if (!TextUtils.isEmpty(str1)) {
          uoa.y = uoa.y+"|multiImeis="+str1;
       }
       str1 = o.x(p0);
       if (!TextUtils.isEmpty(str1)) {
          uoa.y = uoa.y+"|meid="+str1;
       }
       uoa.y = uoa.y+"|serial="+o.i(p0);
       str1 = o.b();
       if (!TextUtils.isEmpty(str1)) {
          uoa.y = uoa.y+"|adiuExtras="+str1;
       }
       uoa.y = uoa.y+"|storage="+o.f()+"|ram="+o.z(p0)+"|arch="+o.g();
       String str2 = ai.a().b();
       uoa.z = (!TextUtils.isEmpty(str2))? str2: "";
       return uoa;
    }
    public static String b(Context p0){
       return n.a(n.b(p0, false, false));
    }
    public static byte[] b(n$a p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       n.a(uByteArrayOu, p0.a);
       n.a(uByteArrayOu, p0.b);
       n.a(uByteArrayOu, p0.c);
       n.a(uByteArrayOu, p0.d);
       n.a(uByteArrayOu, p0.e);
       n.a(uByteArrayOu, p0.f);
       n.a(uByteArrayOu, p0.g);
       n.a(uByteArrayOu, p0.h);
       n.a(uByteArrayOu, p0.i);
       n.a(uByteArrayOu, p0.j);
       n.a(uByteArrayOu, p0.k);
       n.a(uByteArrayOu, p0.l);
       n.a(uByteArrayOu, p0.m);
       n.a(uByteArrayOu, p0.n);
       n.a(uByteArrayOu, p0.o);
       n.a(uByteArrayOu, p0.p);
       n.a(uByteArrayOu, p0.q);
       n.a(uByteArrayOu, p0.r);
       n.a(uByteArrayOu, p0.s);
       n.a(uByteArrayOu, p0.t);
       n.a(uByteArrayOu, p0.u);
       n.a(uByteArrayOu, p0.v);
       n.a(uByteArrayOu, p0.w);
       n.a(uByteArrayOu, p0.x);
       n.a(uByteArrayOu, p0.y);
       n.a(uByteArrayOu, p0.z);
       byte[] uobyteArray = n.b(x.b(uByteArrayOu.toByteArray()));
       uByteArrayOu.close();
       return uobyteArray;
    }
    public static byte[] b(byte[] p0){
       byte[] uobyteArray;
       PublicKey publicKey = x.d();
       if (p0.length > 117) {
          uobyteArray = new byte[117];
          System.arraycopy(p0, 0, uobyteArray, 0, 117);
          byte[] uobyteArray1 = p.a(uobyteArray, publicKey);
          uobyteArray = new byte[((p0.length + 128) - 117)];
          System.arraycopy(uobyteArray1, 0, uobyteArray, 0, 128);
          System.arraycopy(p0, 117, uobyteArray, 128, (p0.length - 117));
       }else {
          uobyteArray = p.a(p0, publicKey);
       }
       return uobyteArray;
    }
}
