package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import java.io.Serializable;
import java.lang.Object;

public class PlcEntryStyleInfo$StrongStyleInfo implements Serializable	// class@000d93
{
    public PlcEntryStyleInfo$ActionInfo mActionInfo;
    public List mAtmosphereBar;
    public List mCDNUrls;
    public int mCategoryMaxLength;
    public String mCategoryText;
    public boolean mEnableForceClose;
    public boolean mHideAdTag;
    public String mHighlightIcon;
    public String mHighlightLabel;
    public String mHighlightLabelColor;
    public String mIconLeftLabel;
    public String mIconUrl;
    public boolean mIsRoundCornerIcon;
    public List mLabels;
    public List mMultiHighlightLabels;
    public List mStrongStyleItems;
    public int mStrongStyleSubType;
    public int mStyleType;
    public PlcEntryStyleInfo$TKBundleInfo mTKBundleInfo;
    public String mTagInfoText;
    public PlcEntryStyleInfo$TagPackage mTagPackage;
    public String mTitle;
    public static final long serialVersionUID = 0xe8b47d5db68dff63;

    public void PlcEntryStyleInfo$StrongStyleInfo(){
       super();
       this.mHideAdTag = true;
    }
    public boolean isSecondaryStrongStyle(){
       PlcEntryStyleInfo$StrongStyleInfo tmStyleType = this.mStyleType;
       boolean b = (tmStyleType != 9 && (tmStyleType != 10 && (tmStyleType != 14 && (tmStyleType != 16 && (tmStyleType != 17 && (tmStyleType == 18 || tmStyleType == 22))))))? true: false;
       return b;
    }
}
