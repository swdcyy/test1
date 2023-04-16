package com.yxcorp.gifshow.follow.common.data.g;
import com.yxcorp.gifshow.entity.QPhoto$b;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.common.data.SurveyFeed;

public final class g implements QPhoto$b	// class@001036
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final Boolean a(BaseFeed p0){
       return SurveyFeed.lambda$addInvalidFeedChecker$0(p0);
    }
}
