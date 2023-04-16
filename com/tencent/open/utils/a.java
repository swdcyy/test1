package com.tencent.open.utils.a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import java.security.KeyStore;
import java.security.KeyStore$LoadStoreParameter;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import android.util.Base64;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.PublicKey;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import java.security.KeyPairGenerator;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPair;
import java.util.Calendar;
import android.security.KeyPairGeneratorSpec$Builder;
import javax.security.auth.x500.X500Principal;
import java.math.BigInteger;
import java.util.Date;
import android.security.KeyPairGeneratorSpec;
import java.security.PrivateKey;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a	// class@000f72
{
    public KeyStore a;
    public SharedPreferences b;

    public void a(Context p0){
       try{
          super();
          this.b = o.c(p0, "KEYSTORE_SETTING", 0);
          KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
          this.a = instance;
          instance.load(null);
          if (!this.a.containsAlias("KEYSTORE_AES")) {
             this.c("");
             this.a(p0);
             this.a();
          }
       }catch(java.lang.Exception e3){
          SLog.d("KEYSTORE", "Exception", e3);
       }
       return;
    }
    public String a(String p0){
       try{
          Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
          instance.init(1, this.c(), new IvParameterSpec(this.b()));
          byte[] uobyteArray = instance.doFinal(p0.getBytes());
          return Base64.encodeToString(uobyteArray, 0);
       }catch(java.lang.Exception e6){
          SLog.e("KEYSTORE", "Exception", e6);
          return "";
       }
    }
    public final void a(){
       byte[] uobyteArray = new byte[16];
       SecureRandom secureRandom = new SecureRandom();
       secureRandom.nextBytes(uobyteArray);
       this.c(Base64.encodeToString(secureRandom.generateSeed(12), 0));
       Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
       instance.init(1, this.a.getCertificate("KEYSTORE_AES").getPublicKey());
       this.d(Base64.encodeToString(instance.doFinal(uobyteArray), 0));
    }
    public final void a(Context p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       SLog.d("KEYSTORE", "Build.VERSION.SDK_INT="+sDK_INT);
       String str = "KEYSTORE_AES";
       String str1 = "AndroidKeyStore";
       String str2 = "RSA";
       if (sDK_INT >= 23) {
          KeyPairGenerator instance = KeyPairGenerator.getInstance(str2, str1);
          String[] stringArray = new String[]{"SHA-256","SHA-512"};
          String[] stringArray1 = new String[]{"PKCS1Padding"};
          instance.initialize(new KeyGenParameterSpec$Builder(str, 3).setDigests(stringArray).setEncryptionPaddings(stringArray1).build());
          instance.generateKeyPair();
       }else {
          KeyPairGenerator instance1 = KeyPairGenerator.getInstance(str2, str1);
          Calendar instance2 = Calendar.getInstance();
          instance2.add(1, 30);
          instance1.initialize(new KeyPairGeneratorSpec$Builder(p0).setAlias(str).setSubject(new X500Principal("CN=KEYSTORE_AES")).setSerialNumber(BigInteger.TEN).setStartDate(Calendar.getInstance().getTime()).setEndDate(instance2.getTime()).build());
          instance1.generateKeyPair();
       }
       return;
    }
    public String b(String p0){
       try{
          Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
          instance.init(2, this.c(), new IvParameterSpec(this.b()));
          return new String(instance.doFinal(Base64.decode(p0.getBytes(), 0)));
       }catch(java.lang.Exception e6){
          SLog.e("KEYSTORE", "Exception", e6);
          return "";
       }
    }
    public final byte[] b(){
       return Base64.decode(this.b.getString("PREF_KEY_IV", ""), 0);
    }
    public final SecretKeySpec c(){
       Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
       instance.init(2, this.a.getKey("KEYSTORE_AES", null));
       byte[] uobyteArray = instance.doFinal(Base64.decode(this.b.getString("PREF_KEY_AES", ""), 0));
       return new SecretKeySpec(uobyteArray, "AES/GCM/NoPadding");
    }
    public final void c(String p0){
       g.a(this.b.edit().putString("PREF_KEY_IV", p0));
    }
    public final void d(String p0){
       g.a(this.b.edit().putString("PREF_KEY_AES", p0));
    }
}
