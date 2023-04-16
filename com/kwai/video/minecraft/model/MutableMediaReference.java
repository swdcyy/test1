package com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class MutableMediaReference extends ModelBase implements MediaReference	// class@000a15
{
    public MinecraftModelDefine$MediaReferenceType concreteType;

    public void MutableMediaReference(){
       super();
    }
    public static native TimeRange native_availableRange(long p0);
    public static native MutableMediaReference native_clone(long p0);
    public static native String native_referenceId(long p0);
    public static native void native_setAvailableRange(long p0,TimeRange p1);
    public static native void native_setReferenceId(long p0,String p1);
    public TimeRange availableRange(){
       Object obj = PatchProxy.apply(null, this, MutableMediaReference.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableMediaReference.native_availableRange(this.nativeRef);
    }
    public MutableMediaReference clone(){
       Object obj = PatchProxy.apply(null, this, MutableMediaReference.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableMediaReference.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String referenceId(){
       Object obj = PatchProxy.apply(null, this, MutableMediaReference.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableMediaReference.native_referenceId(this.nativeRef);
    }
    public void setAvailableRange(TimeRange p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableMediaReference.class, "5")) {
          return;
       }
       MutableMediaReference.native_setAvailableRange(this.nativeRef, p0);
       return;
    }
    public void setReferenceId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableMediaReference.class, "4")) {
          return;
       }
       MutableMediaReference.native_setReferenceId(this.nativeRef, p0);
       return;
    }
}
