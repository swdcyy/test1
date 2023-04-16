package com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketConfigItem;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketConfigItem$a;
import nsd.u;
import java.lang.Object;

public final class KgiRedPacketConfigItem implements Serializable	// class@0013dd
{
    public String end;
    public String start;
    public int videoIndex;
    public static final KgiRedPacketConfigItem$a Companion;
    public static final long serialVersionUID;

    static {
       KgiRedPacketConfigItem.Companion = new KgiRedPacketConfigItem$a(null);
       KgiRedPacketConfigItem.serialVersionUID = -1311212942;
    }
    public void KgiRedPacketConfigItem(){
       super();
       this.start = "";
       this.end = "";
       this.videoIndex = -1;
    }
    public static final long getSerialVersionUID(){
       return KgiRedPacketConfigItem.serialVersionUID;
    }
}
