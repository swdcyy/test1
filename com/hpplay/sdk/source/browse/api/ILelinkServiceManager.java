package com.hpplay.sdk.source.browse.api.ILelinkServiceManager;
import com.hpplay.sdk.source.browse.api.IAPI;
import java.lang.String;
import com.hpplay.sdk.source.browse.api.IParceResultListener;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;
import com.hpplay.sdk.source.browse.api.LelinkSetting;
import com.hpplay.sdk.source.browse.api.IBrowseListener;

public interface abstract ILelinkServiceManager implements IAPI	// class@000657
{

    void addPinCodeServiceInfo(String p0,IParceResultListener p1);
    void addQRServiceInfo(String p0,IParceResultListener p1);
    void browse(int p0);
    void deleteRemoteServiceInfo(LelinkServiceInfo[] p0);
    List getLelinkServiceInfos();
    void onBrowseListGone();
    void onPushButtonClick();
    void release();
    void removeLocalServiceInfo(LelinkServiceInfo p0);
    void setDebug(boolean p0);
    void setLelinkSetting(LelinkSetting p0);
    void setOnBrowseListener(IBrowseListener p0);
    void stopBrowse();
}
