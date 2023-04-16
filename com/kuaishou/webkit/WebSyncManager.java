package com.kuaishou.webkit.WebSyncManager;
import java.lang.Runnable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.CloneNotSupportedException;

public abstract class WebSyncManager implements Runnable	// class@00127e
{
    public WebViewDatabase mDataBase;
    public Handler mHandler;

    public void WebSyncManager(Context p0,String p1){
       super();
    }
    public Object clone(){
       throw new CloneNotSupportedException("doesn\'t implement Cloneable");
    }
    public void onSyncInit(){
    }
    public void resetSync(){
    }
    public void run(){
    }
    public void startSync(){
    }
    public void stopSync(){
    }
    public void sync(){
    }
    public abstract void syncFromRamToFlash();
}
