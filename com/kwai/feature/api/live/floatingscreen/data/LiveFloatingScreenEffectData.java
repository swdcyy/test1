package com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenEffectData;
import java.io.Serializable;
import cr5.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenEffectData$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import fr5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenEffectData implements Serializable, a	// class@000fbd
{
    public long effectDelayTimeMs;
    public int effectTypeBits;
    public String particularEffectKey;
    public int particularEffectType;
    public int shimmerDrawableId;
    public long shimmerDurationMs;
    public float shimmerGradientAngle;
    public int[] shimmerGradientIntColors;
    public float[] shimmerGradientLocations;
    public String[] shimmerGradientStrColors;
    public int shimmerLocation;
    public CDNUrl[] shimmerPicUrls;
    public int shimmerResType;
    public static final LiveFloatingScreenEffectData$a Companion;

    static {
       LiveFloatingScreenEffectData.Companion = new LiveFloatingScreenEffectData$a(null);
    }
    public void LiveFloatingScreenEffectData(){
       super();
       this.shimmerLocation = 2;
       this.particularEffectKey = "";
    }
    public static void getShimmerLocation$annotations(){
    }
    public static void getShimmerResType$annotations(){
    }
    public final long getEffectDelayTimeMs(){
       return this.effectDelayTimeMs;
    }
    public final int getEffectTypeBits(){
       return this.effectTypeBits;
    }
    public final String getParticularEffectKey(){
       return this.particularEffectKey;
    }
    public final int getParticularEffectType(){
       return this.particularEffectType;
    }
    public final int getShimmerDrawableId(){
       return this.shimmerDrawableId;
    }
    public final long getShimmerDurationMs(){
       return this.shimmerDurationMs;
    }
    public final float getShimmerGradientAngle(){
       return this.shimmerGradientAngle;
    }
    public final int[] getShimmerGradientIntColors(){
       return this.shimmerGradientIntColors;
    }
    public final float[] getShimmerGradientLocations(){
       return this.shimmerGradientLocations;
    }
    public final String[] getShimmerGradientStrColors(){
       return this.shimmerGradientStrColors;
    }
    public final int getShimmerLocation(){
       return this.shimmerLocation;
    }
    public final CDNUrl[] getShimmerPicUrls(){
       return this.shimmerPicUrls;
    }
    public final int getShimmerResType(){
       return this.shimmerResType;
    }
    public void registerResourceToPreload(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenEffectData.class, "2")) {
          return;
       }
       a.p(p0, "preload");
       LiveFloatingScreenEffectData tshimmerPicU = this.shimmerPicUrls;
       int i = 0;
       if (tshimmerPicU != null) {
          int i1 = (!tshimmerPicU.length)? 1: 0;
          if (!i1) {
          label_001f :
             if (!i) {
                a.m(tshimmerPicU);
                p0.b(tshimmerPicU);
             }
             return;
          }
       }
       i = 1;
       goto label_001f ;
    }
    public final void setEffectDelayTimeMs(long p0){
       this.effectDelayTimeMs = p0;
    }
    public final void setEffectTypeBits(int p0){
       this.effectTypeBits = p0;
    }
    public final void setParticularEffectKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenEffectData.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.particularEffectKey = p0;
       return;
    }
    public final void setParticularEffectType(int p0){
       this.particularEffectType = p0;
    }
    public final void setShimmerDrawableId(int p0){
       this.shimmerDrawableId = p0;
    }
    public final void setShimmerDurationMs(long p0){
       this.shimmerDurationMs = p0;
    }
    public final void setShimmerGradientAngle(float p0){
       this.shimmerGradientAngle = p0;
    }
    public final void setShimmerGradientIntColors(int[] p0){
       this.shimmerGradientIntColors = p0;
    }
    public final void setShimmerGradientLocations(float[] p0){
       this.shimmerGradientLocations = p0;
    }
    public final void setShimmerGradientStrColors(String[] p0){
       this.shimmerGradientStrColors = p0;
    }
    public final void setShimmerLocation(int p0){
       this.shimmerLocation = p0;
    }
    public final void setShimmerPicUrls(CDNUrl[] p0){
       this.shimmerPicUrls = p0;
    }
    public final void setShimmerResType(int p0){
       this.shimmerResType = p0;
    }
}
