package com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarRefreshData;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveSquareSideBarRefreshData implements Serializable	// class@000cab
{
    public List mBanners;
    public String mCursor;
    public List mFeeds;
    public LiveSquareSideBarFocusBarData mFocusBarData;
    public LiveSquareTopRankEntryData mLiveSquareTopRankEntryData;
    public List mSquareFeeds;
    public List mSquarePkFeeds;
    public List mTabs;
    public static final long serialVersionUID = 0x3475222809b32f46;

    public void LiveSquareSideBarRefreshData(){
       super();
       this.mSquareFeeds = new ArrayList();
    }
}
