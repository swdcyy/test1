package com.coloros.gamespace.gamesdk.IHyperBoostService;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;

public interface abstract IHyperBoostService implements IInterface	// class@000f77
{

    void generalSignal(String p0);
    String getVersion();
    boolean initHyperBoost();
    boolean registerClient(IBinder p0);
    void registerNotifier();
    void vibrate(int p0);
}
