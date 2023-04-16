package com.kwai.live.gzone.guess.bean.LiveGzoneTreasureBoxSignInPanelInfo$SignDayItem;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneTreasureBoxSignInPanelInfo$SignDayItem implements Serializable	// class@000d1b
{
    public int mDay;
    public String mFontColor;
    public CDNUrl[] mIcon;
    public String mKShell;
    public int mStatus;
    public static final long serialVersionUID = 0xe1bff0fa262e6147;

    public void LiveGzoneTreasureBoxSignInPanelInfo$SignDayItem(){
       super();
    }
    public boolean isHadSigned(){
       boolean b = (this.mStatus == 2)? true: false;
       return b;
    }
}
