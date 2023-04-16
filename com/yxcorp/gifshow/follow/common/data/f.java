package com.yxcorp.gifshow.follow.common.data.f;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.common.data.SurveyFeed;

public final class f implements PhotoType$a	// class@001035
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final BaseFeed a(){
       return new SurveyFeed();
    }
}
