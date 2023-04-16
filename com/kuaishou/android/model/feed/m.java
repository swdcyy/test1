package com.kuaishou.android.model.feed.m;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.AdAggregateTemplateFeed;

public final class m implements PhotoType$a	// class@000b94
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final BaseFeed a(){
       return new AdAggregateTemplateFeed();
    }
}
