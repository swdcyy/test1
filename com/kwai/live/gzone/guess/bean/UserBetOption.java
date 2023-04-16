package com.kwai.live.gzone.guess.bean.UserBetOption;
import java.io.Serializable;
import java.lang.Object;

public class UserBetOption implements Serializable	// class@000d21
{
    public long mAmount;
    public BetOption mBetOption;
    public String mDisplayAmount;
    public String mDisplayExpectIncome;
    public String mDisplayNetIncome;
    public String mExpectIncome;
    public long mNetIncome;
    public int mStatus;

    public void UserBetOption(){
       super();
    }
}
