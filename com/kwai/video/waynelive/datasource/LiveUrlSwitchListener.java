package com.kwai.video.waynelive.datasource.LiveUrlSwitchListener;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchReason;

public interface abstract LiveUrlSwitchListener	// class@000dec
{

    void onUrlSwitchFail(LiveUrlSwitchReason p0);
    void onUrlSwitchSuccess(LiveUrlSwitchReason p0);
}
