package com.yxcorp.gifshow.reminder.news.data.NewsSlidePlayFeedResponse;
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

public class NewsSlidePlayFeedResponse implements CursorResponse, Serializable	// class@001af1
{
    public String mCursor;
    public String mLlsid;
    public List mPhotos;
    public static final long serialVersionUID = 0x55b9518052080530;

    public void NewsSlidePlayFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, NewsSlidePlayFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
