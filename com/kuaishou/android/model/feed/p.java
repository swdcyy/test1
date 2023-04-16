package com.kuaishou.android.model.feed.p;
import ok.h;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.FeedDeserializer;

public final class p implements h	// class@000b9e
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object apply(Object p0){
       return FeedDeserializer.a(p0);
    }
}
