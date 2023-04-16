package com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import com.frog.engine.jsobject.FrogJSObject;

public abstract class FrogCommandResponseListener	// class@0014f1
{
    public int mSeq;

    public void FrogCommandResponseListener(int p0){
       super();
       this.mSeq = p0;
    }
    public abstract void onResponse(FrogJSObject p0);
}
