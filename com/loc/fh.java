package com.loc.fh;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.es;
import java.lang.Math;
import android.content.Context;
import com.loc.et;
import com.loc.ex;
import android.net.ConnectivityManager;
import com.loc.ev;
import com.loc.l;
import com.loc.fq;
import java.lang.StringBuilder;
import android.telephony.TelephonyManager;
import com.loc.o;
import android.os.Build$VERSION;
import android.net.NetworkInfo;
import java.util.Collection;
import android.net.wifi.WifiInfo;
import com.kwai.framework.deviceid.a;
import android.os.Build;
import java.util.Iterator;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Integer;
import com.loc.dy;
import com.loc.eu;
import java.util.zip.CRC32;

public final class fh	// class@00142c
{
    public ArrayList A;
    public ArrayList B;
    public String C;
    public String D;
    public ArrayList E;
    public String F;
    public String G;
    public byte[] H;
    public String J;
    public String L;
    public String M;
    public String N;
    public int O;
    public final int P;
    public byte[] Q;
    public int R;
    public List S;
    public List T;
    public String a;
    public short b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public int z;
    public static String I;
    public static String K;

    public void fh(){
       super();
       this.a = "1";
       this.b = 0;
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.j = null;
       this.k = null;
       this.l = null;
       this.m = null;
       this.n = null;
       this.o = null;
       this.p = null;
       this.q = null;
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.w = null;
       this.x = null;
       this.y = null;
       this.z = 0;
       this.A = new ArrayList();
       this.B = new ArrayList();
       this.C = null;
       this.D = null;
       this.E = new ArrayList();
       this.F = null;
       this.G = null;
       this.H = null;
       this.Q = null;
       this.R = 0;
       this.J = null;
       this.L = null;
       this.M = null;
       this.N = null;
       this.O = 0;
       this.S = null;
       this.T = Collections.synchronizedList(new ArrayList());
       this.P = 3;
    }
    public static int a(String p0,byte[] p1,int p2){
       if (TextUtils.isEmpty(p0)) {
          p1[p2] = 0;
          p2++;
       }else {
          byte[] bytes = p0.getBytes("GBK");
          int len = bytes.length;
          if (len > 127) {
             len = 127;
          }
          p1[p2] = (byte)len;
          p2++;
          System.arraycopy(bytes, 0, p1, p2, len);
          p2 = p2 + len;
       }
       return p2;
    }
    public static void a(es p0,List p1){
       if (p0 != null && p1 != null) {
          int i = p1.size();
          if (!i) {
             p1.add(p0);
             return;
          }else {
             long l = Long.MAX_VALUE;
             int i1 = 0;
             int i2 = -1;
             es uoes = -1;
             while (true) {
                if (i1 < i) {
                   es uoes1 = p1.get(i1);
                   if (p0.c() != null && (p0.c()).equals(uoes1.c())) {
                      es s = p0.s;
                      if (s != uoes1.s) {
                         uoes1.t = p0.t;
                         uoes1.s = s;
                      label_0051 :
                         if (i2 >= null) {
                            if (i < 3) {
                               p1.add(p0);
                               return;
                            }else if(p0.t - l > 0 && i2 < i){
                               p1.remove(i2);
                               p1.add(p0);
                               break ;
                            }
                         }
                      }else {
                         goto label_0051 ;
                      }
                   }else {
                      l = Math.min(l, uoes1.t);
                      if (!l - uoes1.t) {
                         uoes = i1;
                      }
                      i1 = i1 + 1;
                   }
                }else {
                   i2 = uoes;
                   goto label_0051 ;
                }
             }
          }
       }
       return;
    }
    public final void a(Context p0,boolean p1,boolean p2,et p3,ex p4,ConnectivityManager p5,String p6,ev p7){
       String str1;
       String str2;
       String str7;
       StringBuilder str8;
       short b;
       String str9;
       fh e;
       fh uofh = this;
       String str = l.f(p0);
       int i = fq.d();
       uofh.J = p6;
       uofh.S = null;
       if (!p2) {
          str1 = "UC_nlp_20131029";
          str2 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
       }else {
          str1 = "api_serverSDK_130905";
          str2 = "S128DF1572465B890OE3F7A13167KLEI";
       }
       String str3 = str2;
       str2 = str1;
       StringBuilder str4 = "";
       int i1 = p3.g();
       TelephonyManager telephonyMan = p3.i();
       ArrayList uArrayList = p3.c();
       ArrayList uArrayList1 = p3.d();
       ArrayList uArrayList2 = p4.e();
       String str5 = "1";
       String str6 = (p3.h() == 2)? str5: "0";
       if (telephonyMan != null) {
          if (TextUtils.isEmpty(fj.g)) {
             fj.g = o.v(p0);
          }
          str7 = str5;
          str5 = "888888888888888";
          str8 = str4;
          b = 29;
          if (TextUtils.isEmpty(fj.g) && Build$VERSION.SDK_INT < b) {
             fj.g = str5;
          }
          if (TextUtils.isEmpty(fj.h)) {
             try{
                fj.h = o.y(p0);
             }catch(java.lang.SecurityException e0){
             }
          }
       }else {
          str8 = str4;
          str7 = str5;
       }
    label_00a3 :
       NetworkInfo activeNetwor = p5.getActiveNetworkInfo();
       b = p4.a(p5);
       if (fq.a(activeNetwor) != -1) {
          str1 = fq.a(p0, telephonyMan);
          str9 = (b)? "2": str7;
       }else {
          str1 = "";
          str9 = str1;
       }
       int i2 = i1;
       if ((i1 & 0x04) == 4 && !uArrayList1.isEmpty()) {
          uofh.B.clear();
          uofh.B.addAll(uArrayList1);
       }else {
          uofh.B.clear();
       }
       uofh.A.clear();
       uofh.A.addAll(uArrayList);
       StringBuilder str10 = "";
       if (p4.k()) {
          if (b) {
             WifiInfo wifiInfo = p4.m();
             if (ex.a(wifiInfo)) {
                String str11 = ",";
                str10 = str10+a.a(wifiInfo)+str11;
                int rssi = wifiInfo.getRssi();
                if (rssi < -128 || rssi > 127) {
                   rssi = 0;
                }
                str10 = str10+rssi+str11;
                str11 = a.f(wifiInfo);
                try{
                   uArrayList1 = 32;
                   b = (a.f(wifiInfo)).getBytes("UTF-8").length;
                }catch(java.lang.Exception e0){
                   b = 32;
                }
                if (b >= uArrayList1) {
                   str11 = "unkwn";
                }
                str10 = str10+str11.replace("*", ".");
             }
          }
          if (uArrayList2 != null) {
             e = uofh.E;
             if (e != null) {
                e.clear();
                uofh.E.addAll(uArrayList2);
             }
          }
       }else {
          p4.g();
          e = uofh.E;
          if (e != null) {
             e.clear();
          }
       }
       b = 0;
       uofh.b = b;
       if (!p1) {
          uofh.b = (short)(2 | b);
       }
       uofh.c = str2;
       uofh.d = str3;
       uofh.f = Build.MODEL;
       uofh.g = "android"+Build$VERSION.RELEASE;
       uofh.h = fq.b(p0);
       uofh.i = str6;
       uofh.j = "0";
       uofh.k = "0";
       uofh.l = "0";
       uofh.m = "0";
       uofh.n = "0";
       uofh.o = str;
       uofh.p = fj.g;
       uofh.q = fj.h;
       uofh.s = String.valueOf(i);
       uofh.t = fq.i(p0);
       uofh.v = "6.1.0";
       uofh.w = null;
       uofh.u = "";
       uofh.x = e0;
       uofh.y = str9;
       uofh.z = i2;
       uofh.C = p3.l();
       uofh.F = ex.p();
       uofh.D = str10;
       uofh.O = (int)((fq.b() - p4.q()) / 1000);
       if (TextUtils.isEmpty(fh.I)) {
          fh.I = o.h(p0);
       }
       if (TextUtils.isEmpty(fh.K)) {
          fh.K = o.a(p0);
       }
       if (TextUtils.isEmpty(uofh.M)) {
          uofh.M = o.i(p0);
       }
       if (TextUtils.isEmpty(uofh.N)) {
          uofh.N = o.g(p0);
       }
       uofh.S = p7.a(uofh.B, uofh.E);
       uofh.a(uofh.A, uofh.B);
       (str8).delete(0, str8.length());
       str10.delete(0, str10.length());
       return;
    }
    public final void a(ArrayList p0,ArrayList p1){
       if (p1 != null && p1.size() > 0) {
          Iterator iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                es uoes = iterator.next();
                if (uoes.r != null && uoes.n != null) {
                   fh.a(uoes, this.T);
                   return;
                }
             }
          }
       }
       if (p0 != null && p0.size() > 0) {
          fh.a(p0.get(0), this.T);
       }
       return;
    }
    public final byte[] a(){
       byte[] uobyteArray2;
       int len;
       byte[] uobyteArray5;
       long l2;
       fh uofh2;
       es uoes1;
       es l3;
       byte[] uobyteArray7;
       byte[] uobyteArray8;
       int i8;
       es k;
       long l4;
       int i9;
       byte[] uobyteArray9;
       byte b;
       int i10;
       byte[] uobyteArray10;
       int i11;
       Iterator iterator;
       es uoes3;
       long l5;
       eu uoeu;
       long l6;
       double d;
       double d1;
       float f;
       CRC32 uCRC32;
       dy uody;
       dy c;
       byte[] uobyteArray11;
       String[] stringArray;
       fh uofh3;
       fh uofh = this;
       this.b();
       int i = 2;
       byte[] uobyteArray = new byte[i];
       byte[] uobyteArray1 = new byte[4];
       fh h = uofh.H;
       int i1 = 4096;
       int i2 = 1;
       if (h != null) {
          i1 = i1 + (h.length + i2);
       }
       h = uofh.Q;
       if (h == null || i1 > uofh.R) {
          uobyteArray2 = new byte[i1];
          uofh.Q = uobyteArray2;
          uofh.R = i1;
       }
       fh uofh1 = uobyteArray2;
       int i3 = 0;
       uofh1[i3] = fq.g(uofh.a);
       byte[] uobyteArray3 = null;
       uobyteArray2 = fq.a(uofh.b, uobyteArray3);
       System.arraycopy(uobyteArray2, i3, uofh1, i2, uobyteArray2.length);
       int i4 = fh.a(uofh.q, uofh1, fh.a(uofh.p, uofh1, fh.a(uofh.h, uofh1, fh.a(uofh.u, uofh1, fh.a(uofh.g, uofh1, fh.a(uofh.f, uofh1, fh.a(uofh.e, uofh1, fh.a(uofh.o, uofh1, fh.a(uofh.d, uofh1, fh.a(uofh.c, uofh1, (uobyteArray2.length + i2)))))))))));
       if (TextUtils.isEmpty(uofh.t)) {
          uofh1[i4] = i3;
          i4 = i4 + i2;
       }else {
          uobyteArray2 = uofh.a(uofh.t);
          uofh1[i4] = (byte)uobyteArray2.length;
          i4 = i4 + 1;
          System.arraycopy(uobyteArray2, i3, uofh1, i4, uobyteArray2.length);
          i4 = i4 + uobyteArray2.length;
       }
       int i5 = fh.a(uofh.x, uofh1, fh.a(fh.K, uofh1, fh.a(fh.I, uofh1, fh.a(uofh.w, uofh1, fh.a(uofh.v, uofh1, i4)))));
       uofh1[i5] = Byte.parseByte(uofh.y);
       i5 = i5 + i2;
       uofh1[i5] = Byte.parseByte(uofh.j);
       i5 = i5 + i2;
       fh z = uofh.z;
       int i6 = z & 0x03;
       uofh1[i5] = (byte)z;
       i5 = i5 + i2;
       z = -128;
       long l = 1000;
       long l1 = 0;
       es uoes = 127;
       if (i6 == i2 || i6 == i) {
          es a = (uofh.A.size() > 0)? uofh.A.get(i3).a: 0;
          byte[] uobyteArray4 = fq.a(a, uobyteArray3);
          System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
          i5 = i5 + uobyteArray4.length;
          if (i6 == i2) {
             a = (uofh.A.size() > 0)? uofh.A.get(i3).b: 0;
             uobyteArray4 = fq.a(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             i5 = i5 + uobyteArray4.length;
             a = (uofh.A.size() > 0)? uofh.A.get(i3).c: 0;
             uobyteArray4 = fq.a(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             i5 = i5 + uobyteArray4.length;
             a = (uofh.A.size() > 0)? uofh.A.get(i3).d: 0;
             uobyteArray4 = fq.b(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             len = uobyteArray4.length;
          }else if(i6 == i){
             a = (uofh.A.size() > 0)? uofh.A.get(i3).h: 0;
             uobyteArray4 = fq.a(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             i5 = i5 + uobyteArray4.length;
             a = (uofh.A.size() > 0)? uofh.A.get(i3).i: 0;
             uobyteArray4 = fq.a(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             i5 = i5 + uobyteArray4.length;
             a = (uofh.A.size() > 0)? uofh.A.get(i3).j: 0;
             uobyteArray4 = fq.a(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             i5 = i5 + uobyteArray4.length;
             a = (uofh.A.size() > 0)? uofh.A.get(i3).g: 0;
             uobyteArray4 = fq.b(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             i5 = i5 + uobyteArray4.length;
             a = (uofh.A.size() > 0)? uofh.A.get(i3).f: 0;
             uobyteArray4 = fq.b(a, uobyteArray3);
             System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
             len = uobyteArray4.length;
          }else if(uofh.A.size() > 0){
             a = uofh.A.get(i3).k;
          }else {
             a = null;
          }
          if (a > uoes || a < z) {
             len = 0;
          }
          uofh1[i5] = (byte)len;
          i5 = i5 + i2;
          if (uofh.A.size() > 0) {
             uobyteArray5 = uobyteArray1;
             l2 = (fq.b() - uofh.A.get(i3).t) / l;
          }else {
             uobyteArray5 = uobyteArray1;
             l2 = l1;
          }
          uofh2 = 0xffff;
          if (l2 - uofh2 > 0) {
             l2 = uofh2;
          }
          if (l2 - l1 < 0) {
             l2 = l1;
          }
          byte[] uobyteArray6 = fq.a((int)l2, uobyteArray);
          System.arraycopy(uobyteArray6, i3, uofh1, i5, uobyteArray6.length);
          i5 = i5 + i;
          if (i6 == i2) {
             if (!uofh.A.size()) {
                uofh1[i5] = i3;
             }else {
                i4 = uofh.A.size();
                uofh1[i5] = (byte)i4;
                i5 = i5 + 1;
                i6 = 0;
                while (i6 < i4) {
                   a = (uofh.A.size() > 0)? uofh.A.get(i6).c: 0;
                   uobyteArray4 = fq.a(a, uobyteArray3);
                   System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
                   i5 = i5 + uobyteArray4.length;
                   a = (uofh.A.size() > 0)? uofh.A.get(i6).d: 0;
                   uobyteArray4 = fq.b(a, uobyteArray3);
                   System.arraycopy(uobyteArray4, i3, uofh1, i5, uobyteArray4.length);
                   i5 = i5 + uobyteArray4.length;
                   a = (uofh.A.size() > 0)? uofh.A.get(i6).k: null;
                   if (a > 127 || a < -128) {
                      len = 0;
                   }
                   uofh1[i5] = (byte)len;
                   i5 = i5 + i2;
                   if (Double.valueOf(fj.a).doubleValue() - 0x4014cccccccccccd >= 0) {
                      if (uofh.A.size() > 0) {
                         l2 = fq.b() - uofh.A.get(i3).t;
                         l2 = l2 / l;
                      }else {
                         uofh3 = l1;
                      }
                      if (l2 - uofh2 > 0) {
                         uofh3 = uofh2;
                      }
                      if (uofh3 - l1 < 0) {
                         uofh3 = l1;
                      }
                      byte[] uobyteArray12 = fq.a((int)uofh3, uobyteArray);
                      System.arraycopy(uobyteArray12, 0, uofh1, i5, uobyteArray12.length);
                      i5 = i5 + uobyteArray12.length;
                   }else {
                      es uoes2 = 0;
                   }
                   i6 = i6 + 1;
                   i2 = 1;
                   i3 = 0;
                   uobyteArray3 = null;
                }
             }
          }else {
             byte i7 = 0;
             if (i6 == i) {
                uofh1[i5] = i7;
             }
          }
          i5 = i5 + 1;
          i5 = i5 + len;
          goto label_01fd ;
       }else {
          uobyteArray5 = uobyteArray1;
       }
       uofh2 = uofh.C;
       String str = "GBK";
       if (uofh2 != null && (uofh.z & 8) == 8) {
          try{
             byte[] bytes = uofh2.getBytes(str);
             i3 = Math.min(bytes.length, 60);
             uofh1[i5] = (byte)i3;
             i5 = i5 + 1;
             System.arraycopy(bytes, 0, uofh1, i5, i3);
             i5 = i5 + i3;
          }catch(java.lang.Exception e0){
             uofh1[e0] = 0;
             i5 = e0 + 1;
          }
       }else {
          goto label_0346 ;
       }
    }
    public final byte[] a(String p0){
       String[] stringArray = p0.split(":");
       int i = 6;
       byte[] uobyteArray = new byte[i];
       if (stringArray == null || stringArray.length != i) {
          stringArray = new String[i];
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             stringArray[i1] = "0";
          }
       }
       for (i = 0; i < stringArray.length; i = i + 1) {
          int i2 = 2;
          if ((stringArray[i]).length() > i2) {
             stringArray[i] = (stringArray[i]).substring(0, i2);
          }
          uobyteArray[i] = (byte)Integer.parseInt(stringArray[i], 16);
       }
       return uobyteArray;
    }
    public final void b(){
       int i = 27;
       String[] stringArray = new String[i];
       stringArray[0] = this.a;
       stringArray[1] = this.c;
       stringArray[2] = this.d;
       stringArray[3] = this.e;
       stringArray[4] = this.f;
       stringArray[5] = this.g;
       stringArray[6] = this.h;
       stringArray[7] = this.i;
       stringArray[8] = this.l;
       stringArray[9] = this.m;
       stringArray[10] = this.n;
       stringArray[11] = this.o;
       stringArray[12] = this.p;
       stringArray[13] = this.q;
       stringArray[14] = this.r;
       stringArray[15] = this.s;
       stringArray[16] = this.t;
       stringArray[17] = this.u;
       stringArray[18] = this.v;
       stringArray[19] = this.w;
       stringArray[20] = this.x;
       stringArray[21] = this.D;
       stringArray[22] = this.F;
       stringArray[23] = this.G;
       stringArray[24] = fh.I;
       stringArray[25] = this.M;
       stringArray[26] = this.N;
       int i1 = 0;
       while (i1 < i) {
          if (TextUtils.isEmpty(stringArray[i1])) {
             stringArray[i1] = "";
          }
          i1 = i1 + 1;
       }
       if (TextUtils.isEmpty(this.j) || (!"0".equals(this.j) && !"2".equals(this.j))) {
          this.j = "0";
       }
       if (TextUtils.isEmpty(this.k) || (!"0".equals(this.k) && !"1".equals(this.k))) {
          this.k = "0";
       }
       if (TextUtils.isEmpty(this.y) || (!"1".equals(this.y) && !"2".equals(this.y))) {
          this.y = "0";
       }
       if (!et.a(this.z)) {
          this.z = 0;
       }
       if (this.H == null) {
          byte[] uobyteArray = new byte[0];
          this.H = uobyteArray;
       }
       return;
    }
}
