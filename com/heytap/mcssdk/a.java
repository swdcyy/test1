package com.heytap.mcssdk.a;
import org.json.JSONObject;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import java.lang.String;
import android.content.Context;
import com.heytap.msp.push.callback.ICallBackResultService;
import java.util.List;

public interface abstract a	// class@000522
{

    void clearNotificationType();
    void clearNotificationType(JSONObject p0);
    void clearNotifications();
    void clearNotifications(JSONObject p0);
    void disableAppNotificationSwitch(ISetAppNotificationCallBackService p0);
    void enableAppNotificationSwitch(ISetAppNotificationCallBackService p0);
    void getAppNotificationSwitch(IGetAppNotificationCallBackService p0);
    void getNotificationStatus();
    void getNotificationStatus(JSONObject p0);
    void getRegister();
    void getRegister(JSONObject p0);
    String getRegisterID();
    void openNotificationSettings();
    void openNotificationSettings(JSONObject p0);
    void pausePush();
    void pausePush(JSONObject p0);
    void register(Context p0,String p1,String p2,ICallBackResultService p3);
    void register(Context p0,String p1,String p2,JSONObject p3,ICallBackResultService p4);
    void requestNotificationPermission();
    void resumePush();
    void resumePush(JSONObject p0);
    void setNotificationType(int p0);
    void setNotificationType(int p0,JSONObject p1);
    void setPushTime(List p0,int p1,int p2,int p3,int p4);
    void setPushTime(List p0,int p1,int p2,int p3,int p4,JSONObject p5);
    void setRegisterID(String p0);
    void unRegister();
    void unRegister(JSONObject p0);
}
