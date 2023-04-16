package com.kuaishou.live.common.core.component.redpacket.redpacket.model.RedPacketLuckResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class RedPacketLuckResponse implements Serializable, b	// class@001762
{
    public List mRedPacketLucks;
    public String mTips;
    public static final long serialVersionUID = 0x7f74d8ffec871ef;

    public void RedPacketLuckResponse(){
       super();
    }
    public List getItems(){
       return this.mRedPacketLucks;
    }
    public boolean hasMore(){
       return false;
    }
}
