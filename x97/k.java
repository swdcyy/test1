package x97.k;
import x97.d;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import c97.d;
import h97.g;
import java.lang.String;
import java.util.Locale;
import java.lang.System;
import java.lang.Long;
import ca7.v;
import java.util.Random;
import java.lang.Integer;
import h97.i;
import x97.n;
import java.lang.CharSequence;
import ca7.u;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.text.TextUtils;
import java.util.List;
import java.lang.IllegalStateException;
import android.content.Context;
import androidx.core.content.ContextCompat;
import ca7.i;
import ca7.m;
import android.os.Build$VERSION;
import okhttp3.Request;
import ca7.s;
import okhttp3.HttpUrl;
import ca7.n;
import java.util.concurrent.TimeUnit;
import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.Key;
import com.middleware.security.MXSec;
import t38.a;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.Throwable;

public class k implements d	// class@0027d2
{
    public List a;

    public void k(){
       super();
       this.a = new ArrayList();
    }
    public Map a(){
       Iterator iterator;
       HashMap hashMap = new HashMap();
       hashMap.put("Accept-Language", d.a().b().getLanguage());
       Object[] objArray = new Object[]{Long.valueOf(System.currentTimeMillis()),Integer.valueOf(v.b.nextInt(0x186a0))};
       hashMap.put("X-REQUESTID", String.format(Locale.US, "%s%05d", objArray));
       hashMap.put("Connection", "keep-alive");
       String str = d.a().e().b().g();
       if (!u.c(str)) {
          hashMap.put("trace-context", str);
       }
       HashMap hashMap1 = new HashMap();
       this.d(hashMap1);
       if (hashMap1.isEmpty()) {
          str = "";
       }else {
          StringBuilder str1 = "";
          iterator = hashMap1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str1 = str1+uEntry.getKey()+'='+uEntry.getValue()+"; ";
          }
          str1.deleteCharAt((str1.length() - 1));
          str = str1;
       }
       if (!TextUtils.isEmpty(str)) {
          hashMap.put("Cookie", str);
       }
       iterator = this.a.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null) {
             hashMap.putAll(uod.a());
          }
       }
       return hashMap;
    }
    public Map b(){
       HashMap hashMap = new HashMap();
       g og = d.a().b();
       hashMap.put("kpn", u.a(og.getProductName()));
       hashMap.put("kpf", u.a(og.getPlatform()));
       hashMap.put("appver", u.a(og.getAppVersion()));
       hashMap.put("ver", u.a(og.getVersion()));
       hashMap.put("gid", u.a(og.getGlobalId()));
       if (og.isDebugMode() && u.c(og.getDeviceId())) {
          throw new IllegalStateException("device id cannot be null when API request");
       }
       hashMap.put("did", u.a(og.getDeviceId()));
       hashMap.put("userId", u.a(og.getUserId()));
       if (!ContextCompat.checkSelfPermission(d.a().d(), "android.permission.ACCESS_FINE_LOCATION")) {
          String str = String.valueOf(og.getLatitude());
          String str1 = String.valueOf(og.getLongitude());
          if (og.a0()) {
             str = i.b(str);
             str1 = i.b(str1);
          }
          hashMap.put("lat", str);
          hashMap.put("lon", str1);
       }
       hashMap.put("mod", u.a(og.getManufacturerAndModel()));
       hashMap.put("net", u.a(m.c(d.a().d())));
       hashMap.put("sys", u.a(og.getSysRelease()));
       hashMap.put("os", "android");
       hashMap.put("c", u.a(og.getChannel()));
       hashMap.put("language", u.a(og.getLanguage()));
       hashMap.put("countryCode", u.a(og.i()));
       hashMap.put("mcc", u.a(og.X()));
       hashMap.put("androidApiLevel", String.valueOf(Build$VERSION.SDK_INT));
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null) {
             hashMap.putAll(uod.b());
          }
       }
       return hashMap;
    }
    public String c(Request p0,Map p1,Map p2){
       String str5;
       String str6;
       Object obj = p0;
       Map map = p2;
       String str = d.a().b().W();
       String str1 = "path cannot be null or empty";
       String str2 = "method cannot be null or empty";
       String str3 = "request cannot be null";
       String str4 = "";
       if (!u.c(str)) {
          if (!u.c(str)) {
             v.d(obj, str3);
             str6 = p0.method();
             String str7 = p0.url().encodedPath();
             if (!u.c(str)) {
                Map map2 = s.b(p1, p2);
                if (!u.c(str)) {
                   v.d(str6, str2);
                   v.d(str7, str1);
                   str5 = str1;
                   n on = new n((int)(System.currentTimeMillis() / TimeUnit.MINUTES.toMillis(1)), n.d.nextInt());
                   byte[] uobyteArray = Base64.decode(str, 0);
                   byte[] bytes = (s.a(str6, str7, map2, on)).getBytes(s.a);
                   try{
                      SecretKeySpec secretKeySpe = new SecretKeySpec(uobyteArray, "HmacSHA256");
                      Mac instance = Mac.getInstance(secretKeySpe.getAlgorithm());
                      instance.init(secretKeySpe);
                      uobyteArray = instance.doFinal(bytes);
                   }catch(java.lang.Exception e0){
                      bytes = new byte[0];
                      uobyteArray = bytes;
                   }
                   if (uobyteArray == null) {
                   label_00bd :
                      map.put("__clientSign", str4);
                   }else {
                      n c = on.c;
                      int i = 8;
                      byte[] uobyteArray1 = new byte[i];
                      for (int i1 = 7; i1 >= 0; i1 = i1 - 1) {
                         long l = 255 & c;
                         uobyteArray1[i1] = (byte)(int)l;
                         long l1 = c >> i;
                      }
                      bytes = new byte[(uobyteArray.length + i)];
                      int i2 = 0;
                      System.arraycopy(uobyteArray1, i2, bytes, i2, i);
                      System.arraycopy(uobyteArray, i2, bytes, i, uobyteArray.length);
                      str4 = Base64.encodeToString(bytes, 11);
                      goto label_00bd ;
                   }
                }
             }
          }
          str5 = str1;
          goto label_00bd ;
       }else {
          str5 = str1;
       }
       if (d.a().e().b().e()) {
          v.d(obj, str3);
          str = p0.method();
          str6 = p0.url().encodedPath();
          v.d(str, str2);
          v.d(str6, str5);
          str1 = "azeroth";
          v.d(str1, "sdkName cannot be null or empty");
          v.d("010a11c6-f2cb-4016-887d-0d958aef1534", "securityAppKey cannot be null or empty");
          str = s.a(str, str6, s.b(p1, p2), null);
          str = MXSec.get().getMXWrapper().b(str1, "010a11c6-f2cb-4016-887d-0d958aef1534", 0, str);
          if (!u.c(str)) {
             map.put("__NS_sig3", str);
          }else {
             Azeroth2.B.v(new IllegalStateException("麻烦联系安全组张艳生，升级或者接入KWSecuritySDK:3.9.1.4 + 版本，以便完成__NS_sig3的计算流程"));
          }
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          Map map1 = p1;
          if (uod != null) {
             uod.c(obj, map1, map);
          }
       }
       return str4;
    }
    public void d(Map p0){
       g og = d.a().b();
       String str = og.P();
       String str1 = og.b0();
       String str2 = og.S();
       if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str)) {
          p0.put(str1+"_st", str);
       }
       if (!TextUtils.isEmpty(str2)) {
          p0.put("token", str2);
       }
       try{
          p0.put("__NSWJ", og.N());
       }catch(java.lang.Exception e0){
          Azeroth2.B.v(e0);
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null) {
             uod.d(p0);
          }
       }
       return;
    }
    public Map e(){
       HashMap hashMap = new HashMap();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod != null) {
             hashMap.putAll(uod.e());
          }
       }
       return hashMap;
    }
}
