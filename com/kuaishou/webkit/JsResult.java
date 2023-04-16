package com.kuaishou.webkit.JsResult;
import com.kuaishou.webkit.JsResult$ResultReceiver;
import java.lang.Object;

public class JsResult	// class@001250
{
    public final JsResult$ResultReceiver mReceiver;
    public boolean mResult;

    public void JsResult(JsResult$ResultReceiver p0){
       super();
       this.mReceiver = p0;
    }
    public final void cancel(){
       this.mResult = false;
       this.wakeUp();
    }
    public final void confirm(){
       this.mResult = true;
       this.wakeUp();
    }
    public final boolean getResult(){
       return this.mResult;
    }
    public final void wakeUp(){
       this.mReceiver.onJsResultComplete(this);
    }
}
