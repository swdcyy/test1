package com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoicePartyKtvCommonConfig implements Serializable	// class@00130c
{
    public String mAnchorEmptyNoticeText;
    public String mAudienceEmptyNoticeText;
    public static final long serialVersionUID = 0x324add7f1d9ec6a6;

    public void LiveVoicePartyKtvCommonConfig(){
       super();
       this.mAudienceEmptyNoticeText = "";
       this.mAnchorEmptyNoticeText = "";
    }
}
