package com.oplus.ocs.base.common.api.g$1;
import java.lang.Runnable;
import com.oplus.ocs.base.common.api.g;
import java.lang.Object;
import com.oplus.ocs.base.common.api.InternalClient;
import java.lang.String;
import android.content.Context;
import android.os.Process;
import com.oplus.ocs.base.common.api.g$2;
import com.oplus.ocs.base.IAuthenticationListener;

public final class g$1 implements Runnable	// class@000ae4
{
    public final g a;

    public void g$1(g p0){
       this.a = p0;
       super();
    }
    public final void run(){
       g$1 ta = this.a;
       g d = ta.d;
       InternalClient internalClie = new InternalClient(d, d.getPackageName(), ta.e, Process.myPid(), true, true, new g$2(ta));
       v9.connect();
    }
}
