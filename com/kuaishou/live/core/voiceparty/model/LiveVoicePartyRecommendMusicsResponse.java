package com.kuaishou.live.core.voiceparty.model.LiveVoicePartyRecommendMusicsResponse;
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

public class LiveVoicePartyRecommendMusicsResponse implements CursorResponse, Serializable	// class@00179a
{
    public String cursor;
    public String llsid;
    public List mKtvMusics;
    public int result;
    public static final long serialVersionUID = 0x1f0308d3cbd79548;

    public void LiveVoicePartyRecommendMusicsResponse(){
       super();
    }
    public String getCursor(){
       return this.cursor;
    }
    public List getItems(){
       return this.mKtvMusics;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyRecommendMusicsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.getCursor());
    }
}
