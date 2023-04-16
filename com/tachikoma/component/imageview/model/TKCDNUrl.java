package com.tachikoma.component.imageview.model.TKCDNUrl;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.Set;
import org.json.JSONArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.net.URL;
import java.net.MalformedURLException;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;

public class TKCDNUrl implements Serializable	// class@000d04
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
    public static final long serialVersionUID = 0x72890a7ec41cc00f;

    public void TKCDNUrl(){
       super();
    }
    public void TKCDNUrl(TKCDNUrl p0){
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
    public void TKCDNUrl(String p0,String p1){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
    }
    public void TKCDNUrl(String p0,String p1,String p2,String p3){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIp = p2;
       this.mUrlPattern = p3;
    }
    public void TKCDNUrl(String p0,String p1,String p2,String p3,String p4){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIp = p2;
       this.mUrlPattern = p3;
       this.mUrlType = p4;
    }
    public void TKCDNUrl(String p0,String p1,String p2,String p3,boolean p4){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIp = p2;
       this.mUrlPattern = p3;
       this.mIsFreeTrafficCdn = p4;
    }
    public void TKCDNUrl(String p0,String p1,String p2,String p3,boolean p4,Set p5,String p6,String p7,Map p8){
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
    public void TKCDNUrl(String p0,String p1,boolean p2){
       super();
       this.mCdn = p0;
       this.mUrl = p1;
       this.mIsFreeTrafficCdn = p2;
    }
    public static TKCDNUrl[] fromJsonArray(JSONArray p0){
       TKCDNUrl[] tKCDNUrlArra = null;
       Object obj = PatchProxy.applyOneRefs(p0, tKCDNUrlArra, TKCDNUrl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length()) {
          int i = p0.length();
          tKCDNUrlArra = new TKCDNUrl[i];
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             JSONObject jSONObject = p0.getJSONObject(i1);
             TKCDNUrl tKCDNUrl = new TKCDNUrl(jSONObject.optString("cdn"), jSONObject.optString("url"), jSONObject.optString("ip"), jSONObject.optString("urlPattern"), jSONObject.optString("urlType"));
             tKCDNUrlArra[i1] = v10;
          }
       }
       return tKCDNUrlArra;
    }
    public static JSONArray toJsonArray(TKCDNUrl[] p0){
       Object obj = null;
       JSONArray obj1 = PatchProxy.applyOneRefs(p0, obj, TKCDNUrl.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || !p0.length) {
          return obj;
       }
       obj1 = new JSONArray();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          obj1.put(new JSONObject().put("cdn", oobject.mCdn).put("url", oobject.mUrl).put("ip", oobject.mIp).put("urlPattern", oobject.mUrlPattern).put("urlType", oobject.mUrlType));
       }
       return obj1;
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
       TKCDNUrl tmUrl;
       String obj = PatchProxy.apply(null, this, TKCDNUrl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new URL(this.mUrl).getPath();
       }catch(java.net.MalformedURLException e0){
          e0.printStackTrace();
          tmUrl = this.mUrl;
       }
       return tmUrl;
    }
    public String getPushCdn(){
       return this.mPushCdn;
    }
    public String getSpecialSizeUrl(int p0){
       if (PatchProxy.isSupport(TKCDNUrl.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TKCDNUrl.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 > 0 && !TextUtils.isEmpty(this.mUrlPattern)) {
          return (this.mUrlPattern).replaceAll("\\{[h,w]\\}", String.valueOf(p0));
       }else {
          return this.getUrl();
       }
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
