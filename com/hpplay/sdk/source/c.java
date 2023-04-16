package com.hpplay.sdk.source.c;
import android.os.IInterface;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;

public interface abstract c implements IInterface	// class@000666
{

    void onConnect(LelinkServiceInfo p0,int p1);
    void onDisconnect(LelinkServiceInfo p0,int p1,int p2);
}
