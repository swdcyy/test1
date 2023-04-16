package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeDetailResponse;
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

public class VoicePartyTheaterTubeDetailResponse implements CursorResponse, Serializable	// class@001982
{
    public String mCursor;
    public List mEpisodes;
    public String mLlsid;
    public static final long serialVersionUID = 0x8fe561a755137ec3;

    public void VoicePartyTheaterTubeDetailResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mEpisodes;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeDetailResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
