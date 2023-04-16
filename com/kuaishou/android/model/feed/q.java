package com.kuaishou.android.model.feed.q;
import fa6.d;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Throwable;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.kuaishou.android.model.feed.FeedDeserializer;

public final class q implements d	// class@000621
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final void a(BaseFeed p0,Throwable p1,JsonElement p2,Type p3){
       FeedDeserializer.b(p0, p1, p2, p3);
    }
}
