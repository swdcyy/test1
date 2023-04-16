package com.vivo.push.sdk.OpenClientPushMessageReceiver;
import com.vivo.push.sdk.BasePushMessageReceiver;
import android.content.Context;
import java.lang.String;
import java.util.List;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.model.UnvarnishedMessage;

public abstract class OpenClientPushMessageReceiver extends BasePushMessageReceiver	// class@001095
{

    public void OpenClientPushMessageReceiver(){
       super();
    }
    public final boolean isAllowNet(Context p0){
       return super.isAllowNet(p0);
    }
    public final void onBind(Context p0,int p1,String p2){
       super.onBind(p0, p1, p2);
    }
    public final void onDelAlias(Context p0,int p1,List p2,List p3,String p4){
    }
    public final void onDelTags(Context p0,int p1,List p2,List p3,String p4){
    }
    public final void onListTags(Context p0,int p1,List p2,String p3){
       super.onListTags(p0, p1, p2, p3);
    }
    public final void onLog(Context p0,String p1,int p2,boolean p3){
       super.onLog(p0, p1, p2, p3);
    }
    public final boolean onNotificationMessageArrived(Context p0,UPSNotificationMessage p1){
       return false;
    }
    public void onNotificationMessageClicked(Context p0,UPSNotificationMessage p1){
    }
    public final void onPublish(Context p0,int p1,String p2){
       super.onPublish(p0, p1, p2);
    }
    public void onReceiveRegId(Context p0,String p1){
    }
    public final void onSetAlias(Context p0,int p1,List p2,List p3,String p4){
    }
    public final void onSetTags(Context p0,int p1,List p2,List p3,String p4){
    }
    public void onTransmissionMessage(Context p0,UnvarnishedMessage p1){
    }
    public final void onUnBind(Context p0,int p1,String p2){
       super.onUnBind(p0, p1, p2);
    }
}
