package com.kuaishou.live.core.voiceparty.channel.model.ChannelTopic;
import com.kuaishou.android.live.model.VoicePartyChannel;
import java.util.List;
import java.util.Collections;

public class ChannelTopic extends VoicePartyChannel	// class@001378
{
    public List mTopicList;
    public static final long serialVersionUID = 0x3078529da7b2670;

    public void ChannelTopic(){
       super();
       this.mTopicList = Collections.emptyList();
    }
}
