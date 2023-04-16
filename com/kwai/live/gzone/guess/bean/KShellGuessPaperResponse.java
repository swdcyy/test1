package com.kwai.live.gzone.guess.bean.KShellGuessPaperResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;

public class KShellGuessPaperResponse implements Serializable, a	// class@000d13
{
    public String mAcrossLivePredictionHistoryUrl;
    public KShellGuessPaperResponse$AutoBet mAutoBet;
    public List mBets;
    public KShellGuessConfig mConfig;
    public String mLotteryPanelH5Url;
    public int mMyBetStatus;
    public String mReportUrl;
    public long mServerTime;
    public long mTotalKShell;
    public List mUserBetInfos;
    public static final long serialVersionUID = 0x809dac55ba03b190;

    public void KShellGuessPaperResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, KShellGuessPaperResponse.class, "1")) {
          return;
       }
       KShellGuessPaperResponse tmBets = this.mBets;
       if (tmBets == null) {
          return;
       }
       int i = tmBets.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.mBets.get(i1).mIndex = i1;
       }
       return;
    }
}
