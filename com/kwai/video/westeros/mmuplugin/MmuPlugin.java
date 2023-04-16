package com.kwai.video.westeros.mmuplugin.MmuPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.video.westeros.models.MmuFace;
import com.kwai.video.westeros.models.MmuResourceConfig;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.google.protobuf.AbstractMessageLite;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.video.westeros.models.MemojiResult;
import com.kwai.video.westeros.mmuplugin.MmuPlugin$OnMemojiDetectionListener;
import java.io.IOException;
import com.kwai.video.westeros.models.MmuFacePropResult;
import com.kwai.video.westeros.mmuplugin.MmuPlugin$OnMmuFacePropListener;
import com.kwai.video.westeros.mmuplugin.MmuPlugin$UploadStatsCallBack;
import java.lang.Long;
import com.kwai.video.westeros.models.MmuFeatureType;
import com.kwai.video.westeros.models.MmuFeatureParams;
import com.kwai.video.westeros.mmuplugin.MmuPlugin$postReportCallback;

public class MmuPlugin extends WesterosPlugin	// class@000e8c
{
    public Object listenerLock;
    public MmuPlugin$postReportCallback mPostReportCallback;
    public MmuPlugin$UploadStatsCallBack mUploadStatsCallBack;
    public MmuPlugin$OnMemojiDetectionListener memojiDetectionListener;
    public MmuPlugin$OnMmuFacePropListener mmuFacePropListener;
    public boolean mmuReleased;

    static {
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("tensorflow-lite");
       WesterosSoLoader.loadLibrary("ykit");
       WesterosSoLoader.loadLibrary("ykit_module");
       WesterosSoLoader.loadLibrary("ykit_module_plugin");
    }
    public void MmuPlugin(){
       super();
       this.listenerLock = new Object();
       this.mmuReleased = false;
    }
    public static Bitmap getFaceReplacedBitmap(Bitmap p0,MmuFace p1,MmuResourceConfig p2,Context p3){
       Bitmap obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, MmuPlugin.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null && p1.getPointsCount()) {
          if (!p2.getMmuModelPathCount()) {
             return obj;
          }else if(p2.getResourcePath() == null || !(p2.getResourcePath()).length()){
             ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(p0.getByteCount());
             p0.copyPixelsToBuffer(uByteBuffer);
             return MmuPlugin.nativeGetFaceReplacedBitmap(p0.getWidth(), p0.getHeight(), uByteBuffer, p1.toByteArray(), p2.toByteArray(), p3);
          }
       }
       return obj;
    }
    public static native Bitmap nativeGetFaceReplacedBitmap(int p0,int p1,ByteBuffer p2,byte[] p3,byte[] p4,Object p5);
    public String collectPerfData(){
       Object obj = PatchProxy.apply(null, this, MmuPlugin.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeCollectPerfData(this.nativePlugin);
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, MmuPlugin.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateMmuPlugin();
    }
    public void enablePerfMonitor(boolean p0){
       MmuPlugin mmuPlugin = MmuPlugin.class;
       if (PatchProxy.isSupport(mmuPlugin) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mmuPlugin, "6")) {
          return;
       }
       this.nativeEnablePerfMonitor(p0, this.nativePlugin);
       return;
    }
    public boolean isReleased(){
       return this.mmuReleased;
    }
    public native final String nativeCollectPerfData(long p0);
    public native final long nativeCreateMmuPlugin();
    public native final void nativeDestroyMmuPlugin(long p0);
    public native final void nativeEnablePerfMonitor(boolean p0,long p1);
    public native final void nativeSetFeatureEnabled(long p0,int p1,boolean p2,byte[] p3);
    public native final void nativeSetUploadStatsCallBack(long p0,String p1);
    public final void onMemojiDetectResult(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MmuPlugin.class, "9")) {
          return;
       }
       MmuPlugin tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       if (this.memojiDetectionListener != null) {
          try{
             MemojiResult memojiResult = (p0 != null)? MemojiResult.parseFrom(p0): null;
             this.memojiDetectionListener.onMemojiDetectionResult(memojiResult);
          }catch(com.google.protobuf.InvalidProtocolBufferException e3){
             e3.printStackTrace();
          }
       }
    }
    public final void onMmuFacePropResult(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MmuPlugin.class, "11")) {
          return;
       }
       MmuPlugin tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       if (this.mmuFacePropListener != null) {
          try{
             MmuFacePropResult mmuFacePropR = (p0 != null)? MmuFacePropResult.parseFrom(p0): null;
             this.mmuFacePropListener.onMmuFacePropResult(mmuFacePropR);
          }catch(com.google.protobuf.InvalidProtocolBufferException e3){
             e3.printStackTrace();
          }
       }
    }
    public final void onUploadStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MmuPlugin.class, "10")) {
          return;
       }
       if (!this.isReleased()) {
          MmuPlugin tmUploadStat = this.mUploadStatsCallBack;
          if (tmUploadStat != null) {
             tmUploadStat.uploadStats(p0);
          }
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, MmuPlugin.class, "12")) {
          return;
       }
       super.release();
       this.mmuReleased = true;
       return;
    }
    public void releaseNativePlugin(long p0){
       MmuPlugin mmuPlugin = MmuPlugin.class;
       if (PatchProxy.isSupport(mmuPlugin) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, mmuPlugin, "14")) {
          return;
       }
       this.nativeDestroyMmuPlugin(p0);
       return;
    }
    public void setDevicePortraitInfo(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, MmuPlugin.class, "5");
    }
    public void setFeatureEnabled(MmuFeatureType p0,boolean p1){
       MmuPlugin mmuPlugin = MmuPlugin.class;
       if (PatchProxy.isSupport(mmuPlugin) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, mmuPlugin, "1")) {
          return;
       }
       if (!this.isReleased()) {
          this.setFeatureEnabled(p0, p1, null);
       }
       return;
    }
    public void setFeatureEnabled(MmuFeatureType p0,boolean p1,MmuFeatureParams p2){
       int this;
       if (PatchProxy.isSupport(MmuPlugin.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, MmuPlugin.class, "2")) {
          return;
       }
       if (!this.isReleased()) {
          WesterosPlugin tnativePlugi = this.nativePlugin;
          this = p0.getNumber();
          byte[] uobyteArray = (p2 != null)? p2.toByteArray(): 0;
          this.nativeSetFeatureEnabled(tnativePlugi, this, p1, uobyteArray);
       }
       return;
    }
    public void setOnMemojiDetectionListener(MmuPlugin$OnMemojiDetectionListener p0){
       MmuPlugin tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       this.memojiDetectionListener = p0;
       _monitor_exit(tlistenerLoc);
    }
    public void setOnMmuFacePropListener(MmuPlugin$OnMmuFacePropListener p0){
       MmuPlugin tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       this.mmuFacePropListener = p0;
       _monitor_exit(tlistenerLoc);
    }
    public void setPostReportCallBack(MmuPlugin$postReportCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MmuPlugin.class, "4")) {
          return;
       }
       if (!this.isReleased()) {
          this.mPostReportCallback = p0;
       }
       return;
    }
    public void setUploadStatsCallBack(MmuPlugin$UploadStatsCallBack p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MmuPlugin.class, "3")) {
          return;
       }
       if (!this.isReleased()) {
          this.mUploadStatsCallBack = p0;
          this.nativeSetUploadStatsCallBack(this.nativePlugin, p1);
       }
       return;
    }
}
