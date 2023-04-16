package com.kwai.video.minecraft.model.nano.Minecraft$TemplateSegmentInfo;
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
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$TemplateSegmentInfo extends ModelBase	// class@000a7b
{

    public void Minecraft$TemplateSegmentInfo(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TemplateSegmentInfo(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native ArrayList native_assetInfos(long p0);
    public static native Minecraft$TemplateAssetInfo native_assetInfos_getItem(long p0,int p1);
    public static native void native_assetInfos_setItem(long p0,int p1,Minecraft$TemplateAssetInfo p2);
    public static native String native_assetTag(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$TemplateSegmentInfo native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setAssetInfos(long p0,ArrayList p1);
    public static native void native_setAssetTag(long p0,String p1);
    public static native void native_setTextInfos(long p0,ArrayList p1);
    public ImmutableArray assetInfos(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateSegmentInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$TemplateSegmentInfo.native_assetInfos(this.nativeRef), Minecraft$TemplateAssetInfo.class);
    }
    public Minecraft$TemplateAssetInfo assetInfos(int p0){
       Minecraft$TemplateSegmentInfo templateSegm = Minecraft$TemplateSegmentInfo.class;
       if (PatchProxy.isSupport(templateSegm)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, templateSegm, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$TemplateSegmentInfo.native_assetInfos_getItem(this.nativeRef, p0);
    }
    public void assetInfosSetItem(int p0,Minecraft$TemplateAssetInfo p1){
       Minecraft$TemplateSegmentInfo templateSegm = Minecraft$TemplateSegmentInfo.class;
       if (PatchProxy.isSupport(templateSegm) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, templateSegm, "7")) {
          return;
       }
       Minecraft$TemplateSegmentInfo.native_assetInfos_setItem(this.nativeRef, p0, p1);
       return;
    }
    public String assetTag(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateSegmentInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateSegmentInfo.native_assetTag(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TemplateSegmentInfo.class, "1")) {
          return;
       }
       Minecraft$TemplateSegmentInfo.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TemplateSegmentInfo clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateSegmentInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateSegmentInfo.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setAssetInfos(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateSegmentInfo.class, "4")) {
          return;
       }
       Minecraft$TemplateSegmentInfo.native_setAssetInfos(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setAssetInfos(Minecraft$TemplateAssetInfo[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateSegmentInfo.class, "5")) {
          return;
       }
       Minecraft$TemplateSegmentInfo.native_setAssetInfos(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setAssetTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateSegmentInfo.class, "10")) {
          return;
       }
       Minecraft$TemplateSegmentInfo.native_setAssetTag(this.nativeRef, p0);
       return;
    }
    public void setTextInfos(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateSegmentInfo.class, "8")) {
          return;
       }
       Minecraft$TemplateSegmentInfo.native_setTextInfos(this.nativeRef, p0.getArrayList());
       return;
    }
}
