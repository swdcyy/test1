package com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveBottomBarConfigResponse implements Serializable	// class@000d5d
{
    public LiveBottomServerConfig$BottomBarConfig mBottomBarEntry;
    public Map mButtonData;
    public Map mButtonLayout;
    public List mFunctionFoldPriorityEntry;
    public int mMaxIconPerRow;
    public Map mOrderedExcludedMap;
    public static final long serialVersionUID = 0x54f7acae6bff815e;

    public void LiveBottomBarConfigResponse(){
       super();
    }
}
