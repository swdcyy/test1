package com.kwai.feature.api.platform.bridge.beans.GetKSwitchResult;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class GetKSwitchResult implements Serializable	// class@00104e
{
    public int mResult;
    public List resultData;

    public void GetKSwitchResult(){
       super();
       this.resultData = new ArrayList();
    }
}
