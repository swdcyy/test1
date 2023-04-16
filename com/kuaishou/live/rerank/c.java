package com.kuaishou.live.rerank.c;
import erd.g;
import com.kuaishou.live.rerank.d;
import java.util.List;
import java.lang.Object;
import com.kuaishou.live.rerank.LiveRerankResponse;
import java.util.Objects;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.lang.String;
import pp.c;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import bp3.f;
import java.lang.Runnable;
import ekd.k1;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import com.kuaishou.live.rerank.LiveRerankFeedItem;
import java.lang.CharSequence;
import android.text.TextUtils;
import bp3.c;

public final class c implements g	// class@000f65
{
    public final d b;
    public final List c;

    public void c(d p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       LiveRerankLogTag lIVE_RERANK = LiveRerankLogTag.LIVE_RERANK;
       String str = "LiveRerankManager";
       lIVE_RERANK.appendTag(str);
       b.S(lIVE_RERANK, "requestRerankService success", "response", a.a.q(p0));
       tb.d = 0;
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "5")) {
       }else if(p0.mNextRequestDelaySeconds - false <= 0){
          tb.d = 2;
          b.S(lIVE_RERANK.appendTag(str), "arrangeNextRequest", "requestInterval", Long.valueOf(p0.mNextRequestDelaySeconds));
          LiveRerankResponse mNextRequest = p0.mNextRequestDelaySeconds;
          tb.c = mNextRequest;
          k1.s(new f(tb), tb, (mNextRequest * 1000));
       }
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (q.f(p0.mRerankFeedItems)) {
             x.z(qPhoto.mEntity, 4);
          }else {
             Iterator iterator1 = p0.mRerankFeedItems.iterator();
             int i = 0;
             while (iterator1.hasNext()) {
                LiveRerankFeedItem liveRerankFe = iterator1.next();
                if (TextUtils.equals(qPhoto.getPhotoId(), liveRerankFe.mLiveStreamId) && liveRerankFe.mLiveStreamFeed != null) {
                   i = 1;
                }else {
                   continue ;
                }
             }
             if (!i) {
                x.z(qPhoto.mEntity, 4);
             }
          }
       }
       if (!q.f(p0.mRerankFeedItems)) {
          tb.a.h0(p0.mRerankFeedItems);
       }
       return;
    }
}
