package com.hpplay.sdk.source.browse.api.ILelinkDeviceManager;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import com.hpplay.sdk.source.browse.api.ILelinkDeviceManager$SyncDeviceListener;

public interface abstract ILelinkDeviceManager	// class@000656
{

    void addDevice(LelinkServiceInfo[] p0);
    void clear();
    void deleteDevices(LelinkServiceInfo[] p0);
    void setListener(ILelinkDeviceManager$SyncDeviceListener p0);
    void syncDevices();
}
