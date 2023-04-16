package com.loc.bc;
import java.lang.Object;
import java.lang.System;

public final class bc	// class@001382
{
    public static int a = 4;

    public static byte[] a(byte[] p0,byte[] p1){
       int i5;
       int i7;
       int i8;
       if (!p0.length) {
          return p0;
       }
       int len = p0.length;
       int a = bc.a;
       int i = a - (len % a);
       int i1 = ((len / a) + 1) * a;
       byte[] uobyteArray = new byte[i1];
       int i2 = 0;
       System.arraycopy(p0, i2, uobyteArray, i2, p0.length);
       for (; len < i1; len = len + 1) {
          uobyteArray[len] = (byte)i;
       }
       int[] ointArray = bc.a(uobyteArray);
       int[] ointArray1 = bc.a(p1);
       len = ointArray.length - 1;
       if (len > 0) {
          i = 4;
          if (ointArray1.length < i) {
             int[] ointArray2 = new int[i];
             System.arraycopy(ointArray1, i2, ointArray2, i2, ointArray1.length);
             ointArray1 = ointArray2;
          }
          a = ointArray[len];
          i = (52 / (len + 1)) + 6;
          i1 = 0;
          int i3 = i - 1;
          while (i > 0) {
             i1 = i1 - 1640531527;
             i = i1 >> 2;
             i = i & 0x03;
             for (int i4 = 0; i4 < len; i4 = i5) {
                i5 = i4 + 1;
                int i6 = ointArray[i5];
                i7 = a >> 5;
                i8 = i6 << 2;
                i7 = i7 ^ i8;
                i8 = i6 >> 3;
                int i9 = a << 4;
                i8 = i8 ^ i9;
                i7 = i7 + i8;
                i6 = i6 ^ i1;
                i8 = i4 & 0x03;
                i8 = i8 ^ i;
                a = a ^ ointArray1[i8];
                i6 = i6 + a;
                a = i7 ^ i6;
                a = a + ointArray[i4];
                ointArray[i4] = a;
             }
             i5 = ointArray[i2];
             int i10 = a >> 5;
             i7 = i5 << 2;
             i10 = i10 ^ i7;
             i7 = i5 >> 3;
             i8 = a << 4;
             i7 = i7 ^ i8;
             i10 = i10 + i7;
             i5 = i5 ^ i1;
             i4 = i4 & 0x03;
             i = i ^ i4;
             a = a ^ ointArray1[i];
             i5 = i5 + a;
             a = i10 ^ i5;
             a = a + ointArray[len];
             ointArray[len] = a;
             i = i3;
          }
       }
       int i11 = ointArray.length << 2;
       byte[] uobyteArray1 = new byte[i11];
       for (; i2 < i11; i2 = i2 + 1) {
          a = i2 >> 2;
          i = i2 & 0x03;
          i = i << 3;
          a = ointArray[a] >> i;
          a = a & 0x00ff;
          uobyteArray1[i2] = (byte)a;
       }
       return uobyteArray1;
    }
    public static int[] a(byte[] p0){
       int[] ointArray = new int[(p0.length >> 2)];
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = i >> 2;
          int i2 = p0[i] & 0x00ff;
          int i3 = i & 0x03;
          i3 = i3 << 3;
          i2 = i2 << i3;
          int i4 = ointArray[i1] | i2;
          ointArray[i1] = i4;
       }
       return ointArray;
    }
}
