package com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.graphics.Bitmap;

public class PushNotificationBuilder	// class@001560
{
    public String appLabel;
    public Bitmap appLargeIcon;
    public String clickPackageName;
    public Context context;
    public int mLargeIcon;
    public int mNotificationDefaults;
    public int mNotificationFlags;
    public String mNotificationSound;
    public int mStatusBarIcon;
    public long[] mVibratePattern;

    public void PushNotificationBuilder(){
       super();
    }
    public void PushNotificationBuilder(Context p0){
       this.context = p0;
    }
    public String getAppLabel(){
       return this.appLabel;
    }
    public Bitmap getAppLargeIcon(){
       return this.appLargeIcon;
    }
    public String getClickPackageName(){
       return this.clickPackageName;
    }
    public Context getContext(){
       return this.context;
    }
    public int getLargeIcon(){
       return this.mLargeIcon;
    }
    public int getNotificationDefaults(){
       return this.mNotificationDefaults;
    }
    public int getNotificationFlags(){
       return this.mNotificationFlags;
    }
    public String getNotificationSound(){
       return this.mNotificationSound;
    }
    public int getStatusBarIcon(){
       return this.mStatusBarIcon;
    }
    public long[] getVibratePattern(){
       return this.mVibratePattern;
    }
    public void setAppLabel(String p0){
       this.appLabel = p0;
    }
    public void setAppLargeIcon(Bitmap p0){
       this.appLargeIcon = p0;
    }
    public void setClickPackageName(String p0){
       this.clickPackageName = p0;
    }
    public void setContext(Context p0){
       this.context = p0;
    }
    public void setLargeIcon(int p0){
       this.mLargeIcon = p0;
    }
    public void setNotificationDefaults(int p0){
       this.mNotificationDefaults = p0;
    }
    public void setNotificationFlags(int p0){
       this.mNotificationFlags = p0;
    }
    public void setNotificationSound(String p0){
       this.mNotificationSound = p0;
    }
    public void setStatusBarIcon(int p0){
       this.mStatusBarIcon = p0;
    }
    public void setVibratePattern(long[] p0){
       this.mVibratePattern = p0;
    }
}
