package com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeBridgeParams;
import com.feature.post.bridge.karaoke.KaraokeBridgeBaseParams;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeBridgeParams$a;
import nsd.u;
import java.lang.String;
import java.lang.StringBuilder;

public final class KaraokeHelper$KaraokeBridgeParams extends KaraokeBridgeBaseParams	// class@001499
{
    public String duetMode;
    public String duetSourcePhotoId;
    public String duetTip;
    public long minDuration;
    public String musicId;
    public String musicType;
    public String purpose;
    public String recordMode;
    public String songMode;
    public static final KaraokeHelper$KaraokeBridgeParams$a Companion;

    static {
       KaraokeHelper$KaraokeBridgeParams.Companion = new KaraokeHelper$KaraokeBridgeParams$a(null);
    }
    public void KaraokeHelper$KaraokeBridgeParams(){
       super();
    }
    public final String getDuetMode(){
       return this.duetMode;
    }
    public final String getDuetSourcePhotoId(){
       return this.duetSourcePhotoId;
    }
    public final String getDuetTip(){
       return this.duetTip;
    }
    public final long getMinDuration(){
       return this.minDuration;
    }
    public final String getMusicId(){
       return this.musicId;
    }
    public final String getMusicType(){
       return this.musicType;
    }
    public final String getPurpose(){
       return this.purpose;
    }
    public final String getRecordMode(){
       return this.recordMode;
    }
    public final String getSongMode(){
       return this.songMode;
    }
    public final void setDuetMode(String p0){
       this.duetMode = p0;
    }
    public final void setDuetSourcePhotoId(String p0){
       this.duetSourcePhotoId = p0;
    }
    public final void setDuetTip(String p0){
       this.duetTip = p0;
    }
    public final void setMinDuration(long p0){
       this.minDuration = p0;
    }
    public final void setMusicId(String p0){
       this.musicId = p0;
    }
    public final void setMusicType(String p0){
       this.musicType = p0;
    }
    public final void setPurpose(String p0){
       this.purpose = p0;
    }
    public final void setRecordMode(String p0){
       this.recordMode = p0;
    }
    public final void setSongMode(String p0){
       this.songMode = p0;
    }
    public String toString(){
       return super.toString()+" duetMode = "+this.duetMode+" musicType = "+this.musicType+" musicId = "+this.musicId+' '+"\n"+"duetSourcePhotoId = "+this.duetSourcePhotoId+" duetTip = "+this.duetTip+" recordMode = "+this.recordMode+" \n songMode = "+this.songMode+" minDuration = "+this.minDuration+" purpost = "+this.purpose;
    }
}
