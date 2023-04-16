package com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.LiveConversionTaskNoticeInfo$ExtraInfo;

public class LiveCommonChatNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000f89
{
    public static final long serialVersionUID = 0x5f4cad08755f2ee1;

    public void LiveCommonChatNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveConversionTaskNoticeInfo$ExtraInfo.class;
    }
}
