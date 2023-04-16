package com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import la6.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public final class FeedsLiveResponse implements b	// class@001012
{
    public String mCursor;
    public String mLlsid;
    public List mQPhotos;

    public void FeedsLiveResponse(){
       super();
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, FeedsLiveResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
