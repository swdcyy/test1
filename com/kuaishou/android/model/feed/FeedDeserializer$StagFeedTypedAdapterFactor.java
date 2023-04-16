package com.kuaishou.android.model.feed.FeedDeserializer$StagFeedTypedAdapterFactor;
import zk.j;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.android.model.feed.FeedDeserializer$a;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import yp.q;
import java.lang.reflect.Type;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;
import java.lang.StringBuilder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.kuaishou.android.model.feed.FeedDeserializer;
import zk.i;
import com.google.gson.b;

public final class FeedDeserializer$StagFeedTypedAdapterFactor implements j	// class@00060b
{
    public final Map b;

    public void FeedDeserializer$StagFeedTypedAdapterFactor(){
       super();
       this.b = new ConcurrentHashMap();
    }
    public void FeedDeserializer$StagFeedTypedAdapterFactor(FeedDeserializer$a p0){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, FeedDeserializer$StagFeedTypedAdapterFactor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.getRawType();
       TypeAdapter typeAdapter = this.b.get(obj);
       if (typeAdapter != null) {
          return typeAdapter;
       }
       if (!q.b.a(obj)) {
          return null;
       }
       StringBuilder str = "adapter -> "+obj;
       FeedDeserializer$StagFeedTypedAdapterFactor tb = this.b;
       _monitor_enter(tb);
       TypeAdapter typeAdapter1 = this.b.get(obj);
       if (typeAdapter1 != null) {
          _monitor_exit(tb);
          return typeAdapter1;
       }else {
          TreeTypeAdapter treeTypeAdap = new TreeTypeAdapter(null, FeedDeserializer.c, p0, p1, this);
          this.b.put(obj, v8);
          _monitor_exit(tb);
          return v8;
       }
    }
}
