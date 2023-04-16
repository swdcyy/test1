package com.kwai.video.westeros.v2.yar.YarPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.video.westeros.v2.yar.YarPlugin$postReportCallback;
import com.kwai.video.westeros.v2.yar.YarPlugin$uploadStatsCallBack;

public class YarPlugin extends WesterosPlugin	// class@0010ed
{
    public YarPlugin$postReportCallback mPostReportCallback;
    public YarPlugin$uploadStatsCallBack mUploadStatsCallBack;

    static {
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("tensorflow-lite");
       WesterosSoLoader.loadLibrary("ykit");
       WesterosSoLoader.loadLibrary("ykit_module");
       WesterosSoLoader.loadLibrary("ykit_module_plugin");
    }
    public void YarPlugin(){
       super();
    }
    public String collectPerfData(){
       Object obj = PatchProxy.apply(null, this, YarPlugin.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeCollectPerfData(this.nativePlugin);
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, YarPlugin.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateYarPlugin();
    }
    public void enablePerfMonitor(boolean p0){
       YarPlugin yarPlugin = YarPlugin.class;
       if (PatchProxy.isSupport(yarPlugin) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, yarPlugin, "6")) {
          return;
       }
       this.nativeEnablePerfMonitor(p0, this.nativePlugin);
       return;
    }
    public native final String nativeCollectPerfData(long p0);
    public native final long nativeCreateYarPlugin();
    public native final void nativeDestroyYarPlugin(long p0);
    public native final void nativeEnablePerfMonitor(boolean p0,long p1);
    public native final void nativeSetUploadStatsCallBack(long p0,String p1);
    public void release(){
       if (PatchProxy.applyVoid(null, this, YarPlugin.class, "1")) {
          return;
       }
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       YarPlugin yarPlugin = YarPlugin.class;
       if (PatchProxy.isSupport(yarPlugin) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, yarPlugin, "3")) {
          return;
       }
       this.nativeDestroyYarPlugin(p0);
       return;
    }
    public void setDevicePortraitInfo(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, YarPlugin.class, "5");
    }
    public void setPostReportCallBack(YarPlugin$postReportCallback p0){
       this.mPostReportCallback = p0;
    }
    public void setUploadStatsCallBack(YarPlugin$uploadStatsCallBack p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YarPlugin.class, "4")) {
          return;
       }
       this.mUploadStatsCallBack = p0;
       this.nativeSetUploadStatsCallBack(this.nativePlugin, p1);
       return;
    }
}
