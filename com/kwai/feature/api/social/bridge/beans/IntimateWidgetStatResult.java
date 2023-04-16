package com.kwai.feature.api.social.bridge.beans.IntimateWidgetStatResult;
import java.io.Serializable;
import java.lang.Object;

public class IntimateWidgetStatResult implements Serializable	// class@001089
{
    public final int mResult;
    public final int mWidgetStatus;
    public static final long serialVersionUID = 0x9d1e09624cf7bb93;

    public void IntimateWidgetStatResult(int p0,int p1){
       super();
       this.mResult = p0;
       this.mWidgetStatus = p1;
    }
}
