package com.cmic.sso.sdk.e.i;
import java.lang.Object;
import java.lang.Exception;
import java.lang.String;
import com.cmic.sso.sdk.e.c;
import javax.crypto.Cipher;
import java.security.Key;
import com.cmic.sso.sdk.e.r;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.KeySpec;
import java.security.PublicKey;
import java.lang.NullPointerException;

public class i	// class@000f62
{
    public PublicKey b;
    public PublicKey c;
    public static final String a = "i";
    public static i d;

    public void i(){
       super();
       PublicKey publicKey = null;
       this.b = publicKey;
       try{
          this.c = publicKey;
          this.b();
          if (this.c == null) {
             this.c();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public static i a(){
       if (i.d == null) {
          i.d = new i();
       }
       return i.d;
    }
    public String a(byte[] p0){
       if (this.b == null) {
          c.a(i.a, "mServerPublicKey == null");
          return "";
       }else {
          try{
             Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
             instance.init(1, this.b);
             return r.a(instance.doFinal(p0));
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             return v1;
          }
       }
    }
    public String b(byte[] p0){
       if (this.b == null) {
          c.a(i.a, "mServerPublicKey == null");
          return null;
       }else {
          try{
             Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
             instance.init(1, this.c);
             p0 = instance.doFinal(p0);
             return Base64.encodeToString(p0, 0);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
             return "";
          }
       }
    }
    public final void b(){
       try{
          this.b = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC/YHP9utFGOhGk7Xf5L7jOgQz5\nv2JKxdrIE3yzYsHoZJwzKC7Ttx380UZmBFzr5I1k6FFMn/YGXd4ts6UHT/nzsCIc\ngZlTTem7Pjdm1V9bJgQ6iQvFHsvT+vNgJ3wAIRd+iCMXm8y96yZhD2+SH5odBYS2\nZzwTYXBQDvB/rTfdjwIDAQAB", 0)));
       }catch(java.lang.NullPointerException e0){
          e0.printStackTrace();
       }
       return;
    }
    public final void c(){
       try{
          this.c = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA6YCzxZS0FaWDOdtwgcHJ\n4aw0AoExz4atTkUlZJIf9eNLj7ogTlQGANNzE2R/uskFse2GsCqJKFTk4UraBkzf\naQu/yuFwKjURi0gEqyna1wQ3Anh3e6J/Pvhrp7vJyyRF3gZQCHElna1CWEN1zyT9\n+APJWeeIsUEJHi0FSf3EmwAtNgcJwLYed8Lrem+2+qvFY8RRjH3w4jT/wl2HKGEY\nYal33Q/OxoAE80SAD+DuXjpeynY1slzFV/Pi2qYmsnuBsnlDPQgJzxQKfCHl8xLf\nsjV57o+phSlqM0B5aPiMScxWJmCzFRX4NKcjt6KGP+3GpzmTyrpavnYQtHasperH\nmQIDAQAB\n", 0)));
          return;
       }catch(java.lang.NullPointerException e0){
          throw new Exception("公钥输入流为空");
       }
    }
}
