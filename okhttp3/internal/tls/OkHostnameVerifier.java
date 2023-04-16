package okhttp3.internal.tls.OkHostnameVerifier;
import javax.net.ssl.HostnameVerifier;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.String;
import okhttp3.internal.Util;
import javax.net.ssl.SSLSession;
import java.security.cert.Certificate;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.CharSequence;

public final class OkHostnameVerifier implements HostnameVerifier	// class@0020e0
{
    public static final OkHostnameVerifier INSTANCE;

    static {
       OkHostnameVerifier.INSTANCE = new OkHostnameVerifier();
    }
    public void OkHostnameVerifier(){
       super();
    }
    public static List allSubjectAltNames(X509Certificate p0){
       List subjectAltNa = OkHostnameVerifier.getSubjectAltNames(p0, 7);
       List subjectAltNa1 = OkHostnameVerifier.getSubjectAltNames(p0, 2);
       ArrayList uArrayList = new ArrayList((subjectAltNa.size() + subjectAltNa1.size()));
       uArrayList.addAll(subjectAltNa);
       uArrayList.addAll(subjectAltNa1);
       return uArrayList;
    }
    public static List getSubjectAltNames(X509Certificate p0,int p1){
       try{
          ArrayList uArrayList = new ArrayList();
          Collection subjectAlter = p0.getSubjectAlternativeNames();
          if (subjectAlter == null) {
             return Collections.emptyList();
          }
          Iterator iterator = subjectAlter.iterator();
          while (iterator.hasNext()) {
             List list = iterator.next();
             if (list == null || list.size() < 2) {
                continue ;
             }else {
                Integer integer = list.get(0);
                if (integer != null && integer.intValue() == p1) {
                   String str = list.get(1);
                   if (str != null) {
                      uArrayList.add(str);
                   }
                }
             }
          }
          return uArrayList;
       }catch(java.security.cert.CertificateParsingException e0){
          return Collections.emptyList();
       }
    }
    public boolean verify(String p0,X509Certificate p1){
       boolean b = (Util.verifyAsIpAddress(p0))? this.verifyIpAddress(p0, p1): this.verifyHostname(p0, p1);
       return b;
    }
    public boolean verify(String p0,SSLSession p1){
       int i = 0;
       try{
          return this.verify(p0, p1.getPeerCertificates()[i]);
       }catch(javax.net.ssl.SSLException e0){
          return e0;
       }
    }
    public boolean verifyHostname(String p0,String p1){
       if (p0 != null && p0.length()) {
          String str = ".";
          if (!p0.startsWith(str)) {
             String str1 = "..";
             if (p0.endsWith(str1) || (p1 == null || (!p1.length() || (!p1.startsWith(str) && !p1.endsWith(str1))))) {
                if (!p0.endsWith(str)) {
                   p0 = p0+'.';
                }
                if (!p1.endsWith(str)) {
                   p1 = p1+'.';
                }
                p1 = p1.toLowerCase(Locale.US);
                if (!p1.contains("*")) {
                   return p0.equals(p1);
                }else {
                   str = "*.";
                   if (p1.startsWith(str) && p1.indexOf(42, 1) == -1) {
                      if (p0.length() < p1.length()) {
                         return false;
                      }else if(str.equals(p1)){
                         return false;
                      }else {
                         p1 = p1.substring(1);
                         if (!p0.endsWith(p1)) {
                            return false;
                         }else {
                            int i = p0.length() - p1.length();
                            if (i > 0 && p0.lastIndexOf('.', (i - 1)) != -1) {
                               return false;
                            }else {
                               return 1;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_00b4 :
       return false;
    }
    public final boolean verifyHostname(String p0,X509Certificate p1){
       p0 = p0.toLowerCase(Locale.US);
       Iterator iterator = OkHostnameVerifier.getSubjectAltNames(p1, 2).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (this.verifyHostname(p0, iterator.next())) {
             break ;
          }
       }
       return true;
    }
    public final boolean verifyIpAddress(String p0,X509Certificate p1){
       List subjectAltNa = OkHostnameVerifier.getSubjectAltNames(p1, 7);
       int i = subjectAltNa.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (p0.equalsIgnoreCase(subjectAltNa.get(i1))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
}
