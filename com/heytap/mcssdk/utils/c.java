package com.heytap.mcssdk.utils.c;
import java.lang.Object;
import java.lang.String;
import javax.crypto.Cipher;
import java.security.Key;
import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;

public abstract class c	// class@000541
{

    public void c(){
       super();
    }
    public static String a(String p0,String p1){
       Cipher instance = Cipher.getInstance("DES");
       instance.init(2, c.a(p1));
       byte[] uobyteArray = instance.doFinal(Base64.decode(p0, 0));
       return (new String(uobyteArray, Charset.defaultCharset())).trim();
    }
    public static Key a(String p0){
       return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(Base64.decode(p0, 0)));
    }
}
