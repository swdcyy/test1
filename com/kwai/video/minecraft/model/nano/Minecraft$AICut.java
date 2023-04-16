package com.kwai.video.minecraft.model.nano.Minecraft$AICut;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateAssetInfo;
import java.lang.String;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateSegmentInfo;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Long;

public final class Minecraft$AICut extends ModelBase	// class@000a30
{

    public void Minecraft$AICut(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AICut(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native ArrayList native_assetInfos(long p0);
    public static native Minecraft$TemplateAssetInfo native_assetInfos_getItem(long p0,int p1);
    public static native void native_assetInfos_setItem(long p0,int p1,Minecraft$TemplateAssetInfo p2);
    public static native void native_clear(long p0);
    public static native Minecraft$AICut native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native ArrayList native_segmentInfos(long p0);
    public static native void native_setAssetInfos(long p0,ArrayList p1);
    public static native void native_setProjectHeight(long p0,int p1);
    public static native void native_setProjectWidth(long p0,int p1);
    public static native void native_setRandomSeed(long p0,long p1);
    public static native void native_setSegmentInfos(long p0,ArrayList p1);
    public static native void native_setThemeId(long p0,String p1);
    public ImmutableArray assetInfos(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AICut.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$AICut.native_assetInfos(this.nativeRef), Minecraft$TemplateAssetInfo.class);
    }
    public Minecraft$TemplateAssetInfo assetInfos(int p0){
       Minecraft$AICut uAICut = Minecraft$AICut.class;
       if (PatchProxy.isSupport(uAICut)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAICut, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$AICut.native_assetInfos_getItem(this.nativeRef, p0);
    }
    public void assetInfosSetItem(int p0,Minecraft$TemplateAssetInfo p1){
       Minecraft$AICut uAICut = Minecraft$AICut.class;
       if (PatchProxy.isSupport(uAICut) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAICut, "9")) {
          return;
       }
       Minecraft$AICut.native_assetInfos_setItem(this.nativeRef, p0, p1);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AICut.class, "1")) {
          return;
       }
       Minecraft$AICut.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AICut clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AICut.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AICut.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public ImmutableArray segmentInfos(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AICut.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$AICut.native_segmentInfos(this.nativeRef), Minecraft$TemplateSegmentInfo.class);
    }
    public void setAssetInfos(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AICut.class, "6")) {
          return;
       }
       Minecraft$AICut.native_setAssetInfos(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setAssetInfos(Minecraft$TemplateAssetInfo[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AICut.class, "7")) {
          return;
       }
       Minecraft$AICut.native_setAssetInfos(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setProjectHeight(int p0){
       Minecraft$AICut uAICut = Minecraft$AICut.class;
       if (PatchProxy.isSupport(uAICut) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAICut, "13")) {
          return;
       }
       Minecraft$AICut.native_setProjectHeight(this.nativeRef, p0);
       return;
    }
    public void setProjectWidth(int p0){
       Minecraft$AICut uAICut = Minecraft$AICut.class;
       if (PatchProxy.isSupport(uAICut) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAICut, "12")) {
          return;
       }
       Minecraft$AICut.native_setProjectWidth(this.nativeRef, p0);
       return;
    }
    public void setRandomSeed(long p0){
       Minecraft$AICut uAICut = Minecraft$AICut.class;
       if (PatchProxy.isSupport(uAICut) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAICut, "11")) {
          return;
       }
       Minecraft$AICut.native_setRandomSeed(this.nativeRef, p0);
       return;
    }
    public void setSegmentInfos(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AICut.class, "4")) {
          return;
       }
       Minecraft$AICut.native_setSegmentInfos(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setThemeId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AICut.class, "10")) {
          return;
       }
       Minecraft$AICut.native_setThemeId(this.nativeRef, p0);
       return;
    }
}
