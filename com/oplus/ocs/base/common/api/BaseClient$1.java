package com.oplus.ocs.base.common.api.BaseClient$1;
import java.lang.Runnable;
import com.oplus.ocs.base.common.api.BaseClient;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import java.lang.Object;

public final class BaseClient$1 implements Runnable	// class@000ac9
{
    public final OnConnectionSucceedListener a;
    public final BaseClient b;

    public void BaseClient$1(BaseClient p0,OnConnectionSucceedListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       this.a.onConnectionSucceed();
    }
}
