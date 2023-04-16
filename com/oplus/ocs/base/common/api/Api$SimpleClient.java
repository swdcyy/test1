package com.oplus.ocs.base.common.api.Api$SimpleClient;
import com.oplus.ocs.base.common.api.Api$AnyClient;
import android.os.IBinder;
import android.os.IInterface;
import android.content.Context;
import java.lang.String;

public interface abstract Api$SimpleClient implements Api$AnyClient	// class@000ac7
{

    IInterface createServiceInterface(IBinder p0);
    Context getContext();
    String getServiceDescriptor();
    String getStartServiceAction();
    void setState(int p0,IInterface p1);
}
