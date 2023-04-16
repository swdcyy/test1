package com.kwai.video.minecraft.model.nano.Minecraft$KSTextBox;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$KSTextBound;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$KSTextBox extends ModelBase	// class@000a59
{

    public void Minecraft$KSTextBox(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$KSTextBox(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$KSTextBox native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$KSTextBound native_outerBound(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$KSTextBox.class, "1")) {
          return;
       }
       Minecraft$KSTextBox.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$KSTextBox clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextBox.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextBox.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public Minecraft$KSTextBound outerBound(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextBox.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextBox.native_outerBound(this.nativeRef);
    }
}
