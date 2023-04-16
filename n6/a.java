package n6.a;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class a	// class@0026c5
{
    public static final byte[] a;
    public static final char[] b;

    static {
       int i3;
       byte[] a;
       int i6;
       int i = 128;
       byte[] uobyteArray = new byte[i];
       a.a = uobyteArray;
       char[] uocharArray = new char[64];
       a.b = uocharArray;
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          a.a[i2] = -1;
       }
       for (i = 90; i >= 65; i = i - 1) {
          i3 = i - 65;
          a.a[i] = (byte)i3;
       }
       i = 122;
       i2 = 26;
       while (i >= 97) {
          int i4 = i - 97;
          i4 = i4 + i2;
          a.a[i] = (byte)i4;
          i = i - 1;
       }
       i = 57;
       i3 = 52;
       while (i >= 48) {
          int i5 = i - 48;
          i5 = i5 + i3;
          a.a[i] = (byte)i5;
          i = i - 1;
       }
       a = a.a;
       a[43] = 62;
       a[47] = 63;
       for (i = 0; i <= 25; i = i + 1) {
          i6 = i + 65;
          a.b[i] = (char)i6;
       }
       i = 0;
       while (i2 <= 51) {
          i6 = i + 97;
          a.b[i2] = (char)i6;
          i2 = i2 + 1;
          i = i + 1;
       }
       while (i3 <= 61) {
          i2 = i1 + 48;
          a.b[i3] = (char)i2;
          i3 = i3 + 1;
          i1 = i1 + 1;
       }
       char[] b = a.b;
       b[62] = 43;
       b[63] = 47;
    }
    public static String a(byte[] p0){
       int b1;
       if (p0 == null) {
          return null;
       }
       int i = 8;
       int i1 = p0.length * 8;
       if (!i1) {
          return "";
       }
       byte i2 = i1 % 24;
       i1 = i1 / 24;
       int i3 = (i2)? i1 + 1: i1;
       char[] uocharArray = new char[(i3 * 4)];
       byte i4 = 0;
       int i5 = 0;
       int i6 = 0;
       while (i4 < i1) {
          int i7 = i5 + 1;
          i5 = p0[i5];
          byte i8 = i7 + 1;
          i7 = p0[i7];
          int i9 = i8 + 1;
          i8 = p0[i8];
          byte i10 = i7 & 0x0f;
          i10 = (byte)i10;
          byte i11 = i5 & 0x03;
          i11 = (byte)i11;
          int i12 = i5 & 0x80;
          i5 = i5 >> 2;
          if (i12) {
             i5 = i5 ^ 0x00c0;
          }
          i5 = (byte)i5;
          i12 = i7 & 0x80;
          i7 = i7 >> 4;
          if (i12) {
             i7 = i7 ^ 0x00f0;
          }
          i7 = (byte)i7;
          i12 = i8 & 0x80;
          if (!i12) {
             i12 = i8 >> 6;
          }else {
             i12 = i8 >> 6;
             i12 = i12 ^ 0x00fc;
          }
          int i13 = i6 + 1;
          char[] b = a.b;
          uocharArray[i6] = b[i5];
          i5 = i13 + 1;
          i6 = i11 << 4;
          i6 = i6 | i7;
          uocharArray[i13] = b[i6];
          i6 = i5 + 1;
          i7 = i10 << 2;
          i7 = i7 | (byte)i12;
          uocharArray[i5] = b[i7];
          i5 = i6 + 1;
          i7 = i8 & 0x3f;
          uocharArray[i6] = b[i7];
          i4 = i4 + 1;
          i6 = i5;
          i5 = i9;
       }
       if (i2 == i) {
          b1 = p0[i5];
          i = (byte)(b1 & 0x03);
          i2 = b1 & 0x80;
          b1 = b1 >> 2;
          if (i2) {
             b1 = b1 ^ 0x00c0;
          }
          i2 = i6 + 1;
          char[] b2 = a.b;
          uocharArray[i6] = b2[(byte)b1];
          b1 = i2 + 1;
          uocharArray[i2] = b2[(i << 4)];
          uocharArray[b1] = '=';
          uocharArray[(b1 + 1)] = '=';
       }else if(i2 == 16){
          i = p0[i5];
          b1 = p0[(i5 + 1)];
          i2 = (byte)(b1 & 0x0f);
          i4 = (byte)(i & 0x03);
          i5 = i & 0x80;
          i = i >> 2;
          if (i5) {
             i = i ^ 0x00c0;
          }
          i = (byte)i;
          b1 = b1 >> 4;
          if (b1 & 0x80) {
             b1 = b1 ^ 0x00f0;
          }
          i5 = i6 + 1;
          char[] b3 = a.b;
          uocharArray[i6] = b3[i];
          i = i5 + 1;
          uocharArray[i5] = b3[((byte)b1 | (i4 << 4))];
          uocharArray[i] = b3[(i2 << 2)];
          uocharArray[(i + 1)] = '=';
       }
       return new String(uocharArray);
    }
    public static boolean b(char p0){
       boolean b = (p0 < 128 && a.a[p0] != -1)? true: false;
       return b;
    }
    public static byte[] c(String p0){
       byte i1;
       byte[] uobyteArray1;
       int i2;
       int i3;
       char c;
       byte[] a;
       byte[] uobyteArray = null;
       if (p0 == null) {
          return uobyteArray;
       }
       char[] uocharArray = p0.toCharArray();
       int i = 0;
       if (uocharArray == null) {
          i1 = 0;
       }else {
          int len = uocharArray.length;
          i2 = 0;
          i1 = 0;
          while (i2 < len) {
             c = uocharArray[i2];
             i3 = (c != ' ' && (c != 13 && (c == 10 || c == 9)))? 1: 0;
             if (!i3) {
                i3 = i1 + 1;
                uocharArray[i1] = uocharArray[i2];
                i1 = i3;
             }
             i2 = i2 + 1;
          }
       }
       if (i1 % 4) {
          return uobyteArray;
       }else {
          i1 = i1 / 4;
          if (!i1) {
             uobyteArray1 = new byte[i];
             return uobyteArray1;
          }else {
             byte[] uobyteArray2 = new byte[(i1 * 3)];
             i2 = 0;
             i3 = 0;
             int i4 = 0;
             while (true) {
                int i5 = i1 - 1;
                if (i2 < i5) {
                   i5 = i3 + 1;
                   c = uocharArray[i3];
                   if (a.b(c)) {
                      byte i6 = i5 + 1;
                      char c1 = uocharArray[i5];
                      if (a.b(c1)) {
                         int i7 = i6 + 1;
                         char c2 = uocharArray[i6];
                         if (a.b(c2)) {
                            int i8 = i7 + 1;
                            char c3 = uocharArray[i7];
                            if (a.b(c3)) {
                               a = a.a;
                               i5 = a[c1];
                               i6 = a[c2];
                               int i9 = i4 + 1;
                               i3 = a[c] << 2;
                               int i10 = i5 >> 4;
                               i3 = i3 | i10;
                               uobyteArray2[i4] = (byte)i3;
                               i3 = i9 + 1;
                               i4 = i5 & 0x0f;
                               i4 = i4 << 4;
                               i5 = i6 >> 2;
                               i5 = i5 & 0x0f;
                               i4 = i4 | i5;
                               uobyteArray2[i9] = (byte)i4;
                               i4 = i3 + 1;
                               i5 = i6 << 6;
                               i5 = i5 | a[c3];
                               uobyteArray2[i3] = (byte)i5;
                               i2 = i2 + 1;
                               i3 = i8;
                            }
                         }
                      }
                   }
                   break ;
                }else {
                   byte i11 = i3 + 1;
                   char c4 = uocharArray[i3];
                   if (a.b(c4)) {
                      i3 = i11 + 1;
                      char c5 = uocharArray[i11];
                      if (a.b(c5)) {
                         byte[] a1 = a.a;
                         i1 = a1[c4];
                         i11 = a1[c5];
                         c = uocharArray[i3];
                         char c6 = uocharArray[(i3 + 1)];
                         if (!a.b(c) || !a.b(c6)) {
                            if (a.d(c) && a.d(c6)) {
                               if (i11 & 0x0f) {
                                  return uobyteArray;
                               }else {
                                  i2 = i2 * 3;
                                  uobyteArray1 = new byte[(i2 + 1)];
                                  System.arraycopy(uobyteArray2, i, uobyteArray1, i, i2);
                                  uobyteArray1[i4] = (byte)((i1 << 2) | (i11 >> 4));
                                  return uobyteArray1;
                               }
                            }else if(!a.d(c) && a.d(c6)){
                               byte b = a1[c];
                               if (b & 0x03) {
                                  return uobyteArray;
                               }else {
                                  i2 = i2 * 3;
                                  uobyteArray = new byte[(i2 + 2)];
                                  System.arraycopy(uobyteArray2, i, uobyteArray, i, i2);
                                  uobyteArray[i4] = (byte)((i1 << 2) | (i11 >> 4));
                                  uobyteArray[(i4 + 1)] = (byte)(((b >> 2) & 0x0f) | ((i11 & 0x0f) << 4));
                               }
                            }
                         }else {
                            byte b1 = a1[c];
                            i = i4 + 1;
                            uobyteArray2[i4] = (byte)((i1 << 2) | (i11 >> 4));
                            uobyteArray2[i] = (byte)(((i11 & 0x0f) << 4) | ((b1 >> 2) & 0x0f));
                            uobyteArray2[(i + 1)] = (byte)(a1[c6] | (b1 << 6));
                            return uobyteArray2;
                         }
                      }
                   }
                   return uobyteArray;
                }
             }
             return uobyteArray;
          }
       }
    }
    public static boolean d(char p0){
       boolean b = (p0 == '=')? true: false;
       return b;
    }
}
