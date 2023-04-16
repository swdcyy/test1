package com.kwai.video.minecraft.model.nano.Minecraft$WesterosBeautyFilterParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$BasicAdjustParam;
import java.util.Map;
import com.kwai.video.minecraft.model.nano.Minecraft$DefinitionParam;
import com.kwai.video.minecraft.model.nano.Minecraft$DeformParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.editorsdk2.model.ImmutableMap;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;

public final class Minecraft$WesterosBeautyFilterParam extends MutableEffect	// class@000a97
{

    public void Minecraft$WesterosBeautyFilterParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosBeautyFilterParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosBeautyFilterParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosBeautyFilterParam;
       NativeObjectManager.register(this, p0);
    }
    public static native Minecraft$BasicAdjustParam native_basicAdjustParam(long p0);
    public static native float native_beautifyLipsIntensity(long p0);
    public static native Map native_beautyParams(long p0);
    public static native boolean native_beautyParams_contains(long p0,int p1);
    public static native float native_brightIntensity(long p0);
    public static native float native_clarityIntensity(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosBeautyFilterParam native_clone(long p0);
    public static native Minecraft$DefinitionParam native_definitionParam(long p0);
    public static native Map native_deformParams(long p0);
    public static native boolean native_deformParams_contains(long p0,int p1);
    public static native Minecraft$DeformParam native_deformParams_get(long p0,int p1);
    public static native Minecraft$DeformParam native_deformParams_put(long p0,int p1,Minecraft$DeformParam p2);
    public static native void native_destroy(long p0);
    public static native float native_evenSkinIntensity(long p0);
    public static native float native_eyeBagRemoveIntensity(long p0);
    public static native float native_eyeBrightenIntensity(long p0);
    public static native float native_faceShadowIntensity(long p0);
    public static native float native_noseShadowIntensity(long p0);
    public static native void native_setBasicAdjustParam(long p0,Minecraft$BasicAdjustParam p1);
    public static native void native_setBeautifyVersion(long p0,int p1);
    public static native void native_setBeautyParams(long p0,Map p1);
    public static native void native_setBrightIntensity(long p0,float p1);
    public static native void native_setDefinitionParam(long p0,Minecraft$DefinitionParam p1);
    public static native void native_setDeformParams(long p0,Map p1);
    public static native void native_setSoftenIntensity(long p0,float p1);
    public static native float native_softenIntensity(long p0);
    public static native float native_teethBrightenIntensity(long p0);
    public static native float native_wrinkleRemoveIntensity(long p0);
    public Minecraft$BasicAdjustParam basicAdjustParam(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosBeautyFilterParam.native_basicAdjustParam(this.nativeRef);
    }
    public float beautifyLipsIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_beautifyLipsIntensity(this.nativeRef);
    }
    public ImmutableMap beautyParams(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableMap(Minecraft$WesterosBeautyFilterParam.native_beautyParams(this.nativeRef));
    }
    public boolean beautyParamsContains(int p0){
       Minecraft$WesterosBeautyFilterParam westerosBeau = Minecraft$WesterosBeautyFilterParam.class;
       if (PatchProxy.isSupport(westerosBeau)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, westerosBeau, "26");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return Minecraft$WesterosBeautyFilterParam.native_beautyParams_contains(this.nativeRef, p0);
    }
    public float brightIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_brightIntensity(this.nativeRef);
    }
    public float clarityIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_clarityIntensity(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosBeautyFilterParam.class, "1")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$WesterosBeautyFilterParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosBeautyFilterParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$DefinitionParam definitionParam(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosBeautyFilterParam.native_definitionParam(this.nativeRef);
    }
    public ImmutableMap deformParams(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableMap(Minecraft$WesterosBeautyFilterParam.native_deformParams(this.nativeRef));
    }
    public boolean deformParamsContains(int p0){
       Minecraft$WesterosBeautyFilterParam westerosBeau = Minecraft$WesterosBeautyFilterParam.class;
       if (PatchProxy.isSupport(westerosBeau)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, westerosBeau, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return Minecraft$WesterosBeautyFilterParam.native_deformParams_contains(this.nativeRef, p0);
    }
    public Minecraft$DeformParam deformParamsGet(int p0){
       Minecraft$WesterosBeautyFilterParam westerosBeau = Minecraft$WesterosBeautyFilterParam.class;
       if (PatchProxy.isSupport(westerosBeau)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, westerosBeau, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$WesterosBeautyFilterParam.native_deformParams_get(this.nativeRef, p0);
    }
    public Minecraft$DeformParam deformParamsPut(int p0,Minecraft$DeformParam p1){
       Minecraft$WesterosBeautyFilterParam westerosBeau = Minecraft$WesterosBeautyFilterParam.class;
       if (PatchProxy.isSupport(westerosBeau)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, westerosBeau, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$WesterosBeautyFilterParam.native_deformParams_put(this.nativeRef, p0, p1);
    }
    public float evenSkinIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_evenSkinIntensity(this.nativeRef);
    }
    public float eyeBagRemoveIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_eyeBagRemoveIntensity(this.nativeRef);
    }
    public float eyeBrightenIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_eyeBrightenIntensity(this.nativeRef);
    }
    public float faceShadowIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_faceShadowIntensity(this.nativeRef);
    }
    public native final long native_create();
    public float noseShadowIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_noseShadowIntensity(this.nativeRef);
    }
    public void setBasicAdjustParam(Minecraft$BasicAdjustParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosBeautyFilterParam.class, "22")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_setBasicAdjustParam(this.nativeRef, p0);
       return;
    }
    public void setBeautifyVersion(int p0){
       Minecraft$WesterosBeautyFilterParam westerosBeau = Minecraft$WesterosBeautyFilterParam.class;
       if (PatchProxy.isSupport(westerosBeau) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westerosBeau, "18")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_setBeautifyVersion(this.nativeRef, p0);
       return;
    }
    public void setBeautyParams(ImmutableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosBeautyFilterParam.class, "25")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_setBeautyParams(this.nativeRef, p0.getMap());
       return;
    }
    public void setBrightIntensity(float p0){
       Minecraft$WesterosBeautyFilterParam westerosBeau = Minecraft$WesterosBeautyFilterParam.class;
       if (PatchProxy.isSupport(westerosBeau) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, westerosBeau, "4")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_setBrightIntensity(this.nativeRef, p0);
       return;
    }
    public void setDefinitionParam(Minecraft$DefinitionParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosBeautyFilterParam.class, "28")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_setDefinitionParam(this.nativeRef, p0);
       return;
    }
    public void setDeformParams(ImmutableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosBeautyFilterParam.class, "8")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_setDeformParams(this.nativeRef, p0.getMap());
       return;
    }
    public void setSoftenIntensity(float p0){
       Minecraft$WesterosBeautyFilterParam westerosBeau = Minecraft$WesterosBeautyFilterParam.class;
       if (PatchProxy.isSupport(westerosBeau) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, westerosBeau, "6")) {
          return;
       }
       Minecraft$WesterosBeautyFilterParam.native_setSoftenIntensity(this.nativeRef, p0);
       return;
    }
    public float softenIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_softenIntensity(this.nativeRef);
    }
    public float teethBrightenIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_teethBrightenIntensity(this.nativeRef);
    }
    public float wrinkleRemoveIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyFilterParam.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyFilterParam.native_wrinkleRemoveIntensity(this.nativeRef);
    }
}
