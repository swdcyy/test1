package com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveMerchantChainPhotoFeedResponse implements Serializable, CursorResponse	// class@000ca5
{
    public LiveMerchantChainPhotoFeedResponse$ChainBottomConfig mChainBottomConfig;
    public String mCursor;
    public String mLinkedLiveTopUrl;
    public String mLivesEmptyTips;
    public List mQPhotos;
    public long mTimeStampMs;
    public static final long serialVersionUID = 0xb61e10ec430f99d2;

    public void LiveMerchantChainPhotoFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantChainPhotoFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
