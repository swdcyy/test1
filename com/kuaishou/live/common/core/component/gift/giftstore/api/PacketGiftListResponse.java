package com.kuaishou.live.common.core.component.gift.giftstore.api.PacketGiftListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class PacketGiftListResponse implements Serializable, b	// class@00130e
{
    public List mPacketGiftList;
    public long mServerTime;
    public static final long serialVersionUID = 0xb63f6b52e32dffef;

    public void PacketGiftListResponse(){
       super();
       this.mPacketGiftList = new ArrayList();
    }
    public List getItems(){
       return this.mPacketGiftList;
    }
    public long getServerTime(){
       return this.mServerTime;
    }
    public boolean hasMore(){
       return false;
    }
}
