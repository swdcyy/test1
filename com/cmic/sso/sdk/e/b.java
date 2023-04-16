package com.cmic.sso.sdk.e.b;
import android.content.Context;
import java.lang.String;
import com.cmic.sso.sdk.e.a;
import com.cmic.sso.sdk.e.k$a;
import com.cmic.sso.sdk.e.k;
import android.os.Build$VERSION;
import javax.crypto.KeyGenerator;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import java.lang.Thread;
import javax.crypto.SecretKey;
import java.lang.Exception;
import com.cmic.sso.sdk.e.c;
import java.util.Calendar;
import android.security.KeyPairGeneratorSpec$Builder;
import javax.security.auth.x500.X500Principal;
import java.math.BigInteger;
import java.util.Date;
import android.security.KeyPairGeneratorSpec;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStore$LoadStoreParameter;
import java.security.Key;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.PublicKey;
import android.util.Base64;
import java.lang.StringBuilder;

public class b	// class@000f5a
{

    public static String a(Context p0,String p1){
       byte[] uobyteArray = b.b(p0);
       if (uobyteArray != null) {
          return a.a(uobyteArray, p1);
       }
       return null;
    }
    public static void a(){
       k$a uoa = k.a();
       uoa.a("AES_KEY");
       uoa.b();
    }
    public static void a(String p0){
       k.a("AES_KEY", p0);
    }
    public static boolean a(Context p0){
       String str = "CMCC_SDK_V1";
       String str1 = "AndroidKeyStore";
       if (Build$VERSION.SDK_INT >= 23) {
          try{
             KeyGenerator instance = KeyGenerator.getInstance("AES", str1);
             String[] stringArray = new String[]{"SHA-256","SHA-512"};
             stringArray = new String[]{"CBC"};
             stringArray = new String[]{"PKCS7Padding"};
             instance.init(new KeyGenParameterSpec$Builder(str, 3).setDigests(stringArray).setBlockModes(stringArray).setEncryptionPaddings(stringArray).setRandomizedEncryptionRequired(false).setKeySize(256).build());
             Thread.sleep(1000);
             instance.generateKey();
             return true;
          }catch(java.lang.Exception e10){
             c.a(v4, e10.getMessage());
             return v6;
          }
       }else {
          Calendar instance1 = Calendar.getInstance();
          Calendar instance2 = Calendar.getInstance();
          int i = 30;
          try{
             instance2.add(true, i);
             KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", str1);
             instance3.initialize(new KeyPairGeneratorSpec$Builder(p0).setAlias(str).setSubject(new X500Principal("CN=CMCC_SDK_V1")).setSerialNumber(BigInteger.TEN).setStartDate(instance1.getTime()).setEndDate(instance2.getTime()).build());
             Thread.sleep(1000);
             instance3.generateKeyPair();
             return true;
          }catch(java.lang.Exception e10){
             c.a(v4, e10.getMessage());
             return v6;
          }
       }
    }
    public static boolean a(Context p0,boolean p1){
       try{
          KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
          instance.load(null);
          if (instance.getKey("CMCC_SDK_V1", null) != null) {
             return true;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       if (p1) {
          return b.a(p0);
       }else {
          return false;
       }
    }
    public static String b(Context p0,String p1){
       if (!TextUtils.isEmpty(p1)) {
          byte[] uobyteArray = b.b(p0);
          if (uobyteArray != null) {
             return a.b(uobyteArray, p1);
          }
       }
       return null;
    }
    public static byte[] b(){
       byte[] uobyteArray = new byte[16];
       new SecureRandom().nextBytes(uobyteArray);
       return uobyteArray;
    }
    public static synchronized byte[] b(Context p0){
       byte[] uobyteArray;
       Cipher instance1;
       Cipher instance2;
       _monitor_enter(b.class);
       KeyStore$LoadStoreParameter loadStorePar = null;
       try{
          KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
          instance.load(loadStorePar);
          int i = 1;
          if (TextUtils.isEmpty(b.c())) {
             if (!b.a(p0, false)) {
                _monitor_exit(b.class);
                return loadStorePar;
             }else {
                uobyteArray = b.b();
                Key key = instance.getKey("CMCC_SDK_V1", loadStorePar);
                if (key instanceof SecretKey) {
                   c.b("KeystoreUtil", "生成aes密");
                   instance1 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                   byte[] uobyteArray1 = new byte[instance1.getBlockSize()];
                   instance1.init(i, key, new IvParameterSpec(uobyteArray1));
                }else if(key instanceof PrivateKey){
                   instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                   c.b("KeystoreUtil", "生成rsa密");
                   instance2.init(i, instance.getCertificate("CMCC_SDK_V1").getPublicKey());
                   instance1 = instance2;
                }else {
                   _monitor_exit(b.class);
                   return loadStorePar;
                }
                c.b("KeystoreUtil", "第一次用生成密钥");
                b.a(Base64.encodeToString(instance1.doFinal(uobyteArray), false));
             }
          }else {
             String str = b.c();
             if (!TextUtils.isEmpty(str)) {
                uobyteArray = Base64.decode(str, false);
                Key key1 = instance.getKey("CMCC_SDK_V1", loadStorePar);
                if (key1 == null) {
                   _monitor_exit(b.class);
                   return loadStorePar;
                }else {
                   int i1 = 2;
                   if (key1 instanceof SecretKey) {
                      instance2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                      byte[] uobyteArray2 = new byte[instance2.getBlockSize()];
                      instance2.init(i1, key1, new IvParameterSpec(uobyteArray2));
                      c.b("KeystoreUtil", "解密使用aes");
                   }else if(key1 instanceof PrivateKey){
                      instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                      instance2.init(i1, key1);
                      c.b("KeystoreUtil", "解密使用rsa");
                   }else {
                      _monitor_exit(b.class);
                      return loadStorePar;
                   }
                   uobyteArray = instance2.doFinal(uobyteArray);
                   StringBuilder str1 = "是否解密出秘钥：";
                   if (TextUtils.isEmpty(Base64.encodeToString(uobyteArray, false))) {
                      i = false;
                   }
                   c.b("KeystoreUtil", str1+i);
                }
             }else {
             label_00f7 :
                _monitor_exit(b.class);
                return loadStorePar;
             }
          }
          loadStorePar = uobyteArray;
          goto label_00f7 ;
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
          _monitor_exit(b.class);
          return loadStorePar;
       }
    }
    public static String c(){
       return k.b("AES_KEY", "");
    }
}
