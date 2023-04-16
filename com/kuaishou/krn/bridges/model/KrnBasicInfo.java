package com.kuaishou.krn.bridges.model.KrnBasicInfo;
import java.io.Serializable;
import java.lang.Object;

public final class KrnBasicInfo implements Serializable	// class@00082a
{
    public Object data;
    public int mResult;

    public void KrnBasicInfo(Object p0){
       super();
       this.mResult = 1;
       this.data = p0;
    }
}
