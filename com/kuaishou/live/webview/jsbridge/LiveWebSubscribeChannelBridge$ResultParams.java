package com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge$ResultParams;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.String;

public final class LiveWebSubscribeChannelBridge$ResultParams extends FunctionResultParams	// class@001005
{
    public Object data;
    public String subscribeId;

    public void LiveWebSubscribeChannelBridge$ResultParams(){
       super();
    }
    public final Object getData(){
       return this.data;
    }
    public final String getSubscribeId(){
       return this.subscribeId;
    }
    public final void setData(Object p0){
       this.data = p0;
    }
    public final void setSubscribeId(String p0){
       this.subscribeId = p0;
    }
}
