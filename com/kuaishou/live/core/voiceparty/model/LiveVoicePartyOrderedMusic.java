package com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoicePartyOrderedMusic implements Serializable	// class@001798
{
    public long endTimeOffset;
    public Music music;
    public String musicOrderId;
    public long startTimeOffset;
    public int status;
    public User user;
    public static final long serialVersionUID = 0xdc83a83e0ea9c8fe;

    public void LiveVoicePartyOrderedMusic(){
       super();
    }
}
