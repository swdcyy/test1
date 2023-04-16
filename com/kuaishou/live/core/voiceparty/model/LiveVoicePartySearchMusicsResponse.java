package com.kuaishou.live.core.voiceparty.model.LiveVoicePartySearchMusicsResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveVoicePartySearchMusicsResponse implements Serializable, CursorResponse	// class@00179d
{
    public String hostName;
    public String llsid;
    public List musics;
    public int result;
    public static final long serialVersionUID = 0xa7395189f772146d;

    public void LiveVoicePartySearchMusicsResponse(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.musics;
    }
    public boolean hasMore(){
       return false;
    }
}
