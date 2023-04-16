package com.kuaishou.android.model.feed.LiveStreamFeedWrapperDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public class LiveStreamFeedWrapperDeserializer implements b	// class@000b18
{

    public void LiveStreamFeedWrapperDeserializer(){
       super();
    }
    public LiveStreamFeedWrapper a(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveStreamFeedWrapperDeserializer.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new LiveStreamFeedWrapper(p2.c(p0, LiveStreamFeed.class));
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.a(p0, p1, p2);
    }
}
