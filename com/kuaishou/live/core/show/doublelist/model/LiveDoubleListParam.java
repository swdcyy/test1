package com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import java.io.Serializable;
import java.lang.Object;

public class LiveDoubleListParam implements Serializable	// class@000afe
{
    public int mCardStyle;
    public int mCornerRadiusDp;
    public Map mLogExtraParamMap;
    public int mSummaryContainerHeightDp;
    public int mSummaryMode;
    public String mTitle;
    public int mType;
    public boolean mUseChannelFbReason;
    public static final long serialVersionUID = 0x2c9493d1c6d86059;

    public void LiveDoubleListParam(){
       super();
       this.mCornerRadiusDp = -1;
       this.mSummaryContainerHeightDp = 25;
    }
}
