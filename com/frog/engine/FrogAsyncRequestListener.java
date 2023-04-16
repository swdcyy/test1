package com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.FrogBaseRequestListener;
import java.lang.Object;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;

public abstract class FrogAsyncRequestListener implements FrogBaseRequestListener	// class@0014e9
{

    public void FrogAsyncRequestListener(){
       super();
    }
    public boolean isAsyncRequest(){
       return true;
    }
    public abstract void onResponse(FrogJSObject p0,FrogCommandResponseListener p1);
}
