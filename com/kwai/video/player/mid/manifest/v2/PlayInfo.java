package com.kwai.video.player.mid.manifest.v2.PlayInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Integer;

public class PlayInfo implements Serializable, Cloneable	// class@000b6c
{
    public int mCdnTimeRangeLevel;
    public List mDisableAudio;

    public void PlayInfo(){
       super();
    }
    public PlayInfo clone(){
       Object obj = PatchProxy.apply(null, this, PlayInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public int getCdnTimeRangeLevel(){
       return this.mCdnTimeRangeLevel;
    }
    public List getDisableAudio(){
       return this.mDisableAudio;
    }
    public boolean isAllAudioDisabled(){
       PlayInfo obj = PatchProxy.apply(null, this, PlayInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mDisableAudio;
       if (obj != null && !obj.isEmpty()) {
          Iterator iterator = this.mDisableAudio.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().intValue() == -1) {
                return true;
             }
          }
       }
       return false;
    }
}
