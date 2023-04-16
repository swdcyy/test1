package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameSdkConfig;
import java.lang.Number;

public class LiveGzoneAccompanySdkPlatformConfig implements Serializable	// class@000c3d
{
    public String mPlatform;
    public LiveGzoneAccompanyGameSdkConfig mSdkConfig;

    public void LiveGzoneAccompanySdkPlatformConfig(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanySdkPlatformConfig.class, "1");
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
       LiveGzoneAccompanySdkPlatformConfig tmPlatform = this.mPlatform;
       if (tmPlatform != null) {
          if (!tmPlatform.equals(p0.mPlatform)) {
          label_0038 :
             return false;
          }
       }else if(p0.mPlatform != null){
          goto label_0038 ;
       }
       tmPlatform = this.mSdkConfig;
       p0 = p0.mSdkConfig;
       if (tmPlatform != null) {
          b = tmPlatform.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       LiveGzoneAccompanySdkPlatformConfig obj = PatchProxy.apply(null, this, LiveGzoneAccompanySdkPlatformConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPlatform;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGzoneAccompanySdkPlatformConfig tmSdkConfig = this.mSdkConfig;
       if (tmSdkConfig != null) {
          i = tmSdkConfig.hashCode();
       }
       return (i1 + i);
    }
}
