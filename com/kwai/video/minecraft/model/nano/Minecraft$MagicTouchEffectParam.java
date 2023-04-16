package com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchEffectParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$TouchEffectParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchOverall;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.video.editorsdk2.model.ImmutableArray;

public final class Minecraft$MagicTouchEffectParam extends MutableEffect	// class@000a5c
{

    public void Minecraft$MagicTouchEffectParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_MagicTouchEffectParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$MagicTouchEffectParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_MagicTouchEffectParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$MagicTouchEffectParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setTouchData(long p0,ArrayList p1);
    public static native void native_setTouchEffect(long p0,Minecraft$TouchEffectParam p1);
    public static native ArrayList native_touchData(long p0);
    public static native Minecraft$TouchEffectParam native_touchEffect(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$MagicTouchEffectParam.class, "1")) {
          return;
       }
       Minecraft$MagicTouchEffectParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$MagicTouchEffectParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchEffectParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$MagicTouchEffectParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setTouchData(Minecraft$MagicTouchOverall[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$MagicTouchEffectParam.class, "6")) {
          return;
       }
       Minecraft$MagicTouchEffectParam.native_setTouchData(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setTouchEffect(Minecraft$TouchEffectParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$MagicTouchEffectParam.class, "4")) {
          return;
       }
       Minecraft$MagicTouchEffectParam.native_setTouchEffect(this.nativeRef, p0);
       return;
    }
    public ImmutableArray touchData(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchEffectParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$MagicTouchEffectParam.native_touchData(this.nativeRef), Minecraft$MagicTouchOverall.class);
    }
    public Minecraft$TouchEffectParam touchEffect(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchEffectParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$MagicTouchEffectParam.native_touchEffect(this.nativeRef);
    }
}
