package com.unionpay.a.b;
import javax.net.ssl.X509TrustManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;
import javax.net.ssl.TrustManager;
import android.os.Build$VERSION;
import android.net.http.X509TrustManagerExtensions;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import java.util.ArrayList;
import com.unionpay.utils.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.security.cert.CertificateException;

public final class b implements X509TrustManager	// class@000ff0
{
    public X509TrustManager a;
    public X509TrustManagerExtensions b;
    public Context c;

    public void b(Context p0){
       super();
       this.a = null;
       this.b = null;
       this.c = p0;
       TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
       instance.init(null);
       TrustManager[] trustManager = instance.getTrustManagers();
       if (!trustManager.length) {
          throw new NoSuchAlgorithmException("no trust manager found");
       }
       this.a = trustManager[0];
       if (Build$VERSION.SDK_INT > 23) {
          this.b = new X509TrustManagerExtensions(this.a);
       }
       return;
    }
    public final void checkClientTrusted(X509Certificate[] p0,String p1){
       this.a.checkClientTrusted(p0, p1);
    }
    public final void checkServerTrusted(X509Certificate[] p0,String p1){
       ArrayList uArrayList1;
       if (Build$VERSION.SDK_INT > 23) {
          b tb = this.b;
          if (tb != null) {
             tb.checkServerTrusted(p0, p1, "");
          label_0015 :
             int i = 0;
             try{
                X500Principal issuerX500Pr = p0[i].getIssuerX500Principal();
                ArrayList uArrayList = new ArrayList(i);
                uArrayList.add(".*\(GeoTrust|VeriSign|Symantec|GlobalSign|Entrust|Thawte|DigiCert\).*");
                String str = b.a(this.c);
                if (!TextUtils.isEmpty(str)) {
                   uArrayList.add(str);
                }
                int i1 = 0;
                while (true) {
                   if (i1 < uArrayList.size()) {
                      if (Pattern.compile(uArrayList.get(i1), 2).matcher(issuerX500Pr.getName()).matches()) {
                         uArrayList1 = 1;
                      label_005c :
                         if (uArrayList1) {
                            X500Principal subjectX500P = p0[i].getSubjectX500Principal();
                            uArrayList1 = new ArrayList(i);
                            uArrayList1.add(".*CN=.*\(\\.95516\\.com|\\.chinaunionpay\\.com|\\.unionpay\\.com|\\.unionpaysecure\\.com|\\.95516\\.net\)\(,.*|$\)");
                            int i2 = 0;
                            while (i2 < uArrayList1.size()) {
                               if (Pattern.compile(uArrayList1.get(i2), 2).matcher(subjectX500P.getName()).matches()) {
                                  i = 1;
                               }
                               i2 = i2 + 1;
                            }
                            if (i) {
                            }else {
                               throw new CertificateException();
                            }
                         }else {
                            throw new CertificateException();
                         }
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      uArrayList1 = null;
                      goto label_005c ;
                   }
                }
                return;
             }catch(java.lang.Exception e0){
                throw new CertificateException();
             }
          }
       }
       this.a.checkServerTrusted(p0, p1);
       goto label_0015 ;
    }
    public final X509Certificate[] getAcceptedIssuers(){
       return this.a.getAcceptedIssuers();
    }
}
