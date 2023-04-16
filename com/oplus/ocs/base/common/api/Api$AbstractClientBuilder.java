package com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import com.oplus.ocs.base.common.api.Api$BaseClientBuilder;
import android.content.Context;
import android.os.Looper;
import com.oplus.ocs.base.internal.ClientSettings;
import java.lang.Object;
import com.oplus.ocs.base.common.api.Api$Client;

public abstract class Api$AbstractClientBuilder extends Api$BaseClientBuilder	// class@000abc
{

    public void Api$AbstractClientBuilder(){
       super();
    }
    public abstract Api$Client buildClient(Context p0,Looper p1,ClientSettings p2,Object p3);
}
