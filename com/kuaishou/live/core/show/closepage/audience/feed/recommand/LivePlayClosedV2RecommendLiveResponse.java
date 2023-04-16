package com.kuaishou.live.core.show.closepage.audience.feed.recommand.LivePlayClosedV2RecommendLiveResponse;
import java.io.Serializable;
import mkd.a;
import la6.b;
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

public class LivePlayClosedV2RecommendLiveResponse implements Serializable, a, b	// class@000a47
{
    public String mCursor;
    public String mLiveStreamEndType;
    public String mLlsid;
    public LivePlayClosedRecommendLiveAutoPlay mRecommendLiveAutoPlay;
    public List mRecommendLives;
    public static final long serialVersionUID = 0x95fee3386c09646a;

    public void LivePlayClosedV2RecommendLiveResponse(){
       super();
       this.mLiveStreamEndType = "0";
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LivePlayClosedV2RecommendLiveResponse.class, "2")) {
          return;
       }
       if (!q.f(this.mRecommendLives)) {
          Iterator iterator = this.mRecommendLives.iterator();
          while (iterator.hasNext()) {
             iterator.next().setListLoadSequenceID(this.mLlsid);
          }
       }
       return;
    }
    public List getItems(){
       return this.mRecommendLives;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LivePlayClosedV2RecommendLiveResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
