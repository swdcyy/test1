package com.kwai.video.minecraft.model.nano.Minecraft$NestedStack;
import com.kwai.video.minecraft.model.MutableStack;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$StackType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$NestedStack extends MutableStack	// class@000a60
{

    public void Minecraft$NestedStack(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$StackType.StackType_NestedStack;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$NestedStack(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$StackType.StackType_NestedStack;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$NestedStack native_clone(long p0);
    private native long native_create();
    public static native void native_destroy(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$NestedStack.class, "1")) {
          return;
       }
       Minecraft$NestedStack.native_clear(this.nativeRef);
       return;
    }
    public MutableStack clone(){
       return this.clone();
    }
    public Minecraft$NestedStack clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$NestedStack.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$NestedStack.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
}
