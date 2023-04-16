package com.kuaishou.live.core.show.topic.api.LiveAudienceTopicFlowResponse;
import java.io.Serializable;
import mkd.a;
import com.kwai.framework.model.response.CursorResponse;
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

public class LiveAudienceTopicFlowResponse implements Serializable, a, CursorResponse	// class@0011dc
{
    public String mCursor;
    public List mItems;
    public LiveTopicHeaderInfo mLiveTopicInfo;
    public String mLlsid;
    public LiveAudienceTopicRecommendUserListInfo mRecommendUserListInfo;
    public static final long serialVersionUID = 0xabbfd66df016d82f;

    public void LiveAudienceTopicFlowResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicFlowResponse.class, "2")) {
          return;
       }
       if (!q.f(this.mItems)) {
          Iterator iterator = this.mItems.iterator();
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
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceTopicFlowResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
