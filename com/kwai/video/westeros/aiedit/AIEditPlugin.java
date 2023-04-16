package com.kwai.video.westeros.aiedit.AIEditPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.aiedit.AIEditSoLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.westeros.models.SalientData;
import com.kwai.video.westeros.aiedit.AIEditPlugin$OnSalientDataListender;
import java.lang.Exception;
import java.lang.Long;
import com.kwai.video.westeros.aiedit.AIEditPlugin$uploadStatsCallBack;

public class AIEditPlugin extends WesterosPlugin	// class@000e72
{
    public AIEditPlugin$uploadStatsCallBack mUploadStatsCallBack;
    public AIEditPlugin$OnSalientDataListender salientDataListender;

    static {
       AIEditSoLoader.loadNative();
    }
    public void AIEditPlugin(){
       super();
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, AIEditPlugin.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateAIEditPlugin();
    }
    public native final long nativeCreateAIEditPlugin();
    public native final void nativeDestroyAIEditPlugin(long p0);
    public native final void nativeSetCustomPara(String p0,long p1);
    public native final void nativeSetUploadStatsCallBack(long p0,String p1);
    public native final void nativeStartProvideSalientData(long p0);
    public native final void nativeStopProvideSalientData(long p0);
    public final void onSalientData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AIEditPlugin.class, "7")) {
          return;
       }
       if (this.salientDataListender != null) {
          try{
             SalientData salientData = (p0 != null)? SalientData.parseFrom(p0): null;
             this.salientDataListender.onSalientData(salientData);
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, AIEditPlugin.class, "2")) {
          return;
       }
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       AIEditPlugin uAIEditPlugi = AIEditPlugin.class;
       if (PatchProxy.isSupport(uAIEditPlugi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAIEditPlugi, "4")) {
          return;
       }
       this.nativeDestroyAIEditPlugin(p0);
       return;
    }
    public void setCustomPara(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AIEditPlugin.class, "8")) {
          return;
       }
       if (p0 != null && !p0.equals("")) {
          this.nativeSetCustomPara(p0, this.nativePlugin);
       }
       return;
    }
    public void setDevicePortraitInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AIEditPlugin.class, "1")) {
          return;
       }
       if (p0 != null && !p0.equals("")) {
          this.nativeSetCustomPara(p0, this.nativePlugin);
       }
       return;
    }
    public void setOnSalientDataListender(AIEditPlugin$OnSalientDataListender p0){
       this.salientDataListender = p0;
    }
    public void setUploadStatsCallBack(AIEditPlugin$uploadStatsCallBack p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AIEditPlugin.class, "9")) {
          return;
       }
       this.mUploadStatsCallBack = p0;
       this.nativeSetUploadStatsCallBack(this.nativePlugin, p1);
       return;
    }
    public void startProvideSalientData(){
       if (PatchProxy.applyVoid(null, this, AIEditPlugin.class, "5")) {
          return;
       }
       this.nativeStartProvideSalientData(this.nativePlugin);
       return;
    }
    public void stopProvideSalientData(){
       if (PatchProxy.applyVoid(null, this, AIEditPlugin.class, "6")) {
          return;
       }
       this.nativeStopProvideSalientData(this.nativePlugin);
       return;
    }
}
