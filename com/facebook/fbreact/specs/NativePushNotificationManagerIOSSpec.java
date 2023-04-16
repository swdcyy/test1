package com.facebook.fbreact.specs.NativePushNotificationManagerIOSSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativePushNotificationManagerIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c3
{

    public void NativePushNotificationManagerIOSSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void abandonPermissions();
    public abstract void addListener(String p0);
    public abstract void cancelAllLocalNotifications();
    public abstract void cancelLocalNotifications(ReadableMap p0);
    public abstract void checkPermissions(Callback p0);
    public abstract void getApplicationIconBadgeNumber(Callback p0);
    public abstract void getDeliveredNotifications(Callback p0);
    public abstract void getInitialNotification(Promise p0);
    public abstract void getScheduledLocalNotifications(Callback p0);
    public abstract void onFinishRemoteNotification(String p0,String p1);
    public abstract void presentLocalNotification(ReadableMap p0);
    public abstract void removeAllDeliveredNotifications();
    public abstract void removeDeliveredNotifications(ReadableArray p0);
    public abstract void removeListeners(double p0);
    public abstract void requestPermissions(ReadableMap p0,Promise p1);
    public abstract void scheduleLocalNotification(ReadableMap p0);
    public abstract void setApplicationIconBadgeNumber(double p0);
}
