package com.hpplay.sdk.source.browse.data.LelinkServiceInfoCreator;
import java.lang.Object;
import org.json.JSONObject;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.String;
import com.hpplay.sdk.source.browse.data.BrowserInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import com.hpplay.sdk.source.a.a;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;

public class LelinkServiceInfoCreator	// class@000661
{

    public void LelinkServiceInfoCreator(){
       super();
    }
    public static LelinkServiceInfo getCacheInfo(int p0,JSONObject p1){
       if (p1 == null || p1.length() <= 0) {
          return null;
       }
       String str = p1.optString("u");
       String str1 = p1.optString("name");
       BrowserInfo uBrowserInfo = new BrowserInfo(4, 4);
       uBrowserInfo.setUid(str);
       uBrowserInfo.setName(str1);
       HashMap hashMap = new HashMap();
       hashMap.put("u", str);
       hashMap.put("deviceName", str1);
       uBrowserInfo.setExtras(hashMap);
       return new LelinkServiceInfo(p0, uBrowserInfo);
    }
    public static LelinkServiceInfo getLelinkTxtInfo(String p0,String p1,String p2,String p3,String p4){
       LelinkServiceInfo lelinkServic = null;
       try{
          JSONObject jSONObject = new JSONObject(p4).optJSONObject("leLinkTxt");
          if (jSONObject == null || jSONObject.length() <= 0) {
             a.f("LelinkServiceInfoCreator", "getLelinkTxtInfo lelinkTxt is empty");
             return lelinkServic;
          }else {
             BrowserInfo uBrowserInfo = new BrowserInfo(1, 2);
             uBrowserInfo.setUid(p0);
             uBrowserInfo.setName(p1);
             uBrowserInfo.setIp(p2);
             uBrowserInfo.setLocalWifi(1);
             uBrowserInfo.setOnLine(1);
             uBrowserInfo.setPort(LelinkServiceInfoCreator.parsePort(p3));
             HashMap hashMap = new HashMap();
             Iterator iterator = jSONObject.keys();
             while (iterator.hasNext()) {
                p2 = iterator.next();
                hashMap.put(p2, jSONObject.optString(p2));
             }
             hashMap.put("htv", "1");
             uBrowserInfo.setExtras(hashMap);
             return new LelinkServiceInfo(2, uBrowserInfo);
          }
       }catch(java.lang.Exception e5){
          a.b("LelinkServiceInfoCreator", e5);
          return lelinkServic;
       }
    }
    public static LelinkServiceInfo getLocalCacheInfo(JSONObject p0){
       return LelinkServiceInfoCreator.getCacheInfo(3, p0);
    }
    public static LelinkServiceInfo getRemoteCacheInfo(JSONObject p0){
       return LelinkServiceInfoCreator.getCacheInfo(4, p0);
    }
    public static Map getUrlParams(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       HashMap hashMap = new HashMap();
       String[] stringArray = p0.split("&");
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          String[] stringArray1 = (stringArray[i]).split("=");
          if (stringArray1.length == 2) {
             hashMap.put(stringArray1[0], stringArray1[1]);
          }
          i = i + 1;
       }
       return hashMap;
    }
    public static int parsePort(String p0){
       try{
          return Integer.parseInt(p0);
       }catch(java.lang.Exception e1){
          a.b("LelinkServiceInfoCreator", e1);
          return 0;
       }
    }
}
