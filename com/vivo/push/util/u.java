package com.vivo.push.util.u;
import java.security.Key;
import java.lang.String;
import android.util.Base64;
import java.security.PublicKey;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.KeySpec;
import java.lang.Exception;
import java.security.Signature;

public final class u	// class@0010c3
{
    public static String a = "RSA";

    public static String a(Key p0){
       return Base64.encodeToString(p0.getEncoded(), 2);
    }
    public static PublicKey a(String p0){
       int i = 2;
       try{
          return KeyFactory.getInstance(u.a).generatePublic(new X509EncodedKeySpec(Base64.decode(p0, i)));
       }catch(java.security.NoSuchAlgorithmException e0){
          throw new Exception("无此算法");
       }catch(java.security.spec.InvalidKeySpecException e0){
          throw new Exception("公钥非法");
       }catch(java.lang.NullPointerException e0){
          throw new Exception("公钥数据为空");
       }
    }
    public static boolean a(byte[] p0,PublicKey p1,byte[] p2){
       Signature instance = Signature.getInstance("MD5withRSA");
       instance.initVerify(p1);
       instance.update(p0);
       return instance.verify(p2);
    }
}
