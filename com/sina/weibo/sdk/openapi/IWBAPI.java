package com.sina.weibo.sdk.openapi.IWBAPI;
import android.app.Activity;
import com.sina.weibo.sdk.auth.WbAuthListener;
import android.content.Intent;
import com.sina.weibo.sdk.share.WbShareCallback;
import android.content.Context;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.api.WeiboMultiMessage;

public interface abstract IWBAPI	// class@000bc8
{

    void authorize(Activity p0,WbAuthListener p1);
    void authorizeCallback(Activity p0,int p1,int p2,Intent p3);
    void authorizeClient(Activity p0,WbAuthListener p1);
    void authorizeWeb(Activity p0,WbAuthListener p1);
    void doResultIntent(Intent p0,WbShareCallback p1);
    boolean isWBAppInstalled();
    boolean isWBAppSupportMultipleImage();
    void registerApp(Context p0,AuthInfo p1);
    void registerApp(Context p0,AuthInfo p1,SdkListener p2);
    void setLoggerEnable(boolean p0);
    void shareMessage(Activity p0,WeiboMultiMessage p1,boolean p2);
}
