package com.yxcorp.gifshow.model.SwitchItem;
import java.io.Serializable;
import java.lang.Object;

public class SwitchItem implements Serializable	// class@001e96
{
    public String mDescription;
    public List mExampleUrls;
    public int mGroupId;
    public long mId;
    public String mInnerInnerDescription;
    public String mName;
    public SelectOption mSelectedOption;
    public String mSilenceEndTime;
    public String mSilenceStartTime;
    public List mSubSwitchItems;
    public String mTitle;
    public static final long serialVersionUID = 0x82d51168279bbe81;

    public void SwitchItem(){
       super();
    }
}
