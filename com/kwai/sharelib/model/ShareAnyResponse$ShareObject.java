package com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import zk.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import ip7.d;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import ekd.k0;
import java.lang.StringBuilder;
import java.util.Arrays;

public class ShareAnyResponse$ShareObject implements Serializable	// class@0016ee
{
    public String mAppId;
    public int mAppIdKeyIndex;
    public String[] mBigPicBytes;
    public String[] mBigPicUrls;
    public String mBottomText;
    public String mCopylinkSuccessTips;
    public String[] mCoverBytes;
    public String[] mCoverUrls;
    public String mErrImageUrl;
    public JsonElement mExtParamsObject;
    public PainterModel mPainterModel;
    public String mPicSubTitle;
    public String mPicTitle;
    public String[] mQrBytes;
    public String[] mQrShareUrls;
    public String[] mQrTypes;
    public String[] mQrUrls;
    public String mShareId;
    public String mShareMessage;
    public String mShareObjectId;
    public String mSharePath;
    public String mShareResourceType;
    public String mShareUrl;
    public String mSubTitle;
    public String mTitle;
    public ArrayList mTkConfigList;
    public int mType;
    public String mWxAppId;
    public static final long serialVersionUID = 0xbbba623b9eeb8466;

    public void ShareAnyResponse$ShareObject(){
       super();
    }
    public g getExtParam(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareAnyResponse$ShareObject.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(this.mExtParamsObject, p0);
    }
    public boolean isCoverProcessed(){
       ShareAnyResponse$ShareObject obj = PatchProxy.apply(null, this, ShareAnyResponse$ShareObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mExtParamsObject;
       boolean b = false;
       if (obj instanceof JsonObject && k0.c(obj, "isCoverProcessed", b)) {
          b = true;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareAnyResponse$ShareObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareObject{mShareObjectId=\'"+this.mShareObjectId+'''+", mShareResourceType=\'"+this.mShareResourceType+'''+", mBigPicUrls="+Arrays.toString(this.mBigPicUrls)+", mBigPicBytes="+Arrays.toString(this.mBigPicBytes)+", mShareId=\'"+this.mShareId+'''+", mShareMessage=\'"+this.mShareMessage+'''+", mCopylinkSuccessTips=\'"+this.mCopylinkSuccessTips+'''+", mCoverUrls="+Arrays.toString(this.mCoverUrls)+", mCoverBytes="+Arrays.toString(this.mCoverBytes)+", mTitle=\'"+this.mTitle+'''+", mSubTitle=\'"+this.mSubTitle+'''+", mShareUrl=\'"+this.mShareUrl+'''+", mWxAppId=\'"+this.mWxAppId+'''+", mSharePath=\'"+this.mSharePath+'''+", mAppId=\'"+this.mAppId+'''+", mType="+this.mType+", mBottomText=\'"+this.mBottomText+'''+", mQrBytes="+Arrays.toString(this.mQrBytes)+", mQrUrls="+Arrays.toString(this.mQrUrls)+", mQrTypes="+Arrays.toString(this.mQrTypes)+", mQrShareUrls="+Arrays.toString(this.mQrShareUrls)+", mPicTitle=\'"+this.mPicTitle+'''+", mPicSubTitle=\'"+this.mPicSubTitle+'''+", mAppIdKeyIndex="+this.mAppIdKeyIndex+", mPainterModel="+this.mPainterModel+", mTkConfigList="+this.mTkConfigList+", mErrImageUrl=\'"+this.mErrImageUrl+'''+", mExtParamsObject="+this.mExtParamsObject+'}';
    }
}
