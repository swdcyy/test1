package com.kwai.video.minecraft.model.MutableExternalReference;
import com.kwai.video.minecraft.model.ExternalReference;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MutableExternalReference extends MutableMediaReference implements ExternalReference	// class@000a11
{

    public void MutableExternalReference(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void MutableExternalReference(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native MutableExternalReference native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setTargetURL(long p0,String p1);
    public static native String native_targetURL(long p0);
    public MutableExternalReference clone(){
       Object obj = PatchProxy.apply(null, this, MutableExternalReference.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableExternalReference.native_clone(this.nativeRef);
    }
    public MutableMediaReference clone(){
       return this.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setTargetURL(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableExternalReference.class, "3")) {
          return;
       }
       MutableExternalReference.native_setTargetURL(this.nativeRef, p0);
       return;
    }
    public String targetURL(){
       Object obj = PatchProxy.apply(null, this, MutableExternalReference.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableExternalReference.native_targetURL(this.nativeRef);
    }
}
