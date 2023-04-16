package com.kuaishou.android.model.feed.FeedSerializer;
import zk.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler;
import yp.q;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;
import com.kuaishou.android.model.feed.FeedSerializer$StagFeedTypedAdapterFactor;
import com.kuaishou.android.model.feed.FeedSerializer$a;
import java.util.List;
import zk.j;
import fg6.a;
import lm8.a;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.kwai.robust.PatchProxyResult;
import fa6.c;

public class FeedSerializer implements i	// class@000610
{
    public static final FeedSerializer a;

    static {
       FeedSerializer.a = new FeedSerializer();
    }
    public void FeedSerializer(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, FeedSerializer.class, "1")) {
          return;
       }
       GsonLifeCycleEnabler.d().c(q.b);
       a.d(null, new FeedSerializer$StagFeedTypedAdapterFactor(null));
       return;
    }
    public JsonElement b(a p0,Type p1,h p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeedSerializer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a.d().serialize(p0, p1, p2);
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       return this.b(p0, p1, p2);
    }
}
