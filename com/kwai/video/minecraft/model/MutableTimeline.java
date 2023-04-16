package com.kwai.video.minecraft.model.MutableTimeline;
import com.kwai.video.minecraft.model.Timeline;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.MutableTrack;
import com.kwai.video.minecraft.model.ErrorStatus;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.nano.Minecraft$TimelineConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.editorsdk2.model.MutableArray;
import java.util.Collection;
import com.kwai.video.minecraft.model.Track;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.video.minecraft.model.Timeline$FontResolveHandler;
import java.lang.Long;

public class MutableTimeline extends MutableItem implements Timeline	// class@000a17
{
    public Timeline$FontResolveHandler fontResolveHandler;

    public void MutableTimeline(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void MutableTimeline(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native boolean native_appendTrack(long p0,MutableTrack p1,ErrorStatus p2);
    public static native void native_clearAllTracks(long p0);
    public static native MutableTimeline native_clone(long p0);
    public static native boolean native_deleteTrack(long p0,String p1,ErrorStatus p2);
    public static native ArrayList native_deletedRanges(long p0);
    public static native void native_destroy(long p0);
    public static native ModelBase native_getItem(long p0);
    public static native boolean native_insertTrack(long p0,MutableTrack p1,int p2,ErrorStatus p3);
    public static native Minecraft$Color native_marginColor(long p0);
    public static native Minecraft$KSAVClip native_mutableAVClipById(long p0,String p1);
    public static native ArrayList native_mutableAudioTracks(long p0);
    public static native ArrayList native_mutableIrrReplaceableClips(long p0);
    public static native Minecraft$KSAVClip native_mutableIrrReplaceableClipsByClipId(long p0,String p1);
    public static native ArrayList native_mutableReplaceableClips(long p0);
    public static native Minecraft$KSAVClip native_mutableReplaceableClipsByClipId(long p0,String p1);
    public static native ArrayList native_mutableReplaceableClipsByRefId(long p0,String p1);
    public static native ArrayList native_mutableTracks(long p0);
    public static native ArrayList native_mutableTracksByTag(long p0,String p1);
    public static native ArrayList native_mutableVideoTracks(long p0);
    public static native Minecraft$Color native_paddingColor(long p0);
    public static native MutableTimeline native_parseFrom(byte[] p0);
    public static native long native_projectHeight(long p0);
    public static native long native_projectId(long p0);
    public static native long native_projectWidth(long p0);
    public static native boolean native_replaceTrack(long p0,MutableTrack p1,String p2,ErrorStatus p3);
    public static native void native_setDeletedRanges(long p0,ArrayList p1);
    public static native void native_setMarginColor(long p0,Minecraft$Color p1);
    public static native void native_setPaddingColor(long p0,Minecraft$Color p1);
    public static native void native_setProjectId(long p0,long p1);
    public static native void native_setProjectResolutionWidthsetProjectResolutionWidth(long p0,int p1,int p2);
    public static native boolean native_setTrack(long p0,MutableTrack p1,int p2,ErrorStatus p3);
    public static native Minecraft$TimelineConfig native_timelineConfig(long p0);
    public static MutableTimeline parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MutableTimeline.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_parseFrom(p0);
    }
    public boolean appendTrack(MutableTrack p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimeline.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimeline.native_appendTrack(this.nativeRef, p0, p1);
    }
    public ImmutableArray audioTracks(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(new ArrayList(this.mutableAudioTracks().mutableCopy()), Track.class);
    }
    public void clearAllTracks(){
       if (PatchProxy.applyVoid(null, this, MutableTimeline.class, "16")) {
          return;
       }
       MutableTimeline.native_clearAllTracks(this.nativeRef);
       return;
    }
    public MutableTimeline clone(){
       MutableTimeline obj = PatchProxy.apply(null, this, MutableTimeline.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MutableTimeline.native_clone(this.nativeRef);
       obj.fontResolveHandler = this.fontResolveHandler;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public boolean deleteTrack(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimeline.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimeline.native_deleteTrack(this.nativeRef, p0, p1);
    }
    public ImmutableArray deletedRanges(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_deletedRanges(this.nativeRef), TimeRange.class);
    }
    public ModelBase getItem(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_getItem(this.nativeRef);
    }
    public boolean insertTrack(MutableTrack p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTimeline.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTimeline.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTimeline.native_insertTrack(this.nativeRef, p0, p1, p2);
    }
    public Minecraft$Color marginColor(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_marginColor(this.nativeRef);
    }
    public Minecraft$KSAVClip mutableAVClipById(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimeline.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_mutableAVClipById(this.nativeRef, p0);
    }
    public ImmutableArray mutableAudioTracks(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_mutableAudioTracks(this.nativeRef), MutableTrack.class);
    }
    public ImmutableArray mutableIrrReplaceableClips(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_mutableIrrReplaceableClips(this.nativeRef), Minecraft$KSAVClip.class);
    }
    public Minecraft$KSAVClip mutableIrrReplaceableClipsByClipId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimeline.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_mutableIrrReplaceableClipsByClipId(this.nativeRef, p0);
    }
    public ImmutableArray mutableReplaceableClips(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_mutableReplaceableClips(this.nativeRef), Minecraft$KSAVClip.class);
    }
    public Minecraft$KSAVClip mutableReplaceableClipsByClipId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimeline.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_mutableReplaceableClipsByClipId(this.nativeRef, p0);
    }
    public ImmutableArray mutableReplaceableClipsByRefId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimeline.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_mutableReplaceableClipsByRefId(this.nativeRef, p0), Minecraft$KSAVClip.class);
    }
    public ImmutableArray mutableTracks(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_mutableTracks(this.nativeRef), MutableTrack.class);
    }
    public ImmutableArray mutableTracksByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimeline.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_mutableTracksByTag(this.nativeRef, p0), MutableTrack.class);
    }
    public ImmutableArray mutableVideoTracks(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimeline.native_mutableVideoTracks(this.nativeRef), MutableTrack.class);
    }
    public native final long native_create();
    public native final void native_setFontResolveHandler(long p0);
    public Minecraft$Color paddingColor(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_paddingColor(this.nativeRef);
    }
    public long projectHeight(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return MutableTimeline.native_projectHeight(this.nativeRef);
    }
    public long projectId(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return MutableTimeline.native_projectId(this.nativeRef);
    }
    public long projectWidth(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return MutableTimeline.native_projectWidth(this.nativeRef);
    }
    public boolean replaceTrack(MutableTrack p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTimeline.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimeline.native_replaceTrack(this.nativeRef, p0, p1, p2);
    }
    public final String resolvePathByFontId(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, MutableTimeline.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       MutableTimeline tfontResolve = this.fontResolveHandler;
       if (tfontResolve != null) {
          obj = tfontResolve.resolvePathByFontId(p0);
       }
       return obj;
    }
    public void setDeletedRanges(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTimeline.class, "28")) {
          return;
       }
       MutableTimeline.native_setDeletedRanges(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setFontResolveHandler(Timeline$FontResolveHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTimeline.class, "17")) {
          return;
       }
       this.fontResolveHandler = p0;
       this.native_setFontResolveHandler(this.nativeRef);
       return;
    }
    public void setMarginColor(Minecraft$Color p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTimeline.class, "24")) {
          return;
       }
       MutableTimeline.native_setMarginColor(this.nativeRef, p0);
       return;
    }
    public void setPaddingColor(Minecraft$Color p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableTimeline.class, "26")) {
          return;
       }
       MutableTimeline.native_setPaddingColor(this.nativeRef, p0);
       return;
    }
    public void setProjectId(long p0){
       MutableTimeline mutableTimel = MutableTimeline.class;
       if (PatchProxy.isSupport(mutableTimel) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, mutableTimel, "20")) {
          return;
       }
       MutableTimeline.native_setProjectId(this.nativeRef, p0);
       return;
    }
    public void setProjectResolutionWidthsetProjectResolutionWidth(int p0,int p1){
       MutableTimeline mutableTimel = MutableTimeline.class;
       if (PatchProxy.isSupport(mutableTimel) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, mutableTimel, "29")) {
          return;
       }
       MutableTimeline.native_setProjectResolutionWidthsetProjectResolutionWidth(this.nativeRef, p0, p1);
       return;
    }
    public boolean setTrack(MutableTrack p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTimeline.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTimeline.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTimeline.native_setTrack(this.nativeRef, p0, p1, p2);
    }
    public Minecraft$TimelineConfig timelineConfig(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimeline.native_timelineConfig(this.nativeRef);
    }
    public ImmutableArray tracks(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(new ArrayList(this.mutableTracks().mutableCopy()), Track.class);
    }
    public ImmutableArray videoTracks(){
       Object obj = PatchProxy.apply(null, this, MutableTimeline.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(new ArrayList(this.mutableVideoTracks().mutableCopy()), Track.class);
    }
}
