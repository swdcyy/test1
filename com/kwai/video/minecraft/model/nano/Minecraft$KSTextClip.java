package com.kwai.video.minecraft.model.nano.Minecraft$KSTextClip;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$Shift;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Double;
import com.kwai.video.minecraft.model.nano.Minecraft$TextResource;

public final class Minecraft$KSTextClip extends MutableClip	// class@000a5a
{

    public void Minecraft$KSTextClip(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_KSTextClip;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$KSTextClip(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_KSTextClip;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$KSTextClip native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native String native_fontPath(long p0);
    public static native int native_offsetAlpha(long p0);
    public static native int native_offsetColor(long p0);
    public static native Minecraft$Shift native_offsetShift(long p0);
    public static native double native_scale(long p0);
    public static native void native_setFontId(long p0,String p1);
    public static native void native_setFontPath(long p0,String p1);
    public static native void native_setOffsetAlpha(long p0,int p1);
    public static native void native_setOffsetColor(long p0,int p1);
    public static native void native_setOffsetShift(long p0,Minecraft$Shift p1);
    public static native void native_setPropertyKeyFrames(long p0,ArrayList p1);
    public static native void native_setScale(long p0,double p1);
    public static native void native_setText(long p0,String p1);
    public static native void native_setTextResources(long p0,ArrayList p1);
    public static native String native_text(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$KSTextClip.class, "1")) {
          return;
       }
       Minecraft$KSTextClip.native_clear(this.nativeRef);
       return;
    }
    public MutableClip clone(){
       return this.clone();
    }
    public Minecraft$KSTextClip clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextClip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextClip.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String fontPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextClip.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextClip.native_fontPath(this.nativeRef);
    }
    public native final long native_create();
    public int offsetAlpha(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextClip.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$KSTextClip.native_offsetAlpha(this.nativeRef);
    }
    public int offsetColor(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextClip.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$KSTextClip.native_offsetColor(this.nativeRef);
    }
    public Minecraft$Shift offsetShift(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextClip.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextClip.native_offsetShift(this.nativeRef);
    }
    public double scale(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextClip.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$KSTextClip.native_scale(this.nativeRef);
    }
    public void setFontId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSTextClip.class, "5")) {
          return;
       }
       Minecraft$KSTextClip.native_setFontId(this.nativeRef, p0);
       return;
    }
    public void setFontPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSTextClip.class, "7")) {
          return;
       }
       Minecraft$KSTextClip.native_setFontPath(this.nativeRef, p0);
       return;
    }
    public void setOffsetAlpha(int p0){
       Minecraft$KSTextClip kSTextClip = Minecraft$KSTextClip.class;
       if (PatchProxy.isSupport(kSTextClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSTextClip, "13")) {
          return;
       }
       Minecraft$KSTextClip.native_setOffsetAlpha(this.nativeRef, p0);
       return;
    }
    public void setOffsetColor(int p0){
       Minecraft$KSTextClip kSTextClip = Minecraft$KSTextClip.class;
       if (PatchProxy.isSupport(kSTextClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSTextClip, "15")) {
          return;
       }
       Minecraft$KSTextClip.native_setOffsetColor(this.nativeRef, p0);
       return;
    }
    public void setOffsetShift(Minecraft$Shift p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSTextClip.class, "17")) {
          return;
       }
       Minecraft$KSTextClip.native_setOffsetShift(this.nativeRef, p0);
       return;
    }
    public void setPropertyKeyFrames(Minecraft$PropertyKeyFrame[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSTextClip.class, "11")) {
          return;
       }
       Minecraft$KSTextClip.native_setPropertyKeyFrames(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setScale(double p0){
       Minecraft$KSTextClip kSTextClip = Minecraft$KSTextClip.class;
       if (PatchProxy.isSupport(kSTextClip) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, kSTextClip, "9")) {
          return;
       }
       Minecraft$KSTextClip.native_setScale(this.nativeRef, p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSTextClip.class, "4")) {
          return;
       }
       Minecraft$KSTextClip.native_setText(this.nativeRef, p0);
       return;
    }
    public void setTextResources(Minecraft$TextResource[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSTextClip.class, "10")) {
          return;
       }
       Minecraft$KSTextClip.native_setTextResources(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public String text(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextClip.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextClip.native_text(this.nativeRef);
    }
}
