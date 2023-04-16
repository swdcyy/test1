package com.kwai.framework.accountsecurity.d;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.lang.Object;
import com.kwai.framework.accountsecurity.d$a;
import java.util.concurrent.Future;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.accountsecurity.b;
import java.util.concurrent.Callable;
import brd.t;
import com.kwai.framework.accountsecurity.c;
import t45.d;
import brd.z;
import com.kwai.framework.accountsecurity.a;
import erd.g;
import java.lang.Number;
import e66.a;
import android.content.SharedPreferences;
import java.security.KeyPair;
import java.security.KeyStore$ProtectionParameter;
import java.security.KeyStore$Entry;
import java.security.KeyStore;
import java.security.KeyStore$PrivateKeyEntry;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.PublicKey;
import s00.b$a;
import s00.b;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.KeyPairGenerator;
import java.util.Calendar;
import java.util.Date;
import android.security.KeyPairGeneratorSpec$Builder;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import android.security.KeyPairGeneratorSpec;
import java.security.spec.AlgorithmParameterSpec;
import android.os.SystemClock;
import e66.c;
import java.lang.Long;
import q87.c;
import java.security.SecureRandom;
import s00.b$b;
import java.security.KeyStore$LoadStoreParameter;
import java.lang.Boolean;
import java.lang.Integer;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.security.Signature;
import k2b.u1;
import java.lang.Throwable;
import zb6.a;
import com.yxcorp.utility.TextUtils;

public class d	// class@0014d0
{
    public static KeyStore a;
    public static boolean b;
    public static ExecutorService c;

    static {
       d.b = true;
       d.c = c.f("account-security-helper");
       d.g();
    }
    public void d(){
       super();
    }
    public static Future a(d$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.c.submit(new b(p0));
    }
    public static t b(){
       Object obj = PatchProxy.apply(null, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(c.b).retry(1).subscribeOn(d.c).doOnError(a.b).observeOn(d.a);
    }
    public static int c(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.a.getInt("AccountSecurity", 0);
    }
    public static KeyPair d(){
       String str = "ks_account_protect_private";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       KeyStore obj = PatchProxy.apply(null, null, uod, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (d.b) {
          obj = d.a;
          if (obj != null) {
             return new KeyPair(d.a.getCertificate(str).getPublicKey(), obj.getEntry(str, null).getPrivateKey());
          }
       }
       str = a.c();
       String str1 = a.d();
       PublicKey publicKey = PatchProxy.applyOneRefs(str1, null, uod, "9");
       if (publicKey != patchProxyRe) {
       }else {
          publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(b.a().a(str1)));
       }
       PrivateKey privateKey = PatchProxy.applyOneRefs(str, null, uod, "10");
       if (privateKey != patchProxyRe) {
       }else {
          privateKey = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(b.a().a(str)));
       }
       return new KeyPair(publicKey, privateKey);
    }
    public static KeyPair e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       Date obj = PatchProxy.apply(objArray, objArray, uod, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!d.b) {
          return d.f();
       }
       KeyPair keyPair = PatchProxy.apply(objArray, objArray, uod, "12");
       if (keyPair != patchProxyRe) {
       }else {
          KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
          Calendar instance1 = Calendar.getInstance();
          obj = instance1.getTime();
          instance1.add(1, 10);
          instance.initialize(new KeyPairGeneratorSpec$Builder(ActivityContext.g().e()).setAlias("ks_account_protect_private").setStartDate(obj).setEndDate(instance1.getTime()).setSerialNumber(BigInteger.valueOf(1)).setSubject(new X500Principal("CN=Kwai")).build());
          keyPair = instance.generateKeyPair();
          Object[] objArray1 = new Object[]{"cost",Long.valueOf((SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()))};
          c.C().s("ks://keygen", "genKeyPair", objArray1);
       }
       return keyPair;
    }
    public static KeyPair f(){
       PrivateKey obj = PatchProxy.apply(null, null, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
       instance.initialize(2048, new SecureRandom((new Date().toString()).getBytes()));
       KeyPair keyPair = instance.genKeyPair();
       PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(keyPair.getPublic().getEncoded()));
       obj = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(keyPair.getPrivate().getEncoded()));
       a.j(b.b().a(obj.getEncoded()));
       a.k(b.b().a(publicKey.getEncoded()));
       return new KeyPair(publicKey, obj);
    }
    public static void g(){
       if (PatchProxy.applyVoid(null, null, d.class, "13")) {
          return;
       }
       KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
       d.a = instance;
       instance.load(null);
       return;
    }
    public static boolean h(){
       KeyStore obj = PatchProxy.apply(null, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (d.b) {
          obj = d.a;
          if (obj != null) {
             return obj.containsAlias("ks_account_protect_private");
          }
       }
       if (!(a.c()).isEmpty() && !(a.d()).isEmpty()) {
          b = true;
       }
       return b;
    }
    public static void i(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uod, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("AccountSecurity", p0);
       g.a(uEditor);
       return;
    }
    public static String j(PrivateKey p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Signature instance = Signature.getInstance("SHA256withRSA");
       instance.initSign(p0);
       instance.update(p1.getBytes("utf-8"));
       u1.I0(41, 7, 11);
       return b.b().a(instance.sign());
    }
}
