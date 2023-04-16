package com.yxcorp.gifshow.detail.model.meta.d;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed;

public final class d implements PhotoType$a	// class@0015b2
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final BaseFeed a(){
       return new InterestManagementFeed();
    }
}
