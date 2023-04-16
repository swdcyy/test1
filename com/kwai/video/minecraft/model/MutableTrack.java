package com.kwai.video.minecraft.model.MutableTrack;
import com.kwai.video.minecraft.model.Track;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableGap;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.MutableTransition;
import java.util.Set;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.editorsdk2.model.MutableArray;
import java.util.Collection;
import com.kwai.video.minecraft.model.Composable;
import java.lang.Integer;
import com.kwai.video.minecraft.model.MutableComposable;

public class MutableTrack extends MutableItem implements Track	// class@000a19
{

    public void MutableTrack(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void MutableTrack(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native boolean native_appendClip(long p0,MutableClip p1,ErrorStatus p2);
    public static native boolean native_appendGap(long p0,MutableGap p1,ErrorStatus p2);
    public static native void native_clearAllChildren(long p0);
    public static native MutableTrack native_clone(long p0);
    public static native boolean native_deleteClip(long p0,String p1,ErrorStatus p2);
    public static native boolean native_deleteGap(long p0,String p1,ErrorStatus p2);
    public static native boolean native_deleteTransition(long p0,String p1,ErrorStatus p2);
    public static native void native_destroy(long p0);
    public static native ArrayList native_getMutableClips(long p0);
    public static native boolean native_insertClip(long p0,MutableClip p1,int p2,ErrorStatus p3);
    public static native boolean native_insertGap(long p0,MutableGap p1,int p2,ErrorStatus p3);
    public static native boolean native_insertTransition(long p0,MutableTransition p1,int p2,ErrorStatus p3);
    public static native String native_kind(long p0);
    public static native ArrayList native_mutableChildren(long p0);
    public static native boolean native_replaceClip(long p0,MutableClip p1,String p2,ErrorStatus p3);
    public static native boolean native_replaceGap(long p0,MutableGap p1,String p2,ErrorStatus p3);
    public static native boolean native_replaceTransition(long p0,MutableTransition p1,String p2,ErrorStatus p3);
    public static native boolean native_setClip(long p0,MutableClip p1,int p2,ErrorStatus p3);
    public static native boolean native_setGap(long p0,MutableGap p1,int p2,ErrorStatus p3);
    public static native void native_setKind(long p0,String p1);
    public static native void native_setTags(long p0,Set p1);
    public static native void native_setTrackId(long p0,String p1);
    public static native boolean native_setTransition(long p0,MutableTransition p1,int p2,ErrorStatus p3);
    public static native HashSet native_tags(long p0);
    public static native String native_trackId(long p0);
    public boolean appendClip(MutableClip p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrack.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_appendClip(this.nativeRef, p0, p1);
    }
    public boolean appendGap(MutableGap p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrack.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_appendGap(this.nativeRef, p0, p1);
    }
    public ImmutableArray children(){
       Object obj = PatchProxy.apply(null, this, MutableTrack.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(new ArrayList(this.mutableChildren().mutableCopy()), Composable.class);
    }
    public void clearAllChildren(){
       if (PatchProxy.applyVoid(null, this, MutableTrack.class, "24")) {
          return;
       }
       MutableTrack.native_clearAllChildren(this.nativeRef);
       return;
    }
    public MutableTrack clone(){
       Object obj = PatchProxy.apply(null, this, MutableTrack.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrack.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean deleteClip(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrack.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_deleteClip(this.nativeRef, p0, p1);
    }
    public boolean deleteGap(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrack.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_deleteGap(this.nativeRef, p0, p1);
    }
    public boolean deleteTransition(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrack.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_deleteTransition(this.nativeRef, p0, p1);
    }
    public ImmutableArray getMutableClips(){
       Object obj = PatchProxy.apply(null, this, MutableTrack.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTrack.native_getMutableClips(this.nativeRef), MutableClip.class);
    }
    public boolean insertClip(MutableClip p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrack.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrack.native_insertClip(this.nativeRef, p0, p1, p2);
    }
    public boolean insertGap(MutableGap p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrack.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrack.native_insertGap(this.nativeRef, p0, p1, p2);
    }
    public boolean insertTransition(MutableTransition p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrack.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrack.native_insertTransition(this.nativeRef, p0, p1, p2);
    }
    public String kind(){
       Object obj = PatchProxy.apply(null, this, MutableTrack.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrack.native_kind(this.nativeRef);
    }
    public ImmutableArray mutableChildren(){
       Object obj = PatchProxy.apply(null, this, MutableTrack.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTrack.native_mutableChildren(this.nativeRef), MutableComposable.class);
    }
    public native final long native_create();
    public boolean replaceClip(MutableClip p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTrack.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_replaceClip(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceGap(MutableGap p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTrack.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_replaceGap(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceTransition(MutableTransition p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTrack.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrack.native_replaceTransition(this.nativeRef, p0, p1, p2);
    }
    public boolean setClip(MutableClip p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrack.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrack.native_setClip(this.nativeRef, p0, p1, p2);
    }
    public boolean setGap(MutableGap p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrack.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrack.native_setGap(this.nativeRef, p0, p1, p2);
    }
    public void setKind(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTrack.class, "7")) {
          return;
       }
       MutableTrack.native_setKind(this.nativeRef, p0);
       return;
    }
    public void setTags(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTrack.class, "8")) {
          return;
       }
       MutableTrack.native_setTags(this.nativeRef, p0);
       return;
    }
    public void setTrackId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTrack.class, "6")) {
          return;
       }
       MutableTrack.native_setTrackId(this.nativeRef, p0);
       return;
    }
    public boolean setTransition(MutableTransition p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrack.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrack.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrack.native_setTransition(this.nativeRef, p0, p1, p2);
    }
    public Set tags(){
       Object obj = PatchProxy.apply(null, this, MutableTrack.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrack.native_tags(this.nativeRef);
    }
    public String trackId(){
       Object obj = PatchProxy.apply(null, this, MutableTrack.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrack.native_trackId(this.nativeRef);
    }
}
