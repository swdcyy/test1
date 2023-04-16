package zwa.b;
import java.lang.String;
import brd.a0;
import dxa.f;
import dxa.b;
import mw5.e;
import zwa.v;
import hxa.c;
import mw5.d;

public interface abstract b	// class@004dce
{

    a0 acceptRTCCall(String p0,boolean p1,boolean p2,boolean p3);
    void cancelRTCDial(String p0);
    void closeRTCCall(String p0);
    a0 createRTCCall(f p0);
    void dialTimeOutClose(String p0);
    a0 enableCamera(String p0,boolean p1);
    void enableDeviceCamera(boolean p0);
    boolean enableMicro(boolean p0);
    boolean enableSpeaker(boolean p0);
    a0 fetchRTCCall(String p0);
    a0 fetchRTCCallAndReenterIfNeed(String p0);
    b getCurRTCCallDetail();
    String getCurState();
    e getIMVideoWrapper();
    String getLastRoomId();
    void hangUpRTCCall(String p0);
    void interruptRTCCall(String p0);
    a0 interruptRTCCallWithSubscribe(String p0);
    boolean isCameraRunning();
    boolean isFrontCamera();
    boolean isIMRTCCallBusy();
    boolean isMicroOn();
    boolean isSpeakerOn();
    void linkTimeOutClose(String p0);
    void onConnectStateChange(int p0);
    void onLogin();
    void onLogout();
    void pushTimeOutClose(String p0);
    void registerIMRTCListener(v p0);
    void registerVideoFrameListener(String p0,c p1);
    void registerVideoView(d p0,String p1,String p2);
    void rejectRTCCall(String p0);
    void requestedTimeOutClose(String p0);
    boolean switchCamera();
    void unregisterIMRTCListener(v p0);
    void unregisterVideoFrameListener(String p0);
    void unregisterVideoView(String p0,String p1);
}
