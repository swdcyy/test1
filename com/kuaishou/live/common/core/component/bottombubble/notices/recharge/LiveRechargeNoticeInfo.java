package com.kuaishou.live.common.core.component.bottombubble.notices.recharge.LiveRechargeNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.LiveRechargeNoticeInfo$ExtraInfo;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveRechargeNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fe8
{
    public boolean mDisplayOnceEnabled;
    public static final long serialVersionUID = 0x3e3401480e406f51;

    public void LiveRechargeNoticeInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveRechargeNoticeInfo$ExtraInfo.class;
    }
    public void setShortcutsForExtraInfo(){
       if (PatchProxy.applyVoid(null, this, LiveRechargeNoticeInfo.class, "1")) {
          return;
       }
       super.setShortcutsForExtraInfo();
       this.mDisplayOnceEnabled = this.mExtraInfo.mDisplayOnceEnabled;
       return;
    }
}
