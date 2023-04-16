package com.kuaishou.live.core.voiceparty.model.VoicePartyFeedResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class VoicePartyFeedResponse implements Serializable, b	// class@0017b0
{
    public String mCursor;
    public List mItems;
    public String mLlsid;
    public static final long serialVersionUID = 0x78fb19dd0511a093;

    public void VoicePartyFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
