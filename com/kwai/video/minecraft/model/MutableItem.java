package com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.Item;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ErrorStatus;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.editorsdk2.model.MutableArray;
import java.util.Collection;
import com.kwai.video.minecraft.model.Effect;
import java.lang.Integer;

public abstract class MutableItem extends ModelBase implements Item	// class@000a14
{

    public void MutableItem(){
       super();
    }
    public static native RationalTime native_absoluteDuration(long p0);
    public static native boolean native_appendEffect(long p0,MutableEffect p1,ErrorStatus p2);
    public static native void native_clearAllEffects(long p0);
    public static native boolean native_deleteEffect(long p0,String p1,ErrorStatus p2);
    public static native RationalTime native_duration(long p0,ErrorStatus p1);
    public static native boolean native_enabled(long p0);
    public static native boolean native_insertEffect(long p0,MutableEffect p1,int p2,ErrorStatus p3);
    public static native ArrayList native_mutableEffects(long p0);
    public static native boolean native_replaceEffect(long p0,MutableEffect p1,String p2,ErrorStatus p3);
    public static native void native_setAbsoluteDuration(long p0,RationalTime p1);
    public static native void native_setEnabled(long p0,boolean p1);
    public static native void native_setSourceRange(long p0,TimeRange p1);
    public static native TimeRange native_sourceRange(long p0);
    public static native TimeRange native_trimmedRange(long p0,ErrorStatus p1);
    public RationalTime absoluteDuration(){
       Object obj = PatchProxy.apply(null, this, MutableItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableItem.native_absoluteDuration(this.nativeRef);
    }
    public boolean appendEffect(MutableEffect p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableItem.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableItem.native_appendEffect(this.getItem().nativeRef, p0, p1);
    }
    public void clearAllEffects(){
       if (PatchProxy.applyVoid(null, this, MutableItem.class, "15")) {
          return;
       }
       MutableItem.native_clearAllEffects(this.getItem().nativeRef);
       return;
    }
    public boolean deleteEffect(String p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MutableItem.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableItem.native_deleteEffect(this.getItem().nativeRef, p0, p1);
    }
    public RationalTime duration(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableItem.native_duration(this.getItem().nativeRef, p0);
    }
    public ImmutableArray effects(){
       Object obj = PatchProxy.apply(null, this, MutableItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(new ArrayList(this.mutableEffects().mutableCopy()), Effect.class);
    }
    public boolean enabled(){
       Object obj = PatchProxy.apply(null, this, MutableItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableItem.native_enabled(this.getItem().nativeRef);
    }
    public ModelBase getItem(){
       return this;
    }
    public boolean insertEffect(MutableEffect p0,int p1,ErrorStatus p2){
       if (PatchProxy.isSupport(MutableItem.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MutableItem.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MutableItem.native_insertEffect(this.getItem().nativeRef, p0, p1, p2);
    }
    public ImmutableArray mutableEffects(){
       Object obj = PatchProxy.apply(null, this, MutableItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MutableItem.native_mutableEffects(this.getItem().nativeRef), MutableEffect.class);
    }
    public boolean replaceEffect(MutableEffect p0,String p1,ErrorStatus p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MutableItem.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MutableItem.native_replaceEffect(this.getItem().nativeRef, p0, p1, p2);
    }
    public void setAbsoluteDuration(RationalTime p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableItem.class, "8")) {
          return;
       }
       MutableItem.native_setAbsoluteDuration(this.nativeRef, p0);
       return;
    }
    public void setEnabled(boolean p0){
       MutableItem mutableItem = MutableItem.class;
       if (PatchProxy.isSupport(mutableItem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mutableItem, "2")) {
          return;
       }
       MutableItem.native_setEnabled(this.getItem().nativeRef, p0);
       return;
    }
    public void setSourceRange(TimeRange p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableItem.class, "10")) {
          return;
       }
       MutableItem.native_setSourceRange(this.getItem().nativeRef, p0);
       return;
    }
    public TimeRange sourceRange(){
       Object obj = PatchProxy.apply(null, this, MutableItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableItem.native_sourceRange(this.getItem().nativeRef);
    }
    public TimeRange trimmedRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableItem.native_trimmedRange(this.getItem().nativeRef, p0);
    }
}
