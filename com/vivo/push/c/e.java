package com.vivo.push.c.e;
import com.vivo.push.c.b;
import android.content.Context;
import java.lang.Object;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.String;
import com.vivo.push.util.p;
import java.util.Calendar;
import android.security.KeyPairGeneratorSpec$Builder;
import javax.security.auth.x500.X500Principal;
import java.math.BigInteger;
import java.util.Date;
import android.security.KeyPairGeneratorSpec;
import java.security.KeyPairGenerator;
import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.KeyStore$ProtectionParameter;
import java.security.KeyStore$Entry;
import java.security.KeyStore;
import java.security.KeyStore$PrivateKeyEntry;
import java.security.KeyStore$LoadStoreParameter;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.security.Signature;
import android.util.Base64;
import java.security.PublicKey;
import java.security.cert.Certificate;

public final class e implements b	// class@00104f
{
    public Context e;
    public static PrivateKey a;
    public static PublicKey b;
    public static KeyStore c;
    public static X500Principal d;

    public void e(Context p0){
       super();
       try{
          this.e = p0;
          e.b();
          e.a(p0);
          return;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          p.a("RsaSecurity", "init error"+e3.getMessage());
          return;
       }
    }
    public static void a(Context p0){
       try{
          String str = "PushRsaKeyAlias";
          if (p0 == null) {
             p.d("RsaSecurity", " generateRSAKeyPairSign context == null ");
             return;
          }else if(!e.b(str)){
             Calendar instance = Calendar.getInstance();
             instance.add(1, 999);
             KeyPairGenerator instance1 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
             instance1.initialize(new KeyPairGeneratorSpec$Builder(p0.getApplicationContext()).setAlias(str).setSubject(e.d).setSerialNumber(BigInteger.valueOf(1337)).setStartDate(Calendar.getInstance().getTime()).setEndDate(instance.getTime()).build());
             instance1.generateKeyPair();
             return;
          }else {
             p.d("RsaSecurity", " generateRSAKeyPairSign this keyAlias PushRsaKeyAlias is Created ");
             return;
          }
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
          p.a(v1, "generateRSAKeyPairSign error"+e6.getMessage());
          return;
       }
    }
    public static PrivateKey b(Context p0){
       String str = "PushRsaKeyAlias";
       PrivateKey privateKey = null;
       try{
          PrivateKey a = e.a;
          if (a != null) {
             return a;
          }else if(p0 == null){
             p.d("RsaSecurity", " getPrivateKeySigin context == null ");
             return privateKey;
          }else if(!e.b(str)){
             e.a(p0);
          }
          KeyStore$Entry entry = e.c.getEntry(str, privateKey);
          if (entry instanceof KeyStore$PrivateKeyEntry) {
             PrivateKey privateKey1 = entry.getPrivateKey();
             e.a = privateKey1;
             return privateKey1;
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          p.a("RsaSecurity", "getPrivateKeySigin error"+e4.getMessage());
       }
          return privateKey;
    }
    public static void b(){
       try{
          KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
          e.c = instance;
          instance.load(null);
          e.d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
          return;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p.a("RsaSecurity", "initKeyStore error"+e0.getMessage());
          return;
       }
    }
    public static boolean b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       try{
          if (e.c == null) {
             e.b();
          }
          return e.c.containsAlias(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          p.a("RsaSecurity", "getPrivateKeySigin error"+e3.getMessage());
          return false;
       }
    }
    public final String a(String p0){
       String str = "RsaSecurity";
       try{
          if (!TextUtils.isEmpty(p0) && e.b(this.e) != null) {
             Signature instance = Signature.getInstance("SHA256withRSA");
             instance.initSign(e.b(this.e));
             instance.update(p0.getBytes("UTF-8"));
             String str1 = Base64.encodeToString(instance.sign(), 2);
             p.d(str, p0.hashCode()+" = "+str1);
             return str1;
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          p.a(str, "signClientSDK error"+e5.getMessage());
       }
       return null;
    }
    public final PublicKey a(){
       String str = "PushRsaKeyAlias";
       KeyStore$ProtectionParameter protectionPa = null;
       try{
          PublicKey b = e.b;
          if (b != null) {
             return b;
          }else if(!e.b(str)){
             e.a(this.e);
          }
          KeyStore$Entry entry = e.c.getEntry(str, protectionPa);
          if (entry instanceof KeyStore$PrivateKeyEntry) {
             PublicKey publicKey = entry.getCertificate().getPublicKey();
             e.b = publicKey;
             return publicKey;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p.a("RsaSecurity", "getPublicKeySign error"+e0.getMessage());
       }
          return protectionPa;
    }
    public final boolean a(byte[] p0,PublicKey p1,byte[] p2){
       try{
          Signature instance = Signature.getInstance("SHA256withRSA");
          instance.initVerify(p1);
          instance.update(p0);
          return instance.verify(p2);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          p.a("RsaSecurity", "verifyClientSDK error"+e2.getMessage());
          return false;
       }
    }
}
