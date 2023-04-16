package com.meizu.cloud.pushsdk.a.a.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Integer;
import java.security.PublicKey;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.lang.StringBuilder;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.KeySpec;
import java.security.spec.InvalidKeySpecException;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import org.json.JSONObject;
import java.lang.Exception;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class a	// class@00148e
{
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public PublicKey h;
    public final SharedPreferences i;
    public final SharedPreferences j;
    public long k;
    public static a a;
    public static final Object b;

    static {
       a.b = new Object();
    }
    public void a(Context p0){
       PublicKey publicKey1;
       super();
       this.k = 0;
       SharedPreferences sharedPrefer = o.c(p0, "com.x.y.1", 0);
       this.i = sharedPrefer;
       this.j = o.c(p0, "com.x.y.2", 0);
       Integer.parseInt(sharedPrefer.getString("keyTimeout", "0"));
       sharedPrefer.getLong("createDate", 0);
       this.e();
       a tc = this.c;
       if (tc == null || !tc.length) {
          PublicKey publicKey = this.b(p0);
          this.h = publicKey;
          if (publicKey != null) {
             this.f();
          }else {
             SharedPreferences$Editor uEditor = sharedPrefer.edit().clear();
             try{
                g.a(uEditor);
                this.d();
                publicKey1 = this.b(p0);
                this.h = publicKey1;
                if (publicKey1 != null) {
                   this.f();
                }
             }catch(java.io.IOException e6){
                e6.printStackTrace();
             }
          }
       }else {
          tc = this.d;
          if (tc == null || !tc.length) {
             publicKey1 = this.b(p0);
             this.h = publicKey1;
             if (publicKey1 != null) {
                this.h();
             }
          }
       }
    }
    public static a a(){
       a a = a.a;
       if (a != null) {
          return a;
       }
       throw new IllegalStateException("KeyMgr is not initialised - invoke at least once with parameterised init/get");
    }
    public static void a(Context p0){
       if (a.a == null) {
          Object b = a.b;
          _monitor_enter(b);
          if (a.a == null) {
             a.a = new a(p0);
          }
          _monitor_exit(b);
       }
       return;
    }
    public final String a(InputStream p0){
       String str;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       try{
          int i = p0.read();
          while (i != -1) {
             uByteArrayOu.write(i);
          }
          str = uByteArrayOu.toString();
          try{
             uByteArrayOu.close();
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
          try{
             e0.close();
             str = null;
          }catch(java.io.IOException e0){
          }
       }
       return str;
    }
    public void a(String p0){
       this.g = p0.getBytes();
       SharedPreferences$Editor uEditor = this.i.edit();
       uEditor.putString("sKey64", new String(this.g));
       g.a(uEditor);
    }
    public byte[] a(byte[] p0){
       String str;
       a tc = this.c;
       if (tc == null || !tc.length) {
          str = "rKey null!";
       }else if(p0 == null || !p0.length){
          str = "input null!";
       }else {
          int i = 2;
          this.b(">>>>>>>>>> encrypt input >>>>>>>>>>\n"+new String(Base64.encode(p0, i)));
          String str1 = "<<<<<<<<<< encrypt input <<<<<<<<<<";
          try{
             this.b(str1);
             Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
             instance.init(1, new SecretKeySpec(this.c, "AES"), new IvParameterSpec(this.c));
             p0 = instance.doFinal(p0);
             this.b(">>>>>>>>>> encrypt output >>>>>>>>>>\n"+new String(Base64.encode(p0, i)));
             this.b("<<<<<<<<<< encrypt output <<<<<<<<<<");
             return p0;
          }catch(java.security.NoSuchAlgorithmException e8){
             e8.printStackTrace();
          }catch(javax.crypto.NoSuchPaddingException e8){
             e8.printStackTrace();
          }catch(java.security.InvalidKeyException e8){
             e8.printStackTrace();
          }catch(javax.crypto.BadPaddingException e8){
             e8.printStackTrace();
          }catch(javax.crypto.IllegalBlockSizeException e8){
             e8.printStackTrace();
          }catch(java.security.InvalidAlgorithmParameterException e8){
             e8.printStackTrace();
          }
          return v1;
       }
       this.c(str);
       return null;
    }
    public final PublicKey b(Context p0){
       this.b("load publicKey from preference");
       String str = this.j.getString("publicKey", "");
       if (!TextUtils.isEmpty(str)) {
          int i = 2;
          try{
             return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, i)));
          }catch(java.security.NoSuchAlgorithmException e3){
             e3.printStackTrace();
          }catch(java.security.spec.InvalidKeySpecException e3){
             e3.printStackTrace();
          }
       }
    }
    public final void b(String p0){
       DebugLogger.d("HttpKeyMgr", p0);
    }
    public byte[] b(){
       return this.f;
    }
    public final void c(String p0){
       DebugLogger.e("HttpKeyMgr", p0);
    }
    public byte[] c(){
       return this.g;
    }
    public final void d(){
       try{
          HttpURLConnection httpURLConne = new URL("https://norma-external-collect.meizu.com/android/exchange/getpublickey.do").openConnection();
          httpURLConne.setDoInput(true);
          boolean b = false;
          try{
             httpURLConne.setUseCaches(b);
             httpURLConne.setRequestMethod("GET");
          }catch(java.net.ProtocolException e1){
             e1.printStackTrace();
          }
          httpURLConne.setRequestProperty("Charset", "UTF-8");
          this.b("code = "+httpURLConne.getResponseCode());
          InputStream inputStream = httpURLConne.getInputStream();
          if (inputStream != null) {
             String str = this.a(inputStream);
             this.b("body = "+str);
             if (!TextUtils.isEmpty(str)) {
                try{
                   JSONObject jSONObject = new JSONObject(str);
                   if (jSONObject.getInt("code") == 200) {
                      SharedPreferences$Editor uEditor = this.j.edit();
                      uEditor.putString("publicKey", jSONObject.getString("value"));
                      g.a(uEditor);
                   }
                }catch(java.lang.Exception e2){
                   this.c("downloadPublicKey message error "+e2.getMessage());
                }
             }
          }
       }catch(java.net.MalformedURLException e0){
          return;
       }
    }
    public final void e(){
       byte[] bytes;
       this.b("loadKeys");
       String str = "";
       String str1 = this.i.getString("sKey64", str);
       this.b("saved sKey64: "+str1);
       if (!TextUtils.isEmpty(str1)) {
          this.g = str1.getBytes();
       }
       str1 = this.i.getString("aKey64", str);
       this.b("saved aKey64: "+str1);
       if (!TextUtils.isEmpty(str1)) {
          bytes = str1.getBytes();
          this.f = bytes;
          this.d = Base64.decode(bytes, 2);
       }
       str1 = this.i.getString("rKey64", str);
       this.b("saved rKey64: "+str1);
       if (!TextUtils.isEmpty(str1)) {
          bytes = str1.getBytes();
          this.e = bytes;
          this.c = Base64.decode(bytes, 2);
          this.b("saved rKey: "+new String(this.c));
       }
       return;
    }
    public final void f(){
       this.g();
       this.h();
    }
    public final void g(){
       try{
          KeyGenerator instance = KeyGenerator.getInstance("AES");
          instance.init(128);
          byte[] encoded = instance.generateKey().getEncoded();
          this.c = encoded;
          this.e = Base64.encode(encoded, 2);
          this.b("***** rKey64: "+new String(this.e));
          SharedPreferences$Editor uEditor = this.i.edit();
          uEditor.putString("rKey64", new String(this.e));
          g.a(uEditor);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public final void h(){
       try{
          Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
          instance.init(1, this.h);
          byte[] uobyteArray = instance.doFinal(this.c);
          this.d = uobyteArray;
          this.f = Base64.encode(uobyteArray, 2);
          this.b("***** aKey64: "+new String(this.f));
          SharedPreferences$Editor uEditor = this.i.edit();
          uEditor.putString("aKey64", new String(this.f));
          g.a(uEditor);
       }catch(java.security.NoSuchAlgorithmException e0){
          e0.printStackTrace();
       }catch(javax.crypto.NoSuchPaddingException e0){
          e0.printStackTrace();
       }catch(javax.crypto.BadPaddingException e0){
          e0.printStackTrace();
       }catch(javax.crypto.IllegalBlockSizeException e0){
          e0.printStackTrace();
       }catch(java.security.InvalidKeyException e0){
          e0.printStackTrace();
       }
       return;
    }
}
