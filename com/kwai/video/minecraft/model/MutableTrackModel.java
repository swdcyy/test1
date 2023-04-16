package com.kwai.video.minecraft.model.MutableTrackModel;
import com.kwai.video.minecraft.model.TrackModel;
import com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.Clip;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.Gap;
import com.kwai.video.minecraft.model.MutableTrack;
import java.lang.String;
import com.kwai.video.minecraft.model.TimeRange;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.MutableClipModel;
import com.kwai.video.minecraft.model.MutableGapModel;
import com.kwai.video.minecraft.model.MutableTransitionModel;
import java.util.Set;
import com.kwai.video.minecraft.model.Transition;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.ComposableModel;
import com.kwai.video.minecraft.model.EffectModel;
import java.lang.Integer;

public class MutableTrackModel extends OverdueableImpl implements TrackModel	// class@000a1a
{

    public void MutableTrackModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native boolean native_appendClip(long p0,Clip p1,ErrorStatus p2);
    public static native boolean native_appendEffect(long p0,Effect p1,ErrorStatus p2);
    public static native boolean native_appendGap(long p0,Gap p1,ErrorStatus p2);
    public static native boolean native_clearAllChildren(long p0,ErrorStatus p1);
    public static native boolean native_clearAllEffects(long p0,ErrorStatus p1);
    public static native MutableTrack native_cloneTrack(long p0,ErrorStatus p1);
    public static native boolean native_deleteClip(long p0,String p1,ErrorStatus p2);
    public static native boolean native_deleteEffect(long p0,String p1,ErrorStatus p2);
    public static native boolean native_deleteGap(long p0,String p1,ErrorStatus p2);
    public static native boolean native_deleteTransition(long p0,String p1,ErrorStatus p2);
    public static native void native_destroy(long p0);
    public static native TimeRange native_getAvailableRange(long p0,ErrorStatus p1);
    public static native ArrayList native_getChildren(long p0,ErrorStatus p1);
    public static native RationalTime native_getDuration(long p0,ErrorStatus p1);
    public static native ArrayList native_getEffects(long p0,ErrorStatus p1);
    public static native String native_getKind(long p0,ErrorStatus p1);
    public static native MutableClipModel native_getMutableClipModelById(long p0,String p1,ErrorStatus p2);
    public static native MutableGapModel native_getMutableGapModelById(long p0,String p1,ErrorStatus p2);
    public static native MutableTransitionModel native_getMutableTransitionModelById(long p0,String p1,ErrorStatus p2);
    public static native TimeRange native_getSourceRange(long p0,ErrorStatus p1);
    public static native Set native_getTags(long p0,ErrorStatus p1);
    public static native String native_getTrackId(long p0,ErrorStatus p1);
    public static native TimeRange native_getTrimmedRange(long p0,ErrorStatus p1);
    public static native boolean native_insertClip(long p0,Clip p1,int p2,ErrorStatus p3);
    public static native boolean native_insertEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_insertGap(long p0,Gap p1,int p2,ErrorStatus p3);
    public static native boolean native_insertTransition(long p0,Transition p1,int p2,ErrorStatus p3);
    public static native boolean native_replaceClip(long p0,Clip p1,String p2,ErrorStatus p3);
    public static native boolean native_replaceEffect(long p0,Effect p1,String p2,ErrorStatus p3);
    public static native boolean native_replaceGap(long p0,Gap p1,String p2,ErrorStatus p3);
    public static native boolean native_replaceTransition(long p0,Transition p1,String p2,ErrorStatus p3);
    public static native boolean native_setClip(long p0,Clip p1,int p2,ErrorStatus p3);
    public static native boolean native_setEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_setEnabled(long p0,boolean p1,ErrorStatus p2);
    public static native boolean native_setGap(long p0,Gap p1,int p2,ErrorStatus p3);
    public static native boolean native_setSourceRange(long p0,TimeRange p1,ErrorStatus p2);
    public static native boolean native_setTransition(long p0,Transition p1,int p2,ErrorStatus p3);
    public boolean appendClip(Clip p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_appendClip(this.nativeRef, p0, p1);
    }
    public boolean appendEffect(Effect p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_appendEffect(this.nativeRef, p0, p1);
    }
    public boolean appendGap(Gap p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_appendGap(this.nativeRef, p0, p1);
    }
    public boolean clearAllChildren(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_clearAllChildren(this.nativeRef, p0);
    }
    public boolean clearAllEffects(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_clearAllEffects(this.nativeRef, p0);
    }
    public MutableTrack cloneTrack(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_cloneTrack(this.nativeRef, p0);
    }
    public boolean deleteClip(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_deleteClip(this.nativeRef, p0, p1);
    }
    public boolean deleteEffect(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_deleteEffect(this.nativeRef, p0, p1);
    }
    public boolean deleteGap(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_deleteGap(this.nativeRef, p0, p1);
    }
    public boolean deleteTransition(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_deleteTransition(this.nativeRef, p0, p1);
    }
    public TimeRange getAvailableRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getAvailableRange(this.nativeRef, p0);
    }
    public ImmutableArray getChildren(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTrackModel.native_getChildren(this.nativeRef, p0), ComposableModel.class);
    }
    public RationalTime getDuration(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getDuration(this.nativeRef, p0);
    }
    public ImmutableArray getEffects(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableTrackModel.native_getEffects(this.nativeRef, p0), EffectModel.class);
    }
    public String getKind(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getKind(this.nativeRef, p0);
    }
    public MutableClipModel getMutableClipModelById(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getMutableClipModelById(this.nativeRef, p0, p1);
    }
    public MutableGapModel getMutableGapModelById(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getMutableGapModelById(this.nativeRef, p0, p1);
    }
    public MutableTransitionModel getMutableTransitionModelById(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getMutableTransitionModelById(this.nativeRef, p0, p1);
    }
    public TimeRange getSourceRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getSourceRange(this.nativeRef, p0);
    }
    public Set getTags(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getTags(this.nativeRef, p0);
    }
    public String getTrackId(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getTrackId(this.nativeRef, p0);
    }
    public TimeRange getTrimmedRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableTrackModel.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableTrackModel.native_getTrimmedRange(this.nativeRef, p0);
    }
    public boolean insertClip(Clip p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_insertClip(this.nativeRef, p0, p1, p2);
    }
    public boolean insertEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_insertEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean insertGap(Gap p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_insertGap(this.nativeRef, p0, p1, p2);
    }
    public boolean insertTransition(Transition p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_insertTransition(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceClip(Clip p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTrackModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_replaceClip(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceEffect(Effect p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTrackModel.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_replaceEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceGap(Gap p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTrackModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_replaceGap(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceTransition(Transition p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableTrackModel.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_replaceTransition(this.nativeRef, p0, p1, p2);
    }
    public boolean setClip(Clip p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_setClip(this.nativeRef, p0, p1, p2);
    }
    public boolean setEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_setEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean setEnabled(boolean p0,ErrorStatus p1){
       MutableTrackModel mutableTrack = MutableTrackModel.class;
       if (PatchProxy.isSupport(mutableTrack)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, mutableTrack, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_setEnabled(this.nativeRef, p0, p1);
    }
    public boolean setGap(Gap p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_setGap(this.nativeRef, p0, p1, p2);
    }
    public boolean setSourceRange(TimeRange p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableTrackModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableTrackModel.native_setSourceRange(this.nativeRef, p0, p1);
    }
    public boolean setTransition(Transition p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableTrackModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableTrackModel.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableTrackModel.native_setTransition(this.nativeRef, p0, p1, p2);
    }
}
