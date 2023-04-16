package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketLuckyUsersResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveFellowRedPacketLuckyUsersResponse implements Serializable, CursorResponse	// class@000e99
{
    public List mLuckyUsers;
    public int mTopLuckyMaxSize;
    public static final long serialVersionUID = 0xafb2d98e66fdff40;

    public void LiveFellowRedPacketLuckyUsersResponse(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mLuckyUsers;
    }
    public boolean hasMore(){
       return false;
    }
}
