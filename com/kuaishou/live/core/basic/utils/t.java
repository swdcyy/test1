package com.kuaishou.live.core.basic.utils.t;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import z12.x;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class t implements o	// class@0008f6
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final boolean apply(Object p0){
       return p0.getEntity() instanceof LiveStreamFeed;
    }
}
