package com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.String;
import com.kwai.video.minecraft.model.TimeRange;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Integer;

public abstract class MutableEffect extends ModelBase implements Effect	// class@000a10
{
    public MinecraftModelDefine$EffectType concreteType;

    public void MutableEffect(){
       super();
    }
    public static native MutableEffect native_clone(long p0);
    public static native String native_effectId(long p0);
    public static native void native_setEffectId(long p0,String p1);
    public static native void native_setRole(long p0,int p1);
    public static native void native_setSourceRange(long p0,TimeRange p1);
    public static native void native_setTags(long p0,Set p1);
    public static native TimeRange native_sourceRange(long p0);
    public static native Set native_tags(long p0);
    public MutableEffect clone(){
       Object obj = PatchProxy.apply(null, this, MutableEffect.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableEffect.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String effectId(){
       Object obj = PatchProxy.apply(null, this, MutableEffect.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableEffect.native_effectId(this.nativeRef);
    }
    public MinecraftModelDefine$EffectType getEffectType(){
       return this.concreteType;
    }
    public void setEffectId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableEffect.class, "6")) {
          return;
       }
       MutableEffect.native_setEffectId(this.nativeRef, p0);
       return;
    }
    public void setRole(int p0){
       MutableEffect mutableEffec = MutableEffect.class;
       if (PatchProxy.isSupport(mutableEffec) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, mutableEffec, "7")) {
          return;
       }
       MutableEffect.native_setRole(this.nativeRef, p0);
       return;
    }
    public void setSourceRange(TimeRange p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableEffect.class, "8")) {
          return;
       }
       MutableEffect.native_setSourceRange(this.nativeRef, p0);
       return;
    }
    public void setTags(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableEffect.class, "4")) {
          return;
       }
       MutableEffect.native_setTags(this.nativeRef, p0);
       return;
    }
    public TimeRange sourceRange(){
       Object obj = PatchProxy.apply(null, this, MutableEffect.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableEffect.native_sourceRange(this.nativeRef);
    }
    public Set tags(){
       Object obj = PatchProxy.apply(null, this, MutableEffect.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableEffect.native_tags(this.nativeRef);
    }
}
