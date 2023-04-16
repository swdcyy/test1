package com.yxcorp.gifshow.follow.common.data.FeedsResponse;
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

public final class FeedsResponse implements CursorResponse, Serializable	// class@001014
{
    public String mCursor;
    public int mFollowPageTopFreshFeedCount;
    public String mLlsid;
    public boolean mNeedInvokePymkDialog;
    public int mPageTuringType;
    public List mPhotos;
    public String mPrSid;
    public static final long serialVersionUID = 0x78980a12829198e;

    public void FeedsResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, FeedsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
