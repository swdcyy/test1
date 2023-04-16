package com.kuaishou.live.rerank.LiveRerankResponse;
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
import com.kuaishou.live.rerank.LiveRerankFeedItem;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class LiveRerankResponse implements Serializable, a	// class@000f62
{
    public String mListLoadSequenceID;
    public long mNextRequestDelaySeconds;
    public List mRerankFeedItems;
    public String mToastWhenReplacedFeedFirstShow;
    public static final long serialVersionUID = 0x13ade0cf714fbc8b;

    public void LiveRerankResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveRerankResponse.class, "1")) {
          return;
       }
       if (!q.f(this.mRerankFeedItems)) {
          Iterator iterator = this.mRerankFeedItems.iterator();
          while (iterator.hasNext()) {
             LiveRerankFeedItem mLiveStreamF = iterator.next().mLiveStreamFeed;
             if (mLiveStreamF != null) {
                r1.Y4(mLiveStreamF, this.mListLoadSequenceID);
             }
          }
       }
       return;
    }
}
