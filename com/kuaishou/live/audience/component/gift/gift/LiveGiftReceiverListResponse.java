package com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveGiftReceiverListResponse implements Serializable, b	// class@000aea
{
    public List mItems;
    public static final long serialVersionUID = 0x440e59b3bc55ff86;

    public void LiveGiftReceiverListResponse(){
       super();
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       return false;
    }
}
