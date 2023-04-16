package com.unionpay.utils.d;
import java.lang.String;
import javax.crypto.Cipher;
import java.lang.Object;
import java.lang.System;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.lang.IllegalArgumentException;

public final class d	// class@00100c
{

    public static byte[] a(int p0,byte[] p1,byte[] p2){
       if (p1 != null) {
          int i = 24;
          int i1 = 16;
          int i2 = 8;
          if (p1.length != i2 && (p1.length == i1 || p1.length == i)) {
             if (p2 != null) {
                Cipher instance = Cipher.getInstance("DESede/ECB/NoPadding");
                byte[] uobyteArray = new byte[i];
                if (p1.length == i2) {
                   System.arraycopy(p1, 0, uobyteArray, 0, i2);
                   System.arraycopy(p1, 0, uobyteArray, i2, i2);
                }else if(p1.length == i1){
                   System.arraycopy(p1, 0, uobyteArray, 0, i1);
                }else {
                   System.arraycopy(p1, 0, uobyteArray, 0, i);
                label_0033 :
                   i = 1;
                   if (p2.length % i2) {
                      int i3 = ((p2.length / i2) + i) * 8;
                      byte[] uobyteArray1 = new byte[i3];
                      System.arraycopy(p2, 0, uobyteArray1, 0, p2.length);
                      Arrays.fill(uobyteArray1, p2.length, i3, 0);
                      p2 = uobyteArray1;
                   }
                   if (!p0) {
                      i = 2;
                   }
                   instance.init(i, new SecretKeySpec(uobyteArray, "DESede"));
                   return instance.doFinal(p2);
                }
                System.arraycopy(p1, 0, uobyteArray, i1, i2);
                goto label_0033 ;
             }else {
                throw new IllegalArgumentException();
             }
          }
       }
       throw new IllegalArgumentException();
    }
    public static byte[] a(byte[] p0,byte[] p1){
       return d.a(1, p0, p1);
    }
    public static byte[] b(byte[] p0,byte[] p1){
       return d.a(0, p0, p1);
    }
}
