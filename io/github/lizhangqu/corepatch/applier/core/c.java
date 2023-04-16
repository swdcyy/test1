package io.github.lizhangqu.corepatch.applier.core.c;
import io.github.lizhangqu.corepatch.applier.core.a;
import nk.a;
import java.io.File;
import java.util.zip.InflaterInputStream;
import java.io.OutputStream;
import com.google.archivepatcher.applier.b;
import io.github.lizhangqu.corepatch.applier.core.b;
import java.io.InputStream;
import java.lang.Object;
import java.util.Objects;
import java.util.HashMap;
import java.lang.String;
import java.security.MessageDigest;
import com.google.archivepatcher.shared.c;
import java.util.zip.Deflater;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import nk.a$b;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.google.archivepatcher.shared.JreDeflateParameters;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import nk.a$a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;

public final class c extends a	// class@001039
{
    public a b;

    public void c(){
       super();
       this.b = new a();
    }
    public void g(File p0,InflaterInputStream p1,OutputStream p2){
       new b(this.a).a(p0, p1, p2);
    }
    public boolean isSupport(){
       c f;
       int[] ointArray2;
       Objects.requireNonNull(this.b);
       HashMap hashMap = new HashMap();
       try{
          HashMap hashMap1 = new HashMap();
          MessageDigest instance = MessageDigest.getInstance("SHA-256");
          c uoc = new c();
          int b = true;
          uoc.g = b;
          int i = 2;
          boolean[] uobooleanArr = new boolean[i]{0x01,0x00};
          int i1 = 3;
          int[] ointArray = new int[i1]{0,1,2};
          int[] ointArray1 = new int[9]{1,2,3,4,5,6,7,8,9};
          int i2 = 0;
          while (true) {
             if (i2 < i) {
                boolean b1 = uobooleanArr[i2];
                if (b1 != uoc.c) {
                   uoc.b();
                   uoc.c = b1;
                }
                int i3 = 0;
                while (true) {
                   if (i3 < i1) {
                      i1 = ointArray[i3];
                      f = uoc.f;
                      if (f != null && i1 != uoc.b) {
                         f.reset();
                         uoc.f.setStrategy(i1);
                      }
                      uoc.b = i1;
                      if (i1 == i) {
                         ointArray2 = new int[b];
                         ointArray2[0] = b;
                      }else {
                         ointArray2 = ointArray1;
                      }
                      int len = ointArray2.length;
                      i = 0;
                      while (true) {
                         if (i < len) {
                            b = ointArray2[i];
                            if (b >= 0 && b <= 9) {
                               ByteArrayOutputStream c f1 = uoc.f;
                               boolean[] uobooleanArr1 = uobooleanArr;
                               if (f1 != null && b != uoc.a) {
                                  f1.reset();
                                  uoc.f.setLevel(b);
                               }
                               uoc.a = b;
                               try{
                                  f1 = new ByteArrayOutputStream();
                                  int[] ointArray3 = ointArray;
                                  uoc.a(new ByteArrayInputStream(a$b.a), f1);
                                  instance.reset();
                                  byte[] f11 = instance.digest(f1.toByteArray());
                                  StringBuilder str = "";
                                  MessageDigest messageDiges = instance;
                                  int i4 = 0;
                                  while (i4 < f11.length) {
                                     int i5 = f11[i4] & 0x00ff;
                                     byte[] uobyteArray = f11;
                                     if (i5 < 16) {
                                        str = str+'0';
                                     }
                                     str = str+Integer.toHexString(i5);
                                     i4 = i4 + 1;
                                     f11 = uobyteArray;
                                  }
                                  hashMap1.put(JreDeflateParameters.of(b, i1, b1), str);
                                  i = i + 1;
                                  uobooleanArr = uobooleanArr1;
                                  ointArray = ointArray3;
                                  instance = messageDiges;
                                  b = 1;
                               }catch(java.io.IOException e0){
                                  throw new RuntimeException(e0);
                               }
                            }else {
                               break ;
                            }
                         }else {
                            i3 = i3 + 1;
                            b = 1;
                            i = 2;
                            i1 = 3;
                            f = 9;
                         }
                      }
                      throw new IllegalArgumentException("compressionLevel must be in the range [0,9]: "+b);
                   }else {
                      i2 = i2 + 1;
                      b = 1;
                      i = 2;
                      i1 = 3;
                      f = 9;
                   }
                }
             }else {
                uoc.b();
                Iterator iterator = a$a.a.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String str1 = hashMap1.get(uEntry.getKey());
                   if (!str1.equals(uEntry.getValue())) {
                      hashMap.put(uEntry.getKey(), str1);
                   }
                }
                if (!hashMap.size()) {
                   return true;
                }
                Iterator iterator1 = hashMap.keySet().iterator();
                while (true) {
                   if (!iterator1.hasNext()) {
                      return true;
                   }
                   JreDeflateParameters jreDeflatePa = iterator1.next();
                   if (jreDeflatePa.level == 9 && jreDeflatePa.nowrap == true) {
                      break ;
                   }else {
                      boolean b2 = false;
                   }
                }
                return false;
             }
          }
       }catch(java.security.NoSuchAlgorithmException e0){
          throw super("System doesn\'t support SHA-256", e0);
       }
    }
}
