package p6.e;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import o6.a$b;
import java.util.Map;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import java.lang.Boolean;
import s6.a;
import java.util.HashMap;
import android.os.Build;
import s6.b;
import android.content.Context;
import t6.a;
import java.util.Iterator;
import java.lang.Throwable;
import u6.c;
import m6.d;
import j6.a;
import com.alipay.sdk.m.q.b;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import k6.a;
import java.util.Set;
import java.util.Map$Entry;
import p6.a;
import java.lang.StringBuilder;
import p6.b;
import u6.j;
import p6.c;
import n6.b;
import l6.a;
import n6.a;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.spec.KeySpec;
import java.security.PublicKey;
import javax.crypto.Cipher;
import java.security.Key;
import java.io.ByteArrayOutputStream;
import n6.d;
import p6.d;
import o6.a$a;
import o6.a;
import java.io.ByteArrayInputStream;
import java.lang.RuntimeException;

public abstract class e	// class@0028c5
{
    public boolean a;
    public boolean b;

    public void e(){
       super();
       this.a = true;
       this.b = true;
    }
    public static JSONObject f(String p0,String p1){
       JSONObject jSONObject = new JSONObject();
       JSONObject jSONObject1 = new JSONObject();
       jSONObject1.put("type", p0);
       jSONObject1.put("method", p1);
       jSONObject.put("action", jSONObject1);
       return jSONObject;
    }
    public static boolean j(a$b p0){
       String str;
       p0 = p0.a;
       if (p0 == null) {
       }else {
          List list = p0.get("msp-gzip");
          if (list != null) {
             str = TextUtils.join(",", list);
          label_0017 :
             return Boolean.valueOf(str).booleanValue();
          }
       }
       str = null;
       goto label_0017 ;
    }
    public String a(a p0){
       HashMap hashMap = new HashMap();
       hashMap.put("device", Build.MODEL);
       hashMap.put("namespace", "com.alipay.mobilecashier");
       hashMap.put("api_name", "com.alipay.mcpay");
       hashMap.put("api_version", this.k());
       return this.c(p0, hashMap, new HashMap());
    }
    public String b(a p0,String p1,JSONObject p2){
       b uob = b.d();
       a uoa = a.a(uob.b());
       JSONObject jSONObject = new JSONObject();
       JSONObject jSONObject1 = new JSONObject();
       int i = 2;
       int i1 = 0;
       try{
          int i2 = 1;
          JSONObject[] jSONObjectAr = new JSONObject[i];
          jSONObjectAr[i1] = jSONObject;
          jSONObjectAr[i2] = p2;
          int i3 = 0;
          while (i3 < i) {
             object oobject = jSONObjectAr[i3];
             if (oobject != null) {
                Iterator iterator = oobject.keys();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   jSONObject1.put(str, oobject.get(str));
                }
             }
             i3++;
          }
       }catch(org.json.JSONException e14){
          c.c(e14);
       }
       jSONObject1.put("external_info", p1);
       jSONObject1.put("tid", uoa.e());
       jSONObject1.put("user_agent", d.d().a(p0, uoa));
       jSONObject1.put("has_alipay", b.l(p0, uob.b(), a.d));
       p1 = "has_msp_app";
       Context uContext = uob.b();
       try{
          if (uContext.getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null) {
             i1 = true;
          }
          jSONObject1.put(p1, i1);
          jSONObject1.put("app_key", "2014052600006128");
          jSONObject1.put("utdid", e0.c());
          jSONObject1.put("new_client_key", uoa.d());
          jSONObject1.put("pa", d.c(e0.b()));
          return jSONObject1.toString();
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public String c(a p0,HashMap p1,HashMap p2){
       Map$Entry uEntry;
       String key;
       JSONObject jSONObject = new JSONObject();
       JSONObject jSONObject1 = new JSONObject();
       if (p1 != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             jSONObject1.put(key, uEntry.getValue());
          }
       }
       JSONObject jSONObject2 = new JSONObject();
       Iterator iterator1 = p2.entrySet().iterator();
       while (iterator1.hasNext()) {
          uEntry = iterator1.next();
          key = uEntry.getKey();
          jSONObject2.put(key, uEntry.getValue());
       }
       jSONObject1.put("params", jSONObject2);
       jSONObject.put("data", jSONObject1);
       return jSONObject.toString();
    }
    public Map d(boolean p0,String p1){
       HashMap hashMap = new HashMap();
       hashMap.put("msp-gzip", String.valueOf(p0));
       hashMap.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
       hashMap.put("content-type", "application/octet-stream");
       hashMap.put("Version", "2.0");
       hashMap.put("AppId", "TAOBAO");
       String str = "";
       if (TextUtils.isEmpty(p1)) {
       }else {
          String[] stringArray = p1.split("&");
          if (stringArray.length) {
             int len = stringArray.length;
             str = null;
             CharSequence uCharSequenc = str;
             CharSequence uCharSequenc1 = uCharSequenc;
             CharSequence uCharSequenc2 = uCharSequenc1;
             CharSequence uCharSequenc3 = uCharSequenc2;
             int i = 0;
             while (i < len) {
                object oobject = stringArray[i];
                if (TextUtils.isEmpty(uCharSequenc)) {
                   uCharSequenc = (!oobject.contains("biz_type"))? str: a.a(oobject);
                }
             label_005f :
                if (TextUtils.isEmpty(uCharSequenc1)) {
                   uCharSequenc1 = (!oobject.contains("biz_no"))? str: a.a(oobject);
                }
             label_0073 :
                if (TextUtils.isEmpty(uCharSequenc2)) {
                   uCharSequenc2 = (!oobject.contains("trade_no") || oobject.startsWith("out_trade_no"))? str: a.a(oobject);
                }
             label_0090 :
                if (TextUtils.isEmpty(uCharSequenc3)) {
                   uCharSequenc3 = (!oobject.contains("app_userid"))? str: a.a(oobject);
                }
             label_00a4 :
                i = i + 1;
             }
             String str1 = "";
             str = ";";
             if (!TextUtils.isEmpty(uCharSequenc)) {
                str1 = str1+"biz_type="+uCharSequenc+str;
             }
             if (!TextUtils.isEmpty(uCharSequenc1)) {
                str1 = str1+"biz_no="+uCharSequenc1+str;
             }
             if (!TextUtils.isEmpty(uCharSequenc2)) {
                str1 = str1+"trade_no="+uCharSequenc2+str;
             }
             if (!TextUtils.isEmpty(uCharSequenc3)) {
                str1 = str1+"app_userid="+uCharSequenc3+str;
             }
             str1 = str1;
             if (str1.endsWith(str)) {
                str1 = str1.substring(0, (str1.length() - 1));
             }
             str = str1;
          }
       }
       hashMap.put("Msp-Param", str);
       hashMap.put("des-mode", "CBC");
       return hashMap;
    }
    public abstract JSONObject e();
    public b g(a p0,Context p1){
       return this.h(p0, p1, "");
    }
    public b h(a p0,Context p1,String p2){
       return this.i(p0, p1, p2, j.a(p1), true);
    }
    public b i(a p0,Context p1,String p2,String p3,boolean p4){
       byte[] uobyteArray;
       boolean b1;
       int i;
       c b2;
       String b3;
       Cipher instance;
       int blockSize;
       ByteArrayOutputStream uByteArrayOu;
       object oobject;
       byte[][] uobyteArray1;
       d uod;
       a$b uob1;
       d uod1;
       String str4;
       ByteArrayInputStream uByteArrayIn;
       String str5;
       b uob2;
       String str6;
       JSONObject jSONObject;
       byte[] uobyteArray2;
       byte[] uobyteArray3;
       int i1;
       int i2;
       byte[][] uobyteArray4;
       e uoe = this;
       String str = p2;
       String str1 = p3;
       c.e("mspl", "Packet: "+str1);
       c uoc = new c(uoe.b);
       b uob = new b(this.a(p0), uoe.b(p0, str, this.e()));
       int b = false;
       Map map = uoe.d(b, str);
       e a = uoe.a;
       String str2 = "iSr";
       String str3 = map.get(str2);
       byte[] bytes = (uob.b()).getBytes();
       byte[] bytes1 = (uob.a()).getBytes();
       if (a != null) {
          try{
             bytes1 = b.a(bytes1);
          }catch(java.lang.Exception e0){
             uobyteArray = e0;
             b1 = false;
          }
       }
       b1 = a;
       uobyteArray = bytes1;
    }
    public String k(){
       return "4.9.0";
    }
}
