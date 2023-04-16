package com.coloros.ocs.base.IServiceBroker;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.coloros.ocs.base.IAuthenticationListener;

public interface abstract IServiceBroker implements IInterface	// class@000f7f
{

    IBinder getBinder(String p0,String p1);
    void handleAuthentication(String p0,String p1,IAuthenticationListener p2);
}
