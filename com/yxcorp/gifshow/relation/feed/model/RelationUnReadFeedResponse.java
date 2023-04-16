package com.yxcorp.gifshow.relation.feed.model.RelationUnReadFeedResponse;
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

public class RelationUnReadFeedResponse implements CursorResponse, Serializable	// class@001894
{
    public String mCursor;
    public String mLlsid;
    public boolean mNeedShowToast;
    public List mPhotoIds;
    public List mPhotos;
    public static final long serialVersionUID = 0xf7e84a4ceb8422ed;

    public void RelationUnReadFeedResponse(){
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
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, RelationUnReadFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
