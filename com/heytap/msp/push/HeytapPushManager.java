package com.heytap.msp.push.HeytapPushManager;
import java.lang.Object;
import org.json.JSONObject;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import android.content.Context;
import java.lang.String;
import com.heytap.msp.push.callback.ICallBackResultService;
import java.util.List;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.statis.StatisticUtils;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.mcssdk.utils.StatUtil;

public class HeytapPushManager	// class@000547
{

    public void HeytapPushManager(){
       super();
    }
    public static void clearNotificationType(){
       HeytapPushManager.clearNotificationType(null);
    }
    public static void clearNotificationType(JSONObject p0){
       PushService.getInstance().clearNotificationType(p0);
    }
    public static void clearNotifications(){
       HeytapPushManager.clearNotifications(null);
    }
    public static void clearNotifications(JSONObject p0){
       PushService.getInstance().clearNotifications(p0);
    }
    public static void disableAppNotificationSwitch(ISetAppNotificationCallBackService p0){
       PushService.getInstance().disableAppNotificationSwitch(p0);
    }
    public static void enableAppNotificationSwitch(ISetAppNotificationCallBackService p0){
       PushService.getInstance().enableAppNotificationSwitch(p0);
    }
    public static void getAppNotificationSwitch(IGetAppNotificationCallBackService p0){
       PushService.getInstance().getAppNotificationSwitch(p0);
    }
    public static String getMcsPackageName(Context p0){
       return PushService.getInstance().getMcsPackageName(p0);
    }
    public static void getNotificationStatus(){
       HeytapPushManager.getNotificationStatus(null);
    }
    public static void getNotificationStatus(JSONObject p0){
       PushService.getInstance().getNotificationStatus(p0);
    }
    public static ICallBackResultService getPushCallback(){
       return PushService.getInstance().getPushCallback();
    }
    public static void getPushStatus(){
       PushService.getInstance().getPushStatus();
    }
    public static int getPushVersionCode(){
       return PushService.getInstance().getPushVersionCode();
    }
    public static String getPushVersionName(){
       return PushService.getInstance().getPushVersionName();
    }
    public static String getReceiveSdkAction(Context p0){
       return PushService.getInstance().getReceiveSdkAction(p0);
    }
    public static void getRegister(){
       HeytapPushManager.getRegister(null);
    }
    public static void getRegister(JSONObject p0){
       PushService.getInstance().getRegister(p0);
    }
    public static String getRegisterID(){
       return PushService.getInstance().getRegisterID();
    }
    public static int getSDKVersionCode(){
       return PushService.getSDKVersionCode();
    }
    public static String getSDKVersionName(){
       return PushService.getSDKVersionName();
    }
    public static void init(Context p0,boolean p1){
       PushService.getInstance().init(p0, p1);
    }
    public static boolean isSupportPush(Context p0){
       return PushService.getInstance().isSupportPushByClient(p0);
    }
    public static void openNotificationSettings(){
       HeytapPushManager.openNotificationSettings(null);
    }
    public static void openNotificationSettings(JSONObject p0){
       PushService.getInstance().openNotificationSettings(p0);
    }
    public static void pausePush(){
       HeytapPushManager.pausePush(null);
    }
    public static void pausePush(JSONObject p0){
       PushService.getInstance().pausePush(p0);
    }
    public static void register(Context p0,String p1,String p2,ICallBackResultService p3){
       HeytapPushManager.register(p0, p1, p2, null, p3);
    }
    public static void register(Context p0,String p1,String p2,JSONObject p3,ICallBackResultService p4){
       PushService.getInstance().register(p0, p1, p2, p3, p4);
    }
    public static void requestNotificationPermission(){
       PushService.getInstance().requestNotificationPermission();
    }
    public static void resumePush(){
       HeytapPushManager.resumePush(null);
    }
    public static void resumePush(JSONObject p0){
       PushService.getInstance().resumePush(p0);
    }
    public static void setAppKeySecret(String p0,String p1){
       PushService.getInstance().setAppKeySecret(p0, p1);
    }
    public static void setNotificationType(int p0){
       HeytapPushManager.setNotificationType(p0, null);
    }
    public static void setNotificationType(int p0,JSONObject p1){
       PushService.getInstance().setNotificationType(p0, p1);
    }
    public static void setPushCallback(ICallBackResultService p0){
       PushService.getInstance().setPushCallback(p0);
    }
    public static void setPushTime(List p0,int p1,int p2,int p3,int p4){
       HeytapPushManager.setPushTime(p0, p1, p2, p3, p4, null);
    }
    public static void setPushTime(List p0,int p1,int p2,int p3,int p4,JSONObject p5){
       PushService.getInstance().setPushTime(p0, p1, p2, p3, p4, p5);
    }
    public static void setRegisterID(String p0){
       PushService.getInstance().setRegisterID(p0);
    }
    public static void statisticEvent(Context p0,String p1,DataMessage p2){
       StatisticUtils.statisticEvent(p0, p1, p2);
    }
    public static void statisticMessage(Context p0,MessageStat p1){
       StatUtil.statisticMessage(p0, p1);
    }
    public static void statisticMessage(Context p0,List p1){
       StatUtil.statisticMessage(p0, p1);
    }
    public static void unRegister(){
       HeytapPushManager.unRegister(null);
    }
    public static void unRegister(Context p0,String p1,String p2,JSONObject p3,ICallBackResultService p4){
       PushService.getInstance().unRegister(p0, p1, p2, p3, p4);
    }
    public static void unRegister(JSONObject p0){
       PushService.getInstance().unRegister(p0);
    }
}
