package com.yxcorp.gifshow.detail.fragments.milano.commonfeedslide.network.feed.CommonFeedSlideResponse;
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

public class CommonFeedSlideResponse implements CursorResponse, Serializable	// class@001512
{
    public String mCursor;
    public String mInjectToastText;
    public String mLlsid;
    public String mMsg;
    public String mPassthroughExtraInfo;
    public List mQPhotos;
    public XinhuiDetailSurveyModel mXinhuiDetailSurvey;
    public static final long serialVersionUID = 0xad1c34ee3cf10fba;

    public void CommonFeedSlideResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CommonFeedSlideResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
