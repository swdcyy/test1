package com.android.kwai.foundation.network.core.wrapper.CallbackWrapper;
import java.lang.Object;
import com.android.kwai.foundation.network.ThreadType;

public class CallbackWrapper	// class@0003fc
{
    public Object mCallback;
    public ThreadType mThreadType;

    public void CallbackWrapper(Object p0,ThreadType p1){
       super();
       this.mCallback = p0;
       this.mThreadType = p1;
    }
    public Object getCallback(){
       return this.mCallback;
    }
    public ThreadType getThreadType(){
       return this.mThreadType;
    }
}
