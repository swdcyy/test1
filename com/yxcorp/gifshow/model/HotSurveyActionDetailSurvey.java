package com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import java.io.Serializable;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class HotSurveyActionDetailSurvey implements Serializable	// class@001e25
{
    public int mSceneType;
    public String mSurveyId;
    public String mSurveyInfoId;
    public static final HotSurveyActionDetailSurvey$a Companion;
    public static final long serialVersionUID;

    static {
       HotSurveyActionDetailSurvey.Companion = new HotSurveyActionDetailSurvey$a(null);
    }
    public void HotSurveyActionDetailSurvey(){
       super();
    }
    public final int getMSceneType(){
       return this.mSceneType;
    }
    public final String getMSurveyId(){
       return this.mSurveyId;
    }
    public final String getMSurveyInfoId(){
       return this.mSurveyInfoId;
    }
    public final void setMSceneType(int p0){
       this.mSceneType = p0;
    }
    public final void setMSurveyId(String p0){
       this.mSurveyId = p0;
    }
    public final void setMSurveyInfoId(String p0){
       this.mSurveyInfoId = p0;
    }
}
