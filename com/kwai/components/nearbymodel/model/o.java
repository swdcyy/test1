package com.kwai.components.nearbymodel.model.o;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;

public final class o implements PhotoType$a	// class@000cd1
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final BaseFeed a(){
       return new LocalCoverAggregateFeed();
    }
}
