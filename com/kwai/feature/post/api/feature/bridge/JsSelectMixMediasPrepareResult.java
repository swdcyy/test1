package com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasPrepareResult;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public final class JsSelectMixMediasPrepareResult implements Serializable	// class@001378
{
    public final int mResult;
    public List mTasks;
    public static final long serialVersionUID = 0x2492b37cc9de8408;

    public void JsSelectMixMediasPrepareResult(){
       super();
       this.mTasks = new ArrayList();
       this.mResult = 1;
    }
}
