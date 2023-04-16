package com.yxcorp.gifshow.util.x0;
import java.lang.String;
import fud.b;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.Key;

public class x0	// class@001fb8
{
    public static final byte[] a;

    static {
       x0.a = new byte[16]{0xed,'7',0xe1,'}',0xcf,0xd4,0x1c,0xf2,0xa1,'y',0x90,0x0a,'u',0x96,'v','}'};
    }
    public static String a(String p0){
       Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
       instance.init(2, new SecretKeySpec(x0.a, "AES"));
       byte[] uobyteArray = instance.doFinal(b.i(p0));
       return new String(uobyteArray, "UTF-8");
    }
}
