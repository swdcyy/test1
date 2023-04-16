package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarHistoryDetailResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveLuckyStarHistoryDetailResponse implements Serializable, b	// class@000cd3
{
    public boolean mIsNotified;
    public List mLuckyUsers;
    public static final long serialVersionUID = 0x1d29a43dc9df9f48;

    public void LiveLuckyStarHistoryDetailResponse(){
       super();
    }
    public List getItems(){
       return this.mLuckyUsers;
    }
    public boolean hasMore(){
       return false;
    }
}
