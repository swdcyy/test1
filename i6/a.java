package i6.a;
import h6.a;
import java.lang.String;
import i6.b;
import i6.d;
import h6.b;
import java.lang.AssertionError;
import java.lang.Object;
import java.security.SecureRandom;
import java.util.Arrays;
import java.lang.System;

public class a extends a	// class@002183
{
    public static final boolean b = true;

    public void a(byte[] p0){
       super(p0);
    }
    public static a b(String p0,long p1,b p2,short p3,d p4){
       String str = p0;
       long l = p1;
       b uob = p2;
       int i = p3;
       d uod = p4;
       byte b = 1;
       byte[] uobyteArray = b.b(b);
       boolean b1 = a.b;
       if (!b1 && uobyteArray.length != b) {
          throw new AssertionError();
       }
       int i1 = 2;
       byte[] uobyteArray1 = new byte[i1];
       uobyteArray1[0] = (byte)(str.charAt(0) & 0x00ff);
       uobyteArray1[b] = (byte)(str.charAt(b) & 0x00ff);
       int i2 = 8;
       byte[] uobyteArray2 = new byte[i2];
       uobyteArray2[0] = (byte)(int)l;
       uobyteArray2[b] = (byte)(int)(l >> i2);
       uobyteArray2[i1] = (byte)(int)(l >> 16);
       uobyteArray2[3] = (byte)(int)(l >> 24);
       uobyteArray2[4] = (byte)(int)(l >> 32);
       uobyteArray2[5] = (byte)(int)(l >> 40);
       uobyteArray2[6] = (byte)(int)(l >> 48);
       uobyteArray2[7] = (byte)(int)(l >> 56);
       byte[] uobyteArray3 = b.c();
       if (!b1 && uobyteArray3.length != i1) {
          throw new AssertionError();
       }
       p2.a();
       byte[] uobyteArray4 = b.b(uob.a);
       if (!b1 && uobyteArray4.length != b) {
          throw new AssertionError();
       }
       byte[] uobyteArray5 = b.b(uob.b);
       if (!b1 && uobyteArray5.length != b) {
          throw new AssertionError();
       }
       byte[] uobyteArray6 = uob.c.clone();
       if (!b1 && uobyteArray6.length != (uob.b & 0x00ff)) {
          throw new AssertionError();
       }
       byte[] uobyteArray7 = new byte[i1];
       uobyteArray7[0] = (byte)i;
       uobyteArray7[b] = (byte)(i >> i2);
       byte[] uobyteArray8 = b.c();
       if (!b1 && uobyteArray8.length != i1) {
          throw new AssertionError();
       }
       p4.a();
       byte[] uobyteArray9 = b.b(uod.a);
       if (!b1 && uobyteArray9.length != b) {
          throw new AssertionError();
       }
       byte[] uobyteArray10 = uod.b.clone();
       if (!b1 && uobyteArray10.length != (uod.a & 0x00ff)) {
          throw new AssertionError();
       }
       byte[] uobyteArray11 = new byte[4];
       b.a().nextBytes(uobyteArray11);
       a uoa = uod;
       byte[][] uobyteArray12 = new byte[][12];
       uobyteArray12[0] = uobyteArray;
       uobyteArray12[b] = uobyteArray1;
       uobyteArray12[2] = uobyteArray2;
       uobyteArray12[3] = uobyteArray3;
       uobyteArray12[4] = uobyteArray4;
       uobyteArray12[5] = uobyteArray5;
       uobyteArray12[6] = uobyteArray6;
       uobyteArray12[7] = uobyteArray7;
       uobyteArray12[8] = uobyteArray8;
       uobyteArray12[9] = uobyteArray9;
       uobyteArray12[10] = uobyteArray10;
       uobyteArray12[11] = uobyteArray11;
       int i3 = 0;
       for (i2 = 0; i2 < 12; i2 = i2 + 1) {
          i3 = i3 + uobyteArray12[i2].length;
       }
       uobyteArray10 = null;
       int i4 = 0;
       int i5 = 0;
       while (i4 < 12) {
          object oobject = uobyteArray12[i4];
          if (uobyteArray10 == null) {
             uobyteArray10 = Arrays.copyOf(oobject, i3);
             i5 = oobject.length;
          }else {
             System.arraycopy(oobject, 0, uobyteArray10, i5, oobject.length);
             i5 = i5 + oobject.length;
          }
          i4 = i4 + 1;
       }
       return new a(uobyteArray10);
    }
}
