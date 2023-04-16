package com.kuaishou.tuna_js_bridge.js.bridge.TunaCallbackResult;
import java.io.Serializable;
import java.lang.Object;

public class TunaCallbackResult implements Serializable	// class@001144
{
    public int mCode;
    public Object mResult;
    public static final long serialVersionUID = 0x8ede56010b1b3914;

    public void TunaCallbackResult(int p0){
       super();
       this.mCode = p0;
    }
    public int getCode(){
       return this.mCode;
    }
    public Object getResult(){
       return this.mResult;
    }
    public void setCode(int p0){
       this.mCode = p0;
    }
    public void setResult(Object p0){
       this.mResult = p0;
    }
}
