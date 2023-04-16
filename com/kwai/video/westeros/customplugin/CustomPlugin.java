package com.kwai.video.westeros.customplugin.CustomPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.westeros.customplugin.FaceActionConfig;
import com.kwai.video.westeros.customplugin.FacePropConfig;
import java.lang.Long;
import com.kwai.video.westeros.models.ResourceType;
import com.kwai.video.westeros.models.YcnnResourceType;
import com.kwai.camerasdk.models.FaceDetectConfig;
import com.google.protobuf.AbstractMessageLite;

public class CustomPlugin extends WesterosPlugin	// class@000e75
{

    static {
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("customplugin");
    }
    public void CustomPlugin(){
       super();
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, CustomPlugin.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateCustomPlugin();
    }
    public native final long nativeCreateCustomPlugin();
    public native final void nativeDestroyCustomPlugin(long p0);
    public native final void nativeStartConsume(long p0,long p1);
    public native final void nativeStartConsumeYcnn(long p0,long p1);
    public native final void nativeStopConsume(long p0,long p1);
    public native final void nativeStopConsumeYcnn(long p0,long p1);
    public native final void nativeUpdateFaceActionConfig(long p0,FaceActionConfig p1);
    public native final void nativeUpdateFaceDetectConfig(long p0,byte[] p1);
    public native final void nativeUpdateFacePropConfig(long p0,FacePropConfig p1);
    public void release(){
       if (PatchProxy.applyVoid(null, this, CustomPlugin.class, "1")) {
          return;
       }
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       CustomPlugin uCustomPlugi = CustomPlugin.class;
       if (PatchProxy.isSupport(uCustomPlugi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uCustomPlugi, "3")) {
          return;
       }
       this.nativeDestroyCustomPlugin(p0);
       return;
    }
    public void startConsume(ResourceType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomPlugin.class, "4")) {
          return;
       }
       this.nativeStartConsume(this.nativePlugin, (long)p0.getNumber());
       return;
    }
    public void startConsumeYcnn(YcnnResourceType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomPlugin.class, "9")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       this.nativeStartConsumeYcnn(this.nativePlugin, (long)p0.getNumber());
       return;
    }
    public void stopConsume(ResourceType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomPlugin.class, "5")) {
          return;
       }
       this.nativeStopConsume(this.nativePlugin, (long)p0.getNumber());
       return;
    }
    public void stopConsumeYcnn(YcnnResourceType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomPlugin.class, "10")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       this.nativeStopConsumeYcnn(this.nativePlugin, (long)p0.getNumber());
       return;
    }
    public void updateFaceActionConfig(FaceActionConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomPlugin.class, "8")) {
          return;
       }
       if (!this.isReleased() && p0 != null) {
          this.nativeUpdateFaceActionConfig(this.nativePlugin, p0);
       }
       return;
    }
    public void updateFaceDetectConfig(FaceDetectConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomPlugin.class, "7")) {
          return;
       }
       if (!this.isReleased() && p0 != null) {
          this.nativeUpdateFaceDetectConfig(this.nativePlugin, p0.toByteArray());
       }
       return;
    }
    public void updateFacePropConfig(FacePropConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomPlugin.class, "6")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       this.nativeUpdateFacePropConfig(this.nativePlugin, p0);
       return;
    }
}
