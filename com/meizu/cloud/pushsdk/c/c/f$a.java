package com.meizu.cloud.pushsdk.c.c.f$a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.g.b;
import com.meizu.cloud.pushsdk.c.c.f;
import java.lang.CharSequence;
import java.net.InetAddress;
import java.lang.AssertionError;
import com.meizu.cloud.pushsdk.c.c.m;
import java.lang.System;
import java.util.Arrays;
import java.lang.Integer;
import com.meizu.cloud.pushsdk.c.c.f$a$a;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import com.meizu.cloud.pushsdk.c.c.f$1;
import java.lang.IllegalStateException;

public final class f$a	// class@0014d1
{
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final List f;
    public List g;
    public String h;

    public void f$a(){
       super();
       this.b = "";
       this.c = "";
       this.e = -1;
       ArrayList uArrayList = new ArrayList();
       this.f = uArrayList;
       uArrayList.add("");
    }
    public static String a(byte[] p0){
       int i5;
       int i6;
       int i = 0;
       int i1 = -1;
       int i2 = 0;
       int i3 = 0;
       int i4 = 16;
       while (i2 < p0.length) {
          i5 = i2;
          while (i5 < i4 && !p0[i5]) {
             i6 = i5 + 1;
             if (!p0[i6]) {
                i5 = i5 + 2;
             }else {
                break ;
             }
          }
          i4 = i5 - i2;
          if (i4 > i3) {
             i1 = i2;
             i3 = i4;
          }
          i2 = i5 + 2;
       }
       b uob = new b();
       while (i < p0.length) {
          i5 = 58;
          if (i == i1) {
             uob.b(i5);
             i = i + i3;
             if (i == i4) {
                uob.b(i5);
             }
          }else if(i > 0){
             uob.b(i5);
          }
          i5 = p0[i] & 0x00ff;
          i5 = i5 << 8;
          i6 = i + 1;
          i6 = p0[i6] & 0x00ff;
          i5 = i5 | i6;
          uob.d((long)i5);
          i = i + 2;
       }
       return uob.h();
    }
    public static boolean a(String p0,int p1,int p2,byte[] p3,int p4){
       boolean b;
       int i = p4;
       while (true) {
          b = false;
          if (p1 < p2) {
             if (i == p3.length) {
                return b;
             }else if(i != p4){
                if (p0.charAt(p1) != '.') {
                   return b;
                }else {
                   p1++;
                }
             }
             int i1 = p1;
             int i2 = 0;
             while (true) {
                if (i1 < p2) {
                   char c = p0.charAt(i1);
                   if (c < '0' || c > '9') {
                   label_0037 :
                      p1 = i1 - p1;
                      if (!p1) {
                         return b;
                      }else {
                         p1 = i + 1;
                         p3[i] = (byte)i2;
                         i = p1;
                         p1 = i1;
                      }
                   }else if(!i2 && p1 != i1){
                      return b;
                   }else {
                      i2 = i2 * 10;
                      i2 = i2 + c;
                      i2 = i2 - 48;
                      if (i2 > 255) {
                         return b;
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                }else {
                   goto label_0037 ;
                }
             }
          }else if(i == (p4 + 4)){
             b = true;
             break ;
          }
          break ;
       }
       return b;
    }
    public static int b(String p0,int p1,int p2){
       if ((p2 - p1) < 2) {
          return -1;
       }
       char c = p0.charAt(p1);
       int i = 0;
       int i1 = (c < 'a' || c > 'z')? 1: 0;
       if (c < 'A' || c > 'Z') {
          i = 1;
       }
       if (i1 && i) {
          return -1;
       }else {
          p1 = p1 + 1;
          while (true) {
             if (p1 >= p2) {
                return -1;
             }
             c = p0.charAt(p1);
             if (c >= 'a' && (c <= 'z' || (c >= 'A' && (c <= 'Z' || (c >= '0' && (c > '9' && (c != '+' && (c == '-' || c == '.')))))))) {
                p1++;
             }else if(c == ':'){
                break ;
             }else {
                return -1;
             }
          }
          return p1;
       }
    }
    public static int c(String p0,int p1,int p2){
       int i = 0;
       for (; p1 < p2; p1++) {
          char c = p0.charAt(p1);
          if (c == '\' || c == '/') {
             i = i + 1;
          }else {
             break ;
          }
       }
       return i;
    }
    public static int d(String p0,int p1,int p2){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          char c = p0.charAt(p1);
          if (c != ':') {
             if (c == '[') {
                do {
                   p1++;
                } while (p1 >= p2 || p0.charAt(p1) == ']');
             }
             p1++;
          }else {
             break ;
          }
       }
       return p1;
    }
    public static String e(String p0,int p1,int p2){
       InetAddress inetAddress;
       p0 = f.a(p0, p1, p2, false);
       if (!p0.contains(":")) {
          return m.a(p0);
       }
       if (p0.startsWith("[") && p0.endsWith("]")) {
          p2 = 1;
          inetAddress = f$a.f(p0, p2, (p0.length() - p2));
       }else {
          inetAddress = f$a.f(p0, false, p0.length());
       }
       if (inetAddress == null) {
          return null;
       }else {
          byte[] address = inetAddress.getAddress();
          if (address.length == 16) {
             return f$a.a(address);
          }else {
             throw new AssertionError();
          }
       }
    }
    public static InetAddress f(String p0,int p1,int p2){
       int i6;
       int i = 16;
       byte[] uobyteArray = new byte[i];
       int i1 = 0;
       int i2 = -1;
       int i3 = -1;
       while (true) {
          InetAddress inetAddress = null;
          if (p1 < p2) {
             if (i1 == i) {
                return inetAddress;
             }
             int i4 = p1 + 2;
             if (i4 <= p2 && p0.regionMatches(p1, "::", 0, 2)) {
                if (i2 != -1) {
                   return inetAddress;
                }else {
                   i1 = i1 + 2;
                   i2 = i1;
                   if (i4 == p2) {
                   label_007a :
                      if (i1 != i) {
                         if (i2 == -1) {
                            return inetAddress;
                         }else {
                            int i5 = i1 - i2;
                            System.arraycopy(uobyteArray, i2, uobyteArray, (i5 - 16), i5);
                            Arrays.fill(uobyteArray, i2, ((i - i1) + i2), 0);
                            break ;
                         }
                      }
                      break ;
                   }else {
                      i3 = i4;
                   }
                }
             }else if(i1){
                i6 = 1;
                if (p0.regionMatches(p1, ":", 0, i6)) {
                   p1++;
                }else if(p0.regionMatches(p1, ".", 0, i6)){
                   if (!f$a.a(p0, i3, p2, uobyteArray, (i1 - 2))) {
                      return inetAddress;
                   }else {
                      i1 = i1 + 2;
                      goto label_007a ;
                   }
                }else {
                   return inetAddress;
                }
             }
             i3 = p1;
             i4 = 0;
             for (p1 = i3; p1 < p2; p1++) {
                i6 = f.a(p0.charAt(p1));
                if (i6 == -1) {
                   break ;
                }
                i4 = i4 << 4;
                i4 = i4 + i6;
             }
             i6 = p1 - i3;
             if (!i6 || i6 > 4) {
                return inetAddress;
             }else {
                int i7 = i1 + 1;
                i6 = i4 >> 8;
                i6 = i6 & 0x00ff;
                uobyteArray[i1] = (byte)i6;
                i1 = i7 + 1;
                i4 = i4 & 0x00ff;
                uobyteArray[i7] = (byte)i4;
             }
          }else {
             goto label_007a ;
          }
       }
       try{
          return InetAddress.getByAddress(uobyteArray);
       }catch(java.net.UnknownHostException e0){
          throw new AssertionError();
       }
    }
    public static int g(String p0,int p1,int p2){
       int i = -1;
       try{
          int i1 = Integer.parseInt(f.a(p0, p1, p2, "", false, false, false, true));
          if (i1 > 0 && i1 <= 0xffff) {
             return i1;
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public int a(){
       f$a te = this.e;
       if (te != -1) {
       }else {
          te = f.a(this.a);
       }
       return te;
    }
    public f$a$a a(f p0,String p1){
       char c;
       int i10;
       f$a uoa = this;
       String str = p1;
       int i = m.a(str, 0, p1.length());
       int i1 = m.b(str, i, p1.length());
       int i2 = -1;
       if (f$a.b(str, i, i1) != i2) {
          if ((p1).regionMatches(true, i, "https:", 0, 6)) {
             uoa.a = "https";
             i = i + 6;
          }else if((p1).regionMatches(true, i, "http:", 0, 5)){
             uoa.a = "http";
             i = i + 5;
          }else {
             return f$a$a.c;
          }
       }else if(p0 != null){
          uoa.a = f.a(p0);
       }else {
          return f$a$a.b;
       }
       int i3 = f$a.c(str, i, i1);
       int i4 = 63;
       int i5 = 35;
       if (i3 < 2 && (p0 == null || !(f.a(p0)).equals(uoa.a))) {
          int i6 = i + i3;
          int i7 = 0;
          int i8 = 0;
          while (true) {
             i = m.a(str, i6, i1, "@/\\?#");
             if (i != i1) {
                c = str.charAt(i);
             label_00b5 :
                if (c != i2 && (c != i5 && (c != '/' && (c != '\' && c != i4)))) {
                   if (c == '@') {
                      String str1 = "%40";
                      if (!i7) {
                         int i9 = m.a(str, i6, i, ':');
                         i10 = i9;
                         int i11 = i9;
                         String str2 = str1;
                         i4 = i;
                         String str3 = f.a(p1, i6, i10, " \"\':;<=>@[]^`{}|/\\?#", true, 0, 0, 1);
                         if (i8) {
                            str3 = uoa.b+str2+str3;
                         }
                         uoa.b = str3;
                         if (i11 != i4) {
                            i6 = i11 + 1;
                            uoa.c = f.a(p1, i6, i4, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            i7 = 1;
                         }
                         i8 = 1;
                      }else {
                         i4 = i;
                         uoa.c = uoa.c+str1+f.a(p1, i6, i4, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true);
                      }
                      i6 = i4 + 1;
                   }
                   i4 = 63;
                   i5 = 35;
                }else {
                   i4 = i;
                   i3 = f$a.d(str, i6, i4);
                   i10 = i3 + 1;
                   uoa.d = f$a.e(str, i6, i3);
                   if (i10 < i4) {
                      i3 = f$a.g(str, i10, i4);
                      uoa.e = i3;
                      if (i3 == i2) {
                         return f$a$a.d;
                      }
                   }else {
                      uoa.e = f.a(uoa.a);
                   }
                   if (uoa.d == null) {
                      return f$a$a.e;
                   }else {
                      i = i4;
                   }
                }
             }else {
                c = -1;
                goto label_00b5 ;
             }
          }
       }else {
          uoa.b = p0.a();
          uoa.c = p0.b();
          uoa.d = f.b(p0);
          uoa.e = f.c(p0);
          uoa.f.clear();
          uoa.f.addAll(p0.c());
          if (i == i1 || str.charAt(i) == i5) {
             uoa.a(p0.d());
          }
       }
       i3 = m.a(str, i, i1, "?#");
       uoa.a(str, i, i3);
       if (i3 < i1 && str.charAt(i3) == '?') {
          i2 = m.a(str, i3, i1, '#');
          uoa.g = f.b(f.a(p1, (i3 + 1), i2, " \"\'<>#", true, false, true, true));
          i3 = i2;
       }
       if (i3 < i1 && str.charAt(i3) == '#') {
          uoa.h = f.a(p1, (1 + i3), i1, "", true, false, false, false);
       }
       return f$a$a.a;
    }
    public f$a a(String p0){
       List list = (p0 != null)? f.b(f.a(p0, " \"\'<>#", true, false, true, true)): null;
       this.g = list;
       return this;
    }
    public f$a a(String p0,String p1){
       if (p0 == null) {
          throw new IllegalArgumentException("name == null");
       }
       if (this.g == null) {
          this.g = new ArrayList();
       }
       this.g.add(f.a(p0, " \"\'<>#&=", false, false, true, true));
       f$a tg = this.g;
       p1 = (p1 != null)? f.a(p1, " \"\'<>#&=", false, false, true, true): null;
       tg.add(p1);
       return this;
    }
    public final void a(String p0,int p1,int p2){
       if (p1 == p2) {
          return;
       }
       char c = p0.charAt(p1);
       if (c == '/' || c == '\') {
          this.f.clear();
          this.f.add("");
       label_0041 :
          p1++;
          int i = p1;
          while (i < p2) {
             p1 = m.a(p0, i, p2, "/\\");
             c = (p1 < p2)? 1: 0;
             this.a(p0, i, p1, c, true);
             if (c) {
             }
          }
          return;
       }else {
          f$a tf = this.f;
          int i1 = tf.size() - 1;
          tf.set(i1, "");
          goto label_0029 ;
       }
    }
    public final void a(String p0,int p1,int p2,boolean p3,boolean p4){
       p0 = f.a(p0, p1, p2, " \"<>^`{}|/\\?#", p4, false, false, true);
       if (this.b(p0)) {
          return;
       }
       if (this.c(p0)) {
          this.c();
          return;
       }else {
          f$a tf = this.f;
          if ((tf.get((tf.size() - 1))).isEmpty()) {
             tf = this.f;
             tf.set((tf.size() - 1), p0);
          }else {
             this.f.add(p0);
          }
          if (p3) {
             this.f.add("");
          }
          return;
       }
    }
    public f b(){
       if (this.a == null) {
          throw new IllegalStateException("scheme == null");
       }
       if (this.d != null) {
          return new f(this, null);
       }
       throw new IllegalStateException("host == null");
    }
    public final boolean b(String p0){
       boolean b = ((".").equals(p0) || ("%2e").equalsIgnoreCase(p0))? true: false;
       return b;
    }
    public final void c(){
       f$a tf = this.f;
       if ((tf.remove((tf.size() - 1))).isEmpty() && !this.f.isEmpty()) {
          tf = this.f;
          tf.set((tf.size() - 1), "");
       }else {
          this.f.add("");
       }
       return;
    }
    public final boolean c(String p0){
       boolean b = (!("..").equals(p0) && (!("%2e.").equalsIgnoreCase(p0) && ((".%2e").equalsIgnoreCase(p0) || ("%2e%2e").equalsIgnoreCase(p0))))? true: false;
       return b;
    }
    public String toString(){
       StringBuilder str = this.a+"://";
       if (!(this.b).isEmpty() || !(this.c).isEmpty()) {
          str = str+this.b;
          if (!(this.c).isEmpty()) {
             str = str+':'+this.c;
          }
          str = str+'@';
       }
       str = ((this.d).indexOf(':') != -1)? str+'['+this.d+']': str+this.d;
       int i = this.a();
       if (i != f.a(this.a)) {
          str = str+':'+i;
       }
       f.a(str, this.f);
       if (this.g != null) {
          str = str+'?';
          f.b(str, this.g);
       }
       if (this.h != null) {
          str = str+'#'+this.h;
       }
       return str;
    }
}
