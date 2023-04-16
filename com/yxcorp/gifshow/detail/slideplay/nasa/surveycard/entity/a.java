package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed;

public final class a implements PhotoType$a	// class@0017cf
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final BaseFeed a(){
       return new SurveyBigCardFeed();
    }
}
