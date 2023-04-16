package com.yxcorp.gifshow.util.p;
import java.lang.String;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.Key;
import fud.d;

public class p	// class@001f96
{

    public static String a(byte[] p0,byte[] p1){
       SecretKeySpec secretKeySpe = new SecretKeySpec(p1, "HmacMD5");
       Mac instance = Mac.getInstance(secretKeySpe.getAlgorithm());
       instance.init(secretKeySpe);
       return d.d(instance.doFinal(p0));
    }
}
