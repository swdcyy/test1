package com.yxcorp.gifshow.detail.model.meta.f;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Feed;

public final class f implements PhotoType$a	// class@0015b4
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final BaseFeed a(){
       return new InterestManagementV3Feed();
    }
}
