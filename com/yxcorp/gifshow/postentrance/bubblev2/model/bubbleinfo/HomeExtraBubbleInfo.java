package com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeExtraBubbleInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;

public class HomeExtraBubbleInfo implements Serializable	// class@00100d
{
    public List mAllowedNasaTab;
    public String mCameraPageDialogIconUrl;
    public String mCameraPageDialogSubTitle;
    public String mCameraPageDialogTitle;
    public Map mCoinInfo;
    public Integer mMagicVersion;
    public int mMinDisplayInterval;
    public String mRelativeActivityId;
    public static final long serialVersionUID = 0x35a01a745fe61ce5;

    public void HomeExtraBubbleInfo(){
       super();
       this.mMinDisplayInterval = 1;
       Integer[] integerArray = new Integer[]{Integer.valueOf(1),Integer.valueOf(5),Integer.valueOf(4),Integer.valueOf(3),Integer.valueOf(2),Integer.valueOf(9)};
       this.mAllowedNasaTab = Arrays.asList(integerArray);
       this.mMagicVersion = Integer.valueOf(0);
       this.mRelativeActivityId = "unset";
       this.mCameraPageDialogTitle = "";
       this.mCameraPageDialogSubTitle = "";
    }
}
