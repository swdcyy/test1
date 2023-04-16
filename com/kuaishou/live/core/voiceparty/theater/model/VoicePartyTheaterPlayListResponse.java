package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class VoicePartyTheaterPlayListResponse implements CursorResponse, Serializable	// class@001979
{
    public String mPCursor;
    public List orderLists;
    public static final long serialVersionUID = 0x56e5723d1c5260c0;

    public void VoicePartyTheaterPlayListResponse(){
       super();
    }
    public String getCursor(){
       return this.mPCursor;
    }
    public List getItems(){
       return this.orderLists;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterPlayListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.getCursor());
    }
}
