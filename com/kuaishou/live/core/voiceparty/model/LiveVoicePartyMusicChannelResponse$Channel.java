package com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicChannelResponse$Channel;
import java.io.Serializable;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicChannelResponse;
import java.lang.String;
import java.lang.Object;

public class LiveVoicePartyMusicChannelResponse$Channel implements Serializable	// class@001791
{
    public int mId;
    public String mName;
    public final LiveVoicePartyMusicChannelResponse this$0;
    public static final long serialVersionUID = 0x7a86a09215b828b7;

    public void LiveVoicePartyMusicChannelResponse$Channel(LiveVoicePartyMusicChannelResponse p0,String p1,int p2){
       this.this$0 = p0;
       super();
       this.mName = p1;
       this.mId = p2;
    }
}
