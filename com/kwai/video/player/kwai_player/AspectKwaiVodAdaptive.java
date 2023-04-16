package com.kwai.video.player.kwai_player.AspectKwaiVodAdaptive;
import com.kwai.video.player.kwai_player.AspectVodAdaptive;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Iterator;

public class AspectKwaiVodAdaptive implements AspectVodAdaptive	// class@000b2a
{
    public final IBuildKwaiPlayer mPlayer;
    public String mRateConfig;

    public void AspectKwaiVodAdaptive(IBuildKwaiPlayer p0,boolean p1){
       super();
       this.mPlayer = p0;
    }
    public void setAbrConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AspectKwaiVodAdaptive.class, "1")) {
          return;
       }
       this.mPlayer.setOption(1, "abr-config-string", p0);
       return;
    }
    public void setAbrDeviceInfoFactor(long p0,long p1){
       AspectKwaiVodAdaptive uAspectKwaiV = AspectKwaiVodAdaptive.class;
       if (PatchProxy.isSupport(uAspectKwaiV) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uAspectKwaiV, "8")) {
          return;
       }
       this.mPlayer.setOption(1, "abr-device-info-factor", p0);
       this.mPlayer.setOption(1, "device-general-score", p1);
       return;
    }
    public void setDeviceResolution(int p0,int p1){
       AspectKwaiVodAdaptive uAspectKwaiV = AspectKwaiVodAdaptive.class;
       if (PatchProxy.isSupport(uAspectKwaiV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAspectKwaiV, "2")) {
          return;
       }
       this.mPlayer.setOption(1, "device-resolution-width", (long)p0);
       this.mPlayer.setOption(1, "device-resolution-height", (long)p1);
       return;
    }
    public void setModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AspectKwaiVodAdaptive.class, "3")) {
          return;
       }
       this.mPlayer.setOption(1, "nn-model-path", p0);
       return;
    }
    public void setMp4AbrModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AspectKwaiVodAdaptive.class, "4")) {
          return;
       }
       this.mPlayer.setOption(1, "mp4-abr-model-path", p0);
       return;
    }
    public void setNetworkType(int p0){
       AspectKwaiVodAdaptive uAspectKwaiV = AspectKwaiVodAdaptive.class;
       if (PatchProxy.isSupport(uAspectKwaiV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAspectKwaiV, "5")) {
          return;
       }
       this.mPlayer.setOption(1, "device-network-type", (long)p0);
       return;
    }
    public void setRepQualityTypeBlackList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AspectKwaiVodAdaptive.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = "_";
       StringBuilder str1 = str;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          if (!str2.isEmpty()) {
             str1 = str1+str2+str;
          }
       }
       if (str1.length() > 0) {
          this.mPlayer.setOption(1, "rep-quality-type-black-list", str1);
       }
       return;
    }
    public void setRepQualityTypeWhiteList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AspectKwaiVodAdaptive.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = "_";
       StringBuilder str1 = str;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          if (!str2.isEmpty()) {
             str1 = str1+str2+str;
          }
       }
       if (str1.length() > 0) {
          this.mPlayer.setOption(1, "rep-quality-type-white-list", str1);
       }
       return;
    }
}
