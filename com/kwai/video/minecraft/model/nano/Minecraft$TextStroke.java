package com.kwai.video.minecraft.model.nano.Minecraft$TextStroke;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class Minecraft$TextStroke extends ModelBase	// class@000a80
{

    public void Minecraft$TextStroke(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TextStroke(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TextStroke native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setColor(long p0,int p1);
    public static native void native_setWidth(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TextStroke.class, "1")) {
          return;
       }
       Minecraft$TextStroke.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TextStroke clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TextStroke.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TextStroke.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setColor(int p0){
       Minecraft$TextStroke textStroke = Minecraft$TextStroke.class;
       if (PatchProxy.isSupport(textStroke) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textStroke, "3")) {
          return;
       }
       Minecraft$TextStroke.native_setColor(this.nativeRef, p0);
       return;
    }
    public void setWidth(int p0){
       Minecraft$TextStroke textStroke = Minecraft$TextStroke.class;
       if (PatchProxy.isSupport(textStroke) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textStroke, "4")) {
          return;
       }
       Minecraft$TextStroke.native_setWidth(this.nativeRef, p0);
       return;
    }
}
