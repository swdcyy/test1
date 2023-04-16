package com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;

public interface abstract IConnectListener	// class@000636
{

    void onConnect(LelinkServiceInfo p0,int p1);
    void onDisconnect(LelinkServiceInfo p0,int p1,int p2);
}
