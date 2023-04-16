package com.kuaishou.android.model.feed.n;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.m;
import com.kuaishou.android.model.feed.PhotoType$a;
import com.kuaishou.android.model.feed.AdAggregateTemplateFeed;
import com.kuaishou.android.model.feed.l;
import ok.h;
import kp.w1;
import yp.q;

public class n	// class@000b95
{

    public void n(){
       super();
    }
    public static PhotoType a(BaseFeed p0){
       return n.b(p0);
    }
    public static PhotoType b(BaseFeed p0){
       return PhotoType.AD_FEED_AGGREGATE_TEMPLATE;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, n.class, "1")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.AD_FEED_AGGREGATE_TEMPLATE, m.a);
       return;
    }
    public static void d(){
       if (PatchProxy.applyVoid(null, null, n.class, "2")) {
          return;
       }
       w1.u(AdAggregateTemplateFeed.class, l.b);
       return;
    }
    public static void e(){
       if (PatchProxy.applyVoid(null, null, n.class, "3")) {
          return;
       }
       q.d(AdAggregateTemplateFeed.class);
       return;
    }
}
