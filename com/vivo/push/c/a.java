package com.vivo.push.c.a;
import com.vivo.push.c.c;
import java.lang.Object;
import javax.crypto.SecretKey;
import java.lang.String;
import java.security.KeyStore;
import java.security.KeyStore$LoadStoreParameter;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import javax.crypto.KeyGenerator;
import android.os.Build$VERSION;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyStore$ProtectionParameter;
import java.security.KeyStore$Entry;
import java.security.KeyStore$SecretKeyEntry;

public final class a implements c	// class@00104b
{
    public KeyStore a;
    public SecretKey b;

    public void a(){
       super();
       this.a();
       this.b();
    }
    public final void a(){
       try{
          KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
          this.a = instance;
          instance.load(null);
          return;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p.a("AesSecurity", "initKeyStore error"+e0.getMessage());
          return;
       }
    }
    public final SecretKey b(){
       try{
          a tb = this.b;
          if (tb != null) {
             return tb;
          }
          if (!this.c()) {
             KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
             if (Build$VERSION.SDK_INT >= 23) {
                String[] stringArray = new String[]{"GCM"};
                stringArray = new String[]{"NoPadding"};
                instance.init(new KeyGenParameterSpec$Builder("AesKeyAlias", 3).setBlockModes(stringArray).setEncryptionPaddings(stringArray).setKeySize(256).build());
             }
             this.b = instance.generateKey();
          }else {
             this.b = this.d();
          }
          return this.b;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p.a("AesSecurity", "getSecretKey error"+e0.getMessage());
          return null;
       }
    }
    public final boolean c(){
       try{
          if (this.a == null) {
             this.a();
          }
          return this.a.containsAlias("AesKeyAlias");
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p.a("AesSecurity", "hasAESKey error"+e0.getMessage());
          return false;
       }
    }
    public final SecretKey d(){
       KeyStore$ProtectionParameter protectionPa = null;
       try{
          return this.a.getEntry("AesKeyAlias", protectionPa).getSecretKey();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          p.a("AesSecurity", "getAESSecretKey error"+e1.getMessage());
          return protectionPa;
       }
    }
}
