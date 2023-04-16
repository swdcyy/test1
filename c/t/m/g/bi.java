package c.t.m.g.bi;
import java.lang.String;
import c.t.m.g.bb;
import java.lang.Throwable;
import c.t.m.g.bt;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import c.t.m.g.bl;
import c.t.m.g.by;
import java.lang.Object;
import java.lang.System;
import c.t.m.g.ba;
import java.lang.IllegalArgumentException;

public class bi	// class@000be6
{

    public static String a(String p0){
       return bb.a(bi.a(p0.getBytes("UTF-8")));
    }
    public static Cipher a(byte[] p0,byte[] p1,int p2){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(p2, new SecretKeySpec(p0, "AES"), new IvParameterSpec(p1));
       return instance;
    }
    public static byte[] a(byte[] p0){
       return bi.a(p0, 0, p0.length);
    }
    public static byte[] a(byte[] p0,int p1,int p2){
       byte[] uobyteArray = bl.a(16);
       p0 = bi.a(p0, p1, p2, uobyteArray, uobyteArray, 1);
       if (by.a(p0)) {
          return p0;
       }
       byte[] uobyteArray1 = new byte[(uobyteArray.length + p0.length)];
       System.arraycopy(uobyteArray, 0, uobyteArray1, 0, uobyteArray.length);
       System.arraycopy(p0, 0, uobyteArray1, uobyteArray.length, p0.length);
       return uobyteArray1;
    }
    public static byte[] a(byte[] p0,int p1,int p2,byte[] p3,byte[] p4,int p5){
       if (p5 != 1 && p5 != 2) {
          throw new IllegalArgumentException("wrong mode.");
       }
       if (p0 != null && (p0.length && (p1 < 0 || p2 <= 0))) {
          return ba.a;
       }
       Cipher uCipher = bi.a(p3, p4, p5);
       if (uCipher == null) {
          return ba.a;
       }
       return uCipher.doFinal(p0, p1, p2);
    }
    public static String b(String p0){
       return new String(bi.b(bb.a(p0)), "UTF-8");
    }
    public static byte[] b(byte[] p0){
       return bi.b(p0, 0, p0.length);
    }
    public static byte[] b(byte[] p0,int p1,int p2){
       byte[] uobyteArray = new byte[16];
       System.arraycopy(p0, 0, uobyteArray, 0, 16);
       return bi.a(p0, (p1 + 16), (p2 - 16), uobyteArray, uobyteArray, 2);
    }
}
