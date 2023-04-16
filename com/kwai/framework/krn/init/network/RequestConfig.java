package com.kwai.framework.krn.init.network.RequestConfig;
import java.io.Serializable;
import mkd.a;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.common.collect.f;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Iterator;
import java.lang.StringBuilder;
import com.google.common.collect.f$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import os6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.router.RouteType;
import c96.c;
import java.net.URI;
import c96.a;
import java.lang.Throwable;
import f66.i;
import q87.c;
import fg6.a;
import com.google.gson.Gson;
import ok.k;
import java.util.Collections;
import java.lang.Number;

public class RequestConfig implements Serializable, a	// class@0015ea
{
    public String businessName;
    public String customUploadEventKey;
    public String fileKey;
    public Map headers;
    public int isAddCommonParameters;
    public boolean isHitKrnPageLoadMonitorSample;
    public String localFilePath;
    public String mHttpReportUrl;
    public boolean mIsRequestV2;
    public String method;
    public Map params;
    public Map parts;
    public Map queryParams;
    public boolean removeHostIfBusinessNameExist;
    public String responseType;
    public int rootTag;
    public boolean showProgress;
    public int timeout;
    public int uniqueId;
    public boolean upload;
    public String url;
    public static String b = "";
    public static String[] keys;
    public static final long serialVersionUID;

    static {
       String[] stringArray = new String[]{"url","method","params","headers","businessName","responseType","upload","localFilePath","parts"};
       RequestConfig.keys = stringArray;
    }
    public void RequestConfig(){
       super();
       this.isAddCommonParameters = 1;
    }
    public static void a(Map p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, RequestConfig.class, "9")) {
          return;
       }
       f uof = Maps.d(p0, p1);
       p1 = uof.a();
       Map map = uof.c();
       uof = uof.b();
       Iterator iterator = map.keySet().iterator();
       String str = " ";
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (RequestConfig.c(str1)) {
             RequestConfig.b = RequestConfig.b+" 参数"+str1+":仅js有 ";
          }else {
             RequestConfig.b = RequestConfig.b+"js多"+RequestConfig.b(map)+str;
             break ;
          }
       }
       Iterator iterator1 = uof.keySet().iterator();
       while (iterator1.hasNext()) {
          String str2 = iterator1.next();
          if (RequestConfig.c(str2)) {
             RequestConfig.b = RequestConfig.b+" 参数"+str2+":仅pre有 ";
          }else {
             RequestConfig.b = RequestConfig.b+"pre多"+RequestConfig.b(uof)+str;
             break ;
          }
       }
       Iterator iterator2 = p1.keySet().iterator();
       while (iterator2.hasNext()) {
          String str3 = iterator2.next();
          Object obj = p1.get(str3).a();
          Object obj1 = p1.get(str3).b();
          if (obj instanceof Map && obj1 instanceof Map) {
             RequestConfig.b = (RequestConfig.c(str3))? RequestConfig.b+" 参数"+str3+":": RequestConfig.b+str3+":";
             RequestConfig.a(obj, obj1);
          }else if(RequestConfig.c(str3)){
             RequestConfig.b = RequestConfig.b+" 参数"+str3+":不同 ";
          }else {
             RequestConfig.b = RequestConfig.b+str3+"不同 ";
          }
       }
       return;
    }
    public static String b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RequestConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.keySet().toString();
    }
    public static boolean c(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, RequestConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = RequestConfig.keys;
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if ((obj[i]).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static String getDiffParams(Map p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RequestConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RequestConfig.b = "";
       RequestConfig.a(RequestConfig.getFocusMap(p0), RequestConfig.getFocusMap(p1));
       return (RequestConfig.b).trim();
    }
    public static Map getFocusMap(Map p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, RequestConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (RequestConfig.c(str)) {
             obj.put(str, p0.get(str));
          }
       }
       return obj;
    }
    public void afterDeserialize(){
       boolean b;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RequestConfig.class, "14")) {
          return;
       }
       if (this.isRemoveHostIfBusinessNameExist()) {
          RequestConfig tbusinessNam = this.businessName;
          String obj = PatchProxy.applyOneRefs(tbusinessNam, objArray, a.class, "4");
          int i = 0;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!TextUtils.isEmpty(tbusinessNam) && RouteType.nameOf(a.a(tbusinessNam)) != null){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             try{
                tbusinessNam = this.url;
                obj = null;
                URI obj1 = PatchProxy.applyThreeRefs(tbusinessNam, null, null, null, c.class, "1");
                if (obj1 != patchProxyRe) {
                   str = obj1;
                }else {
                   try{
                      URI uRI = new URI(tbusinessNam);
                      obj1 = new URI(obj, 0, uRI.getPath(), uRI.getQuery(), uRI.getFragment());
                      str = v12.toString();
                   }catch(java.net.URISyntaxException e0){
                      a.D().B("Krn-UriUtil", e0);
                   }
                }
             }catch(java.net.URISyntaxException e0){
                a.D().B("Krn-UriUtil", e0);
             }
             this.setUrl(str);
             objArray = new Object[i];
             a.D().w("RequestConfig", "process url : "+this.url, objArray);
          }
       }
       return;
    }
    public RequestConfig clone(){
       Gson obj = PatchProxy.apply(null, this, RequestConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a;
       return obj.h(obj.q(this), RequestConfig.class);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RequestConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof RequestConfig) {
          return b;
       }
       if (k.a(this.url, p0.url) && (k.a(this.method, p0.method) && (k.a(this.params, p0.params) && (k.a(this.headers, p0.headers) && (k.a(this.businessName, p0.businessName) && (k.a(this.responseType, p0.responseType) && (k.a(Boolean.valueOf(this.upload), Boolean.valueOf(p0.upload)) && (k.a(this.localFilePath, p0.localFilePath) && (k.a(this.parts, p0.parts) && k.a(this.queryParams, p0.queryParams)))))))))) {
          b = true;
       }
    label_0088 :
       return b;
    }
    public String getBusinessName(){
       return this.businessName;
    }
    public String getCustomUploadEventKey(){
       return this.customUploadEventKey;
    }
    public String getFileKey(){
       return this.fileKey;
    }
    public Map getHeaders(){
       Object obj = PatchProxy.apply(null, this, RequestConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.headers == null) {
          this.headers = new HashMap();
       }
       return this.headers;
    }
    public String getHttpReportUrl(){
       return this.mHttpReportUrl;
    }
    public boolean getIsAddCommonParameters(){
       boolean b = (this.isAddCommonParameters != null)? true: false;
       return b;
    }
    public String getLocalFilePath(){
       return this.localFilePath;
    }
    public String getMethod(){
       return this.method;
    }
    public Map getParams(){
       Object obj = PatchProxy.apply(null, this, RequestConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.params == null) {
          this.params = new HashMap();
       }
       return this.params;
    }
    public Map getParts(){
       Object obj = PatchProxy.apply(null, this, RequestConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.parts == null) {
          this.parts = new HashMap();
       }
       return this.parts;
    }
    public Map getQueryParams(){
       Object obj = PatchProxy.apply(null, this, RequestConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.queryParams == null) {
          this.queryParams = Collections.emptyMap();
       }
       return this.queryParams;
    }
    public String getResponseType(){
       return this.responseType;
    }
    public int getRootTag(){
       return this.rootTag;
    }
    public int getTimeout(){
       return this.timeout;
    }
    public int getUniqueId(){
       return this.uniqueId;
    }
    public String getUrl(){
       return this.url;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, RequestConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.url,this.method,this.params,this.headers,this.businessName,this.responseType};
       return k.b(obj);
    }
    public boolean isHitKrnPageLoadMonitorSample(){
       return this.isHitKrnPageLoadMonitorSample;
    }
    public boolean isRemoveHostIfBusinessNameExist(){
       return this.removeHostIfBusinessNameExist;
    }
    public boolean isRequestV2(){
       return this.mIsRequestV2;
    }
    public boolean isShowProgress(){
       return this.showProgress;
    }
    public boolean isUpload(){
       return this.upload;
    }
    public void setBusinessName(String p0){
       this.businessName = p0;
    }
    public void setCustomUploadEventKey(String p0){
       this.customUploadEventKey = p0;
    }
    public void setFileKey(String p0){
       this.fileKey = p0;
    }
    public void setHeaders(Map p0){
       this.headers = p0;
    }
    public void setHitKrnPageLoadMonitorSample(boolean p0){
       this.isHitKrnPageLoadMonitorSample = p0;
    }
    public void setHttpReportUrl(String p0){
       this.mHttpReportUrl = p0;
    }
    public void setIsAddCommonParameters(int p0){
       this.isAddCommonParameters = p0;
    }
    public void setIsRequestV2(boolean p0){
       this.mIsRequestV2 = p0;
    }
    public void setLocalFilePath(String p0){
       this.localFilePath = p0;
    }
    public void setMethod(String p0){
       this.method = p0;
    }
    public void setParams(Map p0){
       this.params = p0;
    }
    public void setParts(Map p0){
       this.parts = p0;
    }
    public void setQueryParams(Map p0){
       this.queryParams = p0;
    }
    public void setResponseType(String p0){
       this.responseType = p0;
    }
    public void setShowProgress(boolean p0){
       this.showProgress = p0;
    }
    public void setUniqueId(int p0){
       this.uniqueId = p0;
    }
    public void setUpload(boolean p0){
       this.upload = p0;
    }
    public void setUrl(String p0){
       this.url = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RequestConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RequestConfig{url=\'"+this.url+'''+", method=\'"+this.method+'''+", params="+this.params+", headers="+this.headers+", businessName=\'"+this.businessName+'''+", responseType=\'"+this.responseType+'''+", isAddCommonParameters="+this.isAddCommonParameters+", rootTag="+this.rootTag+", upload="+this.upload+", localFilePath=\'"+this.localFilePath+'''+", fileKey=\'"+this.fileKey+'''+", customUploadEventKey=\'"+this.customUploadEventKey+'''+", showProgress="+this.showProgress+", parts="+this.parts+'}';
    }
}
