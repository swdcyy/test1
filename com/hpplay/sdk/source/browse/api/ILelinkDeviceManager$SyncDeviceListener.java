package com.hpplay.sdk.source.browse.api.ILelinkDeviceManager$SyncDeviceListener;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;

public interface abstract ILelinkDeviceManager$SyncDeviceListener	// class@000655
{

    void onAddDevice(LelinkServiceInfo[] p0);
    void onSync(int p0,List p1);
}
