package com.kwai.video.westeros.v2.ykitplugin.YKitPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.v2.ykitplugin.YKitSoLoader;
import zz7.a;
import java.lang.Boolean;
import com.kuaishou.android.security.KSecurity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin$OnYKitModelLoadFinishListener;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin$postReportCallback;
import java.lang.Integer;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin$uploadStatsCallBack;

public class YKitPlugin extends WesterosPlugin	// class@0010fb
{
    public YKitPlugin$postReportCallback mPostReportCallback;
    public YKitPlugin$uploadStatsCallBack mUploadStatsCallBack;
    public YKitPlugin$OnYKitModelLoadFinishListener ykitModelLoadFinishListener;

    static {
       YKitSoLoader.loadNative();
    }
    public void YKitPlugin(){
       super();
       long kSBridgeFunc = (!a.b.booleanValue())? KSecurity.getKSBridgeFuncAddr(): 0;
       this.nativeSetSecurityFuncHandle(kSBridgeFunc, this.nativePlugin);
       return;
    }
    public void YKitPlugin(boolean p0){
       super();
       if (!p0) {
          long l = 0;
          if (!a.b.booleanValue()) {
             l = KSecurity.getKSBridgeFuncAddr();
          }
          this.nativeSetSecurityFuncHandle(l, this.nativePlugin);
       }
       return;
    }
    public String collectPerfData(){
       Object obj = PatchProxy.apply(null, this, YKitPlugin.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeCollectPerfData(this.nativePlugin);
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, YKitPlugin.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateYKitPlugin();
    }
    public void enablePerfMonitor(boolean p0){
       YKitPlugin yKitPlugin = YKitPlugin.class;
       if (PatchProxy.isSupport(yKitPlugin) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, yKitPlugin, "4")) {
          return;
       }
       this.nativeEnablePerfMonitor(p0, this.nativePlugin);
       return;
    }
    public native final String nativeCollectPerfData(long p0);
    public native final long nativeCreateYKitPlugin();
    public native final void nativeDestroyYKitPlugin(long p0);
    public native final void nativeEnablePerfMonitor(boolean p0,long p1);
    public native final void nativeSetOnYKitModelLoadFinish(long p0);
    public native final void nativeSetParamInfo(String p0,long p1);
    public native final void nativeSetPostReportCallback(long p0);
    public native final void nativeSetSecurityFuncHandle(long p0,long p1);
    public native final void nativeSetUploadStatsCallBack(long p0,String p1);
    public final void onModelLoadFinish(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YKitPlugin.class, "12")) {
          return;
       }
       YKitPlugin tykitModelLo = this.ykitModelLoadFinishListener;
       if (tykitModelLo != null) {
          tykitModelLo.OnYKitModelLoadFinish(p0);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, YKitPlugin.class, "6")) {
          return;
       }
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       YKitPlugin yKitPlugin = YKitPlugin.class;
       if (PatchProxy.isSupport(yKitPlugin) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, yKitPlugin, "8")) {
          return;
       }
       this.nativeDestroyYKitPlugin(p0);
       return;
    }
    public void setAttrLocalPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YKitPlugin.class, "9")) {
          return;
       }
       this.nativeSetParamInfo("{\"attr_local_path\":\""+p0+"\"}", this.nativePlugin);
       return;
    }
    public void setDevicePortraitInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YKitPlugin.class, "11")) {
          return;
       }
       this.nativeSetParamInfo("{\"device_portrait_info\":"+p0+"}", this.nativePlugin);
       return;
    }
    public void setOnYKitModelLoadFinishListener(YKitPlugin$OnYKitModelLoadFinishListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YKitPlugin.class, "1")) {
          return;
       }
       this.ykitModelLoadFinishListener = p0;
       this.nativeSetOnYKitModelLoadFinish(this.nativePlugin);
       return;
    }
    public void setPostReportCallBack(YKitPlugin$postReportCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YKitPlugin.class, "3")) {
          return;
       }
       this.mPostReportCallback = p0;
       this.nativeSetPostReportCallback(this.nativePlugin);
       return;
    }
    public void setSaveLogInfoPath(String p0,int p1){
       YKitPlugin yKitPlugin = YKitPlugin.class;
       if (PatchProxy.isSupport(yKitPlugin) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, yKitPlugin, "10")) {
          return;
       }
       this.nativeSetParamInfo("{\"save_loginfo_path\":\""+p0+"\",\"save_loginfo_mode\":"+p1+"}", this.nativePlugin);
       return;
    }
    public void setUploadStatsCallBack(YKitPlugin$uploadStatsCallBack p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YKitPlugin.class, "2")) {
          return;
       }
       this.mUploadStatsCallBack = p0;
       this.nativeSetUploadStatsCallBack(this.nativePlugin, p1);
       return;
    }
    public void setVisionPortraitInfo(String p0,String p1){
    }
}
