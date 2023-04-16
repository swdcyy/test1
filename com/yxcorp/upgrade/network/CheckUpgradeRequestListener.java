package com.yxcorp.upgrade.network.CheckUpgradeRequestListener;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener$UpgradeResponse;
import java.lang.Throwable;

public interface abstract CheckUpgradeRequestListener	// class@00099b
{

    void a(CheckUpgradeRequestListener$UpgradeResponse p0);
    void onError(Throwable p0);
}
