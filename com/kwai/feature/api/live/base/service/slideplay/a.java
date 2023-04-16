package com.kwai.feature.api.live.base.service.slideplay.a;
import ok.o;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class a implements o	// class@000fb2
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       return p0 instanceof LiveStreamFeed;
    }
}
