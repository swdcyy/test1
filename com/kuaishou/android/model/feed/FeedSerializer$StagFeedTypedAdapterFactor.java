package com.kuaishou.android.model.feed.FeedSerializer$StagFeedTypedAdapterFactor;
import zk.j;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.android.model.feed.FeedSerializer$a;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.InvalidFeed;
import yp.q;
import java.lang.reflect.Type;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;
import java.lang.StringBuilder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.kuaishou.android.model.feed.FeedSerializer;
import zk.i;
import com.google.gson.b;

public final class FeedSerializer$StagFeedTypedAdapterFactor implements j	// class@00060e
{
    public final Map b;

    public void FeedSerializer$StagFeedTypedAdapterFactor(){
       super();
       this.b = new ConcurrentHashMap();
    }
    public void FeedSerializer$StagFeedTypedAdapterFactor(FeedSerializer$a p0){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, FeedSerializer$StagFeedTypedAdapterFactor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.getRawType();
       TypeAdapter typeAdapter = this.b.get(obj);
       if (typeAdapter != null) {
          return typeAdapter;
       }
       if (obj == BaseFeed.class || (obj == InvalidFeed.class || !q.b.a(obj))) {
          return null;
       }
       StringBuilder str = "adapter -> "+obj;
       FeedSerializer$StagFeedTypedAdapterFactor tb = this.b;
       _monitor_enter(tb);
       TypeAdapter typeAdapter1 = this.b.get(obj);
       if (typeAdapter1 != null) {
          _monitor_exit(tb);
          return typeAdapter1;
       }else {
          TreeTypeAdapter treeTypeAdap = new TreeTypeAdapter(FeedSerializer.a, null, p0, p1, this);
          this.b.put(obj, v8);
          _monitor_exit(tb);
          return v8;
       }
    }
}
