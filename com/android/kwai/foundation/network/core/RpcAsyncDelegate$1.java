package com.android.kwai.foundation.network.core.RpcAsyncDelegate$1;
import okhttp3.Callback;
import com.android.kwai.foundation.network.core.RpcAsyncDelegate;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.android.kwai.foundation.network.ThreadType;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import com.android.kwai.foundation.network.core.logicrecognize.ILogicRecognize;
import java.lang.reflect.Method;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Exception;
import com.android.kwai.foundation.network.core.AbsRpcDelegate;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.String;
import android.net.Uri;

public class RpcAsyncDelegate$1 implements Callback	// class@0003db
{
    public final RpcAsyncDelegate this$0;
    public final IDeserializer val$deserializer;
    public final IRpcService$Callback val$finalCallback;
    public final ThreadType val$finalThreadType;
    public final ILogicRecognize val$logicRecognize;
    public final Method val$method;

    public void RpcAsyncDelegate$1(RpcAsyncDelegate p0,IRpcService$Callback p1,ThreadType p2,IDeserializer p3,ILogicRecognize p4,Method p5){
       this.this$0 = p0;
       this.val$finalCallback = p1;
       this.val$finalThreadType = p2;
       this.val$deserializer = p3;
       this.val$logicRecognize = p4;
       this.val$method = p5;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       this.this$0.callFailure(p1, null, this.val$finalCallback, this.val$finalThreadType);
    }
    public void onResponse(Call p0,Response p1){
       this.this$0.callResponse(Uri.parse(p0.request().url().toString()), p1, this.val$finalCallback, this.val$finalThreadType, this.val$deserializer, this.val$logicRecognize, this.val$method);
    }
}
