package com.loc.ae;
import java.lang.String;
import java.security.PublicKey;
import com.loc.aa;
import com.loc.x;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.KeySpec;
import java.lang.Exception;
import javax.crypto.Cipher;
import java.security.Key;

public final class ae	// class@001364
{

    public static PublicKey a(String p0){
       try{
          return KeyFactory.getInstance(x.c("EUlNB")).generatePublic(new X509EncodedKeySpec(aa.a(p0)));
       }catch(java.security.NoSuchAlgorithmException e0){
          throw new Exception("无此算法");
       }catch(java.security.spec.InvalidKeySpecException e0){
          throw new Exception("公钥非法");
       }catch(java.lang.NullPointerException e0){
          throw new Exception("公钥数据为空");
       }
    }
    public static byte[] a(byte[] p0,PublicKey p1){
       Cipher instance = Cipher.getInstance(x.c("CUlNBL0VDQi9QS0NTMVBhZGRpbmc"));
       instance.init(1, p1);
       return instance.doFinal(p0);
    }
}
