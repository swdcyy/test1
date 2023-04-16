package com.kuaishou.live.core.voiceparty.online.search.VoicePartySearchOnlineResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class VoicePartySearchOnlineResponse implements Serializable, b	// class@001801
{
    public List mSearchOnlineUsers;
    public static final long serialVersionUID = 0x2d9b8511d1647300;

    public void VoicePartySearchOnlineResponse(){
       super();
    }
    public List getItems(){
       return this.mSearchOnlineUsers;
    }
    public boolean hasMore(){
       return false;
    }
}
