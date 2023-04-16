package com.kuaishou.live.core.show.profilecard.photo.l$a;
import erd.g;
import com.kuaishou.live.core.show.profilecard.photo.l;
import java.lang.Object;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import qvb.n0;
import pkd.a;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager$CacheEntry;
import java.lang.System;
import android.util.LruCache;

public class l$a implements g	// class@000df0
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
       }else if(p0 != null){
          Iterator iterator = p0.getItems().iterator();
          while (iterator.hasNext()) {
             BaseFeed uBaseFeed = iterator.next();
             r1.o5(uBaseFeed, 5);
             r1.Y4(uBaseFeed, p0.getLlsid());
          }
          if (this.b.K()) {
             int i = 0;
             if (!a.g) {
                l$a tb = this.b;
                if (tb.p == null && tb.s == null) {
                label_0074 :
                   this.b.t = i;
                label_0078 :
                   tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoidOneRefs(p0, tb, l.class, "4") && !q.f(p0.getItems())) {
                      l u = tb.u;
                      if (u != null) {
                         String str = tb.h2();
                         if (!PatchProxy.applyVoidTwoRefs(str, p0, u, LiveProfileFeedCacheManager.class, "2")) {
                            u.a.put(str, new LiveProfileFeedCacheManager$CacheEntry(p0, (System.currentTimeMillis() + 0x7530)));
                         }
                      }
                   }
                }
             }
             if (p0.getItems() != null && (!p0.getItems().isEmpty() && r1.S2(p0.getItems().get(i)))) {
                this.b.t = true;
                p0.getItems().remove(i);
                goto label_0078 ;
             }else {
                goto label_0074 ;
             }
          }
       }
       return;
    }
}
