package com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;
import java.io.Serializable;
import o57.b;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public class LiveGzoneAudienceGuessQuestion extends b implements Serializable	// class@000d16
{
    public String mBetId;
    public List mBetOptionInfos;
    public int mIndex;
    public long mPredictionId;
    public long mRemainTime;
    public BetOption mRightBetOption;
    public int mStatus;
    public String mTitle;

    public void LiveGzoneAudienceGuessQuestion(){
       super();
    }
    public BetOptionInfo getFirstOption(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveGzoneAudienceGuessQuestion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mBetOptionInfos.size() == 2) {
          return this.mBetOptionInfos.get(0);
       }
       return objArray;
    }
    public BetOptionInfo getSecondOption(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveGzoneAudienceGuessQuestion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mBetOptionInfos.size() == 2) {
          return this.mBetOptionInfos.get(1);
       }
       return objArray;
    }
}
