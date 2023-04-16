package com.kwai.live.gzone.guess.bean.ResultOption;
import java.io.Serializable;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.bean.BetOption;
import java.lang.Object;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.guess.bean.UserBetOption;

public class ResultOption implements Serializable	// class@000d1e
{
    public long mAmount;
    public String mDisplayExpectIncome;
    public String mDisplayIncome;
    public long mIncome;
    public KShellGuessResultStatus mKShellGuessResultStatus;
    public String mText;
    public boolean mUninvolved;
    public static final long serialVersionUID = 0xf1613c59cacc1102;

    public void ResultOption(BetOptionInfo p0,BetOption p1){
       super();
       this.mUninvolved = true;
       p0 = p0.mBetOption;
       this.mText = p0.mContent;
       if (p1 == null) {
          this.mKShellGuessResultStatus = KShellGuessResultStatus.ABORT;
       }else if(TextUtils.n(p0.mOptionId, p1.mOptionId)){
          this.mKShellGuessResultStatus = KShellGuessResultStatus.WIN;
       }else {
          this.mKShellGuessResultStatus = KShellGuessResultStatus.LOSE;
       }
       return;
    }
    public void ResultOption(UserBetOption p0){
       super();
       boolean b = true;
       if (p0 == null) {
          this.mUninvolved = b;
          this.mKShellGuessResultStatus = KShellGuessResultStatus.UNKNOWN;
       }else {
          KShellGuessResultStatus kShellGuessR = KShellGuessResultStatus.fromStatus(p0.mStatus);
          this.mKShellGuessResultStatus = kShellGuessR;
          if (kShellGuessR == KShellGuessResultStatus.UNKNOWN) {
             this.mUninvolved = b;
          }
          this.mIncome = p0.mNetIncome;
          this.mDisplayExpectIncome = p0.mDisplayExpectIncome;
          this.mDisplayIncome = p0.mDisplayNetIncome;
          this.mAmount = p0.mAmount;
          this.mText = p0.mBetOption.mContent;
       }
       return;
    }
}
