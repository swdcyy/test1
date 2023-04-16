package com.kuaishou.live.preview.item.model.LivePreviewGeneralModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LivePreviewGeneralModel implements Serializable	// class@000df3
{
    public boolean mEnableNativeJump;
    public LivePreviewGeneralModel$ExtraParam mExtraParam;
    public String mExtraText;
    public List mIconCDNUrls;
    public String mJumpUrl;
    public String mLiveStreamId;
    public String mLogParam;
    public String mRelatedKey;
    public int mStyle;
    public int mSubBizType;
    public String mSubTitleText;
    public String mTextColor;
    public String mTitleText;
    public static final long serialVersionUID = 0x181e80c9fa1289ce;

    public void LivePreviewGeneralModel(){
       super();
       this.mLiveStreamId = "";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewGeneralModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePreViewGeneralModel{mLiveStreamId=\'"+this.mLiveStreamId+'''+", mSubBizType="+this.mSubBizType+", mStyle="+this.mStyle+", mRelatedKey=\'"+this.mRelatedKey+'''+", mIconCDNUrls="+this.mIconCDNUrls+", mTitleText=\'"+this.mTitleText+'''+", mSubTitleText=\'"+this.mSubTitleText+'''+", mExtraText="+this.mExtraText+", mTextColor=\'"+this.mTextColor+'''+", mEnableNativeJump="+this.mEnableNativeJump+", mJumpUrl=\'"+this.mJumpUrl+'''+", mExtraParam=\'"+this.mExtraParam+'''+", mLogParam=\'"+this.mLogParam+'''+'}';
    }
}
