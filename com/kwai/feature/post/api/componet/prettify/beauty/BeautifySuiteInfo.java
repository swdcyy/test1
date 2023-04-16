package com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo;
import java.lang.Object;
import java.util.ArrayList;

public class BeautifySuiteInfo	// class@0012d1
{
    public boolean isDefault;
    public ArrayList mBeautifyItems;
    public BeautifyTagInfo mBeautifyTagInfo;
    public ArrayList mIconCdnUrls;
    public String mIconResKey;
    public String mIconUrl;
    public int mId;
    public float mIntensity;
    public ItemNameStyle mItemNameStyle;
    public String mLogName;
    public String mName;
    public String mNameResKey;
    public String mPassThroughParams;
    public String mResourcePathKey;
    public ArrayList mUnSupportBeautifyList;

    public void BeautifySuiteInfo(){
       super();
       this.mBeautifyItems = new ArrayList();
       this.mUnSupportBeautifyList = new ArrayList();
       this.mPassThroughParams = "";
    }
}
