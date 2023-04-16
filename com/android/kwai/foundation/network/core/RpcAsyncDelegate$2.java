package com.android.kwai.foundation.network.core.RpcAsyncDelegate$2;
import com.android.kwai.foundation.network.core.ICancelFeature;
import com.android.kwai.foundation.network.core.RpcAsyncDelegate;
import okhttp3.Call;
import java.lang.Object;

public class RpcAsyncDelegate$2 implements ICancelFeature	// class@0003dc
{
    public final RpcAsyncDelegate this$0;
    public final Call val$rawCall;

    public void RpcAsyncDelegate$2(RpcAsyncDelegate p0,Call p1){
       this.this$0 = p0;
       this.val$rawCall = p1;
       super();
    }
    public void cancel(){
       this.val$rawCall.cancel();
    }
    public boolean isCanceled(){
       return this.val$rawCall.isCanceled();
    }
    public boolean isExecuted(){
       return this.val$rawCall.isExecuted();
    }
}
