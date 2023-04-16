package com.hpplay.sdk.source.browse.api.LelinkServiceManager;
import com.hpplay.sdk.source.browse.api.ILelinkServiceManager;
import java.lang.Object;
import android.content.Context;
import com.hpplay.sdk.source.b.a;
import java.lang.String;
import com.hpplay.sdk.source.browse.api.IParceResultListener;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;
import com.hpplay.sdk.source.browse.api.IAPI;
import com.hpplay.sdk.source.browse.api.LelinkSetting;
import com.hpplay.sdk.source.browse.api.IBrowseListener;

public final class LelinkServiceManager implements ILelinkServiceManager	// class@00065b
{
    public static ILelinkServiceManager mLelinkServiceManager;

    public void LelinkServiceManager(){
       super();
    }
    public static synchronized ILelinkServiceManager getInstance(Context p0){
       _monitor_enter(LelinkServiceManager.class);
       if (LelinkServiceManager.mLelinkServiceManager == null) {
          _monitor_enter(LelinkServiceManager.class);
          if (LelinkServiceManager.mLelinkServiceManager == null) {
             LelinkServiceManager.mLelinkServiceManager = a.b(p0);
          }
          _monitor_exit(LelinkServiceManager.class);
       }
       _monitor_exit(LelinkServiceManager.class);
       return LelinkServiceManager.mLelinkServiceManager;
    }
    public void addPinCodeServiceInfo(String p0,IParceResultListener p1){
       LelinkServiceManager.mLelinkServiceManager.addPinCodeServiceInfo(p0, p1);
    }
    public void addQRServiceInfo(String p0,IParceResultListener p1){
       LelinkServiceManager.mLelinkServiceManager.addQRServiceInfo(p0, p1);
    }
    public void browse(int p0){
       LelinkServiceManager.mLelinkServiceManager.browse(p0);
    }
    public void deleteRemoteServiceInfo(LelinkServiceInfo[] p0){
       LelinkServiceManager.mLelinkServiceManager.deleteRemoteServiceInfo(p0);
    }
    public List getLelinkServiceInfos(){
       return LelinkServiceManager.mLelinkServiceManager.getLelinkServiceInfos();
    }
    public Object getOption(int p0,Object[] p1){
       return LelinkServiceManager.mLelinkServiceManager.getOption(p0, p1);
    }
    public void onBrowseListGone(){
       LelinkServiceManager.mLelinkServiceManager.onBrowseListGone();
    }
    public void onPushButtonClick(){
       LelinkServiceManager.mLelinkServiceManager.onPushButtonClick();
    }
    public Object performAction(int p0,Object[] p1){
       return LelinkServiceManager.mLelinkServiceManager.performAction(p0, p1);
    }
    public void release(){
    }
    public void removeLocalServiceInfo(LelinkServiceInfo p0){
       LelinkServiceManager.mLelinkServiceManager.removeLocalServiceInfo(p0);
    }
    public void setDebug(boolean p0){
       LelinkServiceManager.mLelinkServiceManager.setDebug(p0);
    }
    public void setLelinkSetting(LelinkSetting p0){
       LelinkServiceManager.mLelinkServiceManager.setLelinkSetting(p0);
    }
    public void setOnBrowseListener(IBrowseListener p0){
       LelinkServiceManager.mLelinkServiceManager.setOnBrowseListener(p0);
    }
    public Object setOption(int p0,Object[] p1){
       return LelinkServiceManager.mLelinkServiceManager.setOption(p0, p1);
    }
    public void stopBrowse(){
       LelinkServiceManager.mLelinkServiceManager.stopBrowse();
    }
}
