package com.kuaishou.live.common.core.component.music.bgm.model.LiveBgmAnchorMusic;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.music.Music;

public class LiveBgmAnchorMusic implements Serializable	// class@0016b5
{
    public boolean mIsLiked;
    public Music mMusic;
    public List mTags;
    public static final long serialVersionUID = 0x8330b134fe2f0534;

    public void LiveBgmAnchorMusic(){
       super();
    }
    public boolean equals(Object p0){
       LiveBgmAnchorMusic obj = PatchProxy.applyOneRefs(p0, this, LiveBgmAnchorMusic.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof LiveBgmAnchorMusic) {
          obj = this.mMusic;
          if (obj != null) {
             return obj.equals(p0.mMusic);
          }
       }
       return false;
    }
}
