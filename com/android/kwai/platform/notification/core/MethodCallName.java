package com.android.kwai.platform.notification.core.MethodCallName;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MethodCallName extends Enum	// class@000405
{
    public final String methodName;
    public static final MethodCallName[] $VALUES;
    public static final MethodCallName CREATE_CHANNEL;
    public static final MethodCallName GET_NOTIFICATION_CHANNEL;
    public static final MethodCallName SHOW_NOTIFICATION;

    static {
       MethodCallName methodCallNa1;
       MethodCallName[] methodCallNa = new MethodCallName[]{methodCallNa1,methodCallNa1,methodCallNa1};
       methodCallNa1 = new MethodCallName("CREATE_CHANNEL", 0, "createNotificationChannels");
       MethodCallName.CREATE_CHANNEL = methodCallNa1;
       methodCallNa1 = new MethodCallName("SHOW_NOTIFICATION", 1, "enqueueNotificationWithTag");
       MethodCallName.SHOW_NOTIFICATION = methodCallNa1;
       methodCallNa1 = new MethodCallName("GET_NOTIFICATION_CHANNEL", 2, "getNotificationChannel");
       MethodCallName.GET_NOTIFICATION_CHANNEL = methodCallNa1;
       MethodCallName.$VALUES = methodCallNa;
    }
    public void MethodCallName(String p0,int p1,String p2){
       super(p0, p1);
       this.methodName = p2;
    }
    public static MethodCallName valueOf(String p0){
       return Enum.valueOf(MethodCallName.class, p0);
    }
    public static MethodCallName[] values(){
       return MethodCallName.$VALUES.clone();
    }
    public final String getMethodName$push_notification_release(){
       return this.methodName;
    }
}
