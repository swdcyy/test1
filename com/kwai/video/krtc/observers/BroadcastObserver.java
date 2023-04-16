package com.kwai.video.krtc.observers.BroadcastObserver;
import java.lang.String;

public interface abstract BroadcastObserver	// class@0007c9
{

    void onPassThroughDataReceived(String p0,String p1,int p2,byte[] p3);
    void onPeerMuteStatusUpdated(String p0,String p1,boolean p2,boolean p3,int p4);
}
