package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarHistoryListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveLuckyStarHistoryListResponse implements Serializable, b	// class@000cd5
{
    public List mHistoryList;
    public String mTips;
    public static final long serialVersionUID = 0x5293e02ae2ea9501;

    public void LiveLuckyStarHistoryListResponse(){
       super();
    }
    public List getItems(){
       return this.mHistoryList;
    }
    public boolean hasMore(){
       return false;
    }
}
