package com.kuaishou.live.common.core.component.gift.giftstore.api.GiftListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class GiftListResponse implements Serializable, b	// class@00130b
{
    public String mGiftToken;
    public List mGifts;
    public boolean mShouldHideGiftEntrance;
    public static final long serialVersionUID = 0x5eb7f05c293253fb;

    public void GiftListResponse(){
       super();
       this.mGifts = new ArrayList();
    }
    public List getItems(){
       return this.mGifts;
    }
    public boolean hasMore(){
       return false;
    }
}
