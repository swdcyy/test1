package com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveQuestionnaire implements Serializable	// class@000e03
{
    public long mDisplayDurationMs;
    public boolean mIsCanClose;
    public boolean mIsSubmitAnswer;
    public String mOptionBackgroundColor;
    public String mOptionFontColor;
    public CDNUrl[] mPicUrls;
    public List mQuestionClickableOptions;
    public String mQuestionId;
    public List mQuestionOptions;
    public String mQuestionnaireId;
    public String mRouteUrl;
    public String mSubTitle;
    public String mSubTitleFontColor;
    public String mTitle;
    public String mTitleFontColor;
    public static final long serialVersionUID = 0xa3614fd7f1ae3ffb;

    public void LiveQuestionnaire(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveQuestionnaire.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveQuestionnaire{mQuestionnaireId=\'"+this.mQuestionnaireId+'''+", mTitle="+this.mTitle+", mQuestionId="+this.mQuestionId+", mSubTitle="+this.mSubTitle+", mSubTitleFontColor="+this.mSubTitleFontColor+", mOptionFontColor="+this.mOptionFontColor+", mOptionBackgroundColor="+this.mOptionBackgroundColor+", mDisplayDurationMs="+this.mDisplayDurationMs+", mIsSubmitAnswer="+this.mIsSubmitAnswer+", mRouteUrl="+this.mRouteUrl+", mIsCanClose="+this.mIsCanClose+'}';
    }
}
