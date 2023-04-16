package com.kwai.feature.post.api.feature.upload.model.UploadResult;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class UploadResult implements Serializable	// class@0013e8
{
    public long mAiCutPhotoStyleId;
    public String mCaption;
    public String mCaptionTitle;
    public long mCreated;
    public long mDuration;
    public EditInfo mEditInfo;
    public FlashPhotoTemplate mFlashPhotoTemplate;
    public List mForwardResults;
    public Map mForwardStatsParams;
    public boolean mHasVote;
    public boolean mIsLongVideo;
    public boolean mIsPrivacy;
    public String mLocationCity;
    public long mLocationId;
    public String mLocationTitle;
    public PhotoMeta mMockCollectInfo;
    public long mMoodTemplateId;
    public String mPhotoId;
    public int mPhotoStatus;
    public String mShareInfo;
    public long mSnapShowDeadline;
    public String mStoryId;
    public int mTagHashType;
    public List mTagItems;
    public String mThumbUrl;
    public String mUserId;
    public String mVideoUrl;
    public static final UploadResult FAKE_UPLOAD_RESULT;
    public static final long serialVersionUID;

    static {
       UploadResult.FAKE_UPLOAD_RESULT = new UploadResult();
    }
    public void UploadResult(){
       super();
       this.mForwardStatsParams = new HashMap();
    }
    public List getForwardResults(){
       return this.mForwardResults;
    }
    public String getPhotoId(){
       return this.mPhotoId;
    }
    public String getShareParam(){
       Object[] obj = PatchProxy.apply(null, this, UploadResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mShareInfo)) {
          return this.mShareInfo;
       }
       obj = new Object[]{this.getUserId(),this.getPhotoId()};
       return String.format("userId=%s&photoId=%s", obj);
    }
    public long getSnapShowDeadline(){
       return this.mSnapShowDeadline;
    }
    public String getThumbUrl(){
       return this.mThumbUrl;
    }
    public String getUserId(){
       return this.mUserId;
    }
    public String getVideoUrl(){
       return this.mVideoUrl;
    }
    public void setPhotoId(String p0){
       this.mPhotoId = p0;
    }
}
