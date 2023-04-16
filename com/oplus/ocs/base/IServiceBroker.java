package com.oplus.ocs.base.IServiceBroker;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.oplus.ocs.base.IAuthenticationListener;

public interface abstract IServiceBroker implements IInterface	// class@000ab0
{

    IBinder getBinder(String p0,String p1);
    void handleAuthentication(String p0,String p1,IAuthenticationListener p2);
}
