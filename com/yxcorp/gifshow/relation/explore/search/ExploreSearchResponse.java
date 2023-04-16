package com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Boolean;
import la6.a;

public class ExploreSearchResponse implements Serializable, CursorResponse	// class@001872
{
    public String mCursor;
    public String mListId;
    public List mMixFeeds;
    public String mUssid;

    public void ExploreSearchResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       ArrayList uArrayList;
       ExploreSearchResponse obj = PatchProxy.apply(null, this, ExploreSearchResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMixFeeds;
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public String getUssid(){
       return this.mUssid;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, ExploreSearchResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
