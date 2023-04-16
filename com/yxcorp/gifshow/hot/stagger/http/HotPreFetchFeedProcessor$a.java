package com.yxcorp.gifshow.hot.stagger.http.HotPreFetchFeedProcessor$a;
import sc5.f;
import com.yxcorp.gifshow.hot.stagger.http.HotPreFetchFeedProcessor;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Collection;
import ekd.q;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.concurrent.CopyOnWriteArrayList;

public final class HotPreFetchFeedProcessor$a implements f	// class@0018a4
{
    public final HotPreFetchFeedProcessor a;

    public void HotPreFetchFeedProcessor$a(HotPreFetchFeedProcessor p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       HotPreFetchFeedProcessor a;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotPreFetchFeedProcessor$a.class, "1")) {
          return;
       }
       a.p(p0, "userIdsStatus");
       a = this.a.a;
       List items = (a != null)? a.getItems(): null;
       if (q.f(items)) {
          return;
       }else {
          Set set = p0.entrySet();
          a = this.a.a;
          if (a != null) {
             items = a.getItems();
             if (items != null) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = items.iterator();
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   Object obj1 = obj;
                   Iterator iterator1 = set.iterator();
                   while (true) {
                      boolean b = true;
                      if (iterator1.hasNext()) {
                         Map$Entry uEntry = iterator1.next();
                         a.o(obj1, "it");
                         if (TextUtils.n(uEntry.getKey(), obj1.getUserId()) && !uEntry.getValue().booleanValue()) {
                            obj1.setCloseLive(b);
                            BaseFeed entity = obj1.getEntity();
                            if (!entity instanceof LiveStreamFeed) {
                               entity = null;
                            }
                            if (entity != null) {
                               HotPreFetchFeedProcessor d = this.a.d;
                               if (d != null) {
                                  d.remove(entity);
                               }
                            }
                            HotPreFetchFeedProcessor a1 = this.a.a;
                            if (a1 != null) {
                               List items1 = a1.getItems();
                               if (items1 != null) {
                                  items1.remove(obj1);
                               }
                            }
                         }
                      }else {
                         b = false;
                      }
                      if (b) {
                         uArrayList.add(obj);
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
          this.a.c();
          return;
       }
    }
}
