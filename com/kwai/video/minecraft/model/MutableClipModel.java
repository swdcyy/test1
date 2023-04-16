package com.kwai.video.minecraft.model.MutableClipModel;
import com.kwai.video.minecraft.model.ClipModel;
import com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableClip;
import java.lang.String;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.RationalTime;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.MediaReferenceModel;
import com.kwai.video.minecraft.model.MediaReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EffectModel;
import java.lang.Integer;

public class MutableClipModel extends OverdueableImpl implements ClipModel	// class@000a0e
{

    public void MutableClipModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native boolean native_appendEffect(long p0,Effect p1,ErrorStatus p2);
    public static native boolean native_clearAllEffects(long p0,ErrorStatus p1);
    public static native MutableClip native_cloneClip(long p0,ErrorStatus p1);
    public static native boolean native_deleteEffect(long p0,String p1,ErrorStatus p2);
    public static native void native_destroy(long p0);
    public static native TimeRange native_getAvailableRange(long p0,ErrorStatus p1);
    public static native String native_getClipId(long p0,ErrorStatus p1);
    public static native RationalTime native_getDuration(long p0,ErrorStatus p1);
    public static native ArrayList native_getEffects(long p0,ErrorStatus p1);
    public static native MediaReferenceModel native_getMediaReference(long p0,ErrorStatus p1);
    public static native TimeRange native_getSourceRange(long p0,ErrorStatus p1);
    public static native TimeRange native_getTrimmedRange(long p0,ErrorStatus p1);
    public static native boolean native_insertEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_replaceEffect(long p0,Effect p1,String p2,ErrorStatus p3);
    public static native boolean native_setEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_setEnabled(long p0,boolean p1,ErrorStatus p2);
    public static native boolean native_setMediaReference(long p0,MediaReference p1,ErrorStatus p2);
    public static native boolean native_setSourceRange(long p0,TimeRange p1,ErrorStatus p2);
    public boolean appendEffect(Effect p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableClipModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableClipModel.native_appendEffect(this.nativeRef, p0, p1);
    }
    public boolean clearAllEffects(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableClipModel.native_clearAllEffects(this.nativeRef, p0);
    }
    public MutableClip cloneClip(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClipModel.native_cloneClip(this.nativeRef, p0);
    }
    public boolean deleteEffect(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableClipModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableClipModel.native_deleteEffect(this.nativeRef, p0, p1);
    }
    public TimeRange getAvailableRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClipModel.native_getAvailableRange(this.nativeRef, p0);
    }
    public String getClipId(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClipModel.native_getClipId(this.nativeRef, p0);
    }
    public RationalTime getDuration(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClipModel.native_getDuration(this.nativeRef, p0);
    }
    public ImmutableArray getEffects(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableClipModel.native_getEffects(this.nativeRef, p0), EffectModel.class);
    }
    public MediaReferenceModel getMediaReference(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClipModel.native_getMediaReference(this.nativeRef, p0);
    }
    public TimeRange getSourceRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClipModel.native_getSourceRange(this.nativeRef, p0);
    }
    public TimeRange getTrimmedRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClipModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClipModel.native_getTrimmedRange(this.nativeRef, p0);
    }
    public boolean insertEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableClipModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableClipModel.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableClipModel.native_insertEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceEffect(Effect p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableClipModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableClipModel.native_replaceEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean setEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableClipModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableClipModel.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableClipModel.native_setEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean setEnabled(boolean p0,ErrorStatus p1){
       MutableClipModel mutableClipM = MutableClipModel.class;
       if (PatchProxy.isSupport(mutableClipM)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, mutableClipM, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableClipModel.native_setEnabled(this.nativeRef, p0, p1);
    }
    public boolean setMediaReference(MediaReference p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableClipModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableClipModel.native_setMediaReference(this.nativeRef, p0, p1);
    }
    public boolean setSourceRange(TimeRange p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableClipModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableClipModel.native_setSourceRange(this.nativeRef, p0, p1);
    }
}
