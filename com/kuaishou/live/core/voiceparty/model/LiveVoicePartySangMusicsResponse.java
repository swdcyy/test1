package com.kuaishou.live.core.voiceparty.model.LiveVoicePartySangMusicsResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveVoicePartySangMusicsResponse implements CursorResponse, Serializable	// class@00179c
{
    public List mKtvMusics;
    public int result;
    public static final long serialVersionUID = 0x2eb6de0a268b753b;

    public void LiveVoicePartySangMusicsResponse(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mKtvMusics;
    }
    public boolean hasMore(){
       return false;
    }
}
