package com.kwai.video.minecraft.model.MutableGap;
import com.kwai.video.minecraft.model.Gap;
import com.kwai.video.minecraft.model.MutableComposable;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MutableGap extends MutableItem implements Gap, MutableComposable	// class@000a12
{

    public void MutableGap(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void MutableGap(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native MutableGap native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native String native_gapId(long p0);
    public static native void native_setGapId(long p0,String p1);
    public MutableGap clone(){
       Object obj = PatchProxy.apply(null, this, MutableGap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableGap.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String gapId(){
       Object obj = PatchProxy.apply(null, this, MutableGap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableGap.native_gapId(this.nativeRef);
    }
    public native final long native_create();
    public void setGapId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableGap.class, "3")) {
          return;
       }
       MutableGap.native_setGapId(this.nativeRef, p0);
       return;
    }
}
