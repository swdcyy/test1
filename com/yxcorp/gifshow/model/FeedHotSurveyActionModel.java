package com.yxcorp.gifshow.model.FeedHotSurveyActionModel;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;

public final class FeedHotSurveyActionModel implements Serializable	// class@001e13
{
    public HotSurveyActionDetailSurvey mDetailSurvey;
    public int mResult;

    public void FeedHotSurveyActionModel(){
       super();
    }
    public final HotSurveyActionDetailSurvey getMDetailSurvey(){
       return this.mDetailSurvey;
    }
    public final int getMResult(){
       return this.mResult;
    }
    public final void setMDetailSurvey(HotSurveyActionDetailSurvey p0){
       this.mDetailSurvey = p0;
    }
    public final void setMResult(int p0){
       this.mResult = p0;
    }
}
