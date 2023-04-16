package com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsGetLatestImageParams;
import java.io.Serializable;
import java.lang.Object;

public class JsGetLatestImageParams implements Serializable	// class@001663
{
    public int mImageSizeLimit;
    public int mMaxHeight;
    public int mMaxWidth;
    public long mTimeDuration;
    public static final long serialVersionUID = 0x5c1c4f066c18022b;

    public void JsGetLatestImageParams(){
       super();
       this.mMaxWidth = Integer.MAX_VALUE;
       this.mMaxHeight = Integer.MAX_VALUE;
    }
}
