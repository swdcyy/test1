package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameSdkConfig;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class LiveGzoneAccompanyGameSdkConfig implements Serializable, a	// class@000c37
{
    public String mGameCenterUrl;
    public String mGameDownloadUrl;
    public String[] mGamePackageNames;
    public String mGameSDKMinimumVersion;
    public String mKwaiSDKMinimumVersion;
    public String mOriginalGamePackageNames;
    public String mOriginalUrlSchemes;
    public String[] mUrlSchemes;

    public void LiveGzoneAccompanyGameSdkConfig(){
       super();
    }
    public void afterDeserialize(){
       String[] stringArray = String[].class;
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyGameSdkConfig.class, "3")) {
          return;
       }
       try{
          Gson a = a.a;
          this.mUrlSchemes = a.h(this.mOriginalUrlSchemes, stringArray);
          this.mGamePackageNames = a.h(this.mOriginalGamePackageNames, stringArray);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyGameSdkConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       LiveGzoneAccompanyGameSdkConfig tmOriginalUr = this.mOriginalUrlSchemes;
       if (tmOriginalUr != null) {
          if (!tmOriginalUr.equals(p0.mOriginalUrlSchemes)) {
          label_0039 :
             return false;
          }
       }else if(p0.mOriginalUrlSchemes != null){
          goto label_0039 ;
       }
       tmOriginalUr = this.mGameCenterUrl;
       if (tmOriginalUr != null) {
          if (!tmOriginalUr.equals(p0.mGameCenterUrl)) {
          label_004b :
             return false;
          }
       }else if(p0.mGameCenterUrl != null){
          goto label_004b ;
       }
       tmOriginalUr = this.mGameDownloadUrl;
       if (tmOriginalUr != null) {
          if (!tmOriginalUr.equals(p0.mGameDownloadUrl)) {
          label_005d :
             return false;
          }
       }else if(p0.mGameDownloadUrl != null){
          goto label_005d ;
       }
       tmOriginalUr = this.mGameSDKMinimumVersion;
       if (tmOriginalUr != null) {
          if (!tmOriginalUr.equals(p0.mGameSDKMinimumVersion)) {
          label_006f :
             return false;
          }
       }else if(p0.mGameSDKMinimumVersion != null){
          goto label_006f ;
       }
       tmOriginalUr = this.mKwaiSDKMinimumVersion;
       if (tmOriginalUr != null) {
          if (!tmOriginalUr.equals(p0.mKwaiSDKMinimumVersion)) {
          label_0081 :
             return false;
          }
       }else if(p0.mKwaiSDKMinimumVersion != null){
          goto label_0081 ;
       }
       tmOriginalUr = this.mOriginalGamePackageNames;
       if (tmOriginalUr != null) {
          b = tmOriginalUr.equals(p0.mOriginalGamePackageNames);
       }else if(p0.mOriginalGamePackageNames == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       LiveGzoneAccompanyGameSdkConfig obj = PatchProxy.apply(null, this, LiveGzoneAccompanyGameSdkConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mOriginalUrlSchemes;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGzoneAccompanyGameSdkConfig tmGameCenter = this.mGameCenterUrl;
       int i2 = (tmGameCenter != null)? tmGameCenter.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmGameCenter = this.mGameDownloadUrl;
       i2 = (tmGameCenter != null)? tmGameCenter.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmGameCenter = this.mGameSDKMinimumVersion;
       i2 = (tmGameCenter != null)? tmGameCenter.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmGameCenter = this.mKwaiSDKMinimumVersion;
       i2 = (tmGameCenter != null)? tmGameCenter.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmGameCenter = this.mOriginalGamePackageNames;
       if (tmGameCenter != null) {
          i = tmGameCenter.hashCode();
       }
       return (i1 + i);
    }
}
