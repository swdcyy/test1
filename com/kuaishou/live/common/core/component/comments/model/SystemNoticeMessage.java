package com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class SystemNoticeMessage extends QLiveMessage	// class@0010c7
{
    public long mDisplayDuration;
    public int mDisplayType;
    public boolean mIsFirstSystemNotice;
    public String mTitle;
    public static final long serialVersionUID = 0x7b1516de63e9f67b;

    public void SystemNoticeMessage(){
       super();
       this.mIsFirstSystemNotice = false;
    }
}
