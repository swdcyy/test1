package com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.post.PostArguments;
import java.util.Map;
import com.kuaishou.android.post.LocationArg;
import com.kuaishou.android.model.mix.Location;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.android.post.StrArg;
import java.lang.String;
import com.google.gson.JsonElement;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$FinishCallBack;
import java.lang.StringBuilder;
import android.os.Bundle;
import java.util.Objects;
import android.content.Intent;

public class JsCameraCallbackParams$Param implements Serializable	// class@001487
{
    public PostArguments b;
    public String mActivity;
    public String mActivitySource;
    public String mAddress;
    public String mAlbumTabList;
    public boolean mAllowJumpFlashTemplate;
    public boolean mAllowReturnToCamera;
    public Map mArgsMap;
    public String mAtFriends;
    public ChallengeStickerInfo mChallengeStickerInfo;
    public String mChildMagicFaceId;
    public String mCity;
    public String mConversionTaskList;
    public String mCoverUploadUrl;
    public boolean mDisableAllScreenFrameMode;
    public boolean mDisableCameraTabBottomLine;
    public boolean mDisablePublishInfoEdit;
    public String mDisablePublishInfoEditToast;
    public boolean mDisableQuickPublish;
    public boolean mDisableUploadCompletedToast;
    public boolean mDisableUploadForbidDialog;
    public List mEndpointList;
    public JsonObject mExtActivityParams;
    public String mExternalTaskId;
    public JsCameraCallbackParams$FinishCallBack mFinishCallBack;
    public String mFlashGroupId;
    public String mFlashTemplateId;
    public boolean mForbidRecoverDraft;
    public String mFrom;
    public String mGrowthTaskScene;
    public boolean mHideAICut;
    public boolean mHideAlbumDraft;
    public boolean mHideSmartAlbum;
    public String mHttpEndpoint;
    public String mInitialCaption;
    public int mInteractStickerType;
    public boolean mIsFromAdShowcase;
    public double mLatitude;
    public double mLongitude;
    public String mMagicAutoSearchKeyword;
    public int mMagicAutoSearchSource;
    public int mMagicDownloadBarStyle;
    public String mMagicFaceId;
    public String mMagicName;
    public int mMockFeedOption;
    public String mMusicId;
    public int mMusicType;
    public boolean mNeedMusicDownloadIndicator;
    public JsCameraCallbackParams$PairedPhotoParams mPairedPhotoParams;
    public String mPanelType;
    public int mPoiCheckType;
    public String mPoiExtParam;
    public long mPoiId;
    public PosterActivityTabInfo mPosterActivityTabInfo;
    public boolean mReturnToOriginalPage;
    public boolean mReturnToWeb;
    public String mServiceLinkInfo;
    public boolean mShowHalfAlbum;
    public boolean mShowKuaishanPopupOnCameraPage;
    public String mSource;
    public String mTab;
    public String mTabList;
    public String mTag;
    public int mTaskType;
    public String mTitle;
    public String mTopic;
    public String mTopicSource;
    public String mTunaTaskInfo;
    public String mUploadId;
    public String mUploadToken;
    public int mVideoLengthType;
    public String mWorkboxGroupId;

    public void JsCameraCallbackParams$Param(){
       super();
       this.mMagicDownloadBarStyle = -1;
       this.mUploadId = "-1";
       this.mTaskType = Integer.MIN_VALUE;
    }
    public final void a(){
       if (this.b == null) {
          PostArguments postArgument = new PostArguments();
          this.b = postArgument;
          postArgument.parseFromMap(this.mArgsMap);
          this.b.getPublishLocation().set(this.generateLocation());
          this.b.getShareInitCaption().set(this.mInitialCaption);
          this.b.getServiceLinkInfo().set(this.mServiceLinkInfo);
          if (this.mExtActivityParams != null) {
             this.b.getExtActivityParams().set(this.mExtActivityParams.toString());
          }
          this.b.getDisableQuickPublish().set(Boolean.valueOf(this.mDisableQuickPublish));
       }
       return;
    }
    public Location generateLocation(){
       if (!this.mPoiId) {
          return null;
       }
       Location location = new Location();
       location.latitude = this.mLatitude;
       location.longitude = this.mLongitude;
       location.mAddress = this.mAddress;
       location.mId = this.mPoiId;
       location.mTitle = this.mTitle;
       location.mCity = this.mCity;
       location.mCheckType = this.mPoiCheckType;
       location.mExtParams = this.mPoiExtParam;
       return location;
    }
    public RickonWholeUploadParams generateWholeUploadParams(){
       RickonWholeUploadParams rickonWholeU = new RickonWholeUploadParams();
       rickonWholeU.mTaskId = this.mUploadId;
       rickonWholeU.mUploadToken = this.mUploadToken;
       rickonWholeU.mServerInfoList = this.mEndpointList;
       rickonWholeU.mCoverUploadUrl = this.mCoverUploadUrl;
       JsCameraCallbackParams$Param tmFinishCall = this.mFinishCallBack;
       rickonWholeU.mReportApi = tmFinishCall.mReportApi;
       rickonWholeU.mParams = tmFinishCall.mParams;
       rickonWholeU.mHttpEndpoint = this.mHttpEndpoint;
       return rickonWholeU;
    }
    public String toString(){
       return "Param{mVideoLengthType="+this.mVideoLengthType+", mTag=\'"+this.mTag+'''+", mTopic=\'"+this.mTopic+'''+", mMagicFaceId=\'"+this.mMagicFaceId+'''+", mChildMagicFaceId=\'"+this.mChildMagicFaceId+'''+", mMagicName=\'"+this.mMagicName+'''+", mMagicAutoSearchKeyword=\'"+this.mMagicAutoSearchKeyword+'''+", mMagicAutoSearchSource=\'"+this.mMagicAutoSearchSource+'''+", mPoiId="+this.mPoiId+", mAddress=\'"+this.mAddress+'''+", mLongitude="+this.mLongitude+", mLatitude="+this.mLatitude+", mTitle=\'"+this.mTitle+'''+", mActivity=\'"+this.mActivity+'''+", mReturnToWeb="+this.mReturnToWeb+'''+", mReturnToOriginalPage="+this.mReturnToOriginalPage+'''+", mFlashTemplateId=\'"+this.mFlashTemplateId+'''+", mFlashGroupId=\'"+this.mFlashGroupId+'''+", mAllowJumpFlashTemplate="+this.mAllowJumpFlashTemplate+", mMusicId=\'"+this.mMusicId+'''+", mMusicType="+this.mMusicType+", mAllowReturnToCamera="+this.mAllowReturnToCamera+", mPairedPhotoParams="+this.mPairedPhotoParams+", mConversionTaskList="+this.mConversionTaskList+", mServiceLinkInfo="+this.mServiceLinkInfo+", mTab="+this.mTab+", albumTabList="+this.mAlbumTabList+", mInitialCaption="+this.mInitialCaption+'}';
    }
    public void writeBundle(Bundle p0){
       this.a();
       JsCameraCallbackParams$Param tb = this.b;
       Objects.requireNonNull(tb);
       tb.write(p0);
    }
    public void writeIntent(Intent p0){
       this.a();
       JsCameraCallbackParams$Param tb = this.b;
       Objects.requireNonNull(tb);
       tb.write(p0);
    }
}
