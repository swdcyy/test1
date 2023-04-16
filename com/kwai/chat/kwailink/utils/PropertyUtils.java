package com.kwai.chat.kwailink.utils.PropertyUtils;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.kwailink.utils.Utils;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.base.b;
import c97.d;
import h97.g;
import java.util.Map;
import com.kwai.chat.kwailink.data.ZtCommonInfo;

public class PropertyUtils	// class@000a75
{
    public static String appVersion;
    public static String deviceId;
    public static String imsdkVersion;
    public static String kpn;

    public void PropertyUtils(){
       super();
    }
    public static String getAppVersion(){
       Object obj = PatchProxy.apply(null, null, PropertyUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Utils.isInvalidStr(PropertyUtils.appVersion)) {
          PropertyUtils.appVersion = PropertyUtils.getAppVersionInternal();
       }
       return PropertyUtils.appVersion;
    }
    public static String getAppVersionInternal(){
       Object obj = PatchProxy.apply(null, null, PropertyUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Utils.getStringNotNull(b.a().f());
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public static String getDeviceId(){
       Object obj = PatchProxy.apply(null, null, PropertyUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Utils.isInvalidStr(PropertyUtils.deviceId)) {
          PropertyUtils.deviceId = PropertyUtils.getDeviceIdInternal();
       }
       return PropertyUtils.deviceId;
    }
    public static String getDeviceIdInternal(){
       String obj = PatchProxy.apply(null, null, PropertyUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = b.a().g();
       }catch(java.lang.Exception e0){
          obj = "";
       }
       try{
          if (Utils.isInvalidStr(obj)) {
             obj = Utils.getStringNotNull(d.a().b().getDeviceId());
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getImsdkVersion(){
       Object obj = PatchProxy.apply(null, null, PropertyUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Utils.isInvalidStr(PropertyUtils.imsdkVersion)) {
          PropertyUtils.imsdkVersion = PropertyUtils.getImsdkVersionInternal();
       }
       return PropertyUtils.imsdkVersion;
    }
    public static String getImsdkVersionInternal(){
       Object obj = PatchProxy.apply(null, null, PropertyUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Utils.getStringNotNull(b.a().j().get("sdkVersion"));
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public static String getKpn(){
       Object obj = PatchProxy.apply(null, null, PropertyUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Utils.isInvalidStr(PropertyUtils.kpn)) {
          PropertyUtils.kpn = PropertyUtils.getKpnInternal();
       }
       return PropertyUtils.kpn;
    }
    public static String getKpnInternal(){
       String obj = PatchProxy.apply(null, null, PropertyUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = b.e().e();
       }catch(java.lang.Exception e0){
          obj = "";
       }
       try{
          if (Utils.isInvalidStr(obj)) {
             obj = Utils.getStringNotNull(d.a().b().getProductName());
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getLinkVersion(){
       return "4.24.4-kuaishou";
    }
}
