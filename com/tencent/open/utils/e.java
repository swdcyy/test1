package com.tencent.open.utils.e;
import java.lang.String;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import android.util.Base64;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import java.security.MessageDigest;

public class e	// class@000f7a
{
    public static final char[] a;

    static {
       e.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    }
    public static String a(String p0,String p1,byte[] p2){
       try{
          Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
          instance.init(1, new SecretKeySpec(p1.getBytes(), "AES"), new IvParameterSpec(p2));
          byte[] uobyteArray = instance.doFinal(p0.getBytes());
          return Base64.encodeToString(uobyteArray, 0);
       }catch(java.lang.Exception e2){
          SLog.e("DESUtils", "encryptAES", e2);
          return null;
       }
    }
    public static String a(byte[] p0){
       if (p0 == null || !p0.length) {
          return "";
       }
       char[] uocharArray = new char[(p0.length * 2)];
       for (int i = 0; i < p0.length; i = i + 1) {
          int b = p0[i];
          int i1 = i * 2;
          int i2 = i1 + 1;
          char[] a = e.a;
          int i3 = b & 0x0f;
          uocharArray[i2] = a[i3];
          b = b >> 4;
          b = (byte)b & 0x0f;
          uocharArray[i1] = a[b];
       }
       return new String(uocharArray);
    }
    public static byte[] a(String p0){
       try{
          MessageDigest instance = MessageDigest.getInstance("SHA-256");
          instance.update(p0.getBytes());
          return instance.digest();
       }catch(java.lang.Exception e2){
          SLog.e("DESUtils", "encryptSha", e2);
          return null;
       }
    }
}
