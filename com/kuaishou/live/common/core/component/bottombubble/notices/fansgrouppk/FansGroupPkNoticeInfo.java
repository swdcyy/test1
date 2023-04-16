package com.kuaishou.live.common.core.component.bottombubble.notices.fansgrouppk.FansGroupPkNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.fansgrouppk.FansGroupPkNoticeInfo$ExtraInfo;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class FansGroupPkNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fb6
{
    public boolean mEnableAuthorAware;
    public int mMaxShowLimit;
    public static final long serialVersionUID = 0x4e7a1ec247d82a37;

    public void FansGroupPkNoticeInfo(){
       super();
       this.mEnableAuthorAware = true;
       this.mMaxShowLimit = 0;
    }
    public Class getExtraInfoClass(){
       return FansGroupPkNoticeInfo$ExtraInfo.class;
    }
    public void setShortcutsForExtraInfo(){
       if (PatchProxy.applyVoid(null, this, FansGroupPkNoticeInfo.class, "1")) {
          return;
       }
       super.setShortcutsForExtraInfo();
       LiveGenericCommentNoticeInfo tmExtraInfo = this.mExtraInfo;
       this.mEnableAuthorAware = tmExtraInfo.mEnableAuthorAware;
       this.mMaxShowLimit = tmExtraInfo.mMaxShowLimit;
       return;
    }
}
