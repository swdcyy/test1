package com.kwai.video.minecraft.model.nano.Minecraft$AudioVideoReference;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$MediaReferenceType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public final class Minecraft$AudioVideoReference extends MutableMediaReference	// class@000a3c
{

    public void Minecraft$AudioVideoReference(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$MediaReferenceType.MediaReferenceType_AudioVideoReference;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AudioVideoReference(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$MediaReferenceType.MediaReferenceType_AudioVideoReference;
       NativeObjectManager.register(this, p0);
    }
    public static native int native_alphaInfo(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$AudioVideoReference native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$InputFileOptions native_fileOptions(long p0);
    public static native String native_filePath(long p0);
    public static native void native_setAlphaInfo(long p0,int p1);
    public static native void native_setFileOptions(long p0,Minecraft$InputFileOptions p1);
    public static native void native_setFilePath(long p0,String p1);
    public int alphaInfo(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVideoReference.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AudioVideoReference.native_alphaInfo(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AudioVideoReference.class, "1")) {
          return;
       }
       Minecraft$AudioVideoReference.native_clear(this.nativeRef);
       return;
    }
    public MutableMediaReference clone(){
       return this.clone();
    }
    public Minecraft$AudioVideoReference clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVideoReference.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioVideoReference.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$InputFileOptions fileOptions(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVideoReference.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioVideoReference.native_fileOptions(this.nativeRef);
    }
    public String filePath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVideoReference.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioVideoReference.native_filePath(this.nativeRef);
    }
    public native final long native_create();
    public void setAlphaInfo(int p0){
       Minecraft$AudioVideoReference uAudioVideoR = Minecraft$AudioVideoReference.class;
       if (PatchProxy.isSupport(uAudioVideoR) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioVideoR, "8")) {
          return;
       }
       Minecraft$AudioVideoReference.native_setAlphaInfo(this.nativeRef, p0);
       return;
    }
    public void setFileOptions(Minecraft$InputFileOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AudioVideoReference.class, "4")) {
          return;
       }
       Minecraft$AudioVideoReference.native_setFileOptions(this.nativeRef, p0);
       return;
    }
    public void setFilePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AudioVideoReference.class, "6")) {
          return;
       }
       Minecraft$AudioVideoReference.native_setFilePath(this.nativeRef, p0);
       return;
    }
}
