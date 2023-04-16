package aegon.chrome.net.X509Util;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.KeyStore;
import aegon.chrome.net.X509Util$c;
import java.lang.String;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import aegon.chrome.net.X509Util$d;
import java.lang.Class;
import java.lang.StringBuilder;
import a0.n;
import java.security.KeyStoreException;
import java.lang.Throwable;
import java.security.KeyStore$LoadStoreParameter;
import java.io.File;
import java.lang.System;
import java.util.HashSet;
import aegon.chrome.net.X509Util$TrustStorageListener;
import aegon.chrome.net.X509Util$a;
import android.content.IntentFilter;
import android.os.Build$VERSION;
import android.content.Context;
import a0.f;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.util.Pair;
import javax.security.auth.x500.X500Principal;
import java.security.PublicKey;
import java.util.Set;
import java.security.MessageDigest;
import a0.o;
import K.S;
import java.util.List;
import java.util.Iterator;
import aegon.chrome.net.AndroidCertVerifyResult;
import java.util.ArrayList;
import java.security.cert.CertificateException;
import java.lang.IllegalArgumentException;
import java.util.Arrays;

public class X509Util	// class@00008f
{
    public static CertificateFactory a;
    public static X509Util$c b;
    public static X509Util$TrustStorageListener c;
    public static X509Util$c d;
    public static KeyStore e;
    public static KeyStore f;
    public static File g;
    public static Set h;
    public static boolean i;
    public static final Object j;
    public static final char[] k;
    public static final boolean l;

    static {
       X509Util.j = new Object();
       X509Util.k = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    }
    public static X509Certificate a(byte[] p0){
       X509Util.c();
       return X509Util.a.generateCertificate(new ByteArrayInputStream(p0));
    }
    public static X509Util$c b(KeyStore p0){
       int i;
       object oobject;
       TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
       instance.init(p0);
       try{
          i = 0;
          TrustManager[] trustManager = instance.getTrustManagers();
          int len = trustManager.length;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                oobject = trustManager[i1];
                if (oobject instanceof X509TrustManager) {
                   break ;
                }
             }else {
                Object[] objArray2 = new Object[i];
                n.a("X509Util", "Could not find suitable trust manager", objArray2);
                return null;
             }
          }
          try{
             return new X509Util$d(oobject);
          }catch(java.lang.IllegalArgumentException e5){
             Object[] objArray1 = new Object[i];
             n.a(v0, "Error creating trust manager \("+oobject.getClass().getName()+"\): "+e5, objArray1);
          }
       }catch(java.lang.RuntimeException e1){
          Object[] objArray = new Object[1];
          objArray[i] = e1;
          n.a("X509Util", "TrustManagerFactory.getTrustManagers\(\) unexpectedly threw: %s", objArray);
          throw new KeyStoreException(e1);
       }
    }
    public static void c(){
       Object j = X509Util.j;
       _monitor_enter(j);
       X509Util.d();
       _monitor_exit(j);
    }
    public static void d(){
       IntentFilter intentFilter;
       if (X509Util.a == null) {
          X509Util.a = CertificateFactory.getInstance("X.509");
       }
       KeyStore keyStore = null;
       if (X509Util.b == null) {
          X509Util.b = X509Util.b(keyStore);
       }
       if (!X509Util.i) {
          try{
             KeyStore instance = KeyStore.getInstance("AndroidCAStore");
             try{
                X509Util.f = instance;
                instance.load(keyStore);
                X509Util.g = new File(System.getenv("ANDROID_ROOT")+"/etc/security/cacerts");
                X509Util.i = true;
             }catch(java.io.IOException e0){
             }
          }catch(java.security.KeyStoreException e0){
          }
       }
    }
    public static boolean e(X509Certificate p0){
       if (X509Util.f == null) {
          return false;
       }
       Pair pair = new Pair(p0.getSubjectX500Principal(), p0.getPublicKey());
       if (X509Util.h.contains(pair)) {
          return true;
       }
       byte[] uobyteArray = MessageDigest.getInstance("MD5").digest(p0.getSubjectX500Principal().getEncoded());
       char[] uocharArray = new char[8];
       for (int i = 0; i < 4; i = i + 1) {
          int i1 = i * 2;
          char[] k = X509Util.k;
          int i2 = i - 3;
          int i3 = uobyteArray[i2] >> 4;
          i3 = i3 & 0x0f;
          uocharArray[i1] = k[i3];
          i1 = i1 + true;
          i3 = uobyteArray[i2] & 0x0f;
          uocharArray[i1] = k[i3];
       }
       String str = new String(uocharArray);
       int i4 = 0;
       while (true) {
          String str1 = str+'.'+i4;
          if (!new File(X509Util.g, str1).exists()) {
             return false;
          }
          Certificate certificate = X509Util.f.getCertificate("system:"+str1);
          if (certificate != null) {
             if (!certificate instanceof X509Certificate) {
                Object[] objArray = new Object[false];
                n.a("X509Util", "Anchor "+str1+" not an X509Certificate: "+certificate.getClass().getName(), objArray);
             }else if(p0.getSubjectX500Principal().equals(certificate.getSubjectX500Principal()) && p0.getPublicKey().equals(certificate.getPublicKey())){
                break ;
             }
          }
          i4 = i4 + 1;
       }
       X509Util.h.add(pair);
       return true;
    }
    public static void f(){
       Object j = X509Util.j;
       _monitor_enter(j);
       X509Util.b = null;
       X509Util.h = null;
       X509Util.d();
       _monitor_exit(j);
       o.a(true);
       S.MGVAvp19();
    }
    public static void g(){
       X509Util.d = X509Util.b(X509Util.e);
    }
    public static boolean h(X509Certificate p0){
       boolean b = false;
       try{
          List extendedKeyU = p0.getExtendedKeyUsage();
          if (extendedKeyU == null) {
             return true;
          }
          Iterator iterator = extendedKeyU.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return e0;
             }
             String str = iterator.next();
             if (!str.equals("1.3.6.1.5.5.7.3.1") && (!str.equals("2.5.29.37.0") && (str.equals("2.16.840.1.113730.4.1") || str.equals("1.3.6.1.4.1.311.10.3.3")))) {
                break ;
             }
          }
          return true;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static AndroidCertVerifyResult i(byte[][] p0,String p1,String p2){
       List list;
       boolean b1;
       if (p0 != null && p0.length) {
          int i = 0;
          if (p0[i] != null) {
             int i1 = -1;
             try{
                X509Util.c();
                try{
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(X509Util.a(p0[i]));
                   int i2 = 1;
                   while (i2 < p0.length) {
                      try{
                         uArrayList.add(X509Util.a(p0[i2]));
                      }catch(java.security.cert.CertificateException e0){
                         Object[] objArray = new Object[e0];
                         n.h("X509Util", "intermediate "+i2+" failed parsing", objArray);
                      }
                      i2 = i2 + 1;
                   }
                   X509Certificate[] x509Certific = new X509Certificate[uArrayList.size()];
                   x509Certific = uArrayList.toArray(x509Certific);
                   try{
                      x509Certific[i].checkValidity();
                      if (!X509Util.h(x509Certific[i])) {
                         return new AndroidCertVerifyResult(-6);
                      }else {
                         Object j = X509Util.j;
                         _monitor_enter(j);
                         X509Util$c b = X509Util.b;
                         if (b == null) {
                            _monitor_exit(j);
                            return new AndroidCertVerifyResult(i1);
                         }else {
                            try{
                               list = b.a(x509Certific, p1, p2);
                            }catch(java.security.cert.CertificateException e1){
                               list = X509Util.d.a(list, p1, p2);
                            }catch(java.security.cert.CertificateException e0){
                               Object[] objArray1 = new Object[e0];
                               n.e("X509Util", "Failed to validate the certificate chain, error: "+e1.getMessage(), objArray1);
                               _monitor_exit(j);
                               return new AndroidCertVerifyResult(-2);
                            }
                         }
                      }
                   }catch(java.security.cert.CertificateExpiredException e0){
                      return new AndroidCertVerifyResult(-3);
                   }catch(java.security.cert.CertificateNotYetValidException e0){
                      return new AndroidCertVerifyResult(-4);
                   }catch(java.security.cert.CertificateException e0){
                      return new AndroidCertVerifyResult(i1);
                   }
                }catch(java.security.cert.CertificateException e0){
                   return new AndroidCertVerifyResult(-5);
                }
             }catch(java.security.cert.CertificateException e0){
                return new AndroidCertVerifyResult(i1);
             }
          }
       }
       throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|="+Arrays.deepToString(p0));
    }
}
