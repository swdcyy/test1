package com.kuaishou.android.live.model.LiveSquareSideBarNoticeModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveSquareSideBarNoticeModel implements Serializable	// class@000803
{
    public List mCoverWidgets;
    public String mLiveSquareSideBarNoticeSubTitle;
    public int mLiveSquareSideBarNoticeType;
    public static final long serialVersionUID = 0x7a6c7d6c1da518ae;

    public void LiveSquareSideBarNoticeModel(){
       super();
       this.mCoverWidgets = new ArrayList();
    }
}
