package com.kwai.video.minecraft.model.MutableTransitionModel;
import com.kwai.video.minecraft.model.TransitionModel;
import com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableTransition;
import com.kwai.video.minecraft.model.RationalTime;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MutableTransitionModel extends OverdueableImpl implements TransitionModel	// class@000a1c
{

    public void MutableTransitionModel(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void MutableTransitionModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native MutableTransitionModel native_clone(long p0);
    public static native MutableTransition native_cloneTransition(long p0,ErrorStatus p1);
    public static native void native_destroy(long p0);
    public static native RationalTime native_getDuration(long p0,ErrorStatus p1);
    public static native RationalTime native_getInOffset(long p0,ErrorStatus p1);
    public static native RationalTime native_getOutOffset(long p0,ErrorStatus p1);
    public static native String native_getTransitionId(long p0,ErrorStatus p1);
    public static native boolean native_setInOffset(long p0,RationalTime p1,ErrorStatus p2);
    public static native boolean native_setOutOffset(long p0,RationalTime p1,ErrorStatus p2);
    public MutableTransitionModel clone(){
       Object obj = PatchProxy.apply(null, this, MutableTransitionModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransitionModel.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public MutableTransition cloneTransition(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTransitionModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransitionModel.native_cloneTransition(this.nativeRef, p0);
    }
    public RationalTime getDuration(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTransitionModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransitionModel.native_getDuration(this.nativeRef, p0);
    }
    public RationalTime getInOffset(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTransitionModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransitionModel.native_getInOffset(this.nativeRef, p0);
    }
    public RationalTime getOutOffset(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTransitionModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransitionModel.native_getOutOffset(this.nativeRef, p0);
    }
    public String getTransitionId(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTransitionModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTransitionModel.native_getTransitionId(this.nativeRef, p0);
    }
    public native final long native_create();
    public boolean setInOffset(RationalTime p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTransitionModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTransitionModel.native_setInOffset(this.nativeRef, p0, p1);
    }
    public boolean setOutOffset(RationalTime p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTransitionModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTransitionModel.native_setOutOffset(this.nativeRef, p0, p1);
    }
}
