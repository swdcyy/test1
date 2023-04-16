package com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class VoicePartyOnlineResponse implements Serializable, CursorResponse	// class@001802
{
    public String mCursor;
    public List mOnlineUsers;
    public static final long serialVersionUID = 0x2d9b8511d1647300;

    public void VoicePartyOnlineResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mOnlineUsers;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, VoicePartyOnlineResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
