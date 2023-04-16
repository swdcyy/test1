package com.kwai.video.minecraft.model.nano.Minecraft$WesterosPathMap;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableMap;
import java.lang.Boolean;
import java.lang.Number;

public final class Minecraft$WesterosPathMap extends ModelBase	// class@000aa0
{

    public void Minecraft$WesterosPathMap(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosPathMap(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosPathMap native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setWesterosConfigMap(long p0,Map p1);
    public static native Map native_westerosConfigMap(long p0);
    public static native boolean native_westerosConfigMap_contains(long p0,String p1);
    public static native String native_westerosConfigMap_get(long p0,String p1);
    public static native int native_westerosConfigMap_size(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosPathMap.class, "1")) {
          return;
       }
       Minecraft$WesterosPathMap.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$WesterosPathMap clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosPathMap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosPathMap.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setWesterosConfigMap(ImmutableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosPathMap.class, "4")) {
          return;
       }
       Minecraft$WesterosPathMap.native_setWesterosConfigMap(this.nativeRef, p0.getMap());
       return;
    }
    public ImmutableMap westerosConfigMap(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosPathMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableMap(Minecraft$WesterosPathMap.native_westerosConfigMap(this.nativeRef));
    }
    public boolean westerosConfigMapContains(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Minecraft$WesterosPathMap.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$WesterosPathMap.native_westerosConfigMap_contains(this.nativeRef, p0);
    }
    public String westerosConfigMapGet(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Minecraft$WesterosPathMap.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosPathMap.native_westerosConfigMap_get(this.nativeRef, p0);
    }
    public int westerosConfigMapSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosPathMap.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosPathMap.native_westerosConfigMap_size(this.nativeRef);
    }
}
