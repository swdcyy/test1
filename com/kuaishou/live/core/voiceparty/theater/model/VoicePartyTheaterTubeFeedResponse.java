package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedResponse;
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

public class VoicePartyTheaterTubeFeedResponse implements CursorResponse, Serializable	// class@001983
{
    public String mCursor;
    public String mLlsid;
    public List mTubes;
    public static final long serialVersionUID = 0x8fe561a755137ec3;

    public void VoicePartyTheaterTubeFeedResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mTubes;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
