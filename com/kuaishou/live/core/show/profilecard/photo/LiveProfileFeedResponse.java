package com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedResponse;
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

public class LiveProfileFeedResponse implements CursorResponse, Serializable	// class@000ddb
{
    public String mCursor;
    public String mLlsid;
    public List mPhotos;
    public String mVerifiedUrl;

    public void LiveProfileFeedResponse(){
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
    public String getVerifiedUrl(){
       return this.mVerifiedUrl;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveProfileFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
