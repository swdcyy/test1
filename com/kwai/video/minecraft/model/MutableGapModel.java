package com.kwai.video.minecraft.model.MutableGapModel;
import com.kwai.video.minecraft.model.GapModel;
import com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableGap;
import java.lang.String;
import com.kwai.video.minecraft.model.RationalTime;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EffectModel;
import java.lang.Integer;

public class MutableGapModel extends OverdueableImpl implements GapModel	// class@000a13
{

    public void MutableGapModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native boolean native_appendEffect(long p0,Effect p1,ErrorStatus p2);
    public static native boolean native_clearAllEffects(long p0,ErrorStatus p1);
    public static native MutableGap native_cloneGap(long p0,ErrorStatus p1);
    public static native boolean native_deleteEffect(long p0,String p1,ErrorStatus p2);
    public static native void native_destroy(long p0);
    public static native RationalTime native_getDuration(long p0,ErrorStatus p1);
    public static native ArrayList native_getEffects(long p0,ErrorStatus p1);
    public static native String native_getGapId(long p0,ErrorStatus p1);
    public static native TimeRange native_getSourceRange(long p0,ErrorStatus p1);
    public static native TimeRange native_getTrimmedRange(long p0,ErrorStatus p1);
    public static native boolean native_insertEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_replaceEffect(long p0,Effect p1,String p2,ErrorStatus p3);
    public static native boolean native_setEffect(long p0,Effect p1,int p2,ErrorStatus p3);
    public static native boolean native_setEnabled(long p0,boolean p1,ErrorStatus p2);
    public static native boolean native_setSourceRange(long p0,TimeRange p1,ErrorStatus p2);
    public boolean appendEffect(Effect p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableGapModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableGapModel.native_appendEffect(this.nativeRef, p0, p1);
    }
    public boolean clearAllEffects(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableGapModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableGapModel.native_clearAllEffects(this.nativeRef, p0);
    }
    public MutableGap cloneGap(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableGapModel.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableGapModel.native_cloneGap(this.nativeRef, p0);
    }
    public boolean deleteEffect(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableGapModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableGapModel.native_deleteEffect(this.nativeRef, p0, p1);
    }
    public RationalTime getDuration(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableGapModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableGapModel.native_getDuration(this.nativeRef, p0);
    }
    public ImmutableArray getEffects(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableGapModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableGapModel.native_getEffects(this.nativeRef, p0), EffectModel.class);
    }
    public String getGapId(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableGapModel.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableGapModel.native_getGapId(this.nativeRef, p0);
    }
    public TimeRange getSourceRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableGapModel.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableGapModel.native_getSourceRange(this.nativeRef, p0);
    }
    public TimeRange getTrimmedRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableGapModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableGapModel.native_getTrimmedRange(this.nativeRef, p0);
    }
    public boolean insertEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableGapModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableGapModel.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableGapModel.native_insertEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean replaceEffect(Effect p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableGapModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableGapModel.native_replaceEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean setEffect(Effect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableGapModel.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableGapModel.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableGapModel.native_setEffect(this.nativeRef, p0, p1, p2);
    }
    public boolean setEnabled(boolean p0,ErrorStatus p1){
       MutableGapModel mutableGapMo = MutableGapModel.class;
       if (PatchProxy.isSupport(mutableGapMo)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, mutableGapMo, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableGapModel.native_setEnabled(this.nativeRef, p0, p1);
    }
    public boolean setSourceRange(TimeRange p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableGapModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableGapModel.native_setSourceRange(this.nativeRef, p0, p1);
    }
}
