package com.yxcorp.gifshow.kuaishan.model.KSBaseInfo;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;

public abstract class KSBaseInfo extends PostBaseResourceDownloadHelper$InfoWithResource	// class@0019f7
{
    public int mEndingClipCount;
    public List mFrameExtraRequirementList;
    public List mFrameVisibleTimeList;
    public boolean mIsMustShow;
    public int mOpeningClipCount;
    public List mTemplateMusic;
    public static final long serialVersionUID = 0x193c97706929a5b1;

    public void KSBaseInfo(){
       super();
       this.mIsMustShow = true;
    }
}
