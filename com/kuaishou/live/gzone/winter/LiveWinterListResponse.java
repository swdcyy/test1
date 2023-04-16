package com.kuaishou.live.gzone.winter.LiveWinterListResponse;
import java.io.Serializable;
import la6.b;
import java.util.List;
import java.lang.Object;

public class LiveWinterListResponse implements Serializable, b	// class@001d04
{
    public List mItems;
    public static final long serialVersionUID = 0xb448242488da0bc6;

    public void LiveWinterListResponse(List p0){
       super();
       this.mItems = p0;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       return false;
    }
}
