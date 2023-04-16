package com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem;
import java.io.Serializable;
import java.lang.Object;

public class BeautifySuiteInfo$BeautifyItem implements Serializable	// class@0012cf
{
    public float mBeautifyIntensity;
    public int mBeautifyItemId;
    public List mIntensityList;
    public float mMaxValue;
    public float mMinValue;

    public void BeautifySuiteInfo$BeautifyItem(){
       super();
       this.mMaxValue = Float.MAX_VALUE;
       this.mMinValue = Float.MIN_VALUE;
    }
}
