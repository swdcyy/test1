package com.kwai.video.minecraft.model.MutableStack;
import com.kwai.video.minecraft.model.MutableComposable;
import com.kwai.video.minecraft.model.Stack;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.MutableTrack;
import com.kwai.video.minecraft.model.ErrorStatus;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.editorsdk2.model.MutableArray;
import java.util.Collection;
import com.kwai.video.minecraft.model.Composable;
import java.lang.Integer;

public class MutableStack extends MutableItem implements MutableComposable, Stack	// class@000a16
{
    public MinecraftModelDefine$StackType concreteType;

    public void MutableStack(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void MutableStack(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native boolean native_appendTrack(long p0,MutableTrack p1,ErrorStatus p2);
    public static native void native_clearAllChildren(long p0);
    public static native MutableStack native_clone(long p0);
    public static native boolean native_deleteTrack(long p0,String p1,ErrorStatus p2);
    public static native void native_destroy(long p0);
    public static native ArrayList native_getMutableTracks(long p0);
    public static native boolean native_insertTrack(long p0,MutableTrack p1,int p2,ErrorStatus p3);
    public static native ArrayList native_mutableChildren(long p0);
    public static native boolean native_replaceTrack(long p0,MutableTrack p1,String p2,ErrorStatus p3);
    public static native void native_setStackId(long p0,String p1);
    public static native boolean native_setTrack(long p0,MutableTrack p1,int p2,ErrorStatus p3);
    public static native String native_stackId(long p0);
    public boolean appendTrack(MutableTrack p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableStack.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableStack.native_appendTrack(this.nativeRef, p0, p1);
    }
    public ImmutableArray children(){
       Object obj = PatchProxy.apply(null, this, MutableStack.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(new ArrayList(this.mutableChildren().mutableCopy()), Composable.class);
    }
    public void clearAllChildren(){
       if (PatchProxy.applyVoid(null, this, MutableStack.class, "11")) {
          return;
       }
       MutableStack.native_clearAllChildren(this.nativeRef);
       return;
    }
    public MutableStack clone(){
       Object obj = PatchProxy.apply(null, this, MutableStack.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableStack.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean deleteTrack(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableStack.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableStack.native_deleteTrack(this.nativeRef, p0, p1);
    }
    public ImmutableArray getMutableTracks(){
       Object obj = PatchProxy.apply(null, this, MutableStack.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableStack.native_getMutableTracks(this.nativeRef), MutableTrack.class);
    }
    public boolean insertTrack(MutableTrack p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableStack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableStack.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableStack.native_insertTrack(this.nativeRef, p0, p1, p2);
    }
    public ImmutableArray mutableChildren(){
       Object obj = PatchProxy.apply(null, this, MutableStack.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableStack.native_mutableChildren(this.nativeRef), MutableComposable.class);
    }
    public native final long native_create();
    public boolean replaceTrack(MutableTrack p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableStack.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableStack.native_replaceTrack(this.nativeRef, p0, p1, p2);
    }
    public void setStackId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableStack.class, "3")) {
          return;
       }
       MutableStack.native_setStackId(this.nativeRef, p0);
       return;
    }
    public boolean setTrack(MutableTrack p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableStack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableStack.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableStack.native_setTrack(this.nativeRef, p0, p1, p2);
    }
    public String stackId(){
       Object obj = PatchProxy.apply(null, this, MutableStack.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableStack.native_stackId(this.nativeRef);
    }
}
