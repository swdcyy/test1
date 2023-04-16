package com.kwai.video.minecraft.model.MutableTransition;
import com.kwai.video.minecraft.model.MutableComposable;
import com.kwai.video.minecraft.model.Transition;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.RationalTime;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.MinecraftModelDefine$TransitionType;

public abstract class MutableTransition extends ModelBase implements MutableComposable, Transition	// class@000a1b
{
    public MinecraftModelDefine$TransitionType concreteType;

    public void MutableTransition(){
       super();
    }
    public static native Transition native_clone(long p0);
    public static native RationalTime native_duration(long p0,ErrorStatus p1);
    public static native RationalTime native_inOffset(long p0);
    public static native RationalTime native_outOffset(long p0);
    public static native void native_setInOffset(long p0,RationalTime p1);
    public static native void native_setOutOffset(long p0,RationalTime p1);
    public static native void native_setTransitionId(long p0,String p1);
    public static native String native_transitionId(long p0);
    public Transition clone(){
       Object obj = PatchProxy.apply(null, this, MutableTransition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransition.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public RationalTime duration(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTransition.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransition.native_duration(this.nativeRef, p0);
    }
    public MinecraftModelDefine$TransitionType getTransitionType(){
       return this.concreteType;
    }
    public RationalTime inOffset(){
       Object obj = PatchProxy.apply(null, this, MutableTransition.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransition.native_inOffset(this.nativeRef);
    }
    public RationalTime outOffset(){
       Object obj = PatchProxy.apply(null, this, MutableTransition.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransition.native_outOffset(this.nativeRef);
    }
    public void setInOffset(RationalTime p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTransition.class, "7")) {
          return;
       }
       MutableTransition.native_setInOffset(this.nativeRef, p0);
       return;
    }
    public void setOutOffset(RationalTime p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTransition.class, "8")) {
          return;
       }
       MutableTransition.native_setOutOffset(this.nativeRef, p0);
       return;
    }
    public void setTransitionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTransition.class, "6")) {
          return;
       }
       MutableTransition.native_setTransitionId(this.nativeRef, p0);
       return;
    }
    public String transitionId(){
       Object obj = PatchProxy.apply(null, this, MutableTransition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransition.native_transitionId(this.nativeRef);
    }
}
