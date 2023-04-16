package com.kuaishou.gifshow.kuaishan.model.UITemplatePreviewItem;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.model.PreviewAICutStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;

public class UITemplatePreviewItem implements Serializable	// class@001a98
{
    public KSFeedTemplateDetailInfo$TemplateAuthor mAuthor;
    public String mColor;
    public List mCoverImageUrls;
    public Object mDataSource;
    public String mDescription;
    public String mGroupId;
    public String mGroupName;
    public int mHeight;
    public int mMediaCount;
    public String mName;
    public ColorDrawable mPlaceholderDrawable;
    public KSFeedTemplateDetailInfo$TemplateTag mTag;
    public double mTemplateDuration;
    public String mTemplateId;
    public KSFeedTemplateDetailInfo$UnSupportReason mUnSupportReason;
    public long mUseCount;
    public int mVersion;
    public List mVideoUrls;
    public int mWidth;
    public List mZipUrls;
    public static final long serialVersionUID = 0xac989aa4ad068540;

    public void UITemplatePreviewItem(){
       super();
    }
    public static UITemplatePreviewItem buildFromAICutStyle(PreviewAICutStyle p0){
       UITemplatePreviewItem obj = PatchProxy.applyOneRefs(p0, null, UITemplatePreviewItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new UITemplatePreviewItem();
       obj.mDataSource = p0;
       obj.mTemplateId = p0.mStyleId;
       obj.mGroupId = p0.mGroupId;
       obj.mGroupName = p0.mGroupName;
       obj.mName = p0.mName;
       obj.mVersion = p0.mVersion;
       obj.mZipUrls = p0.mResourceUrls;
       obj.mVideoUrls = p0.mVideoUrls;
       obj.mCoverImageUrls = p0.mCoverUrls;
       obj.mColor = p0.mColor;
       obj.mWidth = p0.mWidth;
       obj.mHeight = p0.mHeight;
       obj.mUseCount = (long)p0.mUsageCount;
       obj.mUnSupportReason = p0.mUnSupportReason;
       return obj;
    }
    public static UITemplatePreviewItem buildFromKuaiShan(KSTemplateDetailInfo p0){
       UITemplatePreviewItem obj = PatchProxy.applyOneRefs(p0, null, UITemplatePreviewItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new UITemplatePreviewItem();
       obj.mDataSource = p0;
       obj.mTemplateId = p0.mTemplateId;
       obj.mGroupId = p0.mGroupId;
       obj.mGroupName = p0.mGroupName;
       obj.mName = p0.mName;
       obj.mDescription = p0.mDescription;
       obj.mVersion = p0.mVersion;
       obj.mZipUrls = p0.mResourceUrls;
       obj.mVideoUrls = p0.mDemoUrls;
       obj.mCoverImageUrls = p0.mCoverUrls;
       obj.mColor = p0.mColor;
       obj.mMediaCount = p0.mMediaCount;
       obj.mTemplateDuration = p0.mTemplateDuration;
       obj.mWidth = p0.mWidth;
       obj.mHeight = p0.mHeight;
       obj.mUseCount = p0.mUseCount;
       obj.mTag = p0.mTag;
       obj.mAuthor = p0.mAuthor;
       obj.mPlaceholderDrawable = p0.mPlaceholderDrawable;
       obj.mUnSupportReason = p0.mUnSupportReason;
       return obj;
    }
}
