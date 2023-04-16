package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.b;
import com.yxcorp.gifshow.entity.QPhoto$b;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed;

public final class b implements QPhoto$b	// class@0017d0
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Boolean a(BaseFeed p0){
       return SurveyBigCardFeed.lambda$addInvalidFeedChecker$0(p0);
    }
}
