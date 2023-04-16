package com.kwai.feature.api.feed.misc.bridge.RnMusicPlayerParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.music.Music;

public class RnMusicPlayerParams implements Serializable	// class@000f60
{
    public boolean isLoadMore;
    public Music mCurrentMusic;
    public boolean mIsFromClick;
    public List mMusicList;
    public int mPlayingMusicTabId;
    public static final long serialVersionUID = 0xa0ada300d00c3f52;

    public void RnMusicPlayerParams(){
       super();
    }
    public String getCurrentMusicId(){
       RnMusicPlayerParams obj = PatchProxy.apply(null, this, RnMusicPlayerParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCurrentMusic;
       if (obj != null) {
          return obj.getUniqueCode();
       }
       return "";
    }
}
