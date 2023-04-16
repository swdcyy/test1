package com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor$b$a;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor$b;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor;
import java.util.List;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Iterator;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.StringBuilder;
import yga.c;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.concurrent.CopyOnWriteArrayList;
import xga.c;

public final class FollowPreFetchFeedProcessor$b$a implements g	// class@00116b
{
    public final FollowPreFetchFeedProcessor$b b;

    public void FollowPreFetchFeedProcessor$b$a(FollowPreFetchFeedProcessor$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPreFetchFeedProcessor$b$a.class, "1")) {
       }else {
          FollowPreFetchFeedProcessor a = this.b.a.a;
          if (a != null) {
             List items = a.getItems();
             if (items != null) {
                Iterator iterator = items.iterator();
                if (iterator != null) {
                   FollowPreFetchFeedProcessor a1 = this.b.a.a;
                   int i = 0;
                   if (a1 != null) {
                      List items1 = a1.getItems();
                      if (items1 != null) {
                         i1 = items1.size();
                      label_0037 :
                         c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("FollowPreFetchFeedProcessor"), "onLiveStatusResponse - preSize "+i1);
                         while (iterator.hasNext()) {
                            QPhoto qPhoto = iterator.next();
                            a.o(p0, "entries");
                            Iterator iterator1 = p0.iterator();
                            while (iterator1.hasNext()) {
                               Map$Entry uEntry = iterator1.next();
                               a.o(qPhoto, "photo");
                               if (TextUtils.n(uEntry.getKey(), qPhoto.getUserId()) && !uEntry.getValue().booleanValue()) {
                                  qPhoto.setCloseLive(true);
                                  BaseFeed entity = qPhoto.getEntity();
                                  if (!entity instanceof LiveStreamFeed) {
                                     entity = null;
                                  }
                                  if (entity != null) {
                                     FollowPreFetchFeedProcessor d = this.b.a.d;
                                     if (d != null) {
                                        d.remove(entity);
                                     }
                                  }
                                  iterator.remove();
                                  c.a("live_end", "follow_stagger", qPhoto);
                               }
                            }
                         }
                         p0 = this.b.a.a;
                         if (p0 != null) {
                            p0 = p0.getItems();
                            if (p0 != null) {
                               i = p0.size();
                            }
                         }
                         c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("FollowPreFetchFeedProcessor"), "onLiveStatusResponse - afterSize "+i);
                      }
                   }
                   i1 = 0;
                   goto label_0037 ;
                }
             }
          }
       }
       return;
    }
}
