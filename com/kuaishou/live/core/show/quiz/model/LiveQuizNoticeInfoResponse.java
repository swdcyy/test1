package com.kuaishou.live.core.show.quiz.model.LiveQuizNoticeInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveQuizNoticeInfoResponse implements Serializable	// class@000e25
{
    public String mDisplayAwardUnit;
    public boolean mDisplayTitle;
    public String mDisplayTotalAwardAmount;
    public String mQuizNoticeImageUrl;
    public String mQuizStrategyUrl;
    public long mStartTimeMs;
    public String mSubtitle;
    public String mTitle;
    public static final long serialVersionUID = 0x4b78e97e444bd9d7;

    public void LiveQuizNoticeInfoResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveQuizNoticeInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveQuizNoticeInfoResponse{mTitle=\'"+this.mTitle+'''+", mSubtitle=\'"+this.mSubtitle+'''+", mDisplayTotalAwardAmount="+this.mDisplayTotalAwardAmount+", mDisplayAwardUnit=\'"+this.mDisplayAwardUnit+'''+", mStartTimeMs="+this.mStartTimeMs+", mQuizStrategyUrl="+this.mQuizStrategyUrl+", mQuizNoticeImageUrl=\'"+this.mQuizNoticeImageUrl+'''+'}';
    }
}
