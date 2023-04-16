package com.yxcorp.gifshow.model.CDNUrl;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import java.net.URL;
import java.net.MalformedURLException;
import java.lang.CharSequence;
import android.text.TextUtils;

public class CDNUrl implements Serializable	// class@001228
{
    public String mCdn;
    public Set mFeature;
    public Map mHeaders;
    public String mIp;
    public boolean mIsFreeTrafficCdn;
    public String mPushCdn;
    public String mUrl;
    public String mUrlPattern;
    public String mUrlType;
    public static final long serialVersionUID = 0x1;

    public void CDNUrl(){
       super();
    }
    public void CDNUrl(CDNUrl p0){
       super();
       if (p0 != null) {
          this.mCdn = p0.mCdn;
          this.mUrl = p0.mUrl;
          this.mUrlType = p0.mUrlType;
          this.mIsFreeTrafficCdn = p0.mIsFreeTrafficCdn;
          if (p0.mFeature != null) {
             this.mFeature = new HashSet(p0.mFeature);
          }
          this.mPushCdn = p0.mPushCdn;
          if (p0.mHeaders != null) {
             this.mHeaders = new HashMap(p0.mHeaders);
          }
          this.mIp = p0.mIp;
          this.mUrlPattern = p0.mUrlPattern;
       }
       return;
    }
    public void CDNUrl(String p0,String p1){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
    }
    public void CDNUrl(String p0,String p1,String p2,String p3){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIp = p2;
       this.mUrlPattern = p3;
    }
    public void CDNUrl(String p0,String p1,String p2,String p3,String p4){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIp = p2;
       this.mUrlPattern = p3;
       this.mUrlType = p4;
    }
    public void CDNUrl(String p0,String p1,String p2,String p3,boolean p4){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIp = p2;
       this.mUrlPattern = p3;
       this.mIsFreeTrafficCdn = p4;
    }
    public void CDNUrl(String p0,String p1,String p2,String p3,boolean p4,Set p5,String p6,String p7,Map p8){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mUrlType = p6;
       this.mIsFreeTrafficCdn = p4;
       this.mFeature = p5;
       this.mPushCdn = p7;
       this.mHeaders = p8;
       this.mIp = p2;
       this.mUrlPattern = p3;
    }
    public void CDNUrl(String p0,String p1,boolean p2){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIsFreeTrafficCdn = p2;
    }
    public static CDNUrl[] fromJsonArray(JSONArray p0){
       if (p0 == null || !p0.length()) {
          return null;
       }
       int i = p0.length();
       CDNUrl[] uCDNUrlArray = new CDNUrl[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          JSONObject jSONObject = p0.getJSONObject(i1);
          CDNUrl uCDNUrl = new CDNUrl(jSONObject.optString("cdn"), jSONObject.optString("url"), jSONObject.optString("ip"), jSONObject.optString("urlPattern"), jSONObject.optString("urlType"));
          uCDNUrlArray[i1] = v10;
       }
       return uCDNUrlArray;
    }
    public static JSONArray toJsonArray(CDNUrl[] p0){
       if (p0 == null || !p0.length) {
          return null;
       }
       JSONArray jSONArray = new JSONArray();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          jSONArray.put(new JSONObject().put("cdn", oobject.mCdn).put("url", oobject.mUrl).put("ip", oobject.mIp).put("urlPattern", oobject.mUrlPattern).put("urlType", oobject.mUrlType));
       }
       return jSONArray;
    }
    public String getCdn(){
       return this.mCdn;
    }
    public Set getFeature(){
       return this.mFeature;
    }
    public Set getFeatures(){
       return this.mFeature;
    }
    public Map getHeaders(){
       return this.mHeaders;
    }
    public String getIp(){
       return this.mIp;
    }
    public String getPath(){
       String path;
       try{
          path = new URL(this.mUrl).getPath();
       }catch(java.net.MalformedURLException e0){
          e0.printStackTrace();
          path = this.mUrl;
       }
       return path;
    }
    public String getPushCdn(){
       return this.mPushCdn;
    }
    public String getSpecialSizeUrl(int p0){
       if (p0 > 0 && !TextUtils.isEmpty(this.mUrlPattern)) {
          return (this.mUrlPattern).replaceAll("\\{[h,w]\\}", String.valueOf(p0));
       }
       return this.getUrl();
    }
    public String getUrl(){
       return this.mUrl;
    }
    public String getUrlPattern(){
       return this.mUrlPattern;
    }
    public String getUrlType(){
       return this.mUrlType;
    }
    public boolean isFreeTrafficCdn(){
       return this.mIsFreeTrafficCdn;
    }
    public void setFeature(Set p0){
       this.mFeature = p0;
    }
}
