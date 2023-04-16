package com.kwai.components.nearbymodel.model.m;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.components.nearbymodel.model.BoundaryFeed;

public final class m implements PhotoType$a	// class@000ccf
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final BaseFeed a(){
       return new BoundaryFeed();
    }
}
