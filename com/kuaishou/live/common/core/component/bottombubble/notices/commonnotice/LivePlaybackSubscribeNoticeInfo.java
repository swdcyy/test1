package com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LivePlaybackSubscribeNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LivePlaybackSubscribeNoticeInfo$ExtraInfo;

public class LivePlaybackSubscribeNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fa8
{
    public static final long serialVersionUID = 0x9ef13c204be24f74;

    public void LivePlaybackSubscribeNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LivePlaybackSubscribeNoticeInfo$ExtraInfo.class;
    }
}
