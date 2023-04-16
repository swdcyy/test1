package com.kwai.video.player.misc.KsTrackInfo;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.KsMediaMeta$KSYStreamMeta;
import java.lang.Object;
import com.kwai.video.player.misc.IMediaFormat;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.misc.KsMediaFormat;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KsTrackInfo implements ITrackInfo	// class@000b93
{
    public KsMediaMeta$KSYStreamMeta mStreamMeta;
    public int mTrackType;

    public void KsTrackInfo(KsMediaMeta$KSYStreamMeta p0){
       super();
       this.mTrackType = 0;
       this.mStreamMeta = p0;
    }
    public IMediaFormat getFormat(){
       Object obj = PatchProxy.apply(null, this, KsTrackInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KsMediaFormat(this.mStreamMeta);
    }
    public String getInfoInline(){
       StringBuilder obj = PatchProxy.apply(null, this, KsTrackInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StringBuilder(128);
       KsTrackInfo tmTrackType = this.mTrackType;
       if (tmTrackType != 1) {
          if (tmTrackType != 2) {
             if (tmTrackType != 3) {
                obj = (tmTrackType != 4)? obj+"UNKNOWN": obj+"SUBTITLE";
             }else {
                obj = obj+"TIMEDTEXT";
             }
          }else {
             obj = obj+"AUDIO"+", "+this.mStreamMeta.getCodecShortNameInline()+", "+this.mStreamMeta.getBitrateInline()+", "+this.mStreamMeta.getSampleRateInline();
          }
       }else {
          obj = obj+"VIDEO"+", "+this.mStreamMeta.getCodecShortNameInline()+", "+this.mStreamMeta.getBitrateInline()+", "+this.mStreamMeta.getResolutionInline();
       }
       return obj;
    }
    public String getLanguage(){
       KsTrackInfo obj = PatchProxy.apply(null, this, KsTrackInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStreamMeta;
       if (obj == null || TextUtils.isEmpty(obj.mLanguage)) {
          return "und";
       }
       return this.mStreamMeta.mLanguage;
    }
    public int getTrackType(){
       return this.mTrackType;
    }
    public void setMediaMeta(KsMediaMeta$KSYStreamMeta p0){
       this.mStreamMeta = p0;
    }
    public void setTrackType(int p0){
       this.mTrackType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsTrackInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getClass().getSimpleName()+'{'+this.getInfoInline()+"}";
    }
}
