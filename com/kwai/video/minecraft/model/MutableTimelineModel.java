package com.kwai.video.minecraft.model.MutableTimelineModel;
import com.kwai.video.minecraft.model.TimelineModel;
import com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.Track;
import com.kwai.video.minecraft.model.MutableTimeline;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.MutableTrackModel;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.Timeline;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.TrackModel;
import com.kwai.video.minecraft.model.EffectModel;
import java.lang.Integer;

public class MutableTimelineModel extends OverdueableImpl implements TimelineModel	// class@000a18
{

    public void MutableTimelineModel(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void MutableTimelineModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native boolean native_appendEffect(long p0,Effect p1,ErrorStatus p2);
    public static native boolean native_appendTrack(long p0,Track p1,ErrorStatus p2);
    public static native boolean native_clearAllEffects(long p0,ErrorStatus p1);
    public static native boolean native_clearAllTracks(long p0,ErrorStatus p1);
    public static native MutableTimeline native_cloneTimeline(long p0,ErrorStatus p1);
    public static native boolean native_deleteEffect(long p0,String p1,ErrorStatus p2);
    public static native boolean native_deleteTrack(long p0,String p1,ErrorStatus p2);
    public static native void native_destroy(long p0);
    public static native ArrayList native_getAudioTrackModels(long p0,ErrorStatus p1);
    public static native RationalTime native_getDuration(long p0,ErrorStatus p1);
    public static native ArrayList native_getEffectModels(long p0,ErrorStatus p1);
    public static native MutableTrackModel native_getMutableTrackModelById(long p0,String p1,ErrorStatus p2);
    public static native ArrayList native_getTrackModels(long p0,ErrorStatus p1);
    public static native ArrayList native_getTrackModelsByTag(long p0,String p1,ErrorStatus p2);
    public static native ArrayList native_getVideoTrackModels(long p0,ErrorStatus p1);
    public static native boolean native_insertEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_insertTrack(long p0,Track p1,int p2,ErrorStatus p3);
    public static native boolean native_replaceEffect(long p0,Effect p1,String p2,ErrorStatus p3);
    public static native boolean native_replaceTrack(long p0,Track p1,String p2,ErrorStatus p3);
    public static native boolean native_setEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_setSourceRange(long p0,TimeRange p1,ErrorStatus p2);
    public static native boolean native_setTimeline(long p0,Timeline p1,ErrorStatus p2);
    public static native boolean native_setTrack(long p0,Track p1,int p2,ErrorStatus p3);
    public boolean appendEffect(Effect p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_appendEffect(this.nativeRef, p0, p1);
    }
    public boolean appendTrack(Track p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_appendTrack(this.nativeRef, p0, p1);
    }
    public boolean clearAllEffects(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_clearAllEffects(this.nativeRef, p0);
    }
    public boolean clearAllTracks(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_clearAllTracks(this.nativeRef, p0);
    }
    public MutableTimeline cloneTimeline(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimelineModel.native_cloneTimeline(this.nativeRef, p0);
    }
    public boolean deleteEffect(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_deleteEffect(this.nativeRef, p0, p1);
    }
    public boolean deleteTrack(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_deleteTrack(this.nativeRef, p0, p1);
    }
    public ImmutableArray getAudioTrackModels(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimelineModel.native_getAudioTrackModels(this.nativeRef, p0), TrackModel.class);
    }
    public RationalTime getDuration(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimelineModel.native_getDuration(this.nativeRef, p0);
    }
    public ImmutableArray getEffectModels(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimelineModel.native_getEffectModels(this.nativeRef, p0), EffectModel.class);
    }
    public MutableTrackModel getMutableTrackModelById(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTimelineModel.native_getMutableTrackModelById(this.nativeRef, p0, p1);
    }
    public ImmutableArray getTrackModels(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimelineModel.native_getTrackModels(this.nativeRef, p0), TrackModel.class);
    }
    public ImmutableArray getTrackModelsByTag(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimelineModel.native_getTrackModelsByTag(this.nativeRef, p0, p1), TrackModel.class);
    }
    public ImmutableArray getVideoTrackModels(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTimelineModel.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTimelineModel.native_getVideoTrackModels(this.nativeRef, p0), TrackModel.class);
    }
    public boolean insertEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTimelineModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTimelineModel.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTimelineModel.native_insertEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean insertTrack(Track p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTimelineModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTimelineModel.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTimelineModel.native_insertTrack(this.nativeRef, p0, p1, p2);
    }
    public native final long native_create();
    public boolean replaceEffect(Effect p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTimelineModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_replaceEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceTrack(Track p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTimelineModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_replaceTrack(this.nativeRef, p0, p1, p2);
    }
    public boolean setEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTimelineModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTimelineModel.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTimelineModel.native_setEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean setSourceRange(TimeRange p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_setSourceRange(this.nativeRef, p0, p1);
    }
    public boolean setTimeline(Timeline p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTimelineModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTimelineModel.native_setTimeline(this.nativeRef, p0, p1);
    }
    public boolean setTrack(Track p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTimelineModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTimelineModel.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTimelineModel.native_setTrack(this.nativeRef, p0, p1, p2);
    }
}
