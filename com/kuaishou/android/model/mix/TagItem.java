package com.kuaishou.android.model.mix.TagItem;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class TagItem implements Serializable	// class@000e18
{
    public List mCommonLabel;
    public int mCount;
    public long mDurationPlayTrail;
    public boolean mHideArtist;
    public String mId;
    public TagItem$InitiatorPhoto mInitiatorPhoto;
    public boolean mIsCollected;
    public boolean mIsCollecting;
    public boolean mIsKaraoke;
    public String mKsOrderId;
    public LyricItemEntity mLyricLabel;
    public MagicEmoji$MagicFace mMagicFace;
    public Music mMusic;
    public String mName;
    public String mPhotoLlsid;
    public boolean mRich;
    public String mSearchUssid;
    public boolean mShowed;
    public String mTag;
    public List mTagIconUrls;
    public String mUserName;
    public int mViewAdapterPosition;
    public long playCount;
    public static final long serialVersionUID = 0xd1f678f2f8f79d41;

    public void TagItem(){
       super();
       this.mInitiatorPhoto = new TagItem$InitiatorPhoto();
    }
    public boolean equals(Object p0){
       TagItem obj = PatchProxy.applyOneRefs(p0, this, TagItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof TagItem) {
          obj = this.mTag;
          if (obj != null) {
             TagItem mTag = p0.mTag;
             if (mTag != null) {
                return obj.equals(mTag);
             }
          }
       }
       return super.equals(p0);
    }
    public String getPhotoLlsid(){
       return this.mPhotoLlsid;
    }
    public String getSearchUssid(){
       return this.mSearchUssid;
    }
    public void setPhotoLlsid(String p0){
       this.mPhotoLlsid = p0;
    }
    public void setSearchUssid(String p0){
       this.mSearchUssid = p0;
    }
}
