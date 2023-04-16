package com.yxcorp.gifshow.detail.findclassmate.SchoolFindClassmatesProfileFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kwai.feature.api.social.profile.model.ProfilePostGuideConfig;
import com.yxcorp.gifshow.model.ProfileTubeCardInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class SchoolFindClassmatesProfileFeedResponse implements CursorResponse, Serializable	// class@001503
{
    public String mCursor;
    public DraftGuideConfig mDraftGuideConfig;
    public String mLlsid;
    public int mMaxSize;
    public List mPhotos;
    public ProfilePostGuideConfig mPostGuideConfig;
    public String mPrevCursor;
    public ProfileTubeCardInfo mProfileTubeCardInfo;
    public String mVerifiedUrl;

    public void SchoolFindClassmatesProfileFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPhotos;
    }
    public String getLlsid(){
       return this.mLlsid;
    }
    public int getMaxSize(){
       return this.mMaxSize;
    }
    public ProfilePostGuideConfig getPostGuideConfig(){
       return this.mPostGuideConfig;
    }
    public String getPrevCursor(){
       return this.mPrevCursor;
    }
    public ProfileTubeCardInfo getProfileTubeCardInfo(){
       return this.mProfileTubeCardInfo;
    }
    public String getVerifiedUrl(){
       return this.mVerifiedUrl;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, SchoolFindClassmatesProfileFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
