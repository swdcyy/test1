package com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.LiveConversionTaskNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.LiveConversionTaskNoticeInfo$ExtraInfo;

public class LiveConversionTaskNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fae
{
    public static final long serialVersionUID = 0xf387f8187a064f1d;

    public void LiveConversionTaskNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveConversionTaskNoticeInfo$ExtraInfo.class;
    }
}
