package com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;

public interface abstract IOplusHyperBoostService implements IInterface	// class@000aa8
{

    void generalSignal(String p0);
    String getVersion();
    boolean initHyperBoost();
    boolean registerClient(IBinder p0);
    void registerNotifier();
    void vibrate(int p0);
}
