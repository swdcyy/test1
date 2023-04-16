package com.kuaishou.live.core.show.sticker.model.StickerInfo;
import java.io.Serializable;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONException;
import java.lang.StringBuilder;

public class StickerInfo implements Serializable	// class@0010ba
{
    public String mApplyType;
    public double mHeight;
    public long mId;
    public List mImageUrls;
    public boolean mIsUploadEntryStyle;
    public double mLeftMarginScale;
    public LiveStickerBannedTips mLiveStickerBannedTips;
    public String mLocalPath;
    public double mLocalStickerOriginHeight;
    public double mLocalStickerOriginWidth;
    public boolean mShouldShowKeyboardDirectly;
    public int mStickerType;
    public String mTextContent;
    public String mTextFontColor;
    public int mTextFontSize;
    public int mTextMaxRow;
    public int mTextMaxTextLength;
    public double mTextViewLeftMargin;
    public double mTextViewTopMargin;
    public List mThumbnails;
    public double mTopMarginScale;
    public double mWidth;
    public static final long serialVersionUID = 0x661d11905cfb7d95;

    public void StickerInfo(){
       super();
       this.mTopMarginScale = 0;
       this.mLeftMarginScale = 0;
       this.mShouldShowKeyboardDirectly = true;
       this.mApplyType = "MANUAL_SETTING";
    }
    public JSONObject getUpdateStickInfo(){
       String str = "height";
       JSONObject obj = PatchProxy.apply(null, this, StickerInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("id", this.mId);
          obj.put("topMarginScale", this.mTopMarginScale);
          obj.put("leftMarginScale", this.mLeftMarginScale);
          obj.put("content", this.mTextContent);
          obj.put(str, this.mHeight);
          obj.put("width", this.mWidth);
          obj.put(str, this.mHeight);
          obj.put("stickerType", this.mStickerType);
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StickerInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StickerInfo{mId="+this.mId+", mImageUrls="+this.mImageUrls+", mThumbnails="+this.mThumbnails+", mTextContent=\'"+this.mTextContent+'''+", mHeight="+this.mHeight+", mWidth="+this.mWidth+", mTextViewLeftMargin="+this.mTextViewLeftMargin+", mTextViewTopMargin="+this.mTextViewTopMargin+", mTextFontSize="+this.mTextFontSize+", mTextFontColor=\'"+this.mTextFontColor+'''+", mTextMaxRow="+this.mTextMaxRow+", mTextMaxTextLength="+this.mTextMaxTextLength+", mStickerType="+this.mStickerType+", mTopMarginScale="+this.mTopMarginScale+", mLeftMarginScale="+this.mLeftMarginScale+", mLocalPath=\'"+this.mLocalPath+'''+", mShouldShowKeyboardDirectly="+this.mShouldShowKeyboardDirectly+'}';
    }
}
