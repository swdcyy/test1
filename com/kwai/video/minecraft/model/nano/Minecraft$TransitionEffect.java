package com.kwai.video.minecraft.model.nano.Minecraft$TransitionEffect;
import com.kwai.video.minecraft.model.MutableTransition;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$TransitionType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.minecraft.model.Transition;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$TransitionEffect extends MutableTransition	// class@000a8c
{

    public void Minecraft$TransitionEffect(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$TransitionType.TransitionType_TransitionEffect;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TransitionEffect(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$TransitionType.TransitionType_TransitionEffect;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TransitionEffect native_clone(long p0);
    public static native void native_destroy(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TransitionEffect.class, "1")) {
          return;
       }
       Minecraft$TransitionEffect.native_clear(this.nativeRef);
       return;
    }
    public Transition clone(){
       return this.clone();
    }
    public Minecraft$TransitionEffect clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TransitionEffect.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TransitionEffect.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
}
