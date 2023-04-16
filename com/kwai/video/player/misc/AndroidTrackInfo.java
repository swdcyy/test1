package com.kwai.video.player.misc.AndroidTrackInfo;
import com.kwai.video.player.misc.ITrackInfo;
import android.media.MediaPlayer$TrackInfo;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.misc.IMediaFormat;
import android.media.MediaFormat;
import com.kwai.video.player.misc.AndroidMediaFormat;
import java.lang.Number;
import java.lang.StringBuilder;

public class AndroidTrackInfo implements ITrackInfo	// class@000b85
{
    public final MediaPlayer$TrackInfo mTrackInfo;

    public void AndroidTrackInfo(MediaPlayer$TrackInfo p0){
       super();
       this.mTrackInfo = p0;
    }
    public static AndroidTrackInfo[] fromMediaPlayer(MediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AndroidTrackInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AndroidTrackInfo.fromTrackInfo(p0.getTrackInfo());
    }
    public static AndroidTrackInfo[] fromTrackInfo(MediaPlayer$TrackInfo[] p0){
       Object obj = null;
       AndroidTrackInfo[] obj1 = PatchProxy.applyOneRefs(p0, obj, AndroidTrackInfo.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new AndroidTrackInfo[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          obj1[i] = new AndroidTrackInfo(p0[i]);
       }
       return obj1;
    }
    public IMediaFormat getFormat(){
       Object[] objArray = null;
       AndroidTrackInfo obj = PatchProxy.apply(objArray, this, AndroidTrackInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mTrackInfo;
       if (obj == null) {
          return objArray;
       }
       MediaFormat format = obj.getFormat();
       if (format == null) {
          return objArray;
       }
       return new AndroidMediaFormat(format);
    }
    public String getInfoInline(){
       AndroidTrackInfo obj = PatchProxy.apply(null, this, AndroidTrackInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mTrackInfo;
       if (obj != null) {
          return obj.toString();
       }
       return "null";
    }
    public String getLanguage(){
       AndroidTrackInfo obj = PatchProxy.apply(null, this, AndroidTrackInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mTrackInfo;
       if (obj == null) {
          return "und";
       }
       return obj.getLanguage();
    }
    public int getTrackType(){
       AndroidTrackInfo obj = PatchProxy.apply(null, this, AndroidTrackInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTrackInfo;
       if (obj == null) {
          return 0;
       }
       return obj.getTrackType();
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, AndroidTrackInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StringBuilder(128)+this.getClass().getSimpleName()+'{';
       AndroidTrackInfo tmTrackInfo = this.mTrackInfo;
       obj = (tmTrackInfo != null)? obj+tmTrackInfo.toString(): obj+"null";
       return obj+'}';
    }
}
