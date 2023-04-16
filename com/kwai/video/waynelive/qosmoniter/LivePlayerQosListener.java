package com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import com.kwai.player.qos.KwaiQosInfo;
import com.kwai.video.waynelive.qosmoniter.QosLowReason;

public interface abstract LivePlayerQosListener	// class@000e0d
{

    void onTickQosInfo(KwaiQosInfo p0);
    void qosTooLow(QosLowReason p0);
}
