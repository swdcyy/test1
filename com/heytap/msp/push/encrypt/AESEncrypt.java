package com.heytap.msp.push.encrypt.AESEncrypt;
import java.lang.Object;
import java.lang.String;
import com.heytap.msp.push.encrypt.a;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.lang.Exception;
import com.heytap.mcssdk.utils.d;
import java.lang.StringBuilder;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESEncrypt	// class@000550
{

    public void AESEncrypt(){
       super();
    }
    public static String decrypt(String p0,String p1){
       String[] stringArray = p1.split("%IV1%");
       Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
       instance.init(2, new SecretKeySpec(a.b(p0), "AES"), new IvParameterSpec(a.b(stringArray[1])));
       return new String(instance.doFinal(a.b(stringArray[0])));
    }
    public static String encrypt(String p0){
       try{
          return AESEncrypt.encrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", p0);
       }catch(java.lang.Exception e1){
          d.b(e1.getLocalizedMessage());
          return "";
       }
    }
    public static String encrypt(String p0,String p1){
       Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
       instance.init(1, new SecretKeySpec(a.b(p0), "AES"));
       return a.d(instance.doFinal(p1.getBytes()))+"%IV1%"+a.d(instance.getIV());
    }
    public static String genKey(){
       KeyGenerator instance = KeyGenerator.getInstance("AES");
       instance.init(256);
       return a.d(instance.generateKey().getEncoded());
    }
}
