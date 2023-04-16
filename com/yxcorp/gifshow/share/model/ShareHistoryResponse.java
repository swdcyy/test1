package com.yxcorp.gifshow.share.model.ShareHistoryResponse;
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

public class ShareHistoryResponse implements CursorResponse, Serializable	// class@001bd7
{
    public String mCursor;
    public String mLlsid;
    public List mPhotos;
    public List mRecPhotos;
    public String title;
    public static final long serialVersionUID = 0xfea044743ff99c;

    public void ShareHistoryResponse(){
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
    public List getRecoItems(){
       return this.mRecPhotos;
    }
    public String getTitle(){
       return this.title;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, ShareHistoryResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
