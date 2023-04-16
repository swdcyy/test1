package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveCommonConfigResponse$BottomItemConfig implements Serializable	// class@000e7f
{
    public int mLandscapeMaxCount;
    public int mPortraitMaxCount;
    public List mPriorityList;
    public static final long serialVersionUID = 0x1091acae4db14c13;

    public void LiveCommonConfigResponse$BottomItemConfig(){
       super();
       this.mPriorityList = new ArrayList();
       this.mLandscapeMaxCount = 6;
       this.mPortraitMaxCount = 4;
    }
}
