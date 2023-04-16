package com.kwai.robust.bsdiff.BSDiff;
import java.lang.Object;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.kwai.robust.bsdiff.BSUtil;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.zip.GZIPOutputStream;
import com.kwai.robust.bsdiff.BSDiff$b;
import com.kwai.robust.bsdiff.BSDiff$a;
import java.lang.System;
import java.lang.Math;

public class BSDiff	// class@001414
{
    public static final byte[] MAGIC_BYTES;

    static {
       BSDiff.MAGIC_BYTES = new byte[8]{'M','i','c','r','o','M','s','g'};
    }
    public void BSDiff(){
       super();
    }
    public static void bsdiff(File p0,File p1,File p2){
       FileOutputStream uFileOutputS = new FileOutputStream(p2);
       uFileOutputS.write(BSDiff.bsdiff(new BufferedInputStream(new FileInputStream(p0)), (int)p0.length(), new BufferedInputStream(new FileInputStream(p1)), (int)p1.length()));
       uFileOutputS.close();
    }
    public static byte[] bsdiff(InputStream p0,int p1,InputStream p2,int p3){
       byte[] uobyteArray = new byte[p1];
       BSUtil.readFromStream(p0, uobyteArray, 0, p1);
       p0.close();
       byte[] uobyteArray1 = new byte[p3];
       BSUtil.readFromStream(p2, uobyteArray1, 0, p3);
       p2.close();
       return BSDiff.bsdiff(uobyteArray, p1, uobyteArray1, p3);
    }
    public static byte[] bsdiff(byte[] p0,int p1,byte[] p2,int p3){
       int i12;
       BSDiff$b uob1;
       DataOutputStream uDataOutputS2;
       GZIPOutputStream gZIPOutputSt1;
       long l1;
       DataOutputStream uDataOutputS3;
       int i13;
       int i14;
       BSDiff$b uob2;
       int i19;
       byte[] uobyteArray = p0;
       int i = p1;
       int i1 = p3;
       int i2 = i + 1;
       int[] ointArray = new int[i2];
       int[] ointArray1 = new int[i2];
       BSDiff.qsufsort(ointArray, ointArray1, uobyteArray, i);
       byte[] uobyteArray1 = new byte[i1];
       byte[] uobyteArray2 = new byte[i1];
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       DataOutputStream uDataOutputS = new DataOutputStream(uByteArrayOu);
       uDataOutputS.write(BSDiff.MAGIC_BYTES);
       uDataOutputS.writeLong(-1);
       uDataOutputS.writeLong(-1);
       long l = (long)i1;
       uDataOutputS.writeLong(l);
       uDataOutputS.flush();
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uDataOutputS);
       DataOutputStream uDataOutputS1 = new DataOutputStream(gZIPOutputSt);
       BSDiff$b uob = new BSDiff$b(null);
       i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       while (i2 < i1) {
          i2 = i2 + i5;
          int i9 = i5;
          int i10 = 0;
          i5 = i2;
          while (true) {
             if (i2 < i1) {
                int i11 = i2;
                i12 = i3;
                uob1 = uob;
                uDataOutputS2 = uDataOutputS1;
                gZIPOutputSt1 = gZIPOutputSt;
                l1 = l;
                uDataOutputS3 = uDataOutputS;
                i2 = BSDiff.search(ointArray, p0, p1, p2, p3, i11, 0, p1, uob1);
                i3 = i5;
                i13 = i10;
                i14 = i11;
                int i15 = i14 + i2;
                while (i3 < i15) {
                   i15 = i3 + i6;
                   if (i15 < i && uobyteArray[i15] == p2[i3]) {
                      i13 = i13 + 1;
                   }
                   i3 = i3 + 1;
                }
                if (i2 != i13 || !i2) {
                   i15 = i13 + 8;
                   if (i2 > i15) {
                   label_00d5 :
                      if (i2 != i13 || i14 == i1) {
                         i3 = 0;
                         i13 = 0;
                         i15 = 0;
                         int i16 = 0;
                         while (true) {
                            int i17 = i7 + i13;
                            if (i17 < i14) {
                               int i18 = i8 + i13;
                               if (i18 < i) {
                                  if (uobyteArray[i18] == p2[i17]) {
                                     i3 = i3 + 1;
                                  }
                                  i13 = i13 + 1;
                                  i17 = i3 * 2;
                                  i17 = i17 - i13;
                                  i18 = i15 * 2;
                                  i18 = i18 - i16;
                                  if (i17 > i18) {
                                     i15 = i3;
                                     i16 = i13;
                                  }
                               }else if(i14 < i1){
                                  i3 = 1;
                                  i13 = 0;
                                  i15 = 0;
                                  i17 = 0;
                                  while (true) {
                                     i18 = i7 + i3;
                                     if (i14 >= i18) {
                                        uob2 = uob1;
                                        BSDiff$b a = uob2.a;
                                        if (a >= i3) {
                                           i19 = a - i3;
                                           i5 = i14 - i3;
                                           i6 = i2;
                                           if (uobyteArray[i19] == p2[i5]) {
                                              i15 = i15 + 1;
                                           }
                                           i2 = i15 * 2;
                                           i2 = i2 - i3;
                                           i19 = i17 * 2;
                                           i19 = i19 - i13;
                                           if (i2 > i19) {
                                              i13 = i3;
                                              i17 = i15;
                                           }
                                           i3 = i3 + 1;
                                           uob1 = uob2;
                                           i2 = i6;
                                        }else {
                                           i6 = i2;
                                        }
                                     }else {
                                        i6 = i2;
                                        uob2 = uob1;
                                     }
                                  }
                               }else {
                                  i6 = i2;
                                  uob2 = uob1;
                                  i13 = 0;
                               }
                               i2 = i7 + i16;
                               i3 = i14 - i13;
                               if (i2 > i3) {
                                  i15 = i2 - i3;
                                  i17 = 0;
                                  i19 = 0;
                                  i = 0;
                                  i5 = 0;
                                  while (i17 < i15) {
                                     i9 = i2 - i15;
                                     i9 = i9 + i17;
                                     i10 = i2;
                                     i9 = i8 + i16;
                                     i9 = i9 - i15;
                                     i9 = i9 + i17;
                                     if (p2[i9] == uobyteArray[i9]) {
                                        i5 = i5 + 1;
                                     }
                                     i2 = i3 + i17;
                                     i1 = uob2.a - i13;
                                     i1 = i1 + i17;
                                     if (p2[i2] == uobyteArray[i1]) {
                                        i5 = i5 - 1;
                                     }
                                     i2 = i5;
                                     if (i2 > i) {
                                        i19 = i17 + 1;
                                        i = i2;
                                     }
                                     i17 = i17 + 1;
                                     i5 = i2;
                                     i2 = i10;
                                  }
                                  i2 = i19 - i15;
                                  i16 = i16 + i2;
                                  i13 = i13 - i19;
                               }
                               for (i2 = 0; i2 < i16; i2 = i2 + 1) {
                                  i15 = i12 + i2;
                                  i17 = i7 + i2;
                                  i19 = i8 + i2;
                                  i17 = p2[i17] - uobyteArray[i19];
                                  uobyteArray1[i15] = (byte)i17;
                               }
                               i3 = i12;
                               i2 = 0;
                               i15 = i14 - i13;
                               i17 = i7 + i16;
                               i19 = i15 - i17;
                               while (i2 < i19) {
                                  i = i4;
                                  i4 = i + i2;
                                  i17 = i17 + i2;
                                  uobyteArray2[i4] = p2[i17];
                                  i2 = i2 + 1;
                                  i4 = i;
                               }
                               i3 = i3 + i16;
                               i4 = i4 + i19;
                               DataOutputStream uDataOutputS4 = uDataOutputS2;
                               uDataOutputS4.writeInt(i16);
                               uDataOutputS4.writeInt(i19);
                               i17 = uob2.a - i13;
                               i8 = i8 + i16;
                               i17 = i17 - i8;
                               uDataOutputS4.writeInt(i17);
                               BSDiff$b a1 = uob2.a;
                               i8 = a1 - i13;
                               i13 = a1 - i14;
                               i = p1;
                               i1 = p3;
                               i7 = i15;
                               i5 = i6;
                               gZIPOutputSt = gZIPOutputSt1;
                               uDataOutputS = uDataOutputS3;
                               uDataOutputS1 = uDataOutputS4;
                               i6 = i13;
                               i2 = i14;
                               uob = uob2;
                               l = l1;
                            }else {
                               goto label_010d ;
                            }
                         }
                         uDataOutputS3 = uDataOutputS;
                         uDataOutputS1.flush();
                         gZIPOutputSt.finish();
                         i2 = uDataOutputS3.size() - 32;
                         uDataOutputS1 = uDataOutputS3;
                         GZIPOutputStream gZIPOutputSt2 = new GZIPOutputStream(uDataOutputS1);
                         gZIPOutputSt2.write(uobyteArray1, 0, i3);
                         gZIPOutputSt2.finish();
                         gZIPOutputSt2.flush();
                         gZIPOutputSt2 = new GZIPOutputStream(uDataOutputS1);
                         gZIPOutputSt2.write(uobyteArray2, 0, i4);
                         gZIPOutputSt2.finish();
                         gZIPOutputSt2.flush();
                         uDataOutputS1.close();
                         ByteArrayOutputStream uByteArrayOu1 = new ByteArrayOutputStream(32);
                         DataOutputStream uDataOutputS5 = new DataOutputStream(uByteArrayOu1);
                         uDataOutputS5.write(BSDiff.MAGIC_BYTES);
                         uDataOutputS5.writeLong((long)i2);
                         uDataOutputS5.writeLong((long)((uDataOutputS1.size() - i2) - 32));
                         uDataOutputS5.writeLong(l);
                         uDataOutputS5.close();
                         byte[] uobyteArray3 = uByteArrayOu.toByteArray();
                         byte[] uobyteArray4 = uByteArrayOu1.toByteArray();
                         System.arraycopy(uobyteArray4, 0, uobyteArray3, 0, uobyteArray4.length);
                         return uobyteArray3;
                      }else {
                         i5 = i2;
                         i2 = i14;
                         i3 = i12;
                         uob = uob1;
                         uDataOutputS1 = uDataOutputS2;
                         gZIPOutputSt = gZIPOutputSt1;
                         l = l1;
                         uDataOutputS = uDataOutputS3;
                      }
                      i13 = 0;
                   }else {
                      i15 = i14 + i6;
                      if (i15 < i && uobyteArray[i15] == p2[i14]) {
                         i13 = i13 - 1;
                      }
                      i10 = i13;
                      i13 = i14 + 1;
                      i9 = i2;
                      i5 = i3;
                      i2 = i13;
                      i3 = i12;
                      uob = uob1;
                      uDataOutputS1 = uDataOutputS2;
                      gZIPOutputSt = gZIPOutputSt1;
                      l = l1;
                      uDataOutputS = uDataOutputS3;
                      i13 = 0;
                   }
                }else {
                   goto label_00d5 ;
                }
             }else {
                i12 = i3;
                uob1 = uob;
                uDataOutputS2 = uDataOutputS1;
                gZIPOutputSt1 = gZIPOutputSt;
                l1 = l;
                uDataOutputS3 = uDataOutputS;
                i14 = i2;
                i2 = i9;
                i13 = i10;
                goto label_00d5 ;
             }
          }
       }
    }
    public static int matchlen(byte[] p0,int p1,int p2,byte[] p3,int p4,int p5){
       p1 = Math.min((p1 - p2), (p4 - p5));
       p4 = 0;
       while (true) {
          if (p4 >= p1) {
             return p1;
          }
          int i = p2 + p4;
          int i1 = p5 + p4;
          if (p0[i] != p3[i1]) {
             break ;
          }else {
             p4++;
          }
       }
       return p4;
    }
    public static int memcmp(byte[] p0,int p1,int p2,byte[] p3,int p4,int p5){
       int i3;
       p1 = p1 - p2;
       p4 = p4 - p5;
       if (p1 > p4) {
          p1 = p4;
       }
       int i = 0;
       while (true) {
          if (i >= p1) {
             return 0;
          }
          int i1 = i + p2;
          int i2 = i + p5;
          if (p0[i1] != p3[i2]) {
             i3 = (p0[i1] < p3[i2])? -1: 1;
             break ;
          }else {
             i = i + 1;
          }
       }
       return i3;
    }
    public static void qsufsort(int[] p0,int[] p1,byte[] p2,int p3){
       int i4;
       int i5;
       int i = 256;
       int[] ointArray = new int[i];
       int i1 = 0;
       int i2 = 0;
       int i3 = 255;
       while (i2 < p3) {
          i3 = i3 & p2[i2];
          i4 = ointArray[i3] + 1;
          ointArray[i3] = i4;
          i2 = i2 + 1;
       }
       for (i2 = 1; i2 < i; i2 = i2 + 1) {
          i5 = i2 - 1;
          i4 = ointArray[i2] + ointArray[i5];
          ointArray[i2] = i4;
       }
       i2 = 255;
       while (i2 > 0) {
          i4 = i2 - 1;
          ointArray[i2] = ointArray[i4];
          i2 = i2 - 1;
       }
       ointArray[i1] = i1;
       for (i2 = 0; i2 < p3; i2 = i2 + 1) {
          i4 = p2[i2] & i3;
          i5 = ointArray[i4] + 1;
          ointArray[i4] = i5;
          p0[i5] = i2;
       }
       p0[i1] = p3;
       for (i2 = 0; i2 < p3; i2 = i2 + 1) {
          i4 = p2[i2] & i3;
          p1[i2] = ointArray[i4];
       }
       p1[p3] = i1;
       int i6 = 1;
       i2 = -1;
       while (i6 < i) {
          i4 = i6 - 1;
          i4 = ointArray[i4] + 1;
          if (ointArray[i6] == i4) {
             p0[ointArray[i6]] = i2;
          }
          i6++;
       }
       p0[i1] = i2;
       i6 = 1;
       int i7 = p3 + 1;
       i2 = - i7;
       while (p0[i1] != i2) {
          i = 0;
          while (true) {
             i2 = 0;
             break ;
          }
          while (true) {
             if (i < i7) {
                if (p0[i] < 0) {
                   i2 = i2 - p0[i];
                   i = i - p0[i];
                }else if(i2){
                   i3 = i - i2;
                   i2 = - i2;
                   p0[i3] = i2;
                }
                i2 = p1[p0[i]] + 1;
                i2 = i2 - i;
                BSDiff.split(p0, p1, i, i2, i6);
                i = i + i2;
             }else if(i2){
                i = i - i2;
                i7 = - i2;
                p0[i] = i7;
             }
             i6 = i6 + i6;
          }
       }
       for (; i1 < i7; i1 = i1 + 1) {
          p0[p1[i1]] = i1;
       }
       return;
    }
    public static int search(int[] p0,byte[] p1,int p2,byte[] p3,int p4,int p5,int p6,int p7,BSDiff$b p8){
       int i = p8;
       int i1 = p7 - p6;
       int i2 = 2;
       if (i1 < i2) {
          i1 = BSDiff.matchlen(p1, p2, p0[p6], p3, p4, p5);
          i2 = BSDiff.matchlen(p1, p2, p0[p7], p3, p4, p5);
          if (i1 > i2) {
             i.a = p0[p6];
             return i1;
          }else {
             i.a = p0[p7];
             return i2;
          }
       }else {
          int i3 = p6 + (i1 / i2);
          if (BSDiff.memcmp(p1, p2, p0[i3], p3, p4, p5) < 0) {
             return BSDiff.search(p0, p1, p2, p3, p4, p5, i3, p7, p8);
          }
          return BSDiff.search(p0, p1, p2, p3, p4, p5, p6, i3, p8);
       }
    }
    public static void split(int[] p0,int[] p1,int p2,int p3,int p4){
       int i4;
       int i5;
       int i6;
       int i7;
       int i8;
       int i9;
       int i10;
       int[] ointArray = p0;
       int[] ointArray1 = p1;
       int i = p2;
       int i1 = p3;
       int i2 = p4;
       int i3 = 0;
       if (i1 < 16) {
          i4 = i;
          i5 = i + i1;
          while (i4 < i5) {
             i6 = ointArray[i4] + i2;
             i6 = ointArray1[i6];
             i7 = 1;
             i8 = 1;
             i9 = i4 + i7;
             while (i9 < i5) {
                i10 = ointArray[i9] + i2;
                if (ointArray1[i10] < i6) {
                   i6 = ointArray[i9] + i2;
                   i6 = ointArray1[i6];
                   i8 = 0;
                }
                i10 = ointArray[i9] + i2;
                if (ointArray1[i10] == i6) {
                   i10 = i4 + i8;
                   int i11 = ointArray[i10];
                   ointArray[i10] = ointArray[i9];
                   ointArray[i9] = i11;
                   i8 = i8 + 1;
                }
                i7 = i7 + 1;
             }
             for (i5 = 0; i5 < i8; i5 = i5 + 1) {
                i6 = i4 + i5;
                i7 = i4 + i8;
                i7 = i7 - 1;
                ointArray1[ointArray[i6]] = i7;
             }
             if (i8 == 1) {
                ointArray[i4] = -1;
             }
             i4 = i4 + i8;
          }
          return;
       }else {
          i4 = ointArray1[(ointArray[((i1 / 2) + i)] + i2)];
          i5 = i;
          i6 = 0;
          int i12 = 0;
          i7 = i + i1;
          while (i5 < i7) {
             i7 = ointArray[i5] + i2;
             if (ointArray1[i7] < i4) {
                i6 = i6 + 1;
             }
             i7 = ointArray[i5] + i2;
             if (ointArray1[i7] == i4) {
                i12 = i12 + 1;
             }
             i5 = i5 + 1;
          }
          i6 = i6 + i;
          i12 = i12 + i6;
          i1 = i;
          i5 = 0;
          i8 = 0;
          while (i1 < i6) {
             i9 = ointArray[i1] + i2;
             if (ointArray1[i9] < i4) {
                i1 = i1 + 1;
             }else {
                i9 = ointArray[i1] + i2;
                if (ointArray1[i9] == i4) {
                   i9 = ointArray[i1];
                   i10 = i6 + i5;
                   ointArray[i1] = ointArray[i10];
                   ointArray[i10] = i9;
                   i5 = i5 + 1;
                }else {
                   i9 = ointArray[i1];
                   i10 = i12 + i8;
                   ointArray[i1] = ointArray[i10];
                   ointArray[i10] = i9;
                   i8 = i8 + 1;
                }
             }
          }
          i1 = i6 + i5;
          while (i1 < i12) {
             i9 = ointArray[i1] + i2;
             if (ointArray1[i9] == i4) {
                i5 = i5 + 1;
             }else {
                i9 = ointArray[i1];
                i10 = i12 + i8;
                ointArray[i1] = ointArray[i10];
                ointArray[i10] = i9;
                i8 = i8 + 1;
             }
          }
          if (i6 > i) {
             BSDiff.split(ointArray, ointArray1, i, (i6 - i), i2);
          }
          i = i12 - i6;
          while (i3 < i) {
             i = i6 + i3;
             i1 = i12 - 1;
             ointArray1[ointArray[i]] = i1;
             i3 = i3 + 1;
          }
          if (i6 == (i12 - 1)) {
             ointArray[i6] = -1;
          }
          if (i7 > i12) {
             BSDiff.split(ointArray, ointArray1, i12, (i7 - i12), i2);
          }
          return;
       }
    }
}
