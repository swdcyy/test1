package com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenBackgroundData;
import java.io.Serializable;
import cr5.a;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenBackgroundData$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo;
import fr5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public final class LiveFloatingScreenBackgroundData implements Serializable, a	// class@000b0a
{
    public String[] backgroundGradientColor;
    public int[] backgroundGradientIntColor;
    public float[] backgroundGradientPoints;
    public CDNUrl[] backgroundShimmerPicUrls;
    public LiveEnterRoomEffectBackgroudPicInfo backgroundStretchablePic;
    public int backgroundType;
    public static final LiveFloatingScreenBackgroundData$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenBackgroundData.Companion = new LiveFloatingScreenBackgroundData$a(null);
    }
    public void LiveFloatingScreenBackgroundData(){
       super();
    }
    public static void getBackgroundType$annotations(){
    }
    public final String[] getBackgroundGradientColor(){
       return this.backgroundGradientColor;
    }
    public final int[] getBackgroundGradientIntColor(){
       return this.backgroundGradientIntColor;
    }
    public final float[] getBackgroundGradientPoints(){
       return this.backgroundGradientPoints;
    }
    public final CDNUrl[] getBackgroundShimmerPicUrls(){
       return this.backgroundShimmerPicUrls;
    }
    public final LiveEnterRoomEffectBackgroudPicInfo getBackgroundStretchablePic(){
       return this.backgroundStretchablePic;
    }
    public final int getBackgroundType(){
       return this.backgroundType;
    }
    public void registerResourceToPreload(a p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenBackgroundData.class, "1")) {
          return;
       }
       a.p(p0, "preload");
       LiveFloatingScreenBackgroundData tbackgroundS = this.backgroundShimmerPicUrls;
       int i = 0;
       if (tbackgroundS != null) {
          i1 = (!tbackgroundS.length)? 1: 0;
          if (!i1) {
             i1 = 0;
          label_0022 :
             if (!i1) {
                p0.b(tbackgroundS);
             }
             tbackgroundS = this.backgroundStretchablePic;
             LiveEnterRoomEffectBackgroudPicInfo mPicUrls = (tbackgroundS != null)? tbackgroundS.mPicUrls: null;
             if (mPicUrls != null) {
                i1 = (!mPicUrls.length)? 1: 0;
                if (!i1) {
                label_003a :
                   if (!i) {
                      p0.b(mPicUrls);
                   }
                   return;
                }
             }
             i = 1;
             goto label_003a ;
          }
       }
       i1 = 1;
       goto label_0022 ;
    }
    public final void setBackgroundGradientColor(String[] p0){
       this.backgroundGradientColor = p0;
    }
    public final void setBackgroundGradientIntColor(int[] p0){
       this.backgroundGradientIntColor = p0;
    }
    public final void setBackgroundGradientPoints(float[] p0){
       this.backgroundGradientPoints = p0;
    }
    public final void setBackgroundShimmerPicUrls(CDNUrl[] p0){
       this.backgroundShimmerPicUrls = p0;
    }
    public final void setBackgroundStretchablePic(LiveEnterRoomEffectBackgroudPicInfo p0){
       this.backgroundStretchablePic = p0;
    }
    public final void setBackgroundType(int p0){
       this.backgroundType = p0;
    }
    public String toString(){
       String str;
       Object[] objArray1;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, LiveFloatingScreenBackgroundData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "LiveFloatingScreenBackgroundData\(backgroundType="+this.backgroundType+", backgroundGradientColor=";
       LiveFloatingScreenBackgroundData tbackgroundG = this.backgroundGradientColor;
       if (tbackgroundG != null) {
          str = Arrays.toString(tbackgroundG);
          a.o(str, "java.util.Arrays.toString\(this\)");
       }else {
          objArray1 = objArray;
       }
       obj = obj+str+", backgroundGradientIntColor=";
       tbackgroundG = this.backgroundGradientIntColor;
       if (tbackgroundG != null) {
          str = Arrays.toString(tbackgroundG);
          a.o(str, "java.util.Arrays.toString\(this\)");
       }else {
          objArray1 = objArray;
       }
       obj = obj+str+", backgroundGradientPoints=";
       tbackgroundG = this.backgroundGradientPoints;
       if (tbackgroundG != null) {
          str = Arrays.toString(tbackgroundG);
          a.o(str, "java.util.Arrays.toString\(this\)");
       }else {
          objArray1 = objArray;
       }
       obj = obj+str+", backgroundStretchablePic="+this.backgroundStretchablePic+", backgroundShimmerPicUrls=";
       tbackgroundG = this.backgroundShimmerPicUrls;
       if (tbackgroundG != null) {
          objArray = Arrays.toString(tbackgroundG);
          a.o(objArray, "java.util.Arrays.toString\(this\)");
       }
       return obj+objArray+')';
    }
}
