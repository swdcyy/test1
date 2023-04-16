package com.kwai.video.minecraft.model.nano.Minecraft$TimelineConfig;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;

public final class Minecraft$TimelineConfig extends ModelBase	// class@000a86
{

    public void Minecraft$TimelineConfig(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TimelineConfig(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TimelineConfig native_clone(long p0);
    public static native int native_decoderTickMethod(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_enableTextCompatible(long p0);
    public static native int native_renderMode(long p0);
    public static native void native_setDecoderTickMethod(long p0,int p1);
    public static native void native_setDisableSubtitleAttributeOverride(long p0,boolean p1);
    public static native void native_setDisableSubtitleAutoWrap(long p0,boolean p1);
    public static native void native_setEnableTextCompatible(long p0,boolean p1);
    public static native void native_setSubtitleRangeRatio(long p0,double p1);
    public static native void native_setTimelineFpsCalculateMethod(long p0,int p1);
    public static native int native_timelineFpsCalculateMethod(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TimelineConfig.class, "1")) {
          return;
       }
       Minecraft$TimelineConfig.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TimelineConfig clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimelineConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimelineConfig.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int decoderTickMethod(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimelineConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TimelineConfig.native_decoderTickMethod(this.nativeRef);
    }
    public boolean enableTextCompatible(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimelineConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$TimelineConfig.native_enableTextCompatible(this.nativeRef);
    }
    public native final long native_create();
    public int renderMode(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimelineConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TimelineConfig.native_renderMode(this.nativeRef);
    }
    public void setDecoderTickMethod(int p0){
       Minecraft$TimelineConfig timelineConf = Minecraft$TimelineConfig.class;
       if (PatchProxy.isSupport(timelineConf) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timelineConf, "5")) {
          return;
       }
       Minecraft$TimelineConfig.native_setDecoderTickMethod(this.nativeRef, p0);
       return;
    }
    public void setDisableSubtitleAttributeOverride(boolean p0){
       Minecraft$TimelineConfig timelineConf = Minecraft$TimelineConfig.class;
       if (PatchProxy.isSupport(timelineConf) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, timelineConf, "10")) {
          return;
       }
       Minecraft$TimelineConfig.native_setDisableSubtitleAttributeOverride(this.nativeRef, p0);
       return;
    }
    public void setDisableSubtitleAutoWrap(boolean p0){
       Minecraft$TimelineConfig timelineConf = Minecraft$TimelineConfig.class;
       if (PatchProxy.isSupport(timelineConf) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, timelineConf, "8")) {
          return;
       }
       Minecraft$TimelineConfig.native_setDisableSubtitleAutoWrap(this.nativeRef, p0);
       return;
    }
    public void setEnableTextCompatible(boolean p0){
       Minecraft$TimelineConfig timelineConf = Minecraft$TimelineConfig.class;
       if (PatchProxy.isSupport(timelineConf) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, timelineConf, "12")) {
          return;
       }
       Minecraft$TimelineConfig.native_setEnableTextCompatible(this.nativeRef, p0);
       return;
    }
    public void setSubtitleRangeRatio(double p0){
       Minecraft$TimelineConfig timelineConf = Minecraft$TimelineConfig.class;
       if (PatchProxy.isSupport(timelineConf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, timelineConf, "9")) {
          return;
       }
       Minecraft$TimelineConfig.native_setSubtitleRangeRatio(this.nativeRef, p0);
       return;
    }
    public void setTimelineFpsCalculateMethod(int p0){
       Minecraft$TimelineConfig timelineConf = Minecraft$TimelineConfig.class;
       if (PatchProxy.isSupport(timelineConf) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timelineConf, "7")) {
          return;
       }
       Minecraft$TimelineConfig.native_setTimelineFpsCalculateMethod(this.nativeRef, p0);
       return;
    }
    public int timelineFpsCalculateMethod(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimelineConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TimelineConfig.native_timelineFpsCalculateMethod(this.nativeRef);
    }
}
