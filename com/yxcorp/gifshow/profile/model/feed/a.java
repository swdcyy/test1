package com.yxcorp.gifshow.profile.model.feed.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.profile.model.feed.RewardNotFocusHostFeed;

public final class a implements PhotoType$a	// class@0013dc
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final BaseFeed a(){
       return new RewardNotFocusHostFeed();
    }
}
