package com.heytap.msp.push.callback.ICallBackResultService;
import java.lang.String;

public interface abstract ICallBackResultService	// class@000548
{

    void onError(int p0,String p1);
    void onGetNotificationStatus(int p0,int p1);
    void onGetPushStatus(int p0,int p1);
    void onRegister(int p0,String p1);
    void onSetPushTime(int p0,String p1);
    void onUnRegister(int p0);
}
