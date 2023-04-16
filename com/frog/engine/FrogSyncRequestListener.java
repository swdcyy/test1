package com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.FrogBaseRequestListener;
import java.lang.Object;
import com.frog.engine.jsobject.FrogJSObject;

public abstract class FrogSyncRequestListener implements FrogBaseRequestListener	// class@0014f5
{

    public void FrogSyncRequestListener(){
       super();
    }
    public boolean isAsyncRequest(){
       return false;
    }
    public abstract FrogJSObject onResponse(FrogJSObject p0);
}
