package com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicOrderedResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveVoicePartyMusicOrderedResponse implements Serializable, CursorResponse	// class@001794
{
    public String cursor;
    public List orders;
    public int result;
    public static final long serialVersionUID = 0x59ae5dd33af9d82d;

    public void LiveVoicePartyMusicOrderedResponse(){
       super();
    }
    public String getCursor(){
       return this.cursor;
    }
    public List getItems(){
       return this.orders;
    }
    public boolean hasMore(){
       return false;
    }
}
