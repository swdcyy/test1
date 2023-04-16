package com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;
import java.lang.StringBuilder;

public class MusicsResponse implements CursorResponse, Serializable	// class@002065
{
    public List mChannels;
    public String mCursor;
    public boolean mDegradedViaCdn;
    public boolean mDisplayPhotoCount;
    public List mHiddenChannels;
    public String mLlsid;
    public List mMusics;
    public MusicPhotoCardsData mPhotoCardsData;
    public List mPhotos;
    public int mPhotosLocation;
    public MusicRecommendInfo mRecommendInfo;
    public String mRecommendTitle;
    public List mShowChannels;
    public List mSpecialRecommendMusic;
    public String mUssid;
    public static final long serialVersionUID = 0xa7abd69c33271478;

    public void MusicsResponse(){
       super();
       this.mDegradedViaCdn = false;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mMusics;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, MusicsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MusicsResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MusicsResponse{mCursor=\'"+this.mCursor+'''+", mDegradedViaCdn="+this.mDegradedViaCdn+", mMusics="+this.mMusics+", mSpecialRecommendMusic="+this.mSpecialRecommendMusic+", mUssid=\'"+this.mUssid+'''+", mLlsid=\'"+this.mLlsid+'''+", mChannels="+this.mChannels+", mShowChannels="+this.mShowChannels+", mHiddenChannels="+this.mHiddenChannels+", mDisplayPhotoCount="+this.mDisplayPhotoCount+", mPhotosLocation="+this.mPhotosLocation+", mPhotos="+this.mPhotos+'}';
    }
}
