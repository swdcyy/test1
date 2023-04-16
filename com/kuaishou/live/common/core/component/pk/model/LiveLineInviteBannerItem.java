package com.kuaishou.live.common.core.component.pk.model.LiveLineInviteBannerItem;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteeListBannerInfo;

public class LiveLineInviteBannerItem extends LiveLineInviteItem	// class@001738
{
    public LiveLineInviteResponse$LiveLineInviteeListBannerInfo mLiveLineInviteeListBannerInfo;
    public static final long serialVersionUID = 0x36c3da53796b9dda;

    public void LiveLineInviteBannerItem(LiveLineInviteResponse$LiveLineInviteeListBannerInfo p0){
       super();
       this.mLiveLineInviteeListBannerInfo = p0;
    }
}
