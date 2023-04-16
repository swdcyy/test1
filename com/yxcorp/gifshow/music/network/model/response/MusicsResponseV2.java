package com.yxcorp.gifshow.music.network.model.response.MusicsResponseV2;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MusicsResponseV2 extends MusicsResponse	// class@002066
{
    public List mCategoryOptEntries;
    public MusicBanner mMusicBanner;
    public int mPageCount;
    public int mPageLimit;
    public static final long serialVersionUID = 0x1ecc7d14a77a23d9;

    public void MusicsResponseV2(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MusicsResponseV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MusicsResponse{mCursor=\'"+this.mCursor+'''+", mDegradedViaCdn="+this.mDegradedViaCdn+", mMusics="+this.mMusics+", mSpecialRecommendMusic="+this.mSpecialRecommendMusic+", mUssid=\'"+this.mUssid+'''+", mLlsid=\'"+this.mLlsid+'''+", mChannels="+this.mChannels+", mShowChannels="+this.mCategoryOptEntries+'}';
    }
}
