package com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelData;
import java.io.Serializable;
import java.lang.Object;

public class LiveBottomBarPanelData implements Serializable	// class@000d65
{
    public boolean mDisableShowSelectedStatus;
    public int mFeatureId;
    public List mGroups;
    public LiveBottomBarPanelLandscapeBackgroundDrawable mLandscapeBackgroundDrawable;
    public int mLayoutType;
    public float mMaxHeightPercent;
    public int mMaxIconPerRow;
    public CharSequence mTitle;
    public static final long serialVersionUID = 0xfc48a9bf9b7cccfc;

    public void LiveBottomBarPanelData(){
       super();
    }
}
