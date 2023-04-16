package com.kuaishou.live.core.show.doublelist.response.LiveDoubleListFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListRefreshData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveDoubleListFeedResponse implements CursorResponse, Serializable, a	// class@000b01
{
    public String mCursor;
    public LiveDoubleListRefreshData mData;
    public List mFeeds;
    public String mLlsid;
    public String mPageTitle;
    public static final long serialVersionUID = 0x2fc34d7c9bc2cfb6;

    public void LiveDoubleListFeedResponse(){
       super();
    }
    public void afterDeserialize(){
       Iterator iterator;
       if (PatchProxy.applyVoid(null, this, LiveDoubleListFeedResponse.class, "4")) {
          return;
       }
       if (!q.f(this.mFeeds)) {
          iterator = this.mFeeds.iterator();
          while (iterator.hasNext()) {
             iterator.next().setListLoadSequenceID(this.mLlsid);
          }
       }
       LiveDoubleListFeedResponse tmData = this.mData;
       if (tmData != null && !q.f(tmData.mFeeds)) {
          iterator = this.mData.mFeeds.iterator();
          while (iterator.hasNext()) {
             iterator.next().setListLoadSequenceID(this.mLlsid);
          }
       }
       return;
    }
    public String getCursor(){
       LiveDoubleListFeedResponse tmCursor;
       LiveDoubleListRefreshData obj = PatchProxy.apply(null, this, LiveDoubleListFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isDownPage())? this.mData.mCursor: this.mCursor;
       return obj;
    }
    public List getItems(){
       LiveDoubleListFeedResponse tmFeeds;
       LiveDoubleListRefreshData obj = PatchProxy.apply(null, this, LiveDoubleListFeedResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isDownPage())? this.mData.mFeeds: this.mFeeds;
       return obj;
    }
    public boolean hasMore(){
       LiveDoubleListFeedResponse tmCursor;
       LiveDoubleListRefreshData obj = PatchProxy.apply(null, this, LiveDoubleListFeedResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = (this.isDownPage())? this.mData.mCursor: this.mCursor;
       return a.a(obj);
    }
    public boolean isDownPage(){
       boolean b = (this.mData != null)? true: false;
       return b;
    }
}
