package com.yxcorp.gifshow.profile.profileinstaller.d;
import java.lang.Object;
import h5c.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.profileinstaller.b;
import java.io.ByteArrayOutputStream;
import h5c.c;
import java.util.Arrays;
import java.io.OutputStream;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.CharSequence;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.lang.Throwable;
import java.util.BitSet;
import java.lang.Boolean;
import java.util.ArrayList;
import h5c.d;
import com.yxcorp.gifshow.profile.profileinstaller.FileSectionType;

public class d	// class@0015a5
{
    public static final byte[] a;
    public static final byte[] b;

    static {
       d.a = new byte[4]{'p','r','o',0x00};
       d.b = new byte[4]{'p','r','m',0x00};
    }
    public void d(){
       super();
    }
    public static int a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = p0.i.entrySet().iterator();
       while (iterator.hasNext()) {
          i = i | iterator.next().getValue().intValue();
       }
       return i;
    }
    public static byte[] b(b[] p0,byte[] p1){
       object oobject;
       ByteArrayOutputStream obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int len = p0.length;
       int i = 0;
       int i2 = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          oobject = p0[i1];
          int i3 = b.j(d.d(oobject.a, oobject.b, p1)) + 16;
          int i4 = oobject.e * 2;
          i3 = i3 + i4;
          i3 = i3 + oobject.f;
          i3 = i3 + d.e(oobject.g);
          i2 = i2 + i3;
       }
       obj = new ByteArrayOutputStream(i2);
       if (Arrays.equals(p1, c.c)) {
          i1 = p0.length;
          for (; i < i1; i = i + 1) {
             oobject = p0[i];
             d.r(obj, oobject, d.d(oobject.a, oobject.b, p1));
             d.q(obj, oobject);
          }
       }else {
          i1 = p0.length;
          for (int i5 = 0; i5 < i1; i5 = i5 + 1) {
             object oobject1 = p0[i5];
             d.r(obj, oobject1, d.d(oobject1.a, oobject1.b, p1));
          }
          int len1 = p0.length;
          for (; i < len1; i = i + 1) {
             d.q(obj, p0[i]);
          }
       }
       if (obj.size() == i2) {
          return obj.toByteArray();
       }else {
          throw b.b("The bytes saved do not match expectation. actual="+obj.size()+" expected="+i2);
       }
    }
    public static String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("!").equals(p1)) {
          return p0.replace(":", "!");
       }
       if (":".equals(p1)) {
          p0 = p0.replace("!", ":");
       }
       return p0;
    }
    public static String d(String p0,String p1,byte[] p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.a(p2);
       if (p0.length() <= 0) {
          return d.c(p1, obj);
       }
       if (p1.equals("classes.dex")) {
          return p0;
       }
       if (p1.contains("!") || p1.contains(":")) {
          return d.c(p1, obj);
       }
       if (p1.endsWith(".apk")) {
          return p1;
       }
       return p0+c.a(p2)+p1;
    }
    public static int e(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uod, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (((((p0 * 2) + 8) - 1) & 0xf8) / 8);
    }
    public static int f(int p0,int p1,int p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, d.class, "40");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 4) {
                return (p1 + p2);
             }else {
                throw b.b("Unexpected flag: "+p0);
             }
          }else {
             return p1;
          }
       }else {
          throw b.b("HOT methods are not stored in the bitmap");
       }
    }
    public static int[] g(InputStream p0,int p1){
       int[] obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new int[p1];
       int i1 = 0;
       for (int i = 0; i < p1; i = i + 1) {
          i1 = i1 + b.g(p0);
          obj[i] = i1;
       }
       return obj;
    }
    public static byte[] h(InputStream p0,byte[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Arrays.equals(p1, b.c(p0, p1.length))) {
          return b.c(p0, c.b.length);
       }
       throw b.b("Invalid magic");
    }
    public static b[] i(InputStream p0,byte[] p1,byte[] p2,b[] p3){
       int i;
       ByteArrayInputStream uByteArrayIn;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       byte[] obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, d.class, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.f;
       String str = "Unsupported meta version";
       if (Arrays.equals(p1, obj)) {
          if (!Arrays.equals(c.a, p2)) {
             b[] uobArray = PatchProxy.applyThreeRefs(p0, p1, p3, null, d.class, "26");
             if (uobArray != patchProxyRe) {
             }else if(Arrays.equals(p1, obj)){
                i = b.i(p0);
                uobArray = b.d(p0, (int)b.h(p0), (int)b.h(p0));
                if (p0.read() <= 0) {
                   uByteArrayIn = new ByteArrayInputStream(uobArray);
                   uobArray = d.j(uByteArrayIn, i, p3);
                   uByteArrayIn.close();
                }else {
                   throw b.b("Content found after the end of file");
                }
             }else {
                throw b.b(str);
             }
             return uobArray;
          }else {
             throw b.b("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
          }
       }else if(Arrays.equals(p1, c.g)){
          b[] uobArray1 = PatchProxy.applyThreeRefs(p0, p2, p3, null, d.class, "27");
          if (uobArray1 != patchProxyRe) {
          }else {
             i = b.g(p0);
             byte[] uobyteArray = b.d(p0, (int)b.h(p0), (int)b.h(p0));
             if (p0.read() <= 0) {
                uByteArrayIn = new ByteArrayInputStream(uobyteArray);
                uobArray1 = d.k(uByteArrayIn, p2, i, p3);
                uByteArrayIn.close();
             }else {
                throw b.b("Content found after the end of file");
             }
          }
          return uobArray1;
       }else {
          throw b.b(str);
       }
    }
    public static b[] j(InputStream p0,int p1,b[] p2){
       String[] obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, d.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       if (!p0.available()) {
          b[] uobArray = new b[i];
          return uobArray;
       }else if(p1 == p2.length){
          obj = new String[p1];
          int[] ointArray = new int[p1];
          for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
             ointArray[i1] = b.g(p0);
             obj[i1] = b.e(p0, b.g(p0));
          }
          while (true) {
             if (i >= p1) {
                return p2;
             }
             object oobject = p2[i];
             if ((oobject.b).equals(obj[i])) {
                int i2 = ointArray[i];
                oobject.e = i2;
                oobject.h = d.g(p0, i2);
                i = i + 1;
             }else {
                break ;
             }
          }
          throw b.b("Order of dexfiles in metadata did not match baseline");
       }else {
          throw b.b("Mismatched number of dex files found in metadata");
       }
    }
    public static b[] k(InputStream p0,byte[] p1,int p2,b[] p3){
       String str;
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, d.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0.available()) {
          b[] uobArray = new b[0];
          return uobArray;
       }else if(p2 == p3.length){
          int i = 0;
          while (true) {
             if (i >= p2) {
                return p3;
             }
             b.g(p0);
             str = b.e(p0, b.g(p0));
             long l = b.h(p0);
             int i1 = b.g(p0);
             Object obj1 = null;
             String obj2 = PatchProxy.applyTwoRefs(p3, str, obj1, d.class, "29");
             if (obj2 != PatchProxyResult.class) {
                obj1 = obj2;
             }else if(p3.length <= 0){
                obj2 = PatchProxy.applyOneRefs(str, obj1, d.class, "33");
                if (obj2 != PatchProxyResult.class) {
                }else {
                   int i3 = str.indexOf("!");
                   if (i3 < 0) {
                      i3 = str.indexOf(":");
                   }
                   if (i3 > 0) {
                      i3 = i3 + 1;
                      obj2 = str.substring(i3);
                   }else {
                      obj2 = str;
                   }
                }
                int i2 = 0;
                while (i2 < p3.length) {
                   if ((p3[i2].b).equals(obj2)) {
                      obj1 = p3[i2];
                      break ;
                   }
                   i2 = i2 + 1;
                }
             }
             if (obj1 != null) {
                obj1.d = l;
                int[] ointArray = d.g(p0, i1);
                if (Arrays.equals(p1, c.e)) {
                   obj1.e = i1;
                   obj1.h = ointArray;
                }
                i = i + 1;
             }else {
                break ;
             }
          }
          throw b.b("Missing profile key: "+str);
       }else {
          throw b.b("Mismatched number of dex files found in metadata");
       }
    }
    public static b[] l(InputStream p0,byte[] p1,String p2){
       byte[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!Arrays.equals(p1, c.b)) {
          throw b.b("Unsupported version");
       }
       int i = b.i(p0);
       obj = b.d(p0, (int)b.h(p0), (int)b.h(p0));
       if (p0.read() > 0) {
          throw b.b("Content found after the end of file");
       }
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(obj);
       uByteArrayIn.close();
       return d.m(uByteArrayIn, p2, i);
    }
    public static b[] m(InputStream p0,String p1,int p2){
       b[] obj;
       int i3;
       Integer integer;
       b uob1;
       int i6;
       int b;
       int i7;
       int i8;
       InputStream inputStream = p0;
       int i = p2;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, d.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i1 = 0;
       if (!p0.available()) {
          obj = new b[i1];
          return obj;
       }else {
          obj = new b[i];
          int i2 = 0;
          while (i2 < i) {
             i3 = b.g(p0);
             int i4 = i2;
             int[] ointArray = new int[i3];
             b uob = new b(p1, b.e(inputStream, b.g(p0)), b.h(p0), 0, i3, (int)b.h(p0), (int)b.h(p0), ointArray, new TreeMap());
             obj[i4] = v23;
             i2 = i4 + 1;
             ointArray = 0;
          }
          i1 = 0;
          while (true) {
             if (i1 >= i) {
                return obj;
             }
             object oobject = obj[i1];
             BitSet obj1 = null;
             if (!PatchProxy.applyVoidTwoRefs(inputStream, oobject, obj1, d.class, "35")) {
                i3 = p0.available() - oobject.f;
                b = 0;
                while (p0.available() > i3) {
                   b = b + b.g(p0);
                   oobject.i.put(Integer.valueOf(b), Integer.valueOf(1));
                   i8 = b.g(p0);
                   while (i8 > 0) {
                      if (!PatchProxy.applyVoidOneRefs(inputStream, obj1, d.class, "36")) {
                         b.g(p0);
                         i7 = b.i(p0);
                         if (i7 != 6 && i7 != 7) {
                            while (i7 > 0) {
                               b.i(p0);
                               int i9 = b.i(p0);
                               while (i9 > 0) {
                                  b.g(p0);
                                  i9 = i9 - 1;
                               }
                               i7 = i7 - 1;
                            }
                         }
                      }
                      i8 = i8 - 1;
                   }
                }
                if (p0.available() != i3) {
                }
             }
             oobject.h = d.g(inputStream, oobject.e);
             if (!PatchProxy.applyVoidTwoRefs(inputStream, oobject, obj1, d.class, "38")) {
                obj1 = BitSet.valueOf(b.c(inputStream, (((((oobject.g * 2) + 8) - 1) & 0xf8) / 8)));
                int i5 = 0;
                b g = oobject.g;
                while (i5 < g) {
                   if (PatchProxy.isSupport(d.class)) {
                      uob1 = g;
                      i3 = i5;
                      Object obj2 = PatchProxy.applyThreeRefs(obj1, Integer.valueOf(i5), Integer.valueOf(g), null, d.class, "39");
                      if (obj2 != PatchProxyResult.class) {
                         i6 = obj2.intValue();
                         b = 2;
                      }else if(obj1.get(d.f(2, i3, uob1))){
                         i8 = 2;
                      }else {
                         i8 = 0;
                      }
                      if (obj1.get(d.f(4, i3, uob1))) {
                         i6 = i8 | 0x04;
                      }else {
                         i6 = i8;
                      }
                   }else {
                      uob1 = g;
                      i3 = i5;
                      goto label_0131 ;
                   }
                   if (i6) {
                      Integer integer1 = oobject.i.get(Integer.valueOf(i3));
                      i7 = 0;
                      if (integer1 == null) {
                         integer1 = Integer.valueOf(i7);
                      }
                      i6 = i6 | integer1.intValue();
                      oobject.i.put(Integer.valueOf(i3), Integer.valueOf(i6));
                   }else {
                      integer = null;
                   }
                   i5 = i3 + 1;
                   i3 = 2;
                }
             }
             integer = null;
             i1 = i1 + 1;
          }
          throw b.b("Read too much data during profile line parse");
       }
    }
    public static void n(byte[] p0,int p1,int p2,b p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, d.class, "18")) {
          return;
       }
       p1 = d.f(p1, p2, p3.g);
       p2 = p1 / 8;
       p0[p2] = (byte)((1 << (p1 % 8)) | p0[p2]);
       return;
    }
    public static boolean o(OutputStream p0,byte[] p1,b[] p2){
       boolean b;
       int i1;
       int len;
       int i2;
       ByteArrayOutputStream uByteArrayOu;
       object oobject;
       int i3;
       ByteArrayOutputStream uByteArrayOu1;
       byte[] uobyteArray4;
       byte[] uobyteArray5;
       Object obj5;
       int len1;
       int i5;
       object oobject2;
       Iterator iterator;
       b h;
       Object obj = p0;
       byte[] uobyteArray = p1;
       Object obj1 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "3");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       d obj3 = null;
       byte[] uobyteArray1 = 1;
       if (Arrays.equals(uobyteArray, c.a)) {
          if (!PatchProxy.applyVoidTwoRefs(obj, obj1, obj3, d.class, "5") && !PatchProxy.applyVoidTwoRefs(obj, obj1, obj3, d.class, "6")) {
             obj2 = new ArrayList(3);
             ArrayList uArrayList = new ArrayList(3);
             d uod = PatchProxy.applyOneRefs(obj1, obj3, d.class, "7");
             String str = ", does not match actual size ";
             int i = 2;
             if (uod != patchProxyRe) {
             }else {
                ByteArrayOutputStream uByteArrayOu2 = new ByteArrayOutputStream();
                b.n(uByteArrayOu2, obj1.length);
                int i4 = 0;
                i3 = 2;
                while (i4 < obj1.length) {
                   object oobject1 = obj1[i4];
                   i3 = i3 + 4;
                   b.o(uByteArrayOu2, oobject1.c);
                   i3 = i3 + 4;
                   b.o(uByteArrayOu2, oobject1.d);
                   i3 = i3 + 4;
                   b.o(uByteArrayOu2, (long)oobject1.g);
                   String str1 = d.d(oobject1.a, oobject1.b, c.a);
                   i3 = i3 + i;
                   i2 = b.j(str1);
                   b.n(uByteArrayOu2, i2);
                   i2 = i2 * 1;
                   i3 = i3 + i2;
                   b.l(uByteArrayOu2, str1);
                   i4 = i4 + 1;
                   uobyteArray5 = null;
                }
                uobyteArray5 = uByteArrayOu2.toByteArray();
                if (i3 == uobyteArray5.length) {
                   uByteArrayOu2.close();
                   uod = new d(FileSectionType.DEX_FILES, i3, uobyteArray5, false);
                }else {
                   throw b.b("Expected size "+i3+str+uobyteArray5.length);
                }
             }
             obj2.add(uod);
             obj3 = PatchProxy.applyOneRefs(obj1, null, d.class, "8");
             if (obj3 != patchProxyRe) {
             }else {
                uByteArrayOu = new ByteArrayOutputStream();
                len = 0;
                for (i2 = 0; i2 < obj1.length; i2 = i2 + 1) {
                   oobject = obj1[i2];
                   len = len + 2;
                   b.n(uByteArrayOu, i2);
                   len = len + i;
                   b.n(uByteArrayOu, oobject.e);
                   i3 = oobject.e * 2;
                   len = len + i3;
                   d.p(uByteArrayOu, oobject);
                }
                uobyteArray4 = uByteArrayOu.toByteArray();
                if (len == uobyteArray4.length) {
                   uByteArrayOu.close();
                   obj3 = new d(FileSectionType.CLASSES, len, uobyteArray4, uobyteArray1);
                }else {
                   throw b.b("Expected size "+len+str+uobyteArray4.length);
                }
             }
             obj2.add(obj3);
             obj3 = PatchProxy.applyOneRefs(obj1, null, d.class, "9");
             if (obj3 != patchProxyRe) {
             }else {
                uByteArrayOu = new ByteArrayOutputStream();
                i2 = 0;
                len = 0;
                while (i2 < obj1.length) {
                   oobject = obj1[i2];
                   i3 = d.a(oobject);
                   byte[] uobyteArray3 = PatchProxy.applyOneRefs(oobject, null, d.class, "10");
                   if (uobyteArray3 != patchProxyRe) {
                   }else {
                      uByteArrayOu1 = new ByteArrayOutputStream();
                      d.s(uByteArrayOu1, oobject);
                      uobyteArray3 = uByteArrayOu1.toByteArray();
                      uByteArrayOu1.close();
                   }
                   uobyteArray1 = PatchProxy.applyOneRefs(oobject, null, d.class, "11");
                   if (uobyteArray1 != patchProxyRe) {
                   }else {
                      uByteArrayOu1 = new ByteArrayOutputStream();
                      d.t(uByteArrayOu1, oobject);
                      uByteArrayOu1.close();
                      uobyteArray1 = uByteArrayOu1.toByteArray();
                   }
                   len = len + 2;
                   b.n(uByteArrayOu, i2);
                   i = uobyteArray3.length + 2;
                   i = i + uobyteArray1.length;
                   len = len + 4;
                   b.o(uByteArrayOu, (long)i);
                   b.n(uByteArrayOu, i3);
                   uByteArrayOu.write(uobyteArray3);
                   uByteArrayOu.write(uobyteArray1);
                   len = len + i;
                   i2 = i2 + 1;
                   obj1 = p2;
                   patchProxyRe = patchProxyRe;
                   Object obj4 = 2;
                }
                uobyteArray4 = uByteArrayOu.toByteArray();
                if (len == uobyteArray4.length) {
                   uByteArrayOu.close();
                   obj3 = new d(FileSectionType.METHODS, len, uobyteArray4, true);
                }else {
                   throw b.b("Expected size "+len+str+uobyteArray4.length);
                }
             }
             obj2.add(obj3);
             long l = (((long)c.a.length + (long)d.a.length) + 4) + (long)(obj2.size() * 16);
             b.o(obj, (long)obj2.size());
             for (i1 = 0; i1 < obj2.size(); i1 = i1 + 1) {
                uod = obj2.get(i1);
                b.o(obj, uod.a.getValue());
                b.o(obj, l);
                if (uod.d != null) {
                   uod = uod.c;
                   byte[] uobyteArray2 = b.a(uod);
                   uArrayList.add(uobyteArray2);
                   b.o(obj, (long)uobyteArray2.length);
                   b.o(obj, (long)uod.length);
                   len = uobyteArray2.length;
                }else {
                   uArrayList.add(uod.c);
                   b.o(obj, (long)uod.c.length);
                   b.o(obj, 0);
                   len = uod.c.length;
                }
                l = l + (long)len;
             }
             for (i2 = 0; i2 < uArrayList.size(); i2 = i2 + 1) {
                obj.write(uArrayList.get(i2));
             }
          }
          b = true;
          return b;
       }else {
          byte[] b1 = c.b;
          if (Arrays.equals(uobyteArray, b1)) {
             obj5 = p2;
             if (!PatchProxy.applyVoidTwoRefs(obj, obj5, null, d.class, "13")) {
                b.p(obj, obj5.length);
                b.k(obj, d.b(obj5, b1));
             }
             return true;
          }else {
             obj5 = p2;
             if (Arrays.equals(uobyteArray, c.d)) {
                if (!PatchProxy.applyVoidTwoRefs(obj, obj5, null, d.class, "15")) {
                   b.p(obj, obj5.length);
                   len1 = obj5.length;
                   i5 = 0;
                   while (i5 < len1) {
                      oobject2 = obj5[i5];
                      i1 = oobject2.i.size() * 4;
                      String str2 = d.d(oobject2.a, oobject2.b, c.d);
                      b.n(obj, b.j(str2));
                      b.n(obj, oobject2.h.length);
                      b.o(obj, (long)i1);
                      b.o(obj, oobject2.c);
                      b.l(obj, str2);
                      iterator = oobject2.i.keySet().iterator();
                      while (iterator.hasNext()) {
                         b.n(obj, iterator.next().intValue());
                         b.n(obj, 0);
                      }
                      h = oobject2.h;
                      i1 = h.length;
                      for (len = 0; len < i1; len = len + 1) {
                         b.n(obj, h[len]);
                      }
                      i5 = i5 + 1;
                   }
                }
                b = true;
                return b;
             }else {
                b1 = c.c;
                if (Arrays.equals(uobyteArray, b1)) {
                   if (!PatchProxy.applyVoidTwoRefs(obj, obj5, null, d.class, "14")) {
                      b.p(obj, obj5.length);
                      b.k(obj, d.b(obj5, b1));
                   }
                   return true;
                }else if(Arrays.equals(uobyteArray, c.e)){
                   if (!PatchProxy.applyVoidTwoRefs(obj, obj5, null, d.class, "4")) {
                      b.n(obj, obj5.length);
                      len1 = obj5.length;
                      i5 = 0;
                      while (i5 < len1) {
                         oobject2 = obj5[i5];
                         String str3 = d.d(oobject2.a, oobject2.b, c.e);
                         b.n(obj, b.j(str3));
                         b.n(obj, oobject2.i.size());
                         b.n(obj, oobject2.h.length);
                         b.o(obj, oobject2.c);
                         b.l(obj, str3);
                         iterator = oobject2.i.keySet().iterator();
                         while (iterator.hasNext()) {
                            b.n(obj, iterator.next().intValue());
                         }
                         h = oobject2.h;
                         i1 = h.length;
                         for (len = 0; len < i1; len = len + 1) {
                            b.n(obj, h[len]);
                         }
                         i5 = i5 + 1;
                      }
                   }
                   b = true;
                   return b;
                }else {
                   return false;
                }
             }
          }
       }
    }
    public static void p(OutputStream p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "22")) {
          return;
       }
       p1 = p1.h;
       int len = p1.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          Integer integer = Integer.valueOf(p1[i]);
          int i2 = integer.intValue() - i1;
          b.n(p0, i2);
          integer.intValue();
       }
       return;
    }
    public static void q(OutputStream p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "20")) {
          return;
       }
       d.t(p0, p1);
       d.p(p0, p1);
       d.s(p0, p1);
       return;
    }
    public static void r(OutputStream p0,b p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "19")) {
          return;
       }
       b.n(p0, b.j(p2));
       b.n(p0, p1.e);
       b.o(p0, (long)p1.f);
       b.o(p0, p1.c);
       b.o(p0, (long)p1.g);
       b.l(p0, p2);
       return;
    }
    public static void s(OutputStream p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "23")) {
          return;
       }
       byte[] uobyteArray = new byte[d.e(p1.g)];
       Iterator iterator = p1.i.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i = uEntry.getKey().intValue();
          int i1 = uEntry.getValue().intValue();
          int i2 = i1 & 0x02;
          if (i2) {
             d.n(uobyteArray, 2, i, p1);
          }
          i1 = i1 & 0x04;
          if (i1) {
             d.n(uobyteArray, 4, i, p1);
          }
       }
       p0.write(uobyteArray);
       return;
    }
    public static void t(OutputStream p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "21")) {
          return;
       }
       Iterator iterator = p1.i.entrySet().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i1 = uEntry.getKey().intValue();
          int i2 = uEntry.getValue().intValue() & 0x01;
          if (!i2) {
             continue ;
          }else {
             i = i1 - i;
             b.n(p0, i);
             b.n(p0, 0);
             i = i1;
          }
       }
       return;
    }
}
