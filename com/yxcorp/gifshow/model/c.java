package com.yxcorp.gifshow.model.c;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.String;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;

public final class c implements h	// class@001eb2
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return p0.getExtraMap().getExtra("feed_survey_meta");
    }
}
