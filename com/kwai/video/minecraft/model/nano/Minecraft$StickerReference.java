package com.kwai.video.minecraft.model.nano.Minecraft$StickerReference;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$MediaReferenceType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$AnimatedImageSlice;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$StickerReference extends MutableMediaReference	// class@000a75
{

    public void Minecraft$StickerReference(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$MediaReferenceType.MediaReferenceType_StickerReference;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$StickerReference(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$MediaReferenceType.MediaReferenceType_StickerReference;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_assetPath(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$StickerReference native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$InputFileOptions native_fileDecodeOptions(long p0);
    public static native ArrayList native_imageSlices(long p0);
    public static native void native_setAssetPath(long p0,String p1);
    public static native void native_setFileDecodeOptions(long p0,Minecraft$InputFileOptions p1);
    public static native void native_setImageSlices(long p0,ArrayList p1);
    public String assetPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$StickerReference.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$StickerReference.native_assetPath(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$StickerReference.class, "1")) {
          return;
       }
       Minecraft$StickerReference.native_clear(this.nativeRef);
       return;
    }
    public MutableMediaReference clone(){
       return this.clone();
    }
    public Minecraft$StickerReference clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$StickerReference.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$StickerReference.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$InputFileOptions fileDecodeOptions(){
       Object obj = PatchProxy.apply(null, this, Minecraft$StickerReference.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$StickerReference.native_fileDecodeOptions(this.nativeRef);
    }
    public ImmutableArray imageSlices(){
       Object obj = PatchProxy.apply(null, this, Minecraft$StickerReference.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$StickerReference.native_imageSlices(this.nativeRef), Minecraft$AnimatedImageSlice.class);
    }
    public native final long native_create();
    public void setAssetPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$StickerReference.class, "4")) {
          return;
       }
       Minecraft$StickerReference.native_setAssetPath(this.nativeRef, p0);
       return;
    }
    public void setFileDecodeOptions(Minecraft$InputFileOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$StickerReference.class, "9")) {
          return;
       }
       Minecraft$StickerReference.native_setFileDecodeOptions(this.nativeRef, p0);
       return;
    }
    public void setImageSlices(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$StickerReference.class, "6")) {
          return;
       }
       Minecraft$StickerReference.native_setImageSlices(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setImageSlices(Minecraft$AnimatedImageSlice[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$StickerReference.class, "7")) {
          return;
       }
       Minecraft$StickerReference.native_setImageSlices(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
}
