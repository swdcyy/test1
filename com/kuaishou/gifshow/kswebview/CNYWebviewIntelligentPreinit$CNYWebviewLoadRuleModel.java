package com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Long;

public class CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel implements Serializable	// class@0019ce
{
    public Long mEndTime;
    public int mFrequency;
    public String mId;
    public int mLoadRule;
    public Long mStartTime;
    public static final long serialVersionUID = 0x8e72876991d71ccc;

    public void CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel(){
       super();
       this.mId = "unset";
       this.mLoadRule = -1;
       Long longx = Long.valueOf(-1);
       this.mStartTime = longx;
       this.mEndTime = longx;
       this.mFrequency = -1;
    }
}
