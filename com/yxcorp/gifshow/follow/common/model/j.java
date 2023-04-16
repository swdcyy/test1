package com.yxcorp.gifshow.follow.common.model.j;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.common.model.NewsTilePicFeed;

public final class j implements PhotoType$a	// class@00107a
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final BaseFeed a(){
       return new NewsTilePicFeed();
    }
}
