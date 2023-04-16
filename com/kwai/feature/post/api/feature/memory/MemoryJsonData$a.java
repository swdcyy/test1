package com.kwai.feature.post.api.feature.memory.MemoryJsonData$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MemoryJsonData$a	// class@0013af
{
    public float mClippedRangeDuration;
    public boolean mIsFilterStyle;
    public boolean mIsVocal;
    public boolean mMatchMusicBeat;
    public int[] mRect;
    public List mSubAssets;
    public long mTime;
    public String mTrackAssetPath;

    public void MemoryJsonData$a(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemoryJsonData$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TrackAssetJson{mTrackAssetPath=\'"+this.mTrackAssetPath+'''+", mClippedRangeDuration="+this.mClippedRangeDuration+", mIsVocal="+this.mIsVocal+", mSubAsset="+this.mSubAssets+'}';
    }
}
