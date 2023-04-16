package com.oplus.ocs.base.common.api.OplusApi$1;
import java.lang.Runnable;
import com.oplus.ocs.base.common.api.OplusApi;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import java.lang.Object;

public class OplusApi$1 implements Runnable	// class@000ad0
{
    public final OplusApi this$0;
    public final OnConnectionSucceedListener val$listener;

    public void OplusApi$1(OplusApi p0,OnConnectionSucceedListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void run(){
       this.val$listener.onConnectionSucceed();
    }
}
