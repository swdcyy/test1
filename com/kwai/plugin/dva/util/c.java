package com.kwai.plugin.dva.util.c;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.kwai.plugin.dva.util.c$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.util.a;
import android.util.Base64;
import java.lang.CharSequence;
import kotlin.text.Regex;
import java.lang.StringBuilder;
import java.lang.Throwable;
import qj7.d;
import java.lang.IllegalArgumentException;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.Adler32;
import java.io.Closeable;
import isd.b;
import kotlin.Pair;
import java.lang.Long;
import usd.q;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.io.RandomAccessFile;
import qrd.r0;
import java.lang.Boolean;
import com.kwai.plugin.dva.util.c$a;
import android.content.Context;
import qj7.h;
import com.kwai.plugin.dva.util.c$a$a;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.lang.NullPointerException;
import java.io.IOException;
import java.util.Arrays;
import ii7.b;
import okio.n;
import okio.l;
import okio.d;
import cud.k;
import java.util.Objects;

public final class c	// class@000ebf
{
    public static final c a;
    public static Context b;
    public static boolean c;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static c$b k(c p0,File p1,String p2,String p3,boolean p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = true;
       }
       return p0.j(p1, p2, p3, p4);
    }
    public final void a(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       a.p(p0, "file");
       if (!p0.exists()) {
          return;
       }
       File uFile = this.e(p0);
       if (uFile == null) {
          return;
       }
       if (!this.g(p0)) {
          return;
       }
       _monitor_enter(this);
       if (c.a.g(uFile)) {
          uFile.delete();
       }
       _monitor_exit(this);
       return;
    }
    public final String b(File p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.g(p1, "md5")) {
          return a.h(p0);
       }
       if (!a.g(p1, "sha1")) {
          throw new IllegalArgumentException(a.C("illegal algorithm type ", p1));
       }
       p1 = Base64.encodeToString(a.j(p0), 0);
       a.o(p1, "encodeToString\(FileUtils¡­a1\(file\), Base64.DEFAULT\)");
       int i = p1.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          int i3 = (!i2)? i1: i;
          i3 = (a.t(p1.charAt(i3), 32) <= 0)? 1: 0;
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return new Regex("\\r|\\n").replace(p1.subSequence(i1, (i + 1)).toString(), "");
    }
    public final String c(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FileInputStream uFileInputSt = new FileInputStream(p0);
       if (uFileInputSt instanceof BufferedInputStream) {
       }else {
          uFileInputSt = new BufferedInputStream(uFileInputSt, 0x19000);
       }
       Adler32 uAdler32 = new Adler32();
       byte[] uobyteArray = new byte[0x19000];
       int i = uFileInputSt.read(uobyteArray, 0, 0x19000);
       while (i != -1) {
          uAdler32.update(uobyteArray, 0, i);
       }
       b.a(uFileInputSt, null);
       return String.valueOf(uAdler32.getValue());
    }
    public final Pair d(File p0,long p1){
       RandomAccessFile obj1;
       long[] olongArray;
       Throwable obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj1 = PatchProxy.applyTwoRefs(obj, Long.valueOf(p1), this, uoc, "12");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       int i = 0;
       if (PatchProxy.isSupport(uoc)) {
          olongArray = PatchProxy.applyOneRefs(Long.valueOf(p1), this, uoc, "14");
          if (olongArray != patchProxyRe) {
          }else {
          label_0032 :
             long l = 0;
             long l1 = 1;
             int i3 = 1;
             if (p1 - 1024 < 0) {
                olongArray = new long[]{l,p1 - l1};
             }else {
                long l2 = p1 - l1;
                long l3 = 100;
                int i4 = 0;
                do {
                   i4 = i4 + i3;
                   l3 = l3 * 10;
                } while (l3 - p1 >= 0);
                l3 = (long)i4;
                l1 = q.o(((p1 + l3) / l3), l1);
                ArrayList uArrayList = new ArrayList();
                l3 = l1 + l;
                uArrayList.add(Long.valueOf(l));
                while (l3 - l2 < 0) {
                   uArrayList.add(Long.valueOf(l3));
                   l3 = l3 + l1;
                }
                uArrayList.add(Long.valueOf(l2));
                olongArray = CollectionsKt___CollectionsKt.H5(uArrayList);
             }
          }
       }else {
          goto label_0032 ;
       }
       byte[] uobyteArray = new byte[olongArray.length];
       obj1 = new RandomAccessFile(obj, "r");
       obj = null;
       int len = olongArray.length;
       int i1 = 0;
       while (i < len) {
          int i2 = i1 + 1;
          obj1.seek(olongArray[i]);
          uobyteArray[i1] = obj1.readByte();
          i = i + 1;
          i1 = i2;
       }
       b.a(obj1, obj);
       return r0.a(olongArray, uobyteArray);
    }
    public final File e(File p0){
       File obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pluginFile");
       obj = p0.getParentFile();
       if (obj == null) {
          return null;
       }
       return new File(obj, a.C(p0.getName(), ".identifier"));
    }
    public final boolean f(long p0){
       boolean b = (p0 - 0x19000 < 0)? true: false;
       return b;
    }
    public final boolean g(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "file");
       boolean b = (p0.exists() && (p0.canRead() && p0.isFile()))? true: false;
       return b;
    }
    public final void h(c$a p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "13")) {
          return;
       }
       Context b = c.b;
       if (b == null) {
          a.S("context");
          b = null;
       }
       if (!h.b(b)) {
          return;
       }else {
          String str = c$a.a.b(p0);
          d.a(a.C("identifier json ", str));
          _monitor_enter(this);
          File uFile = c.a.e(p1);
          if (uFile != null) {
             if (!uFile.exists()) {
                uFile.createNewFile();
             }
             FileOutputStream uFileOutputS = new FileOutputStream(uFile, false);
             Charset uCharset = Charset.defaultCharset();
             a.o(uCharset, "defaultCharset\(\)");
             if (str != null) {
                byte[] bytes = str.getBytes(uCharset);
                a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
                uFileOutputS.write(bytes);
                uFileOutputS.close();
                _monitor_exit(this);
                return;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
             }
          }else {
             throw new IOException(a.C(p1.getAbsolutePath(), "\'parent not found"));
          }
       }
    }
    public final c$b i(File p0,String p1,String p2){
       c$b uob;
       Pair pair;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b(p0, p2);
       int i = 0;
       if (a.g(obj, p1)) {
          if (!PatchProxy.applyVoidTwoRefs(p0, obj, this, c.class, "11")) {
             Context b = c.b;
             if (b == null) {
                a.S("context");
                b = null;
             }
             if (h.b(b)) {
                long l = p0.length();
                boolean b1 = this.f(l);
                if (b1) {
                   long[] olongArray = new long[true];
                   olongArray[i] = 0;
                   byte[] uobyteArray = new byte[true];
                   uobyteArray[i] = i;
                   pair = r0.a(olongArray, uobyteArray);
                }else {
                   pair = this.d(p0, l);
                }
                Object obj1 = pair.getFirst();
                Object obj2 = pair.getSecond();
                String str = Arrays.toString(obj1);
                a.o(str, "java.util.Arrays.toString\(this\)");
                d.c("for "+p0.getName()+" , file size="+p0.length()+" , specified position: "+str);
                long uobyteArray1 = p0.lastModified();
                if (!b1) {
                   b1 = this.c(p0);
                   if (b1 != null) {
                   label_00ac :
                      String str1 = b1;
                      d.c("for "+p0.getName()+" digestByFasterAlgorithm="+str1);
                      c$a uoa = new c$a(obj, uobyteArray1, l, obj1, obj2, str1);
                      this.h("for "+p0.getName()+" digestByFasterAlgorithm="+str1, p0);
                   }
                }
                b1 = "null";
                goto label_00ac ;
             }
          }
       label_00f9 :
          uob = new c$b(true, obj, a.C("verified by ", p2));
       }else {
          uob = new c$b(i, obj, "expected digest "+p1+" != "+obj);
       }
       return uob;
    }
    public final c$b j(File p0,String p1,String p2,boolean p3){
       c$b obj3;
       boolean b;
       boolean b1;
       String str2;
       c$a$a a;
       long l;
       boolean b2;
       int i;
       int this;
       Object obj = this;
       Object obj1 = p0;
       long[] obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c.class)) {
          obj3 = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, c.class, "2");
          if (obj3 != patchProxyRe) {
             return obj3;
          }
       }
       a.p(obj1, "file");
       a.p(obj2, "expectedDigest");
       a.p(p2, "algorithmType");
       if (!b.b()) {
          return this.l(p0, p1, p2);
       }else {
          b = false;
          if (!this.g(p0)) {
             return new c$b(b, null, "invalid file");
          }else if(p3 && c.c){
             b1 = true;
          }else {
             b1 = false;
          }
          if (PatchProxy.isSupport(c.class)) {
             obj3 = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(b1), this, c.class, "5");
             if (obj3 != patchProxyRe) {
             }else {
             label_0082 :
                c$a uoa = PatchProxy.applyOneRefs(obj1, obj, c.class, "10");
                if (uoa != patchProxyRe) {
                }else {
                   a.p(obj1, "targetFile");
                   File uFile = this.e(p0);
                   if (uFile != null) {
                      if (!obj.g(uFile)) {
                         uoa = null;
                      }else {
                         d uod = l.d(l.j(uFile));
                         Charset uCharset = Charset.defaultCharset();
                         a.o(uCharset, "defaultCharset\(\)");
                         b.a(uod, null);
                         uoa = c$a.a.a(uod.readString(uCharset));
                      }
                   }else {
                      throw new IOException(a.C(p0.getAbsolutePath(), "\'parent not found"));
                   }
                }
                if (uoa == null) {
                   obj3 = this.i(p0, p1, p2);
                }else {
                   String str = " != ";
                   if (!a.g(uoa.a(), obj2)) {
                      d.c("old digest "+uoa.a()+str+obj2);
                      obj3 = this.i(p0, p1, p2);
                   }else if(uoa.c() - p0.length()){
                      obj3 = new c$b(b, null, "fileSize expected "+uoa.c()+str+p0.length());
                   }else if(obj.f(uoa.c())){
                      obj3 = this.l(p0, p1, p2);
                   }else {
                      String str1 = "for ";
                      if (!b1 || uoa.d() - p0.lastModified()) {
                         str2 = uoa.b();
                         Pair pair = PatchProxy.applyTwoRefs(str2, obj1, obj, c.class, "16");
                         if (pair != patchProxyRe) {
                         }else {
                            String str3 = this.c(p0);
                            if (!a.g(str2, str3)) {
                               pair = r0.a(Boolean.FALSE, "expected digest by faster algorithm "+str2+str+str3);
                            }else {
                               d.a(str1+p0.getName()+" , verified by faster algorithm");
                               pair = r0.a(Boolean.TRUE, "verified by faster algorithm");
                            }
                         }
                         if (!pair.getFirst().booleanValue()) {
                            obj3 = new c$b(b, null, pair.getSecond());
                         }else {
                            a = c$a.a;
                            l = p0.lastModified();
                            Objects.requireNonNull(a);
                            if (PatchProxy.isSupport(c$a$a.class)) {
                               c$a uoa1 = PatchProxy.applyTwoRefs(uoa, Long.valueOf(l), a, c$a$a.class, "1");
                               if (uoa1 != patchProxyRe) {
                               label_0351 :
                                  obj.h(uoa1, obj1);
                                  obj3 = new c$b(true, null, "verified by faster algorithm");
                               }
                            }
                            a.p(uoa, "identifier");
                            c$a uoa2 = new c$a(uoa.a(), l, uoa.c(), uoa.f(), uoa.e(), uoa.b());
                            goto label_0351 ;
                         }
                      }else {
                         obj2 = uoa.f();
                         byte[] uobyteArray = uoa.e();
                         RandomAccessFile obj4 = PatchProxy.applyThreeRefs(p0, obj2, uobyteArray, this, c.class, "15");
                         if (obj4 != patchProxyRe) {
                            b2 = obj4.booleanValue();
                         }else if(!obj2.length){
                            i = 1;
                         }else {
                            i = 0;
                         }
                         if (i) {
                            str2 = (!uobyteArray.length)? 1: null;
                            if (str2) {
                               d.c("no verification required");
                            label_025b :
                               b2 = true;
                            }
                         }
                         if (obj2.length != uobyteArray.length) {
                            d.c("expectedBytePositionArray.size="+obj2.length+", expectedByteArray.size="+uobyteArray.length);
                         }else {
                            obj4 = new RandomAccessFile(obj1, "r");
                            long l1 = p0.length();
                            this = obj2.length;
                            int i1 = 0;
                            int i2 = 0;
                            while (true) {
                               if (i1 < this) {
                                  long l2 = obj2[i1];
                                  int i3 = i2 + 1;
                                  if (l2 - l1 >= 0) {
                                     d.c("verify failed, file size="+l1+", but specified position="+obj2);
                                     b.a(obj4, null);
                                  }else {
                                     obj4.seek(l2);
                                     if (a.t(obj4.readByte(), uobyteArray[i2])) {
                                        b.a(obj4, null);
                                     }else {
                                        i1++;
                                        i2 = i3;
                                     }
                                  }
                               }else {
                                  b.a(obj4, null);
                                  d.a(str1+p0.getName()+" , verify specified byte pass");
                                  goto label_025b ;
                               }
                            }
                         }
                         b2 = false;
                         if (!b2) {
                            obj3 = new c$b(b, null, "check specified byte failed");
                         }else {
                            obj3 = new c$b(true, null, "verified by specified byte");
                         }
                      }
                   }
                }
             }
          }else {
             goto label_0082 ;
          }
          if (!obj3.b()) {
             this.a(p0);
          }
          return obj3;
       }
    }
    public final c$b l(File p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "file");
       a.p(p1, "expectedDigest");
       a.p(p2, "algorithmType");
       boolean b = false;
       if (!this.g(p0)) {
          return new c$b(b, null, "invalid file");
       }
       String str = this.b(p0, p2);
       if (!a.g(str, p1)) {
          return new c$b(b, str, "\(strict\) expected digest "+p1+" != "+str);
       }
       return new c$b(true, str, a.C("\(strict\) verified by ", p2));
    }
}
