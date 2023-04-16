package com.vivo.push.sdk.PushMessageCallback;
import android.content.Context;
import java.lang.String;
import java.util.List;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.model.UnvarnishedMessage;

public interface abstract PushMessageCallback	// class@001096
{

    boolean isAllowNet(Context p0);
    void onBind(Context p0,int p1,String p2);
    void onDelAlias(Context p0,int p1,List p2,List p3,String p4);
    void onDelTags(Context p0,int p1,List p2,List p3,String p4);
    void onListTags(Context p0,int p1,List p2,String p3);
    void onLog(Context p0,String p1,int p2,boolean p3);
    boolean onNotificationMessageArrived(Context p0,UPSNotificationMessage p1);
    void onNotificationMessageClicked(Context p0,UPSNotificationMessage p1);
    void onPublish(Context p0,int p1,String p2);
    void onReceiveRegId(Context p0,String p1);
    void onSetAlias(Context p0,int p1,List p2,List p3,String p4);
    void onSetTags(Context p0,int p1,List p2,List p3,String p4);
    void onTransmissionMessage(Context p0,UnvarnishedMessage p1);
    void onUnBind(Context p0,int p1,String p2);
}
