package com.kwai.feature.api.social.message.bridge.model.JsSuccessResult;
import java.io.Serializable;
import java.lang.Object;

public final class JsSuccessResult implements Serializable	// class@00113a
{
    public final Object data;
    public final int result;

    public void JsSuccessResult(Object p0){
       super();
       this.data = p0;
       this.result = 1;
    }
    public final Object getData(){
       return this.data;
    }
    public final int getResult(){
       return this.result;
    }
}
