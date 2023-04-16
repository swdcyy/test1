package com.kwai.video.minecraft.model.nano.Minecraft$TemplateReference;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$MediaReferenceType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.nano.Minecraft$AlbumPhotos;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Integer;
import com.kwai.video.editorsdk2.model.ImmutableMap;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;

public final class Minecraft$TemplateReference extends MutableMediaReference	// class@000a7a
{

    public void Minecraft$TemplateReference(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$MediaReferenceType.MediaReferenceType_TemplateReference;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TemplateReference(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$MediaReferenceType.MediaReferenceType_TemplateReference;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TemplateReference native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setAlbumPhtots(long p0,ArrayList p1);
    public static native void native_setAssetsDirectory(long p0,String p1);
    public static native void native_setEncryptedMethod(long p0,int p1);
    public static native void native_setRenderOrderMap(long p0,Map p1);
    public static native void native_setVisibleTimes(long p0,ArrayList p1);
    public static native ArrayList native_visibleTimes(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TemplateReference.class, "1")) {
          return;
       }
       Minecraft$TemplateReference.native_clear(this.nativeRef);
       return;
    }
    public MutableMediaReference clone(){
       return this.clone();
    }
    public Minecraft$TemplateReference clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateReference.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateReference.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setAlbumPhtots(Minecraft$AlbumPhotos[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateReference.class, "5")) {
          return;
       }
       Minecraft$TemplateReference.native_setAlbumPhtots(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setAssetsDirectory(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateReference.class, "3")) {
          return;
       }
       Minecraft$TemplateReference.native_setAssetsDirectory(this.nativeRef, p0);
       return;
    }
    public void setEncryptedMethod(int p0){
       Minecraft$TemplateReference templateRefe = Minecraft$TemplateReference.class;
       if (PatchProxy.isSupport(templateRefe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, templateRefe, "4")) {
          return;
       }
       Minecraft$TemplateReference.native_setEncryptedMethod(this.nativeRef, p0);
       return;
    }
    public void setRenderOrderMap(ImmutableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateReference.class, "8")) {
          return;
       }
       Minecraft$TemplateReference.native_setRenderOrderMap(this.nativeRef, p0.getMap());
       return;
    }
    public void setVisibleTimes(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateReference.class, "7")) {
          return;
       }
       Minecraft$TemplateReference.native_setVisibleTimes(this.nativeRef, p0.getArrayList());
       return;
    }
    public ImmutableArray visibleTimes(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateReference.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$TemplateReference.native_visibleTimes(this.nativeRef), Minecraft$Range.class);
    }
}
