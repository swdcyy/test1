package com.kwai.video.westeros.v2.ycnn.YcnnPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.v2.ycnn.YcnnSoLoader;
import zz7.a;
import java.lang.Boolean;
import com.kuaishou.android.security.KSecurity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$OnYcnnModelLoadFinishListener;
import com.kwai.video.westeros.models.SalientData;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$OnSalientDataListender;
import java.lang.Exception;
import com.kwai.video.westeros.models.YcnnFaceAttributeResult;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$OnYcnnFaceAttributeDetectionListener;
import java.io.IOException;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$OnYcnnGeneralRecogDetectionListener;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$postReportCallback;
import java.lang.Integer;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$uploadStatsCallBack;

public class YcnnPlugin extends WesterosPlugin	// class@0010f4
{
    public YcnnPlugin$postReportCallback mPostReportCallback;
    public YcnnPlugin$uploadStatsCallBack mUploadStatsCallBack;
    public YcnnPlugin$OnSalientDataListender salientDataListender;
    public YcnnPlugin$OnYcnnFaceAttributeDetectionListener ycnnFaceAttrDetectionListener;
    public YcnnPlugin$OnYcnnGeneralRecogDetectionListener ycnnGeneralRecogDetectionListener;
    public YcnnPlugin$OnYcnnModelLoadFinishListener ycnnModelLoadFinishListener;

    static {
       YcnnSoLoader.loadNative();
    }
    public void YcnnPlugin(){
       super();
       long kSBridgeFunc = (!a.b.booleanValue())? KSecurity.getKSBridgeFuncAddr(): 0;
       this.nativeSetSecurityFuncHandle(kSBridgeFunc, this.nativePlugin);
       return;
    }
    public void YcnnPlugin(boolean p0){
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
       Object obj = PatchProxy.apply(null, this, YcnnPlugin.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeCollectPerfData(this.nativePlugin);
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, YcnnPlugin.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateYcnnPlugin();
    }
    public void enablePerfMonitor(boolean p0){
       YcnnPlugin ycnnPlugin = YcnnPlugin.class;
       if (PatchProxy.isSupport(ycnnPlugin) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ycnnPlugin, "18")) {
          return;
       }
       this.nativeEnablePerfMonitor(p0, this.nativePlugin);
       return;
    }
    public native final String nativeCollectPerfData(long p0);
    public native final long nativeCreateYcnnPlugin();
    public native final void nativeDestroyYcnnPlugin(long p0);
    public native final void nativeEnablePerfMonitor(boolean p0,long p1);
    public native final void nativeSetOnYcnnModelLoadFinish(long p0);
    public native final void nativeSetParamInfo(String p0,long p1);
    public native final void nativeSetSecurityFuncHandle(long p0,long p1);
    public native final void nativeSetUploadStatsCallBack(long p0,String p1);
    public native final void nativeStartProvideFaceAttributeData(long p0);
    public native final void nativeStartProvideGeneralRecogData(long p0,String p1);
    public native final void nativeStartProvideSalientData(long p0);
    public native final void nativeStopProvideFaceAttributeData(long p0);
    public native final void nativeStopProvideGeneralRecogData(long p0);
    public native final void nativeStopProvideSalientData(long p0);
    public final void onModelLoadFinish(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "20")) {
          return;
       }
       YcnnPlugin tycnnModelLo = this.ycnnModelLoadFinishListener;
       if (tycnnModelLo != null) {
          tycnnModelLo.OnYcnnModelLoadFinish(p0);
       }
       return;
    }
    public final void onSalientData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "12")) {
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
    public final void onYcnnFaceAttributeResult(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "14")) {
          return;
       }
       if (this.ycnnFaceAttrDetectionListener != null) {
          try{
             YcnnFaceAttributeResult ycnnFaceAttr = (p0 != null)? YcnnFaceAttributeResult.parseFrom(p0): null;
             this.ycnnFaceAttrDetectionListener.OnYcnnFaceAttributeDetectionResult(ycnnFaceAttr);
          }catch(com.google.protobuf.InvalidProtocolBufferException e3){
             e3.printStackTrace();
          }
       }
    }
    public final void onYcnnGeneralRecogResult(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "13")) {
          return;
       }
       YcnnPlugin tycnnGeneral = this.ycnnGeneralRecogDetectionListener;
       if (tycnnGeneral != null) {
          try{
             tycnnGeneral.OnYcnnGeneralRecogDetectionResult(p0);
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, YcnnPlugin.class, "3")) {
          return;
       }
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       YcnnPlugin ycnnPlugin = YcnnPlugin.class;
       if (PatchProxy.isSupport(ycnnPlugin) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ycnnPlugin, "5")) {
          return;
       }
       this.nativeDestroyYcnnPlugin(p0);
       return;
    }
    public void setAttrLocalPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "15")) {
          return;
       }
       this.nativeSetParamInfo("{\"attr_local_path\":\""+p0+"\"}", this.nativePlugin);
       return;
    }
    public void setDevicePortraitInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "17")) {
          return;
       }
       this.nativeSetParamInfo("{\"device_portrait_info\":"+p0+"}", this.nativePlugin);
       return;
    }
    public void setOnSalientDataListender(YcnnPlugin$OnSalientDataListender p0){
       this.salientDataListender = p0;
    }
    public void setOnYcnnFaceAttributeDetectionListener(YcnnPlugin$OnYcnnFaceAttributeDetectionListener p0){
       this.ycnnFaceAttrDetectionListener = p0;
    }
    public void setOnYcnnGeneralRecogDetectionListener(YcnnPlugin$OnYcnnGeneralRecogDetectionListener p0){
       this.ycnnGeneralRecogDetectionListener = p0;
    }
    public void setOnYcnnModelLoadFinishListener(YcnnPlugin$OnYcnnModelLoadFinishListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "1")) {
          return;
       }
       this.ycnnModelLoadFinishListener = p0;
       this.nativeSetOnYcnnModelLoadFinish(this.nativePlugin);
       return;
    }
    public void setPostReportCallBack(YcnnPlugin$postReportCallback p0){
       this.mPostReportCallback = p0;
    }
    public void setSaveLogInfoPath(String p0,int p1){
       YcnnPlugin ycnnPlugin = YcnnPlugin.class;
       if (PatchProxy.isSupport(ycnnPlugin) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ycnnPlugin, "16")) {
          return;
       }
       this.nativeSetParamInfo("{\"save_loginfo_path\":\""+p0+"\",\"save_loginfo_mode\":"+p1+"}", this.nativePlugin);
       return;
    }
    public void setUploadStatsCallBack(YcnnPlugin$uploadStatsCallBack p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YcnnPlugin.class, "2")) {
          return;
       }
       this.mUploadStatsCallBack = p0;
       this.nativeSetUploadStatsCallBack(this.nativePlugin, p1);
       return;
    }
    public void setVisionPortraitInfo(String p0,String p1){
    }
    public void startProvideFaceAttribute(){
       if (PatchProxy.applyVoid(null, this, YcnnPlugin.class, "10")) {
          return;
       }
       this.nativeStartProvideFaceAttributeData(this.nativePlugin);
       return;
    }
    public void startProvideGeneralRecog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YcnnPlugin.class, "8")) {
          return;
       }
       this.nativeStartProvideGeneralRecogData(this.nativePlugin, p0);
       return;
    }
    public void startProvideSalientData(){
       if (PatchProxy.applyVoid(null, this, YcnnPlugin.class, "6")) {
          return;
       }
       this.nativeStartProvideSalientData(this.nativePlugin);
       return;
    }
    public void stopProvideFaceAttribute(){
       if (PatchProxy.applyVoid(null, this, YcnnPlugin.class, "11")) {
          return;
       }
       this.nativeStopProvideFaceAttributeData(this.nativePlugin);
       return;
    }
    public void stopProvideGeneralRecog(){
       if (PatchProxy.applyVoid(null, this, YcnnPlugin.class, "9")) {
          return;
       }
       this.nativeStopProvideGeneralRecogData(this.nativePlugin);
       return;
    }
    public void stopProvideSalientData(){
       if (PatchProxy.applyVoid(null, this, YcnnPlugin.class, "7")) {
          return;
       }
       this.nativeStopProvideSalientData(this.nativePlugin);
       return;
    }
}
