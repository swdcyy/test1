package com.kwai.components.nearbymodel.model.n;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.components.nearbymodel.model.CityHotSpotFeed;

public final class n implements PhotoType$a	// class@000cd0
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final BaseFeed a(){
       return new CityHotSpotFeed();
    }
}
