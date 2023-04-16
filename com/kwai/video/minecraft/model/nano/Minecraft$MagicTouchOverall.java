package com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchOverall;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchPoint;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Integer;
import java.lang.Number;

public final class Minecraft$MagicTouchOverall extends ModelBase	// class@000a5d
{

    public void Minecraft$MagicTouchOverall(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$MagicTouchOverall(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$MagicTouchOverall native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native ArrayList native_points(long p0);
    public static native Minecraft$Range native_range(long p0);
    public static native void native_setPoints(long p0,ArrayList p1);
    public static native void native_setRange(long p0,Minecraft$Range p1);
    public static native void native_setTouchFilter(long p0,int p1);
    public static native int native_touchFilter(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$MagicTouchOverall.class, "1")) {
          return;
       }
       Minecraft$MagicTouchOverall.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$MagicTouchOverall clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchOverall.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$MagicTouchOverall.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public ImmutableArray points(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchOverall.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$MagicTouchOverall.native_points(this.nativeRef), Minecraft$MagicTouchPoint.class);
    }
    public Minecraft$Range range(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchOverall.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$MagicTouchOverall.native_range(this.nativeRef);
    }
    public void setPoints(Minecraft$MagicTouchPoint[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$MagicTouchOverall.class, "8")) {
          return;
       }
       Minecraft$MagicTouchOverall.native_setPoints(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$MagicTouchOverall.class, "6")) {
          return;
       }
       Minecraft$MagicTouchOverall.native_setRange(this.nativeRef, p0);
       return;
    }
    public void setTouchFilter(int p0){
       Minecraft$MagicTouchOverall magicTouchOv = Minecraft$MagicTouchOverall.class;
       if (PatchProxy.isSupport(magicTouchOv) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, magicTouchOv, "4")) {
          return;
       }
       Minecraft$MagicTouchOverall.native_setTouchFilter(this.nativeRef, p0);
       return;
    }
    public int touchFilter(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchOverall.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$MagicTouchOverall.native_touchFilter(this.nativeRef);
    }
}
