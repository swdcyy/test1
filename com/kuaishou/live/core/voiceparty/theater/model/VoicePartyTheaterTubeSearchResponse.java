package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeSearchResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class VoicePartyTheaterTubeSearchResponse implements CursorResponse, Serializable	// class@001986
{
    public List mTubes;
    public static final long serialVersionUID = 0xf757730f1c43957c;

    public void VoicePartyTheaterTubeSearchResponse(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mTubes;
    }
    public boolean hasMore(){
       return false;
    }
}
