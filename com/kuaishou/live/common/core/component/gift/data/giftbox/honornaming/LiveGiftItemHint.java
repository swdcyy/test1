package com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHint;
import java.io.Serializable;
import java.lang.Object;

public class LiveGiftItemHint implements Serializable	// class@00115b
{
    public List mHints;
    public int mNoticeIntervalMillis;
    public static final long serialVersionUID = 0x56a971b6074bfc84;

    public void LiveGiftItemHint(){
       super();
       this.mNoticeIntervalMillis = 6000;
    }
}
