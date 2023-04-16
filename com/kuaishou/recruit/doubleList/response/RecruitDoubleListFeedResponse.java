package com.kuaishou.recruit.doubleList.response.RecruitDoubleListFeedResponse;
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
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class RecruitDoubleListFeedResponse implements CursorResponse, Serializable, a	// class@000eae
{
    public String mCursor;
    public List mFeeds;
    public String mLlsid;
    public static final long serialVersionUID = 0x2fc34d7c9bc2cfb6;

    public void RecruitDoubleListFeedResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RecruitDoubleListFeedResponse.class, "2")) {
          return;
       }
       if (!q.f(this.mFeeds)) {
          Iterator iterator = this.mFeeds.iterator();
          while (iterator.hasNext()) {
             iterator.next().setListLoadSequenceID(this.mLlsid);
          }
       }
       return;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mFeeds;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
